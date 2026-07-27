package N7;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: w, reason: collision with root package name */
    public static final c f2024w = new c(1, 0, 1);

    @Override // N7.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        if (this.f2017n == cVar.f2017n) {
            return this.f2018u == cVar.f2018u;
        }
        return false;
    }

    @Override // N7.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2017n * 31) + this.f2018u;
    }

    @Override // N7.a
    public final boolean isEmpty() {
        return this.f2017n > this.f2018u;
    }

    @Override // N7.a
    public final String toString() {
        return this.f2017n + ".." + this.f2018u;
    }
}
