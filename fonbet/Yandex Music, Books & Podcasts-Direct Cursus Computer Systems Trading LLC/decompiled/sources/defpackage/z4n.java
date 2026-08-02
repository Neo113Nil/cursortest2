package defpackage;

/* loaded from: classes3.dex */
public enum z4n implements hse {
    DO_NOT_INTERCEPT_BY_DEFAULT(0),
    INTERCEPT_IF_NO_ONE_ACTIVE(1),
    INTERCEPT_EAGER(2),
    UNRECOGNIZED(-1);

    public final int a;

    z4n(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        xq0.x("Can't get the number of an unknown enum value.");
        return 0;
    }
}
