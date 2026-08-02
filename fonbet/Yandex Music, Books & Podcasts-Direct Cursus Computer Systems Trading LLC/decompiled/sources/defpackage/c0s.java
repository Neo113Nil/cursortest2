package defpackage;

/* loaded from: classes5.dex */
public enum c0s implements hse {
    METRICS_UNKNOWN(0),
    METRICS_ALL(1),
    METRICS_ONLY_CRITICAL(2);

    public final int a;

    c0s(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
