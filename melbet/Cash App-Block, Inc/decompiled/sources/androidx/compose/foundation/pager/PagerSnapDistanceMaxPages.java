package androidx.compose.foundation.pager;

/* loaded from: classes3.dex */
public final class PagerSnapDistanceMaxPages {
    public final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i) {
        this.pagesLimit = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PagerSnapDistanceMaxPages) {
            return this.pagesLimit == ((PagerSnapDistanceMaxPages) obj).pagesLimit;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }
}
