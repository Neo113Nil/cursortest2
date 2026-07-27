package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import n2.C4805a;
import n2.C4808d;
import q2.InterfaceC4876D;
import q2.InterfaceC4922x;

/* loaded from: classes2.dex */
public final class Ar extends q2.F {

    /* renamed from: n, reason: collision with root package name */
    public final Context f23906n;

    /* renamed from: u, reason: collision with root package name */
    public final C3214fi f23907u;

    /* renamed from: v, reason: collision with root package name */
    public final C3171eu f23908v;

    /* renamed from: w, reason: collision with root package name */
    public final A3 f23909w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4922x f23910x;

    public Ar(C3214fi c3214fi, Context context, String str) {
        C3171eu c3171eu = new C3171eu();
        this.f23908v = c3171eu;
        this.f23909w = new A3();
        this.f23907u = c3214fi;
        c3171eu.f30532c = str;
        this.f23906n = context;
    }

    @Override // q2.G
    public final void A2(InterfaceC4922x interfaceC4922x) {
        this.f23910x = interfaceC4922x;
    }

    @Override // q2.G
    public final void E3(C2532Ec c2532Ec) {
        this.f23909w.f23811x = c2532Ec;
    }

    @Override // q2.G
    public final void F0(C2582Hb c2582Hb, q2.g1 g1Var) {
        this.f23909w.f23810w = c2582Hb;
        this.f23908v.f30531b = g1Var;
    }

    @Override // q2.G
    public final void X0(C4805a c4805a) {
        C3171eu c3171eu = this.f23908v;
        c3171eu.f30538j = c4805a;
        if (c4805a != null) {
            c3171eu.f30534e = c4805a.f39629n;
        }
    }

    @Override // q2.G
    public final void a3(C2480Bb c2480Bb) {
        this.f23909w.f23807n = c2480Bb;
    }

    @Override // q2.G
    public final void b3(C2464Ac c2464Ac) {
        C3171eu c3171eu = this.f23908v;
        c3171eu.f30542n = c2464Ac;
        c3171eu.f30533d = new q2.a1(false, true, false);
    }

    @Override // q2.G
    public final InterfaceC4876D c() {
        A3 a32 = this.f23909w;
        a32.getClass();
        C4133wm c4133wm = new C4133wm(a32);
        ArrayList arrayList = new ArrayList();
        if (c4133wm.f35063c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (c4133wm.f35061a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (c4133wm.f35062b != null) {
            arrayList.add(Integer.toString(2));
        }
        s.k kVar = c4133wm.f35066f;
        if (!kVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (c4133wm.f35065e != null) {
            arrayList.add(Integer.toString(7));
        }
        C3171eu c3171eu = this.f23908v;
        c3171eu.f30535f = arrayList;
        ArrayList arrayList2 = new ArrayList(kVar.f40409v);
        for (int i = 0; i < kVar.f40409v; i++) {
            arrayList2.add((String) kVar.h(i));
        }
        c3171eu.f30536g = arrayList2;
        if (c3171eu.f30531b == null) {
            c3171eu.f30531b = q2.g1.a();
        }
        return new Br(this.f23906n, this.f23907u, c3171eu, c4133wm, this.f23910x);
    }

    @Override // q2.G
    public final void q1(C2463Ab c2463Ab) {
        this.f23909w.f23808u = c2463Ab;
    }

    @Override // q2.G
    public final void q2(InterfaceC2616Jb interfaceC2616Jb) {
        this.f23909w.f23809v = interfaceC2616Jb;
    }

    @Override // q2.G
    public final void s2(C4808d c4808d) {
        C3171eu c3171eu = this.f23908v;
        c3171eu.f30539k = c4808d;
        if (c4808d != null) {
            c3171eu.f30534e = c4808d.f39637n;
            c3171eu.f30540l = c4808d.f39638u;
        }
    }

    @Override // q2.G
    public final void t0(C3261gb c3261gb) {
        this.f23908v.f30537h = c3261gb;
    }

    @Override // q2.G
    public final void u3(String str, InterfaceC2548Fb interfaceC2548Fb, InterfaceC2514Db interfaceC2514Db) {
        A3 a32 = this.f23909w;
        ((s.k) a32.f23812y).put(str, interfaceC2548Fb);
        if (interfaceC2514Db != null) {
            ((s.k) a32.f23813z).put(str, interfaceC2514Db);
        }
    }

    @Override // q2.G
    public final void z3(q2.Y y6) {
        this.f23908v.f30552x = y6;
    }
}
