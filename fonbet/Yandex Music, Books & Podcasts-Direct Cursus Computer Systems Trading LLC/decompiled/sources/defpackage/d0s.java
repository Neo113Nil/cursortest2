package defpackage;

/* loaded from: classes5.dex */
public enum d0s implements hse {
    OPT_IN(0),
    OPT_OUT(1),
    POLICY_FORCED_ENABLED(2),
    OPT_UNKNOWN(3);

    public final int a;

    d0s(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
