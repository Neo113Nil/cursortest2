package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMVIGradleBundle implements Window.Callback {
    public boolean CatchingFishDaggerWebsocket;
    public final Window.Callback CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishMockkWidgetKtor CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishMVIGradleBundle(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor, Window.Callback callback) {
        this.CatchingFishViewModelFAB = catchingFishMockkWidgetKtor;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.CatchingFishReduxKtor = callback;
    }

    public final void CatchingFishCoroutine(int i, Menu menu) {
        this.CatchingFishReduxKtor.onPanelClosed(i, menu);
    }

    public final void CatchingFishParcelableFAB(Window.Callback callback) {
        try {
            this.CatchingFishDaggerWebsocket = true;
            callback.onContentChanged();
        } finally {
            this.CatchingFishDaggerWebsocket = false;
        }
    }

    public final void CatchingFishReduxKtor(List list, Menu menu, int i) {
        CatchingFishCardViewAdMob.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, list, menu, i);
    }

    public final boolean CatchingFishSnackbar(int i, Menu menu) {
        return this.CatchingFishReduxKtor.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.CatchingFishReduxKtor.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.CatchingFishWorkManager;
        Window.Callback callback = this.CatchingFishReduxKtor;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.CatchingFishViewModelFAB.CatchingFish(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob;
        boolean performShortcut;
        if (!this.CatchingFishReduxKtor.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishViewModelFAB;
            catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
            if (catchingFishGraphQLFragment != null) {
                CatchingFishCoroutineMVPFAB catchingFishCoroutineMVPFAB = catchingFishGraphQLFragment.CatchingFishCustomView;
                if (catchingFishCoroutineMVPFAB == null || (catchingFishSharedFlowAdMob = catchingFishCoroutineMVPFAB.CatchingFishViewModelScope) == null) {
                    performShortcut = false;
                } else {
                    catchingFishSharedFlowAdMob.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = catchingFishSharedFlowAdMob.performShortcut(keyCode, keyEvent, 0);
                }
            }
            CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt = catchingFishMockkWidgetKtor.CatchingFishLayoutInflater;
            if (catchingFishDaggerHiltHilt == null || !catchingFishMockkWidgetKtor.CatchingFishCustomView(catchingFishDaggerHiltHilt, keyEvent.getKeyCode(), keyEvent)) {
                if (catchingFishMockkWidgetKtor.CatchingFishLayoutInflater == null) {
                    CatchingFishDaggerHiltHilt CatchingFishParcelableFlux = catchingFishMockkWidgetKtor.CatchingFishParcelableFlux(0);
                    catchingFishMockkWidgetKtor.CatchingFishFragmentFactory(CatchingFishParcelableFlux, keyEvent);
                    boolean CatchingFishCustomView = catchingFishMockkWidgetKtor.CatchingFishCustomView(CatchingFishParcelableFlux, keyEvent.getKeyCode(), keyEvent);
                    CatchingFishParcelableFlux.CatchingFishCloudMessaging = false;
                }
                z = false;
                if (z) {
                    return false;
                }
            } else {
                CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt2 = catchingFishMockkWidgetKtor.CatchingFishLayoutInflater;
                if (catchingFishDaggerHiltHilt2 != null) {
                    catchingFishDaggerHiltHilt2.CatchingFishEspressoTesting = true;
                }
            }
            z = true;
            if (z) {
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.CatchingFishReduxKtor.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.CatchingFishReduxKtor.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.CatchingFishReduxKtor.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.CatchingFishReduxKtor.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.CatchingFishReduxKtor.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.CatchingFishReduxKtor.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.CatchingFishDaggerWebsocket) {
            this.CatchingFishReduxKtor.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof CatchingFishSharedFlowAdMob)) {
            return this.CatchingFishReduxKtor.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.CatchingFishReduxKtor.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.CatchingFishReduxKtor.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.CatchingFishReduxKtor.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        CatchingFishSnackbar(i, menu);
        if (i == 108) {
            CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishViewModelFAB;
            catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
            if (catchingFishGraphQLFragment != null) {
                ArrayList arrayList = catchingFishGraphQLFragment.CatchingFishPayPalService;
                if (true != catchingFishGraphQLFragment.CatchingFishJobScheduler) {
                    catchingFishGraphQLFragment.CatchingFishJobScheduler = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.CatchingFishViewModelScope) {
            this.CatchingFishReduxKtor.onPanelClosed(i, menu);
            return;
        }
        CatchingFishCoroutine(i, menu);
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishViewModelFAB;
        if (i != 108) {
            if (i == 0) {
                CatchingFishDaggerHiltHilt CatchingFishParcelableFlux = catchingFishMockkWidgetKtor.CatchingFishParcelableFlux(i);
                if (CatchingFishParcelableFlux.CatchingFishOkHttp) {
                    catchingFishMockkWidgetKtor.CatchingFishRoomDatabase(CatchingFishParcelableFlux, false);
                    return;
                }
                return;
            }
            return;
        }
        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
        if (catchingFishGraphQLFragment != null) {
            ArrayList arrayList = catchingFishGraphQLFragment.CatchingFishPayPalService;
            if (catchingFishGraphQLFragment.CatchingFishJobScheduler) {
                catchingFishGraphQLFragment.CatchingFishJobScheduler = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        CatchingFishReduxStateFlow.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = menu instanceof CatchingFishSharedFlowAdMob ? (CatchingFishSharedFlowAdMob) menu : null;
        if (i == 0 && catchingFishSharedFlowAdMob == null) {
            return false;
        }
        if (catchingFishSharedFlowAdMob != null) {
            catchingFishSharedFlowAdMob.CatchingFishParcelableFlux = true;
        }
        boolean onPreparePanel = this.CatchingFishReduxKtor.onPreparePanel(i, view, menu);
        if (catchingFishSharedFlowAdMob != null) {
            catchingFishSharedFlowAdMob.CatchingFishParcelableFlux = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishViewModelFAB.CatchingFishParcelableFlux(0).CatchingFishViewModelFAB;
        if (catchingFishSharedFlowAdMob != null) {
            CatchingFishReduxKtor(list, catchingFishSharedFlowAdMob, i);
        } else {
            CatchingFishReduxKtor(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return CatchingFishGsonAdMobMockk.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.CatchingFishReduxKtor.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.CatchingFishReduxKtor.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishViewModelFAB;
        if (!catchingFishMockkWidgetKtor.CatchingFishMVPRobolectric || i != 0) {
            return CatchingFishGsonAdMobMockk.CatchingFishSnackbar(this.CatchingFishReduxKtor, callback, i);
        }
        Context context = catchingFishMockkWidgetKtor.CatchingFishUnitTesting;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle();
        catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = context;
        catchingFishFluxFluxBundle.CatchingFishReduxKtor = callback;
        catchingFishFluxFluxBundle.CatchingFishWorkManager = new ArrayList();
        catchingFishFluxFluxBundle.CatchingFishViewModelScope = new CatchingFishGraphQLRealmFAB(0);
        CatchingFishGradleSpannable catchingFishGradleSpannable = catchingFishMockkWidgetKtor.CatchingFishParcelableFlux;
        if (catchingFishGradleSpannable != null) {
            catchingFishGradleSpannable.CatchingFishParcelableFAB();
        }
        CatchingFishBundleGlide catchingFishBundleGlide = new CatchingFishBundleGlide(catchingFishMockkWidgetKtor, catchingFishFluxFluxBundle);
        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
        int i2 = 1;
        if (catchingFishGraphQLFragment != null) {
            CatchingFishCoroutineMVPFAB catchingFishCoroutineMVPFAB = catchingFishGraphQLFragment.CatchingFishCustomView;
            if (catchingFishCoroutineMVPFAB != null) {
                catchingFishCoroutineMVPFAB.CatchingFishParcelableFAB();
            }
            catchingFishGraphQLFragment.CatchingFishParcelableFlux.setHideOnContentScrollEnabled(false);
            catchingFishGraphQLFragment.CatchingFishPayPal.CatchingFishDaggerWebsocket();
            CatchingFishCoroutineMVPFAB catchingFishCoroutineMVPFAB2 = new CatchingFishCoroutineMVPFAB(catchingFishGraphQLFragment, catchingFishGraphQLFragment.CatchingFishPayPal.getContext(), catchingFishBundleGlide);
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishCoroutineMVPFAB2.CatchingFishViewModelScope;
            catchingFishSharedFlowAdMob.CatchingFishSpannableWidget();
            try {
                if (((CatchingFishFluxFluxBundle) catchingFishCoroutineMVPFAB2.CatchingFishViewModelFAB.CatchingFishDaggerWebsocket).CatchingFishGsonAppCompat(catchingFishCoroutineMVPFAB2, catchingFishSharedFlowAdMob)) {
                    catchingFishGraphQLFragment.CatchingFishCustomView = catchingFishCoroutineMVPFAB2;
                    catchingFishCoroutineMVPFAB2.CatchingFishLayout();
                    catchingFishGraphQLFragment.CatchingFishPayPal.CatchingFishCoroutine(catchingFishCoroutineMVPFAB2);
                    catchingFishGraphQLFragment.CatchingFishRecyclerView(true);
                } else {
                    catchingFishCoroutineMVPFAB2 = null;
                }
                catchingFishMockkWidgetKtor.CatchingFishParcelableFlux = catchingFishCoroutineMVPFAB2;
            } finally {
                catchingFishSharedFlowAdMob.CatchingFishDaggerHiltFAB();
            }
        }
        if (catchingFishMockkWidgetKtor.CatchingFishParcelableFlux == null) {
            CatchingFishIntentMVPDagger catchingFishIntentMVPDagger = catchingFishMockkWidgetKtor.CatchingFishCardViewView;
            if (catchingFishIntentMVPDagger != null) {
                catchingFishIntentMVPDagger.CatchingFishSnackbar();
            }
            CatchingFishGradleSpannable catchingFishGradleSpannable2 = catchingFishMockkWidgetKtor.CatchingFishParcelableFlux;
            if (catchingFishGradleSpannable2 != null) {
                catchingFishGradleSpannable2.CatchingFishParcelableFAB();
            }
            if (catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat == null) {
                if (catchingFishMockkWidgetKtor.CatchingFishHandler) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        CatchingFishGraphQLManifest catchingFishGraphQLManifest = new CatchingFishGraphQLManifest(context, 0);
                        catchingFishGraphQLManifest.getTheme().setTo(newTheme);
                        context = catchingFishGraphQLManifest;
                    }
                    catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    catchingFishMockkWidgetKtor.CatchingFishCardViewRealm = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    catchingFishMockkWidgetKtor.CatchingFishCardViewRealm.setContentView(catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat);
                    catchingFishMockkWidgetKtor.CatchingFishCardViewRealm.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    catchingFishMockkWidgetKtor.CatchingFishCardViewRealm.setHeight(-2);
                    catchingFishMockkWidgetKtor.CatchingFishPayPal = new CatchingFishAsyncTaskToast(catchingFishMockkWidgetKtor, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) catchingFishMockkWidgetKtor.CatchingFishFragmentFactory.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
                        CatchingFishGraphQLFragment catchingFishGraphQLFragment2 = catchingFishMockkWidgetKtor.CatchingFishNavigation;
                        Context CatchingFishAppCompat = catchingFishGraphQLFragment2 != null ? catchingFishGraphQLFragment2.CatchingFishAppCompat() : null;
                        if (CatchingFishAppCompat != null) {
                            context = CatchingFishAppCompat;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat = (ActionBarContextView) viewStubCompat.CatchingFishParcelableFAB();
                    }
                }
            }
            if (catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat != null) {
                CatchingFishIntentMVPDagger catchingFishIntentMVPDagger2 = catchingFishMockkWidgetKtor.CatchingFishCardViewView;
                if (catchingFishIntentMVPDagger2 != null) {
                    catchingFishIntentMVPDagger2.CatchingFishSnackbar();
                }
                catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket();
                Context context2 = catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.getContext();
                ActionBarContextView actionBarContextView = catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat;
                CatchingFishAsyncTaskAdMob catchingFishAsyncTaskAdMob = new CatchingFishAsyncTaskAdMob();
                catchingFishAsyncTaskAdMob.CatchingFishWorkManager = context2;
                catchingFishAsyncTaskAdMob.CatchingFishViewModelScope = actionBarContextView;
                catchingFishAsyncTaskAdMob.CatchingFishViewModelFAB = catchingFishBundleGlide;
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = new CatchingFishSharedFlowAdMob(actionBarContextView.getContext());
                catchingFishSharedFlowAdMob2.CatchingFishEspressoTesting = 1;
                catchingFishAsyncTaskAdMob.CatchingFishCloudMessaging = catchingFishSharedFlowAdMob2;
                catchingFishSharedFlowAdMob2.CatchingFishDaggerWebsocket = catchingFishAsyncTaskAdMob;
                if (((CatchingFishFluxFluxBundle) catchingFishBundleGlide.CatchingFishDaggerWebsocket).CatchingFishGsonAppCompat(catchingFishAsyncTaskAdMob, catchingFishSharedFlowAdMob2)) {
                    catchingFishAsyncTaskAdMob.CatchingFishLayout();
                    catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.CatchingFishCoroutine(catchingFishAsyncTaskAdMob);
                    catchingFishMockkWidgetKtor.CatchingFishParcelableFlux = catchingFishAsyncTaskAdMob;
                    if (catchingFishMockkWidgetKtor.CatchingFishCustomView && (viewGroup = catchingFishMockkWidgetKtor.CatchingFishFragmentFactory) != null && viewGroup.isLaidOut()) {
                        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.setAlpha(0.0f);
                        CatchingFishIntentMVPDagger CatchingFishParcelableFAB = CatchingFishFABCameraX.CatchingFishParcelableFAB(catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat);
                        CatchingFishParcelableFAB.CatchingFishParcelableFAB(1.0f);
                        catchingFishMockkWidgetKtor.CatchingFishCardViewView = CatchingFishParcelableFAB;
                        CatchingFishParcelableFAB.CatchingFishReduxKtor(new CatchingFishPicassoFlux(i2, catchingFishMockkWidgetKtor));
                    } else {
                        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.setAlpha(1.0f);
                        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.setVisibility(0);
                        if (catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.getParent() instanceof View) {
                            View view = (View) catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.getParent();
                            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                            view.requestApplyInsets();
                        }
                    }
                    if (catchingFishMockkWidgetKtor.CatchingFishCardViewRealm != null) {
                        catchingFishMockkWidgetKtor.CatchingFishAnimationMockk.getDecorView().post(catchingFishMockkWidgetKtor.CatchingFishPayPal);
                    }
                } else {
                    catchingFishMockkWidgetKtor.CatchingFishParcelableFlux = null;
                }
            }
            catchingFishMockkWidgetKtor.CatchingFishJobScheduler();
            catchingFishMockkWidgetKtor.CatchingFishParcelableFlux = catchingFishMockkWidgetKtor.CatchingFishParcelableFlux;
        }
        catchingFishMockkWidgetKtor.CatchingFishJobScheduler();
        CatchingFishGradleSpannable catchingFishGradleSpannable3 = catchingFishMockkWidgetKtor.CatchingFishParcelableFlux;
        if (catchingFishGradleSpannable3 != null) {
            return catchingFishFluxFluxBundle.CatchingFishOkHttp(catchingFishGradleSpannable3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.CatchingFishReduxKtor.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
