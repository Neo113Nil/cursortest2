package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishRoomBiometric implements CatchingFishServiceHandler {
    public static final CatchingFishRoomBiometric CatchingFishReduxKtor = new CatchingFishRoomBiometric();

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, Boolean.FALSE)) {
            return new CatchingFishToastFragment(CatchingFishToastFragment.CatchingFishWorkManager);
        }
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type kotlin.Int");
        return new CatchingFishToastFragment(CatchingFishFirebaseDagger.CatchingFishSnackbar(((Integer) obj).intValue()));
    }
}
