package defpackage;

/* loaded from: classes5.dex */
public enum txf implements hse {
    CHANNEL_UNKNOWN(0),
    CHANNEL_CANARY(1),
    CHANNEL_DEV(2),
    CHANNEL_BETA(3),
    CHANNEL_STABLE(4);

    public final int a;

    txf(int i) {
        this.a = i;
    }

    public static txf b(int i) {
        if (i == 0) {
            return CHANNEL_UNKNOWN;
        }
        if (i == 1) {
            return CHANNEL_CANARY;
        }
        if (i == 2) {
            return CHANNEL_DEV;
        }
        if (i == 3) {
            return CHANNEL_BETA;
        }
        if (i != 4) {
            return null;
        }
        return CHANNEL_STABLE;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
