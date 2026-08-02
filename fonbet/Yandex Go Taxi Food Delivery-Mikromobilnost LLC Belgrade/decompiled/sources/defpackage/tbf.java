package defpackage;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public class tbf extends o2 {
    private sbf crlids;
    private mr60 ocspids;
    private kr80 otherRev = null;

    public tbf(sbf sbfVar, mr60 mr60Var) {
        this.crlids = sbfVar;
        this.ocspids = mr60Var;
    }

    public static tbf getInstance(Object obj) {
        kr80 kr80Var;
        mr60 mr60Var;
        sbf sbfVar;
        if (obj instanceof tbf) {
            return (tbf) obj;
        }
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        tbf tbfVar = new tbf();
        Enumeration B = z.B();
        while (B.hasMoreElements()) {
            s3 B2 = s3.B(B.nextElement());
            int i = B2.c;
            if (i == 0) {
                o2 y = B2.y();
                if (y instanceof sbf) {
                    sbfVar = (sbf) y;
                } else if (y != null) {
                    i3 z2 = i3.z(y);
                    sbf sbfVar2 = new sbf();
                    i3 i3Var = (i3) z2.A(0);
                    sbfVar2.a = i3Var;
                    Enumeration B3 = i3Var.B();
                    while (B3.hasMoreElements()) {
                        ubf.m(B3.nextElement());
                    }
                    sbfVar = sbfVar2;
                } else {
                    sbfVar = null;
                }
                tbfVar.crlids = sbfVar;
            } else if (i == 1) {
                o2 y2 = B2.y();
                if (y2 instanceof mr60) {
                    mr60Var = (mr60) y2;
                } else if (y2 != null) {
                    i3 z3 = i3.z(y2);
                    mr60 mr60Var2 = new mr60();
                    if (z3.size() != 1) {
                        ny61.g(vfc.n(z3, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    i3 i3Var2 = (i3) z3.A(0);
                    mr60Var2.a = i3Var2;
                    Enumeration B4 = i3Var2.B();
                    while (B4.hasMoreElements()) {
                        nr60.m(B4.nextElement());
                    }
                    mr60Var = mr60Var2;
                } else {
                    mr60Var = null;
                }
                tbfVar.ocspids = mr60Var;
            } else {
                if (i != 2) {
                    ny61.g("illegal tag");
                    return null;
                }
                o2 y3 = B2.y();
                if (y3 instanceof kr80) {
                    kr80Var = (kr80) y3;
                } else if (y3 != null) {
                    i3 z4 = i3.z(y3);
                    kr80 kr80Var2 = new kr80();
                    if (z4.size() != 2) {
                        ny61.g(vfc.n(z4, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    kr80Var2.a = new u2(((u2) z4.A(0)).a);
                    try {
                        kr80Var2.b = b3.r(z4.A(1).toASN1Primitive().getEncoded("DER"));
                        kr80Var = kr80Var2;
                    } catch (IOException unused) {
                        ny61.k();
                        return null;
                    }
                } else {
                    kr80Var = null;
                }
                tbfVar.otherRev = kr80Var;
            }
        }
        return tbfVar;
    }

    public sbf getCrlids() {
        return this.crlids;
    }

    public mr60 getOcspids() {
        return this.ocspids;
    }

    public kr80 getOtherRev() {
        return this.otherRev;
    }

    @Override // defpackage.a2
    public b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        sbf sbfVar = this.crlids;
        if (sbfVar != null) {
            c2Var.a(new oqf(true, 0, sbfVar.toASN1Primitive(), 0));
        }
        mr60 mr60Var = this.ocspids;
        if (mr60Var != null) {
            c2Var.a(new oqf(true, 1, mr60Var.toASN1Primitive(), 0));
        }
        kr80 kr80Var = this.otherRev;
        if (kr80Var != null) {
            c2Var.a(new oqf(true, 2, kr80Var.toASN1Primitive(), 0));
        }
        return new jqf(c2Var);
    }
}
