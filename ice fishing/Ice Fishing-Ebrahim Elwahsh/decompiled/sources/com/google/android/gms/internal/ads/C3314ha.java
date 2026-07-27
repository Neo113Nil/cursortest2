package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3314ha implements InterfaceC3404jB, InterfaceC3701ol, LD, InterfaceC3222fq {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31235n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f31236u;

    public /* synthetic */ C3314ha(Context context, int i) {
        this.f31235n = i;
        this.f31236u = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0294, code lost:
    
        if (new org.json.JSONObject(r6.getString("app_settings_json", "{}")).optBoolean("local_flags_enabled") != false) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a0 A[Catch: all -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0165, blocks: (B:51:0x015e, B:53:0x0162, B:55:0x0168, B:57:0x016c, B:58:0x016e, B:60:0x0180, B:61:0x0184, B:63:0x0186, B:80:0x01fe, B:81:0x0205, B:89:0x0237, B:95:0x02a0, B:107:0x02e8, B:108:0x02ef, B:137:0x02f1, B:138:0x02f8, B:66:0x019a, B:70:0x01b7, B:72:0x01c3, B:73:0x01cd, B:75:0x01d3, B:77:0x01e3, B:79:0x01fa, B:82:0x0208, B:84:0x020c, B:86:0x021c, B:88:0x0233, B:90:0x023f, B:93:0x0296, B:96:0x02a9, B:98:0x02b7, B:100:0x02c5, B:101:0x02cc, B:103:0x02da, B:105:0x02de, B:106:0x02e1, B:109:0x0250, B:111:0x025e, B:113:0x0266, B:116:0x0286, B:118:0x0289, B:124:0x029a, B:125:0x029d, B:128:0x01a0, B:130:0x01ad), top: B:50:0x015e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a9 A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #3 {all -> 0x01a7, blocks: (B:66:0x019a, B:70:0x01b7, B:72:0x01c3, B:73:0x01cd, B:75:0x01d3, B:77:0x01e3, B:79:0x01fa, B:82:0x0208, B:84:0x020c, B:86:0x021c, B:88:0x0233, B:90:0x023f, B:93:0x0296, B:96:0x02a9, B:98:0x02b7, B:100:0x02c5, B:101:0x02cc, B:103:0x02da, B:105:0x02de, B:106:0x02e1, B:109:0x0250, B:111:0x025e, B:113:0x0266, B:116:0x0286, B:118:0x0289, B:124:0x029a, B:125:0x029d, B:128:0x01a0, B:130:0x01ad, B:115:0x026a), top: B:65:0x019a, outer: #1, inners: #4 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a() {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        A a9;
        Context context2 = null;
        switch (this.f31235n) {
            case 0:
                C3151ea c3151ea = AbstractC3368ia.f31613a;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = q2.r.f40116e.f40119c;
                Context context3 = this.f31236u;
                if (!sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31012c) {
                    synchronized (sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31010a) {
                        try {
                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31012c) {
                                if (!sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31013d) {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31013d = true;
                                }
                                sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.i = TextUtils.equals(context3.getPackageName(), "com.google.android.gms");
                                if (context3.getApplicationContext() != null) {
                                    context3 = context3.getApplicationContext();
                                }
                                sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g = context3;
                                try {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31015f = U2.c.a(context3).c(128, sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g.getPackageName()).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                try {
                                    Context context4 = sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g;
                                    if (context4 == null) {
                                        context4 = null;
                                    } else {
                                        try {
                                            context = context4.createPackageContext("com.google.android.gms", 0);
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            context = null;
                                        }
                                        if (context != null || (context = context4.getApplicationContext()) != null) {
                                            context4 = context;
                                        }
                                    }
                                    if (context4 != null) {
                                        T2 t22 = q2.r.f40116e.f40118b;
                                        sharedPreferences = T2.s(context4);
                                    } else {
                                        sharedPreferences = null;
                                    }
                                    if (sharedPreferences != null) {
                                        AbstractC2887Za.f28989a.set(new C3206fa(sharedPreferencesOnSharedPreferenceChangeListenerC3260ga, sharedPreferences));
                                    }
                                    if (!sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.i) {
                                        C3398j5 c3398j5 = AbstractC2530Ea.f24770d;
                                        if (((Long) c3398j5.r()).longValue() > 0 && AbstractC3194fG.A(sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g, "crash_without_write") >= ((Long) c3398j5.r()).longValue()) {
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31018j = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31012c = true;
                                        }
                                    }
                                    if (!sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.i) {
                                        C3398j5 c3398j52 = AbstractC2530Ea.f24772f;
                                        if (((Long) c3398j52.r()).longValue() > 0 && AbstractC3194fG.A(sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g, "init_without_write") >= ((Long) c3398j52.r()).longValue()) {
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31018j = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31012c = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31013d = false;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31011b.open();
                                        }
                                    }
                                    Context context5 = sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g;
                                    if (!((Boolean) AbstractC2632Ka.f25987k.r()).booleanValue()) {
                                        if (((Boolean) AbstractC2632Ka.f25988l.r()).booleanValue() && (r6 = context5.getSharedPreferences("admob", 0)) != null) {
                                            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                            try {
                                                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                try {
                                                    break;
                                                } catch (JSONException unused3) {
                                                }
                                            } finally {
                                                StrictMode.setThreadPolicy(threadPolicy);
                                            }
                                        }
                                        if (context4 != null) {
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31013d = false;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31011b.open();
                                        } else {
                                            q2.r rVar = q2.r.f40116e;
                                            T2 t23 = rVar.f40118b;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31014e = T2.s(context4);
                                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.i && ((Boolean) AbstractC2632Ka.f25982e.r()).booleanValue()) {
                                                rVar.f40120d.a(sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g);
                                            }
                                            if (!((Boolean) AbstractC2632Ka.f25980c.r()).booleanValue() && (sharedPreferences2 = sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31014e) != null) {
                                                sharedPreferences2.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC3260ga);
                                            }
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.c(sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31014e);
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31012c = true;
                                        }
                                    }
                                    context4 = sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31016g;
                                    if (context4 != null) {
                                    }
                                } finally {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31013d = false;
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.f31011b.open();
                                }
                            }
                        } finally {
                        }
                    }
                }
                return null;
            case 3:
                O2 o22 = AbstractC2655Lg.f26175K;
                if (o22.f26640u) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.f31236u.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!o22.f26640u) {
                    o22.f26640u = true;
                    C3604mw a10 = C3604mw.a();
                    a10.getClass();
                    a10.f32779b = new C3118dw(new Handler(), applicationContext, a10);
                    C3228fw c3228fw = C3228fw.f30921w;
                    boolean z8 = applicationContext instanceof Application;
                    if (z8) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(c3228fw);
                    }
                    AbstractC3035cL.f29688L = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = AbstractC3981tw.f34496a;
                    AbstractC3981tw.f34498c = applicationContext.getResources().getDisplayMetrics().density;
                    AbstractC3981tw.f34496a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new C4035uw(null == true ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    C3550lw.f32621b.f32622a = applicationContext.getApplicationContext();
                    C3173ew c3173ew = C3173ew.f30553e;
                    if (!c3173ew.f30554a) {
                        C3388iw c3388iw = (C3388iw) c3173ew.f30557d;
                        if (z8) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(c3388iw);
                        }
                        c3388iw.f32027v = c3173ew;
                        c3388iw.f32025n = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        c3388iw.f32026u = runningAppProcessInfo.importance == 100;
                        c3173ew.f30555b = c3388iw.f32026u;
                        c3173ew.f30554a = true;
                    }
                    C3658nw.f33065d.f33066a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new Q0.d(5), intentFilter);
                }
                return Boolean.valueOf(o22.f26640u);
            default:
                int i = SN.f27536z;
                Context context6 = this.f31236u;
                C3675oC c3675oC = A.f23772G;
                synchronized (A.class) {
                    try {
                        if (A.f23777M == null) {
                            if (context6 != null) {
                                context2 = context6.getApplicationContext();
                            }
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            Long valueOf = Long.valueOf(com.anythink.basead.exoplayer.b.f6539b);
                            hashMap.put(2, valueOf);
                            hashMap.put(3, valueOf);
                            hashMap.put(4, valueOf);
                            hashMap.put(5, valueOf);
                            hashMap.put(10, valueOf);
                            hashMap.put(9, valueOf);
                            hashMap.put(7, valueOf);
                            A.f23777M = new A(context2, hashMap);
                        }
                        a9 = A.f23777M;
                    } finally {
                    }
                }
                return a9;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        ((InterfaceC2523Dk) obj).o(this.f31236u);
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo7l(Object obj) {
        if (((Boolean) AbstractC2530Ea.f24775j.r()).booleanValue()) {
            AbstractC3194fG.y(this.f31236u);
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        if (((Boolean) AbstractC2530Ea.f24774h.r()).booleanValue() && (th instanceof t2.m)) {
            AbstractC3194fG.y(this.f31236u);
        }
    }
}
