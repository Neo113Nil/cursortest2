package defpackage;

/* loaded from: classes4.dex */
public final class olf implements vlf {
    public final ulf a;

    public olf(ulf ulfVar) {
        this.a = ulfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olf) && this.a.equals(((olf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SubscriptionBlock(waveButtonState=" + this.a + ")";
    }
}
