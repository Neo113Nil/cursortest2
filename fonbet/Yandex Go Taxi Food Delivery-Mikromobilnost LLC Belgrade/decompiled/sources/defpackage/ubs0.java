package defpackage;

import java.util.Enumeration;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class ubs0 extends o2 {
    public static final l2 D = new l2(1);
    public static final l2 E = new l2(3);
    public static final l2 F = new l2(4);
    public static final l2 G = new l2(5);
    public final m3 A;
    public final boolean B;
    public final boolean C;
    public final l2 a;
    public final m3 b;
    public final ige c;
    public final m3 w;
    public final boolean x;
    public final boolean y;
    public final m3 z;

    public ubs0(m3 m3Var, ige igeVar, rd4 rd4Var, rd4 rd4Var2, m3 m3Var2) {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        l2 l2Var;
        u2 u2Var = igeVar.a;
        if (rd4Var != null) {
            a2[] a2VarArr = rd4Var.a;
            z = false;
            z2 = false;
            z3 = false;
            int i = 0;
            th = null;
            while (i < a2VarArr.length) {
                if (i >= a2VarArr.length) {
                    ny61.p();
                    throw null;
                }
                int i2 = i + 1;
                a2 a2Var = a2VarArr[i];
                if (a2Var instanceof s3) {
                    int i3 = s3.A(a2Var).c;
                    if (i3 == 1) {
                        z2 = true;
                    } else if (i3 == 2) {
                        z3 = true;
                    } else if (i3 == 3) {
                        z = true;
                    }
                }
                i = i2;
            }
        } else {
            th = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        if (z) {
            l2Var = new l2(5L);
        } else {
            if (rd4Var2 != null) {
                a2[] a2VarArr2 = rd4Var2.a;
                z4 = false;
                int i4 = 0;
                while (i4 < a2VarArr2.length) {
                    if (i4 >= a2VarArr2.length) {
                        ny61.p();
                        throw th;
                    }
                    int i5 = i4 + 1;
                    if (a2VarArr2[i4] instanceof s3) {
                        z4 = true;
                    }
                    i4 = i5;
                }
            } else {
                z4 = false;
            }
            if (z4) {
                l2Var = G;
            } else if (z3) {
                l2Var = F;
            } else {
                l2 l2Var2 = E;
                if (!z2) {
                    m3Var2.getClass();
                    a2[] a2VarArr3 = m3Var2.a;
                    int i6 = 0;
                    while (true) {
                        if (i6 < a2VarArr3.length) {
                            if (i6 >= a2VarArr3.length) {
                                ny61.p();
                                throw th;
                            }
                            int i7 = i6 + 1;
                            if (ybs0.m(a2VarArr3[i6]).a.y(3)) {
                                break;
                            } else {
                                i6 = i7;
                            }
                        } else if (p87.Z0.q(u2Var)) {
                            l2Var = D;
                        }
                    }
                }
                l2Var = l2Var2;
            }
        }
        this.a = l2Var;
        this.b = m3Var;
        this.c = igeVar;
        this.z = rd4Var;
        this.A = rd4Var2;
        this.w = m3Var2;
        this.x = m3Var instanceof rd4;
        this.C = Objects.nonNull(rd4Var2);
        this.B = Objects.nonNull(rd4Var);
        this.y = m3Var2 instanceof rd4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(6);
        c2Var.a(this.a);
        c2Var.a(this.b);
        ige igeVar = this.c;
        c2Var.a(igeVar);
        boolean z = this.B;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        m3 m3Var = this.z;
        if (m3Var != null) {
            c2Var.a(z ? new ud4(false, 0, m3Var) : new oqf(z2, objArr2 == true ? 1 : 0, m3Var, 0));
        }
        boolean z3 = this.C;
        m3 m3Var2 = this.A;
        if (m3Var2 != null) {
            c2Var.a(z3 ? new ud4(false, 1, m3Var2) : new oqf(objArr == true ? 1 : 0, 1, m3Var2, 0));
        }
        c2Var.a(this.w);
        return (!igeVar.c || this.x || this.y || z3 || z) ? new nd4(c2Var) : new xvf(c2Var);
    }

    public ubs0(i3 i3Var) {
        Enumeration B = i3Var.B();
        this.a = l2.u(B.nextElement());
        this.b = (m3) B.nextElement();
        this.c = ige.m(B.nextElement());
        m3 m3Var = null;
        while (B.hasMoreElements()) {
            b3 b3Var = (b3) B.nextElement();
            if (b3Var instanceof s3) {
                s3 s3Var = (s3) b3Var;
                int i = s3Var.c;
                p1 p1Var = m3.c;
                if (i == 0) {
                    this.B = s3Var instanceof ud4;
                    this.z = (m3) p1Var.Hg(s3Var, false);
                } else if (i == 1) {
                    this.C = s3Var instanceof ud4;
                    this.A = (m3) p1Var.Hg(s3Var, false);
                } else {
                    ny61.g(oyr.i(i, "unknown tag value "));
                    throw null;
                }
            } else {
                if (!(b3Var instanceof m3)) {
                    ny61.g("SET expected, not encountered");
                    throw null;
                }
                m3Var = (m3) b3Var;
            }
        }
        if (m3Var == null) {
            ny61.g("signerInfos not set");
            throw null;
        }
        this.w = m3Var;
        this.x = this.b instanceof rd4;
        this.y = m3Var instanceof rd4;
    }
}
