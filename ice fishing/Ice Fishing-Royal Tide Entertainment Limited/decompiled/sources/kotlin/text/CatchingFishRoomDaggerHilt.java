package kotlin.text;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishRoomDaggerHilt extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishGradleCameraX CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishRoomDaggerHilt(CatchingFishGradleCameraX catchingFishGradleCameraX, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishGradleCameraX;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishViewPagerFAB catchingFishViewPagerFAB;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                KeyEvent keyEvent = ((CatchingFishWorkManagerFAB) obj).CatchingFishParcelableFAB;
                long CatchingFishCoroutine = CatchingFishGsonCardView.CatchingFishCoroutine(keyEvent.getKeyCode());
                if (CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishSnackbar)) {
                    catchingFishViewPagerFAB = new CatchingFishViewPagerFAB(2);
                } else if (CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishCoroutine)) {
                    catchingFishViewPagerFAB = new CatchingFishViewPagerFAB(1);
                } else if (CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishLayout)) {
                    catchingFishViewPagerFAB = new CatchingFishViewPagerFAB(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    catchingFishViewPagerFAB = CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishViewModelScope) ? new CatchingFishViewPagerFAB(4) : CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishWorkManager) ? new CatchingFishViewPagerFAB(3) : (CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishReduxKtor) || CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishEspressoTesting)) ? new CatchingFishViewPagerFAB(5) : (CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishDaggerWebsocket) || CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishOkHttp)) ? new CatchingFishViewPagerFAB(6) : (CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishViewModelFAB) || CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishFragmentHandler) || CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishUnitTesting)) ? new CatchingFishViewPagerFAB(7) : (CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishParcelableFAB) || CatchingFishEspressoFAB.CatchingFishParcelableFAB(CatchingFishCoroutine, CatchingFishEspressoFAB.CatchingFishCloudMessaging)) ? new CatchingFishViewPagerFAB(8) : null;
                }
                if (catchingFishViewPagerFAB != null) {
                    int i = catchingFishViewPagerFAB.CatchingFishParcelableFAB;
                    if (keyEvent.getAction() == 0) {
                        Integer CatchingFishRecyclerView = CatchingFishRobolectricHilt.CatchingFishRecyclerView(i);
                        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishWorkManager;
                        CatchingFishFluxExoPlayer embeddedViewFocusRect = catchingFishGradleCameraX.getEmbeddedViewFocusRect();
                        Boolean CatchingFishDaggerWebsocket = ((CatchingFishExoPlayerOkHttp) catchingFishGradleCameraX.getFocusOwner()).CatchingFishDaggerWebsocket(i, embeddedViewFocusRect, new CatchingFishFluxAnimation(catchingFishViewPagerFAB, 1));
                        if (CatchingFishDaggerWebsocket != null ? CatchingFishDaggerWebsocket.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i == 1 || i == 2)) {
                            return Boolean.FALSE;
                        }
                        if (CatchingFishRecyclerView != null) {
                            int intValue = CatchingFishRecyclerView.intValue();
                            Object obj2 = CatchingFishServiceMVPFlux.CatchingFishWorkManager.get();
                            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj2);
                            CatchingFishServiceMVPFlux catchingFishServiceMVPFlux = (CatchingFishServiceMVPFlux) obj2;
                            View view = catchingFishGradleCameraX;
                            while (true) {
                                if (view != null) {
                                    View rootView = catchingFishGradleCameraX.getRootView();
                                    CatchingFishFirebaseDagger.CatchingFishStateLiveData(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    view = catchingFishServiceMVPFlux.CatchingFishSnackbar(intValue, view, (ViewGroup) rootView);
                                    if (view != null) {
                                        if (!view.equals(catchingFishGradleCameraX)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == catchingFishGradleCameraX) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(view, catchingFishGradleCameraX)) {
                                view = null;
                            }
                            if (view != null) {
                                Rect rect = embeddedViewFocusRect != null ? new Rect((int) embeddedViewFocusRect.CatchingFishParcelableFAB, (int) embeddedViewFocusRect.CatchingFishSnackbar, (int) embeddedViewFocusRect.CatchingFishCoroutine, (int) embeddedViewFocusRect.CatchingFishReduxKtor) : null;
                                if (rect == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                View rootView2 = catchingFishGradleCameraX.getRootView();
                                CatchingFishFirebaseDagger.CatchingFishStateLiveData(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(catchingFishGradleCameraX, rect);
                                viewGroup.offsetRectIntoDescendantCoords(view, rect);
                                if (CatchingFishRobolectricHilt.CatchingFishMotionLayout(view, CatchingFishRecyclerView, rect)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((CatchingFishExoPlayerOkHttp) catchingFishGradleCameraX.getFocusOwner()).CatchingFishSnackbar(i, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean CatchingFishDaggerWebsocket2 = ((CatchingFishExoPlayerOkHttp) catchingFishGradleCameraX.getFocusOwner()).CatchingFishDaggerWebsocket(i, null, new CatchingFishFluxAnimation(catchingFishViewPagerFAB, 0));
                        return Boolean.valueOf(CatchingFishDaggerWebsocket2 != null ? CatchingFishDaggerWebsocket2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                CatchingFishJUnitGlide catchingFishJUnitGlide = (CatchingFishJUnitGlide) obj;
                CatchingFishGradleCameraX catchingFishGradleCameraX2 = this.CatchingFishWorkManager;
                Handler handler = catchingFishGradleCameraX2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    catchingFishJUnitGlide.CatchingFishParcelableFAB();
                } else {
                    Handler handler2 = catchingFishGradleCameraX2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new CatchingFishOkHttpSpannable(catchingFishJUnitGlide, 1));
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
