package kotlin.text;

import android.view.View;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishBiometricMockk extends CatchingFishMVIBundle implements CatchingFishMockkView {
    public final /* synthetic */ View CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishMVIHandlerHilt CatchingFishLayout;
    public int CatchingFishViewModelFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishBiometricMockk(CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt, View view, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(2, catchingFishWebsocketGradle);
        this.CatchingFishLayout = catchingFishMVIHandlerHilt;
        this.CatchingFishFragmentHandler = view;
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        return new CatchingFishBiometricMockk(this.CatchingFishLayout, this.CatchingFishFragmentHandler, catchingFishWebsocketGradle);
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return ((CatchingFishBiometricMockk) CatchingFishCloudMessaging((CatchingFishToastLayout) obj, (CatchingFishWebsocketGradle) obj2)).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishMoshiCameraX
    public final Object CatchingFishOkHttp(Object obj) {
        int i = this.CatchingFishViewModelFAB;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt = this.CatchingFishLayout;
        View view = this.CatchingFishFragmentHandler;
        try {
            if (i == 0) {
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                this.CatchingFishViewModelFAB = 1;
                Object CatchingFishStateLiveData = CatchingFishBiometricBundle.CatchingFishStateLiveData(catchingFishMVIHandlerHilt.CatchingFishJetpackCompose, new CatchingFishAdMobDagger(2, null), this);
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (CatchingFishStateLiveData != catchingFishXMLLayoutMockk) {
                    CatchingFishStateLiveData = catchingFishRealmContext;
                }
                if (CatchingFishStateLiveData == catchingFishXMLLayoutMockk) {
                    return catchingFishXMLLayoutMockk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
            }
            if (CatchingFishSnackbarDagger.CatchingFishSnackbar(view) == catchingFishMVIHandlerHilt) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return catchingFishRealmContext;
        } finally {
            if (CatchingFishSnackbarDagger.CatchingFishSnackbar(view) == catchingFishMVIHandlerHilt) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
