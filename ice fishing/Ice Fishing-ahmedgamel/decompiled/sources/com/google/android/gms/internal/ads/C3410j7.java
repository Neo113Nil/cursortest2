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
public final class C3410j7 implements InterfaceC3358i7 {

    /* renamed from: P, reason: collision with root package name */
    public static volatile C4219y7 f31956P = null;

    /* renamed from: Q, reason: collision with root package name */
    public static final Object f31957Q = new Object();

    /* renamed from: R, reason: collision with root package name */
    public static boolean f31958R = false;

    /* renamed from: S, reason: collision with root package name */
    public static long f31959S;

    /* renamed from: T, reason: collision with root package name */
    public static C3680o7 f31960T;

    /* renamed from: U, reason: collision with root package name */
    public static E7 f31961U;

    /* renamed from: V, reason: collision with root package name */
    public static F0 f31962V;

    /* renamed from: W, reason: collision with root package name */
    public static C4297ze f31963W;

    /* renamed from: X, reason: collision with root package name */
    public static C3717or f31964X;

    /* renamed from: C, reason: collision with root package name */
    public double f31967C;

    /* renamed from: D, reason: collision with root package name */
    public double f31968D;

    /* renamed from: E, reason: collision with root package name */
    public double f31969E;

    /* renamed from: F, reason: collision with root package name */
    public float f31970F;

    /* renamed from: G, reason: collision with root package name */
    public float f31971G;

    /* renamed from: H, reason: collision with root package name */
    public float f31972H;

    /* renamed from: I, reason: collision with root package name */
    public float f31973I;

    /* renamed from: L, reason: collision with root package name */
    public final DisplayMetrics f31975L;

    /* renamed from: M, reason: collision with root package name */
    public final Qx f31976M;

    /* renamed from: N, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f31977N;

    /* renamed from: O, reason: collision with root package name */
    public C7 f31978O;

    /* renamed from: n, reason: collision with root package name */
    public MotionEvent f31979n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedList f31980u = new LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public long f31981v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f31982w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f31983x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f31984y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f31985z = 0;

    /* renamed from: A, reason: collision with root package name */
    public long f31965A = 0;

    /* renamed from: B, reason: collision with root package name */
    public long f31966B = 0;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f31974K = false;

