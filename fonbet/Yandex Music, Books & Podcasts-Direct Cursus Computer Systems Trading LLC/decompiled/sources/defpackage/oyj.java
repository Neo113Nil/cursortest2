package defpackage;

/* loaded from: classes3.dex */
public enum oyj implements gse {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int a;

    oyj(int i) {
        this.a = i;
    }

    public static oyj a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        xq0.x("Can't get the number of an unknown enum value.");
        return 0;
    }
}
