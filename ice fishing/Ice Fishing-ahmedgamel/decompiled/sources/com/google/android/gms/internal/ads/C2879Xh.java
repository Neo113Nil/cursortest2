package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s2.C4949p;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Xh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2879Xh implements InterfaceC3358i7 {

    /* renamed from: n, reason: collision with root package name */
    public final Context f29322n;

    /* renamed from: u, reason: collision with root package name */
    public final C3717or f29323u;

    public C2879Xh(Context context, C5189a c5189a) {
        int i;
        C3717or c3717or;
        this.f29322n = context;
        C3324ha c3324ha = AbstractC3592ma.f33208z3;
        s2.r rVar = s2.r.f40506e;
        int intValue = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
        if (intValue != 1) {
            i = 3;
            if (intValue != 2 && intValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        C3348hy E8 = C3400iy.E();
        float floatValue = ((Float) rVar.f40509c.a(AbstractC3592ma.f32798F3)).floatValue();
        E8.h();
        ((C3400iy) E8.f28504u).G(floatValue);
        C3400iy c3400iy = (C3400iy) E8.j();
        C3454jy H8 = C3508ky.H();
        boolean booleanValue = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f32805G3)).booleanValue();
        H8.h();
        ((C3508ky) H8.f28504u).J(booleanValue);
        long longValue = ((Long) rVar.f40509c.a(AbstractC3592ma.f32822I3)).longValue();
        H8.h();
        ((C3508ky) H8.f28504u).K(longValue);
        C3508ky c3508ky = (C3508ky) H8.j();
        Zx k02 = C2972ay.k0();
        k02.h();
        ((C2972ay) k02.f28504u).M(i);
        String str = c5189a.f41845n;
        k02.h();
        ((C2972ay) k02.f28504u).B(str);
        k02.h();
        ((C2972ay) k02.f28504u).N();
        boolean booleanValue2 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33034g3)).booleanValue();
        k02.h();
        ((C2972ay) k02.f28504u).l0(booleanValue2);
        boolean booleanValue3 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f32829J3)).booleanValue();
        k02.h();
        ((C2972ay) k02.f28504u).m0(booleanValue3);
        boolean booleanValue4 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f32838K3)).booleanValue();
        k02.h();
        ((C2972ay) k02.f28504u).A(booleanValue4);
        boolean z6 = ((Integer) rVar.f40509c.a(AbstractC3592ma.w3)).intValue() == -1;
        k02.h();
        ((C2972ay) k02.f28504u).H(z6);
        long intValue2 = ((Integer) rVar.f40509c.a(AbstractC3592ma.f33199y3)).intValue();
        k02.h();
        ((C2972ay) k02.f28504u).G(intValue2);
        long longValue2 = ((Long) rVar.f40509c.a(AbstractC3592ma.f32813H3)).longValue();
        k02.h();
        ((C2972ay) k02.f28504u).E(longValue2);
        long intValue3 = ((Integer) rVar.f40509c.a(AbstractC3592ma.f33189x3)).intValue();
        k02.h();
        ((C2972ay) k02.f28504u).D(intValue3);
        k02.h();
        ((C2972ay) k02.f28504u).C(c3400iy);
        k02.h();
        ((C2972ay) k02.f28504u).F(c3508ky);
        boolean booleanValue5 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33099n4)).booleanValue();
        k02.h();
        ((C2972ay) k02.f28504u).I(booleanValue5);
        C2972ay c2972ay = (C2972ay) k02.j();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        synchronized (C3717or.f33737v) {
            try {
                if (C3717or.f33738w == null) {
                    C3717or.f33738w = new C3717or(context, c2972ay, c3383ig);
                }
                c3717or = C3717or.f33738w;
            } finally {
            }
        }
        this.f29323u = c3717or;
        By by = ((Yx) c3717or.f33740u).f29545a;
        synchronized (by) {
            try {
                if (by.f24757e != null) {
                    return;
                }
                Set set = (Set) by.f24754b.f();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Ay) it.next()).c());
                }
                C4006uA c4006uA = (C4006uA) by.f24756d.f();
                C3955tD u6 = QC.u(new CD(RB.n(arrayList), true), L2.f26838t, by.f24755c);
                c4006uA.e(2, u6);
                by.f24757e = u6;
                Iterator it2 = ((Set) by.f24753a.f()).iterator();
                while (it2.hasNext()) {
                    ((Ay) it2.next()).c();
                }
                if (by.f24757e != null) {
                } else {
                    throw null;
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void a(int i, int i4, int i6) {
        x2.d dVar = C4949p.f40498g.f40499a;
        Context context = this.f29322n;
        long j6 = i6;
        MotionEvent obtain = MotionEvent.obtain(0L, j6, 0, x2.d.b(context, i), x2.d.r(context.getResources().getDisplayMetrics(), i4), 0);
        C3717or c3717or = this.f29323u;
        c3717or.K(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j6, 2, x2.d.r(context.getResources().getDisplayMetrics(), i), x2.d.r(context.getResources().getDisplayMetrics(), i4), 0);
        c3717or.K(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j6, 1, x2.d.r(context.getResources().getDisplayMetrics(), i), x2.d.r(context.getResources().getDisplayMetrics(), i4), 0);
        c3717or.K(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f29323u.K(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String c(Context context, String str, View view, Activity activity) {
        return this.f29323u.I(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String d(Context context) {
        return this.f29323u.G(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        C3717or c3717or = this.f29323u;
        List asList = Arrays.asList(stackTraceElementArr);
        C3737pA c3737pA = ((Yx) c3717or.f33740u).f29547c.f32522b;
        synchronized (c3737pA) {
            ArrayList arrayList = c3737pA.f33824a;
            arrayList.clear();
            arrayList.addAll(asList);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String f(Context context) {
        return this.f29323u.G(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final void g(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String h(Context context, String str, View view) {
        return this.f29323u.I(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358i7
    public final String i(Context context, View view, Activity activity) {
        String num;
        C3955tD c3955tD;
        Yx yx = (Yx) this.f29323u.f33740u;
        InterfaceC3832qy interfaceC3832qy = yx.f29549e;
        C4006uA c4006uA = yx.f29548d;
        C3952tA a9 = c4006uA.a(4);
        try {
            try {
                try {
                    a9.a();
                    By by = yx.f29545a;
                    synchronized (by) {
                        c3955tD = by.f24757e;
                        if (c3955tD == null) {
                            throw null;
                        }
                    }
                    num = (String) QC.t(c3955tD, new C3219fd(yx, context, view, activity, 6), GD.f25742n).get(yx.f29550f, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    c4006uA.b(57);
                    num = Integer.toString(17);
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                a9.b(e9);
                num = "";
            } catch (ExecutionException e10) {
                Throwable th2 = e10;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                a9.b(th2);
                num = Integer.toString(3);
            }
            a9.c();
            interfaceC3832qy.f();
            return num;
        } catch (Throwable th3) {
            a9.c();
            interfaceC3832qy.f();
            throw th3;
        }
    }
}
