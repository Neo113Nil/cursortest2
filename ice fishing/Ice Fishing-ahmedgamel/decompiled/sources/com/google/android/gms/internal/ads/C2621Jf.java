package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.Jf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2621Jf {

    /* renamed from: e, reason: collision with root package name */
    public C3153eo f25710e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f25706a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f25707b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public String f25708c = null;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25709d = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f25711f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f25712g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f25713h = new AtomicReference(null);
    public final ConcurrentHashMap i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    public final Object f25714j = new Object();

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean g(Context context) {
        C3301ha c3301ha = AbstractC3569ma.f32133T0;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            int a9 = X2.c.a(context);
            C3301ha c3301ha2 = AbstractC3569ma.f32142U0;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (a9 >= ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue()) {
                if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32150V0)).booleanValue()) {
                    return true;
                }
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(Context context) {
        int c9;
        C3301ha c3301ha = AbstractC3569ma.f32063L0;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && !this.f25709d.get()) {
            if (!((Boolean) rVar.f40210c.a(AbstractC3569ma.f32159W0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f25711f;
                if (atomicInteger.get() == -1) {
                    v2.d dVar = C4900p.f40199g.f40200a;
                    M2.f fVar = M2.f.f1844b;
                    if (fVar.c(context, 12451000) != 0 && ((c9 = fVar.c(context, 12451000)) == 0 || c9 == 2)) {
                        int i = u2.z.f41322b;
                        v2.i.f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final String b(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f25707b) {
            try {
                String str = this.f25708c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) k(context, "getGmpAppId");
                this.f25708c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String c(Context context) {
        if (a(context)) {
            C3301ha c3301ha = AbstractC3569ma.f32115R0;
            q2.r rVar = q2.r.f40207e;
            long longValue = ((Long) rVar.f40210c.a(c3301ha)).longValue();
            if (longValue < 0) {
                return (String) k(context, "getAppInstanceId");
            }
            AtomicReference atomicReference = this.f25706a;
            if (atomicReference.get() == null) {
                C3301ha c3301ha2 = AbstractC3569ma.f32124S0;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC2604If(this));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new C2.x(4, this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String d(Context context) {
        Object k9;
        if (a(context) && (k9 = k(context, "generateEventId")) != null) {
            return k9.toString();
        }
        return null;
    }

    public final void e(Context context, String str, String str2, String str3, int i) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            h(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            u2.z.k(sb.toString());
        }
    }

    public final void h(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e9) {
                String valueOf = String.valueOf(str2);
                int i = u2.z.f41322b;
                v2.i.d("Invalid event ID: ".concat(valueOf), e9);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f25712g;
            if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.i;
                Method method = (Method) concurrentHashMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        l("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    l("logEventInternal", true);
                }
            }
        }
    }

    public final Method i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.i;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            l(str, false);
            return null;
        }
    }

    public final void j(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f25712g;
        if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.i;
            Method method = (Method) concurrentHashMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, method);
                } catch (Exception unused) {
                    l(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(atomicReference.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                u2.z.k(sb.toString());
            } catch (Exception unused2) {
                l(str2, false);
            }
        }
    }

    public final Object k(Context context, String str) {
        AtomicReference atomicReference = this.f25712g;
        if (!m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            l(str, true);
            return null;
        }
    }

    public final void l(String str, boolean z3) {
        AtomicBoolean atomicBoolean = this.f25709d;
        if (atomicBoolean.get()) {
            return;
        }
        String s9 = D.y.s(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
        int i = u2.z.f41322b;
        v2.i.f(s9);
        if (z3) {
            v2.i.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
        if (this.f25710e != null) {
            if (this.f25713h.get() == null && this.f25712g.get() == null) {
                return;
            }
            S0.e a9 = this.f25710e.a();
            a9.v(NativeAdvancedJsUtils.f17906p, "ga_log_event_error");
            a9.v("method_name", str);
            a9.y();
        }
    }

    public final boolean m(Context context, String str, AtomicReference atomicReference, boolean z3) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object invoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, invoke) && atomicReference.get() == null) {
            }
            return true;
        } catch (Exception unused) {
            l("getInstance", z3);
            return false;
        }
    }
}
