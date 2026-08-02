package com.google.android.material.search;

import android.animation.AnimatorSet;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.android.volley.NetworkResponse;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.search.SearchViewAnimationHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final /* synthetic */ class SearchView$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SearchViewAnimationHelper f$0;

    public /* synthetic */ SearchView$$ExternalSyntheticLambda9(SearchViewAnimationHelper searchViewAnimationHelper, int i) {
        this.$r8$classId = i;
        this.f$0 = searchViewAnimationHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = 0;
        SearchViewAnimationHelper searchViewAnimationHelper = this.f$0;
        switch (i) {
            case 0:
                searchViewAnimationHelper.hide();
                break;
            case 1:
                searchViewAnimationHelper.getClass();
                NetworkResponse networkResponse = new NetworkResponse();
                SearchViewAnimationHelper.AnimationDelegate animationDelegate = searchViewAnimationHelper.animationDelegate;
                AnimatorSet expandCollapseAnimatorSet = animationDelegate.getExpandCollapseAnimatorSet(true);
                if (searchViewAnimationHelper.backProgressAnimatorSet == null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    searchViewAnimationHelper.addBackButtonProgressAnimatorIfNeeded(animatorSet);
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(true, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
                    expandCollapseAnimatorSet.playTogether(animatorSet);
                }
                ((ArrayList) networkResponse.data).add(expandCollapseAnimatorSet);
                Iterator it = animationDelegate.getExpandCollapseSpringAnimations(true).iterator();
                while (it.hasNext()) {
                    ((ArrayList) networkResponse.headers).add((SpringAnimation) it.next());
                }
                ((ArrayList) networkResponse.allHeaders).add(new SearchViewAnimationHelper.AnonymousClass1(searchViewAnimationHelper, networkResponse, i2));
                networkResponse.start();
                searchViewAnimationHelper.activeCoordinator = networkResponse;
                break;
            default:
                searchViewAnimationHelper.rootView.setTranslationY(r0.getHeight());
                AnimatorSet translateAnimatorSet = searchViewAnimationHelper.getTranslateAnimatorSet(true);
                translateAnimatorSet.addListener(new SearchViewAnimationHelper.AnonymousClass3(searchViewAnimationHelper, translateAnimatorSet, i2));
                translateAnimatorSet.start();
                searchViewAnimationHelper.activeTranslateAnimatorSet = translateAnimatorSet;
                break;
        }
    }
}
