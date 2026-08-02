package com.squareup.cash.mri.android;

import android.net.TrafficStats;
import android.util.Log;
import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda0;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.squareup.cash.db2.Instrument$Adapter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class SafeSignalCollector$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SafeSignalCollector$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int responseCode;
        int i = this.$r8$classId;
        boolean z = false;
        int i2 = 0;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Instrument$Adapter instrument$Adapter = (Instrument$Adapter) obj;
                AtomicBoolean atomicBoolean = (AtomicBoolean) instrument$Adapter.balance_currencyAdapter;
                try {
                    return ((Function0) instrument$Adapter.card_brandAdapter).invoke();
                } finally {
                    atomicBoolean.set(false);
                }
            case 1:
                DefaultHeartBeatController defaultHeartBeatController = (DefaultHeartBeatController) obj;
                synchronized (defaultHeartBeatController) {
                    HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) defaultHeartBeatController.storageProvider.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String userAgent = ((DefaultUserAgentPublisher) defaultHeartBeatController.userAgentProvider.get()).getUserAgent();
                    synchronized (heartBeatInfoStorage) {
                        String formattedDate = heartBeatInfoStorage.getFormattedDate(currentTimeMillis);
                        userAgent.getClass();
                        heartBeatInfoStorage.firebaseDataStore.editSync(new HeartBeatInfoStorage$$ExternalSyntheticLambda0(heartBeatInfoStorage, formattedDate, userAgent, new Preferences.Key(userAgent), 0));
                    }
                }
                return null;
            default:
                FirebaseInstallations firebaseInstallations = (FirebaseInstallations) obj;
                synchronized (firebaseInstallations) {
                    firebaseInstallations.cachedFid = null;
                }
                AutoValue_PersistedInstallationEntry multiProcessSafePrefs = firebaseInstallations.getMultiProcessSafePrefs();
                if (multiProcessSafePrefs.registrationStatus == 4) {
                    FirebaseInstallationServiceClient firebaseInstallationServiceClient = firebaseInstallations.serviceClient;
                    FirebaseApp firebaseApp = firebaseInstallations.firebaseApp;
                    firebaseApp.checkNotDeleted();
                    String str = firebaseApp.options.apiKey;
                    String str2 = multiProcessSafePrefs.firebaseInstallationId;
                    FirebaseApp firebaseApp2 = firebaseInstallations.firebaseApp;
                    firebaseApp2.checkNotDeleted();
                    String str3 = firebaseApp2.options.projectId;
                    String str4 = multiProcessSafePrefs.refreshToken;
                    firebaseInstallationServiceClient.getClass();
                    URL fullyQualifiedRequestUri = FirebaseInstallationServiceClient.getFullyQualifiedRequestUri("projects/" + str3 + "/installations/" + str2);
                    while (i2 <= 1) {
                        TrafficStats.setThreadStatsTag(32770);
                        HttpURLConnection openHttpURLConnection = firebaseInstallationServiceClient.openHttpURLConnection(str, fullyQualifiedRequestUri);
                        try {
                            openHttpURLConnection.setRequestMethod("DELETE");
                            openHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
                            responseCode = openHttpURLConnection.getResponseCode();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            openHttpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                        if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                            FirebaseInstallationServiceClient.logFisCommunicationError(openHttpURLConnection, null, str, str3);
                            if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                throw new FirebaseInstallationsException("Bad config while trying to delete FID");
                                break;
                            }
                            i2++;
                            openHttpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        openHttpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                AutoValue_PersistedInstallationEntry.Builder builder = multiProcessSafePrefs.toBuilder();
                builder.registrationStatus = 2;
                firebaseInstallations.insertOrUpdatePrefs(builder.build());
                return null;
        }
    }
}
