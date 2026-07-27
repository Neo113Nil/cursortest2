package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishStateFlowMoshi extends CatchingFishGraphQLMVIFAB {
    public float CatchingFishCoroutine;

    public CatchingFishStateFlowMoshi(long j, float f) {
        super(j);
        this.CatchingFishCoroutine = f;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final void CatchingFishParcelableFAB(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.CatchingFishCoroutine = ((CatchingFishStateFlowMoshi) catchingFishGraphQLMVIFAB).CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final CatchingFishGraphQLMVIFAB CatchingFishSnackbar(long j) {
        return new CatchingFishStateFlowMoshi(j, this.CatchingFishCoroutine);
    }
}
