package defpackage;

/* loaded from: classes4.dex */
public final class ynw implements znw {
    public final unw a;

    public ynw(unw unwVar) {
        this.a = unwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynw) && this.a.equals(((ynw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(diff=" + this.a + ")";
    }
}
