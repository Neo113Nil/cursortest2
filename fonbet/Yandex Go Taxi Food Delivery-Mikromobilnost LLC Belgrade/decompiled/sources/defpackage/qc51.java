package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import ru.CryptoPro.AdES.tools.AdESUtility;

/* loaded from: classes4.dex */
public final class qc51 extends o2 {
    public static final u2 c;
    public static final u2 w;
    public final Hashtable a = new Hashtable();
    public final Vector b = new Vector();

    static {
        new u2("2.5.29.9");
        new u2("2.5.29.14");
        new u2(AdESUtility.KEY_USAGE);
        new u2("2.5.29.16");
        new u2("2.5.29.17");
        new u2("2.5.29.18");
        new u2("2.5.29.19");
        new u2("2.5.29.20");
        new u2("2.5.29.21");
        new u2("2.5.29.23");
        new u2("2.5.29.24");
        new u2("2.5.29.27");
        new u2("2.5.29.28");
        new u2("2.5.29.29");
        new u2("2.5.29.30");
        c = new u2("2.5.29.31");
        new u2("2.5.29.32");
        new u2("2.5.29.33");
        new u2("2.5.29.35");
        new u2("2.5.29.36");
        new u2(AdESUtility.EXTENDED_KEY_USAGE);
        new u2("2.5.29.46");
        new u2("2.5.29.54");
        w = new u2("1.3.6.1.5.5.7.1.1");
        new u2("1.3.6.1.5.5.7.1.11");
        new u2("1.3.6.1.5.5.7.1.12");
        new u2("1.3.6.1.5.5.7.1.2");
        new u2("1.3.6.1.5.5.7.1.3");
        new u2("1.3.6.1.5.5.7.1.4");
        new u2("2.5.29.56");
        new u2("2.5.29.55");
    }

    public qc51(i3 i3Var) {
        Enumeration B = i3Var.B();
        while (B.hasMoreElements()) {
            i3 z = i3.z(B.nextElement());
            if (z.size() == 3) {
                Hashtable hashtable = this.a;
                a2 A = z.A(0);
                w1 x = w1.x(z.A(1));
                w2 x2 = w2.x(z.A(2));
                pc51 pc51Var = new pc51();
                pc51Var.a = x.y();
                pc51Var.b = x2;
                hashtable.put(A, pc51Var);
            } else {
                if (z.size() != 2) {
                    ny61.g(vfc.n(z, new StringBuilder("Bad sequence size: ")));
                    throw null;
                }
                Hashtable hashtable2 = this.a;
                a2 A2 = z.A(0);
                w2 x3 = w2.x(z.A(1));
                pc51 pc51Var2 = new pc51();
                pc51Var2.a = false;
                pc51Var2.b = x3;
                hashtable2.put(A2, pc51Var2);
            }
            this.b.addElement(z.A(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qc51 m(b3 b3Var) {
        if (b3Var == 0) {
            return (qc51) b3Var;
        }
        if (b3Var instanceof i3) {
            return new qc51((i3) b3Var);
        }
        if (b3Var instanceof s3) {
            return m(s3.B(b3Var).u().toASN1Primitive());
        }
        ny61.g("illegal object in getInstance: ".concat(b3Var.getClass().getName()));
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        Vector vector = this.b;
        c2 c2Var = new c2(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            c2 c2Var2 = new c2(3);
            u2 u2Var = (u2) elements.nextElement();
            pc51 pc51Var = (pc51) this.a.get(u2Var);
            c2Var2.a(u2Var);
            if (pc51Var.a) {
                c2Var2.a(w1.w);
            }
            c2Var2.a(pc51Var.b);
            c2Var.a(new jqf(c2Var2));
        }
        return new jqf(c2Var);
    }
}
