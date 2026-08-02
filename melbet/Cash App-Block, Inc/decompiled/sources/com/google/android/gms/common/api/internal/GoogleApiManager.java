package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.core.app.PendingIntentCompat;
import androidx.core.os.BundleKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.ExecutorDelivery$1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class GoogleApiManager implements Handler.Callback {
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status zab = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object zae = new Object();
    public static GoogleApiManager zah;
    public TelemetryData zaf;
    public zat zag;
    public final Context zaj;
    public final GoogleApiAvailability zak;
    public final WorkLauncherImpl zal;
    public final com.google.android.gms.internal.base.zao zas;
    public volatile boolean zat;
    public long zac = 10000;
    public boolean zad = false;
    public final AtomicInteger zam = new AtomicInteger(1);
    public final AtomicInteger zan = new AtomicInteger(0);
    public final ConcurrentHashMap zao = new ConcurrentHashMap(5, 0.75f, 1);
    public zaab zap = null;
    public final ArraySet zaq = new ArraySet(0);
    public final ArraySet zar = new ArraySet(0);

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zat = true;
        this.zaj = context;
        com.google.android.gms.internal.base.zao zaoVar = new com.google.android.gms.internal.base.zao(looper, this);
        this.zas = zaoVar;
        this.zak = googleApiAvailability;
        this.zal = new WorkLauncherImpl((GoogleApiAvailabilityLight) googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (BundleKt.zzl == null) {
            BundleKt.zzl = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (BundleKt.zzl.booleanValue()) {
            this.zat = false;
        }
        zaoVar.sendMessage(zaoVar.obtainMessage(6));
    }

    public static void reportSignOut() {
        synchronized (zae) {
            try {
                GoogleApiManager googleApiManager = zah;
                if (googleApiManager != null) {
                    googleApiManager.zan.incrementAndGet();
                    com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
                    zaoVar.sendMessageAtFrontOfQueue(zaoVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status zaJ(ApiKey apiKey, ConnectionResult connectionResult) {
        String str = apiKey.zab.zac;
        String valueOf = String.valueOf(connectionResult);
        return new Status(17, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), connectionResult.zzc, connectionResult);
    }

    public static GoogleApiManager zaa(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zae) {
            try {
                if (zah == null) {
                    zah = new GoogleApiManager(context.getApplicationContext(), zzq.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
                }
                googleApiManager = zah;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0307  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        zabk zabkVar;
        boolean z;
        Feature[] zaa2;
        com.google.android.gms.internal.base.zao zaoVar = this.zas;
        ConcurrentHashMap concurrentHashMap = this.zao;
        int i = message.what;
        switch (i) {
            case 1:
                this.zac = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zaoVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zaoVar.sendMessageDelayed(zaoVar.obtainMessage(12, (ApiKey) it.next()), this.zac);
                }
                return true;
            case 2:
                throw Boxes$$ExternalSyntheticOutline1.m(message.obj);
            case 3:
                for (zabk zabkVar2 : concurrentHashMap.values()) {
                    zzae.checkHandlerThread(zabkVar2.zaa.zas);
                    zabkVar2.zal = null;
                    zabkVar2.zam();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zacc zaccVar = (zacc) message.obj;
                GoogleApi googleApi = zaccVar.zac;
                zai zaiVar = zaccVar.zaa;
                zabk zabkVar3 = (zabk) concurrentHashMap.get(googleApi.zag);
                if (zabkVar3 == null) {
                    zabkVar3 = zaH(googleApi);
                }
                if (!zabkVar3.zac.requiresSignIn() || this.zan.get() == zaccVar.zab) {
                    zabkVar3.zad(zaiVar);
                    return true;
                }
                zaiVar.zad(zaa);
                zabkVar3.zae();
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabkVar = (zabk) it2.next();
                        if (zabkVar.zah == i2) {
                        }
                    } else {
                        zabkVar = null;
                    }
                }
                if (zabkVar == null) {
                    Log.wtf("GoogleApiManager", re$$ExternalSyntheticOutline0.m(i2, "Could not find API instance ", " while trying to fail enqueued calls.", new StringBuilder(String.valueOf(i2).length() + 65)), new Exception());
                    return true;
                }
                int i3 = connectionResult.zzb;
                if (i3 != 13) {
                    zabkVar.zaJ(zaJ(zabkVar.zad, connectionResult));
                    return true;
                }
                this.zak.getClass();
                AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.sCanceledAvailabilityNotification;
                String zza = ConnectionResult.zza(i3);
                String str = connectionResult.zzd;
                zabkVar.zaJ(new Status(17, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(zza.length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", zza, ": ", str), null, null));
                return true;
            case 6:
                Context context = this.zaj;
                if (context.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) context.getApplicationContext());
                    BackgroundDetector backgroundDetector = BackgroundDetector.zza;
                    zabf zabfVar = new zabf(this);
                    backgroundDetector.getClass();
                    synchronized (backgroundDetector) {
                        backgroundDetector.zzd.add(zabfVar);
                    }
                    AtomicBoolean atomicBoolean2 = backgroundDetector.zzb;
                    AtomicBoolean atomicBoolean3 = backgroundDetector.zzc;
                    if (!atomicBoolean3.get()) {
                        Boolean bool = PlatformKt.zzc;
                        if (bool == null) {
                            bool = Boolean.valueOf(Process.isIsolated());
                            PlatformKt.zzc = bool;
                        }
                        if (bool.booleanValue()) {
                            z = true;
                            if (!z) {
                                this.zac = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z = atomicBoolean2.get();
                    if (!z) {
                    }
                }
                return true;
            case 7:
                zaH((GoogleApi) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabk zabkVar4 = (zabk) concurrentHashMap.get(message.obj);
                    zzae.checkHandlerThread(zabkVar4.zaa.zas);
                    if (zabkVar4.zaj) {
                        zabkVar4.zam();
                        return true;
                    }
                }
                return true;
            case 10:
                ArraySet arraySet = this.zar;
                arraySet.getClass();
                ArrayMap.KeyIterator keyIterator = new ArrayMap.KeyIterator(arraySet);
                while (keyIterator.hasNext()) {
                    zabk zabkVar5 = (zabk) concurrentHashMap.remove((ApiKey) keyIterator.next());
                    if (zabkVar5 != null) {
                        zabkVar5.zae();
                    }
                }
                arraySet.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabk zabkVar6 = (zabk) concurrentHashMap.get(message.obj);
                    GoogleApiManager googleApiManager = zabkVar6.zaa;
                    zzae.checkHandlerThread(googleApiManager.zas);
                    boolean z2 = zabkVar6.zaj;
                    if (z2) {
                        if (z2) {
                            GoogleApiManager googleApiManager2 = zabkVar6.zaa;
                            ApiKey apiKey = zabkVar6.zad;
                            googleApiManager2.zas.removeMessages(11, apiKey);
                            googleApiManager2.zas.removeMessages(9, apiKey);
                            zabkVar6.zaj = false;
                        }
                        zabkVar6.zaJ(googleApiManager.zak.isGooglePlayServicesAvailable(googleApiManager.zaj) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        zabkVar6.zac.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabk zabkVar7 = (zabk) concurrentHashMap.get(message.obj);
                    zzae.checkHandlerThread(zabkVar7.zaa.zas);
                    GmsClient gmsClient = zabkVar7.zac;
                    if (gmsClient.isConnected() && zabkVar7.zag.isEmpty()) {
                        zaaa zaaaVar = zabkVar7.zae;
                        if (zaaaVar.zaa.isEmpty() && zaaaVar.zab.isEmpty()) {
                            gmsClient.disconnect("Timing out service connection.");
                            return true;
                        }
                        zabkVar7.zaL();
                    }
                    return true;
                }
                return true;
            case 14:
                throw Boxes$$ExternalSyntheticOutline1.m(message.obj);
            case 15:
                zabl zablVar = (zabl) message.obj;
                if (concurrentHashMap.containsKey(zablVar.zaa())) {
                    zabk zabkVar8 = (zabk) concurrentHashMap.get(zablVar.zaa());
                    if (zabkVar8.zak.contains(zablVar) && !zabkVar8.zaj) {
                        if (zabkVar8.zac.isConnected()) {
                            zabkVar8.zaF();
                            return true;
                        }
                        zabkVar8.zam();
                        return true;
                    }
                }
                return true;
            case 16:
                zabl zablVar2 = (zabl) message.obj;
                if (concurrentHashMap.containsKey(zablVar2.zaa())) {
                    zabk zabkVar9 = (zabk) concurrentHashMap.get(zablVar2.zaa());
                    if (zabkVar9.zak.remove(zablVar2)) {
                        GoogleApiManager googleApiManager3 = zabkVar9.zaa;
                        googleApiManager3.zas.removeMessages(15, zablVar2);
                        googleApiManager3.zas.removeMessages(16, zablVar2);
                        Feature zab2 = zablVar2.zab();
                        LinkedList<zai> linkedList = zabkVar9.zab;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (zai zaiVar2 : linkedList) {
                            if ((zaiVar2 instanceof zac) && (zaa2 = ((zac) zaiVar2).zaa(zabkVar9)) != null && Hex.contains(zaa2, zab2)) {
                                arrayList.add(zaiVar2);
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            zai zaiVar3 = (zai) arrayList.get(i4);
                            linkedList.remove(zaiVar3);
                            zaiVar3.zae(new UnsupportedApiCallException(zab2));
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.zaf;
                if (telemetryData != null) {
                    if (telemetryData.zaa > 0 || zam()) {
                        if (this.zag == null) {
                            this.zag = zzae.getClient(this.zaj, TelemetryLoggingOptions.zaa);
                        }
                        this.zag.log(telemetryData);
                    }
                    this.zaf = null;
                    return true;
                }
                return true;
            case 18:
                zabz zabzVar = (zabz) message.obj;
                long j = zabzVar.zac;
                MethodInvocation methodInvocation = zabzVar.zaa;
                int i5 = zabzVar.zab;
                if (j == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i5, Arrays.asList(methodInvocation));
                    if (this.zag == null) {
                        this.zag = zzae.getClient(this.zaj, TelemetryLoggingOptions.zaa);
                    }
                    this.zag.log(telemetryData2);
                    return true;
                }
                TelemetryData telemetryData3 = this.zaf;
                if (telemetryData3 != null) {
                    List list = telemetryData3.zab;
                    if (telemetryData3.zaa != i5 || (list != null && list.size() >= zabzVar.zad)) {
                        zaoVar.removeMessages(17);
                        TelemetryData telemetryData4 = this.zaf;
                        if (telemetryData4 != null) {
                            if (telemetryData4.zaa > 0 || zam()) {
                                if (this.zag == null) {
                                    this.zag = zzae.getClient(this.zaj, TelemetryLoggingOptions.zaa);
                                }
                                this.zag.log(telemetryData4);
                            }
                            this.zaf = null;
                        }
                    } else {
                        TelemetryData telemetryData5 = this.zaf;
                        if (telemetryData5.zab == null) {
                            telemetryData5.zab = new ArrayList();
                        }
                        telemetryData5.zab.add(methodInvocation);
                    }
                }
                if (this.zaf == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(methodInvocation);
                    this.zaf = new TelemetryData(i5, arrayList2);
                    zaoVar.sendMessageDelayed(zaoVar.obtainMessage(17), j);
                    return true;
                }
                return true;
            case 19:
                this.zad = false;
                return true;
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiManager", sb.toString());
                return false;
        }
    }

    public final zabk zaH(GoogleApi googleApi) {
        ApiKey apiKey = googleApi.zag;
        ConcurrentHashMap concurrentHashMap = this.zao;
        zabk zabkVar = (zabk) concurrentHashMap.get(apiKey);
        if (zabkVar == null) {
            zabkVar = new zabk(this, googleApi);
            concurrentHashMap.put(apiKey, zabkVar);
        }
        if (zabkVar.zac.requiresSignIn()) {
            this.zar.add(apiKey);
        }
        zabkVar.zam();
        return zabkVar;
    }

    public final void zaI(TaskCompletionSource taskCompletionSource, int i, GoogleApi googleApi) {
        zaby zaa2;
        if (i == 0 || (zaa2 = zaby.zaa(this, i, googleApi.zag)) == null) {
            return;
        }
        zzw zzwVar = taskCompletionSource.zza;
        com.google.android.gms.internal.base.zao zaoVar = this.zas;
        Objects.requireNonNull(zaoVar);
        zzwVar.addOnCompleteListener(new ExecutorDelivery$1(2, zaoVar), zaa2);
    }

    public final void zae(zaab zaabVar) {
        synchronized (zae) {
            try {
                if (this.zap != zaabVar) {
                    this.zap = zaabVar;
                    this.zaq.clear();
                }
                this.zaq.addAll(zaabVar.zad);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zam() {
        int i;
        if (this.zad) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.zal.processor;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean zap(ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        GoogleApiAvailability googleApiAvailability = this.zak;
        googleApiAvailability.getClass();
        Context context = this.zaj;
        if (!DimensionKt.isInstantApp(context)) {
            boolean hasResolution = connectionResult.hasResolution();
            int i2 = connectionResult.zzb;
            if (hasResolution) {
                pendingIntent = connectionResult.zzc;
            } else {
                pendingIntent = null;
                Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, i2, null);
                if (errorResolutionIntent != null) {
                    pendingIntent = PendingIntentCompat.getActivity(context, errorResolutionIntent);
                }
            }
            if (pendingIntent != null) {
                googleApiAvailability.zac(context, i2, com.google.android.gms.internal.base.zak.zaa(context, GoogleApiActivity.zaa(context, pendingIntent, i, true), com.google.android.gms.internal.base.zak.zaa | 134217728));
                googleApiAvailability.zae(context, connectionResult, false);
                return true;
            }
        }
        return false;
    }

    public final void zaq(ConnectionResult connectionResult, int i) {
        if (zap(connectionResult, i)) {
            return;
        }
        com.google.android.gms.internal.base.zao zaoVar = this.zas;
        zaoVar.sendMessage(zaoVar.obtainMessage(5, i, 0, connectionResult));
    }
}