    public C3410j7(Context context, com.bumptech.glide.manager.o oVar) {
        try {
            Z6.a();
            this.f31975L = context.getResources().getDisplayMetrics();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32771C3)).booleanValue()) {
                this.f31976M = new Qx(7);
            }
        } catch (Throwable unused) {
        }
        new HashMap();
        this.f31977N = oVar;
    }

    public static C4219y7 n(Context context, boolean z6) {
        if (f31956P == null) {
            synchronized (f31957Q) {
                try {
                    if (f31956P == null) {
                        C4219y7 a9 = C4219y7.a(context, z6, f31964X);
                        if (a9.f35893n) {
                            try {
                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.i4)).booleanValue()) {
                                    a9.c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            a9.c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33089m4)).booleanValue()) {
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
                        f31956P = a9;
                    }
                } finally {
                }
            }
        }
        return f31956P;
    }

    public static C4273z7 p(C4219y7 c4219y7, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method d9 = c4219y7.d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (d9 == null || motionEvent == null) {
            throw new C3895s7();
        }
        try {
            return new C4273z7((String) d9.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new C3895s7(e9);
        }
    }

    public static final void r(List list) {
        ExecutorService executorService;
        if (f31956P == null || (executorService = f31956P.f35882b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33143s3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            char[] cArr = A7.f24414a;
            StringWriter stringWriter = new StringWriter();
            e9.printStackTrace(new PrintWriter(stringWriter));
            Log.d("j7", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final synchronized void a(int i, int i4, int i6) {
        try {
            if (this.f31979n != null) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33115p3)).booleanValue()) {
                    m();
                } else {
                    this.f31979n.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f31975L;
            if (displayMetrics != null) {
                float f2 = displayMetrics.density;
                this.f31979n = MotionEvent.obtain(0L, i6, 1, i * f2, i4 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f31979n = null;
            }
            this.f31974K = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final synchronized void b(MotionEvent motionEvent) {
        Long l9;
        try {
            if (this.J) {
                m();
                this.J = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f31967C = 0.0d;
                this.f31968D = motionEvent.getRawX();
                this.f31969E = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d9 = rawX - this.f31968D;
                double d10 = rawY - this.f31969E;
                this.f31967C += Math.sqrt((d10 * d10) + (d9 * d9));
                this.f31968D = rawX;
                this.f31969E = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f31979n = obtain;
                        LinkedList linkedList = this.f31980u;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f31983x++;
                        this.f31985z = l(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f31982w += motionEvent.getHistorySize() + 1;
                        C4273z7 k9 = k(motionEvent);
                        Long l10 = k9.f36070M;
                        if (l10 != null && k9.f36073P != null) {
                            this.f31965A = l10.longValue() + k9.f36073P.longValue() + this.f31965A;
                        }
                        if (this.f31975L != null && (l9 = k9.f36071N) != null && k9.f36074Q != null) {
                            this.f31966B = l9.longValue() + k9.f36074Q.longValue() + this.f31966B;
                        }
                    } else if (action2 == 3) {
                        this.f31984y++;
                    }
                } catch (C3895s7 unused) {
                }
            } else {
                this.f31970F = motionEvent.getX();
                this.f31971G = motionEvent.getY();
                this.f31972H = motionEvent.getRawX();
                this.f31973I = motionEvent.getRawY();
                this.f31981v++;
            }
            this.f31974K = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String c(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        Qx qx;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32771C3)).booleanValue() || (qx = this.f31976M) == null) {
            return;
        }
        qx.f27895u = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String f(Context context) {
        char[] cArr = A7.f24414a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return o(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void g(View view) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33171v3)).booleanValue()) {
            if (this.f31978O == null) {
                C4219y7 c4219y7 = f31956P;
                this.f31978O = new C7(c4219y7.f35881a, c4219y7.f35894o);
            }
            this.f31978O.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String h(Context context, String str, View view) {
        return o(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String i(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity);
    }

    public final C4002u6 j(Context context) {
        long j6;
        E7 e72 = f31961U;
        if (e72 != null && e72.f25306d) {
            e72.f25304b = System.currentTimeMillis();
        }
        F0 f02 = f31962V;
        f02.f25458b = f02.f25457a;
        f02.f25457a = SystemClock.uptimeMillis();
        C4002u6 C0 = H6.C0();
        com.bumptech.glide.manager.o oVar = this.f31977N;
        String str = (String) oVar.f24255v;
        if (!TextUtils.isEmpty(str)) {
            C0.h();
            ((H6) C0.f28504u).F0(str);
        }
        C4219y7 n9 = n(context, oVar.f24254u);
        if (n9.f35882b != null) {
            int e9 = n9.e();
            ArrayList arrayList = new ArrayList();
            if (n9.f35893n) {
                arrayList.add(new H7(n9, C0, e9, context, (C3787q6) oVar.f24256w, f31963W));
                arrayList.add(new J7(n9, C0, f31959S, e9));
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
                E7 e73 = f31961U;
                long j9 = -1;
                if (e73 != null) {
                    long j10 = e73.f25306d ? e73.f25304b - e73.f25303a : -1L;
                    long j11 = e73.f25305c;
                    e73.f25305c = -1L;
                    j9 = j10;
                    j6 = j11;
                } else {
                    j6 = -1;
                }
                arrayList.add(new M7(n9, C0, e9, f31960T, j9, j6));
                arrayList.add(new I7(n9, C0, e9, 11));
                I7 i72 = new I7(n9, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", C0, e9, 76, 8);
                C0 = C0;
                arrayList.add(i72);
                arrayList.add(new I7(n9, C0, e9, 5));
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33089m4)).booleanValue()) {
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

    public final C4273z7 k(MotionEvent motionEvent) {
        Method d9 = f31956P.d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (d9 == null || motionEvent == null) {
            throw new C3895s7();
        }
        try {
            return new C4273z7((String) d9.invoke(null, motionEvent, this.f31975L));
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new C3895s7(e9);
        }
    }

    public final long l(StackTraceElement[] stackTraceElementArr) {
        Method d9 = f31956P.d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (d9 == null || stackTraceElementArr == null) {
            throw new C3895s7();
        }
        try {
            return new C3626n7((String) d9.invoke(null, stackTraceElementArr)).f33465K.longValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new C3895s7(e9);
        }
    }

    public final void m() {
        this.f31985z = 0L;
        this.f31981v = 0L;
        this.f31982w = 0L;
        this.f31983x = 0L;
        this.f31984y = 0L;
        this.f31965A = 0L;
        this.f31966B = 0L;
        LinkedList linkedList = this.f31980u;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f31979n;
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
        this.f31979n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String o(Context context, String str, int i, View view, Activity activity) {
        C3304h7 c3304h7;
        String str2;
        int i4;
        Exception exc;
        C4002u6 c4002u6;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        byte[] b9;
        int i13;
        int i14;
        int i15;
        int i16 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33133r3)).booleanValue();
        if (booleanValue) {
            c3304h7 = f31956P != null ? f31956P.f35890k : null;
            str2 = "be";
        } else {
            c3304h7 = null;
            str2 = null;
        }
        try {
            if (i16 == 3) {
                try {
                    E7 e72 = f31961U;
                    if (e72 != null && e72.f25306d) {
                        e72.f25304b = System.currentTimeMillis();
                    }
                    F0 f02 = f31962V;
                    f02.f25464h = f02.f25463g;
                    f02.f25463g = SystemClock.uptimeMillis();
                    c4002u6 = H6.C0();
                    com.bumptech.glide.manager.o oVar = this.f31977N;
                    String str3 = (String) oVar.f24255v;
                    if (!TextUtils.isEmpty(str3)) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).F0(str3);
                    }
                    i6 = 2;
                    q(n(context, oVar.f24254u), c4002u6, view, activity, true, context);
                    try {
                        this.J = true;
                        i13 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
                    } catch (Exception e9) {
                        exc = e9;
                        i4 = 1;
                        if (booleanValue) {
                        }
                        i9 = 3;
                        i10 = i16;
                        z6 = i4;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (c4002u6 != null) {
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e10) {
                    e = e10;
                    i6 = 2;
                    i4 = 1;
                    exc = e;
                    c4002u6 = null;
                    if (booleanValue) {
                    }
                    i9 = 3;
                    i10 = i16;
                    z6 = i4;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (c4002u6 != null) {
                    }
                    return Integer.toString(5);
                }
            } else {
                i6 = 2;
                if (i16 == 2) {
                    E7 e73 = f31961U;
                    if (e73 != null && e73.f25306d) {
                        e73.f25304b = System.currentTimeMillis();
                    }
                    f31962V.b(context, view);
                    c4002u6 = H6.C0();
                    com.bumptech.glide.manager.o oVar2 = this.f31977N;
                    String str4 = (String) oVar2.f24255v;
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).F0(str4);
                    q(n(context, oVar2.f24254u), c4002u6, view, activity, false, context);
                    i13 = 1008;
                } else {
                    c4002u6 = j(context);
                    i13 = 1000;
                }
            }
            if (!booleanValue || c3304h7 == null) {
                i14 = 1;
            } else {
                try {
                    i15 = 1;
                    try {
                        c3304h7.a(i13, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                        i14 = i15;
                    } catch (Exception e11) {
                        e = e11;
                        exc = e;
                        i4 = i15;
                        if (booleanValue || c3304h7 == null) {
                            i9 = 3;
                        } else {
                            i9 = 3;
                            if (i16 == 3) {
                                i12 = 1003;
                            } else if (i16 == i6) {
                                i12 = 1009;
                            } else {
                                i11 = 1001;
                                i16 = i4;
                                c3304h7.a(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                            }
                            i11 = i12;
                            c3304h7.a(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i10 = i16;
                        z6 = i4;
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (c4002u6 != null) {
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e12) {
                    e = e12;
                    i15 = 1;
                }
            }
            i10 = i16;
            i9 = 3;
            z6 = i14;
        } catch (Exception e13) {
            e = e13;
        }
        long currentTimeMillis2222 = System.currentTimeMillis();
        if (c4002u6 != null) {
            try {
                if (((H6) c4002u6.j()).d(null) != 0) {
                    H6 h62 = (H6) c4002u6.j();
                    boolean z9 = Z6.f29619a;
                    R6 b10 = Z6.b(str, h62.b());
                    if (b10 == null) {
                        C4002u6 C0 = H6.C0();
                        C0.n(4096L);
                        b9 = Z6.d(((H6) C0.j()).b(), str, z6);
                    } else {
                        b9 = ((S6) b10.j()).b();
                    }
                    String encodeToString = Base64.encodeToString(b9, 11);
                    if (!booleanValue || c3304h7 == null) {
                        return encodeToString;
                    }
                    C3304h7 c3304h72 = c3304h7;
                    String str5 = str2;
                    try {
                        c3304h72.a(i10 == i9 ? 1006 : i10 == i6 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis2222, str5, null);
                        return encodeToString;
                    } catch (Exception e14) {
                        e = e14;
                        c3304h7 = c3304h72;
                        str2 = str5;
                        Exception exc2 = e;
                        String num = Integer.toString(7);
                        if (!booleanValue || c3304h7 == null) {
                            return num;
                        }
                        c3304h7.a(i10 == i9 ? 1007 : i10 == i6 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis2222, str2, exc2);
                        return num;
                    }
                }
            } catch (Exception e15) {
                e = e15;
            }
        }
        return Integer.toString(5);
    }

    public final void q(C4219y7 c4219y7, C4002u6 c4002u6, View view, Activity activity, boolean z6, Context context) {
        List list;
        long j6;
        long j9;
        MotionEvent motionEvent;
        if (c4219y7.f35893n) {
            synchronized (this) {
                try {
                    try {
                        C4273z7 p9 = p(c4219y7, this.f31979n, this.f31975L);
                        Long l9 = p9.J;
                        if (l9 != null) {
                            long longValue = l9.longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).L0(longValue);
                        }
                        Long l10 = p9.f36068K;
                        if (l10 != null) {
                            long longValue2 = l10.longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).M0(longValue2);
                        }
                        Long l11 = p9.f36069L;
                        if (l11 != null) {
                            long longValue3 = l11.longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).N0(longValue3);
                        }
                        if (this.f31974K) {
                            Long l12 = p9.f36070M;
                            if (l12 != null) {
                                long longValue4 = l12.longValue();
                                c4002u6.h();
                                ((H6) c4002u6.f28504u).G(longValue4);
                            }
                            Long l13 = p9.f36071N;
                            if (l13 != null) {
                                long longValue5 = l13.longValue();
                                c4002u6.h();
                                ((H6) c4002u6.f28504u).H(longValue5);
                            }
                        }
                    } catch (C3895s7 unused) {
                    }
                    C6 A9 = D6.A();
                    if (this.f31981v > 0) {
                        DisplayMetrics displayMetrics = this.f31975L;
                        char[] cArr = A7.f24414a;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long b9 = A7.b(this.f31967C, displayMetrics);
                            A9.h();
                            ((D6) A9.f28504u).M(b9);
                            long b10 = A7.b(this.f31972H - this.f31970F, this.f31975L);
                            A9.h();
                            ((D6) A9.f28504u).N(b10);
                            long b11 = A7.b(this.f31973I - this.f31971G, this.f31975L);
                            A9.h();
                            ((D6) A9.f28504u).O(b11);
                            long b12 = A7.b(this.f31970F, this.f31975L);
                            A9.h();
                            ((D6) A9.f28504u).R(b12);
                            long b13 = A7.b(this.f31971G, this.f31975L);
                            A9.h();
                            ((D6) A9.f28504u).S(b13);
                            if (this.f31974K && (motionEvent = this.f31979n) != null) {
                                long b14 = A7.b(((this.f31970F - this.f31972H) + motionEvent.getRawX()) - this.f31979n.getX(), this.f31975L);
                                if (b14 != 0) {
                                    A9.h();
                                    ((D6) A9.f28504u).P(b14);
                                }
                                long b15 = A7.b(((this.f31971G - this.f31973I) + this.f31979n.getRawY()) - this.f31979n.getY(), this.f31975L);
                                if (b15 != 0) {
                                    A9.h();
                                    ((D6) A9.f28504u).Q(b15);
                                }
                            }
                        }
                    }
                    try {
                        C4273z7 k9 = k(this.f31979n);
                        Long l14 = k9.J;
                        if (l14 != null) {
                            long longValue6 = l14.longValue();
                            A9.h();
                            ((D6) A9.f28504u).B(longValue6);
                        }
                        Long l15 = k9.f36068K;
                        if (l15 != null) {
                            long longValue7 = l15.longValue();
                            A9.h();
                            ((D6) A9.f28504u).C(longValue7);
                        }
                        long longValue8 = k9.f36069L.longValue();
                        A9.h();
                        ((D6) A9.f28504u).I(longValue8);
                        if (this.f31974K) {
                            Long l16 = k9.f36071N;
                            if (l16 != null) {
                                long longValue9 = l16.longValue();
                                A9.h();
                                ((D6) A9.f28504u).D(longValue9);
                            }
                            Long l17 = k9.f36070M;
                            if (l17 != null) {
                                long longValue10 = l17.longValue();
                                A9.h();
                                ((D6) A9.f28504u).G(longValue10);
                            }
                            Long l18 = k9.f36072O;
                            if (l18 != null) {
                                int i = l18.longValue() != 0 ? 2 : 1;
                                A9.h();
                                ((D6) A9.f28504u).T(i);
                            }
                            long j10 = this.f31982w;
                            if (j10 > 0) {
                                DisplayMetrics displayMetrics2 = this.f31975L;
                                char[] cArr2 = A7.f24414a;
                                Long valueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f31966B / j10)) : null;
                                if (valueOf != null) {
                                    long longValue11 = valueOf.longValue();
                                    A9.h();
                                    ((D6) A9.f28504u).E(longValue11);
                                } else {
                                    A9.h();
                                    ((D6) A9.f28504u).F();
                                }
                                long round = Math.round(this.f31965A / this.f31982w);
                                A9.h();
                                ((D6) A9.f28504u).H(round);
                            }
                            Long l19 = k9.f36075R;
                            if (l19 != null) {
                                long longValue12 = l19.longValue();
                                A9.h();
                                ((D6) A9.f28504u).K(longValue12);
                            }
                            Long l20 = k9.f36076S;
                            if (l20 != null) {
                                long longValue13 = l20.longValue();
                                A9.h();
                                ((D6) A9.f28504u).J(longValue13);
                            }
                            Long l21 = k9.f36077T;
                            if (l21 != null) {
                                int i4 = l21.longValue() != 0 ? 2 : 1;
                                A9.h();
                                ((D6) A9.f28504u).U(i4);
                            }
                        }
                    } catch (C3895s7 unused2) {
                    }
                    long j11 = this.f31985z;
                    if (j11 > 0) {
                        A9.h();
                        ((D6) A9.f28504u).L(j11);
                    }
                    D6 d62 = (D6) A9.j();
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).T(d62);
                    long j12 = this.f31981v;
                    if (j12 > 0) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).K(j12);
                    }
                    long j13 = this.f31982w;
                    if (j13 > 0) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).J(j13);
                    }
                    long j14 = this.f31983x;
                    if (j14 > 0) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).I(j14);
                    }
                    long j15 = this.f31984y;
                    if (j15 > 0) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).L(j15);
                    }
                    try {
                        LinkedList linkedList = this.f31980u;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).V();
                            for (int i6 = 0; i6 < size; i6++) {
                                C4273z7 p10 = p(f31956P, (MotionEvent) linkedList.get(i6), this.f31975L);
                                C6 A10 = D6.A();
                                long longValue14 = p10.J.longValue();
                                A10.h();
                                ((D6) A10.f28504u).B(longValue14);
                                long longValue15 = p10.f36068K.longValue();
                                A10.h();
                                ((D6) A10.f28504u).C(longValue15);
                                D6 d63 = (D6) A10.j();
                                c4002u6.h();
                                ((H6) c4002u6.f28504u).U(d63);
                            }
                        }
                    } catch (C3895s7 unused3) {
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).V();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (c4219y7.f35882b != null) {
                int e9 = c4219y7.e();
                C3324ha c3324ha = AbstractC3592ma.B3;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    arrayList.add(new H7(c4219y7, c4002u6, e9, context, (C3787q6) this.f31977N.f24256w, f31963W));
                    arrayList.add(new G7(c4219y7, c4002u6, e9, context));
                    arrayList.add(new F7(c4219y7, c4002u6, e9, context));
                    arrayList.add(new I7(c4219y7, c4002u6, e9, 4));
                    E7 e72 = f31961U;
                    if (e72 != null) {
                        long j16 = e72.f25306d ? e72.f25304b - e72.f25303a : -1L;
                        long j17 = e72.f25305c;
                        e72.f25305c = -1L;
                        j9 = j16;
                        j6 = j17;
                    } else {
                        j6 = -1;
                        j9 = -1;
                    }
                    arrayList.add(new M7(c4219y7, c4002u6, e9, f31960T, j9, j6));
                    arrayList.add(new I7(c4219y7, c4002u6, e9, 11));
                }
                arrayList.add(new E2.w(2, c4219y7, c4002u6));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 3));
                arrayList.add(new J7(c4219y7, c4002u6, f31959S, e9));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 0));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 9));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 10));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 2));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 7));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 13));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 6));
                arrayList.add(new I7(c4219y7, c4002u6, e9, 12));
                arrayList.add(new L7(c4219y7, c4002u6, e9, new Throwable().getStackTrace()));
                arrayList.add(new L7(c4219y7, c4002u6, e9, view));
                arrayList.add(new N7(c4219y7, c4002u6, e9));
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33153t3)).booleanValue()) {
                    arrayList.add(new F7(c4219y7, c4002u6, e9, view, activity));
                }
                arrayList.add(new I7(c4219y7, c4002u6, e9, 5));
                if (!z6) {
                    arrayList.add(new L7(c4219y7, c4002u6, e9, f31962V));
                    arrayList.add(new L7(c4219y7, c4002u6, e9, this.f31976M));
                } else if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33171v3)).booleanValue()) {
                    arrayList.add(new O7(c4219y7, c4002u6, e9, this.f31978O));
                }
            }
            list = arrayList;
        } else {
            c4002u6.n(16384L);
            list = Arrays.asList(new E2.w(2, c4219y7, c4002u6));
        }
        r(list);
    }
}
