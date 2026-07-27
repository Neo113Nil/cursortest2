package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGradleGraphQL {
    public final long CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishGradleGraphQL(long j) {
        this.CatchingFishParcelableFAB = j;
    }

    public static final boolean CatchingFishCoroutine(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean CatchingFishDaggerWebsocket(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    public static final int CatchingFishLayout(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static long CatchingFishParcelableFAB(int i, int i2, long j) {
        int CatchingFishViewModelScope = CatchingFishViewModelScope(j);
        int CatchingFishWorkManager = CatchingFishWorkManager(j);
        if (CatchingFishViewModelScope < i || CatchingFishWorkManager < i2 || i < 0 || i2 < 0) {
            CatchingFishDaggerService.CatchingFishParcelableFAB("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return CatchingFishAsyncTaskGradle.CatchingFishWorkManager(i, CatchingFishViewModelScope, i2, CatchingFishWorkManager);
    }

    public static final boolean CatchingFishReduxKtor(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean CatchingFishSnackbar(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final int CatchingFishViewModelFAB(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int CatchingFishViewModelScope(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int CatchingFishWorkManager(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishGradleGraphQL) {
            return this.CatchingFishParcelableFAB == ((CatchingFishGradleGraphQL) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        long j = this.CatchingFishParcelableFAB;
        int CatchingFishViewModelScope = CatchingFishViewModelScope(j);
        String valueOf = CatchingFishViewModelScope == Integer.MAX_VALUE ? "Infinity" : String.valueOf(CatchingFishViewModelScope);
        int CatchingFishWorkManager = CatchingFishWorkManager(j);
        return "Constraints(minWidth = " + CatchingFishLayout(j) + ", maxWidth = " + valueOf + ", minHeight = " + CatchingFishViewModelFAB(j) + ", maxHeight = " + (CatchingFishWorkManager != Integer.MAX_VALUE ? String.valueOf(CatchingFishWorkManager) : "Infinity") + ')';
    }
}
