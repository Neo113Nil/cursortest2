package defpackage;

/* loaded from: classes4.dex */
public final class rrw {
    public final zow a;
    public final faq b;

    public rrw(zow zowVar, faq faqVar) {
        this.a = zowVar;
        this.b = faqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrw)) {
            return false;
        }
        rrw rrwVar = (rrw) obj;
        return this.a.equals(rrwVar.a) && this.b.equals(rrwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommandWrapper(command=" + this.a + ", playable=" + this.b + ")";
    }
}
