package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import p2.C4830a;
import p2.C4833d;
import s2.InterfaceC4964x;

/* renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4310zr extends s2.F {

    /* renamed from: n, reason: collision with root package name */
    public final Context f36230n;

    /* renamed from: u, reason: collision with root package name */
    public final C3332hi f36231u;

    /* renamed from: v, reason: collision with root package name */
    public final C3022bu f36232v;

    /* renamed from: w, reason: collision with root package name */
    public final C3 f36233w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC4964x f36234x;

    public BinderC4310zr(C3332hi c3332hi, Context context, String str) {
        C3022bu c3022bu = new C3022bu();
        this.f36232v = c3022bu;
        this.f36233w = new C3();
        this.f36231u = c3332hi;
        c3022bu.f30133c = str;
        this.f36230n = context;
    }

    @Override // s2.G
    public final void E0(C2638Jc c2638Jc) {
        this.f36233w.f24787x = c2638Jc;
    }

    @Override // s2.G
    public final void H2(InterfaceC2705Nb interfaceC2705Nb) {
        this.f36233w.f24785v = interfaceC2705Nb;
    }

    @Override // s2.G
    public final void H3(C3485kb c3485kb) {
        this.f36232v.f30138h = c3485kb;
    }

    @Override // s2.G
    public final void J1(String str, InterfaceC2637Jb interfaceC2637Jb, InterfaceC2603Hb interfaceC2603Hb) {
        C3 c32 = this.f36233w;
        ((s.k) c32.f24788y).put(str, interfaceC2637Jb);
        if (interfaceC2603Hb != null) {
            ((s.k) c32.f24789z).put(str, interfaceC2603Hb);
        }
    }

    @Override // s2.G
    public final void M0(InterfaceC4964x interfaceC4964x) {
        this.f36234x = interfaceC4964x;
    }

    @Override // s2.G
    public final void O1(C4833d c4833d) {
        C3022bu c3022bu = this.f36232v;
        c3022bu.f30140k = c4833d;
        if (c4833d != null) {
            c3022bu.f30135e = c4833d.f39808n;
            c3022bu.f30141l = c4833d.f39809u;
        }
    }

    @Override // s2.G
    public final void R0(s2.Y y7) {
        this.f36232v.f30153x = y7;
    }

    @Override // s2.G
    public final void T2(C2569Fb c2569Fb) {
        this.f36233w.f24783n = c2569Fb;
    }

    @Override // s2.G
    public final void Z0(C2552Eb c2552Eb) {
        this.f36233w.f24784u = c2552Eb;
    }

    @Override // s2.G
    public final s2.D d() {
        C3 c32 = this.f36233w;
        c32.getClass();
        C2495Am c2495Am = new C2495Am(c32);
        ArrayList arrayList = new ArrayList();
        if (c2495Am.f24512c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (c2495Am.f24510a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (c2495Am.f24511b != null) {
            arrayList.add(Integer.toString(2));
        }
        s.k kVar = c2495Am.f24515f;
        if (!kVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (c2495Am.f24514e != null) {
            arrayList.add(Integer.toString(7));
        }
        C3022bu c3022bu = this.f36232v;
        c3022bu.f30136f = arrayList;
        ArrayList arrayList2 = new ArrayList(kVar.f40276v);
        for (int i = 0; i < kVar.f40276v; i++) {
            arrayList2.add((String) kVar.h(i));
        }
        c3022bu.f30137g = arrayList2;
        if (c3022bu.f30132b == null) {
            c3022bu.f30132b = s2.f1.a();
        }
        return new Ar(this.f36230n, this.f36231u, c3022bu, c2495Am, this.f36234x);
    }

    @Override // s2.G
    public final void f1(C2671Lb c2671Lb, s2.f1 f1Var) {
        this.f36233w.f24786w = c2671Lb;
        this.f36232v.f30132b = f1Var;
    }

    @Override // s2.G
    public final void t2(C2570Fc c2570Fc) {
        C3022bu c3022bu = this.f36232v;
        c3022bu.f30143n = c2570Fc;
        c3022bu.f30134d = new s2.Z0(false, true, false);
    }

    @Override // s2.G
    public final void u2(C4830a c4830a) {
        C3022bu c3022bu = this.f36232v;
        c3022bu.f30139j = c4830a;
        if (c4830a != null) {
            c3022bu.f30135e = c4830a.f39800n;
        }
    }
}
