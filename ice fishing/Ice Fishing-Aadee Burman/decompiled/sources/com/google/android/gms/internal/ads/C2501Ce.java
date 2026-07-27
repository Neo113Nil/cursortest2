package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C4900p;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2501Ce implements InterfaceC2518De {

    /* renamed from: E, reason: collision with root package name */
    public static final Object f24164E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static InterfaceC2518De f24165F;

    /* renamed from: G, reason: collision with root package name */
    public static InterfaceC2518De f24166G;

    /* renamed from: H, reason: collision with root package name */
    public static InterfaceC2518De f24167H;

    /* renamed from: I, reason: collision with root package name */
    public static Boolean f24168I;

    /* renamed from: A, reason: collision with root package name */
    public Object f24169A;

    /* renamed from: B, reason: collision with root package name */
    public Object f24170B;

    /* renamed from: C, reason: collision with root package name */
    public Object f24171C;

    /* renamed from: D, reason: collision with root package name */
    public Object f24172D;

    /* renamed from: n, reason: collision with root package name */
    public final Context f24173n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24174u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f24175v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f24176w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f24177x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f24178y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f24179z;

    public C2501Ce(Context context, C4178xq c4178xq, C2744Qj c2744Qj, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f24173n = applicationContext;
        this.f24175v = c4178xq;
        this.f24172D = c2744Qj;
        this.f24171C = audioDeviceInfo;
        String str = AbstractC3159eu.f29993a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f24176w = handler;
        this.f24177x = new LO(this);
        this.f24178y = new Q0.d(this);
        C3500lC c3500lC = KO.f25915e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f24179z = uriFor != null ? new MO(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static InterfaceC2518De a(Context context) {
        synchronized (f24164E) {
            try {
                if (f24165F == null) {
                    if (h(context)) {
                        f24165F = new C2501Ce(context, C5110a.a());
                    } else {
                        f24165F = new C2866Yb(15);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24165F;
    }

    public static InterfaceC2518De b(Context context, C5110a c5110a) {
        synchronized (f24164E) {
            try {
                if (f24167H == null) {
                    boolean z3 = false;
                    if (((Boolean) AbstractC2599Ia.f25517c.r()).booleanValue()) {
                        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32432z8)).booleanValue() || ((Boolean) AbstractC2599Ia.f25515a.r()).booleanValue()) {
                            z3 = true;
                        }
                    }
                    if (h(context)) {
                        C2501Ce c2501Ce = new C2501Ce(context, c5110a);
                        c2501Ce.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C2484Be(c2501Ce, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f24167H = c2501Ce;
                    } else if (!z3 || context == null) {
                        f24167H = new C2866Yb(15);
                    } else {
                        C2501Ce c2501Ce2 = new C2501Ce(context, c5110a);
                        c2501Ce2.f24174u = true;
                        c2501Ce2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C2484Be(c2501Ce2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f24167H = c2501Ce2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24167H;
    }

    public static InterfaceC2518De c(Context context) {
        synchronized (f24164E) {
            try {
                if (f24166G == null) {
                    C3301ha c3301ha = AbstractC3569ma.f31977A8;
                    q2.r rVar = q2.r.f40204e;
                    if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                        if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.f32432z8)).booleanValue() && context != null) {
                            f24166G = new C2501Ce(context, C5110a.a());
                        }
                    }
                    f24166G = new C2866Yb(15);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24166G;
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (f24164E) {
                try {
                    if (f24168I == null) {
                        f24168I = Boolean.valueOf(C4900p.f40196g.f40201e.nextInt(100) < ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.he)).intValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (f24168I.booleanValue()) {
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32432z8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2518De
    public void e(String str, Throwable th) {
        if (this.f24174u) {
            return;
        }
        f(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2518De
    public void f(Throwable th, String str, float f3) {
        Throwable th2;
        String str2;
        boolean z3;
        String str3;
        PackageInfo c9;
        ActivityManager.MemoryInfo i;
        Context context = this.f24173n;
        if (this.f24174u) {
            return;
        }
        a3.e eVar = v2.d.f41395b;
        if (((Boolean) AbstractC2865Ya.f28687e.r()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z6 = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32206b3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && v2.d.p(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (v2.d.p(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z6 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z6) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String d2 = d(th);
            if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Y9)).booleanValue() || (str2 = v2.d.d(d(th), "SHA-256")) == null) {
                str2 = "";
            }
            double d9 = f3;
            double random = Math.random();
            int i6 = f3 > 0.0f ? (int) (1.0f / f3) : 1;
            if (random < d9) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z3 = V2.c.a(context).d();
                } catch (Throwable th5) {
                    v2.i.d("Error fetching instant app info", th5);
                    z3 = false;
                }
                try {
                    str3 = context.getPackageName();
                } catch (Throwable unused) {
                    v2.i.f("Cannot obtain package name, proceeding.");
                    str3 = com.anythink.core.common.v.m.f16809e;
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z3)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i9 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i9));
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                if (!str5.startsWith(str4)) {
                    str5 = D.y.s(new StringBuilder(String.valueOf(str4).length() + 1 + str5.length()), str4, " ", str5);
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str5);
                C5110a c5110a = (C5110a) this.f24178y;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", c5110a.f41388n).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", d2);
                q2.r rVar = q2.r.f40204e;
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", rVar.f40205a.B())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "919173219").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i6)).appendQueryParameter("pb_tm", String.valueOf(AbstractC2865Ya.f28685c.r()));
                M2.f.f1844b.getClass();
                Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(M2.f.a(context))).appendQueryParameter("lite", true != c5110a.f41392x ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    appendQueryParameter6.appendQueryParameter("hash", str2);
                }
                C3301ha c3301ha = AbstractC3569ma.G8;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue() && (i = v2.d.i(context)) != null) {
                    appendQueryParameter6.appendQueryParameter("available_memory", Long.toString(i.availMem));
                    appendQueryParameter6.appendQueryParameter("total_memory", Long.toString(i.totalMem));
                    appendQueryParameter6.appendQueryParameter("is_low_memory", true != i.lowMemory ? "0" : "1");
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.F8)).booleanValue()) {
                    String str6 = (String) this.f24169A;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter6.appendQueryParameter("countrycode", str6);
                    }
                    String str7 = (String) this.f24170B;
                    if (!TextUtils.isEmpty(str7)) {
                        appendQueryParameter6.appendQueryParameter("psv", str7);
                    }
                    if (i9 >= 26) {
                        c9 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                c9 = V2.c.a(context).c(128, "com.android.webview");
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        c9 = null;
                    }
                    if (c9 != null) {
                        appendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(c9.versionCode));
                        appendQueryParameter6.appendQueryParameter("wvvn", c9.versionName);
                        appendQueryParameter6.appendQueryParameter("wvpn", c9.packageName);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f24179z;
                if (packageInfo != null) {
                    appendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Tc)).booleanValue()) {
                    String j6 = v2.d.j(context);
                    appendQueryParameter6.appendQueryParameter("uev", j6 != null ? j6 : "");
                }
                arrayList2.add(appendQueryParameter6.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ExecutorService) this.f24177x).execute(new RunnableC3973u0(9, new v2.l(context, null), (String) it.next()));
                }
            }
        }
    }

    public void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean z3 = false;
            boolean z6 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z3 |= v2.d.p(stackTraceElement.getClassName());
                    z6 |= C2501Ce.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31987B8)).intValue();
            if (intValue > 0) {
                HashSet hashSet = (HashSet) this.f24172D;
                if (hashSet.size() >= intValue) {
                    return;
                }
                String d2 = v2.d.d(d(th), "SHA-256");
                if (d2 == null) {
                    d2 = "";
                }
                if (hashSet.contains(d2)) {
                    return;
                } else {
                    hashSet.add(d2);
                }
            }
            if (!z3 || z6) {
                return;
            }
            if (!this.f24174u) {
                e("", th);
            }
            if (((AtomicBoolean) this.f24171C).getAndSet(true) || !((Boolean) AbstractC2599Ia.f25517c.r()).booleanValue() || (sharedPreferences = (context = this.f24173n).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", AbstractC2639Kg.B(context, "crash_without_write") + 1).commit();
        }
    }

    public void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f24175v) {
            ((WeakHashMap) this.f24176w).put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C2484Be(this, thread.getUncaughtExceptionHandler(), 1));
    }

    public List j() {
        M m4;
        if (Build.VERSION.SDK_INT >= 32 && (m4 = (M) this.f24169A) != null) {
            return m4.a();
        }
        PB pb = RB.f27177u;
        return C3500lC.f31745x;
    }

    public void k(KO ko) {
        if (!this.f24174u || ko.equals((KO) this.f24170B)) {
            return;
        }
        this.f24170B = ko;
        C4300b c4300b = (C4300b) ((C4178xq) this.f24175v).f35055u;
        c4300b.i();
        KO ko2 = (KO) c4300b.f35652e;
        if (ko2 == null || ko.equals(ko2)) {
            return;
        }
        c4300b.f35652e = ko;
        C3530lp c3530lp = (C3530lp) c4300b.f35650c;
        if (c3530lp != null) {
            c3530lp.c(-1, C3084dP.f29774y);
            c3530lp.d();
        }
    }

    public void l() {
        List j6 = j();
        C2744Qj c2744Qj = (C2744Qj) this.f24172D;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f24171C;
        C3500lC c3500lC = KO.f25915e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f24173n;
        k(KO.a(context, context.registerReceiver(null, intentFilter), c2744Qj, audioDeviceInfo, j6));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2501Ce(Context context, C5110a c5110a) {
        PackageInfo packageInfo;
        C3301ha c3301ha;
        q2.r rVar;
        String str;
        this.f24175v = new Object();
        this.f24176w = new WeakHashMap();
        this.f24177x = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new Pt()));
        this.f24171C = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f24173n = context;
        this.f24178y = c5110a;
        String str2 = null;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.S8)).booleanValue()) {
            a3.e eVar = v2.d.f41395b;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = V2.c.a(context).c(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.f24179z = packageInfo;
                c3301ha = AbstractC3569ma.F8;
                rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    str = com.anythink.core.common.v.m.f16809e;
                } else {
                    a3.e eVar2 = v2.d.f41395b;
                    str = Locale.getDefault().getCountry();
                }
                this.f24169A = str;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    str2 = com.anythink.core.common.v.m.f16809e;
                } else {
                    Context context2 = this.f24173n;
                    a3.e eVar3 = v2.d.f41395b;
                    if (context2 != null) {
                        try {
                            PackageInfo c9 = V2.c.a(context2).c(128, "com.android.vending");
                            if (c9 != null) {
                                str2 = Integer.toString(c9.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.f24170B = str2;
                if (((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31987B8)).intValue() <= 0) {
                    this.f24172D = new HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.f24179z = packageInfo;
        c3301ha = AbstractC3569ma.F8;
        rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
        }
        this.f24169A = str;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
        }
        this.f24170B = str2;
        if (((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31987B8)).intValue() <= 0) {
        }
    }
}
