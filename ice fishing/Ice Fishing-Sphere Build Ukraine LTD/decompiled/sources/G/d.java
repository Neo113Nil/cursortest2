package G;

import E0.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f334a;

    public d(String str) {
        i.e(str, "name");
        this.f334a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f334a, ((d) obj).f334a);
    }

    public final int hashCode() {
        return this.f334a.hashCode();
    }

    public final String toString() {
        return this.f334a;
    }
}
