package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes5.dex */
public final class i0s extends k0 {
    public v0 a;
    public j0 b;
    public j0 c;
    public c40 d;
    public q6w e;
    public ehs f;
    public ehs g;
    public q6w h;
    public gnr i;
    public sz6 j;
    public sz6 k;
    public l1c l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public static i0s t(d0 d0Var) {
        int i;
        boolean z;
        boolean z2;
        j0 j0Var;
        gnr gnrVar;
        int i2;
        l1c l1cVar;
        int i3;
        char c;
        p0c p0cVar;
        b0 b0Var;
        if (d0Var instanceof i0s) {
            return (i0s) d0Var;
        }
        i0s i0sVar = null;
        if (d0Var == null) {
            return null;
        }
        v0 E = v0.E(d0Var);
        i0s i0sVar2 = new i0s();
        i0sVar2.a = E;
        boolean z3 = false;
        if (E.F(0) instanceof z0) {
            i0sVar2.b = (j0) j0.c.f((z0) E.F(0), true);
            i = 0;
        } else {
            i0sVar2.b = new j0(0L);
            i = -1;
        }
        int i4 = 2;
        if (i0sVar2.b.B(0)) {
            z2 = false;
            z = true;
        } else if (i0sVar2.b.B(1)) {
            z = false;
            z2 = true;
        } else {
            if (!i0sVar2.b.B(2)) {
                xq0.x("version number not recognised");
                return null;
            }
            z = false;
            z2 = false;
        }
        Object F = E.F(i + 1);
        if (F == null || (F instanceof j0)) {
            j0Var = (j0) F;
        } else {
            if (!(F instanceof byte[])) {
                xq0.x("illegal object in getInstance: ".concat(F.getClass().getName()));
                return null;
            }
            try {
                s0 y = s0.y((byte[]) F);
                if (!j0.class.isInstance(y)) {
                    throw new IllegalStateException("unexpected object: ".concat(y.getClass().getName()));
                }
                j0Var = (j0) y;
            } catch (Exception e) {
                tiu.h(e, "encoding error in getInstance: ");
                return null;
            }
        }
        i0sVar2.c = j0Var;
        i0sVar2.d = c40.t(E.F(i + 2));
        i0sVar2.e = q6w.t(E.F(i + 3));
        v0 v0Var = (v0) E.F(i + 4);
        i0sVar2.f = ehs.t(v0Var.F(0));
        i0sVar2.g = ehs.t(v0Var.F(1));
        i0sVar2.h = q6w.t(E.F(i + 5));
        int i5 = i + 6;
        d0 F2 = E.F(i5);
        if (F2 instanceof gnr) {
            gnrVar = (gnr) F2;
        } else if (F2 != null) {
            v0 E2 = v0.E(F2);
            gnr gnrVar2 = new gnr();
            if (E2.size() != 2) {
                kac.c(E2.size(), "Bad sequence size: ");
                return null;
            }
            Enumeration G = E2.G();
            gnrVar2.a = c40.t(G.nextElement());
            gnrVar2.b = sz6.D(G.nextElement());
            gnrVar = gnrVar2;
        } else {
            gnrVar = null;
        }
        i0sVar2.i = gnrVar;
        int size = (E.size() - i5) - 1;
        if (size != 0 && z) {
            xq0.x("version 1 certificate contains extra data");
            return null;
        }
        while (size > 0) {
            z0 z0Var = (z0) E.F(i5 + size);
            int i6 = z0Var.c;
            d0 d0Var2 = z0Var.d;
            int i7 = z0Var.b;
            i0s i0sVar3 = i0sVar;
            if (i6 == 1) {
                i2 = i4;
                if (128 != i7) {
                    xq0.q("this method only valid for CONTEXT_SPECIFIC tags");
                    return i0sVar3;
                }
                s0 n = d0Var2.n();
                i0sVar2.j = n instanceof sz6 ? sz6.D(n) : new sz6(o0.B(n).a, true);
            } else if (i6 != i4) {
                char c2 = 3;
                if (i6 != 3) {
                    kac.c(z0Var.c, "Unknown tag encountered in structure: ");
                    return i0sVar3;
                }
                if (z2) {
                    xq0.x("version 2 certificate cannot contain extensions");
                    return i0sVar3;
                }
                v0 v0Var2 = (v0) v0.b.f(z0Var, true);
                if (v0Var2 != null) {
                    v0 E3 = v0.E(v0Var2);
                    l1cVar = new l1c();
                    l1cVar.a = new Hashtable();
                    l1cVar.b = new Vector();
                    Enumeration G2 = E3.G();
                    ?? r3 = z3;
                    while (G2.hasMoreElements()) {
                        Object nextElement = G2.nextElement();
                        n0 n0Var = p0c.d;
                        if (nextElement instanceof p0c) {
                            i3 = i4;
                            c = c2;
                            p0cVar = (p0c) nextElement;
                        } else if (nextElement != null) {
                            v0 E4 = v0.E(nextElement);
                            p0c p0cVar2 = new p0c();
                            if (E4.size() == i4) {
                                p0cVar2.a = n0.F(E4.F(r3));
                                p0cVar2.b = r3;
                                p0cVar2.c = o0.B(E4.F(1));
                                i3 = i4;
                                p0cVar = p0cVar2;
                                c = 3;
                            } else {
                                c = 3;
                                if (E4.size() != 3) {
                                    kac.c(E4.size(), "Bad sequence size: ");
                                    return i0sVar3;
                                }
                                p0cVar2.a = n0.F(E4.F(r3));
                                Object F3 = E4.F(1);
                                if (F3 == null || (F3 instanceof b0)) {
                                    b0Var = (b0) F3;
                                } else {
                                    if (!(F3 instanceof byte[])) {
                                        xq0.x("illegal object in getInstance: ".concat(F3.getClass().getName()));
                                        return i0sVar3;
                                    }
                                    try {
                                        s0 y2 = s0.y((byte[]) F3);
                                        if (!b0.class.isInstance(y2)) {
                                            throw new IllegalStateException("unexpected object: ".concat(y2.getClass().getName()));
                                        }
                                        b0Var = (b0) y2;
                                    } catch (IOException e2) {
                                        kac.l(e2.getMessage(), "failed to construct boolean from byte[]: ");
                                        return i0sVar3;
                                    }
                                }
                                p0cVar2.b = b0Var.D();
                                i3 = 2;
                                p0cVar2.c = o0.B(E4.F(2));
                                p0cVar = p0cVar2;
                            }
                        } else {
                            i3 = i4;
                            c = c2;
                            p0cVar = i0sVar3;
                        }
                        Hashtable hashtable = l1cVar.a;
                        n0 n0Var2 = p0cVar.a;
                        if (hashtable.containsKey(n0Var2)) {
                            kac.j(n0Var2, "repeated extension found: ");
                            return i0sVar3;
                        }
                        l1cVar.a.put(n0Var2, p0cVar);
                        l1cVar.b.addElement(n0Var2);
                        c2 = c;
                        i4 = i3;
                        r3 = 0;
                    }
                } else {
                    l1cVar = i0sVar3;
                }
                i2 = i4;
                i0sVar2.l = l1cVar;
            } else {
                i2 = i4;
                if (128 != i7) {
                    xq0.q("this method only valid for CONTEXT_SPECIFIC tags");
                    return i0sVar3;
                }
                s0 n2 = d0Var2.n();
                i0sVar2.k = n2 instanceof sz6 ? sz6.D(n2) : new sz6(o0.B(n2).a, true);
            }
            size--;
            i4 = i2;
            i0sVar = i0sVar3;
            z3 = false;
        }
        return i0sVar2;
    }

