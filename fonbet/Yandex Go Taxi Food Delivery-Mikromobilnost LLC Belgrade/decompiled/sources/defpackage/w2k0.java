package defpackage;

import java.util.Hashtable;

/* loaded from: classes4.dex */
public final class w2k0 extends o2 {
    public g2 a;
    public k97 b;

    public static w2k0 m(Object obj) {
        if (obj instanceof w2k0) {
            return (w2k0) obj;
        }
        k97 k97Var = null;
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        w2k0 w2k0Var = new w2k0();
        w2k0Var.a = g2.z(z.A(0));
        if (z.size() > 1) {
            e2 e2Var = (e2) e2.c.Hg((s3) z.A(1), true);
            String[] strArr = k97.b;
            if (e2Var != null) {
                int z2 = e2.x(e2Var).z();
                Integer valueOf = Integer.valueOf(z2);
                Hashtable hashtable = k97.c;
                if (!hashtable.containsKey(valueOf)) {
                    k97 k97Var2 = new k97();
                    if (z2 < 0) {
                        ny61.g("Invalid CRL reason : not in (0..MAX)");
                        return null;
                    }
                    k97Var2.a = new e2(z2);
                    hashtable.put(valueOf, k97Var2);
                }
                k97Var = (k97) hashtable.get(valueOf);
            }
            w2k0Var.b = k97Var;
        }
        return w2k0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        k97 k97Var = this.b;
        if (k97Var != null) {
            c2Var.a(new oqf(true, 0, k97Var, 0));
        }
        return new jqf(c2Var);
    }
}
