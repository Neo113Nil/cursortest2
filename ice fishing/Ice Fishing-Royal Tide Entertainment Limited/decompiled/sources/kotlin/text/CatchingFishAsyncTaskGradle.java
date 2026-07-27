package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishAsyncTaskGradle {
    public static final int CatchingFishCoroutine(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final int CatchingFishDaggerWebsocket(int i, long j) {
        int CatchingFishLayout = CatchingFishGradleGraphQL.CatchingFishLayout(j);
        int CatchingFishViewModelScope = CatchingFishGradleGraphQL.CatchingFishViewModelScope(j);
        if (i < CatchingFishLayout) {
            i = CatchingFishLayout;
        }
        return i > CatchingFishViewModelScope ? CatchingFishViewModelScope : i;
    }

    public static final Void CatchingFishLayout(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }

    public static final long CatchingFishParcelableFAB(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            CatchingFishDaggerService.CatchingFishParcelableFAB("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return CatchingFishWorkManager(i, i2, i3, i4);
    }

    public static final int CatchingFishReduxKtor(int i, long j) {
        int CatchingFishViewModelFAB = CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j);
        int CatchingFishWorkManager = CatchingFishGradleGraphQL.CatchingFishWorkManager(j);
        if (i < CatchingFishViewModelFAB) {
            i = CatchingFishViewModelFAB;
        }
        return i > CatchingFishWorkManager ? CatchingFishWorkManager : i;
    }

    public static final void CatchingFishViewModelFAB(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    public static final long CatchingFishViewModelScope(int i, int i2, long j) {
        int CatchingFishLayout = CatchingFishGradleGraphQL.CatchingFishLayout(j) + i;
        if (CatchingFishLayout < 0) {
            CatchingFishLayout = 0;
        }
        int CatchingFishViewModelScope = CatchingFishGradleGraphQL.CatchingFishViewModelScope(j);
        if (CatchingFishViewModelScope != Integer.MAX_VALUE && (CatchingFishViewModelScope = CatchingFishViewModelScope + i) < 0) {
            CatchingFishViewModelScope = 0;
        }
        int CatchingFishViewModelFAB = CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j) + i2;
        if (CatchingFishViewModelFAB < 0) {
            CatchingFishViewModelFAB = 0;
        }
        int CatchingFishWorkManager = CatchingFishGradleGraphQL.CatchingFishWorkManager(j);
        return CatchingFishParcelableFAB(CatchingFishLayout, CatchingFishViewModelScope, CatchingFishViewModelFAB, (CatchingFishWorkManager == Integer.MAX_VALUE || (CatchingFishWorkManager = CatchingFishWorkManager + i2) >= 0) ? CatchingFishWorkManager : 0);
    }

    public static final long CatchingFishWorkManager(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int CatchingFishCoroutine = CatchingFishCoroutine(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int CatchingFishCoroutine2 = CatchingFishCoroutine(i6);
        if (CatchingFishCoroutine + CatchingFishCoroutine2 > 31) {
            CatchingFishViewModelFAB(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = CatchingFishCoroutine2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (CatchingFishCoroutine2 + 2)) | ((i8 & (~(i8 >> 31))) << (CatchingFishCoroutine2 + 33));
    }
}
