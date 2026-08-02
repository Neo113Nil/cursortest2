package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.biometric.BiometricPrompt;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    public static final AccelerateInterpolator sHideInterpolator = new AccelerateInterpolator();
    public static final DecelerateInterpolator sShowInterpolator = new DecelerateInterpolator();
    public ActionModeImpl mActionMode;
    public ActionBarContainer mContainerView;
    public boolean mContentAnimations;
    public final View mContentView;
    public Context mContext;
    public ActionBarContextView mContextView;
    public int mCurWindowVisibility;
    public ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    public DecorToolbar mDecorToolbar;
    public ActionModeImpl mDeferredDestroyActionMode;
    public AppCompatDelegateImpl.ActionModeCallbackWrapperV9 mDeferredModeDestroyCallback;
    public boolean mDisplayHomeAsUpSet;
    public boolean mHiddenByApp;
    public boolean mHiddenBySystem;
    public final AnonymousClass1 mHideListener;
    public boolean mHideOnContentScroll;
    public boolean mLastMenuVisibility;
    public final ArrayList mMenuVisibilityListeners;
    public boolean mNowShowing;
    public ActionBarOverlayLayout mOverlayLayout;
    public boolean mShowHideAnimationEnabled;
    public final AnonymousClass1 mShowListener;
    public boolean mShowingForMode;
    public Context mThemedContext;
    public final BiometricPrompt mUpdateListener;

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$1, reason: invalid class name */
    public final class AnonymousClass1 extends ViewPropertyAnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ WindowDecorActionBar this$0;

        public /* synthetic */ AnonymousClass1(WindowDecorActionBar windowDecorActionBar, int i) {
            this.$r8$classId = i;
            this.this$0 = windowDecorActionBar;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd() {
            View view;
            int i = this.$r8$classId;
            WindowDecorActionBar windowDecorActionBar = this.this$0;
            switch (i) {
                case 0:
                    if (windowDecorActionBar.mContentAnimations && (view = windowDecorActionBar.mContentView) != null) {
                        view.setTranslationY(RecyclerView.DECELERATION_RATE);
                        windowDecorActionBar.mContainerView.setTranslationY(RecyclerView.DECELERATION_RATE);
                    }
                    windowDecorActionBar.mContainerView.setVisibility(8);
                    windowDecorActionBar.mContainerView.setTransitioning(false);
                    windowDecorActionBar.mCurrentShowAnim = null;
                    AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = windowDecorActionBar.mDeferredModeDestroyCallback;
                    if (actionModeCallbackWrapperV9 != null) {
                        actionModeCallbackWrapperV9.onDestroyActionMode(windowDecorActionBar.mDeferredDestroyActionMode);
                        windowDecorActionBar.mDeferredDestroyActionMode = null;
                        windowDecorActionBar.mDeferredModeDestroyCallback = null;
                    }
                    ActionBarOverlayLayout actionBarOverlayLayout = windowDecorActionBar.mOverlayLayout;
                    if (actionBarOverlayLayout != null) {
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        actionBarOverlayLayout.requestApplyInsets();
                        break;
                    }
                    break;
                default:
                    windowDecorActionBar.mCurrentShowAnim = null;
                    windowDecorActionBar.mContainerView.requestLayout();
                    break;
            }
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        new ArrayList();
        this.mMenuVisibilityListeners = new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = new AnonymousClass1(this, 0);
        this.mShowListener = new AnonymousClass1(this, 1);
        this.mUpdateListener = new BiometricPrompt(this, 3);
        View decorView = activity.getWindow().getDecorView();
        init(decorView);
        if (z) {
            return;
        }
        this.mContentView = decorView.findViewById(R.id.content);
    }

    public final void animateToMode(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        boolean z2 = this.mShowingForMode;
        if (z) {
            if (!z2) {
                this.mShowingForMode = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                updateVisibility(false);
            }
        } else if (z2) {
            this.mShowingForMode = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.mOverlayLayout;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            updateVisibility(false);
        }
        boolean isLaidOut = this.mContainerView.isLaidOut();
        DecorToolbar decorToolbar = this.mDecorToolbar;
        if (!isLaidOut) {
            if (z) {
                ((ToolbarWidgetWrapper) decorToolbar).mToolbar.setVisibility(4);
                this.mContextView.setVisibility(0);
                return;
            } else {
                ((ToolbarWidgetWrapper) decorToolbar).mToolbar.setVisibility(0);
                this.mContextView.setVisibility(8);
                return;
            }
        }
        if (z) {
            ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) decorToolbar;
            viewPropertyAnimatorCompat = ViewCompat.animate(toolbarWidgetWrapper.mToolbar);
            viewPropertyAnimatorCompat.alpha(RecyclerView.DECELERATION_RATE);
            viewPropertyAnimatorCompat.setDuration(100L);
            viewPropertyAnimatorCompat.setListener(new ToolbarWidgetWrapper.AnonymousClass2(toolbarWidgetWrapper, 4));
            viewPropertyAnimatorCompat2 = this.mContextView.setupAnimatorToVisibility(0, 200L);
        } else {
            ToolbarWidgetWrapper toolbarWidgetWrapper2 = (ToolbarWidgetWrapper) decorToolbar;
            ViewPropertyAnimatorCompat animate = ViewCompat.animate(toolbarWidgetWrapper2.mToolbar);
            animate.alpha(1.0f);
            animate.setDuration(200L);
            animate.setListener(new ToolbarWidgetWrapper.AnonymousClass2(toolbarWidgetWrapper2, 0));
            viewPropertyAnimatorCompat = this.mContextView.setupAnimatorToVisibility(8, 100L);
            viewPropertyAnimatorCompat2 = animate;
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        ArrayList arrayList = viewPropertyAnimatorCompatSet.mAnimators;
        arrayList.add(viewPropertyAnimatorCompat);
        View view = (View) viewPropertyAnimatorCompat.mView.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) viewPropertyAnimatorCompat2.mView.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(viewPropertyAnimatorCompat2);
        viewPropertyAnimatorCompatSet.start();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean collapseActionView() {
        Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter;
        DecorToolbar decorToolbar = this.mDecorToolbar;
        if (decorToolbar == null || (expandedActionViewMenuPresenter = ((ToolbarWidgetWrapper) decorToolbar).mToolbar.mExpandedMenuPresenter) == null || expandedActionViewMenuPresenter.mCurrentExpandedItem == null) {
            return false;
        }
        Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter2 = ((ToolbarWidgetWrapper) decorToolbar).mToolbar.mExpandedMenuPresenter;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter2 == null ? null : expandedActionViewMenuPresenter2.mCurrentExpandedItem;
        if (menuItemImpl == null) {
            return true;
        }
        menuItemImpl.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.mLastMenuVisibility) {
            return;
        }
        this.mLastMenuVisibility = z;
        ArrayList arrayList = this.mMenuVisibilityListeners;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int getDisplayOptions() {
        return ((ToolbarWidgetWrapper) this.mDecorToolbar).mDisplayOpts;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context getThemedContext() {
        if (this.mThemedContext == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(com.squareup.cash.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.mThemedContext = new ContextThemeWrapper(this.mContext, i);
            } else {
                this.mThemedContext = this.mContext;
            }
        }
        return this.mThemedContext;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void hide() {
        if (this.mHiddenByApp) {
            return;
        }
        this.mHiddenByApp = true;
        updateVisibility(false);
    }

    public final void init(View view) {
        DecorToolbar decorToolbar;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.squareup.cash.R.id.decor_content_parent);
        this.mOverlayLayout = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.squareup.cash.R.id.action_bar);
        if (findViewById instanceof DecorToolbar) {
            decorToolbar = (DecorToolbar) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            Toolbar toolbar = (Toolbar) findViewById;
            if (toolbar.mWrapper == null) {
                toolbar.mWrapper = new ToolbarWidgetWrapper(toolbar, true);
            }
            decorToolbar = toolbar.mWrapper;
        }
        this.mDecorToolbar = decorToolbar;
        this.mContextView = (ActionBarContextView) view.findViewById(com.squareup.cash.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.squareup.cash.R.id.action_bar_container);
        this.mContainerView = actionBarContainer;
        DecorToolbar decorToolbar2 = this.mDecorToolbar;
        if (decorToolbar2 == null || this.mContextView == null || actionBarContainer == null) {
            a$$ExternalSyntheticBUOutline0.m$1("WindowDecorActionBar can only be used with a compatible window decor layout");
            return;
        }
        Context context = ((ToolbarWidgetWrapper) decorToolbar2).mToolbar.getContext();
        this.mContext = context;
        if ((((ToolbarWidgetWrapper) this.mDecorToolbar).mDisplayOpts & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        Context context2 = ActionBarPolicy.get(context).mContext;
        int i = context2.getApplicationInfo().targetSdkVersion;
        this.mDecorToolbar.getClass();
        setHasEmbeddedTabs(context2.getResources().getBoolean(com.squareup.cash.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.ActionBar, com.squareup.cash.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.mOverlayLayout;
            if (!actionBarOverlayLayout2.mOverlayMode) {
                a$$ExternalSyntheticBUOutline0.m$1("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.mHideOnContentScroll = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.mContainerView;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void onConfigurationChanged() {
        setHasEmbeddedTabs(ActionBarPolicy.get(this.mContext).mContext.getResources().getBoolean(com.squareup.cash.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        ActionModeImpl actionModeImpl = this.mActionMode;
        if (actionModeImpl == null || (menuBuilder = actionModeImpl.mMenu) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setBackgroundDrawable(ColorDrawable colorDrawable) {
        this.mContainerView.setPrimaryBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        ((ToolbarWidgetWrapper) this.mDecorToolbar).setCustomView(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.mDisplayHomeAsUpSet) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(z ? 4 : 0, 4);
    }

    public final void setDisplayOptions(int i, int i2) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        int i3 = toolbarWidgetWrapper.mDisplayOpts;
        if ((i2 & 4) != 0) {
            this.mDisplayHomeAsUpSet = true;
        }
        toolbarWidgetWrapper.setDisplayOptions((i & i2) | ((~i2) & i3));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayShowCustomEnabled() {
        setDisplayOptions(16, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setDisplayShowHomeEnabled() {
        setDisplayOptions(2, 2);
    }

    public final void setHasEmbeddedTabs(boolean z) {
        if (z) {
            this.mContainerView.setTabContainer(null);
            ((ToolbarWidgetWrapper) this.mDecorToolbar).getClass();
        } else {
            ((ToolbarWidgetWrapper) this.mDecorToolbar).getClass();
            this.mContainerView.setTabContainer(null);
        }
        this.mDecorToolbar.getClass();
        ((ToolbarWidgetWrapper) this.mDecorToolbar).mToolbar.setCollapsible(false);
        this.mOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setShowHideAnimationEnabled(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.mShowHideAnimationEnabled = z;
        if (z || (viewPropertyAnimatorCompatSet = this.mCurrentShowAnim) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.cancel();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setStackedBackgroundDrawable(ColorDrawable colorDrawable) {
        this.mContainerView.setStackedBackground(colorDrawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setTitle(CharSequence charSequence) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        toolbarWidgetWrapper.mTitleSet = true;
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        toolbarWidgetWrapper.mTitle = charSequence;
        if ((toolbarWidgetWrapper.mDisplayOpts & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (toolbarWidgetWrapper.mTitleSet) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setWindowTitle(CharSequence charSequence) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) this.mDecorToolbar;
        if (toolbarWidgetWrapper.mTitleSet) {
            return;
        }
        Toolbar toolbar = toolbarWidgetWrapper.mToolbar;
        toolbarWidgetWrapper.mTitle = charSequence;
        if ((toolbarWidgetWrapper.mDisplayOpts & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (toolbarWidgetWrapper.mTitleSet) {
                ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionMode startActionMode(AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9) {
        ActionModeImpl actionModeImpl = this.mActionMode;
        if (actionModeImpl != null) {
            actionModeImpl.finish();
        }
        this.mOverlayLayout.setHideOnContentScrollEnabled(false);
        this.mContextView.killMode();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.mContextView.getContext(), actionModeCallbackWrapperV9);
        MenuBuilder menuBuilder = actionModeImpl2.mMenu;
        menuBuilder.stopDispatchingItemsChanged();
        try {
            if (!actionModeImpl2.mCallback.mWrapped.onCreateActionMode(actionModeImpl2, menuBuilder)) {
                return null;
            }
            this.mActionMode = actionModeImpl2;
            actionModeImpl2.invalidate();
            this.mContextView.initForMode(actionModeImpl2);
            animateToMode(true);
            return actionModeImpl2;
        } finally {
            menuBuilder.startDispatchingItemsChanged();
        }
    }

    public final void updateVisibility(boolean z) {
        boolean z2 = this.mShowingForMode || !(this.mHiddenByApp || this.mHiddenBySystem);
        boolean z3 = this.mNowShowing;
        BiometricPrompt biometricPrompt = this.mUpdateListener;
        View view = this.mContentView;
        if (!z2) {
            if (z3) {
                this.mNowShowing = false;
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.mCurrentShowAnim;
                if (viewPropertyAnimatorCompatSet != null) {
                    viewPropertyAnimatorCompatSet.cancel();
                }
                int i = this.mCurWindowVisibility;
                AnonymousClass1 anonymousClass1 = this.mHideListener;
                if (i != 0 || (!this.mShowHideAnimationEnabled && !z)) {
                    anonymousClass1.onAnimationEnd();
                    return;
                }
                this.mContainerView.setAlpha(1.0f);
                this.mContainerView.setTransitioning(true);
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
                float f = -this.mContainerView.getHeight();
                if (z) {
                    this.mContainerView.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                ViewPropertyAnimatorCompat animate = ViewCompat.animate(this.mContainerView);
                animate.translationY(f);
                View view2 = (View) animate.mView.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(biometricPrompt != null ? new KnotSpinnerView$$ExternalSyntheticLambda3(1, biometricPrompt, view2) : null);
                }
                boolean z4 = viewPropertyAnimatorCompatSet2.mIsStarted;
                ArrayList arrayList = viewPropertyAnimatorCompatSet2.mAnimators;
                if (!z4) {
                    arrayList.add(animate);
                }
                if (this.mContentAnimations && view != null) {
                    ViewPropertyAnimatorCompat animate2 = ViewCompat.animate(view);
                    animate2.translationY(f);
                    if (!viewPropertyAnimatorCompatSet2.mIsStarted) {
                        arrayList.add(animate2);
                    }
                }
                boolean z5 = viewPropertyAnimatorCompatSet2.mIsStarted;
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.mInterpolator = sHideInterpolator;
                }
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.mDuration = 250L;
                }
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.mListener = anonymousClass1;
                }
                this.mCurrentShowAnim = viewPropertyAnimatorCompatSet2;
                viewPropertyAnimatorCompatSet2.start();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.mNowShowing = true;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet3 = this.mCurrentShowAnim;
        if (viewPropertyAnimatorCompatSet3 != null) {
            viewPropertyAnimatorCompatSet3.cancel();
        }
        this.mContainerView.setVisibility(0);
        int i2 = this.mCurWindowVisibility;
        AnonymousClass1 anonymousClass12 = this.mShowListener;
        if (i2 == 0 && (this.mShowHideAnimationEnabled || z)) {
            this.mContainerView.setTranslationY(RecyclerView.DECELERATION_RATE);
            float f2 = -this.mContainerView.getHeight();
            if (z) {
                this.mContainerView.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.mContainerView.setTranslationY(f2);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet4 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat animate3 = ViewCompat.animate(this.mContainerView);
            animate3.translationY(RecyclerView.DECELERATION_RATE);
            View view3 = (View) animate3.mView.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(biometricPrompt != null ? new KnotSpinnerView$$ExternalSyntheticLambda3(1, biometricPrompt, view3) : null);
            }
            boolean z6 = viewPropertyAnimatorCompatSet4.mIsStarted;
            ArrayList arrayList2 = viewPropertyAnimatorCompatSet4.mAnimators;
            if (!z6) {
                arrayList2.add(animate3);
            }
            if (this.mContentAnimations && view != null) {
                view.setTranslationY(f2);
                ViewPropertyAnimatorCompat animate4 = ViewCompat.animate(view);
                animate4.translationY(RecyclerView.DECELERATION_RATE);
                if (!viewPropertyAnimatorCompatSet4.mIsStarted) {
                    arrayList2.add(animate4);
                }
            }
            boolean z7 = viewPropertyAnimatorCompatSet4.mIsStarted;
            if (!z7) {
                viewPropertyAnimatorCompatSet4.mInterpolator = sShowInterpolator;
            }
            if (!z7) {
                viewPropertyAnimatorCompatSet4.mDuration = 250L;
            }
            if (!z7) {
                viewPropertyAnimatorCompatSet4.mListener = anonymousClass12;
            }
            this.mCurrentShowAnim = viewPropertyAnimatorCompatSet4;
            viewPropertyAnimatorCompatSet4.start();
        } else {
            this.mContainerView.setAlpha(1.0f);
            this.mContainerView.setTranslationY(RecyclerView.DECELERATION_RATE);
            if (this.mContentAnimations && view != null) {
                view.setTranslationY(RecyclerView.DECELERATION_RATE);
            }
            anonymousClass12.onAnimationEnd();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.mOverlayLayout;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setCustomView(View view) {
        ((ToolbarWidgetWrapper) this.mDecorToolbar).setCustomView(view);
    }

    public final class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {
        public final Context mActionModeContext;
        public AppCompatDelegateImpl.ActionModeCallbackWrapperV9 mCallback;
        public WeakReference mCustomView;
        public final MenuBuilder mMenu;

        public ActionModeImpl(Context context, AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9) {
            this.mActionModeContext = context;
            this.mCallback = actionModeCallbackWrapperV9;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            menuBuilder.mDefaultShowAsAction = 1;
            this.mMenu = menuBuilder;
            menuBuilder.mCallback = this;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void finish() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.mActionMode != this) {
                return;
            }
            boolean z = windowDecorActionBar.mHiddenByApp;
            boolean z2 = windowDecorActionBar.mHiddenBySystem;
            if (z || z2) {
                windowDecorActionBar.mDeferredDestroyActionMode = this;
                windowDecorActionBar.mDeferredModeDestroyCallback = this.mCallback;
            } else {
                this.mCallback.onDestroyActionMode(this);
            }
            this.mCallback = null;
            windowDecorActionBar.animateToMode(false);
            ActionBarContextView actionBarContextView = windowDecorActionBar.mContextView;
            if (actionBarContextView.mClose == null) {
                actionBarContextView.killMode();
            }
            windowDecorActionBar.mOverlayLayout.setHideOnContentScrollEnabled(windowDecorActionBar.mHideOnContentScroll);
            windowDecorActionBar.mActionMode = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final View getCustomView() {
            WeakReference weakReference = this.mCustomView;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuBuilder getMenu() {
            return this.mMenu;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuInflater getMenuInflater() {
            return new SupportMenuInflater(this.mActionModeContext);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence getSubtitle() {
            return WindowDecorActionBar.this.mContextView.mSubtitle;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence getTitle() {
            return WindowDecorActionBar.this.mContextView.mTitle;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void invalidate() {
            if (WindowDecorActionBar.this.mActionMode != this) {
                return;
            }
            MenuBuilder menuBuilder = this.mMenu;
            menuBuilder.stopDispatchingItemsChanged();
            try {
                this.mCallback.onPrepareActionMode(this, menuBuilder);
            } finally {
                menuBuilder.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public final boolean isTitleOptional() {
            return WindowDecorActionBar.this.mContextView.mTitleOptional;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = this.mCallback;
            if (actionModeCallbackWrapperV9 != null) {
                return actionModeCallbackWrapperV9.mWrapped.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.mCallback == null) {
                return;
            }
            invalidate();
            ActionMenuPresenter actionMenuPresenter = WindowDecorActionBar.this.mContextView.mActionMenuPresenter;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.showOverflowMenu();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void setCustomView(View view) {
            WindowDecorActionBar.this.mContextView.setCustomView(view);
            this.mCustomView = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void setSubtitle(int i) {
            setSubtitle(WindowDecorActionBar.this.mContext.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void setTitle(int i) {
            setTitle(WindowDecorActionBar.this.mContext.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void setTitleOptionalHint(boolean z) {
            this.mTitleOptionalHint = z;
            WindowDecorActionBar.this.mContextView.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void setSubtitle(CharSequence charSequence) {
            WindowDecorActionBar.this.mContextView.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void setTitle(CharSequence charSequence) {
            WindowDecorActionBar.this.mContextView.setTitle(charSequence);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void setTitle() {
        setTitle(this.mContext.getString(com.squareup.cash.R.string.stripe_3ds2_hzv_header_label));
    }

    public WindowDecorActionBar(Dialog dialog) {
        new ArrayList();
        this.mMenuVisibilityListeners = new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = new AnonymousClass1(this, 0);
        this.mShowListener = new AnonymousClass1(this, 1);
        this.mUpdateListener = new BiometricPrompt(this, 3);
        init(dialog.getWindow().getDecorView());
    }
}
