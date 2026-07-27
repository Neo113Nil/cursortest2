package kotlin.text;

import android.view.View;
import android.view.ViewTreeObserver;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishMVPStateFlow implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVPStateFlow(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishHandlerContext catchingFishHandlerContext = (CatchingFishHandlerContext) this.CatchingFishDaggerWebsocket;
                if (!catchingFishHandlerContext.getInternalPopup().CatchingFishParcelableFAB()) {
                    catchingFishHandlerContext.CatchingFishLayout.CatchingFishOkHttp(catchingFishHandlerContext.getTextDirection(), catchingFishHandlerContext.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = catchingFishHandlerContext.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                CatchingFishMVIFAB catchingFishMVIFAB = (CatchingFishMVIFAB) this.CatchingFishDaggerWebsocket;
                CatchingFishHandlerContext catchingFishHandlerContext2 = catchingFishMVIFAB.CatchingFishEspressoMockk;
                catchingFishMVIFAB.getClass();
                if (!catchingFishHandlerContext2.isAttachedToWindow() || !catchingFishHandlerContext2.getGlobalVisibleRect(catchingFishMVIFAB.CatchingFishPayPalService)) {
                    catchingFishMVIFAB.dismiss();
                    break;
                } else {
                    catchingFishMVIFAB.CatchingFish();
                    catchingFishMVIFAB.CatchingFishReduxKtor();
                    break;
                }
                break;
            case 2:
                CatchingFishSpannableMockk catchingFishSpannableMockk = (CatchingFishSpannableMockk) this.CatchingFishDaggerWebsocket;
                ArrayList arrayList = catchingFishSpannableMockk.CatchingFishCloudMessaging;
                if (catchingFishSpannableMockk.CatchingFishParcelableFAB() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((CatchingFishMockkRetrofit) arrayList.get(0)).CatchingFishParcelableFAB.CatchingFishCardViewView) {
                        View view = catchingFishSpannableMockk.CatchingFishNavigation;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((CatchingFishMockkRetrofit) obj).CatchingFishParcelableFAB.CatchingFishReduxKtor();
                            }
                            break;
                        } else {
                            catchingFishSpannableMockk.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                CatchingFishWebSocketGlide catchingFishWebSocketGlide = (CatchingFishWebSocketGlide) this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMToastRoom catchingFishMVVMToastRoom = catchingFishWebSocketGlide.CatchingFishCloudMessaging;
                if (catchingFishWebSocketGlide.CatchingFishParcelableFAB() && !catchingFishMVVMToastRoom.CatchingFishCardViewView) {
                    View view2 = catchingFishWebSocketGlide.CatchingFishStateLiveData;
                    if (view2 != null && view2.isShown()) {
                        catchingFishMVVMToastRoom.CatchingFishReduxKtor();
                        break;
                    } else {
                        catchingFishWebSocketGlide.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
