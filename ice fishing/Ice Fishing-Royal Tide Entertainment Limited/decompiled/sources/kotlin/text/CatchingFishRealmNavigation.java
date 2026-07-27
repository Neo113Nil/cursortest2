package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRealmNavigation implements CatchingFishSpannableBundle {
    public static final CatchingFishRealmNavigation CatchingFishParcelableFAB = new CatchingFishRealmNavigation();
    public static Boolean CatchingFishSnackbar;

    @Override // kotlin.text.CatchingFishSpannableBundle
    public final void CatchingFishCoroutine(boolean z) {
        CatchingFishSnackbar = Boolean.valueOf(z);
    }

    @Override // kotlin.text.CatchingFishSpannableBundle
    public final boolean CatchingFishSnackbar() {
        Boolean bool = CatchingFishSnackbar;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw CatchingFishMVPLiveData.CatchingFish("canFocus is read before it is written");
    }
}
