package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import n2.C4750a;
import n2.C4753d;
import q2.InterfaceC4915x;

/* renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4287zr extends q2.F {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35461n;

    /* renamed from: u, reason: collision with root package name */
    public final C3309hi f35462u;

    /* renamed from: v, reason: collision with root package name */
    public final C2999bu f35463v;

    /* renamed from: w, reason: collision with root package name */
    public final C3 f35464w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4915x f35465x;

    public BinderC4287zr(C3309hi c3309hi, Context context, String str) {
        C2999bu c2999bu = new C2999bu();
        this.f35463v = c2999bu;
        this.f35464w = new C3();
        this.f35462u = c3309hi;
        c2999bu.f29345c = str;
        this.f35461n = context;
    }

    @Override // q2.G
    public final void G0(C2618Jc c2618Jc) {
        this.f35464w.f24024x = c2618Jc;
    }

    @Override // q2.G
    public final void G2(InterfaceC4915x interfaceC4915x) {
        this.f35465x = interfaceC4915x;
    }

    @Override // q2.G
    public final void J2(InterfaceC2685Nb interfaceC2685Nb) {
        this.f35464w.f24022v = interfaceC2685Nb;
    }

    @Override // q2.G
    public final void J3(C3462kb c3462kb) {
        this.f35463v.f29350h = c3462kb;
    }

    @Override // q2.G
    public final void L3(q2.Y y7) {
        this.f35463v.f29365x = y7;
    }

    @Override // q2.G
    public final void N1(String str, InterfaceC2617Jb interfaceC2617Jb, InterfaceC2583Hb interfaceC2583Hb) {
        C3 c32 = this.f35464w;
        ((s.k) c32.f24025y).put(str, interfaceC2617Jb);
        if (interfaceC2583Hb != null) {
            ((s.k) c32.f24026z).put(str, interfaceC2583Hb);
        }
    }

    @Override // q2.G
    public final void Y0(C2532Eb c2532Eb) {
        this.f35464w.f24021u = c2532Eb;
    }

    @Override // q2.G
    public final void Z0(C4750a c4750a) {
        C2999bu c2999bu = this.f35463v;
        c2999bu.f29351j = c4750a;
        if (c4750a != null) {
            c2999bu.f29347e = c4750a.f39460n;
        }
    }

    @Override // q2.G
    public final void a3(C2549Fb c2549Fb) {
        this.f35464w.f24020n = c2549Fb;
    }

    @Override // q2.G
    public final q2.D d() {
        C3 c32 = this.f35464w;
        c32.getClass();
        C4282zm c4282zm = new C4282zm(c32);
        ArrayList arrayList = new ArrayList();
        if (c4282zm.f35446c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (c4282zm.f35444a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (c4282zm.f35445b != null) {
            arrayList.add(Integer.toString(2));
        }
        s.k kVar = c4282zm.f35449f;
        if (!kVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (c4282zm.f35448e != null) {
            arrayList.add(Integer.toString(7));
        }
        C2999bu c2999bu = this.f35463v;
        c2999bu.f29348f = arrayList;
        ArrayList arrayList2 = new ArrayList(kVar.f40440v);
        for (int i = 0; i < kVar.f40440v; i++) {
            arrayList2.add((String) kVar.h(i));
        }
        c2999bu.f29349g = arrayList2;
        if (c2999bu.f29344b == null) {
            c2999bu.f29344b = q2.f1.a();
        }
        return new Ar(this.f35461n, this.f35462u, c2999bu, c4282zm, this.f35465x);
    }

    @Override // q2.G
    public final void g2(C2651Lb c2651Lb, q2.f1 f1Var) {
        this.f35464w.f24023w = c2651Lb;
        this.f35463v.f29344b = f1Var;
    }

    @Override // q2.G
    public final void w2(C2550Fc c2550Fc) {
        C2999bu c2999bu = this.f35463v;
        c2999bu.f29355n = c2550Fc;
        c2999bu.f29346d = new q2.Z0(false, true, false);
    }

    @Override // q2.G
    public final void x2(C4753d c4753d) {
        C2999bu c2999bu = this.f35463v;
        c2999bu.f29352k = c4753d;
        if (c4753d != null) {
            c2999bu.f29347e = c4753d.f39468n;
            c2999bu.f29353l = c4753d.f39469u;
        }
    }
}
