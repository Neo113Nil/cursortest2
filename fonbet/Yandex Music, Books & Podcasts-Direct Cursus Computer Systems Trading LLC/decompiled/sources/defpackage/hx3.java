package defpackage;

/* loaded from: classes5.dex */
public enum hx3 {
    AmericanExpress("AmericanExpress"),
    DinersClub("DinersClub"),
    DiscoverCard("DiscoverCard"),
    JCB("JCB"),
    HUMO("HUMO"),
    Maestro("Maestro"),
    MasterCard("MasterCard"),
    MIR("MIR"),
    UnionPay("UnionPay"),
    Uzcard("Uzcard"),
    VISA("VISA"),
    VISA_ELECTRON("VISA_ELECTRON"),
    UNKNOWN("unknown");

    public final String a;

    hx3(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
