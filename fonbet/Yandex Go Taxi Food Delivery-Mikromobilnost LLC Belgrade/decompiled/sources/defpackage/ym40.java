package defpackage;

/* loaded from: classes14.dex */
public final class ym40 implements uhx0, e6v {
    public final String a;

    public ym40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym40) && this.a.equals(((ym40) obj).a);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return "MultiTariffDescription";
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1857840159;
    }

    public final String toString() {
        return oyr.p("MultiTariffDescription(text=", this.a, ", id=MultiTariffDescription)");
    }
}
