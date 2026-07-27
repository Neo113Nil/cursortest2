package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBundleExoPlayer extends CatchingFishGraphQLMVIFAB {
    public Object CatchingFishCoroutine;

    public CatchingFishBundleExoPlayer(long j, Object obj) {
        super(j);
        this.CatchingFishCoroutine = obj;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final void CatchingFishParcelableFAB(CatchingFishGraphQLMVIFAB catchingFishGraphQLMVIFAB) {
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishGraphQLMVIFAB, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.CatchingFishCoroutine = ((CatchingFishBundleExoPlayer) catchingFishGraphQLMVIFAB).CatchingFishCoroutine;
    }

    @Override // kotlin.text.CatchingFishGraphQLMVIFAB
    public final CatchingFishGraphQLMVIFAB CatchingFishSnackbar(long j) {
        return new CatchingFishBundleExoPlayer(CatchingFishIntentBundle.CatchingFishCloudMessaging().CatchingFishViewModelScope(), this.CatchingFishCoroutine);
    }
}
