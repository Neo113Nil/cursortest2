package defpackage;

/* loaded from: classes4.dex */
public enum wgl {
    b("Normal"),
    c("SlightlyFast"),
    d("Fast"),
    e("Doubled");

    public final float a;

    wgl(String str) {
        this.a = r1;
    }

    public final wgl a() {
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
