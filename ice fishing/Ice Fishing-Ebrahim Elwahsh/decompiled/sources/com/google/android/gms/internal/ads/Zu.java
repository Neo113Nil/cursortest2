package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Zu implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final Object f29090C = new Object();

    /* renamed from: D, reason: collision with root package name */
    public static final Object f29091D = new Object();

    /* renamed from: E, reason: collision with root package name */
    public static final Object f29092E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static Boolean f29093F;

    /* renamed from: A, reason: collision with root package name */
    public final C2775Sh f29094A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f29096n;

    /* renamed from: u, reason: collision with root package name */
    public final C5107a f29097u;

    /* renamed from: x, reason: collision with root package name */
    public int f29100x;

    /* renamed from: y, reason: collision with root package name */
    public final C2764Rn f29101y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractCollection f29102z;

    /* renamed from: v, reason: collision with root package name */
    public final C3063cv f29098v = C3227fv.B();

    /* renamed from: w, reason: collision with root package name */
    public String f29099w = "";

    /* renamed from: B, reason: collision with root package name */
    public boolean f29095B = false;

    public Zu(Context context, C5107a c5107a, C2764Rn c2764Rn, C2837Wb c2837Wb, C2775Sh c2775Sh) {
        this.f29096n = context;
        this.f29097u = c5107a;
        this.f29101y = c2764Rn;
        this.f29094A = c2775Sh;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Z9)).booleanValue()) {
            this.f29102z = t2.G.H();
        } else {
            SB sb = UB.f27942u;
            this.f29102z = C3675oC.f33115x;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (f29090C) {
            try {
                if (f29093F == null) {
                    if (((Boolean) AbstractC2547Fa.f24965b.r()).booleanValue()) {
                        f29093F = Boolean.valueOf(Math.random() < ((Double) AbstractC2547Fa.f24964a.r()).doubleValue());
                    } else {
                        f29093F = Boolean.FALSE;
                    }
                }
                booleanValue = f29093F.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(Xu xu) {
        AbstractC3212fg.f30738a.a(new RunnableC3329hp(14, this, xu));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] b9;
        if (a()) {
            Object obj = f29091D;
            synchronized (obj) {
                try {
                    if (((C3227fv) this.f29098v.f30000u).A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            C3063cv c3063cv = this.f29098v;
                            b9 = ((C3227fv) c3063cv.j()).b();
                            c3063cv.h();
                            ((C3227fv) c3063cv.f30000u).D();
                        }
                        C2647Kp c2647Kp = new C2647Kp((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.T9), 60000, new HashMap(), b9, "application/x-protobuf");
                        Context context = this.f29096n;
                        String str = this.f29097u.f41217n;
                        Binder.getCallingUid();
                        new C4017ue(context, str, (Object) null, 12).n(c2647Kp);
                    } catch (Exception e6) {
                        if ((e6 instanceof C3275gp) && ((C3275gp) e6).f31103n == 3) {
                            return;
                        }
                        p2.j.f39798C.f39808h.e("CuiMonitor.sendCuiPing", e6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
