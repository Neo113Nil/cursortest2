package defpackage;

/* loaded from: classes4.dex */
public final class b3t implements c3t {
    public final String a;

    public b3t(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3t) && this.a.equals(((b3t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("InteractiveAction(action=", this.a, ")");
    }
}
