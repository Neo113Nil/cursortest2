package defpackage;

/* loaded from: classes5.dex */
public enum b0s implements hse {
    LTS_CHANNEL_UNKNOWN(0),
    LTS_CHANNEL_STABLE(1),
    LTS_CHANNEL_LTC(2),
    LTS_CHANNEL_LTS(3);

    public final int a;

    b0s(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
