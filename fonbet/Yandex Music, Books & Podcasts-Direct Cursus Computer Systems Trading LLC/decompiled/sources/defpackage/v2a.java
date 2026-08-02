package defpackage;

/* loaded from: classes5.dex */
public final class v2a extends cxb {
    public final boolean t;

    public v2a(boolean z) {
        this.t = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v2a) {
            return this.t == ((v2a) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t);
    }

    public final String toString() {
        return vz1.q("ReloadDocument(retryAfterError=", ")", this.t);
    }
}
