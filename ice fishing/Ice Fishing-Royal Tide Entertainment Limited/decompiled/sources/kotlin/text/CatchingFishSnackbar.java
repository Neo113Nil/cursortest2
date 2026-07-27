package kotlin.text;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class CatchingFishSnackbar extends ViewGroup {
    public boolean CatchingFishCloudMessaging;
    public IBinder CatchingFishDaggerWebsocket;
    public boolean CatchingFishFragmentHandler;
    public boolean CatchingFishLayout;
    public WeakReference CatchingFishReduxKtor;
    public CatchingFishRetrofitMVI CatchingFishViewModelFAB;
    public CatchingFishMVIWebSocket CatchingFishViewModelScope;
    public CatchingFishRetrofitRoom CatchingFishWorkManager;

    private final void setParentContext(CatchingFishMVIWebSocket catchingFishMVIWebSocket) {
        if (this.CatchingFishViewModelScope != catchingFishMVIWebSocket) {
            this.CatchingFishViewModelScope = catchingFishMVIWebSocket;
            if (catchingFishMVIWebSocket != null) {
                this.CatchingFishReduxKtor = null;
            }
            CatchingFishRetrofitRoom catchingFishRetrofitRoom = this.CatchingFishWorkManager;
            if (catchingFishRetrofitRoom != null) {
                catchingFishRetrofitRoom.CatchingFishParcelableFAB();
                this.CatchingFishWorkManager = null;
                if (isAttachedToWindow()) {
                    CatchingFishCoroutine();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.CatchingFishDaggerWebsocket != iBinder) {
            this.CatchingFishDaggerWebsocket = iBinder;
            this.CatchingFishReduxKtor = null;
        }
    }

    public final void CatchingFishCoroutine() {
        if (this.CatchingFishWorkManager == null) {
            try {
                this.CatchingFishFragmentHandler = true;
                this.CatchingFishWorkManager = CatchingFishAsyncTaskGson.CatchingFishParcelableFAB(this, CatchingFishReduxKtor(), new CatchingFishLifecycleRedux(-656146368, new CatchingFishView(0, this), true));
            } finally {
                this.CatchingFishFragmentHandler = false;
            }
        }
    }

    public abstract void CatchingFishParcelableFAB(int i, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI);

    /* JADX WARN: Multi-variable type inference failed */
    public final CatchingFishMVIWebSocket CatchingFishReduxKtor() {
        CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt;
        CatchingFishManifestMockk catchingFishManifestMockk;
        CatchingFishWebsocketWidget catchingFishWebsocketWidget;
        CatchingFishMVIWebSocket catchingFishMVIWebSocket = this.CatchingFishViewModelScope;
        if (catchingFishMVIWebSocket == null) {
            catchingFishMVIWebSocket = CatchingFishSnackbarDagger.CatchingFishSnackbar(this);
            if (catchingFishMVIWebSocket == null) {
                Object parent = getParent();
                while (catchingFishMVIWebSocket == null && (parent instanceof View)) {
                    View view = (View) parent;
                    catchingFishMVIWebSocket = CatchingFishSnackbarDagger.CatchingFishSnackbar(view);
                    parent = view.getParent();
                }
            }
            if (catchingFishMVIWebSocket != null) {
                CatchingFishMVIWebSocket catchingFishMVIWebSocket2 = (!(catchingFishMVIWebSocket instanceof CatchingFishMVIHandlerHilt) || ((CatchingFishContextAndroidX) ((CatchingFishMVIHandlerHilt) catchingFishMVIWebSocket).CatchingFishJetpackCompose.getValue()).compareTo(CatchingFishContextAndroidX.CatchingFishDaggerWebsocket) > 0) ? catchingFishMVIWebSocket : null;
                if (catchingFishMVIWebSocket2 != null) {
                    this.CatchingFishReduxKtor = new WeakReference(catchingFishMVIWebSocket2);
                }
            } else {
                catchingFishMVIWebSocket = null;
            }
            if (catchingFishMVIWebSocket == null) {
                WeakReference weakReference = this.CatchingFishReduxKtor;
                if (weakReference == null || (catchingFishMVIWebSocket = (CatchingFishMVIWebSocket) weakReference.get()) == null || ((catchingFishMVIWebSocket instanceof CatchingFishMVIHandlerHilt) && ((CatchingFishContextAndroidX) ((CatchingFishMVIHandlerHilt) catchingFishMVIWebSocket).CatchingFishJetpackCompose.getValue()).compareTo(CatchingFishContextAndroidX.CatchingFishDaggerWebsocket) <= 0)) {
                    catchingFishMVIWebSocket = null;
                }
                if (catchingFishMVIWebSocket == null) {
                    if (!isAttachedToWindow()) {
                        CatchingFishFluxGradle.CatchingFishSnackbar("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    CatchingFishMVIWebSocket CatchingFishSnackbar = CatchingFishSnackbarDagger.CatchingFishSnackbar(view2);
                    if (CatchingFishSnackbar == null) {
                        ((CatchingFishKtorKtorOkHttp) CatchingFishFABWidgetMVP.CatchingFishParcelableFAB.get()).getClass();
                        CatchingFishPayPalDataStore catchingFishPayPalDataStore = CatchingFishPayPalDataStore.CatchingFishReduxKtor;
                        CatchingFishKtorHiltIntent catchingFishKtorHiltIntent = CatchingFishContextFragment.CatchingFishStateLiveData;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            catchingFishManifestMockk = (CatchingFishManifestMockk) CatchingFishContextFragment.CatchingFishStateLiveData.getValue();
                        } else {
                            catchingFishManifestMockk = (CatchingFishManifestMockk) CatchingFishContextFragment.CatchingFishRoomDatabase.get();
                            if (catchingFishManifestMockk == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        CatchingFishManifestMockk CatchingFishAnimationMockk = catchingFishManifestMockk.CatchingFishAnimationMockk(catchingFishPayPalDataStore);
                        CatchingFishNavigationRedux catchingFishNavigationRedux = (CatchingFishNavigationRedux) CatchingFishAnimationMockk.CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishLayout);
                        if (catchingFishNavigationRedux != null) {
                            CatchingFishWebsocketWidget catchingFishWebsocketWidget2 = new CatchingFishWebsocketWidget(catchingFishNavigationRedux);
                            CatchingFishWebsocketRoom catchingFishWebsocketRoom = (CatchingFishWebsocketRoom) catchingFishWebsocketWidget2.CatchingFishWorkManager;
                            synchronized (catchingFishWebsocketRoom.CatchingFishSnackbar) {
                                catchingFishWebsocketRoom.CatchingFishParcelableFAB = false;
                                catchingFishWebsocketWidget = catchingFishWebsocketWidget2;
                            }
                        } else {
                            catchingFishWebsocketWidget = 0;
                        }
                        CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps = new CatchingFishRoomGoogleMaps();
                        CatchingFishNavigationRoom catchingFishNavigationRoom = (CatchingFishNavigationRoom) CatchingFishAnimationMockk.CatchingFishCoroutineFlow(CatchingFishGradleMVVM.CatchingFishNavigation);
                        if (catchingFishNavigationRoom == null) {
                            catchingFishNavigationRoom = new CatchingFishNavigationRoom();
                            catchingFishRoomGoogleMaps.CatchingFishReduxKtor = catchingFishNavigationRoom;
                        }
                        if (catchingFishWebsocketWidget != 0) {
                            catchingFishPayPalDataStore = catchingFishWebsocketWidget;
                        }
                        CatchingFishManifestMockk CatchingFishAnimationMockk2 = CatchingFishAnimationMockk.CatchingFishAnimationMockk(catchingFishPayPalDataStore).CatchingFishAnimationMockk(catchingFishNavigationRoom);
                        catchingFishMVIHandlerHilt = new CatchingFishMVIHandlerHilt(CatchingFishAnimationMockk2);
                        synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
                            catchingFishMVIHandlerHilt.CatchingFish = true;
                        }
                        CatchingFishFABCoroutine CatchingFishParcelableFAB = CatchingFishGsonCardView.CatchingFishParcelableFAB(CatchingFishAnimationMockk2);
                        CatchingFishToastFlux CatchingFishOkHttp = CatchingFishHiltMVPToast.CatchingFishOkHttp(view2);
                        CatchingFishToolbarToast CatchingFishDaggerWebsocket = CatchingFishOkHttp != null ? CatchingFishOkHttp.CatchingFishDaggerWebsocket() : null;
                        if (CatchingFishDaggerWebsocket == null) {
                            CatchingFishFluxGradle.CatchingFishCoroutine("ViewTreeLifecycleOwner not found from " + view2);
                            throw new CatchingFishBiometricView();
                        }
                        view2.addOnAttachStateChangeListener(new CatchingFishAsyncTaskMockk(view2, catchingFishMVIHandlerHilt));
                        CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(new CatchingFishFluxReduxFAB(CatchingFishParcelableFAB, catchingFishWebsocketWidget, catchingFishMVIHandlerHilt, catchingFishRoomGoogleMaps, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, catchingFishMVIHandlerHilt);
                        Handler handler = view2.getHandler();
                        int i = CatchingFishToastFABJUnit.CatchingFishParcelableFAB;
                        CatchingFishManifestMockk catchingFishManifestMockk2 = new CatchingFishIntentCoroutine(handler, "windowRecomposer cleanup", false).CatchingFishLayout;
                        CatchingFishBiometricMockk catchingFishBiometricMockk = new CatchingFishBiometricMockk(catchingFishMVIHandlerHilt, view2, null);
                        CatchingFishFABManifest catchingFishFABManifest = CatchingFishFABManifest.CatchingFishViewModelScope;
                        if ((2 & 1) != 0) {
                            catchingFishManifestMockk2 = CatchingFishPayPalDataStore.CatchingFishReduxKtor;
                        }
                        if ((2 & 2) != 0) {
                            catchingFishFABManifest = CatchingFishFABManifest.CatchingFishReduxKtor;
                        }
                        CatchingFishManifestMockk CatchingFishJetpackCompose = CatchingFishRobolectricHilt.CatchingFishJetpackCompose(CatchingFishPayPalDataStore.CatchingFishReduxKtor, catchingFishManifestMockk2, true);
                        CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
                        if (CatchingFishJetpackCompose != catchingFishGlideGson && CatchingFishJetpackCompose.CatchingFishCoroutineFlow(CatchingFishWidgetContext.CatchingFishDaggerWebsocket) == null) {
                            CatchingFishJetpackCompose = CatchingFishJetpackCompose.CatchingFishAnimationMockk(catchingFishGlideGson);
                        }
                        CatchingFishCloudMessaging catchingFishFluxHilt = catchingFishFABManifest == CatchingFishFABManifest.CatchingFishDaggerWebsocket ? new CatchingFishFluxHilt(CatchingFishJetpackCompose, catchingFishBiometricMockk) : new CatchingFishFragmentRealm(CatchingFishJetpackCompose, true);
                        catchingFishFluxHilt.CatchingFishCustomViewJUnit(catchingFishFABManifest, catchingFishFluxHilt, catchingFishBiometricMockk);
                        view2.addOnAttachStateChangeListener(new CatchingFishToastWidget(9, catchingFishFluxHilt));
                    } else {
                        if (!(CatchingFishSnackbar instanceof CatchingFishMVIHandlerHilt)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        catchingFishMVIHandlerHilt = (CatchingFishMVIHandlerHilt) CatchingFishSnackbar;
                    }
                    CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt2 = ((CatchingFishContextAndroidX) catchingFishMVIHandlerHilt.CatchingFishJetpackCompose.getValue()).compareTo(CatchingFishContextAndroidX.CatchingFishDaggerWebsocket) > 0 ? catchingFishMVIHandlerHilt : null;
                    if (catchingFishMVIHandlerHilt2 != null) {
                        this.CatchingFishReduxKtor = new WeakReference(catchingFishMVIHandlerHilt2);
                    }
                    return catchingFishMVIHandlerHilt;
                }
            }
        }
        return catchingFishMVIWebSocket;
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishFragmentHandler) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        CatchingFishSnackbar();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        CatchingFishSnackbar();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getHasComposition() {
        return this.CatchingFishWorkManager != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.CatchingFishLayout;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.CatchingFishCloudMessaging || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            CatchingFishCoroutine();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        CatchingFishCoroutine();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(CatchingFishMVIWebSocket catchingFishMVIWebSocket) {
        setParentContext(catchingFishMVIWebSocket);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.CatchingFishLayout = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((CatchingFishGradleCameraX) ((CatchingFishAdMobJUnit) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.CatchingFishCloudMessaging = true;
    }

    public final void setViewCompositionStrategy(CatchingFishContextRoomFAB catchingFishContextRoomFAB) {
        CatchingFishRetrofitMVI catchingFishRetrofitMVI = this.CatchingFishViewModelFAB;
        if (catchingFishRetrofitMVI != null) {
            catchingFishRetrofitMVI.CatchingFishParcelableFAB();
        }
        ((CatchingFishViewMVIMVVM) catchingFishContextRoomFAB).getClass();
        CatchingFishToastWidget catchingFishToastWidget = new CatchingFishToastWidget(8, this);
        addOnAttachStateChangeListener(catchingFishToastWidget);
        CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget = new CatchingFishAsyncTaskWidget(13);
        CatchingFishDaggerBiometric.CatchingFishCoroutineFlow(this).CatchingFishParcelableFAB.add(catchingFishAsyncTaskWidget);
        this.CatchingFishViewModelFAB = new CatchingFishRetrofitMVI(this, catchingFishToastWidget, catchingFishAsyncTaskWidget, 1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        CatchingFishSnackbar();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        CatchingFishSnackbar();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        CatchingFishSnackbar();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishSnackbar();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        CatchingFishSnackbar();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
