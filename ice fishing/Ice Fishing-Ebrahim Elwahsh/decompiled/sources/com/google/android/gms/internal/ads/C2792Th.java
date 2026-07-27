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
import q2.C4907p;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Th, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2792Th implements InterfaceC3240g7 {

    /* renamed from: n, reason: collision with root package name */
    public final Context f27800n;

    /* renamed from: u, reason: collision with root package name */
    public final C3761pr f27801u;

    public C2792Th(Context context, C5107a c5107a) {
        int i;
        C3761pr c3761pr;
        this.f27800n = context;
        C3151ea c3151ea = AbstractC3368ia.f31846z3;
        q2.r rVar = q2.r.f40116e;
        int intValue = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
        if (intValue != 1) {
            i = 3;
            if (intValue != 2 && intValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        C3444jy E8 = C3498ky.E();
        float floatValue = ((Float) rVar.f40119c.a(AbstractC3368ia.f31437F3)).floatValue();
        E8.h();
        ((C3498ky) E8.f30000u).G(floatValue);
        C3498ky c3498ky = (C3498ky) E8.j();
        C3552ly H6 = C3606my.H();
        boolean booleanValue = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31446G3)).booleanValue();
        H6.h();
        ((C3606my) H6.f30000u).J(booleanValue);
        long longValue = ((Long) rVar.f40119c.a(AbstractC3368ia.f31460I3)).longValue();
        H6.h();
        ((C3606my) H6.f30000u).K(longValue);
        C3606my c3606my = (C3606my) H6.j();
        C2957ay k02 = C3066cy.k0();
        k02.h();
        ((C3066cy) k02.f30000u).M(i);
        String str = c5107a.f41217n;
        k02.h();
        ((C3066cy) k02.f30000u).B(str);
        k02.h();
        ((C3066cy) k02.f30000u).N();
        boolean booleanValue2 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31672g3)).booleanValue();
        k02.h();
        ((C3066cy) k02.f30000u).l0(booleanValue2);
        boolean booleanValue3 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31468J3)).booleanValue();
        k02.h();
        ((C3066cy) k02.f30000u).m0(booleanValue3);
        boolean booleanValue4 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31477K3)).booleanValue();
        k02.h();
        ((C3066cy) k02.f30000u).A(booleanValue4);
        boolean z8 = ((Integer) rVar.f40119c.a(AbstractC3368ia.f31819w3)).intValue() == -1;
        k02.h();
        ((C3066cy) k02.f30000u).H(z8);
        long intValue2 = ((Integer) rVar.f40119c.a(AbstractC3368ia.f31838y3)).intValue();
        k02.h();
        ((C3066cy) k02.f30000u).G(intValue2);
        long longValue2 = ((Long) rVar.f40119c.a(AbstractC3368ia.f31453H3)).longValue();
        k02.h();
        ((C3066cy) k02.f30000u).E(longValue2);
        long intValue3 = ((Integer) rVar.f40119c.a(AbstractC3368ia.x3)).intValue();
        k02.h();
        ((C3066cy) k02.f30000u).D(intValue3);
        k02.h();
        ((C3066cy) k02.f30000u).C(c3498ky);
        k02.h();
        ((C3066cy) k02.f30000u).F(c3606my);
        boolean booleanValue5 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31737n4)).booleanValue();
        k02.h();
        ((C3066cy) k02.f30000u).I(booleanValue5);
        C3066cy c3066cy = (C3066cy) k02.j();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        synchronized (C3761pr.f33520v) {
            try {
                if (C3761pr.f33521w == null) {
                    C3761pr.f33521w = new C3761pr(context, c3066cy, c3157eg);
                }
                c3761pr = C3761pr.f33521w;
            } finally {
            }
        }
        this.f27801u = c3761pr;
        Cy cy = ((Zx) c3761pr.f33523u).f29115a;
        synchronized (cy) {
            try {
                if (cy.f24284e != null) {
                    return;
                }
                Set set = (Set) cy.f24281b.d();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((By) it.next()).a());
                }
                C4158xA c4158xA = (C4158xA) cy.f24283d.d();
                C3999uD A8 = C3686oN.A(new DD(UB.n(arrayList), true), J2.f25708t, cy.f24282c);
                c4158xA.e(2, A8);
                cy.f24284e = A8;
                Iterator it2 = ((Set) cy.f24280a.d()).iterator();
                while (it2.hasNext()) {
                    ((By) it2.next()).a();
                }
                if (cy.f24284e != null) {
                } else {
                    throw null;
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void a(int i, int i4, int i9) {
        u2.d dVar = C4907p.f40108g.f40109a;
        Context context = this.f27800n;
        long j9 = i9;
        MotionEvent obtain = MotionEvent.obtain(0L, j9, 0, u2.d.b(context, i), u2.d.q(context.getResources().getDisplayMetrics(), i4), 0);
        C3761pr c3761pr = this.f27801u;
        c3761pr.L(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j9, 2, u2.d.q(context.getResources().getDisplayMetrics(), i), u2.d.q(context.getResources().getDisplayMetrics(), i4), 0);
        c3761pr.L(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j9, 1, u2.d.q(context.getResources().getDisplayMetrics(), i), u2.d.q(context.getResources().getDisplayMetrics(), i4), 0);
        c3761pr.L(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f27801u.L(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String c(Context context, String str, View view, Activity activity) {
        return this.f27801u.K(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String d(Context context) {
        return this.f27801u.I(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void e(StackTraceElement[] stackTraceElementArr) {
        C3761pr c3761pr = this.f27801u;
        List asList = Arrays.asList(stackTraceElementArr);
        C3888sA c3888sA = ((Zx) c3761pr.f33523u).f29117c.f32840b;
        synchronized (c3888sA) {
            ArrayList arrayList = c3888sA.f34206a;
            arrayList.clear();
            arrayList.addAll(asList);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String f(Context context) {
        return this.f27801u.I(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final void g(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String h(Context context, String str, View view) {
        return this.f27801u.K(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3240g7
    public final String i(Context context, View view, Activity activity) {
        String num;
        C3999uD c3999uD;
        Zx zx = (Zx) this.f27801u.f33523u;
        InterfaceC3929sy interfaceC3929sy = zx.f29119e;
        C4158xA c4158xA = zx.f29118d;
        C4104wA a9 = c4158xA.a(4);
        try {
            try {
                try {
                    a9.a();
                    Cy cy = zx.f29115a;
                    synchronized (cy) {
                        c3999uD = cy.f24284e;
                        if (c3999uD == null) {
                            throw null;
                        }
                    }
                    num = (String) C3686oN.y(c3999uD, new C2889Zc(zx, context, view, activity, 6), HD.f25326n).get(zx.f29120f, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    c4158xA.b(57);
                    num = Integer.toString(17);
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                a9.b(e6);
                num = "";
            } catch (ExecutionException e9) {
                Throwable th2 = e9;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                a9.b(th2);
                num = Integer.toString(3);
            }
            a9.c();
            interfaceC3929sy.d();
            return num;
        } catch (Throwable th3) {
            a9.c();
            interfaceC3929sy.d();
            throw th3;
        }
    }
}
