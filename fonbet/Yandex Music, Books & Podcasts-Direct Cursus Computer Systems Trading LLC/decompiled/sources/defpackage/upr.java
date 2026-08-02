package defpackage;

/* loaded from: classes.dex */
public interface upr {
    void i(byte[] bArr, int i, int i2, tpr tprVar, ua6 ua6Var);

    default ipr p(byte[] bArr, int i, int i2) {
        tde u = yde.u();
        i(bArr, 0, i2, tpr.c, new h5n(14, u));
        return new vv6(u.f());
    }

    int y();

    default void reset() {
    }
}
