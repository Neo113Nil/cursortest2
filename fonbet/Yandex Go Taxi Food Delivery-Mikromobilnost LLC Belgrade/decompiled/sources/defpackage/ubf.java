package defpackage;

/* loaded from: classes4.dex */
public final class ubf extends o2 {
    public er80 a;
    public rbf b;

    public ubf(er80 er80Var, rbf rbfVar) {
        this.a = er80Var;
        this.b = rbfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ubf m(Object obj) {
        v3 v3Var;
        if (obj instanceof ubf) {
            return (ubf) obj;
        }
        rbf rbfVar = null;
        if (obj != null) {
            i3 z = i3.z(obj);
            ubf ubfVar = new ubf();
            if (z.size() >= 1 && z.size() <= 2) {
                ubfVar.a = er80.o(z.A(0));
                if (z.size() > 1) {
                    a2 A = z.A(1);
                    if (A instanceof rbf) {
                        rbfVar = (rbf) A;
                    } else if (A != null) {
                        i3 z2 = i3.z(A);
                        rbf rbfVar2 = new rbf();
                        if (z2.size() < 2 || z2.size() > 3) {
                            w511.q();
                            return null;
                        }
                        rbfVar2.a = jc51.m(z2.A(0));
                        a2 A2 = z2.A(1);
                        if (A2 == 0 || (A2 instanceof v3)) {
                            v3Var = (v3) A2;
                        } else {
                            b3 aSN1Primitive = A2.toASN1Primitive();
                            if (aSN1Primitive instanceof v3) {
                                v3Var = (v3) aSN1Primitive;
                            } else {
                                if (!(A2 instanceof byte[])) {
                                    ny61.g("illegal object in getInstance: ".concat(A2.getClass().getName()));
                                    return null;
                                }
                                try {
                                    b3 r = b3.r((byte[]) A2);
                                    if (!v3.class.isInstance(r)) {
                                        throw new IllegalStateException("unexpected object: ".concat(r.getClass().getName()));
                                    }
                                    v3Var = (v3) r;
                                } catch (Exception e) {
                                    xfo.l(e);
                                    return null;
                                }
                            }
                        }
                        rbfVar2.b = v3Var;
                        if (z2.size() > 2) {
                            rbfVar2.c = l2.u(z2.A(2));
                        }
                        rbfVar = rbfVar2;
                    }
                    ubfVar.b = rbfVar;
                }
                return ubfVar;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a.toASN1Primitive());
        rbf rbfVar = this.b;
        if (rbfVar != null) {
            c2Var.a(rbfVar.toASN1Primitive());
        }
        return new jqf(c2Var);
    }
}
