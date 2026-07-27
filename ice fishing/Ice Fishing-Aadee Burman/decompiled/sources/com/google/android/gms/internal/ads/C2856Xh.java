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
import q2.C4900p;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Xh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2856Xh implements InterfaceC3335i7 {

    /* renamed from: n, reason: collision with root package name */
    public final Context f28550n;

    /* renamed from: u, reason: collision with root package name */
    public final C3694or f28551u;

    public C2856Xh(Context context, C5110a c5110a) {
        int i;
        C3694or c3694or;
        this.f28550n = context;
        C3301ha c3301ha = AbstractC3569ma.z3;
        q2.r rVar = q2.r.f40204e;
        int intValue = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
        if (intValue != 1) {
            i = 3;
            if (intValue != 2 && intValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        C3325hy E8 = C3377iy.E();
        float floatValue = ((Float) rVar.f40207c.a(AbstractC3569ma.f32017F3)).floatValue();
        E8.h();
        ((C3377iy) E8.f27721u).G(floatValue);
        C3377iy c3377iy = (C3377iy) E8.j();
        C3431jy H8 = C3485ky.H();
        boolean booleanValue = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32026G3)).booleanValue();
        H8.h();
        ((C3485ky) H8.f27721u).J(booleanValue);
        long longValue = ((Long) rVar.f40207c.a(AbstractC3569ma.f32042I3)).longValue();
        H8.h();
        ((C3485ky) H8.f27721u).K(longValue);
        C3485ky c3485ky = (C3485ky) H8.j();
        Zx k02 = C2949ay.k0();
        k02.h();
        ((C2949ay) k02.f27721u).M(i);
        String str = c5110a.f41388n;
        k02.h();
        ((C2949ay) k02.f27721u).B(str);
        k02.h();
        ((C2949ay) k02.f27721u).N();
        boolean booleanValue2 = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32254g3)).booleanValue();
        k02.h();
        ((C2949ay) k02.f27721u).l0(booleanValue2);
        boolean booleanValue3 = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32049J3)).booleanValue();
        k02.h();
        ((C2949ay) k02.f27721u).m0(booleanValue3);
        boolean booleanValue4 = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32058K3)).booleanValue();
        k02.h();
        ((C2949ay) k02.f27721u).A(booleanValue4);
        boolean z3 = ((Integer) rVar.f40207c.a(AbstractC3569ma.f32401w3)).intValue() == -1;
        k02.h();
        ((C2949ay) k02.f27721u).H(z3);
        long intValue2 = ((Integer) rVar.f40207c.a(AbstractC3569ma.f32420y3)).intValue();
        k02.h();
        ((C2949ay) k02.f27721u).G(intValue2);
        long longValue2 = ((Long) rVar.f40207c.a(AbstractC3569ma.f32033H3)).longValue();
        k02.h();
        ((C2949ay) k02.f27721u).E(longValue2);
        long intValue3 = ((Integer) rVar.f40207c.a(AbstractC3569ma.f32410x3)).intValue();
        k02.h();
        ((C2949ay) k02.f27721u).D(intValue3);
        k02.h();
        ((C2949ay) k02.f27721u).C(c3377iy);
        k02.h();
        ((C2949ay) k02.f27721u).F(c3485ky);
        boolean booleanValue5 = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32318n4)).booleanValue();
        k02.h();
        ((C2949ay) k02.f27721u).I(booleanValue5);
        C2949ay c2949ay = (C2949ay) k02.j();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        synchronized (C3694or.f32951v) {
            try {
                if (C3694or.f32952w == null) {
                    C3694or.f32952w = new C3694or(context, c2949ay, c3360ig);
                }
                c3694or = C3694or.f32952w;
            } finally {
            }
        }
        this.f28551u = c3694or;
        By by = ((Yx) c3694or.f32954u).f28765a;
        synchronized (by) {
            try {
                if (by.f23994e != null) {
                    return;
                }
                Set set = (Set) by.f23991b.f();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Ay) it.next()).c());
                }
                C3983uA c3983uA = (C3983uA) by.f23993d.f();
                C3932tD u3 = QC.u(new CD(RB.n(arrayList), true), L2.f26038t, by.f23992c);
                c3983uA.e(2, u3);
                by.f23994e = u3;
                Iterator it2 = ((Set) by.f23990a.f()).iterator();
                while (it2.hasNext()) {
                    ((Ay) it2.next()).c();
                }
                if (by.f23994e != null) {
                } else {
                    throw null;
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void a(int i, int i6, int i9) {
        v2.d dVar = C4900p.f40196g.f40197a;
        Context context = this.f28550n;
        long j6 = i9;
        MotionEvent obtain = MotionEvent.obtain(0L, j6, 0, v2.d.b(context, i), v2.d.r(context.getResources().getDisplayMetrics(), i6), 0);
        C3694or c3694or = this.f28551u;
        c3694or.J(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j6, 2, v2.d.r(context.getResources().getDisplayMetrics(), i), v2.d.r(context.getResources().getDisplayMetrics(), i6), 0);
        c3694or.J(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j6, 1, v2.d.r(context.getResources().getDisplayMetrics(), i), v2.d.r(context.getResources().getDisplayMetrics(), i6), 0);
        c3694or.J(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f28551u.J(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String c(Context context, String str, View view, Activity activity) {
        return this.f28551u.H(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String d(Context context) {
        return this.f28551u.G(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        C3694or c3694or = this.f28551u;
        List asList = Arrays.asList(stackTraceElementArr);
        C3714pA c3714pA = ((Yx) c3694or.f32954u).f28767c.f31742b;
        synchronized (c3714pA) {
            ArrayList arrayList = c3714pA.f33034a;
            arrayList.clear();
            arrayList.addAll(asList);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String f(Context context) {
        return this.f28551u.G(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final void g(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String h(Context context, String str, View view) {
        return this.f28551u.H(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335i7
    public final String i(Context context, View view, Activity activity) {
        String num;
        C3932tD c3932tD;
        Yx yx = (Yx) this.f28551u.f32954u;
        InterfaceC3809qy interfaceC3809qy = yx.f28769e;
        C3983uA c3983uA = yx.f28768d;
        C3929tA a9 = c3983uA.a(4);
        try {
            try {
                try {
                    a9.a();
                    By by = yx.f28765a;
                    synchronized (by) {
                        c3932tD = by.f23994e;
                        if (c3932tD == null) {
                            throw null;
                        }
                    }
                    num = (String) QC.t(c3932tD, new C3196fd(yx, context, view, activity, 6), GD.f24952n).get(yx.f28770f, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    c3983uA.b(57);
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
            interfaceC3809qy.f();
            return num;
        } catch (Throwable th3) {
            a9.c();
            interfaceC3809qy.f();
            throw th3;
        }
    }
}
