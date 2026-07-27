package kotlin.text;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CatchingFishViewDaggerHilt extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ CatchingFishPicassoCameraX CatchingFishCloudMessaging;
    public int CatchingFishFragmentHandler;
    public CatchingFishMVVMCardView CatchingFishLayout;
    public CatchingFishIntentMVP CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewDaggerHilt(CatchingFishPicassoCameraX catchingFishPicassoCameraX, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishCloudMessaging = catchingFishPicassoCameraX;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishViewDaggerHilt(this.CatchingFishCloudMessaging, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishViewDaggerHilt) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0058, B:19:0x0027, B:23:0x005b, B:26:0x0060, B:27:0x0061, B:34:0x0021, B:12:0x004b, B:14:0x0051), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.text.CatchingFishIntentMVP] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishPicassoCameraX catchingFishPicassoCameraX;
        CatchingFishMVVMCardView catchingFishMVVMCardView;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        int i = this.CatchingFishFragmentHandler;
        try {
            if (i == 0) {
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                catchingFishPicassoCameraX = this.CatchingFishCloudMessaging;
                catchingFishMVVMCardView = new CatchingFishMVVMCardView(catchingFishPicassoCameraX);
                this.CatchingFishViewModelFAB = catchingFishPicassoCameraX;
                this.CatchingFishLayout = catchingFishMVVMCardView;
                this.CatchingFishFragmentHandler = 1;
                obj = catchingFishMVVMCardView.CatchingFishSnackbar(this);
                catchingFishPicassoCameraX = catchingFishPicassoCameraX;
                if (obj == catchingFishXMLLayoutMockk) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catchingFishMVVMCardView = this.CatchingFishLayout;
                ?? r4 = this.CatchingFishViewModelFAB;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                catchingFishPicassoCameraX = r4;
                if (((Boolean) obj).booleanValue()) {
                    boolean z = false;
                    CatchingFishHandlerFirebase.CatchingFishSnackbar.set(false);
                    synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                        CatchingFishServiceBundle catchingFishServiceBundle = CatchingFishIntentBundle.CatchingFishFragmentHandler.CatchingFishViewModelFAB;
                        if (catchingFishServiceBundle != null && catchingFishServiceBundle.CatchingFishViewModelFAB()) {
                            z = true;
                        }
                    }
                    if (z) {
                        CatchingFishIntentBundle.CatchingFishParcelableFAB();
                    }
                    this.CatchingFishViewModelFAB = catchingFishPicassoCameraX;
                    this.CatchingFishLayout = catchingFishMVVMCardView;
                    this.CatchingFishFragmentHandler = 1;
                    obj = catchingFishMVVMCardView.CatchingFishSnackbar(this);
                    catchingFishPicassoCameraX = catchingFishPicassoCameraX;
                    if (obj == catchingFishXMLLayoutMockk) {
                        return catchingFishXMLLayoutMockk;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        catchingFishPicassoCameraX.CatchingFishCoroutine(null);
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CancellationException cancellationException = th instanceof CancellationException ? th : null;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                    cancellationException.initCause(th);
                }
                catchingFishPicassoCameraX.CatchingFishCoroutine(cancellationException);
                throw th2;
            }
        }
    }
}
