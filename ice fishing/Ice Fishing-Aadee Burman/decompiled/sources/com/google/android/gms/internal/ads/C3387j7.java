package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.j7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3387j7 implements InterfaceC3335i7 {

    /* renamed from: P, reason: collision with root package name */
    public static volatile C4196y7 f31169P = null;

    /* renamed from: Q, reason: collision with root package name */
    public static final Object f31170Q = new Object();

    /* renamed from: R, reason: collision with root package name */
    public static boolean f31171R = false;

    /* renamed from: S, reason: collision with root package name */
    public static long f31172S;

    /* renamed from: T, reason: collision with root package name */
    public static C3657o7 f31173T;

    /* renamed from: U, reason: collision with root package name */
    public static E7 f31174U;

    /* renamed from: V, reason: collision with root package name */
    public static F0 f31175V;

    /* renamed from: W, reason: collision with root package name */
    public static C4274ze f31176W;

    /* renamed from: X, reason: collision with root package name */
    public static C3694or f31177X;

    /* renamed from: C, reason: collision with root package name */
    public double f31180C;

    /* renamed from: D, reason: collision with root package name */
    public double f31181D;

    /* renamed from: E, reason: collision with root package name */
    public double f31182E;

    /* renamed from: F, reason: collision with root package name */
    public float f31183F;

    /* renamed from: G, reason: collision with root package name */
    public float f31184G;

    /* renamed from: H, reason: collision with root package name */
    public float f31185H;

    /* renamed from: I, reason: collision with root package name */
    public float f31186I;

    /* renamed from: L, reason: collision with root package name */
    public final DisplayMetrics f31188L;

    /* renamed from: M, reason: collision with root package name */
    public final Qx f31189M;

    /* renamed from: N, reason: collision with root package name */
    public final com.bumptech.glide.manager.p f31190N;

    /* renamed from: O, reason: collision with root package name */
    public C7 f31191O;

    /* renamed from: n, reason: collision with root package name */
    public MotionEvent f31192n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedList f31193u = new LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public long f31194v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f31195w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f31196x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f31197y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f31198z = 0;

    /* renamed from: A, reason: collision with root package name */
    public long f31178A = 0;

    /* renamed from: B, reason: collision with root package name */
    public long f31179B = 0;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f31187K = false;

    public C3387j7(Context context, com.bumptech.glide.manager.p pVar) {
        try {
            Z6.a();
            this.f31188L = context.getResources().getDisplayMetrics();
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31991C3)).booleanValue()) {
                this.f31189M = new Qx(7);
            }
        } catch (Throwable unused) {
        }
        new HashMap();
        this.f31190N = pVar;
    }

    public static C4196y7 n(Context context, boolean z3) {
        if (f31169P == null) {
            synchronized (f31170Q) {
                try {
                    if (f31169P == null) {
                        C4196y7 a9 = C4196y7.a(context, z3, f31177X);
                        if (a9.f35107n) {
                            try {
                                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32273i4)).booleanValue()) {
                                    a9.c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            a9.c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.m4)).booleanValue()) {
                                a9.c("iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", new Class[0]);
                            }
                            a9.c("00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", Context.class);
                            a9.c("XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", Context.class);
                            a9.c("m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", Context.class);
                            a9.c("P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", Context.class);
                            Class cls = Boolean.TYPE;
                            a9.c("IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", Context.class, cls);
                            a9.c("GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", Context.class);
                            a9.c("2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", Context.class);
                            a9.c("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=", MotionEvent.class, DisplayMetrics.class);
                            a9.c("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=", MotionEvent.class, DisplayMetrics.class);
                            a9.c("y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", new Class[0]);
                            a9.c("9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", new Class[0]);
                            a9.c("XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", new Class[0]);
                            a9.c("c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", new Class[0]);
                            a9.c("AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", new Class[0]);
                            a9.c("Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", new Class[0]);
                            a9.c("Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", Context.class, cls, String.class);
                            a9.c("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", StackTraceElement[].class);
                            a9.c("K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", View.class, DisplayMetrics.class, cls, cls);
                            a9.c("NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", Context.class, cls);
                            a9.c("9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", View.class, Activity.class, cls);
                            Class cls2 = Long.TYPE;
                            a9.c("CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", cls2);
                            a9.c("PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", new Class[0]);
                            a9.c("sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", Context.class);
                            a9.c("Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", Context.class);
                            a9.c("0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", NetworkCapabilities.class, cls2, cls2);
                            a9.c("/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", List.class);
                            a9.c("4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", cls2, cls2, cls2, cls2);
                        }
                        f31169P = a9;
                    }
                } finally {
                }
            }
        }
        return f31169P;
    }

    public static C4250z7 p(C4196y7 c4196y7, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method d2 = c4196y7.d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (d2 == null || motionEvent == null) {
            throw new C3872s7();
        }
        try {
            return new C4250z7((String) d2.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new C3872s7(e9);
        }
    }

    public static final void r(List list) {
        ExecutorService executorService;
        if (f31169P == null || (executorService = f31169P.f35096b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32364s3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            char[] cArr = A7.f23634a;
            StringWriter stringWriter = new StringWriter();
            e9.printStackTrace(new PrintWriter(stringWriter));
            Log.d("j7", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final synchronized void a(int i, int i6, int i9) {
        try {
            if (this.f31192n != null) {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32335p3)).booleanValue()) {
                    m();
                } else {
                    this.f31192n.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f31188L;
            if (displayMetrics != null) {
                float f3 = displayMetrics.density;
                this.f31192n = MotionEvent.obtain(0L, i9, 1, i * f3, i6 * f3, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f31192n = null;
            }
            this.f31187K = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final synchronized void b(MotionEvent motionEvent) {
        Long l9;
        try {
            if (this.J) {
                m();
                this.J = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f31180C = 0.0d;
                this.f31181D = motionEvent.getRawX();
                this.f31182E = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d2 = rawX - this.f31181D;
                double d9 = rawY - this.f31182E;
                this.f31180C += Math.sqrt((d9 * d9) + (d2 * d2));
                this.f31181D = rawX;
                this.f31182E = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f31192n = obtain;
                        LinkedList linkedList = this.f31193u;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f31196x++;
                        this.f31198z = l(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f31195w += motionEvent.getHistorySize() + 1;
                        C4250z7 k9 = k(motionEvent);
                        Long l10 = k9.f35286M;
                        if (l10 != null && k9.f35289P != null) {
                            this.f31178A = l10.longValue() + k9.f35289P.longValue() + this.f31178A;
                        }
                        if (this.f31188L != null && (l9 = k9.f35287N) != null && k9.f35290Q != null) {
                            this.f31179B = l9.longValue() + k9.f35290Q.longValue() + this.f31179B;
                        }
                    } else if (action2 == 3) {
                        this.f31197y++;
                    }
                } catch (C3872s7 unused) {
                }
            } else {
                this.f31183F = motionEvent.getX();
                this.f31184G = motionEvent.getY();
                this.f31185H = motionEvent.getRawX();
                this.f31186I = motionEvent.getRawY();
                this.f31194v++;
            }
            this.f31187K = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String c(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        Qx qx;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31991C3)).booleanValue() || (qx = this.f31189M) == null) {
            return;
        }
        qx.f27139u = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String f(Context context) {
        char[] cArr = A7.f23634a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return o(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void g(View view) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32391v3)).booleanValue()) {
            if (this.f31191O == null) {
                C4196y7 c4196y7 = f31169P;
                this.f31191O = new C7(c4196y7.f35095a, c4196y7.f35108o);
            }
            this.f31191O.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String h(Context context, String str, View view) {
        return o(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String i(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity);
    }

    public final C3979u6 j(Context context) {
        long j6;
        E7 e72 = f31174U;
        if (e72 != null && e72.f24545d) {
            e72.f24543b = System.currentTimeMillis();
        }
        F0 f02 = f31175V;
        f02.f24702b = f02.f24701a;
        f02.f24701a = SystemClock.uptimeMillis();
        C3979u6 C0 = H6.C0();
        com.bumptech.glide.manager.p pVar = this.f31190N;
        String str = (String) pVar.f23470v;
        if (!TextUtils.isEmpty(str)) {
            C0.h();
            ((H6) C0.f27721u).F0(str);
        }
        C4196y7 n9 = n(context, pVar.f23469u);
        if (n9.f35096b != null) {
            int e9 = n9.e();
            ArrayList arrayList = new ArrayList();
            if (n9.f35107n) {
                arrayList.add(new H7(n9, C0, e9, context, (C3764q6) pVar.f23471w, f31176W));
                arrayList.add(new J7(n9, C0, f31172S, e9));
                arrayList.add(new I7(n9, C0, e9, 3));
                arrayList.add(new F7(n9, C0, e9, context));
                arrayList.add(new I7(n9, C0, e9, 4));
                arrayList.add(new G7(n9, C0, e9, context));
                arrayList.add(new I7(n9, C0, e9, 7));
                arrayList.add(new I7(n9, C0, e9, 9));
                arrayList.add(new I7(n9, C0, e9, 10));
                arrayList.add(new I7(n9, C0, e9, 0));
                arrayList.add(new I7(n9, C0, e9, 2));
                arrayList.add(new I7(n9, C0, e9, 13));
                arrayList.add(new I7(n9, C0, e9, 6));
                arrayList.add(new I7(n9, C0, e9, 12));
                arrayList.add(new N7(n9, C0, e9));
                E7 e73 = f31174U;
                long j9 = -1;
                if (e73 != null) {
                    long j10 = e73.f24545d ? e73.f24543b - e73.f24542a : -1L;
                    long j11 = e73.f24544c;
                    e73.f24544c = -1L;
                    j9 = j10;
                    j6 = j11;
                } else {
                    j6 = -1;
                }
                arrayList.add(new M7(n9, C0, e9, f31173T, j9, j6));
                arrayList.add(new I7(n9, C0, e9, 11));
                I7 i72 = new I7(n9, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", C0, e9, 76, 8);
                C0 = C0;
                arrayList.add(i72);
                arrayList.add(new I7(n9, C0, e9, 5));
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.m4)).booleanValue()) {
                    I7 i73 = new I7(n9, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", C0, e9, 82, 1);
                    C0 = C0;
                    arrayList.add(i73);
                }
            } else {
                C0.n(16384L);
            }
            r(arrayList);
        }
        return C0;
    }

    public final C4250z7 k(MotionEvent motionEvent) {
        Method d2 = f31169P.d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (d2 == null || motionEvent == null) {
            throw new C3872s7();
        }
        try {
            return new C4250z7((String) d2.invoke(null, motionEvent, this.f31188L));
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new C3872s7(e9);
        }
    }

    public final long l(StackTraceElement[] stackTraceElementArr) {
        Method d2 = f31169P.d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (d2 == null || stackTraceElementArr == null) {
            throw new C3872s7();
        }
        try {
            return new C3603n7((String) d2.invoke(null, stackTraceElementArr)).f32687K.longValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new C3872s7(e9);
        }
    }

    public final void m() {
        this.f31198z = 0L;
        this.f31194v = 0L;
        this.f31195w = 0L;
        this.f31196x = 0L;
        this.f31197y = 0L;
        this.f31178A = 0L;
        this.f31179B = 0L;
        LinkedList linkedList = this.f31193u;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f31192n;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f31192n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String o(Context context, String str, int i, View view, Activity activity) {
        C3281h7 c3281h7;
        String str2;
        int i6;
        Exception exc;
        C3979u6 c3979u6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        byte[] b9;
        int i14;
        int i15;
        int i16;
        int i17 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32354r3)).booleanValue();
        if (booleanValue) {
            c3281h7 = f31169P != null ? f31169P.f35104k : null;
            str2 = "be";
        } else {
            c3281h7 = null;
            str2 = null;
        }
        try {
            if (i17 == 3) {
                try {
                    E7 e72 = f31174U;
                    if (e72 != null && e72.f24545d) {
                        e72.f24543b = System.currentTimeMillis();
                    }
                    F0 f02 = f31175V;
                    f02.f24708h = f02.f24707g;
                    f02.f24707g = SystemClock.uptimeMillis();
                    c3979u6 = H6.C0();
                    com.bumptech.glide.manager.p pVar = this.f31190N;
                    String str3 = (String) pVar.f23470v;
                    if (!TextUtils.isEmpty(str3)) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).F0(str3);
                    }
                    i9 = 2;
                    q(n(context, pVar.f23469u), c3979u6, view, activity, true, context);
                    try {
                        this.J = true;
                        i14 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
                    } catch (Exception e9) {
                        exc = e9;
                        i6 = 1;
                        if (booleanValue) {
                        }
                        i10 = 3;
                        i11 = i17;
                        z3 = i6;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (c3979u6 != null) {
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e10) {
                    e = e10;
                    i9 = 2;
                    i6 = 1;
                    exc = e;
                    c3979u6 = null;
                    if (booleanValue) {
                    }
                    i10 = 3;
                    i11 = i17;
                    z3 = i6;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (c3979u6 != null) {
                    }
                    return Integer.toString(5);
                }
            } else {
                i9 = 2;
                if (i17 == 2) {
                    E7 e73 = f31174U;
                    if (e73 != null && e73.f24545d) {
                        e73.f24543b = System.currentTimeMillis();
                    }
                    f31175V.b(context, view);
                    c3979u6 = H6.C0();
                    com.bumptech.glide.manager.p pVar2 = this.f31190N;
                    String str4 = (String) pVar2.f23470v;
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).F0(str4);
                    q(n(context, pVar2.f23469u), c3979u6, view, activity, false, context);
                    i14 = 1008;
                } else {
                    c3979u6 = j(context);
                    i14 = 1000;
                }
            }
            if (!booleanValue || c3281h7 == null) {
                i15 = 1;
            } else {
                try {
                    i16 = 1;
                    try {
                        c3281h7.a(i14, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                        i15 = i16;
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        i6 = i16;
                        if (booleanValue || c3281h7 == null) {
                            i10 = 3;
                        } else {
                            i10 = 3;
                            if (i17 == 3) {
                                i13 = 1003;
                            } else if (i17 == i9) {
                                i13 = 1009;
                            } else {
                                i12 = 1001;
                                i17 = i6;
                                c3281h7.a(i12, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                            }
                            i12 = i13;
                            c3281h7.a(i12, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i11 = i17;
                        z3 = i6;
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (c3979u6 != null) {
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e12) {
                    e = e12;
                    i16 = 1;
                }
            }
            i11 = i17;
            i10 = 3;
            z3 = i15;
        } catch (Exception e13) {
            e = e13;
        }
        long currentTimeMillis2222 = System.currentTimeMillis();
        if (c3979u6 != null) {
            try {
                if (((H6) c3979u6.j()).d(null) != 0) {
                    H6 h62 = (H6) c3979u6.j();
                    boolean z6 = Z6.f28839a;
                    R6 b10 = Z6.b(str, h62.b());
                    if (b10 == null) {
                        C3979u6 C0 = H6.C0();
                        C0.n(4096L);
                        b9 = Z6.d(((H6) C0.j()).b(), str, z3);
                    } else {
                        b9 = ((S6) b10.j()).b();
                    }
                    String encodeToString = Base64.encodeToString(b9, 11);
                    if (!booleanValue || c3281h7 == null) {
                        return encodeToString;
                    }
                    C3281h7 c3281h72 = c3281h7;
                    String str5 = str2;
                    try {
                        c3281h72.a(i11 == i10 ? 1006 : i11 == i9 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis2222, str5, null);
                        return encodeToString;
                    } catch (Exception e14) {
                        e = e14;
                        c3281h7 = c3281h72;
                        str2 = str5;
                        Exception exc2 = e;
                        String num = Integer.toString(7);
                        if (!booleanValue || c3281h7 == null) {
                            return num;
                        }
                        c3281h7.a(i11 == i10 ? 1007 : i11 == i9 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis2222, str2, exc2);
                        return num;
                    }
                }
            } catch (Exception e15) {
                e = e15;
            }
        }
        return Integer.toString(5);
    }

    public final void q(C4196y7 c4196y7, C3979u6 c3979u6, View view, Activity activity, boolean z3, Context context) {
        List list;
        long j6;
        long j9;
        MotionEvent motionEvent;
        if (c4196y7.f35107n) {
            synchronized (this) {
                try {
                    try {
                        C4250z7 p9 = p(c4196y7, this.f31192n, this.f31188L);
                        Long l9 = p9.J;
                        if (l9 != null) {
                            long longValue = l9.longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).L0(longValue);
                        }
                        Long l10 = p9.f35284K;
                        if (l10 != null) {
                            long longValue2 = l10.longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).M0(longValue2);
                        }
                        Long l11 = p9.f35285L;
                        if (l11 != null) {
                            long longValue3 = l11.longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).N0(longValue3);
                        }
                        if (this.f31187K) {
                            Long l12 = p9.f35286M;
                            if (l12 != null) {
                                long longValue4 = l12.longValue();
                                c3979u6.h();
                                ((H6) c3979u6.f27721u).G(longValue4);
                            }
                            Long l13 = p9.f35287N;
                            if (l13 != null) {
                                long longValue5 = l13.longValue();
                                c3979u6.h();
                                ((H6) c3979u6.f27721u).H(longValue5);
                            }
                        }
                    } catch (C3872s7 unused) {
                    }
                    C6 A9 = D6.A();
                    if (this.f31194v > 0) {
                        DisplayMetrics displayMetrics = this.f31188L;
                        char[] cArr = A7.f23634a;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long b9 = A7.b(this.f31180C, displayMetrics);
                            A9.h();
                            ((D6) A9.f27721u).M(b9);
                            long b10 = A7.b(this.f31185H - this.f31183F, this.f31188L);
                            A9.h();
                            ((D6) A9.f27721u).N(b10);
                            long b11 = A7.b(this.f31186I - this.f31184G, this.f31188L);
                            A9.h();
                            ((D6) A9.f27721u).O(b11);
                            long b12 = A7.b(this.f31183F, this.f31188L);
                            A9.h();
                            ((D6) A9.f27721u).R(b12);
                            long b13 = A7.b(this.f31184G, this.f31188L);
                            A9.h();
                            ((D6) A9.f27721u).S(b13);
                            if (this.f31187K && (motionEvent = this.f31192n) != null) {
                                long b14 = A7.b(((this.f31183F - this.f31185H) + motionEvent.getRawX()) - this.f31192n.getX(), this.f31188L);
                                if (b14 != 0) {
                                    A9.h();
                                    ((D6) A9.f27721u).P(b14);
                                }
                                long b15 = A7.b(((this.f31184G - this.f31186I) + this.f31192n.getRawY()) - this.f31192n.getY(), this.f31188L);
                                if (b15 != 0) {
                                    A9.h();
                                    ((D6) A9.f27721u).Q(b15);
                                }
                            }
                        }
                    }
                    try {
                        C4250z7 k9 = k(this.f31192n);
                        Long l14 = k9.J;
                        if (l14 != null) {
                            long longValue6 = l14.longValue();
                            A9.h();
                            ((D6) A9.f27721u).B(longValue6);
                        }
                        Long l15 = k9.f35284K;
                        if (l15 != null) {
                            long longValue7 = l15.longValue();
                            A9.h();
                            ((D6) A9.f27721u).C(longValue7);
                        }
                        long longValue8 = k9.f35285L.longValue();
                        A9.h();
                        ((D6) A9.f27721u).I(longValue8);
                        if (this.f31187K) {
                            Long l16 = k9.f35287N;
                            if (l16 != null) {
                                long longValue9 = l16.longValue();
                                A9.h();
                                ((D6) A9.f27721u).D(longValue9);
                            }
                            Long l17 = k9.f35286M;
                            if (l17 != null) {
                                long longValue10 = l17.longValue();
                                A9.h();
                                ((D6) A9.f27721u).G(longValue10);
                            }
                            Long l18 = k9.f35288O;
                            if (l18 != null) {
                                int i = l18.longValue() != 0 ? 2 : 1;
                                A9.h();
                                ((D6) A9.f27721u).T(i);
                            }
                            long j10 = this.f31195w;
                            if (j10 > 0) {
                                DisplayMetrics displayMetrics2 = this.f31188L;
                                char[] cArr2 = A7.f23634a;
                                Long valueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f31179B / j10)) : null;
                                if (valueOf != null) {
                                    long longValue11 = valueOf.longValue();
                                    A9.h();
                                    ((D6) A9.f27721u).E(longValue11);
                                } else {
                                    A9.h();
                                    ((D6) A9.f27721u).F();
                                }
                                long round = Math.round(this.f31178A / this.f31195w);
                                A9.h();
                                ((D6) A9.f27721u).H(round);
                            }
                            Long l19 = k9.f35291R;
                            if (l19 != null) {
                                long longValue12 = l19.longValue();
                                A9.h();
                                ((D6) A9.f27721u).K(longValue12);
                            }
                            Long l20 = k9.f35292S;
                            if (l20 != null) {
                                long longValue13 = l20.longValue();
                                A9.h();
                                ((D6) A9.f27721u).J(longValue13);
                            }
                            Long l21 = k9.f35293T;
                            if (l21 != null) {
                                int i6 = l21.longValue() != 0 ? 2 : 1;
                                A9.h();
                                ((D6) A9.f27721u).U(i6);
                            }
                        }
                    } catch (C3872s7 unused2) {
                    }
                    long j11 = this.f31198z;
                    if (j11 > 0) {
                        A9.h();
                        ((D6) A9.f27721u).L(j11);
                    }
                    D6 d62 = (D6) A9.j();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).T(d62);
                    long j12 = this.f31194v;
                    if (j12 > 0) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).K(j12);
                    }
                    long j13 = this.f31195w;
                    if (j13 > 0) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).J(j13);
                    }
                    long j14 = this.f31196x;
                    if (j14 > 0) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).I(j14);
                    }
                    long j15 = this.f31197y;
                    if (j15 > 0) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).L(j15);
                    }
                    try {
                        LinkedList linkedList = this.f31193u;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).V();
                            for (int i9 = 0; i9 < size; i9++) {
                                C4250z7 p10 = p(f31169P, (MotionEvent) linkedList.get(i9), this.f31188L);
                                C6 A10 = D6.A();
                                long longValue14 = p10.J.longValue();
                                A10.h();
                                ((D6) A10.f27721u).B(longValue14);
                                long longValue15 = p10.f35284K.longValue();
                                A10.h();
                                ((D6) A10.f27721u).C(longValue15);
                                D6 d63 = (D6) A10.j();
                                c3979u6.h();
                                ((H6) c3979u6.f27721u).U(d63);
                            }
                        }
                    } catch (C3872s7 unused3) {
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).V();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (c4196y7.f35096b != null) {
                int e9 = c4196y7.e();
                C3301ha c3301ha = AbstractC3569ma.f31982B3;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    arrayList.add(new H7(c4196y7, c3979u6, e9, context, (C3764q6) this.f31190N.f23471w, f31176W));
                    arrayList.add(new G7(c4196y7, c3979u6, e9, context));
                    arrayList.add(new F7(c4196y7, c3979u6, e9, context));
                    arrayList.add(new I7(c4196y7, c3979u6, e9, 4));
                    E7 e72 = f31174U;
                    if (e72 != null) {
                        long j16 = e72.f24545d ? e72.f24543b - e72.f24542a : -1L;
                        long j17 = e72.f24544c;
                        e72.f24544c = -1L;
                        j9 = j16;
                        j6 = j17;
                    } else {
                        j6 = -1;
                        j9 = -1;
                    }
                    arrayList.add(new M7(c4196y7, c3979u6, e9, f31173T, j9, j6));
                    arrayList.add(new I7(c4196y7, c3979u6, e9, 11));
                }
                arrayList.add(new C2.x(2, c4196y7, c3979u6));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 3));
                arrayList.add(new J7(c4196y7, c3979u6, f31172S, e9));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 0));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 9));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 10));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 2));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 7));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 13));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 6));
                arrayList.add(new I7(c4196y7, c3979u6, e9, 12));
                arrayList.add(new L7(c4196y7, c3979u6, e9, new Throwable().getStackTrace()));
                arrayList.add(new L7(c4196y7, c3979u6, e9, view));
                arrayList.add(new N7(c4196y7, c3979u6, e9));
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32374t3)).booleanValue()) {
                    arrayList.add(new F7(c4196y7, c3979u6, e9, view, activity));
                }
                arrayList.add(new I7(c4196y7, c3979u6, e9, 5));
                if (!z3) {
                    arrayList.add(new L7(c4196y7, c3979u6, e9, f31175V));
                    arrayList.add(new L7(c4196y7, c3979u6, e9, this.f31189M));
                } else if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32391v3)).booleanValue()) {
                    arrayList.add(new O7(c4196y7, c3979u6, e9, this.f31191O));
                }
            }
            list = arrayList;
        } else {
            c3979u6.n(16384L);
            list = Arrays.asList(new C2.x(2, c4196y7, c3979u6));
        }
        r(list);
    }
}
