package defpackage;

/* loaded from: classes5.dex */
public enum szr implements hse {
    STATE_ON(0),
    STATE_OFF(1),
    STATE_SNOOZED(2),
    STATE_EXPIRED(3);

    public final int a;

    szr(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
