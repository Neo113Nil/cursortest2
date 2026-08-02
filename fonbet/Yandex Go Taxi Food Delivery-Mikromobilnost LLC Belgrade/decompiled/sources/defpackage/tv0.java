package defpackage;

/* loaded from: classes5.dex */
public final class tv0 implements b151 {
    public final String a;

    public tv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv0) && jl40.l(this.a, ((tv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return oyr.p("AddressInputBubbleAction(id=", this.a, ", analyticsData=null)");
    }
}
