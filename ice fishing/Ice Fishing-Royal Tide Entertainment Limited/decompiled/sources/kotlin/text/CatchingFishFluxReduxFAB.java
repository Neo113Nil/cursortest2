package kotlin.text;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishFluxReduxFAB implements CatchingFishMVPViewService {
    public final /* synthetic */ CatchingFishWebsocketWidget CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishFABCoroutine CatchingFishReduxKtor;
    public final /* synthetic */ View CatchingFishViewModelFAB;
    public final /* synthetic */ CatchingFishRoomGoogleMaps CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishMVIHandlerHilt CatchingFishWorkManager;

    public CatchingFishFluxReduxFAB(CatchingFishFABCoroutine catchingFishFABCoroutine, CatchingFishWebsocketWidget catchingFishWebsocketWidget, CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt, CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps, View view) {
        this.CatchingFishReduxKtor = catchingFishFABCoroutine;
        this.CatchingFishDaggerWebsocket = catchingFishWebsocketWidget;
        this.CatchingFishWorkManager = catchingFishMVIHandlerHilt;
        this.CatchingFishViewModelScope = catchingFishRoomGoogleMaps;
        this.CatchingFishViewModelFAB = view;
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        boolean z;
        CatchingFishGsonLiveData catchingFishGsonLiveData = null;
        switch (CatchingFishRoomNavigation.CatchingFishParcelableFAB[catchingFishToolbarLiveData.ordinal()]) {
            case 1:
                CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(this.CatchingFishReduxKtor, null, new CatchingFishToolbarService(this.CatchingFishViewModelScope, this.CatchingFishWorkManager, catchingFishToastFlux, this, this.CatchingFishViewModelFAB, null), 1);
                return;
            case 2:
                CatchingFishWebsocketWidget catchingFishWebsocketWidget = this.CatchingFishDaggerWebsocket;
                if (catchingFishWebsocketWidget != null) {
                    CatchingFishWebsocketRoom catchingFishWebsocketRoom = (CatchingFishWebsocketRoom) catchingFishWebsocketWidget.CatchingFishWorkManager;
                    synchronized (catchingFishWebsocketRoom.CatchingFishSnackbar) {
                        try {
                            synchronized (catchingFishWebsocketRoom.CatchingFishSnackbar) {
                                z = catchingFishWebsocketRoom.CatchingFishParcelableFAB;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) catchingFishWebsocketRoom.CatchingFishCoroutine;
                                catchingFishWebsocketRoom.CatchingFishCoroutine = (ArrayList) catchingFishWebsocketRoom.CatchingFishReduxKtor;
                                catchingFishWebsocketRoom.CatchingFishReduxKtor = arrayList;
                                catchingFishWebsocketRoom.CatchingFishParcelableFAB = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((CatchingFishWebsocketGradle) arrayList.get(i)).CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt = this.CatchingFishWorkManager;
                synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
                    if (catchingFishMVIHandlerHilt.CatchingFish) {
                        catchingFishMVIHandlerHilt.CatchingFish = false;
                        catchingFishGsonLiveData = catchingFishMVIHandlerHilt.CatchingFishDaggerHiltFAB();
                    }
                }
                if (catchingFishGsonLiveData != null) {
                    ((CatchingFishKtorMockk) catchingFishGsonLiveData).CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
                    return;
                }
                return;
            case 3:
                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt2 = this.CatchingFishWorkManager;
                synchronized (catchingFishMVIHandlerHilt2.CatchingFishSnackbar) {
                    catchingFishMVIHandlerHilt2.CatchingFish = true;
                }
                return;
            case 4:
                this.CatchingFishWorkManager.CatchingFishCoroutineFlow();
                return;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                throw new CatchingFishBiometricView();
        }
    }
}
