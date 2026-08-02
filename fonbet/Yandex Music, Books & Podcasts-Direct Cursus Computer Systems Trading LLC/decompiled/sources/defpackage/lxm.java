package defpackage;

/* loaded from: classes4.dex */
public final class lxm {
    public final String a;

    public lxm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxm) && this.a.equals(((lxm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("PromoReportingPayload(clickUrl=", this.a, ")");
    }
}
