package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRoomMVP implements CatchingFishBundleAnimation {
    public final CatchingFishBundleAnimation CatchingFishParcelableFAB;
    public final CatchingFishBundleAnimation CatchingFishSnackbar;

    public CatchingFishRoomMVP(CatchingFishBundleAnimation catchingFishBundleAnimation, CatchingFishBundleAnimation catchingFishBundleAnimation2) {
        this.CatchingFishParcelableFAB = catchingFishBundleAnimation;
        this.CatchingFishSnackbar = catchingFishBundleAnimation2;
    }

    @Override // kotlin.text.CatchingFishBundleAnimation
    public final Object CatchingFishParcelableFAB(Object obj, CatchingFishMockkView catchingFishMockkView) {
        return this.CatchingFishSnackbar.CatchingFishParcelableFAB(this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(obj, catchingFishMockkView), catchingFishMockkView);
    }

    @Override // kotlin.text.CatchingFishBundleAnimation
    public final boolean CatchingFishSnackbar(CatchingFishServiceHandler catchingFishServiceHandler) {
        return this.CatchingFishParcelableFAB.CatchingFishSnackbar(catchingFishServiceHandler) && this.CatchingFishSnackbar.CatchingFishSnackbar(catchingFishServiceHandler);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishRoomMVP)) {
            return false;
        }
        CatchingFishRoomMVP catchingFishRoomMVP = (CatchingFishRoomMVP) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishRoomMVP.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishRoomMVP.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return (this.CatchingFishSnackbar.hashCode() * 31) + this.CatchingFishParcelableFAB.hashCode();
    }

    public final String toString() {
        return "[" + ((String) CatchingFishParcelableFAB("", CatchingFishLiveDataRoom.CatchingFishOkHttp)) + ']';
    }
}
