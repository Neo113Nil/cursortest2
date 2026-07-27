package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxAnimation extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishViewPagerFAB CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishFluxAnimation(CatchingFishViewPagerFAB catchingFishViewPagerFAB, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishViewPagerFAB;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
        }
        return Boolean.valueOf(((CatchingFishAppCompatWidget) obj).CatchingFishFragmentFactory(this.CatchingFishWorkManager.CatchingFishParcelableFAB));
    }
}
