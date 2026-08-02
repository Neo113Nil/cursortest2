package defpackage;

/* loaded from: classes3.dex */
public final class n3k implements a1a {
    public final int a;

    public n3k(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3k) && this.a == ((n3k) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("PagerState(currentPageIndex="), this.a, ')');
    }
}
