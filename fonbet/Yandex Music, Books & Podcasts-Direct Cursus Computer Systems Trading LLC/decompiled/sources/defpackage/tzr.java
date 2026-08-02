package defpackage;

/* loaded from: classes5.dex */
public enum tzr implements hse {
    SERVER_SIDE_FILTER_UNSPECIFIED(0),
    SERVER_SIDE_FILTER_REQUIRED(1),
    NO_SERVER_SIDE_FILTER_REQUIRED_FOR_SYSTEM_APPS(3);

    public final int a;

    tzr(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
