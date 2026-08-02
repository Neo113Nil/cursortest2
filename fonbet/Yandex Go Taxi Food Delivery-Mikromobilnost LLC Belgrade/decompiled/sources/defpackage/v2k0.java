package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public class v2k0 extends o2 {
    private i3 crlVals;
    private i3 ocspVals;
    private lr80 otherRevVals;

    public v2k0(m79[] m79VarArr, he5[] he5VarArr) {
        if (m79VarArr != null) {
            this.crlVals = new jqf(m79VarArr);
        }
        if (he5VarArr != null) {
            this.ocspVals = new jqf(he5VarArr);
        }
        this.otherRevVals = null;
    }

    public static v2k0 getInstance(Object obj) {
        lr80 lr80Var;
        if (obj instanceof v2k0) {
            return (v2k0) obj;
        }
        if (obj != null) {
            i3 z = i3.z(obj);
            v2k0 v2k0Var = new v2k0();
            if (z.size() <= 3) {
                Enumeration B = z.B();
                while (B.hasMoreElements()) {
                    s3 B2 = s3.B(B.nextElement());
                    int i = B2.c;
                    if (i == 0) {
                        i3 i3Var = (i3) B2.y();
                        Enumeration B3 = i3Var.B();
                        while (B3.hasMoreElements()) {
                            m79.m(B3.nextElement());
                        }
                        v2k0Var.crlVals = i3Var;
                    } else if (i == 1) {
                        i3 i3Var2 = (i3) B2.y();
                        Enumeration B4 = i3Var2.B();
                        while (B4.hasMoreElements()) {
                            he5.m(B4.nextElement());
                        }
                        v2k0Var.ocspVals = i3Var2;
                    } else {
                        if (i != 2) {
                            ny61.g(oyr.i(i, "invalid tag: "));
                            return null;
                        }
                        o2 y = B2.y();
                        if (y instanceof lr80) {
                            lr80Var = (lr80) y;
                        } else if (y != null) {
                            i3 z2 = i3.z(y);
                            lr80 lr80Var2 = new lr80();
                            if (z2.size() != 2) {
                                ny61.g(vfc.n(z2, new StringBuilder("Bad sequence size: ")));
                                return null;
                            }
                            lr80Var2.a = (u2) z2.A(0);
                            try {
                                lr80Var2.b = b3.r(z2.A(1).toASN1Primitive().getEncoded("DER"));
                                lr80Var = lr80Var2;
                            } catch (IOException unused) {
                                ny61.k();
                                return null;
                            }
                        } else {
                            lr80Var = null;
                        }
                        v2k0Var.otherRevVals = lr80Var;
                    }
                }
                return v2k0Var;
            }
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

    public m79[] getCrlVals() {
        i3 i3Var = this.crlVals;
        if (i3Var == null) {
            return new m79[0];
        }
        int size = i3Var.size();
        m79[] m79VarArr = new m79[size];
        for (int i = 0; i < size; i++) {
            m79VarArr[i] = m79.m(this.crlVals.A(i));
        }
        return m79VarArr;
    }

    public he5[] getOcspVals() {
        i3 i3Var = this.ocspVals;
        if (i3Var == null) {
            return new he5[0];
        }
        int size = i3Var.size();
        he5[] he5VarArr = new he5[size];
        for (int i = 0; i < size; i++) {
            he5VarArr[i] = he5.m(this.ocspVals.A(i));
        }
        return he5VarArr;
    }

    public lr80 getOtherRevVals() {
        return this.otherRevVals;
    }

    @Override // defpackage.a2
    public b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        i3 i3Var = this.crlVals;
        int i = 0;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        if (i3Var != null) {
            c2Var.a(new oqf(z, i, i3Var, i));
        }
        i3 i3Var2 = this.ocspVals;
        if (i3Var2 != null) {
            c2Var.a(new oqf(c3 == true ? 1 : 0, c2 == true ? 1 : 0, i3Var2, i));
        }
        lr80 lr80Var = this.otherRevVals;
        if (lr80Var != null) {
            b3 aSN1Primitive = lr80Var.toASN1Primitive();
            c2Var.a(new oqf(c == true ? 1 : 0, 2, aSN1Primitive, i));
        }
        return new jqf(c2Var);
    }
}
