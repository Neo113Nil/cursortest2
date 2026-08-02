package defpackage;

/* loaded from: classes2.dex */
public final class zcg {
    public final String a;

    public zcg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zcg) && jl40.l(this.a, ((zcg) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return oyr.t(new StringBuilder("DailyAnalyticsParams(counterValue="), this.a, ", additionalParams=null)");
    }
}
