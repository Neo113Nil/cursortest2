package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qwd0 extends o2 {
    public u2 a;
    public i3 b;

    public static qwd0 m(Object obj) {
        if (obj == null || (obj instanceof qwd0)) {
            return (qwd0) obj;
        }
        i3 z = i3.z(obj);
        qwd0 qwd0Var = new qwd0();
        if (z.size() < 1 || z.size() > 2) {
            ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
            return null;
        }
        qwd0Var.a = u2.A(z.A(0));
        if (z.size() > 1) {
            qwd0Var.b = i3.z(z.A(1));
        }
        return qwd0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        i3 i3Var = this.b;
        if (i3Var != null) {
            c2Var.a(i3Var);
        }
        return new jqf(c2Var);
    }

    public final String toString() {
        rwd0 rwd0Var;
        StringBuffer stringBuffer = new StringBuffer("Policy information: ");
        stringBuffer.append(this.a);
        i3 i3Var = this.b;
        if (i3Var != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i = 0; i < i3Var.size(); i++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(Extension.FIX_SPACE);
                }
                a2 A = i3Var.A(i);
                if (A instanceof rwd0) {
                    rwd0Var = (rwd0) A;
                } else if (A != null) {
                    i3 z = i3.z(A);
                    rwd0 rwd0Var2 = new rwd0();
                    if (z.size() != 2) {
                        ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
                        return null;
                    }
                    rwd0Var2.a = u2.A(z.A(0));
                    rwd0Var2.b = z.A(1);
                    rwd0Var = rwd0Var2;
                } else {
                    rwd0Var = null;
                }
                stringBuffer2.append(rwd0Var);
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
