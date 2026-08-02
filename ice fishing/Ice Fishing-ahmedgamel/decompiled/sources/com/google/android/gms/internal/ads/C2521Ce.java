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
import com.google.android.gms.internal.consent_sdk.C4323b;
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
import s2.C4949p;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2521Ce implements InterfaceC2538De {

    /* renamed from: E, reason: collision with root package name */
    public static final Object f24899E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static InterfaceC2538De f24900F;

    /* renamed from: G, reason: collision with root package name */
    public static InterfaceC2538De f24901G;

    /* renamed from: H, reason: collision with root package name */
    public static InterfaceC2538De f24902H;

    /* renamed from: I, reason: collision with root package name */
    public static Boolean f24903I;

    /* renamed from: A, reason: collision with root package name */
    public Object f24904A;

    /* renamed from: B, reason: collision with root package name */
    public Object f24905B;

    /* renamed from: C, reason: collision with root package name */
    public Object f24906C;

    /* renamed from: D, reason: collision with root package name */
    public Object f24907D;

    /* renamed from: n, reason: collision with root package name */
    public final Context f24908n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24909u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f24910v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f24911w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f24912x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f24913y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f24914z;

    public C2521Ce(Context context, C4201xq c4201xq, C2764Qj c2764Qj, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f24908n = applicationContext;
        this.f24910v = c4201xq;
        this.f24907D = c2764Qj;
        this.f24906C = audioDeviceInfo;
        String str = AbstractC3182eu.f30782a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f24911w = handler;
        this.f24912x = new LO(this);
        this.f24913y = new Q0.d(this);
        C3523lC c3523lC = KO.f26667e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f24914z = uriFor != null ? new MO(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static InterfaceC2538De a(Context context) {
        synchronized (f24899E) {
            try {
                if (f24900F == null) {
                    if (h(context)) {
                        f24900F = new C2521Ce(context, C5189a.a());
                    } else {
                        f24900F = new C2889Yb(15);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24900F;
    }

    public static InterfaceC2538De b(Context context, C5189a c5189a) {
        synchronized (f24899E) {
            try {
                if (f24902H == null) {
                    boolean z6 = false;
                    if (((Boolean) AbstractC2619Ia.f26266c.r()).booleanValue()) {
                        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33212z8)).booleanValue() || ((Boolean) AbstractC2619Ia.f26264a.r()).booleanValue()) {
                            z6 = true;
                        }
                    }
                    if (h(context)) {
                        C2521Ce c2521Ce = new C2521Ce(context, c5189a);
                        c2521Ce.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C2504Be(c2521Ce, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f24902H = c2521Ce;
                    } else if (!z6 || context == null) {
                        f24902H = new C2889Yb(15);
                    } else {
                        C2521Ce c2521Ce2 = new C2521Ce(context, c5189a);
                        c2521Ce2.f24909u = true;
                        c2521Ce2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C2504Be(c2521Ce2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f24902H = c2521Ce2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24902H;
    }

    public static InterfaceC2538De c(Context context) {
        synchronized (f24899E) {
            try {
                if (f24901G == null) {
                    C3324ha c3324ha = AbstractC3592ma.f32758A8;
                    s2.r rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f33212z8)).booleanValue() && context != null) {
                            f24901G = new C2521Ce(context, C5189a.a());
                        }
                    }
                    f24901G = new C2889Yb(15);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24901G;
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (f24899E) {
                try {
                    if (f24903I == null) {
                        f24903I = Boolean.valueOf(C4949p.f40498g.f40503e.nextInt(100) < ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.he)).intValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (f24903I.booleanValue()) {
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33212z8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2538De
    public void e(String str, Throwable th) {
        if (this.f24909u) {
            return;
        }
        f(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2538De
    public void f(Throwable th, String str, float f2) {
        Throwable th2;
        String str2;
        boolean z6;
        String str3;
        PackageInfo g9;
        ActivityManager.MemoryInfo i;
        Context context = this.f24908n;
        if (this.f24909u) {
            return;
        }
        c3.e eVar = x2.d.f41852b;
        if (((Boolean) AbstractC2888Ya.f29462e.r()).booleanValue()) {
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
                boolean z9 = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32985b3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && x2.d.p(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (x2.d.p(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z9 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z9) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String d9 = d(th);
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Y9)).booleanValue() || (str2 = x2.d.d(d(th), "SHA-256")) == null) {
                str2 = "";
            }
            double d10 = f2;
            double random = Math.random();
            int i4 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
            if (random < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z6 = X2.b.a(context).h();
                } catch (Throwable th5) {
                    x2.i.d("Error fetching instant app info", th5);
                    z6 = false;
                }
                try {
                    str3 = context.getPackageName();
                } catch (Throwable unused) {
                    x2.i.f("Cannot obtain package name, proceeding.");
                    str3 = com.anythink.core.common.v.m.f17596e;
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z6)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i6 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i6));
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                if (!str5.startsWith(str4)) {
                    str5 = D.x.p(new StringBuilder(String.valueOf(str4).length() + 1 + str5.length()), str4, " ", str5);
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str5);
                C5189a c5189a = (C5189a) this.f24913y;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", c5189a.f41845n).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", d9);
                s2.r rVar = s2.r.f40506e;
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", rVar.f40507a.A())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "919173219").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i4)).appendQueryParameter("pb_tm", String.valueOf(AbstractC2888Ya.f29460c.r()));
                O2.f.f2270b.getClass();
                Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(O2.f.a(context))).appendQueryParameter("lite", true != c5189a.f41849x ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    appendQueryParameter6.appendQueryParameter("hash", str2);
                }
                C3324ha c3324ha = AbstractC3592ma.G8;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue() && (i = x2.d.i(context)) != null) {
                    appendQueryParameter6.appendQueryParameter("available_memory", Long.toString(i.availMem));
                    appendQueryParameter6.appendQueryParameter("total_memory", Long.toString(i.totalMem));
                    appendQueryParameter6.appendQueryParameter("is_low_memory", true != i.lowMemory ? "0" : "1");
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.F8)).booleanValue()) {
                    String str6 = (String) this.f24904A;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter6.appendQueryParameter("countrycode", str6);
                    }
                    String str7 = (String) this.f24905B;
                    if (!TextUtils.isEmpty(str7)) {
                        appendQueryParameter6.appendQueryParameter("psv", str7);
                    }
                    if (i6 >= 26) {
                        g9 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                g9 = X2.b.a(context).g(128, "com.android.webview");
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        g9 = null;
                    }
                    if (g9 != null) {
                        appendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(g9.versionCode));
                        appendQueryParameter6.appendQueryParameter("wvvn", g9.versionName);
                        appendQueryParameter6.appendQueryParameter("wvpn", g9.packageName);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f24914z;
                if (packageInfo != null) {
                    appendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Tc)).booleanValue()) {
                    String j6 = x2.d.j(context);
                    appendQueryParameter6.appendQueryParameter("uev", j6 != null ? j6 : "");
                }
                arrayList2.add(appendQueryParameter6.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ExecutorService) this.f24912x).execute(new RunnableC3996u0(9, new x2.l(context, null), (String) it.next()));
                }
            }
        }
    }

    public void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean z6 = false;
            boolean z9 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z6 |= x2.d.p(stackTraceElement.getClassName());
                    z9 |= C2521Ce.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32767B8)).intValue();
            if (intValue > 0) {
                HashSet hashSet = (HashSet) this.f24907D;
                if (hashSet.size() >= intValue) {
                    return;
                }
                String d9 = x2.d.d(d(th), "SHA-256");
                if (d9 == null) {
                    d9 = "";
                }
                if (hashSet.contains(d9)) {
                    return;
                } else {
                    hashSet.add(d9);
                }
            }
            if (!z6 || z9) {
                return;
            }
            if (!this.f24909u) {
                e("", th);
            }
            if (((AtomicBoolean) this.f24906C).getAndSet(true) || !((Boolean) AbstractC2619Ia.f26266c.r()).booleanValue() || (sharedPreferences = (context = this.f24908n).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", AbstractC2659Kg.B(context, "crash_without_write") + 1).commit();
        }
    }

    public void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f24910v) {
            ((WeakHashMap) this.f24911w).put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C2504Be(this, thread.getUncaughtExceptionHandler(), 1));
    }

    public List j() {
        M m9;
        if (Build.VERSION.SDK_INT >= 32 && (m9 = (M) this.f24904A) != null) {
            return m9.a();
        }
        PB pb = RB.f27933u;
        return C3523lC.f32525x;
    }

    public void k(KO ko) {
        if (!this.f24909u || ko.equals((KO) this.f24905B)) {
            return;
        }
        this.f24905B = ko;
        C4323b c4323b = (C4323b) ((C4201xq) this.f24910v).f35841u;
        c4323b.i();
        KO ko2 = (KO) c4323b.f36421e;
        if (ko2 == null || ko.equals(ko2)) {
            return;
        }
        c4323b.f36421e = ko;
        C3553lp c3553lp = (C3553lp) c4323b.f36419c;
        if (c3553lp != null) {
            c3553lp.c(-1, C3107dP.f30546y);
            c3553lp.d();
        }
    }

    public void l() {
        List j6 = j();
        C2764Qj c2764Qj = (C2764Qj) this.f24907D;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f24906C;
        C3523lC c3523lC = KO.f26667e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f24908n;
        k(KO.a(context, context.registerReceiver(null, intentFilter), c2764Qj, audioDeviceInfo, j6));
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
    public C2521Ce(Context context, C5189a c5189a) {
        PackageInfo packageInfo;
        C3324ha c3324ha;
        s2.r rVar;
        String str;
        this.f24910v = new Object();
        this.f24911w = new WeakHashMap();
        this.f24912x = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new Pt()));
        this.f24906C = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f24908n = context;
        this.f24913y = c5189a;
        String str2 = null;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.S8)).booleanValue()) {
            c3.e eVar = x2.d.f41852b;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = X2.b.a(context).g(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.f24914z = packageInfo;
                c3324ha = AbstractC3592ma.F8;
                rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    str = com.anythink.core.common.v.m.f17596e;
                } else {
                    c3.e eVar2 = x2.d.f41852b;
                    str = Locale.getDefault().getCountry();
                }
                this.f24904A = str;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    str2 = com.anythink.core.common.v.m.f17596e;
                } else {
                    Context context2 = this.f24908n;
                    c3.e eVar3 = x2.d.f41852b;
                    if (context2 != null) {
                        try {
                            PackageInfo g9 = X2.b.a(context2).g(128, "com.android.vending");
                            if (g9 != null) {
                                str2 = Integer.toString(g9.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.f24905B = str2;
                if (((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32767B8)).intValue() <= 0) {
                    this.f24907D = new HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.f24914z = packageInfo;
        c3324ha = AbstractC3592ma.F8;
        rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
        }
        this.f24904A = str;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
        }
        this.f24905B = str2;
        if (((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32767B8)).intValue() <= 0) {
        }
    }
}
