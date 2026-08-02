package j1;

import f1.C4516b;
import f1.C4517c;
import java.util.ArrayList;
import k1.C4639a;
import k1.C4641c;
import m1.C4739a;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4606a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4639a f38419a = C4639a.d("k", "x", "y");

    public static I1.d a(C4641c c4641c, Z0.i iVar) {
        ArrayList arrayList = new ArrayList();
        if (c4641c.I() == 1) {
            c4641c.b();
            while (c4641c.D()) {
                C4641c c4641c2 = c4641c;
                Z0.i iVar2 = iVar;
                arrayList.add(new c1.l(iVar2, o.b(c4641c2, iVar2, l1.i.c(), f.f38431x, c4641c.I() == 3, false)));
                c4641c = c4641c2;
                iVar = iVar2;
            }
            c4641c.z();
            p.b(arrayList);
        } else {
            arrayList.add(new C4739a(n.b(c4641c, l1.i.c())));
        }
        return new I1.d(arrayList);
    }

    public static f1.e b(C4641c c4641c, Z0.i iVar) {
        c4641c.j();
        I1.d dVar = null;
        C4516b c4516b = null;
        boolean z6 = false;
        C4516b c4516b2 = null;
        while (c4641c.I() != 4) {
            int K7 = c4641c.K(f38419a);
            if (K7 == 0) {
                dVar = a(c4641c, iVar);
            } else if (K7 != 1) {
                if (K7 != 2) {
                    c4641c.V();
                    c4641c.W();
                } else if (c4641c.I() == 6) {
                    c4641c.W();
                    z6 = true;
                } else {
                    c4516b = Q3.b.n(c4641c, iVar, true);
                }
            } else if (c4641c.I() == 6) {
                c4641c.W();
                z6 = true;
            } else {
                c4516b2 = Q3.b.n(c4641c, iVar, true);
            }
        }
        c4641c.B();
        if (z6) {
            iVar.a("Lottie doesn't support expressions.");
        }
        return dVar != null ? dVar : new C4517c(c4516b2, c4516b);
    }
}
