package kotlin.text;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishLayoutHilt extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishFluxFluxBundle CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public CatchingFishHandlerGradle CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishLayoutHilt(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishFluxFluxBundle;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishLayoutHilt(this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishLayoutHilt) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r0.CatchingFishDaggerWebsocket(r7, r6) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r7 != r4) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:6:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishHandlerGradle catchingFishHandlerGradle;
        int i = this.CatchingFishLayout;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishFragmentHandler;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        if (i == 0) {
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            if (((AtomicInteger) ((CatchingFishServiceHilt) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishDaggerWebsocket).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            CatchingFishLayoutRoomFAB.CatchingFishSpannableWidget(((CatchingFishToastLayout) catchingFishFluxFluxBundle.CatchingFishReduxKtor).CatchingFishParcelableFAB());
            catchingFishHandlerGradle = (CatchingFishHandlerGradle) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
            CatchingFishPicassoCameraX catchingFishPicassoCameraX = (CatchingFishPicassoCameraX) catchingFishFluxFluxBundle.CatchingFishWorkManager;
            this.CatchingFishViewModelFAB = catchingFishHandlerGradle;
            this.CatchingFishLayout = 1;
            obj = catchingFishPicassoCameraX.CatchingFishCloudMessaging(this);
        } else if (i == 1) {
            catchingFishHandlerGradle = this.CatchingFishViewModelFAB;
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            this.CatchingFishViewModelFAB = null;
            this.CatchingFishLayout = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            if (((AtomicInteger) ((CatchingFishServiceHilt) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishDaggerWebsocket).decrementAndGet() == 0) {
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            }
            CatchingFishLayoutRoomFAB.CatchingFishSpannableWidget(((CatchingFishToastLayout) catchingFishFluxFluxBundle.CatchingFishReduxKtor).CatchingFishParcelableFAB());
            catchingFishHandlerGradle = (CatchingFishHandlerGradle) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
            CatchingFishPicassoCameraX catchingFishPicassoCameraX2 = (CatchingFishPicassoCameraX) catchingFishFluxFluxBundle.CatchingFishWorkManager;
            this.CatchingFishViewModelFAB = catchingFishHandlerGradle;
            this.CatchingFishLayout = 1;
            obj = catchingFishPicassoCameraX2.CatchingFishCloudMessaging(this);
        }
    }
}
