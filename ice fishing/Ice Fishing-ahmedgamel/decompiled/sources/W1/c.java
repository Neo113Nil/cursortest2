package W1;

import u1.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3406a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f3406a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f3406a.equals(((c) obj).f3406a);
    }

    public final int hashCode() {
        return this.f3406a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return h.g(new StringBuilder("Encoding{name=\""), this.f3406a, "\"}");
    }
}
