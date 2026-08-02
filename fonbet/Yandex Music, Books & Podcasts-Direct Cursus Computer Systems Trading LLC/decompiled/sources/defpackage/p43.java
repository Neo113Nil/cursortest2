package defpackage;

/* loaded from: classes4.dex */
public final class p43 {
    public final String a;

    public p43(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p43) && this.a.equals(((p43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("BlockAnalyticsData(requestId=", this.a, ")");
    }
}
