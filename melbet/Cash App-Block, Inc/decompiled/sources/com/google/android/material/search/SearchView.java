package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import com.google.android.gms.maps.zzah;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.motion.MaterialMainContainerBackHelper$$ExternalSyntheticLambda0;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.stripe.hcaptcha.HCaptchaDialogFragment$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import sqip.internal.GiftCardEditor$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean animatedMenuItems;
    public boolean animatedNavigationIcon;
    public boolean autoShowKeyboard;
    public final boolean backHandlingEnabled;
    public final zzah backOrchestrator;
    public final int backgroundColor;
    public final View backgroundView;
    public HashMap childImportantForAccessibilityMap;
    public final ImageButton clearButton;
    public final boolean containedAnimationEnabled;
    public final TouchObserverFrameLayout contentContainer;
    public int currentTransitionState;
    public final View divider;
    public final TextView dummyTextView;
    public final Toolbar dummyToolbar;
    public final EditText editText;
    public final ElevationOverlayProvider elevationOverlayProvider;
    public final FrameLayout headerContainer;
    public final boolean layoutInflated;
    public final ClippableRoundedCornerLayout rootView;
    public final View scrim;
    public SearchBar searchBar;
    public final TextView searchPrefix;
    public final SearchViewAnimationHelper searchViewAnimationHelper;
    public int softInputMode;
    public final View statusBarSpacer;
    public boolean statusBarSpacerEnabledOverride;
    public final MaterialToolbar toolbar;
    public final FrameLayout toolbarContainer;
    public final AnonymousClass1 touchModeChangeListener;
    public final LinkedHashSet transitionListeners;
    public boolean useWindowInsetsController;

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(14);
        public String text;
        public int visibility;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.material.search.SearchView$1] */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        float dimension;
        this.backOrchestrator = new zzah(this, this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = 2;
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                SearchView searchView = SearchView.this;
                EditText editText = searchView.editText;
                if (z || !searchView.hasWindowFocus()) {
                    return;
                }
                if ((!CameraSelector$$ExternalSyntheticOutline0.equals(searchView.currentTransitionState, 4) && !CameraSelector$$ExternalSyntheticOutline0.equals(searchView.currentTransitionState, 3)) || editText == null || editText.isFocused()) {
                    return;
                }
                Objects.requireNonNull(editText);
                editText.post(new KnotView$$ExternalSyntheticLambda1(editText, 5));
            }
        };
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.SearchView, i, R.style.Widget_Material3_SearchView, new int[0]);
        int color = obtainStyledAttributes.getColor(11, 0);
        this.backgroundColor = color;
        int resourceId = obtainStyledAttributes.getResourceId(18, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(0, -1);
        String string2 = obtainStyledAttributes.getString(3);
        String string3 = obtainStyledAttributes.getString(4);
        String string4 = obtainStyledAttributes.getString(26);
        boolean z = obtainStyledAttributes.getBoolean(29, false);
        this.animatedNavigationIcon = obtainStyledAttributes.getBoolean(8, true);
        this.animatedMenuItems = obtainStyledAttributes.getBoolean(7, true);
        boolean z2 = obtainStyledAttributes.getBoolean(19, false);
        this.autoShowKeyboard = obtainStyledAttributes.getBoolean(9, true);
        this.backHandlingEnabled = obtainStyledAttributes.getBoolean(10, true);
        boolean z3 = obtainStyledAttributes.getBoolean(16, true);
        boolean z4 = obtainStyledAttributes.getBoolean(14, false);
        this.containedAnimationEnabled = z4;
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.rootView = clippableRoundedCornerLayout;
        View findViewById = findViewById(R.id.open_search_view_background);
        this.backgroundView = findViewById;
        View findViewById2 = findViewById(R.id.open_search_view_status_bar_spacer);
        this.statusBarSpacer = findViewById2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.headerContainer = frameLayout;
        this.toolbarContainer = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.toolbar = materialToolbar;
        Toolbar toolbar = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.dummyToolbar = toolbar;
        TextView textView = (TextView) findViewById(R.id.open_search_view_dummy_text_view);
        this.dummyTextView = textView;
        this.searchPrefix = (TextView) findViewById(R.id.open_search_view_search_prefix);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.editText = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.clearButton = imageButton;
        View findViewById3 = findViewById(R.id.open_search_view_divider);
        this.divider = findViewById3;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.contentContainer = touchObserverFrameLayout;
        this.searchViewAnimationHelper = new SearchViewAnimationHelper(context2, this, z4);
        ElevationOverlayProvider elevationOverlayProvider = new ElevationOverlayProvider(context2);
        this.elevationOverlayProvider = elevationOverlayProvider;
        clippableRoundedCornerLayout.setOnTouchListener(new SearchView$$ExternalSyntheticLambda6());
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            MaterialShapeDrawable materialShapeDrawable = searchBar.backgroundShape;
            dimension = materialShapeDrawable != null ? materialShapeDrawable.drawableState.elevation : searchBar.getElevation();
        } else {
            dimension = getResources().getDimension(R.dimen.m3_searchview_elevation);
        }
        if (findViewById != null) {
            findViewById.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(dimension, color));
        }
        if (resourceId != -1) {
            frameLayout.addView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
        setSearchPrefixText(string4);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string2);
        editText.setHint(string3);
        editText.setOnFocusChangeListener(new GiftCardEditor$$ExternalSyntheticLambda0(this, 2));
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new SearchView$$ExternalSyntheticLambda4(this, 2));
            if (z) {
                DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
                int resolveColor = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorOnSurface));
                Paint paint = drawerArrowDrawable.mPaint;
                if (resolveColor != paint.getColor()) {
                    paint.setColor(resolveColor);
                    drawerArrowDrawable.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(drawerArrowDrawable);
            }
        }
        int i2 = 1;
        imageButton.setOnClickListener(new SearchView$$ExternalSyntheticLambda4(this, 1));
        editText.addTextChangedListener(new SearchView.AnonymousClass10(this, 4));
        findViewById3.setVisibility(z3 ? 0 : 8);
        touchObserverFrameLayout.setOnTouchListener(new HCaptchaDialogFragment$$ExternalSyntheticLambda1(this, i2));
        ViewUtils.doOnApplyWindowInsets(materialToolbar, new SearchView$$ExternalSyntheticLambda2(this));
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
        final int i3 = marginLayoutParams.leftMargin;
        final int i4 = marginLayoutParams.rightMargin;
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.SearchView$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i5 = SearchView.$r8$clinit;
                Insets insets = windowInsetsCompat.mImpl.getInsets(647);
                int i6 = i3 + insets.left;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i6;
                marginLayoutParams2.rightMargin = i4 + insets.right;
                return windowInsetsCompat;
            }
        };
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById3, onApplyWindowInsetsListener);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0;
        if (findViewById2.getLayoutParams().height != dimensionPixelSize) {
            findViewById2.getLayoutParams().height = dimensionPixelSize;
            findViewById2.requestLayout();
        }
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById2, new SearchView$$ExternalSyntheticLambda2(this));
        setToolbarTouchscreenBlocksFocus(false);
        if (z4) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) toolbar.getLayoutParams();
            layoutParams.gravity = 8388611;
            toolbar.setLayoutParams(layoutParams);
            toolbar.setVisibility(4);
            if (resourceId2 != -1) {
                textView.setTextAppearance(resourceId2);
            }
            textView.setText(string2);
            textView.setHint(string3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void cancelBackProgress() {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.backHelper;
        SearchBar searchBar = searchViewAnimationHelper.searchBar;
        if (materialMainContainerBackHelper.onCancelBackProgress() != null) {
            AnimatorSet createResetScaleAndTranslationAnimator = materialMainContainerBackHelper.createResetScaleAndTranslationAnimator(searchBar);
            View view = materialMainContainerBackHelper.view;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator ofObject = ValueAnimator.ofObject(new MaterialMainContainerBackHelper$$ExternalSyntheticLambda0(), clippableRoundedCornerLayout.cornerRadii, materialMainContainerBackHelper.getExpandedCornerRadii());
                ofObject.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(clippableRoundedCornerLayout, 3));
                createResetScaleAndTranslationAnimator.playTogether(ofObject);
            }
            createResetScaleAndTranslationAnimator.setDuration(materialMainContainerBackHelper.cancelDuration);
            createResetScaleAndTranslationAnimator.start();
            materialMainContainerBackHelper.initialTouchY = RecyclerView.DECELERATION_RATE;
            materialMainContainerBackHelper.initialHideToClipBounds = null;
            materialMainContainerBackHelper.initialHideFromClipBounds = null;
        }
        AnimatorSet animatorSet = searchViewAnimationHelper.backProgressAnimatorSet;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        searchViewAnimationHelper.backProgressAnimatorSet = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public final CoordinatorLayout.Behavior getBehavior() {
        return new Behavior();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.backHelper;
        BackEventCompat backEventCompat = materialMainContainerBackHelper.backEvent;
        materialMainContainerBackHelper.backEvent = null;
        if (Build.VERSION.SDK_INT < 34 || this.searchBar == null || backEventCompat == null) {
            hide();
            return;
        }
        long totalDuration = searchViewAnimationHelper.hide().getTotalDuration();
        MaterialMainContainerBackHelper materialMainContainerBackHelper2 = searchViewAnimationHelper.backHelper;
        AnimatorSet createResetScaleAndTranslationAnimator = materialMainContainerBackHelper2.createResetScaleAndTranslationAnimator(searchViewAnimationHelper.searchBar);
        createResetScaleAndTranslationAnimator.setDuration(totalDuration);
        createResetScaleAndTranslationAnimator.start();
        materialMainContainerBackHelper2.initialTouchY = RecyclerView.DECELERATION_RATE;
        materialMainContainerBackHelper2.initialHideToClipBounds = null;
        materialMainContainerBackHelper2.initialHideFromClipBounds = null;
        if (searchViewAnimationHelper.backProgressAnimatorSet != null) {
            searchViewAnimationHelper.animationDelegate.startButtonsTranslationAnimation();
            searchViewAnimationHelper.backProgressAnimatorSet.resume();
        }
        searchViewAnimationHelper.backProgressAnimatorSet = null;
    }

    public final void hide() {
        if (CameraSelector$$ExternalSyntheticOutline0.equals(this.currentTransitionState, 2) || CameraSelector$$ExternalSyntheticOutline0.equals(this.currentTransitionState, 1)) {
            return;
        }
        SearchBar searchBar = this.searchBar;
        SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            searchViewAnimationHelper.hide();
            return;
        }
        if (!this.containedAnimationEnabled) {
            SearchBar searchBar2 = this.searchBar;
            searchBar2.placeholderTextView.setText(this.editText.getText().toString());
        }
        SearchBar searchBar3 = this.searchBar;
        Objects.requireNonNull(searchViewAnimationHelper);
        searchBar3.post(new SearchView$$ExternalSyntheticLambda9(searchViewAnimationHelper, 0));
    }

    public final boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public final boolean isHiddenOrHiding() {
        return CameraSelector$$ExternalSyntheticOutline0.equals(this.currentTransitionState, 2) || CameraSelector$$ExternalSyntheticOutline0.equals(this.currentTransitionState, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RetryKt.setParentAbsoluteElevation(this);
        int i = this.currentTransitionState;
        if (i == 4) {
            setModalForAccessibility(true);
        } else if (i == 2) {
            setModalForAccessibility(false);
        }
        updateListeningForBackCallbacks(i);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        zzah zzahVar = this.backOrchestrator;
        MaterialBackOrchestrator$Api33BackCallbackDelegate materialBackOrchestrator$Api33BackCallbackDelegate = (MaterialBackOrchestrator$Api33BackCallbackDelegate) zzahVar.f68zza;
        if (materialBackOrchestrator$Api33BackCallbackDelegate != null) {
            materialBackOrchestrator$Api33BackCallbackDelegate.stopListeningForBackCallbacks((View) zzahVar.zzc);
        }
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        Activity activity;
        super.onFinishInflate();
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            this.softInputMode = window.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = this.editText.getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public final void requestFocusAndShowKeyboardIfNeeded() {
        boolean z = this.autoShowKeyboard;
        EditText editText = this.editText;
        if (z) {
            editText.postDelayed(new SearchView$$ExternalSyntheticLambda5(this, 2), 100L);
        } else {
            if (isInTouchMode()) {
                return;
            }
            editText.postDelayed(new SearchView$$ExternalSyntheticLambda5(this, 1), 100L);
        }
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.animatedNavigationIcon = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.autoShowKeyboard = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        View view;
        super.setElevation(f);
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || (view = this.backgroundView) == null) {
            return;
        }
        view.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(f, this.backgroundColor));
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
        this.dummyTextView.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.animatedMenuItems = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z);
        if (z) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.searchPrefix;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.statusBarSpacerEnabledOverride = true;
        this.statusBarSpacer.setVisibility(z ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
        this.dummyTextView.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.toolbar.setTouchscreenBlocksFocus(z);
    }

    public final void setTransitionState(int i, boolean z) {
        if (CameraSelector$$ExternalSyntheticOutline0.equals(this.currentTransitionState, i)) {
            return;
        }
        if (z) {
            if (i == 4) {
                setModalForAccessibility(true);
            } else if (i == 2) {
                setModalForAccessibility(false);
            }
        }
        this.currentTransitionState = i;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        updateListeningForBackCallbacks(i);
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || i != 2) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.useWindowInsetsController = z;
    }

    public void setVisible(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z ? 4 : 2, z2 != z);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        float dimension;
        View view;
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.searchBar = searchBar;
        if (searchBar != null) {
            int i = 0;
            searchBar.setOnClickListener(new SearchView$$ExternalSyntheticLambda4(this, 0));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new SearchView$$ExternalSyntheticLambda5(this, i));
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar != null && !(materialToolbar.getNavigationIcon() instanceof DrawerArrowDrawable)) {
            if (this.searchBar == null) {
                materialToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24);
            } else {
                Drawable mutate = DimensionKt.getDrawable(getContext(), R.drawable.ic_arrow_back_black_24).mutate();
                Integer num = materialToolbar.navigationIconTint;
                if (num != null) {
                    mutate.setTint(num.intValue());
                }
                mutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), mutate));
                updateNavigationIconProgressIfNeeded();
            }
        }
        SearchBar searchBar2 = this.searchBar;
        if (searchBar2 != null) {
            MaterialShapeDrawable materialShapeDrawable = searchBar2.backgroundShape;
            dimension = materialShapeDrawable != null ? materialShapeDrawable.drawableState.elevation : searchBar2.getElevation();
        } else {
            dimension = getResources().getDimension(R.dimen.m3_searchview_elevation);
        }
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider != null && (view = this.backgroundView) != null) {
            view.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(dimension, this.backgroundColor));
        }
        updateListeningForBackCallbacks(this.currentTransitionState);
    }

    public final void show() {
        if (CameraSelector$$ExternalSyntheticOutline0.equals(this.currentTransitionState, 4)) {
            return;
        }
        int i = 3;
        if (CameraSelector$$ExternalSyntheticOutline0.equals(this.currentTransitionState, 3)) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        SearchView searchView = searchViewAnimationHelper.searchView;
        searchViewAnimationHelper.cancelPendingAnimations();
        SearchBar searchBar = searchViewAnimationHelper.searchBar;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchViewAnimationHelper.rootView;
        if (searchBar == null) {
            if (searchView.isAdjustNothingSoftInputMode()) {
                searchView.postDelayed(new SearchView$$ExternalSyntheticLambda5(searchView, i), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new SearchView$$ExternalSyntheticLambda9(searchViewAnimationHelper, 2));
            return;
        }
        EditText editText = searchViewAnimationHelper.editText;
        if (searchView.isAdjustNothingSoftInputMode()) {
            searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        searchView.setTransitionState(3, true);
        searchViewAnimationHelper.animationDelegate.setUpDummyToolbarIfNeeded();
        editText.setText(searchViewAnimationHelper.searchBar.textView.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new SearchView$$ExternalSyntheticLambda9(searchViewAnimationHelper, 1));
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void startBackProgress(BackEventCompat backEventCompat) {
        SearchBar searchBar;
        if (isHiddenOrHiding() || (searchBar = this.searchBar) == null) {
            return;
        }
        if (!this.containedAnimationEnabled) {
            searchBar.placeholderTextView.setText(this.editText.getText().toString());
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.backHelper;
        SearchBar searchBar2 = searchViewAnimationHelper.searchBar;
        materialMainContainerBackHelper.backEvent = backEventCompat;
        float f = backEventCompat.touchY;
        View view = materialMainContainerBackHelper.view;
        materialMainContainerBackHelper.initialHideToClipBounds = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar2 != null) {
            materialMainContainerBackHelper.initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(view, searchBar2);
        }
        materialMainContainerBackHelper.initialTouchY = f;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void updateBackProgress(BackEventCompat backEventCompat) {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        SearchView searchView = searchViewAnimationHelper.searchView;
        float f = backEventCompat.progress;
        if (f <= RecyclerView.DECELERATION_RATE) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.backHelper;
        SearchBar searchBar = searchViewAnimationHelper.searchBar;
        float topLeftCornerResolvedSize = searchBar.backgroundShape.getTopLeftCornerResolvedSize();
        if (materialMainContainerBackHelper.backEvent == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialMainContainerBackHelper.backEvent;
        materialMainContainerBackHelper.backEvent = backEventCompat;
        if (backEventCompat2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z = backEventCompat.swipeEdge == 0;
            float f2 = backEventCompat.touchY;
            float f3 = materialMainContainerBackHelper.minEdgeGap;
            float interpolation = materialMainContainerBackHelper.progressInterpolator.getInterpolation(f);
            View view = materialMainContainerBackHelper.view;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > RecyclerView.DECELERATION_RATE && height > RecyclerView.DECELERATION_RATE) {
                float lerp = AnimationUtils.lerp(1.0f, 0.9f, interpolation);
                float lerp2 = AnimationUtils.lerp(RecyclerView.DECELERATION_RATE, Math.max(RecyclerView.DECELERATION_RATE, ((width - (0.9f * width)) / 2.0f) - f3), interpolation) * (z ? 1 : -1);
                float min = Math.min(Math.max(RecyclerView.DECELERATION_RATE, ((height - (lerp * height)) / 2.0f) - f3), materialMainContainerBackHelper.maxTranslationY);
                float f4 = f2 - materialMainContainerBackHelper.initialTouchY;
                float lerp3 = AnimationUtils.lerp(RecyclerView.DECELERATION_RATE, min, Math.abs(f4) / height) * Math.signum(f4);
                if (!Float.isNaN(lerp) && !Float.isNaN(lerp2) && !Float.isNaN(lerp3)) {
                    view.setScaleX(lerp);
                    view.setScaleY(lerp);
                    view.setTranslationX(lerp2);
                    view.setTranslationY(lerp3);
                    if (view instanceof ClippableRoundedCornerLayout) {
                        float[] expandedCornerRadii = materialMainContainerBackHelper.getExpandedCornerRadii();
                        ((ClippableRoundedCornerLayout) view).updateClipBoundsAndCornerRadii(r17.getLeft(), r17.getTop(), r17.getRight(), r17.getBottom(), new float[]{AnimationUtils.lerp(expandedCornerRadii[0], topLeftCornerResolvedSize, interpolation), AnimationUtils.lerp(expandedCornerRadii[1], topLeftCornerResolvedSize, interpolation), AnimationUtils.lerp(expandedCornerRadii[2], topLeftCornerResolvedSize, interpolation), AnimationUtils.lerp(expandedCornerRadii[3], topLeftCornerResolvedSize, interpolation), AnimationUtils.lerp(expandedCornerRadii[4], topLeftCornerResolvedSize, interpolation), AnimationUtils.lerp(expandedCornerRadii[5], topLeftCornerResolvedSize, interpolation), AnimationUtils.lerp(expandedCornerRadii[6], topLeftCornerResolvedSize, interpolation), AnimationUtils.lerp(expandedCornerRadii[7], topLeftCornerResolvedSize, interpolation)});
                    }
                }
            }
        }
        AnimatorSet animatorSet = searchViewAnimationHelper.backProgressAnimatorSet;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
            return;
        }
        if (searchView.isAdjustNothingSoftInputMode()) {
            searchViewAnimationHelper.editText.clearFocus();
        }
        if (searchView.animatedNavigationIcon) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            searchViewAnimationHelper.addBackButtonProgressAnimatorIfNeeded(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(ReversableAnimatedValueInterpolator.of(false, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            searchViewAnimationHelper.backProgressAnimatorSet = animatorSet2;
            animatorSet2.start();
            searchViewAnimationHelper.backProgressAnimatorSet.pause();
        }
    }

    public final void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z);
                } else {
                    HashMap hashMap = this.childImportantForAccessibilityMap;
                    if (z) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.childImportantForAccessibilityMap.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void updateListeningForBackCallbacks(int i) {
        MaterialBackOrchestrator$Api33BackCallbackDelegate materialBackOrchestrator$Api33BackCallbackDelegate;
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        boolean equals = CameraSelector$$ExternalSyntheticOutline0.equals(i, 4);
        zzah zzahVar = this.backOrchestrator;
        if (equals) {
            MaterialBackOrchestrator$Api33BackCallbackDelegate materialBackOrchestrator$Api33BackCallbackDelegate2 = (MaterialBackOrchestrator$Api33BackCallbackDelegate) zzahVar.f68zza;
            if (materialBackOrchestrator$Api33BackCallbackDelegate2 != null) {
                materialBackOrchestrator$Api33BackCallbackDelegate2.startListeningForBackCallbacks((MaterialBackHandler) zzahVar.zzb, (View) zzahVar.zzc, false);
                return;
            }
            return;
        }
        if (!CameraSelector$$ExternalSyntheticOutline0.equals(i, 2) || (materialBackOrchestrator$Api33BackCallbackDelegate = (MaterialBackOrchestrator$Api33BackCallbackDelegate) zzahVar.f68zza) == null) {
            return;
        }
        materialBackOrchestrator$Api33BackCallbackDelegate.stopListeningForBackCallbacks((View) zzahVar.zzc);
    }

    public final void updateNavigationIconProgressIfNeeded() {
        ImageButton navigationIconButton = ViewUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        int i = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable drawable = navigationIconButton.getDrawable();
        if (drawable instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawable).setProgress(i);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(i);
        }
    }

    public static class Behavior extends CoordinatorLayout.Behavior {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.searchBar != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    public void setHint(int i) {
        this.editText.setHint(i);
        this.dummyTextView.setHint(i);
    }

    public void setText(int i) {
        this.editText.setText(i);
        this.dummyTextView.setText(i);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
