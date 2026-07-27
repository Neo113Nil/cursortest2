package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpLifecycle extends CatchingFishGraphQLMVIFAB {
    public long CatchingFishCoroutine;

    public CatchingFishOkHttpLifecycle(long j, long j2) {
        super(j);
        this.CatchingFishCoroutine = j2;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final void CatchingFishParcelableFAB(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.CatchingFishCoroutine = ((CatchingFishOkHttpLifecycle) catchingFishGraphQLMVIFAB).CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final CatchingFishGraphQLMVIFAB CatchingFishSnackbar(long j) {
        return new CatchingFishOkHttpLifecycle(j, this.CatchingFishCoroutine);
    }
}
