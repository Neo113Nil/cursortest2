package G;

import E0.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f333a;

    public d(String str) {
        i.e(str, "name");
        this.f333a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f333a, ((d) obj).f333a);
    }

    public final int hashCode() {
        return this.f333a.hashCode();
    }

    public final String toString() {
        return this.f333a;
    }
}
