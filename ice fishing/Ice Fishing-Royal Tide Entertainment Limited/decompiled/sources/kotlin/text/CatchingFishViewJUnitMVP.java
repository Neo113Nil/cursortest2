package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewJUnitMVP extends CatchingFishGraphQLMVIFAB {
    public int CatchingFishCoroutine;

    public CatchingFishViewJUnitMVP(int i, long j) {
        super(j);
        this.CatchingFishCoroutine = i;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final void CatchingFishParcelableFAB(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.CatchingFishCoroutine = ((CatchingFishViewJUnitMVP) catchingFishGraphQLMVIFAB).CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final CatchingFishGraphQLMVIFAB CatchingFishSnackbar(long j) {
        return new CatchingFishViewJUnitMVP(this.CatchingFishCoroutine, j);
    }
}
