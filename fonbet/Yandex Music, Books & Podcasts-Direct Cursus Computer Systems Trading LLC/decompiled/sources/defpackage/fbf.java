package defpackage;

/* loaded from: classes3.dex */
public enum fbf implements gse {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int a;

    fbf(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        xq0.x("Can't get the number of an unknown enum value.");
        return 0;
    }
}
