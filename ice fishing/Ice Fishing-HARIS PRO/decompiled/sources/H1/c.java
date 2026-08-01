package H1;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f349d = new c(1, 0, 1);

    @Override // H1.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f342a == cVar.f342a) {
                    if (this.f343b == cVar.f343b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // H1.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f342a * 31) + this.f343b;
    }

    @Override // H1.a
    public final boolean isEmpty() {
        return this.f342a > this.f343b;
    }

    @Override // H1.a
    public final String toString() {
        return this.f342a + ".." + this.f343b;
    }
}
