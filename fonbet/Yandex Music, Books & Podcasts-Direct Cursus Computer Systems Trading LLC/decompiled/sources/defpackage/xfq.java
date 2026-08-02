package defpackage;

/* loaded from: classes5.dex */
public final class xfq extends org {
    public final asg a;

    public xfq(asg asgVar) {
        this.a = asgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfq) && this.a.equals(((xfq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SignatureVerificationFailed(signatureResult=" + this.a + ')';
    }
}
