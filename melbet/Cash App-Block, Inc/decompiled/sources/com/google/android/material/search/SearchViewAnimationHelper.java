package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.NetworkResponse;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.motion.MotionUtils;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import com.squareup.scannerview.SizeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class SearchViewAnimationHelper {
    public static final LinearInterpolator DEFAULT_INTERPOLATOR = AnimationUtils.LINEAR_INTERPOLATOR;
    public NetworkResponse activeCoordinator;
    public AnimatorSet activeTranslateAnimatorSet;
    public final AnimationDelegate animationDelegate;
    public final MaterialMainContainerBackHelper backHelper;
    public AnimatorSet backProgressAnimatorSet;
    public final View backgroundView;
    public final ImageButton clearButton;
    public final TouchObserverFrameLayout contentContainer;
    public final Context context;
    public final View divider;
    public final TextView dummyTextView;
    public final Toolbar dummyToolbar;
    public final int durationShort1;
    public final int durationShort2;
    public final EditText editText;
    public final FrameLayout headerContainer;
    public final ClippableRoundedCornerLayout rootView;
    public final View scrim;
    public SearchBar searchBar;
    public final TextView searchPrefix;
    public final SearchView searchView;
    public final TimeInterpolator standardAccelerateInterpolator;
    public final TimeInterpolator standardDecelerateInterpolator;
    public final MaterialToolbar toolbar;
    public final FrameLayout toolbarContainer;

    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ SearchViewAnimationHelper this$0;
        public final /* synthetic */ NetworkResponse val$coordinator;

        public /* synthetic */ AnonymousClass1(SearchViewAnimationHelper searchViewAnimationHelper, NetworkResponse networkResponse, int i) {
            this.$r8$classId = i;
            this.this$0 = searchViewAnimationHelper;
            this.val$coordinator = networkResponse;
        }

        public final void onAnimationsEnd() {
            int i = this.$r8$classId;
            NetworkResponse networkResponse = this.val$coordinator;
            SearchViewAnimationHelper searchViewAnimationHelper = this.this$0;
            switch (i) {
                case 0:
                    searchViewAnimationHelper.animationDelegate.onAnimationEnd(true);
                    SearchView searchView = searchViewAnimationHelper.searchView;
                    if (!searchView.isAdjustNothingSoftInputMode()) {
                        searchView.requestFocusAndShowKeyboardIfNeeded();
                    }
                    searchView.setTransitionState(4, true);
                    if (searchViewAnimationHelper.activeCoordinator == networkResponse) {
                        searchViewAnimationHelper.activeCoordinator = null;
                        break;
                    }
                    break;
                default:
                    searchViewAnimationHelper.animationDelegate.onAnimationEnd(false);
                    searchViewAnimationHelper.rootView.setVisibility(8);
                    SearchView searchView2 = searchViewAnimationHelper.searchView;
                    if (!searchView2.isAdjustNothingSoftInputMode()) {
                        searchViewAnimationHelper.editText.clearFocus();
                    }
                    searchView2.setTransitionState(2, true);
                    if (searchViewAnimationHelper.activeCoordinator == networkResponse) {
                        searchViewAnimationHelper.activeCoordinator = null;
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$3, reason: invalid class name */
    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ SearchViewAnimationHelper this$0;
        public final /* synthetic */ AnimatorSet val$animatorSet;

        public /* synthetic */ AnonymousClass3(SearchViewAnimationHelper searchViewAnimationHelper, AnimatorSet animatorSet, int i) {
            this.$r8$classId = i;
            this.this$0 = searchViewAnimationHelper;
            this.val$animatorSet = animatorSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            AnimatorSet animatorSet = this.val$animatorSet;
            SearchViewAnimationHelper searchViewAnimationHelper = this.this$0;
            switch (i) {
                case 0:
                    SearchView searchView = searchViewAnimationHelper.searchView;
                    SearchView searchView2 = searchViewAnimationHelper.searchView;
                    if (!searchView.isAdjustNothingSoftInputMode()) {
                        searchView2.requestFocusAndShowKeyboardIfNeeded();
                    }
                    searchView2.setTransitionState(4, true);
                    if (searchViewAnimationHelper.activeTranslateAnimatorSet == animatorSet) {
                        searchViewAnimationHelper.activeTranslateAnimatorSet = null;
                        break;
                    }
                    break;
                default:
                    searchViewAnimationHelper.rootView.setVisibility(8);
                    SearchView searchView3 = searchViewAnimationHelper.searchView;
                    if (!searchView3.isAdjustNothingSoftInputMode()) {
                        searchViewAnimationHelper.editText.clearFocus();
                    }
                    searchView3.setTransitionState(2, true);
                    if (searchViewAnimationHelper.activeTranslateAnimatorSet == animatorSet) {
                        searchViewAnimationHelper.activeTranslateAnimatorSet = null;
                        break;
                    }
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            SearchViewAnimationHelper searchViewAnimationHelper = this.this$0;
            switch (i) {
                case 0:
                    searchViewAnimationHelper.rootView.setVisibility(0);
                    searchViewAnimationHelper.searchView.setTransitionState(3, true);
                    break;
                default:
                    searchViewAnimationHelper.searchView.setTransitionState(1, true);
                    break;
            }
        }
    }

    public interface AnimationDelegate {
        AnimatorSet getExpandCollapseAnimatorSet(boolean z);

        List getExpandCollapseSpringAnimations(boolean z);

        void onAnimationEnd(boolean z);

        void onAnimationStart(boolean z);

        void setUpDummyToolbarIfNeeded();

        void startButtonsTranslationAnimation();
    }

    public SearchViewAnimationHelper(Context context, SearchView searchView, boolean z) {
        this.context = context;
        this.searchView = searchView;
        this.scrim = searchView.scrim;
        this.backgroundView = searchView.backgroundView;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.rootView = clippableRoundedCornerLayout;
        this.headerContainer = searchView.headerContainer;
        this.toolbarContainer = searchView.toolbarContainer;
        this.toolbar = searchView.toolbar;
        this.dummyToolbar = searchView.dummyToolbar;
        this.searchPrefix = searchView.searchPrefix;
        this.dummyTextView = searchView.dummyTextView;
        this.editText = searchView.editText;
        this.clearButton = searchView.clearButton;
        this.divider = searchView.divider;
        this.contentContainer = searchView.contentContainer;
        this.backHelper = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
        LinearInterpolator linearInterpolator = DEFAULT_INTERPOLATOR;
        this.standardAccelerateInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardAccelerateInterpolator, linearInterpolator);
        this.standardDecelerateInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardDecelerateInterpolator, linearInterpolator);
        this.durationShort1 = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort1, 100);
        this.durationShort2 = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
        this.animationDelegate = z ? new zzr(this, 6) : new SizeMap(this, 1);
    }

    public static void access$1000(SearchViewAnimationHelper searchViewAnimationHelper, float f) {
        ActionMenuView actionMenuView;
        searchViewAnimationHelper.clearButton.setAlpha(f);
        searchViewAnimationHelper.divider.setAlpha(f);
        searchViewAnimationHelper.contentContainer.setAlpha(f);
        if (!searchViewAnimationHelper.searchView.animatedMenuItems || (actionMenuView = ViewUtils.getActionMenuView(searchViewAnimationHelper.toolbar)) == null) {
            return;
        }
        actionMenuView.setAlpha(f);
    }

    public static int access$2000(SearchViewAnimationHelper searchViewAnimationHelper, View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != searchViewAnimationHelper.searchView.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    public static int access$2100(SearchViewAnimationHelper searchViewAnimationHelper, View view, View view2) {
        if (view != null) {
            return searchViewAnimationHelper.getViewLeftFromSearchViewParent(view) - searchViewAnimationHelper.getViewLeftFromSearchViewParent(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = searchViewAnimationHelper.searchBar.getPaddingStart();
        int viewLeftFromSearchViewParent = searchViewAnimationHelper.getViewLeftFromSearchViewParent(searchViewAnimationHelper.searchBar);
        return ViewUtils.isLayoutRtl(searchViewAnimationHelper.searchBar) ? (((searchViewAnimationHelper.searchBar.getWidth() + viewLeftFromSearchViewParent) + marginStart) - paddingStart) - searchViewAnimationHelper.searchView.getRight() : (viewLeftFromSearchViewParent - marginStart) + paddingStart;
    }

    public static boolean access$500(SearchViewAnimationHelper searchViewAnimationHelper) {
        MenuBuilder menu;
        SearchBar searchBar = searchViewAnimationHelper.searchBar;
        if (searchBar.menuResId != -1 && searchViewAnimationHelper.searchView.animatedMenuItems && (menu = searchBar.getMenu()) != null) {
            for (int i = 0; i < menu.mItems.size(); i++) {
                if (menu.getItem(i).isVisible()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void access$700(SearchViewAnimationHelper searchViewAnimationHelper, Toolbar toolbar) {
        ActionMenuView actionMenuView = ViewUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i = 0; i < actionMenuView.getChildCount(); i++) {
                View childAt = actionMenuView.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    public static ValueAnimator access$900(SearchViewAnimationHelper searchViewAnimationHelper, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setDuration(z ? 50L : 42L);
        ofFloat.setStartDelay(z ? 250L : 0L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(searchViewAnimationHelper.clearButton));
        return ofFloat;
    }

    public final void addBackButtonProgressAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ViewUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        Drawable drawable = navigationIconButton.getDrawable();
        if (!this.searchView.animatedNavigationIcon) {
            if (drawable instanceof DrawerArrowDrawable) {
                ((DrawerArrowDrawable) drawable).setProgress(1.0f);
            }
            if (drawable instanceof FadeThroughDrawable) {
                ((FadeThroughDrawable) drawable).setProgress(1.0f);
                return;
            }
            return;
        }
        if (drawable instanceof DrawerArrowDrawable) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1((DrawerArrowDrawable) drawable, 5));
            animatorSet.playTogether(ofFloat);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat2.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1((FadeThroughDrawable) drawable, 6));
            animatorSet.playTogether(ofFloat2);
        }
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat3.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(navigationIconButton, 7));
        animatorSet.playTogether(ofFloat3);
    }

    public final void cancelPendingAnimations() {
        NetworkResponse networkResponse = this.activeCoordinator;
        if (networkResponse != null) {
            ArrayList arrayList = (ArrayList) networkResponse.headers;
            ArrayList arrayList2 = (ArrayList) networkResponse.data;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList2.clear();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).end();
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList.clear();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                SpringAnimation springAnimation = (SpringAnimation) it2.next();
                if (springAnimation == null) {
                    springAnimation.cancel();
                } else if (springAnimation.mSpring.mDampingRatio > 0.0d) {
                    springAnimation.skipToEnd();
                } else {
                    springAnimation.cancel();
                }
            }
            ((ArrayList) networkResponse.allHeaders).clear();
            networkResponse.statusCode = 0;
            networkResponse.notModified = false;
            this.activeCoordinator = null;
        }
        AnimatorSet animatorSet = this.activeTranslateAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.activeTranslateAnimatorSet = null;
        }
    }

    public final AnimatorSet getTranslateAnimatorSet(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), RecyclerView.DECELERATION_RATE);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(clippableRoundedCornerLayout));
        animatorSet.playTogether(ofFloat);
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet.setDuration(z ? 350L : 300L);
        return animatorSet;
    }

    public final int getViewLeftFromSearchViewParent(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.searchView.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final AnimatorSet hide() {
        cancelPendingAnimations();
        SearchBar searchBar = this.searchBar;
        int i = 1;
        EditText editText = this.editText;
        SearchView searchView = this.searchView;
        if (searchBar == null) {
            if (searchView.isAdjustNothingSoftInputMode()) {
                editText.clearFocus();
            }
            AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(false);
            translateAnimatorSet.addListener(new AnonymousClass3(this, translateAnimatorSet, i));
            translateAnimatorSet.start();
            this.activeTranslateAnimatorSet = translateAnimatorSet;
            return translateAnimatorSet;
        }
        if (searchView.isAdjustNothingSoftInputMode()) {
            editText.clearFocus();
        }
        NetworkResponse networkResponse = new NetworkResponse();
        AnimationDelegate animationDelegate = this.animationDelegate;
        AnimatorSet expandCollapseAnimatorSet = animationDelegate.getExpandCollapseAnimatorSet(false);
        if (this.backProgressAnimatorSet == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            addBackButtonProgressAnimatorIfNeeded(animatorSet);
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(false, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            expandCollapseAnimatorSet.playTogether(animatorSet);
        }
        ((ArrayList) networkResponse.data).add(expandCollapseAnimatorSet);
        Iterator it = animationDelegate.getExpandCollapseSpringAnimations(false).iterator();
        while (it.hasNext()) {
            ((ArrayList) networkResponse.headers).add((SpringAnimation) it.next());
        }
        ((ArrayList) networkResponse.allHeaders).add(new AnonymousClass1(this, networkResponse, i));
        networkResponse.start();
        this.activeCoordinator = networkResponse;
        return expandCollapseAnimatorSet;
    }
}
