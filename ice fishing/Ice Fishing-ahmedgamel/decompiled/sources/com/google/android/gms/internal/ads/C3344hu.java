package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.hu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3344hu {

    /* renamed from: a, reason: collision with root package name */
    public final St f31738a;

    /* renamed from: b, reason: collision with root package name */
    public final Ut f31739b;

    /* renamed from: c, reason: collision with root package name */
    public final C4260yv f31740c;

    /* renamed from: d, reason: collision with root package name */
    public final C4152wv f31741d;

    /* renamed from: e, reason: collision with root package name */
    public final Vu f31742e;

    /* renamed from: f, reason: collision with root package name */
    public final C2712Ni f31743f;

    public C3344hu(C4260yv c4260yv, C4152wv c4152wv, St st, Ut ut, C2712Ni c2712Ni, Vu vu) {
        this.f31738a = st;
        this.f31739b = ut;
        this.f31740c = c4260yv;
        this.f31741d = c4152wv;
        this.f31743f = c2712Ni;
        this.f31742e = vu;
    }

    public final void a(ArrayList arrayList, C2799Sk c2799Sk) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            St st = this.f31738a;
            if (st.f28405i0) {
                String str2 = this.f31739b.f28801b;
                C4152wv c4152wv = this.f31741d;
                c4152wv.getClass();
                C4906k.f40186C.f40198k.getClass();
                C3732p5 c3732p5 = new C3732p5(str2, str, 2, System.currentTimeMillis());
                C2821Tp c2821Tp = c4152wv.f35684a;
                c2821Tp.getClass();
                c2821Tp.a(new S0.l(17, c2821Tp, c3732p5));
            } else {
                this.f31740c.b(str, st.f28434x0, this.f31742e, c2799Sk);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        P3.a c9;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vb)).booleanValue() && C2712Ni.b(str)) {
                c9 = this.f31743f.a(str, C4949p.f40498g.f40503e);
            } else {
                c9 = QC.c(str);
            }
            I1.a aVar = new I1.a(this, i);
            c9.a(new LD(0, c9, aVar), AbstractC3436jg.f32055a);
        }
    }
}
