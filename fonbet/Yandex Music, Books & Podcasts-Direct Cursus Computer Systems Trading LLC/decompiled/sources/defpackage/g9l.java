package defpackage;

import com.yandex.music.shared.media.session.common.state.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g9l implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9l b;

    public /* synthetic */ g9l(j9l j9lVar, int i) {
        this.a = i;
        this.b = j9lVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        g8l g8lVar;
        boolean z;
        boolean z2;
        j9l j9lVar;
        boolean z3;
        hzk hzkVar;
        boolean z4;
        switch (this.a) {
            case 0:
                lgh lghVar = (lgh) obj;
                j9l j9lVar2 = this.b;
                onh M0 = j9lVar2.M0();
                g8l i1 = j9l.i1(j9lVar2, M0, j9lVar2.J0(), j9lVar2.v0());
                lgh lghVar2 = j9lVar2.s;
                j9lVar2.s = lghVar;
                a aVar = lghVar2.c;
                a aVar2 = lghVar.c;
                hoh hohVar = lghVar.d;
                n4q n4qVar = lghVar.p;
                h4q h4qVar = lghVar.o;
                int i = lghVar.l;
                List list = lghVar.g;
                blp blpVar = lghVar.f;
                String str = lghVar.t;
                int i2 = lghVar.a;
                onh l = lghVar.b.e.l(i2);
                hoh hohVar2 = hohVar;
                n4q n4qVar2 = n4qVar;
                g8l i12 = j9l.i1(j9lVar2, l, 0L, i2);
                d8l d8lVar = lghVar2.e;
                g8l g8lVar2 = i1;
                d8l d8lVar2 = lghVar.e;
                boolean d = Intrinsics.d(d8lVar, d8lVar2);
                j9lVar2.l.getClass();
                if (!Boolean.TRUE.booleanValue() && d && Intrinsics.d(lghVar2.f, blpVar) && Intrinsics.d(lghVar2.g, list)) {
                    g8lVar = i12;
                } else {
                    g8lVar = i12;
                    j9lVar2.j.invoke(d8lVar2, blpVar, list, lghVar.h);
                }
                boolean equals = aVar.equals(aVar2);
                boolean z5 = lghVar2.a != i2;
                int i3 = !equals ? 3 : z5 ? 2 : 0;
                boolean d2 = Intrinsics.d(M0 != null ? M0.d : null, l != null ? l.d : null);
                boolean z6 = (d2 && Intrinsics.d(M0, l)) ? false : true;
                y08 y08Var = lghVar2.s;
                y08 y08Var2 = lghVar.s;
                boolean z7 = z6;
                svh svhVar = y08Var.c;
                svh svhVar2 = y08Var2.c;
                if (svhVar2 != null) {
                    boolean d3 = Intrinsics.d(svhVar, svhVar2);
                    z2 = !d3;
                    if (!d3) {
                        if (svhVar != null) {
                            svhVar.d();
                        }
                        svhVar2.c();
                    }
                    z = y08Var.b != y08Var2.b;
                } else {
                    if (svhVar != null) {
                        svhVar.d();
                    }
                    z = false;
                    z2 = false;
                }
                Iterator it = j9lVar2.q.iterator();
                while (it.hasNext()) {
                    f8l f8lVar = (f8l) it.next();
                    if (!d) {
                        f8lVar.V(d8lVar2);
                    }
                    if (z2) {
                        f8lVar.z(j9lVar2.n0());
                    }
                    if (z) {
                        int c0 = j9lVar2.c0();
                        if (j9lVar2.c0() == 0) {
                            j9lVar = j9lVar2;
                            z4 = true;
                        } else {
                            j9lVar = j9lVar2;
                            z4 = false;
                        }
                        f8lVar.s(c0, z4);
                    } else {
                        j9lVar = j9lVar2;
                    }
                    boolean z8 = lghVar2.k;
                    boolean z9 = lghVar.k;
                    if (z8 != z9 || lghVar2.l != i) {
                        f8lVar.G(i, z9);
                    }
                    boolean z10 = lghVar2.n;
                    boolean z11 = lghVar.n;
                    if (z10 != z11) {
                        f8lVar.F(z11);
                    }
                    if (Intrinsics.d(lghVar2.t, str)) {
                        z3 = z;
                    } else {
                        if (str != null) {
                            z3 = z;
                            hzkVar = new hzk(str, null, -2);
                        } else {
                            z3 = z;
                            hzkVar = null;
                        }
                        f8lVar.O(hzkVar);
                    }
                    int i4 = lghVar2.i;
                    int i5 = lghVar.i;
                    if (i4 != i5) {
                        f8lVar.p(i5);
                    }
                    boolean z12 = lghVar2.m;
                    boolean z13 = lghVar.m;
                    if (z12 != z13) {
                        f8lVar.X(z13);
                    }
                    if (!gdg.u(lghVar2.o, h4qVar)) {
                        f8lVar.U(j9lVar.m().a(h4qVar.a));
                    }
                    n4q n4qVar3 = lghVar2.p;
                    n4qVar3.getClass();
                    n4qVar2.getClass();
                    n4q n4qVar4 = n4qVar2;
                    float f = n4qVar4.a;
                    if (Math.abs(n4qVar3.a - f) > 1.0E-4f) {
                        f8lVar.H(f);
                    }
                    int i6 = lghVar2.q;
                    int i7 = lghVar.q;
                    if (i6 != i7) {
                        f8lVar.b(i7);
                    }
                    boolean z14 = lghVar2.r;
                    boolean z15 = lghVar.r;
                    if (z14 != z15) {
                        f8lVar.q(z15);
                    }
                    hoh hohVar3 = hohVar2;
                    if (!Intrinsics.d(lghVar2.d, hohVar3)) {
                        f8lVar.v(hohVar3);
                    }
                    if (!equals) {
                        f8lVar.R(aVar2, 0);
                    }
                    lgh lghVar3 = lghVar;
                    g8l g8lVar3 = g8lVar2;
                    g8l g8lVar4 = g8lVar;
                    if (z5) {
                        f8lVar.u(1, g8lVar3, g8lVar4);
                    }
                    if (z7) {
                        f8lVar.I(i3, l);
                    }
                    hoh hohVar4 = l != null ? l.d : null;
                    if (!d2 && hohVar4 != null) {
                        f8lVar.P(hohVar4);
                    }
                    g8lVar = g8lVar4;
                    n4qVar2 = n4qVar4;
                    z = z3;
                    lghVar = lghVar3;
                    hohVar2 = hohVar3;
                    g8lVar2 = g8lVar3;
                    j9lVar2 = j9lVar;
                }
                break;
            default:
                this.b.i.invoke((mwk) obj);
                break;
        }
        return Unit.a;
    }
}
