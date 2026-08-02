package defpackage;

/* loaded from: classes3.dex */
public enum lwk implements hse {
    UNSPECIFIED(0),
    TRACK(1),
    LOCAL_TRACK(2),
    INFINITE(3),
    VIDEO_CLIP(4),
    UNRECOGNIZED(-1);

    public final int a;

    lwk(int i) {
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
