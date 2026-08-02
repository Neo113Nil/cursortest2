package defpackage;

/* loaded from: classes.dex */
public abstract class bmq {
    public static final b9r a = weo.Q(0.0f, 0.0f, null, 7);

    public static final fk0 a(long j) {
        d85 d85Var = new d85(j);
        l95 f = d85.f(j);
        gx3 gx3Var = gx3.J;
        m40 m40Var = new m40(23, f);
        oct octVar = azt.a;
        return new fk0(d85Var, new oct(gx3Var, m40Var), null, 12);
    }

    public static final sdr b(long j, act actVar, String str, hq5 hq5Var, int i, int i2) {
        tm0 tm0Var = actVar;
        if ((i2 & 2) != 0) {
            tm0Var = a;
        }
        tm0 tm0Var2 = tm0Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        oq5 oq5Var = (oq5) hq5Var;
        boolean f = oq5Var.f(d85.f(j));
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            l95 f2 = d85.f(j);
            gx3 gx3Var = gx3.J;
            m40 m40Var = new m40(23, f2);
            oct octVar = azt.a;
            oct octVar2 = new oct(gx3Var, m40Var);
            oq5Var.k0(octVar2);
            K = octVar2;
        }
        int i3 = i << 6;
        return pk0.c(new d85(j), (oct) K, tm0Var2, null, str2, null, oq5Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}
