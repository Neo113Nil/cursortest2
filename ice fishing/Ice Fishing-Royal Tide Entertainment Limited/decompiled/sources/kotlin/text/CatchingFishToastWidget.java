package kotlin.text;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishToastWidget implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishToastWidget(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.CatchingFishReduxKtor;
        Object obj = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABViewModel catchingFishFABViewModel = (CatchingFishFABViewModel) obj;
                AccessibilityManager accessibilityManager = catchingFishFABViewModel.CatchingFishViewModelScope;
                catchingFishFABViewModel.CatchingFishCloudMessaging = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(catchingFishFABViewModel.CatchingFishLayout);
                accessibilityManager.addTouchExplorationStateChangeListener(catchingFishFABViewModel.CatchingFishFragmentHandler);
                break;
            case 1:
                CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux = (CatchingFishAsyncTaskRedux) obj;
                Context context = view.getContext();
                if (!catchingFishAsyncTaskRedux.CatchingFishParcelableFAB) {
                    context.getApplicationContext().registerComponentCallbacks((CatchingFishHiltIntentMVVM) catchingFishAsyncTaskRedux.CatchingFishDaggerWebsocket);
                    catchingFishAsyncTaskRedux.CatchingFishParcelableFAB = true;
                    break;
                }
                break;
            case 3:
                CatchingFishFragmentCameraX catchingFishFragmentCameraX = (CatchingFishFragmentCameraX) obj;
                AccessibilityManager accessibilityManager2 = catchingFishFragmentCameraX.CatchingFishSpannableWidget;
                if (catchingFishFragmentCameraX.CatchingFishParcelableFlux != null && accessibilityManager2 != null && catchingFishFragmentCameraX.isAttachedToWindow()) {
                    accessibilityManager2.addTouchExplorationStateChangeListener(catchingFishFragmentCameraX.CatchingFishParcelableFlux);
                    break;
                }
                break;
            case 4:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        boolean z;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABViewModel catchingFishFABViewModel = (CatchingFishFABViewModel) this.CatchingFishDaggerWebsocket;
                catchingFishFABViewModel.CatchingFishEspressoTesting.removeCallbacks(catchingFishFABViewModel.CatchingFishDagger);
                AccessibilityManager accessibilityManager4 = catchingFishFABViewModel.CatchingFishViewModelScope;
                accessibilityManager4.removeAccessibilityStateChangeListener(catchingFishFABViewModel.CatchingFishLayout);
                accessibilityManager4.removeTouchExplorationStateChangeListener(catchingFishFABViewModel.CatchingFishFragmentHandler);
                break;
            case 1:
                CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux = (CatchingFishAsyncTaskRedux) this.CatchingFishDaggerWebsocket;
                Context context = view.getContext();
                if (catchingFishAsyncTaskRedux.CatchingFishParcelableFAB) {
                    context.getApplicationContext().unregisterComponentCallbacks((CatchingFishHiltIntentMVVM) catchingFishAsyncTaskRedux.CatchingFishDaggerWebsocket);
                    catchingFishAsyncTaskRedux.CatchingFishParcelableFAB = false;
                    break;
                }
                break;
            case 2:
                CatchingFishSpannableMockk catchingFishSpannableMockk = (CatchingFishSpannableMockk) this.CatchingFishDaggerWebsocket;
                ViewTreeObserver viewTreeObserver = catchingFishSpannableMockk.CatchingFishPayPal;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        catchingFishSpannableMockk.CatchingFishPayPal = view.getViewTreeObserver();
                    }
                    catchingFishSpannableMockk.CatchingFishPayPal.removeGlobalOnLayoutListener(catchingFishSpannableMockk.CatchingFishEspressoTesting);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                CatchingFishFragmentCameraX catchingFishFragmentCameraX = (CatchingFishFragmentCameraX) this.CatchingFishDaggerWebsocket;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = catchingFishFragmentCameraX.CatchingFishParcelableFlux;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = catchingFishFragmentCameraX.CatchingFishSpannableWidget) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 4:
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.CatchingFishDaggerWebsocket;
                CatchingFishWebSocketGson catchingFishWebSocketGson = hideBottomViewOnScrollBehavior.CatchingFishViewModelFAB;
                if (catchingFishWebSocketGson != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.CatchingFishViewModelScope) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(catchingFishWebSocketGson);
                    hideBottomViewOnScrollBehavior.CatchingFishViewModelFAB = null;
                    break;
                }
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.CatchingFishDaggerWebsocket;
                CatchingFishWebSocketGson catchingFishWebSocketGson2 = hideViewOnScrollBehavior.CatchingFishCoroutine;
                if (catchingFishWebSocketGson2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.CatchingFishSnackbar) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(catchingFishWebSocketGson2);
                    hideViewOnScrollBehavior.CatchingFishCoroutine = null;
                    break;
                }
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishWebSocketGlide catchingFishWebSocketGlide = (CatchingFishWebSocketGlide) this.CatchingFishDaggerWebsocket;
                ViewTreeObserver viewTreeObserver2 = catchingFishWebSocketGlide.CatchingFishNavigation;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        catchingFishWebSocketGlide.CatchingFishNavigation = view.getViewTreeObserver();
                    }
                    catchingFishWebSocketGlide.CatchingFishNavigation.removeGlobalOnLayoutListener(catchingFishWebSocketGlide.CatchingFishEspressoTesting);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishSnackbar catchingFishSnackbar = (CatchingFishSnackbar) this.CatchingFishDaggerWebsocket;
                ViewParent parent = catchingFishSnackbar.getParent();
                Iterator it = (parent == null ? CatchingFishLayoutGradle.CatchingFishParcelableFAB : new CatchingFishMVIAnimation(new CatchingFishFluxPicasso(7, parent), CatchingFishGsonDataStore.CatchingFishEspressoTesting)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            CatchingFishFirebaseDagger.CatchingFishNavigation(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    CatchingFishRetrofitRoom catchingFishRetrofitRoom = catchingFishSnackbar.CatchingFishWorkManager;
                    if (catchingFishRetrofitRoom != null) {
                        catchingFishRetrofitRoom.CatchingFishParcelableFAB();
                    }
                    catchingFishSnackbar.CatchingFishWorkManager = null;
                    catchingFishSnackbar.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((CatchingFishFragmentRealm) this.CatchingFishDaggerWebsocket).CatchingFishCoroutine(null);
                break;
        }
    }

    private final void CatchingFishCoroutine(View view) {
    }

    private final void CatchingFishDaggerWebsocket(View view) {
    }

    private final void CatchingFishParcelableFAB(View view) {
    }

    private final void CatchingFishReduxKtor(View view) {
    }

    private final void CatchingFishSnackbar(View view) {
    }

    private final void CatchingFishViewModelScope(View view) {
    }

    private final void CatchingFishWorkManager(View view) {
    }
}
