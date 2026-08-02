package defpackage;

/* loaded from: classes3.dex */
public final class q3r implements pfn {
    public final String a;

    public q3r(String str) {
        this.a = str;
    }

    @Override // defpackage.pfn
    public final String a(String str) {
        str.getClass();
        return hrg.r("radio-mobile-", str, "-", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3r) && this.a.equals(((q3r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SourceRadioFrom(source=", this.a, ")");
    }
}
