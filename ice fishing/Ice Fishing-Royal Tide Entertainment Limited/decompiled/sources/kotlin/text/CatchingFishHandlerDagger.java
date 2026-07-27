package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishHandlerDagger extends CatchingFishMVIBundle implements CatchingFishJobSchedulerMVP {
    public /* synthetic */ Object CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final /* synthetic */ int CatchingFishViewModelFAB = 1;

    public /* synthetic */ CatchingFishHandlerDagger(int i, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(i, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.CatchingFishLayout;
                if (i == 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    CatchingFishKtorView catchingFishKtorView = (CatchingFishKtorView) this.CatchingFishFragmentHandler;
                    this.CatchingFishLayout = 1;
                    Object CatchingFishCoroutine = CatchingFishKtorView.CatchingFishCoroutine(catchingFishKtorView, this);
                    CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                    if (CatchingFishCoroutine == catchingFishXMLLayoutMockk) {
                        return catchingFishXMLLayoutMockk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                int i2 = this.CatchingFishLayout;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    return obj;
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                CatchingFishHiltDagger catchingFishHiltDagger = (CatchingFishHiltDagger) this.CatchingFishFragmentHandler;
                this.CatchingFishLayout = 1;
                catchingFishHiltDagger.getClass();
                Object CatchingFishParcelableFAB = CatchingFishHiltDagger.CatchingFishParcelableFAB(catchingFishHiltDagger, this);
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                return CatchingFishParcelableFAB == catchingFishXMLLayoutMockk2 ? catchingFishXMLLayoutMockk2 : CatchingFishParcelableFAB;
        }
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishHandlerDagger((CatchingFishKtorView) this.CatchingFishFragmentHandler, (CatchingFishWebsocketGradle) obj3).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
            default:
                ((Boolean) obj2).getClass();
                CatchingFishHandlerDagger catchingFishHandlerDagger = new CatchingFishHandlerDagger(3, (CatchingFishWebsocketGradle) obj3);
                catchingFishHandlerDagger.CatchingFishFragmentHandler = (CatchingFishHiltDagger) obj;
                return catchingFishHandlerDagger.CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishHandlerDagger(CatchingFishKtorView catchingFishKtorView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(3, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishKtorView;
    }
}
