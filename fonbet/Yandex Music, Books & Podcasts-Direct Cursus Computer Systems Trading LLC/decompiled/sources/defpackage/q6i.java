package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class q6i implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ j7i c;

    public /* synthetic */ q6i(rjc rjcVar, j7i j7iVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = j7iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        p6i p6iVar;
        int i;
        b0p b0pVar;
        Object a;
        Object c;
        n1p n1pVar;
        v6i v6iVar;
        int i2;
        g7i g7iVar;
        int i3;
        switch (this.a) {
            case 0:
                if (continuation instanceof p6i) {
                    p6iVar = (p6i) continuation;
                    int i4 = p6iVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        p6iVar.k = i4 - Integer.MIN_VALUE;
                        Object obj2 = p6iVar.j;
                        nm6 nm6Var = nm6.a;
                        i = p6iVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            af5 af5Var = (af5) obj;
                            j7i j7iVar = this.c;
                            ve5 ve5Var = new ve5(j7iVar.N());
                            tao taoVar = j7iVar.n;
                            String str = (String) taoVar.c;
                            jyr jyrVar = (jyr) taoVar.d;
                            p0p p0pVar = (p0p) taoVar.b;
                            af5Var.getClass();
                            String str2 = af5Var.a;
                            n1p n1pVar2 = af5Var.b;
                            boolean z = (n1pVar2 != null ? n1pVar2.c : null) == null || n1pVar2.c == t1p.a;
                            c0p h = taoVar.h();
                            c0p c0pVar = c0p.c;
                            boolean z2 = h == c0pVar;
                            boolean z3 = z;
                            b0p b0pVar2 = ((z66) jyrVar.getValue()).a().b == u0j.a ? b0p.c : !((z66) jyrVar.getValue()).a().a ? b0p.b : b0p.a;
                            if (StringsKt.U(str2)) {
                                a = c5b.a;
                                b0pVar = b0pVar2;
                            } else {
                                p0p p0pVar2 = p0p.j;
                                boolean z4 = p0pVar == p0pVar2;
                                boolean z5 = (p0pVar == p0pVar2 || p0pVar == p0p.a) ? false : true;
                                boolean z6 = (h == c0pVar && p0pVar == p0p.a) || b0pVar2 != b0p.a;
                                boolean z7 = z5;
                                b0p b0pVar3 = b0p.a;
                                boolean z8 = b0pVar2 == b0pVar3;
                                boolean z9 = z6;
                                n8g b = t75.b();
                                if (z4) {
                                    if (b0pVar2 == b0pVar3) {
                                        c0p c0pVar2 = c0p.d;
                                        if (n1pVar2 != null) {
                                            b0pVar = b0pVar2;
                                            if (n1pVar2.c != t1p.a) {
                                                n1pVar = n1pVar2;
                                                c = new yrj(str2, c0pVar2, str, n1pVar);
                                            }
                                        } else {
                                            b0pVar = b0pVar2;
                                        }
                                        n1pVar = null;
                                        c = new yrj(str2, c0pVar2, str, n1pVar);
                                    } else {
                                        b0pVar = b0pVar2;
                                        c = tao.c(taoVar, af5Var, h, z2);
                                    }
                                    b.add(c);
                                } else {
                                    b0pVar = b0pVar2;
                                }
                                if (z7) {
                                    b.add(tao.c(taoVar, af5Var, h, z2));
                                }
                                if (z9) {
                                    b.add(new yqi(str2, new apo(str, p0pVar), h, n1pVar2 != null ? n1pVar2.c : null));
                                }
                                if (z8) {
                                    if (n1pVar2 == null || n1pVar2.c == t1p.a) {
                                        n1pVar2 = null;
                                    }
                                    b.add(new yrj(str2, h, null, n1pVar2));
                                }
                                a = t75.a(b);
                            }
                            vat vatVar = new vat(new Pair(a, new a0p(af5Var, h, (p0p) taoVar.b, b0pVar, z3, (String) taoVar.c)), ve5Var, af5Var);
                            p6iVar.k = 1;
                            if (this.b.emit(vatVar, p6iVar) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                p6iVar = new p6i(this, continuation);
                Object obj22 = p6iVar.j;
                nm6 nm6Var2 = nm6.a;
                i = p6iVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof v6i) {
                    v6iVar = (v6i) continuation;
                    int i5 = v6iVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        v6iVar.k = i5 - Integer.MIN_VALUE;
                        Object obj3 = v6iVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = v6iVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            v3k v3kVar = (v3k) obj;
                            m6i m6iVar = new m6i(this.c, null, 3);
                            v3kVar.getClass();
                            v3k v3kVar2 = new v3k(new njf(v3kVar.a, m6iVar, 23), v3kVar.b, v3kVar.c, xuj.v);
                            v6iVar.k = 1;
                            if (this.b.emit(v3kVar2, v6iVar) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                v6iVar = new v6i(this, continuation);
                Object obj32 = v6iVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = v6iVar.k;
                if (i2 != 0) {
                }
                break;
            default:
                if (continuation instanceof g7i) {
                    g7iVar = (g7i) continuation;
                    int i6 = g7iVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        g7iVar.k = i6 - Integer.MIN_VALUE;
                        Object obj4 = g7iVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = g7iVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            v3k v3kVar3 = (v3k) obj;
                            if (this.c.X > 0) {
                                Continuation continuation2 = null;
                                z0i z0iVar = new z0i(2, 3, continuation2);
                                v3kVar3.getClass();
                                njf njfVar = new njf(v3kVar3.a, z0iVar, 22);
                                vft vftVar = v3kVar3.b;
                                gyd gydVar = v3kVar3.c;
                                xuj xujVar = xuj.v;
                                vftVar.getClass();
                                gydVar.getClass();
                                s7p s7pVar = s7p.b;
                                s7pVar.getClass();
                                v3kVar3 = new v3k(new ail(18, njfVar, new tgp(1, new cle((pyc) new t81(s7pVar, continuation2, 15), (Continuation) null, 17))), vftVar, gydVar, xujVar);
                            }
                            g7iVar.k = 1;
                            if (this.b.emit(v3kVar3, g7iVar) == nm6Var4) {
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                g7iVar = new g7i(this, continuation);
                Object obj42 = g7iVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = g7iVar.k;
                if (i3 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
