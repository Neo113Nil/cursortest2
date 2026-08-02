package defpackage;

/* loaded from: classes4.dex */
public final class nhw {
    public final String a;

    public nhw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhw) && this.a.equals(((nhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("QueueIdentity(reason=", this.a, ")");
    }
}
