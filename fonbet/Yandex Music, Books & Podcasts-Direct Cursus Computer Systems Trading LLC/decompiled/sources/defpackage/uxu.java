package defpackage;

/* loaded from: classes4.dex */
public final class uxu implements vxu {
    public final tfo a;

    public uxu(tfo tfoVar) {
        this.a = tfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxu) && this.a.equals(((uxu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TracksReceived(batch=" + this.a + ")";
    }
}
