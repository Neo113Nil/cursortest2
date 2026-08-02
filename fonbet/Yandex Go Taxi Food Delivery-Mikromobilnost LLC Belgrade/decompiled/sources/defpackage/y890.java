package defpackage;

/* loaded from: classes.dex */
public final class y890 implements npl {
    public final int a;

    public y890(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y890) && this.a == ((y890) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("PagerState(currentPageIndex="), this.a, ')');
    }
}
