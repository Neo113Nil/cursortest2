package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oc {
    public final String a;
    public final long b;

    public oc(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return Intrinsics.areEqual(this.a, ocVar.a) && this.b == ocVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("CampaignData(id=", this.a, ", timestamp=", this.b);
        m.append(")");
        return m.toString();
    }
}
