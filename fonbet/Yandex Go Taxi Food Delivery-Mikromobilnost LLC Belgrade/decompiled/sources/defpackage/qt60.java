package defpackage;

/* loaded from: classes2.dex */
public final class qt60 {
    public final Object a;

    public qt60(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qt60) && this.a.equals(((qt60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("OfferTrialUntilPlan(until="), this.a, ')');
    }
}
