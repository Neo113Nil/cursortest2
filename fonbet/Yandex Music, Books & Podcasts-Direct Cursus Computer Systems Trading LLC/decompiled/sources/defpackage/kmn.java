package defpackage;

/* loaded from: classes4.dex */
public final class kmn {
    public final ges a;
    public final ges b;
    public final ges c;

    public kmn(ges gesVar, ges gesVar2, ges gesVar3) {
        this.a = gesVar;
        this.b = gesVar2;
        this.c = gesVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmn)) {
            return false;
        }
        kmn kmnVar = (kmn) obj;
        return this.a.equals(kmnVar.a) && this.b.equals(kmnVar.b) && this.c.equals(kmnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RecognitionTypography(statusText=" + this.a + ", errorTitle=" + this.b + ", retryButton=" + this.c + ")";
    }
}
