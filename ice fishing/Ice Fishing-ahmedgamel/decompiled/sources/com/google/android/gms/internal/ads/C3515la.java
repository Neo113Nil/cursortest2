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

/* renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3515la implements InterfaceC3231gB, InterfaceC3742pl, KD, InterfaceC3101dq {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31768n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f31769u;

    public /* synthetic */ C3515la(Context context, int i) {
        this.f31768n = i;
        this.f31769u = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        ((InterfaceC2541Ek) obj).n(this.f31769u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0294, code lost:
    
        if (new org.json.JSONObject(r6.getString("app_settings_json", "{}")).optBoolean("local_flags_enabled") != false) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a0 A[Catch: all -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0165, blocks: (B:51:0x015e, B:53:0x0162, B:55:0x0168, B:57:0x016c, B:58:0x016e, B:60:0x0180, B:61:0x0184, B:63:0x0186, B:80:0x01fe, B:81:0x0205, B:89:0x0237, B:95:0x02a0, B:107:0x02e8, B:108:0x02ef, B:137:0x02f1, B:138:0x02f8, B:66:0x019a, B:70:0x01b7, B:72:0x01c3, B:73:0x01cd, B:75:0x01d3, B:77:0x01e3, B:79:0x01fa, B:82:0x0208, B:84:0x020c, B:86:0x021c, B:88:0x0233, B:90:0x023f, B:93:0x0296, B:96:0x02a9, B:98:0x02b7, B:100:0x02c5, B:101:0x02cc, B:103:0x02da, B:105:0x02de, B:106:0x02e1, B:109:0x0250, B:111:0x025e, B:113:0x0266, B:116:0x0286, B:118:0x0289, B:124:0x029a, B:125:0x029d, B:128:0x01a0, B:130:0x01ad), top: B:50:0x015e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a9 A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #3 {all -> 0x01a7, blocks: (B:66:0x019a, B:70:0x01b7, B:72:0x01c3, B:73:0x01cd, B:75:0x01d3, B:77:0x01e3, B:79:0x01fa, B:82:0x0208, B:84:0x020c, B:86:0x021c, B:88:0x0233, B:90:0x023f, B:93:0x0296, B:96:0x02a9, B:98:0x02b7, B:100:0x02c5, B:101:0x02cc, B:103:0x02da, B:105:0x02de, B:106:0x02e1, B:109:0x0250, B:111:0x025e, B:113:0x0266, B:116:0x0286, B:118:0x0289, B:124:0x029a, B:125:0x029d, B:128:0x01a0, B:130:0x01ad, B:115:0x026a), top: B:65:0x019a, outer: #1, inners: #4 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15c() {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        B b9;
        Context context2 = null;
        switch (this.f31768n) {
            case 0:
                C3301ha c3301ha = AbstractC3569ma.f32192a;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = q2.r.f40207e.f40210c;
                Context context3 = this.f31769u;
                if (!sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31460c) {
                    synchronized (sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31458a) {
                        try {
                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31460c) {
                                if (!sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31461d) {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31461d = true;
                                }
                                sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.i = TextUtils.equals(context3.getPackageName(), "com.google.android.gms");
                                if (context3.getApplicationContext() != null) {
                                    context3 = context3.getApplicationContext();
                                }
                                sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g = context3;
                                try {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31463f = V2.c.a(context3).b(128, sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g.getPackageName()).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                try {
                                    Context context4 = sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g;
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
                                        V2 v22 = q2.r.f40207e.f40209b;
                                        sharedPreferences = V2.s(context4);
                                    } else {
                                        sharedPreferences = null;
                                    }
                                    if (sharedPreferences != null) {
                                        AbstractC3087db.f29779a.set(new C3407ja(sharedPreferencesOnSharedPreferenceChangeListenerC3461ka, sharedPreferences));
                                    }
                                    if (!sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.i) {
                                        C3493l5 c3493l5 = AbstractC2599Ia.f25518d;
                                        if (((Long) c3493l5.r()).longValue() > 0 && AbstractC2639Kg.B(sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g, "crash_without_write") >= ((Long) c3493l5.r()).longValue()) {
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31466j = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31460c = true;
                                        }
                                    }
                                    if (!sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.i) {
                                        C3493l5 c3493l52 = AbstractC2599Ia.f25520f;
                                        if (((Long) c3493l52.r()).longValue() > 0 && AbstractC2639Kg.B(sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g, "init_without_write") >= ((Long) c3493l52.r()).longValue()) {
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31466j = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31460c = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31461d = false;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31459b.open();
                                        }
                                    }
                                    Context context5 = sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g;
                                    if (!((Boolean) AbstractC2718Pa.f26831k.r()).booleanValue()) {
                                        if (((Boolean) AbstractC2718Pa.f26832l.r()).booleanValue() && (r6 = context5.getSharedPreferences("admob", 0)) != null) {
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
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31461d = false;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31459b.open();
                                        } else {
                                            q2.r rVar = q2.r.f40207e;
                                            V2 v23 = rVar.f40209b;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31462e = V2.s(context4);
                                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.i && ((Boolean) AbstractC2718Pa.f26826e.r()).booleanValue()) {
                                                rVar.f40211d.a(sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g);
                                            }
                                            if (!((Boolean) AbstractC2718Pa.f26824c.r()).booleanValue() && (sharedPreferences2 = sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31462e) != null) {
                                                sharedPreferences2.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC3461ka);
                                            }
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.c(sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31462e);
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31460c = true;
                                        }
                                    }
                                    context4 = sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31464g;
                                    if (context4 != null) {
                                    }
                                } finally {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31461d = false;
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.f31459b.open();
                                }
                            }
                        } finally {
                        }
                    }
                }
                return null;
            case 3:
                R2 r22 = MA.f26253E;
                if (r22.f27159u) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.f31769u.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!r22.f27159u) {
                    r22.f27159u = true;
                    C3483kw b10 = C3483kw.b();
                    b10.getClass();
                    b10.f31668b = new C3001bw(new Handler(), applicationContext, b10);
                    C3107dw c3107dw = C3107dw.f29860w;
                    boolean z3 = applicationContext instanceof Application;
                    if (z3) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(c3107dw);
                    }
                    AbstractC3043cl.f29571P = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = AbstractC3914sw.f34168a;
                    AbstractC3914sw.f34170c = applicationContext.getResources().getDisplayMetrics().density;
                    AbstractC3914sw.f34168a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new C3968tw(null == true ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    C3429jw.f31350b.f31351a = applicationContext.getApplicationContext();
                    C3054cw c3054cw = C3054cw.f29643e;
                    if (!c3054cw.f29644a) {
                        C3269gw c3269gw = (C3269gw) c3054cw.f29647d;
                        if (z3) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(c3269gw);
                        }
                        c3269gw.f30678v = c3054cw;
                        c3269gw.f30676n = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        c3269gw.f30677u = runningAppProcessInfo.importance == 100;
                        c3054cw.f29645b = c3269gw.f30677u;
                        c3054cw.f29644a = true;
                    }
                    C3537lw.f31865d.f31866a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new Q0.d(5), intentFilter);
                }
                return Boolean.valueOf(r22.f27159u);
            default:
                int i = EN.f24583A;
                Context context6 = this.f31769u;
                C3500lC c3500lC = B.f23777G;
                synchronized (B.class) {
                    try {
                        if (B.f23782M == null) {
                            if (context6 != null) {
                                context2 = context6.getApplicationContext();
                            }
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            Long valueOf = Long.valueOf(com.anythink.basead.exoplayer.b.f6382b);
                            hashMap.put(2, valueOf);
                            hashMap.put(3, valueOf);
                            hashMap.put(4, valueOf);
                            hashMap.put(5, valueOf);
                            hashMap.put(10, valueOf);
                            hashMap.put(9, valueOf);
                            hashMap.put(7, valueOf);
                            B.f23782M = new B(context2, hashMap);
                        }
                        b9 = B.f23782M;
                    } finally {
                    }
                }
                return b9;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void mo11n(Object obj) {
        if (((Boolean) AbstractC2599Ia.f25523j.r()).booleanValue()) {
            AbstractC2639Kg.A(this.f31769u);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        if (((Boolean) AbstractC2599Ia.f25522h.r()).booleanValue() && (th instanceof u2.l)) {
            AbstractC2639Kg.A(this.f31769u);
        }
    }
}
