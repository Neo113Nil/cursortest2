package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.room.Room;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.cloudmessaging.zzx;
import com.google.android.gms.cloudmessaging.zzy;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import okhttp3.internal.http2.Huffman;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public final class GmsRpc {

    /* renamed from: app, reason: collision with root package name */
    public final FirebaseApp f1010app;
    public final FirebaseInstallationsApi firebaseInstallations;
    public final Provider heartbeatInfo;
    public final Metadata metadata;
    public final Rpc rpc;
    public final Provider userAgentPublisher;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp.checkNotDeleted();
        Rpc rpc = new Rpc(firebaseApp.applicationContext);
        this.f1010app = firebaseApp;
        this.metadata = metadata;
        this.rpc = rpc;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }

    public final Task extractResponseWhenComplete(Task task) {
        return task.continueWith(new CredentialManager$$ExternalSyntheticLambda0(0), new AesGcmSiv$$ExternalSyntheticLambda0(this, 11));
    }

    public final void setDefaultAttributesToBundle(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String str4;
        boolean shouldSendSdkHeartBeat;
        int i2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        FirebaseApp firebaseApp = this.f1010app;
        firebaseApp.checkNotDeleted();
        bundle.putString("gmp_app_id", firebaseApp.options.applicationId);
        Metadata metadata = this.metadata;
        synchronized (metadata) {
            try {
                if (metadata.gmsVersionCode == 0 && (packageInfo = metadata.getPackageInfo("com.google.android.gms")) != null) {
                    metadata.gmsVersionCode = packageInfo.versionCode;
                }
                i = metadata.gmsVersionCode;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.metadata.getAppVersionCode());
        Metadata metadata2 = this.metadata;
        synchronized (metadata2) {
            try {
                if (metadata2.appVersionName == null) {
                    metadata2.populateAppVersionInfo();
                }
                str3 = metadata2.appVersionName;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        FirebaseApp firebaseApp2 = this.f1010app;
        firebaseApp2.checkNotDeleted();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(firebaseApp2.name.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String token = ((AutoValue_InstallationTokenResult) Room.await(((FirebaseInstallations) this.firebaseInstallations).getToken())).getToken();
            if (TextUtils.isEmpty(token)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Room.await(((FirebaseInstallations) this.firebaseInstallations).getId()));
        bundle.putString("cliv", "fcm-25.0.2");
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.heartbeatInfo.get();
        DefaultUserAgentPublisher defaultUserAgentPublisher = (DefaultUserAgentPublisher) this.userAgentPublisher.get();
        if (heartBeatInfo == null || defaultUserAgentPublisher == null) {
            return;
        }
        DefaultHeartBeatController defaultHeartBeatController = (DefaultHeartBeatController) heartBeatInfo;
        synchronized (defaultHeartBeatController) {
            long currentTimeMillis = System.currentTimeMillis();
            HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) defaultHeartBeatController.storageProvider.get();
            synchronized (heartBeatInfoStorage) {
                shouldSendSdkHeartBeat = heartBeatInfoStorage.shouldSendSdkHeartBeat(HeartBeatInfoStorage.GLOBAL, currentTimeMillis);
            }
            if (shouldSendSdkHeartBeat) {
                synchronized (heartBeatInfoStorage) {
                    heartBeatInfoStorage.firebaseDataStore.editSync(new CombinedModifier$$ExternalSyntheticLambda0(8, heartBeatInfoStorage, heartBeatInfoStorage.getFormattedDate(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(zzel$EnumUnboxingLocalUtility._getCode(i2)));
            bundle.putString("Firebase-Client", defaultUserAgentPublisher.getUserAgent());
        }
    }

    public final Task startRpc(String str, String str2, Bundle bundle) {
        try {
            setDefaultAttributesToBundle(str, str2, bundle);
            Rpc rpc = this.rpc;
            Huffman.Node node = rpc.zzg;
            int zza = node.zza();
            zzy zzyVar = zzy.zza;
            if (zza >= 12000000) {
                return zzv.zzb(rpc.zzf).zzd(1, bundle).continueWith(zzyVar, zzx.zza$1);
            }
            if (node.zzb() == 0) {
                return Room.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return rpc.zze(bundle).continueWithTask(zzyVar, new zbc((Object) rpc, (Object) bundle, false, 7));
        } catch (InterruptedException | ExecutionException e) {
            return Room.forException(e);
        }
    }
}
