package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;
import r2.C4906k;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Wu implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final Object f29212C = new Object();

    /* renamed from: D, reason: collision with root package name */
    public static final Object f29213D = new Object();

    /* renamed from: E, reason: collision with root package name */
    public static final Object f29214E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static Boolean f29215F;

    /* renamed from: A, reason: collision with root package name */
    public final C2847Vh f29216A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f29218n;

    /* renamed from: u, reason: collision with root package name */
    public final C5189a f29219u;

    /* renamed from: x, reason: collision with root package name */
    public int f29222x;

    /* renamed from: y, reason: collision with root package name */
    public final C2768Qn f29223y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractCollection f29224z;

    /* renamed from: v, reason: collision with root package name */
    public final Zu f29220v = C3076cv.B();

    /* renamed from: w, reason: collision with root package name */
    public String f29221w = "";

    /* renamed from: B, reason: collision with root package name */
    public boolean f29217B = false;

    public Wu(Context context, C5189a c5189a, C2768Qn c2768Qn, C2889Yb c2889Yb, C2847Vh c2847Vh) {
        this.f29218n = context;
        this.f29219u = c5189a;
        this.f29223y = c2768Qn;
        this.f29216A = c2847Vh;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Z9)).booleanValue()) {
            this.f29224z = w2.D.H();
        } else {
            PB pb = RB.f27933u;
            this.f29224z = C3523lC.f32525x;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (f29212C) {
            try {
                if (f29215F == null) {
                    if (((Boolean) AbstractC2653Ka.f26705b.r()).booleanValue()) {
                        f29215F = Boolean.valueOf(Math.random() < ((Double) AbstractC2653Ka.f26704a.r()).doubleValue());
                    } else {
                        f29215F = Boolean.FALSE;
                    }
                }
                booleanValue = f29215F.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(Uu uu) {
        AbstractC3436jg.f32055a.a(new RunnableC3071cq(13, this, uu));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] b9;
        if (a()) {
            Object obj = f29213D;
            synchronized (obj) {
                try {
                    if (((C3076cv) this.f29220v.f28504u).A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            Zu zu = this.f29220v;
                            b9 = ((C3076cv) zu.j()).b();
                            zu.h();
                            ((C3076cv) zu.f28504u).D();
                        }
                        C2617Hp c2617Hp = new C2617Hp((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.T9), 60000, new HashMap(), b9, "application/x-protobuf");
                        Context context = this.f29218n;
                        String str = this.f29219u.f41845n;
                        Binder.getCallingUid();
                        new C4297ze(12, context, str, (Object) null).m(c2617Hp);
                    } catch (Exception e9) {
                        if ((e9 instanceof C3231fp) && ((C3231fp) e9).f31218n == 3) {
                            return;
                        }
                        C4906k.f40186C.f40196h.e("CuiMonitor.sendCuiPing", e9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
