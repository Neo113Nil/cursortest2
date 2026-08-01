package h1;

import d1.C4444b;
import d1.C4445c;
import i1.C4580b;
import java.util.ArrayList;
import k1.C4629a;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4558a {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.l f37950a = S0.l.F("k", "x", "y");

    public static C4445c a(C4580b c4580b, X0.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (c4580b.I() == 1) {
            c4580b.b();
            while (c4580b.D()) {
                C4580b c4580b2 = c4580b;
                X0.i iVar2 = iVar;
                arrayList.add(new a1.l(iVar2, o.b(c4580b2, iVar2, j1.j.c(), f.f37962x, c4580b.I() == 3, false)));
                c4580b = c4580b2;
                iVar = iVar2;
            }
            c4580b.z();
            p.b(arrayList);
        } else {
            arrayList.add(new C4629a(n.b(c4580b, j1.j.c())));
        }
        return new C4445c(arrayList);
    }

    public static d1.f b(C4580b c4580b, X0.i iVar) {
        c4580b.j();
        C4445c c4445c = null;
        C4444b c4444b = null;
        boolean z3 = false;
        C4444b c4444b2 = null;
        while (c4580b.I() != 4) {
            int K7 = c4580b.K(f37950a);
            if (K7 == 0) {
                c4445c = a(c4580b, iVar);
            } else if (K7 != 1) {
                if (K7 != 2) {
                    c4580b.V();
                    c4580b.W();
                } else if (c4580b.I() == 6) {
                    c4580b.W();
                    z3 = true;
                } else {
                    c4444b = com.bumptech.glide.f.q(c4580b, iVar, true);
                }
            } else if (c4580b.I() == 6) {
                c4580b.W();
                z3 = true;
            } else {
                c4444b2 = com.bumptech.glide.f.q(c4580b, iVar, true);
            }
        }
        c4580b.B();
        if (z3) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return c4445c != null ? c4445c : new d1.d(c4444b2, c4444b);
    }
}
