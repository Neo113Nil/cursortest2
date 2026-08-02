package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.room.Room;
import com.bugsnag.android.TraceParser;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.crypto.tink.KeysetHandle;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.SequentialExecutor;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.remote.AutoValue_InstallationResponse;
import com.google.firebase.installations.remote.AutoValue_TokenResult;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.RequestLimiter;
import com.google.mlkit.common.internal.zzb;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;

/* loaded from: classes.dex */
public final class FirebaseInstallations implements FirebaseInstallationsApi {
    public static final Object lockGenerateFid = new Object();
    public final ExecutorService backgroundExecutor;
    public String cachedFid;
    public final RandomFidGenerator fidGenerator;
    public final HashSet fidListeners;
    public final FirebaseApp firebaseApp;
    public final Lazy iidStore;
    public final ArrayList listeners;
    public final Object lock;
    public final SequentialExecutor networkExecutor;
    public final KeysetHandle persistedInstallation;
    public final FirebaseInstallationServiceClient serviceClient;

    /* renamed from: utils, reason: collision with root package name */
    public final Utils f1007utils;

    static {
        new AtomicInteger(1);
    }

    public FirebaseInstallations(FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, SequentialExecutor sequentialExecutor) {
        firebaseApp.checkNotDeleted();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp.applicationContext, provider);
        KeysetHandle keysetHandle = new KeysetHandle(firebaseApp);
        if (zzb.singleton == null) {
            zzb.singleton = new zzb(10);
        }
        zzb zzbVar = zzb.singleton;
        if (Utils.singleton == null) {
            Utils.singleton = new Utils(zzbVar);
        }
        Utils utils2 = Utils.singleton;
        Lazy lazy = new Lazy(new ComponentDiscovery$$ExternalSyntheticLambda0(firebaseApp, 2));
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        this.lock = new Object();
        this.fidListeners = new HashSet();
        this.listeners = new ArrayList();
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = keysetHandle;
        this.f1007utils = utils2;
        this.iidStore = lazy;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = sequentialExecutor;
    }

    public static FirebaseInstallations getInstance(FirebaseApp firebaseApp) {
        firebaseApp.checkNotDeleted();
        return (FirebaseInstallations) firebaseApp.componentRuntime.get(FirebaseInstallationsApi.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if ("[DEFAULT]".equals(r6.name) != false) goto L16;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:6:0x000e, B:12:0x0022, B:14:0x0033, B:16:0x005e, B:17:0x0065, B:19:0x0040, B:21:0x0044, B:23:0x0056), top: B:5:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0003, B:25:0x007c, B:26:0x0082, B:33:0x0093, B:34:0x0096, B:6:0x000e, B:12:0x0022, B:14:0x0033, B:16:0x005e, B:17:0x0065, B:19:0x0040, B:21:0x0044, B:23:0x0056), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doRegistrationOrRefresh() {
        AutoValue_PersistedInstallationEntry readPersistedInstallationEntryValue;
        boolean z;
        String readIid;
        synchronized (lockGenerateFid) {
            try {
                FirebaseApp firebaseApp = this.firebaseApp;
                firebaseApp.checkNotDeleted();
                KeysetHandle acquire = KeysetHandle.acquire(firebaseApp.applicationContext);
                try {
                    readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
                    int i = readPersistedInstallationEntryValue.registrationStatus;
                    if (i != 2 && i != 1) {
                        z = false;
                        if (z) {
                            RandomFidGenerator randomFidGenerator = this.fidGenerator;
                            FirebaseApp firebaseApp2 = this.firebaseApp;
                            firebaseApp2.checkNotDeleted();
                            if (!firebaseApp2.name.equals("CHIME_ANDROID_SDK")) {
                                firebaseApp2.checkNotDeleted();
                            }
                            if (readPersistedInstallationEntryValue.registrationStatus == 1) {
                                readIid = ((IidStore) this.iidStore.get()).readIid();
                                if (TextUtils.isEmpty(readIid)) {
                                    randomFidGenerator.getClass();
                                    readIid = RandomFidGenerator.createRandomFid();
                                }
                                KeysetHandle keysetHandle = this.persistedInstallation;
                                AutoValue_PersistedInstallationEntry.Builder builder = readPersistedInstallationEntryValue.toBuilder();
                                builder.firebaseInstallationId = readIid;
                                builder.registrationStatus = 3;
                                readPersistedInstallationEntryValue = builder.build();
                                keysetHandle.insertOrUpdatePersistedInstallationEntry(readPersistedInstallationEntryValue);
                            }
                            randomFidGenerator.getClass();
                            readIid = RandomFidGenerator.createRandomFid();
                            KeysetHandle keysetHandle2 = this.persistedInstallation;
                            AutoValue_PersistedInstallationEntry.Builder builder2 = readPersistedInstallationEntryValue.toBuilder();
                            builder2.firebaseInstallationId = readIid;
                            builder2.registrationStatus = 3;
                            readPersistedInstallationEntryValue = builder2.build();
                            keysetHandle2.insertOrUpdatePersistedInstallationEntry(readPersistedInstallationEntryValue);
                        }
                        if (acquire != null) {
                            acquire.releaseAndClose();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    if (acquire != null) {
                    }
                } catch (Throwable th) {
                    if (acquire != null) {
                        acquire.releaseAndClose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        triggerOnStateReached(readPersistedInstallationEntryValue);
        this.networkExecutor.execute(new FirebaseInstallations$$ExternalSyntheticLambda1(this, 2));
    }

    public final AutoValue_PersistedInstallationEntry fetchAuthTokenFromServer(AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry) {
        int responseCode;
        AutoValue_TokenResult readGenerateAuthTokenResponse;
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.serviceClient;
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.checkNotDeleted();
        String str = firebaseApp.options.apiKey;
        String str2 = autoValue_PersistedInstallationEntry.firebaseInstallationId;
        FirebaseApp firebaseApp2 = this.firebaseApp;
        firebaseApp2.checkNotDeleted();
        String str3 = firebaseApp2.options.projectId;
        String str4 = autoValue_PersistedInstallationEntry.refreshToken;
        RequestLimiter requestLimiter = firebaseInstallationServiceClient.requestLimiter;
        if (!requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL fullyQualifiedRequestUri = FirebaseInstallationServiceClient.getFullyQualifiedRequestUri("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection openHttpURLConnection = firebaseInstallationServiceClient.openHttpURLConnection(str, fullyQualifiedRequestUri);
            try {
                try {
                    openHttpURLConnection.setRequestMethod("POST");
                    openHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    openHttpURLConnection.setDoOutput(true);
                    FirebaseInstallationServiceClient.writeGenerateAuthTokenRequestBodyToOutputStream(openHttpURLConnection);
                    responseCode = openHttpURLConnection.getResponseCode();
                    requestLimiter.setNextRequestTime(responseCode);
                } finally {
                    openHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                readGenerateAuthTokenResponse = FirebaseInstallationServiceClient.readGenerateAuthTokenResponse(openHttpURLConnection);
            } else {
                FirebaseInstallationServiceClient.logFisCommunicationError(openHttpURLConnection, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    AutoValue_TokenResult.Builder builder = AutoValue_TokenResult.builder();
                    builder.setResponseCode(3);
                    readGenerateAuthTokenResponse = builder.build();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        AutoValue_TokenResult.Builder builder2 = AutoValue_TokenResult.builder();
                        builder2.setResponseCode(2);
                        readGenerateAuthTokenResponse = builder2.build();
                    }
                }
            }
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(readGenerateAuthTokenResponse.getResponseCode());
            if (ordinal == 0) {
                String token = readGenerateAuthTokenResponse.getToken();
                long tokenExpirationTimestamp = readGenerateAuthTokenResponse.getTokenExpirationTimestamp();
                this.f1007utils.clock.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                AutoValue_PersistedInstallationEntry.Builder builder3 = autoValue_PersistedInstallationEntry.toBuilder();
                builder3.authToken = token;
                builder3.expiresInSecs = tokenExpirationTimestamp;
                byte b = (byte) (builder3.set$0 | 1);
                builder3.tokenCreationEpochInSecs = currentTimeMillis;
                builder3.set$0 = (byte) (b | 2);
                return builder3.build();
            }
            if (ordinal == 1) {
                AutoValue_PersistedInstallationEntry.Builder builder4 = autoValue_PersistedInstallationEntry.toBuilder();
                builder4.fisError = "BAD CONFIG";
                builder4.registrationStatus = 5;
                return builder4.build();
            }
            if (ordinal != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.cachedFid = null;
            }
            AutoValue_PersistedInstallationEntry.Builder builder5 = autoValue_PersistedInstallationEntry.toBuilder();
            builder5.registrationStatus = 2;
            return builder5.build();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final zzw getId() {
        String str;
        preConditionChecks();
        synchronized (this) {
            str = this.cachedFid;
        }
        if (str != null) {
            return Room.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetIdListener getIdListener = new GetIdListener(taskCompletionSource);
        synchronized (this.lock) {
            this.listeners.add(getIdListener);
        }
        zzw zzwVar = taskCompletionSource.zza;
        this.backgroundExecutor.execute(new FirebaseInstallations$$ExternalSyntheticLambda1(this, 0));
        return zzwVar;
    }

    /* JADX WARN: Finally extract failed */
    public final AutoValue_PersistedInstallationEntry getMultiProcessSafePrefs() {
        AutoValue_PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            try {
                FirebaseApp firebaseApp = this.firebaseApp;
                firebaseApp.checkNotDeleted();
                KeysetHandle acquire = KeysetHandle.acquire(firebaseApp.applicationContext);
                try {
                    readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
                    if (acquire != null) {
                        acquire.releaseAndClose();
                    }
                } catch (Throwable th) {
                    if (acquire != null) {
                        acquire.releaseAndClose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readPersistedInstallationEntryValue;
    }

    public final zzw getToken() {
        preConditionChecks();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetAuthTokenListener getAuthTokenListener = new GetAuthTokenListener(this.f1007utils, taskCompletionSource);
        synchronized (this.lock) {
            this.listeners.add(getAuthTokenListener);
        }
        zzw zzwVar = taskCompletionSource.zza;
        this.backgroundExecutor.execute(new FirebaseInstallations$$ExternalSyntheticLambda1(this, 1));
        return zzwVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void insertOrUpdatePrefs(AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry) {
        synchronized (lockGenerateFid) {
            try {
                FirebaseApp firebaseApp = this.firebaseApp;
                firebaseApp.checkNotDeleted();
                KeysetHandle acquire = KeysetHandle.acquire(firebaseApp.applicationContext);
                try {
                    this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(autoValue_PersistedInstallationEntry);
                    if (acquire != null) {
                        acquire.releaseAndClose();
                    }
                } catch (Throwable th) {
                    if (acquire != null) {
                        acquire.releaseAndClose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void preConditionChecks() {
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.checkNotDeleted();
        zzae.checkNotEmpty(firebaseApp.options.applicationId, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.checkNotDeleted();
        zzae.checkNotEmpty(firebaseApp.options.projectId, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.checkNotDeleted();
        zzae.checkNotEmpty(firebaseApp.options.apiKey, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.checkNotDeleted();
        String str = firebaseApp.options.applicationId;
        Pattern pattern = Utils.API_KEY_FORMAT;
        zzae.checkArgument("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        firebaseApp.checkNotDeleted();
        zzae.checkArgument("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", Utils.API_KEY_FORMAT.matcher(firebaseApp.options.apiKey).matches());
    }

    public final AutoValue_PersistedInstallationEntry registerFidWithServer(AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry) {
        int responseCode;
        AutoValue_InstallationResponse readCreateResponse;
        String str = autoValue_PersistedInstallationEntry.firebaseInstallationId;
        String readToken = (str == null || str.length() != 11) ? null : ((IidStore) this.iidStore.get()).readToken();
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.checkNotDeleted();
        String str2 = firebaseApp.options.apiKey;
        firebaseApp.checkNotDeleted();
        String str3 = firebaseApp.options.projectId;
        firebaseApp.checkNotDeleted();
        String str4 = firebaseApp.options.applicationId;
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.serviceClient;
        RequestLimiter requestLimiter = firebaseInstallationServiceClient.requestLimiter;
        if (!requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL fullyQualifiedRequestUri = FirebaseInstallationServiceClient.getFullyQualifiedRequestUri("projects/" + str3 + "/installations");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(TiffTagConstants.COMPRESSION_VALUE_EPSON_ERF_COMPRESSED);
            HttpURLConnection openHttpURLConnection = firebaseInstallationServiceClient.openHttpURLConnection(str2, fullyQualifiedRequestUri);
            try {
                try {
                    openHttpURLConnection.setRequestMethod("POST");
                    openHttpURLConnection.setDoOutput(true);
                    if (readToken != null) {
                        openHttpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", readToken);
                    }
                    FirebaseInstallationServiceClient.writeFIDCreateRequestBodyToOutputStream(openHttpURLConnection, str, str4);
                    responseCode = openHttpURLConnection.getResponseCode();
                    requestLimiter.setNextRequestTime(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    readCreateResponse = FirebaseInstallationServiceClient.readCreateResponse(openHttpURLConnection);
                } else {
                    FirebaseInstallationServiceClient.logFisCommunicationError(openHttpURLConnection, str4, str2, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        TraceParser builder = AutoValue_InstallationResponse.builder();
                        builder.setResponseCode(2);
                        readCreateResponse = builder.m1907build();
                    }
                    openHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                openHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(readCreateResponse.getResponseCode());
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    AutoValue_PersistedInstallationEntry.Builder builder2 = autoValue_PersistedInstallationEntry.toBuilder();
                    builder2.fisError = "BAD CONFIG";
                    builder2.registrationStatus = 5;
                    return builder2.build();
                }
                String fid = readCreateResponse.getFid();
                String refreshToken = readCreateResponse.getRefreshToken();
                this.f1007utils.clock.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                String token = readCreateResponse.getAuthToken().getToken();
                long tokenExpirationTimestamp = readCreateResponse.getAuthToken().getTokenExpirationTimestamp();
                AutoValue_PersistedInstallationEntry.Builder builder3 = autoValue_PersistedInstallationEntry.toBuilder();
                builder3.firebaseInstallationId = fid;
                builder3.registrationStatus = 4;
                builder3.authToken = token;
                builder3.refreshToken = refreshToken;
                builder3.expiresInSecs = tokenExpirationTimestamp;
                byte b = (byte) (builder3.set$0 | 1);
                builder3.tokenCreationEpochInSecs = currentTimeMillis;
                builder3.set$0 = (byte) (b | 2);
                return builder3.build();
            } catch (Throwable th) {
                openHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void triggerOnException(Exception exc) {
        synchronized (this.lock) {
            try {
                Iterator it = this.listeners.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).onException(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void triggerOnStateReached(AutoValue_PersistedInstallationEntry autoValue_PersistedInstallationEntry) {
        synchronized (this.lock) {
            try {
                Iterator it = this.listeners.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).onStateReached(autoValue_PersistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
