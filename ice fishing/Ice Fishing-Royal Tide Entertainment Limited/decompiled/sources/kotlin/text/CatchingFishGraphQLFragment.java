package kotlin.text;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLFragment extends CatchingFishBiometricBundle implements CatchingFishEspressoToolbar {
    public static final AccelerateInterpolator CatchingFishAppCompat = new AccelerateInterpolator();
    public static final DecelerateInterpolator CatchingFishDataStoreIntent = new DecelerateInterpolator();
    public boolean CatchingFishCameraXIntent;
    public CatchingFishIntentMVI CatchingFishCardViewRealm;
    public final View CatchingFishCardViewView;
    public CatchingFishCoroutineMVPFAB CatchingFishCustomView;
    public boolean CatchingFishDagger;
    public Context CatchingFishDaggerHiltFAB;
    public boolean CatchingFishEspressoMockk;
    public CatchingFishCoroutineMVPFAB CatchingFishFragmentFactory;
    public boolean CatchingFishGradleManifest;
    public ActionBarContainer CatchingFishGsonAppCompat;
    public boolean CatchingFishHandler;
    public boolean CatchingFishJobScheduler;
    public final CatchingFishGraphQLJUnit CatchingFishLayoutInflater;
    public boolean CatchingFishMVPRobolectric;
    public boolean CatchingFishMotionLayout;
    public CatchingFishBundleGlide CatchingFishMutableLiveData;
    public final CatchingFishGraphQLJUnit CatchingFishParcelable;
    public ActionBarOverlayLayout CatchingFishParcelableFlux;
    public ActionBarContextView CatchingFishPayPal;
    public CatchingFishGsonMVIRetrofit CatchingFishPayPalLiveData;
    public final ArrayList CatchingFishPayPalService;
    public final CatchingFishEspressoPayPal CatchingFishRecyclerView;
    public int CatchingFishSensorManager;
    public Context CatchingFishSpannableWidget;

    public CatchingFishGraphQLFragment(Activity activity, boolean z) {
        new ArrayList();
        this.CatchingFishPayPalService = new ArrayList();
        this.CatchingFishSensorManager = 0;
        this.CatchingFishEspressoMockk = true;
        this.CatchingFishHandler = true;
        this.CatchingFishLayoutInflater = new CatchingFishGraphQLJUnit(this, 0);
        this.CatchingFishParcelable = new CatchingFishGraphQLJUnit(this, 1);
        this.CatchingFishRecyclerView = new CatchingFishEspressoPayPal(16, this);
        View decorView = activity.getWindow().getDecorView();
        CatchingFishDataStoreIntent(decorView);
        if (z) {
            return;
        }
        this.CatchingFishCardViewView = decorView.findViewById(R.id.content);
    }

    public final void CatchingFishAnimation(boolean z) {
        boolean z2 = this.CatchingFishDagger;
        boolean z3 = this.CatchingFishCameraXIntent;
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = this.CatchingFishRecyclerView;
        View view = this.CatchingFishCardViewView;
        if (!z3 && z2) {
            if (this.CatchingFishHandler) {
                this.CatchingFishHandler = false;
                CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit = this.CatchingFishPayPalLiveData;
                if (catchingFishGsonMVIRetrofit != null) {
                    catchingFishGsonMVIRetrofit.CatchingFishParcelableFAB();
                }
                int i = this.CatchingFishSensorManager;
                CatchingFishGraphQLJUnit catchingFishGraphQLJUnit = this.CatchingFishLayoutInflater;
                if (i != 0 || (!this.CatchingFishGradleManifest && !z)) {
                    catchingFishGraphQLJUnit.CatchingFishParcelableFAB();
                    return;
                }
                this.CatchingFishGsonAppCompat.setAlpha(1.0f);
                this.CatchingFishGsonAppCompat.setTransitioning(true);
                CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit2 = new CatchingFishGsonMVIRetrofit();
                float f = -this.CatchingFishGsonAppCompat.getHeight();
                if (z) {
                    this.CatchingFishGsonAppCompat.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                CatchingFishIntentMVPDagger CatchingFishParcelableFAB = CatchingFishFABCameraX.CatchingFishParcelableFAB(this.CatchingFishGsonAppCompat);
                CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(f);
                View view2 = (View) CatchingFishParcelableFAB.CatchingFishParcelableFAB.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(catchingFishEspressoPayPal != null ? new CatchingFishJUnitHilt(catchingFishEspressoPayPal, view2) : null);
                }
                boolean z4 = catchingFishGsonMVIRetrofit2.CatchingFishDaggerWebsocket;
                ArrayList arrayList = catchingFishGsonMVIRetrofit2.CatchingFishParcelableFAB;
                if (!z4) {
                    arrayList.add(CatchingFishParcelableFAB);
                }
                if (this.CatchingFishEspressoMockk && view != null) {
                    CatchingFishIntentMVPDagger CatchingFishParcelableFAB2 = CatchingFishFABCameraX.CatchingFishParcelableFAB(view);
                    CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket(f);
                    if (!catchingFishGsonMVIRetrofit2.CatchingFishDaggerWebsocket) {
                        arrayList.add(CatchingFishParcelableFAB2);
                    }
                }
                boolean z5 = catchingFishGsonMVIRetrofit2.CatchingFishDaggerWebsocket;
                if (!z5) {
                    catchingFishGsonMVIRetrofit2.CatchingFishCoroutine = CatchingFishAppCompat;
                }
                if (!z5) {
                    catchingFishGsonMVIRetrofit2.CatchingFishSnackbar = 250L;
                }
                if (!z5) {
                    catchingFishGsonMVIRetrofit2.CatchingFishReduxKtor = catchingFishGraphQLJUnit;
                }
                this.CatchingFishPayPalLiveData = catchingFishGsonMVIRetrofit2;
                catchingFishGsonMVIRetrofit2.CatchingFishSnackbar();
                return;
            }
            return;
        }
        if (this.CatchingFishHandler) {
            return;
        }
        this.CatchingFishHandler = true;
        CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit3 = this.CatchingFishPayPalLiveData;
        if (catchingFishGsonMVIRetrofit3 != null) {
            catchingFishGsonMVIRetrofit3.CatchingFishParcelableFAB();
        }
        this.CatchingFishGsonAppCompat.setVisibility(0);
        int i2 = this.CatchingFishSensorManager;
        CatchingFishGraphQLJUnit catchingFishGraphQLJUnit2 = this.CatchingFishParcelable;
        if (i2 == 0 && (this.CatchingFishGradleManifest || z)) {
            this.CatchingFishGsonAppCompat.setTranslationY(0.0f);
            float f2 = -this.CatchingFishGsonAppCompat.getHeight();
            if (z) {
                this.CatchingFishGsonAppCompat.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.CatchingFishGsonAppCompat.setTranslationY(f2);
            CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit4 = new CatchingFishGsonMVIRetrofit();
            CatchingFishIntentMVPDagger CatchingFishParcelableFAB3 = CatchingFishFABCameraX.CatchingFishParcelableFAB(this.CatchingFishGsonAppCompat);
            CatchingFishParcelableFAB3.CatchingFishDaggerWebsocket(0.0f);
            View view3 = (View) CatchingFishParcelableFAB3.CatchingFishParcelableFAB.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(catchingFishEspressoPayPal != null ? new CatchingFishJUnitHilt(catchingFishEspressoPayPal, view3) : null);
            }
            boolean z6 = catchingFishGsonMVIRetrofit4.CatchingFishDaggerWebsocket;
            ArrayList arrayList2 = catchingFishGsonMVIRetrofit4.CatchingFishParcelableFAB;
            if (!z6) {
                arrayList2.add(CatchingFishParcelableFAB3);
            }
            if (this.CatchingFishEspressoMockk && view != null) {
                view.setTranslationY(f2);
                CatchingFishIntentMVPDagger CatchingFishParcelableFAB4 = CatchingFishFABCameraX.CatchingFishParcelableFAB(view);
                CatchingFishParcelableFAB4.CatchingFishDaggerWebsocket(0.0f);
                if (!catchingFishGsonMVIRetrofit4.CatchingFishDaggerWebsocket) {
                    arrayList2.add(CatchingFishParcelableFAB4);
                }
            }
            boolean z7 = catchingFishGsonMVIRetrofit4.CatchingFishDaggerWebsocket;
            if (!z7) {
                catchingFishGsonMVIRetrofit4.CatchingFishCoroutine = CatchingFishDataStoreIntent;
            }
            if (!z7) {
                catchingFishGsonMVIRetrofit4.CatchingFishSnackbar = 250L;
            }
            if (!z7) {
                catchingFishGsonMVIRetrofit4.CatchingFishReduxKtor = catchingFishGraphQLJUnit2;
            }
            this.CatchingFishPayPalLiveData = catchingFishGsonMVIRetrofit4;
            catchingFishGsonMVIRetrofit4.CatchingFishSnackbar();
        } else {
            this.CatchingFishGsonAppCompat.setAlpha(1.0f);
            this.CatchingFishGsonAppCompat.setTranslationY(0.0f);
            if (this.CatchingFishEspressoMockk && view != null) {
                view.setTranslationY(0.0f);
            }
            catchingFishGraphQLJUnit2.CatchingFishParcelableFAB();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.CatchingFishParcelableFlux;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public final Context CatchingFishAppCompat() {
        if (this.CatchingFishSpannableWidget == null) {
            TypedValue typedValue = new TypedValue();
            this.CatchingFishDaggerHiltFAB.getTheme().resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.CatchingFishSpannableWidget = new ContextThemeWrapper(this.CatchingFishDaggerHiltFAB, i);
            } else {
                this.CatchingFishSpannableWidget = this.CatchingFishDaggerHiltFAB;
            }
        }
        return this.CatchingFishSpannableWidget;
    }

    public final void CatchingFishDataStoreIntent(View view) {
        CatchingFishIntentMVI wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.catchingfish.fishcatcherpro.R.id.decor_content_parent);
        this.CatchingFishParcelableFlux = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.catchingfish.fishcatcherpro.R.id.action_bar);
        if (findViewById instanceof CatchingFishIntentMVI) {
            wrapper = (CatchingFishIntentMVI) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.CatchingFishCardViewRealm = wrapper;
        this.CatchingFishPayPal = (ActionBarContextView) view.findViewById(com.catchingfish.fishcatcherpro.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.catchingfish.fishcatcherpro.R.id.action_bar_container);
        this.CatchingFishGsonAppCompat = actionBarContainer;
        CatchingFishIntentMVI catchingFishIntentMVI = this.CatchingFishCardViewRealm;
        if (catchingFishIntentMVI == null || this.CatchingFishPayPal == null || actionBarContainer == null) {
            throw new IllegalStateException(CatchingFishGraphQLFragment.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((CatchingFishMVVMAsyncTask) catchingFishIntentMVI).CatchingFishParcelableFAB.getContext();
        this.CatchingFishDaggerHiltFAB = context;
        if ((((CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm).CatchingFishSnackbar & 4) != 0) {
            this.CatchingFishMVPRobolectric = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.CatchingFishCardViewRealm.getClass();
        CatchingFishJUnitRealm(context.getResources().getBoolean(com.catchingfish.fishcatcherpro.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.CatchingFishDaggerHiltFAB.obtainStyledAttributes(null, CatchingFishWidgetGlide.CatchingFishParcelableFAB, com.catchingfish.fishcatcherpro.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.CatchingFishParcelableFlux;
            if (!actionBarOverlayLayout2.CatchingFishFragmentHandler) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.CatchingFishMotionLayout = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.CatchingFishGsonAppCompat;
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void CatchingFishJUnitRealm(boolean z) {
        if (z) {
            this.CatchingFishGsonAppCompat.setTabContainer(null);
            ((CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm).getClass();
        } else {
            ((CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm).getClass();
            this.CatchingFishGsonAppCompat.setTabContainer(null);
        }
        this.CatchingFishCardViewRealm.getClass();
        ((CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm).CatchingFishParcelableFAB.setCollapsible(false);
        this.CatchingFishParcelableFlux.setHasNonEmbeddedTabs(false);
    }

    public final void CatchingFishRecyclerView(boolean z) {
        CatchingFishIntentMVPDagger CatchingFishLayout;
        CatchingFishIntentMVPDagger catchingFishIntentMVPDagger;
        if (z) {
            if (!this.CatchingFishCameraXIntent) {
                this.CatchingFishCameraXIntent = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.CatchingFishParcelableFlux;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                CatchingFishAnimation(false);
            }
        } else if (this.CatchingFishCameraXIntent) {
            this.CatchingFishCameraXIntent = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.CatchingFishParcelableFlux;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            CatchingFishAnimation(false);
        }
        if (!this.CatchingFishGsonAppCompat.isLaidOut()) {
            if (z) {
                ((CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm).CatchingFishParcelableFAB.setVisibility(4);
                this.CatchingFishPayPal.setVisibility(0);
                return;
            } else {
                ((CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm).CatchingFishParcelableFAB.setVisibility(0);
                this.CatchingFishPayPal.setVisibility(8);
                return;
            }
        }
        if (z) {
            CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm;
            CatchingFishLayout = CatchingFishFABCameraX.CatchingFishParcelableFAB(catchingFishMVVMAsyncTask.CatchingFishParcelableFAB);
            CatchingFishLayout.CatchingFishParcelableFAB(0.0f);
            CatchingFishLayout.CatchingFishCoroutine(100L);
            CatchingFishLayout.CatchingFishReduxKtor(new CatchingFishWidgetAndroidX(catchingFishMVVMAsyncTask, 4));
            catchingFishIntentMVPDagger = this.CatchingFishPayPal.CatchingFishLayout(0, 200L);
        } else {
            CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask2 = (CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm;
            CatchingFishIntentMVPDagger CatchingFishParcelableFAB = CatchingFishFABCameraX.CatchingFishParcelableFAB(catchingFishMVVMAsyncTask2.CatchingFishParcelableFAB);
            CatchingFishParcelableFAB.CatchingFishParcelableFAB(1.0f);
            CatchingFishParcelableFAB.CatchingFishCoroutine(200L);
            CatchingFishParcelableFAB.CatchingFishReduxKtor(new CatchingFishWidgetAndroidX(catchingFishMVVMAsyncTask2, 0));
            CatchingFishLayout = this.CatchingFishPayPal.CatchingFishLayout(8, 100L);
            catchingFishIntentMVPDagger = CatchingFishParcelableFAB;
        }
        CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit = new CatchingFishGsonMVIRetrofit();
        ArrayList arrayList = catchingFishGsonMVIRetrofit.CatchingFishParcelableFAB;
        arrayList.add(CatchingFishLayout);
        View view = (View) CatchingFishLayout.CatchingFishParcelableFAB.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) catchingFishIntentMVPDagger.CatchingFishParcelableFAB.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(catchingFishIntentMVPDagger);
        catchingFishGsonMVIRetrofit.CatchingFishSnackbar();
    }

    public final void CatchingFishStateFlow(boolean z) {
        if (this.CatchingFishMVPRobolectric) {
            return;
        }
        int i = z ? 4 : 0;
        CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) this.CatchingFishCardViewRealm;
        int i2 = catchingFishMVVMAsyncTask.CatchingFishSnackbar;
        this.CatchingFishMVPRobolectric = true;
        catchingFishMVVMAsyncTask.CatchingFishParcelableFAB((i & 4) | (i2 & (-5)));
    }

    public CatchingFishGraphQLFragment(Dialog dialog) {
        new ArrayList();
        this.CatchingFishPayPalService = new ArrayList();
        this.CatchingFishSensorManager = 0;
        this.CatchingFishEspressoMockk = true;
        this.CatchingFishHandler = true;
        this.CatchingFishLayoutInflater = new CatchingFishGraphQLJUnit(this, 0);
        this.CatchingFishParcelable = new CatchingFishGraphQLJUnit(this, 1);
        this.CatchingFishRecyclerView = new CatchingFishEspressoPayPal(16, this);
        CatchingFishDataStoreIntent(dialog.getWindow().getDecorView());
    }
}
