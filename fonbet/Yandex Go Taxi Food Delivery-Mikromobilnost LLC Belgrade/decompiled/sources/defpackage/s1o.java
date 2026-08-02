package defpackage;

import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes.dex */
public final class s1o {
    public static final s1o b = new s1o(new c2o());
    public static final s1o c = new s1o(new g2o());
    public static final s1o d;
    public static final s1o e;
    public static final s1o f;
    public final r1o a;

    static {
        new s1o(new i2o());
        new s1o(new h2o());
        d = new s1o(new d2o());
        e = new s1o(new f2o());
        f = new s1o(new e2o());
    }

    public s1o(j2o j2oVar) {
        if (yez0.a()) {
            this.a = new jln(7, j2oVar);
        } else if ("The Android Project".equals(System.getProperty(Platform.STR_VENDOR_PROPERTY))) {
            this.a = new yvi0(j2oVar);
        } else {
            this.a = new gym(j2oVar);
        }
    }
}
