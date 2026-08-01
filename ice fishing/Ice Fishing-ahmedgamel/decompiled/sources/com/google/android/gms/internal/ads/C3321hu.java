package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.hu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3321hu {

    /* renamed from: a, reason: collision with root package name */
    public final St f30964a;

    /* renamed from: b, reason: collision with root package name */
    public final Ut f30965b;

    /* renamed from: c, reason: collision with root package name */
    public final C4237yv f30966c;

    /* renamed from: d, reason: collision with root package name */
    public final C4129wv f30967d;

    /* renamed from: e, reason: collision with root package name */
    public final Vu f30968e;

    /* renamed from: f, reason: collision with root package name */
    public final C2692Ni f30969f;

    public C3321hu(C4237yv c4237yv, C4129wv c4129wv, St st, Ut ut, C2692Ni c2692Ni, Vu vu) {
        this.f30964a = st;
        this.f30965b = ut;
        this.f30966c = c4237yv;
        this.f30967d = c4129wv;
        this.f30969f = c2692Ni;
        this.f30968e = vu;
    }

    public final void a(ArrayList arrayList, C2779Sk c2779Sk) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            St st = this.f30964a;
            if (st.f27622i0) {
                String str2 = this.f30965b.f28004b;
                C4129wv c4129wv = this.f30967d;
                c4129wv.getClass();
                C4835j.f39733C.f39745k.getClass();
                C3709p5 c3709p5 = new C3709p5(str2, str, 2, System.currentTimeMillis());
                C2800Tp c2800Tp = c4129wv.f34903a;
                c2800Tp.getClass();
                c2800Tp.a(new S0.l(14, c2800Tp, c3709p5));
            } else {
                this.f30966c.b(str, st.f27651x0, this.f30968e, c2779Sk);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        N3.a c9;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.vb)).booleanValue() && C2692Ni.b(str)) {
                c9 = this.f30969f.a(str, C4900p.f40199g.f40204e);
            } else {
                c9 = QC.c(str);
            }
            G1.a aVar = new G1.a(this, i);
            c9.a(new LD(0, c9, aVar), AbstractC3413jg.f31268a);
        }
    }
}
