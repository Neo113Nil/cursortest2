package H0;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f397e == cVar.f397e) {
                    if (this.f398f == cVar.f398f) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f397e * 31) + this.f398f;
    }

    public final boolean isEmpty() {
        return this.f397e > this.f398f;
    }

    public final String toString() {
        return this.f397e + ".." + this.f398f;
    }
}
