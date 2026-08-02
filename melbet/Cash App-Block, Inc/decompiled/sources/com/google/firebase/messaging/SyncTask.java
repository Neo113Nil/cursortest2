package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.common.api.internal.zabs;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_face.zzas;
import com.google.android.gms.internal.mlkit_vision_face.zzbd;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzao;
import com.google.android.gms.internal.mlkit_vision_text_common.zzba;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.mlkit.common.sdkinternal.zzh;
import com.google.mlkit.vision.text.internal.zzr;
import com.nimbusds.jose.jca.JCAContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class SyncTask implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object firebaseMessaging;
    public final long nextDelaySeconds;
    public final Object processorExecutor;
    public final Object syncWakeLock;

    public SyncTask(FirebaseMessaging firebaseMessaging, long j) {
        this.$r8$classId = 0;
        this.processorExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.getApplicationContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean isDeviceConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.firebaseMessaging).getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean maybeRefreshToken() {
        try {
            if (((FirebaseMessaging) this.firebaseMessaging).blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        zzh zzhVar = zzh.zza;
        Object obj = this.processorExecutor;
        long j = this.nextDelaySeconds;
        Object obj2 = this.firebaseMessaging;
        Object obj3 = this.syncWakeLock;
        switch (i) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj3;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                if (UnleashContext.getInstance().hasWakeLockPermission(firebaseMessaging.getApplicationContext())) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        firebaseMessaging.setSyncScheduledOrRunning(true);
                        if (!firebaseMessaging.isGmsCorePresent()) {
                            firebaseMessaging.setSyncScheduledOrRunning(false);
                            if (!UnleashContext.getInstance().hasWakeLockPermission(firebaseMessaging.getApplicationContext())) {
                                return;
                            }
                        } else if (!UnleashContext.getInstance().hasAccessNetworkStatePermission(firebaseMessaging.getApplicationContext()) || isDeviceConnected()) {
                            if (maybeRefreshToken()) {
                                firebaseMessaging.setSyncScheduledOrRunning(false);
                            } else {
                                firebaseMessaging.syncWithDelaySecondsInternal(j);
                            }
                            if (!UnleashContext.getInstance().hasWakeLockPermission(firebaseMessaging.getApplicationContext())) {
                                return;
                            }
                        } else {
                            zabs zabsVar = new zabs();
                            zabsVar.zab = this;
                            zabsVar.registerReceiver();
                            if (!UnleashContext.getInstance().hasWakeLockPermission(firebaseMessaging.getApplicationContext())) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.setSyncScheduledOrRunning(false);
                        if (!UnleashContext.getInstance().hasWakeLockPermission(firebaseMessaging.getApplicationContext())) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (UnleashContext.getInstance().hasWakeLockPermission(firebaseMessaging.getApplicationContext())) {
                        wakeLock.release();
                    }
                    throw th;
                }
            case 1:
                zzwp zzwpVar = (zzwp) obj3;
                zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                zzft zzftVar = (zzft) obj2;
                JCAContext jCAContext = (JCAContext) obj;
                HashMap hashMap = zzwpVar.zzl;
                if (!hashMap.containsKey(zzrcVar)) {
                    hashMap.put(zzrcVar, new zzbw());
                }
                ((zzbw) hashMap.get(zzrcVar)).zzt(zzftVar, Long.valueOf(j));
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (zzwpVar.zzk(zzrcVar, elapsedRealtime)) {
                    zzwpVar.zzk.put(zzrcVar, Long.valueOf(elapsedRealtime));
                    zzhVar.execute(new Client.AnonymousClass4(zzwpVar, jCAContext));
                    return;
                }
                return;
            case 2:
                zzoc zzocVar = (zzoc) obj3;
                zzdn zzdnVar = (zzdn) obj2;
                JCAContext jCAContext2 = (JCAContext) obj;
                HashMap hashMap2 = zzocVar.zzl;
                zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
                if (!hashMap2.containsKey(zzktVar)) {
                    zzbd zzbdVar = new zzbd();
                    zzas zzasVar = new zzas();
                    if (!zzbdVar.isEmpty()) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        throw null;
                    }
                    zzasVar.zza = zzbdVar;
                    hashMap2.put(zzktVar, zzasVar);
                }
                zzas zzasVar2 = (zzas) hashMap2.get(zzktVar);
                Long valueOf = Long.valueOf(j);
                zzbd zzbdVar2 = zzasVar2.zza;
                Collection collection = (Collection) zzbdVar2.get(zzdnVar);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        a$$ExternalSyntheticBUOutline0.m$1((Object) "New Collection violated the Collection spec");
                        return;
                    } else {
                        zzasVar2.zzb++;
                        zzbdVar2.put(zzdnVar, arrayList);
                    }
                } else if (collection.add(valueOf)) {
                    zzasVar2.zzb++;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (zzocVar.zzk(zzktVar, elapsedRealtime2)) {
                    zzocVar.zzk.put(zzktVar, Long.valueOf(elapsedRealtime2));
                    zzhVar.execute(new Client.AnonymousClass4(21, zzocVar, jCAContext2));
                    return;
                }
                return;
            default:
                zzuc zzucVar = (zzuc) obj3;
                zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
                zzes zzesVar = (zzes) obj2;
                zzr zzrVar = (zzr) obj;
                HashMap hashMap3 = zzucVar.zzl;
                if (!hashMap3.containsKey(zzovVar)) {
                    zzba zzbaVar = new zzba();
                    zzao zzaoVar = new zzao();
                    if (!zzbaVar.isEmpty()) {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        throw null;
                    }
                    zzaoVar.zza = zzbaVar;
                    hashMap3.put(zzovVar, zzaoVar);
                }
                zzao zzaoVar2 = (zzao) hashMap3.get(zzovVar);
                Long valueOf2 = Long.valueOf(j);
                zzba zzbaVar2 = zzaoVar2.zza;
                Collection collection2 = (Collection) zzbaVar2.get(zzesVar);
                if (collection2 == null) {
                    ArrayList arrayList2 = new ArrayList(3);
                    if (!arrayList2.add(valueOf2)) {
                        a$$ExternalSyntheticBUOutline0.m$1((Object) "New Collection violated the Collection spec");
                        return;
                    }
                    zzbaVar2.put(zzesVar, arrayList2);
                } else {
                    collection2.add(valueOf2);
                }
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                if (zzucVar.zzk(zzovVar, elapsedRealtime3)) {
                    zzucVar.zzk.put(zzovVar, Long.valueOf(elapsedRealtime3));
                    zzhVar.execute(new Client.AnonymousClass4(zzucVar, zzrVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ SyncTask(zzoc zzocVar, zzdn zzdnVar, long j, JCAContext jCAContext) {
        this.$r8$classId = 2;
        this.syncWakeLock = zzocVar;
        this.firebaseMessaging = zzdnVar;
        this.nextDelaySeconds = j;
        this.processorExecutor = jCAContext;
    }

    public /* synthetic */ SyncTask(zzuc zzucVar, zzes zzesVar, long j, zzr zzrVar) {
        this.$r8$classId = 3;
        zzov zzovVar = zzov.UNKNOWN_EVENT;
        this.syncWakeLock = zzucVar;
        this.firebaseMessaging = zzesVar;
        this.nextDelaySeconds = j;
        this.processorExecutor = zzrVar;
    }

    public /* synthetic */ SyncTask(zzwp zzwpVar, zzft zzftVar, long j, JCAContext jCAContext) {
        this.$r8$classId = 1;
        zzrc zzrcVar = zzrc.UNKNOWN_EVENT;
        this.syncWakeLock = zzwpVar;
        this.firebaseMessaging = zzftVar;
        this.nextDelaySeconds = j;
        this.processorExecutor = jCAContext;
    }
}
