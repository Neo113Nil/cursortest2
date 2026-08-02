package defpackage;

/* loaded from: classes3.dex */
public enum xgl {
    b("Normal"),
    c("SlightlyFast"),
    d("Fast"),
    e("Doubled");

    public final float a;

    xgl(String str) {
        this.a = r1;
    }

    public final xgl a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return c;
        }
        if (ordinal == 1) {
            return d;
        }
        if (ordinal == 2) {
            return e;
        }
        if (ordinal == 3) {
            return b;
        }
        b6e.s();
        return null;
    }
}
