package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreMVI extends CatchingFishFABStripeAPIFAB implements CatchingFishCameraXService {
    public final /* synthetic */ CatchingFishViewWebsocket CatchingFishNavigation;

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishDataStoreMVI(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishNavigation = (CatchingFishViewWebsocket) catchingFishServiceHandler;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.text.CatchingFishServiceHandler, kotlin.text.CatchingFishViewWebsocket] */
    @Override // kotlin.text.CatchingFishCameraXService
    public final void CatchingFishCloudMessaging(CatchingFishMVPMotionLayout catchingFishMVPMotionLayout) {
        this.CatchingFishNavigation.CatchingFishFragmentHandler(catchingFishMVPMotionLayout);
    }
}
