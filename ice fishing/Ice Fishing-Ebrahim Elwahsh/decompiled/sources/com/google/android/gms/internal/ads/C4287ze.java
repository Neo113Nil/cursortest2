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
import com.google.android.gms.internal.consent_sdk.C4313b;
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
import q2.C4907p;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4287ze implements InterfaceC2466Ae {

    /* renamed from: E, reason: collision with root package name */
    public static final Object f35563E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static InterfaceC2466Ae f35564F;

    /* renamed from: G, reason: collision with root package name */
    public static InterfaceC2466Ae f35565G;

    /* renamed from: H, reason: collision with root package name */
    public static InterfaceC2466Ae f35566H;

    /* renamed from: I, reason: collision with root package name */
    public static Boolean f35567I;

    /* renamed from: A, reason: collision with root package name */
    public Object f35568A;

    /* renamed from: B, reason: collision with root package name */
    public Object f35569B;

    /* renamed from: C, reason: collision with root package name */
    public Object f35570C;

    /* renamed from: D, reason: collision with root package name */
    public Object f35571D;

    /* renamed from: n, reason: collision with root package name */
    public final Context f35572n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35573u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f35574v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f35575w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f35576x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f35577y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f35578z;

    public C4287ze(Context context, C2478Aq c2478Aq, C2777Sj c2777Sj, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f35572n = applicationContext;
        this.f35574v = c2478Aq;
        this.f35571D = c2777Sj;
        this.f35570C = audioDeviceInfo;
        String str = AbstractC3548lu.f32613a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f35575w = handler;
        this.f35576x = new YO(this);
        this.f35577y = new Q0.d(this);
        C3675oC c3675oC = XO.f28641e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f35578z = uriFor != null ? new ZO(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static InterfaceC2466Ae a(Context context) {
        synchronized (f35563E) {
            try {
                if (f35564F == null) {
                    if (h(context)) {
                        f35564F = new C4287ze(context, C5107a.a());
                    } else {
                        f35564F = new C2837Wb(15);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f35564F;
    }

    public static InterfaceC2466Ae b(Context context, C5107a c5107a) {
        synchronized (f35563E) {
            try {
                if (f35566H == null) {
                    boolean z8 = false;
                    if (((Boolean) AbstractC2530Ea.f24769c.r()).booleanValue()) {
                        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.z8)).booleanValue() || ((Boolean) AbstractC2530Ea.f24767a.r()).booleanValue()) {
                            z8 = true;
                        }
                    }
                    if (h(context)) {
                        C4287ze c4287ze = new C4287ze(context, c5107a);
                        c4287ze.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C4233ye(c4287ze, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f35566H = c4287ze;
                    } else if (!z8 || context == null) {
                        f35566H = new C2837Wb(15);
                    } else {
                        C4287ze c4287ze2 = new C4287ze(context, c5107a);
                        c4287ze2.f35573u = true;
                        c4287ze2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new C4233ye(c4287ze2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        f35566H = c4287ze2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f35566H;
    }

    public static InterfaceC2466Ae c(Context context) {
        synchronized (f35563E) {
            try {
                if (f35565G == null) {
                    C3151ea c3151ea = AbstractC3368ia.A8;
                    q2.r rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.z8)).booleanValue() && context != null) {
                            f35565G = new C4287ze(context, C5107a.a());
                        }
                    }
                    f35565G = new C2837Wb(15);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f35565G;
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (f35563E) {
                try {
                    if (f35567I == null) {
                        f35567I = Boolean.valueOf(C4907p.f40108g.f40113e.nextInt(100) < ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.he)).intValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (f35567I.booleanValue()) {
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.z8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2466Ae
    public void e(String str, Throwable th) {
        if (this.f35573u) {
            return;
        }
        f(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2466Ae
    public void f(Throwable th, String str, float f6) {
        Throwable th2;
        String str2;
        boolean z8;
        String str3;
        PackageInfo e6;
        ActivityManager.MemoryInfo i;
        Context context = this.f35572n;
        if (this.f35573u) {
            return;
        }
        Z2.e eVar = u2.d.f41224b;
        if (((Boolean) AbstractC2802Ua.f28039e.r()).booleanValue()) {
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
                boolean z9 = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31627b3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && u2.d.o(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (u2.d.o(stackTraceElement.getClassName())) {
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
            String d2 = d(th);
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Y9)).booleanValue() || (str2 = u2.d.d(d(th), "SHA-256")) == null) {
                str2 = "";
            }
            double d3 = f6;
            double random = Math.random();
            int i4 = f6 > 0.0f ? (int) (1.0f / f6) : 1;
            if (random < d3) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z8 = U2.c.a(context).f();
                } catch (Throwable th5) {
                    u2.i.d("Error fetching instant app info", th5);
                    z8 = false;
                }
                try {
                    str3 = context.getPackageName();
                } catch (Throwable unused) {
                    u2.i.f("Cannot obtain package name, proceeding.");
                    str3 = com.anythink.core.common.v.m.f16967e;
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z8)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i9 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i9));
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                if (!str5.startsWith(str4)) {
                    str5 = D.y.o(new StringBuilder(String.valueOf(str4).length() + 1 + str5.length()), str4, " ", str5);
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str5);
                C5107a c5107a = (C5107a) this.f35577y;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", c5107a.f41217n).appendQueryParameter("appid", str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", d2);
                q2.r rVar = q2.r.f40116e;
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", rVar.f40117a.B())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "910357297").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i4)).appendQueryParameter("pb_tm", String.valueOf(AbstractC2802Ua.f28037c.r()));
                L2.f.f1726b.getClass();
                Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(L2.f.a(context))).appendQueryParameter("lite", true != c5107a.f41221x ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    appendQueryParameter6.appendQueryParameter("hash", str2);
                }
                C3151ea c3151ea = AbstractC3368ia.G8;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue() && (i = u2.d.i(context)) != null) {
                    appendQueryParameter6.appendQueryParameter("available_memory", Long.toString(i.availMem));
                    appendQueryParameter6.appendQueryParameter("total_memory", Long.toString(i.totalMem));
                    appendQueryParameter6.appendQueryParameter("is_low_memory", true != i.lowMemory ? "0" : "1");
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.F8)).booleanValue()) {
                    String str6 = (String) this.f35568A;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter6.appendQueryParameter("countrycode", str6);
                    }
                    String str7 = (String) this.f35569B;
                    if (!TextUtils.isEmpty(str7)) {
                        appendQueryParameter6.appendQueryParameter("psv", str7);
                    }
                    if (i9 >= 26) {
                        e6 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                e6 = U2.c.a(context).e(128, "com.android.webview");
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        e6 = null;
                    }
                    if (e6 != null) {
                        appendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(e6.versionCode));
                        appendQueryParameter6.appendQueryParameter("wvvn", e6.versionName);
                        appendQueryParameter6.appendQueryParameter("wvpn", e6.packageName);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f35578z;
                if (packageInfo != null) {
                    appendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Tc)).booleanValue()) {
                    String j9 = u2.d.j(context);
                    appendQueryParameter6.appendQueryParameter("uev", j9 != null ? j9 : "");
                }
                arrayList2.add(appendQueryParameter6.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ExecutorService) this.f35576x).execute(new MD(10, new u2.l(context, null), (String) it.next()));
                }
            }
        }
    }

    public void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean z8 = false;
            boolean z9 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z8 |= u2.d.o(stackTraceElement.getClassName());
                    z9 |= C4287ze.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.B8)).intValue();
            if (intValue > 0) {
                HashSet hashSet = (HashSet) this.f35571D;
                if (hashSet.size() >= intValue) {
                    return;
                }
                String d2 = u2.d.d(d(th), "SHA-256");
                if (d2 == null) {
                    d2 = "";
                }
                if (hashSet.contains(d2)) {
                    return;
                } else {
                    hashSet.add(d2);
                }
            }
            if (!z8 || z9) {
                return;
            }
            if (!this.f35573u) {
                e("", th);
            }
            if (((AtomicBoolean) this.f35570C).getAndSet(true) || !((Boolean) AbstractC2530Ea.f24769c.r()).booleanValue() || (sharedPreferences = (context = this.f35572n).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", AbstractC3194fG.A(context, "crash_without_write") + 1).commit();
        }
    }

    public void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f35574v) {
            ((WeakHashMap) this.f35575w).put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C4233ye(this, thread.getUncaughtExceptionHandler(), 1));
    }

    public List j() {
        L l9;
        if (Build.VERSION.SDK_INT >= 32 && (l9 = (L) this.f35568A) != null) {
            return l9.a();
        }
        SB sb = UB.f27942u;
        return C3675oC.f33115x;
    }

    public void k(XO xo) {
        if (!this.f35573u || xo.equals((XO) this.f35569B)) {
            return;
        }
        this.f35569B = xo;
        C4313b c4313b = (C4313b) ((C2478Aq) this.f35574v).f23905u;
        c4313b.i();
        XO xo2 = (XO) c4313b.f35815e;
        if (xo2 == null || xo.equals(xo2)) {
            return;
        }
        c4313b.f35815e = xo;
        C3759pp c3759pp = (C3759pp) c4313b.f35813c;
        if (c3759pp != null) {
            c3759pp.c(-1, C3796qP.f33727y);
            c3759pp.d();
        }
    }

    public void l() {
        List j9 = j();
        C2777Sj c2777Sj = (C2777Sj) this.f35571D;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f35570C;
        C3675oC c3675oC = XO.f28641e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f35572n;
        k(XO.a(context, context.registerReceiver(null, intentFilter), c2777Sj, audioDeviceInfo, j9));
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
    public C4287ze(Context context, C5107a c5107a) {
        PackageInfo packageInfo;
        C3151ea c3151ea;
        q2.r rVar;
        String str;
        this.f35574v = new Object();
        this.f35575w = new WeakHashMap();
        this.f35576x = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC3062cu()));
        this.f35570C = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f35572n = context;
        this.f35577y = c5107a;
        String str2 = null;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.S8)).booleanValue()) {
            Z2.e eVar = u2.d.f41224b;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = U2.c.a(context).e(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.f35578z = packageInfo;
                c3151ea = AbstractC3368ia.F8;
                rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    str = com.anythink.core.common.v.m.f16967e;
                } else {
                    Z2.e eVar2 = u2.d.f41224b;
                    str = Locale.getDefault().getCountry();
                }
                this.f35568A = str;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    str2 = com.anythink.core.common.v.m.f16967e;
                } else {
                    Context context2 = this.f35572n;
                    Z2.e eVar3 = u2.d.f41224b;
                    if (context2 != null) {
                        try {
                            PackageInfo e6 = U2.c.a(context2).e(128, "com.android.vending");
                            if (e6 != null) {
                                str2 = Integer.toString(e6.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.f35569B = str2;
                if (((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.B8)).intValue() <= 0) {
                    this.f35571D = new HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.f35578z = packageInfo;
        c3151ea = AbstractC3368ia.F8;
        rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
        }
        this.f35568A = str;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
        }
        this.f35569B = str2;
        if (((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.B8)).intValue() <= 0) {
        }
    }
}
