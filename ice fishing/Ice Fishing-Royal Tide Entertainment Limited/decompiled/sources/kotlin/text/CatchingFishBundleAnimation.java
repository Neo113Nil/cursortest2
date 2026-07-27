package kotlin.text;

/* loaded from: classes.dex */
public interface CatchingFishBundleAnimation {
    default CatchingFishBundleAnimation CatchingFishCoroutine(CatchingFishBundleAnimation catchingFishBundleAnimation) {
        return catchingFishBundleAnimation == CatchingFishMoshiDagger.CatchingFishParcelableFAB ? this : new CatchingFishRoomMVP(this, catchingFishBundleAnimation);
    }

    Object CatchingFishParcelableFAB(Object obj, CatchingFishMockkView catchingFishMockkView);

    boolean CatchingFishSnackbar(CatchingFishServiceHandler catchingFishServiceHandler);
}
