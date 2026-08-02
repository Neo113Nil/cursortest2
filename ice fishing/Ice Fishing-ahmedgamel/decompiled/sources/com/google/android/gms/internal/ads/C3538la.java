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
public final /* synthetic */ class C3538la implements InterfaceC3254gB, InterfaceC3765pl, KD, InterfaceC3124dq {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32547n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f32548u;

    public /* synthetic */ C3538la(Context context, int i) {
        this.f32547n = i;
        this.f32548u = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        ((InterfaceC2561Ek) obj).n(this.f32548u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0294, code lost:
    
        if (new org.json.JSONObject(r6.getString("app_settings_json", "{}")).optBoolean("local_flags_enabled") != false) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a0 A[Catch: all -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0165, blocks: (B:51:0x015e, B:53:0x0162, B:55:0x0168, B:57:0x016c, B:58:0x016e, B:60:0x0180, B:61:0x0184, B:63:0x0186, B:80:0x01fe, B:81:0x0205, B:89:0x0237, B:95:0x02a0, B:107:0x02e8, B:108:0x02ef, B:137:0x02f1, B:138:0x02f8, B:66:0x019a, B:70:0x01b7, B:72:0x01c3, B:73:0x01cd, B:75:0x01d3, B:77:0x01e3, B:79:0x01fa, B:82:0x0208, B:84:0x020c, B:86:0x021c, B:88:0x0233, B:90:0x023f, B:93:0x0296, B:96:0x02a9, B:98:0x02b7, B:100:0x02c5, B:101:0x02cc, B:103:0x02da, B:105:0x02de, B:106:0x02e1, B:109:0x0250, B:111:0x025e, B:113:0x0266, B:116:0x0286, B:118:0x0289, B:124:0x029a, B:125:0x029d, B:128:0x01a0, B:130:0x01ad), top: B:50:0x015e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a9 A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #3 {all -> 0x01a7, blocks: (B:66:0x019a, B:70:0x01b7, B:72:0x01c3, B:73:0x01cd, B:75:0x01d3, B:77:0x01e3, B:79:0x01fa, B:82:0x0208, B:84:0x020c, B:86:0x021c, B:88:0x0233, B:90:0x023f, B:93:0x0296, B:96:0x02a9, B:98:0x02b7, B:100:0x02c5, B:101:0x02cc, B:103:0x02da, B:105:0x02de, B:106:0x02e1, B:109:0x0250, B:111:0x025e, B:113:0x0266, B:116:0x0286, B:118:0x0289, B:124:0x029a, B:125:0x029d, B:128:0x01a0, B:130:0x01ad, B:115:0x026a), top: B:65:0x019a, outer: #1, inners: #4 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo14c() {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        B b9;
        Context context2 = null;
        switch (this.f32547n) {
            case 0:
                C3324ha c3324ha = AbstractC3592ma.f32971a;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = s2.r.f40506e.f40509c;
                Context context3 = this.f32548u;
                if (!sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32237c) {
                    synchronized (sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32235a) {
                        try {
                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32237c) {
                                if (!sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32238d) {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32238d = true;
                                }
                                sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.i = TextUtils.equals(context3.getPackageName(), "com.google.android.gms");
                                if (context3.getApplicationContext() != null) {
                                    context3 = context3.getApplicationContext();
                                }
                                sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g = context3;
                                try {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32240f = X2.b.a(context3).f(128, sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g.getPackageName()).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                try {
                                    Context context4 = sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g;
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
                                        V2 v22 = s2.r.f40506e.f40508b;
                                        sharedPreferences = V2.s(context4);
                                    } else {
                                        sharedPreferences = null;
                                    }
                                    if (sharedPreferences != null) {
                                        AbstractC3110db.f30552a.set(new C3430ja(sharedPreferencesOnSharedPreferenceChangeListenerC3484ka, sharedPreferences));
                                    }
                                    if (!sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.i) {
                                        C3516l5 c3516l5 = AbstractC2619Ia.f26267d;
                                        if (((Long) c3516l5.r()).longValue() > 0 && AbstractC2659Kg.B(sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g, "crash_without_write") >= ((Long) c3516l5.r()).longValue()) {
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32243j = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32237c = true;
                                        }
                                    }
                                    if (!sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.i) {
                                        C3516l5 c3516l52 = AbstractC2619Ia.f26269f;
                                        if (((Long) c3516l52.r()).longValue() > 0 && AbstractC2659Kg.B(sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g, "init_without_write") >= ((Long) c3516l52.r()).longValue()) {
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32243j = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32237c = true;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32238d = false;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32236b.open();
                                        }
                                    }
                                    Context context5 = sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g;
                                    if (!((Boolean) AbstractC2738Pa.f27619k.r()).booleanValue()) {
                                        if (((Boolean) AbstractC2738Pa.f27620l.r()).booleanValue() && (r6 = context5.getSharedPreferences("admob", 0)) != null) {
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
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32238d = false;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32236b.open();
                                        } else {
                                            s2.r rVar = s2.r.f40506e;
                                            V2 v23 = rVar.f40508b;
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32239e = V2.s(context4);
                                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.i && ((Boolean) AbstractC2738Pa.f27614e.r()).booleanValue()) {
                                                rVar.f40510d.a(sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g);
                                            }
                                            if (!((Boolean) AbstractC2738Pa.f27612c.r()).booleanValue() && (sharedPreferences2 = sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32239e) != null) {
                                                sharedPreferences2.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC3484ka);
                                            }
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.c(sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32239e);
                                            sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32237c = true;
                                        }
                                    }
                                    context4 = sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32241g;
                                    if (context4 != null) {
                                    }
                                } finally {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32238d = false;
                                    sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.f32236b.open();
                                }
                            }
                        } finally {
                        }
                    }
                }
                return null;
            case 3:
                R2 r22 = MA.f27044E;
                if (r22.f27915u) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.f32548u.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!r22.f27915u) {
                    r22.f27915u = true;
                    C3560lw b10 = C3560lw.b();
                    b10.getClass();
                    b10.f32647b = new C3077cw(new Handler(), applicationContext, b10);
                    C3184ew c3184ew = C3184ew.f30790w;
                    boolean z6 = applicationContext instanceof Application;
                    if (z6) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(c3184ew);
                    }
                    AbstractC3066cl.f30356P = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = AbstractC3937sw.f34954a;
                    AbstractC3937sw.f34956c = applicationContext.getResources().getDisplayMetrics().density;
                    AbstractC3937sw.f34954a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new C3991tw(null == true ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    C3506kw.f32448b.f32449a = applicationContext.getApplicationContext();
                    C3130dw c3130dw = C3130dw.f30648e;
                    if (!c3130dw.f30649a) {
                        C3346hw c3346hw = (C3346hw) c3130dw.f30652d;
                        if (z6) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(c3346hw);
                        }
                        c3346hw.f31746v = c3130dw;
                        c3346hw.f31744n = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        c3346hw.f31745u = runningAppProcessInfo.importance == 100;
                        c3130dw.f30650b = c3346hw.f31745u;
                        c3130dw.f30649a = true;
                    }
                    C3614mw.f33405d.f33406a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new Q0.d(5), intentFilter);
                }
                return Boolean.valueOf(r22.f27915u);
            default:
                int i = EN.f25344A;
                Context context6 = this.f32548u;
                C3523lC c3523lC = B.f24549G;
                synchronized (B.class) {
                    try {
                        if (B.f24554M == null) {
                            if (context6 != null) {
                                context2 = context6.getApplicationContext();
                            }
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            Long valueOf = Long.valueOf(com.anythink.basead.exoplayer.b.f7168b);
                            hashMap.put(2, valueOf);
                            hashMap.put(3, valueOf);
                            hashMap.put(4, valueOf);
                            hashMap.put(5, valueOf);
                            hashMap.put(10, valueOf);
                            hashMap.put(9, valueOf);
                            hashMap.put(7, valueOf);
                            B.f24554M = new B(context2, hashMap);
                        }
                        b9 = B.f24554M;
                    } finally {
                    }
                }
                return b9;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void mo10n(Object obj) {
        if (((Boolean) AbstractC2619Ia.f26272j.r()).booleanValue()) {
            AbstractC2659Kg.A(this.f32548u);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        if (((Boolean) AbstractC2619Ia.f26271h.r()).booleanValue() && (th instanceof w2.l)) {
            AbstractC2659Kg.A(this.f32548u);
        }
    }
}
