package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;
import app.cash.broadway.navigation.Navigator;
import com.android.volley.Request;
import com.bugsnag.android.Client;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzez;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.squareup.cash.bugreporting.screens.BugReportingScreen;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.ui.ScreenshotReportingManager;
import com.squareup.util.cash.Countries;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class zzky implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;

    public zzky() {
        this.$r8$classId = 1;
        this.zza = new ArrayDeque(10);
    }

    private final void onActivityDestroyed$com$google$firebase$messaging$FcmLifecycleCallbacks(Activity activity) {
    }

    private final void onActivityPaused$com$google$firebase$messaging$FcmLifecycleCallbacks(Activity activity) {
    }

    private final void onActivityResumed$com$google$firebase$messaging$FcmLifecycleCallbacks(Activity activity) {
    }

    private final void onActivitySaveInstanceState$com$google$firebase$messaging$FcmLifecycleCallbacks(Activity activity, Bundle bundle) {
    }

    private final void onActivityStarted$com$google$android$gms$measurement$internal$zzky(Activity activity) {
    }

    private final void onActivityStarted$com$google$firebase$messaging$FcmLifecycleCallbacks(Activity activity) {
    }

    private final void onActivityStopped$com$google$android$gms$measurement$internal$zzky(Activity activity) {
    }

    private final void onActivityStopped$com$google$firebase$messaging$FcmLifecycleCallbacks(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.$r8$classId;
        Bundle bundle2 = null;
        Object obj = this.zza;
        switch (i) {
            case 0:
                zza(zzdd.zza(activity), bundle);
                break;
            case 1:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) obj;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string2 = extras.getString("google.message_id");
                            if (string2 == null) {
                                string2 = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                if (arrayDeque.contains(string2)) {
                                    break;
                                } else {
                                    arrayDeque.add(string2);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                    }
                    int i2 = 0;
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                FirebaseApp firebaseApp = FirebaseApp.getInstance();
                                firebaseApp.checkNotDeleted();
                                AnalyticsConnector analyticsConnector = (AnalyticsConnector) firebaseApp.componentRuntime.get(AnalyticsConnector.class);
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                }
                                if (analyticsConnector != null) {
                                    String string3 = bundle2.getString("google.c.a.c_id");
                                    AnalyticsConnectorImpl analyticsConnectorImpl = (AnalyticsConnectorImpl) analyticsConnector;
                                    if (com.google.firebase.analytics.connector.internal.zzc.zza()) {
                                        zzez zzezVar = analyticsConnectorImpl.zza.zza;
                                        zzezVar.zzV(new zzdf(zzezVar, string3, i2));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string3);
                                    analyticsConnectorImpl.logEvent(bundle3, "_cmp");
                                } else {
                                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        Countries.logToScion(bundle2, "_no");
                        break;
                    }
                }
                break;
            default:
                activity.getClass();
                final ScreenshotReportingManager screenshotReportingManager = (ScreenshotReportingManager) obj;
                StateFlowImpl stateFlowImpl = screenshotReportingManager.currentActivityFlow;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, activity);
                LinkedHashMap linkedHashMap = screenshotReportingManager.activityLaunchers;
                if ((activity instanceof ComponentActivity) && !linkedHashMap.containsKey(activity)) {
                    try {
                        linkedHashMap.put(activity, ((ComponentActivity) activity).registerForActivityResult(new ActivityResultContracts$PickVisualMedia(), new ActivityResultCallback() { // from class: com.squareup.cash.ui.ScreenshotReportingManager$$ExternalSyntheticLambda2
                            @Override // androidx.activity.result.ActivityResultCallback
                            public final void onActivityResult(Object obj2) {
                                Unit unit;
                                Uri uri = (Uri) obj2;
                                ScreenshotReportingManager screenshotReportingManager2 = ScreenshotReportingManager.this;
                                if (uri != null) {
                                    Navigator navigator = screenshotReportingManager2.navigator;
                                    if (navigator != null) {
                                        String uri2 = uri.toString();
                                        uri2.getClass();
                                        navigator.goTo(new BugReportingScreen(CollectionsKt__CollectionsJVMKt.listOf(new Screenshot(uri2))));
                                        unit = Unit.INSTANCE;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit != null) {
                                        return;
                                    }
                                }
                                Navigator navigator2 = screenshotReportingManager2.navigator;
                                if (navigator2 != null) {
                                    navigator2.goTo(new BugReportingScreen(EmptyList.INSTANCE));
                                }
                            }
                        }));
                        break;
                    } catch (Exception e2) {
                        Log.e("ScreenshotReporting", "Failed to register visual media picker", e2);
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.$r8$classId) {
            case 0:
                zzb(zzdd.zza(activity));
                break;
            case 1:
                break;
            default:
                ScreenshotReportingManager screenshotReportingManager = (ScreenshotReportingManager) this.zza;
                StateFlowImpl stateFlowImpl = screenshotReportingManager.currentActivityFlow;
                activity.getClass();
                if (Build.VERSION.SDK_INT >= 34) {
                    ScreenshotReportingManager.access$unregisterScreenshotDetection(screenshotReportingManager, activity);
                }
                if (Intrinsics.areEqual(stateFlowImpl.getValue(), activity)) {
                    stateFlowImpl.setValue(null);
                }
                screenshotReportingManager.activityLaunchers.remove(activity);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.$r8$classId) {
            case 0:
                zzc(zzdd.zza(activity));
                break;
            case 1:
                break;
            default:
                activity.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.$r8$classId) {
            case 0:
                zzd(zzdd.zza(activity));
                break;
            case 1:
                break;
            default:
                activity.getClass();
                StateFlowImpl stateFlowImpl = ((ScreenshotReportingManager) this.zza).currentActivityFlow;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, activity);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.$r8$classId) {
            case 0:
                zze(zzdd.zza(activity), bundle);
                break;
            case 1:
                break;
            default:
                activity.getClass();
                bundle.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.$r8$classId) {
            case 0:
            case 1:
                break;
            default:
                activity.getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.$r8$classId) {
            case 0:
            case 1:
                break;
            default:
                activity.getClass();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: all -> 0x0029, RuntimeException -> 0x002d, TryCatch #0 {RuntimeException -> 0x002d, blocks: (B:3:0x0005, B:5:0x001a, B:7:0x0020, B:12:0x004b, B:15:0x0052, B:19:0x0064, B:23:0x0072, B:31:0x0030, B:33:0x0037, B:35:0x0043), top: B:2:0x0005, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zza(zzdd zzddVar, Bundle bundle) {
        zzic zzicVar;
        zzic zzicVar2;
        Intent intent;
        Uri uri;
        zzlj zzljVar = (zzlj) this.zza;
        try {
            try {
                zzicVar2 = (zzic) zzljVar.$$delegate_0;
                zzgu zzguVar = zzicVar2.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzl.zza("onActivityCreated");
                intent = zzddVar.zzc;
            } catch (RuntimeException e) {
                zzgu zzguVar2 = ((zzic) zzljVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzd.zzb(e, "Throwable caught in onActivityCreated");
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        zzic.zzN(zzicVar2.zzl);
                        String str = !zzpp.zzj(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle != null;
                        zzhz zzhzVar = zzicVar2.zzj;
                        zzic.zzP(zzhzVar);
                        zzhzVar.zzj(new zzk(this, z, uri, str, queryParameter));
                        zzicVar = (zzic) zzljVar.$$delegate_0;
                        zzmb zzmbVar = zzicVar.zzo;
                        zzic.zzO(zzmbVar);
                        zzmbVar.zzn(zzddVar, bundle);
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string2 = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string2)) {
                        data = Uri.parse(string2);
                        uri = data;
                        if (uri != null) {
                            zzic.zzN(zzicVar2.zzl);
                            String str2 = !zzpp.zzj(intent) ? "gs" : "auto";
                            String queryParameter2 = uri.getQueryParameter("referrer");
                            boolean z2 = bundle != null;
                            zzhz zzhzVar2 = zzicVar2.zzj;
                            zzic.zzP(zzhzVar2);
                            zzhzVar2.zzj(new zzk(this, z2, uri, str2, queryParameter2));
                            zzicVar = (zzic) zzljVar.$$delegate_0;
                            zzmb zzmbVar2 = zzicVar.zzo;
                            zzic.zzO(zzmbVar2);
                            zzmbVar2.zzn(zzddVar, bundle);
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
            zzicVar = (zzic) zzljVar.$$delegate_0;
            zzmb zzmbVar22 = zzicVar.zzo;
            zzic.zzO(zzmbVar22);
            zzmbVar22.zzn(zzddVar, bundle);
        } catch (Throwable th) {
            zzmb zzmbVar3 = ((zzic) zzljVar.$$delegate_0).zzo;
            zzic.zzO(zzmbVar3);
            zzmbVar3.zzn(zzddVar, bundle);
            throw th;
        }
    }

    public void zzb(zzdd zzddVar) {
        zzmb zzmbVar = ((zzic) ((zzlj) this.zza).$$delegate_0).zzo;
        zzic.zzO(zzmbVar);
        synchronized (zzmbVar.zzj) {
            try {
                if (Objects.equals(zzmbVar.zze, zzddVar)) {
                    zzmbVar.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((zzic) zzmbVar.$$delegate_0).zzg.zzv()) {
            zzmbVar.zzd.remove(Integer.valueOf(zzddVar.zza));
        }
    }

    public void zzc(zzdd zzddVar) {
        zzic zzicVar = (zzic) ((zzlj) this.zza).$$delegate_0;
        zzmb zzmbVar = zzicVar.zzo;
        zzic.zzO(zzmbVar);
        synchronized (zzmbVar.zzj) {
            zzmbVar.zzi = false;
            zzmbVar.zzf = true;
        }
        zzic zzicVar2 = (zzic) zzmbVar.$$delegate_0;
        zzicVar2.zzn.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzicVar2.zzg.zzv()) {
            zzlu zzz = zzmbVar.zzz(zzddVar);
            zzmbVar.zzc = zzmbVar.zzb;
            zzmbVar.zzb = null;
            zzhz zzhzVar = zzicVar2.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new Request.AnonymousClass1(zzmbVar, zzz, elapsedRealtime));
        } else {
            zzmbVar.zzb = null;
            zzhz zzhzVar2 = zzicVar2.zzj;
            zzic.zzP(zzhzVar2);
            zzhzVar2.zzj(new zzly(zzmbVar, elapsedRealtime));
        }
        zzoc zzocVar = zzicVar.zzk;
        zzic.zzO(zzocVar);
        zzic zzicVar3 = (zzic) zzocVar.$$delegate_0;
        zzicVar3.zzn.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        zzhz zzhzVar3 = zzicVar3.zzj;
        zzic.zzP(zzhzVar3);
        zzhzVar3.zzj(new zzly(zzocVar, elapsedRealtime2));
    }

    public void zzd(zzdd zzddVar) {
        zzic zzicVar = (zzic) ((zzlj) this.zza).$$delegate_0;
        zzoc zzocVar = zzicVar.zzk;
        zzic.zzO(zzocVar);
        zzic zzicVar2 = (zzic) zzocVar.$$delegate_0;
        zzicVar2.zzn.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzhz zzhzVar = zzicVar2.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new zzc(zzocVar, elapsedRealtime));
        zzmb zzmbVar = zzicVar.zzo;
        zzic.zzO(zzmbVar);
        Object obj = zzmbVar.zzj;
        synchronized (obj) {
            try {
                zzmbVar.zzi = true;
                if (!Objects.equals(zzddVar, zzmbVar.zze)) {
                    synchronized (obj) {
                        zzmbVar.zze = zzddVar;
                        zzmbVar.zzf = false;
                        zzic zzicVar3 = (zzic) zzmbVar.$$delegate_0;
                        if (zzicVar3.zzg.zzv()) {
                            zzmbVar.zzg = null;
                            zzhz zzhzVar2 = zzicVar3.zzj;
                            zzic.zzP(zzhzVar2);
                            zzhzVar2.zzj(new Client.AnonymousClass3(zzmbVar));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzic zzicVar4 = (zzic) zzmbVar.$$delegate_0;
        if (!zzicVar4.zzg.zzv()) {
            zzmbVar.zzb = zzmbVar.zzg;
            zzhz zzhzVar3 = zzicVar4.zzj;
            zzic.zzP(zzhzVar3);
            zzhzVar3.zzj(new com.google.android.gms.stats.zza(zzmbVar));
            return;
        }
        zzmbVar.zzx(zzddVar.zzb, zzmbVar.zzz(zzddVar), false);
        zzd zzdVar = ((zzic) zzmbVar.$$delegate_0).zzq;
        zzic.zzM(zzdVar);
        zzic zzicVar5 = (zzic) zzdVar.$$delegate_0;
        zzicVar5.zzn.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        zzhz zzhzVar4 = zzicVar5.zzj;
        zzic.zzP(zzhzVar4);
        zzhzVar4.zzj(new zzc(zzdVar, elapsedRealtime2));
    }

    public void zze(zzdd zzddVar, Bundle bundle) {
        zzlu zzluVar;
        zzmb zzmbVar = ((zzic) ((zzlj) this.zza).$$delegate_0).zzo;
        zzic.zzO(zzmbVar);
        if (!((zzic) zzmbVar.$$delegate_0).zzg.zzv() || bundle == null || (zzluVar = (zzlu) zzmbVar.zzd.get(Integer.valueOf(zzddVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzluVar.zzc);
        bundle2.putString("name", zzluVar.zza);
        bundle2.putString("referrer_name", zzluVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public /* synthetic */ zzky(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }
}
