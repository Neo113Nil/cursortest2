package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastViewModel {
    public static final /* synthetic */ int CatchingFishCoroutine = 0;
    public static final long CatchingFishSnackbar = CatchingFishToastHiltBundle.CatchingFishWorkManager(0, 0);
    public final long CatchingFishParcelableFAB;

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishToastViewModel) {
            return this.CatchingFishParcelableFAB == ((CatchingFishToastViewModel) obj).CatchingFishParcelableFAB;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRange(");
        long j = this.CatchingFishParcelableFAB;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, (int) (j & 4294967295L), ')');
    }
}