    @Override // defpackage.d0
    public final s0 n() {
        j0 j0Var = this.b;
        v0 v0Var = this.a;
        if (uxm.a("org.bouncycastle.x509.allow_non-der_tbscert") == null || uxm.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return v0Var;
        }
        e0 e0Var = new e0(0, (byte) 0);
        int i = 1;
        if (!j0Var.B(0)) {
            e0Var.e(new ki2(true, 0, j0Var, 1));
        }
        e0Var.e(this.c);
        e0Var.e(this.d);
        e0Var.e(this.e);
        int i2 = 2;
        e0 e0Var2 = new e0(2);
        e0Var2.e(this.f);
        e0Var2.e(this.g);
        d07 d07Var = new d07(e0Var2);
        d07Var.c = -1;
        e0Var.e(d07Var);
        q6w q6wVar = this.h;
        if (q6wVar != null) {
            e0Var.e(q6wVar);
        } else {
            e0Var.e(new d07());
        }
        e0Var.e(this.i);
        sz6 sz6Var = this.j;
        int i3 = 128;
        if (sz6Var != null) {
            e0Var.e(new ki2(i2, i3, i, sz6Var, 1));
        }
        sz6 sz6Var2 = this.k;
        if (sz6Var2 != null) {
            e0Var.e(new ki2(i2, i3, i2, sz6Var2, 1));
        }
        l1c l1cVar = this.l;
        if (l1cVar != null) {
            e0Var.e(new ki2(true, 3, l1cVar, 1));
        }
        d07 d07Var2 = new d07(e0Var);
        d07Var2.c = -1;
        return d07Var2;
    }
}
