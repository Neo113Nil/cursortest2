package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRealmFlux implements CatchingFishGlideParcelable {
    public final /* synthetic */ CatchingFishExoPlayerGson CatchingFishParcelableFAB;

    public CatchingFishRealmFlux(CatchingFishExoPlayerGson catchingFishExoPlayerGson) {
        this.CatchingFishParcelableFAB = catchingFishExoPlayerGson;
    }

    @Override // kotlin.text.CatchingFishGlideParcelable
    public final void CatchingFishParcelableFAB(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        CatchingFishExoPlayerGson catchingFishExoPlayerGson = this.CatchingFishParcelableFAB;
        catchingFishExoPlayerGson.CatchingFishOkHttp.sendMessage(catchingFishExoPlayerGson.CatchingFishOkHttp.obtainMessage(1, valueOf));
    }
}
