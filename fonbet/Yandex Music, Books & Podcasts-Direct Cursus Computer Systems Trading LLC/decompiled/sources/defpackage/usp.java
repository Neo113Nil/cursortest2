package defpackage;

/* loaded from: classes3.dex */
public final class usp implements wsp {
    public final nyn a;

    public usp(nyn nynVar) {
        this.a = nynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usp) && this.a == ((usp) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Available(mode=" + this.a + ")";
    }
}
