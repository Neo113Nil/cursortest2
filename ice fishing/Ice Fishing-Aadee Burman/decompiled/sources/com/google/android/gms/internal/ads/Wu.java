package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;
import p2.C4835j;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Wu implements Runnable {

    /* renamed from: C, reason: collision with root package name */
    public static final Object f28430C = new Object();

    /* renamed from: D, reason: collision with root package name */
    public static final Object f28431D = new Object();

    /* renamed from: E, reason: collision with root package name */
    public static final Object f28432E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static Boolean f28433F;

    /* renamed from: A, reason: collision with root package name */
    public final C2824Vh f28434A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f28436n;

    /* renamed from: u, reason: collision with root package name */
    public final C5110a f28437u;

    /* renamed from: x, reason: collision with root package name */
    public int f28440x;

    /* renamed from: y, reason: collision with root package name */
    public final C2731Pn f28441y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractCollection f28442z;

    /* renamed from: v, reason: collision with root package name */
    public final Zu f28438v = C3053cv.B();

    /* renamed from: w, reason: collision with root package name */
    public String f28439w = "";

    /* renamed from: B, reason: collision with root package name */
    public boolean f28435B = false;

    public Wu(Context context, C5110a c5110a, C2731Pn c2731Pn, C2866Yb c2866Yb, C2824Vh c2824Vh) {
        this.f28436n = context;
        this.f28437u = c5110a;
        this.f28441y = c2731Pn;
        this.f28434A = c2824Vh;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Z9)).booleanValue()) {
            this.f28442z = u2.D.H();
        } else {
            PB pb = RB.f27177u;
            this.f28442z = C3500lC.f31745x;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (f28430C) {
            try {
                if (f28433F == null) {
                    if (((Boolean) AbstractC2633Ka.f25927b.r()).booleanValue()) {
                        f28433F = Boolean.valueOf(Math.random() < ((Double) AbstractC2633Ka.f25926a.r()).doubleValue());
                    } else {
                        f28433F = Boolean.FALSE;
                    }
                }
                booleanValue = f28433F.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(Uu uu) {
        AbstractC3413jg.f31268a.a(new RunnableC3048cq(13, this, uu));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] b9;
        if (a()) {
            Object obj = f28431D;
            synchronized (obj) {
                try {
                    if (((C3053cv) this.f28438v.f27721u).A() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            Zu zu = this.f28438v;
                            b9 = ((C3053cv) zu.j()).b();
                            zu.h();
                            ((C3053cv) zu.f27721u).D();
                        }
                        C2597Hp c2597Hp = new C2597Hp((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.T9), 60000, new HashMap(), b9, "application/x-protobuf");
                        Context context = this.f28436n;
                        String str = this.f28437u.f41388n;
                        Binder.getCallingUid();
                        new C4274ze(12, context, str, (Object) null).m(c2597Hp);
                    } catch (Exception e9) {
                        if ((e9 instanceof C3208fp) && ((C3208fp) e9).f30455n == 3) {
                            return;
                        }
                        C4835j.f39730C.f39740h.e("CuiMonitor.sendCuiPing", e9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
