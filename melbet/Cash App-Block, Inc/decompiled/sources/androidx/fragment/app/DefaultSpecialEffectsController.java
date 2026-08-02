package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.BackEventCompat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.collection.ArrayMap;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.android.gms.dynamite.zzf;
import com.squareup.cash.R;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController {
    public final ViewGroup container;
    public boolean isContainerPostponed;
    public boolean operationDirectionIsPop;
    public final ArrayList pendingOperations;
    public boolean runningNonSeekableTransition;
    public final ArrayList runningOperations;

    public final class AnimationEffect extends SpecialEffectsController$Effect {
        public final AnimationInfo animationInfo;

        public AnimationEffect(AnimationInfo animationInfo) {
            this.animationInfo = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onCancel(ViewGroup viewGroup) {
            viewGroup.getClass();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = this.animationInfo.f866operation;
            View view = specialEffectsController$FragmentStateManagerOperation.fragment.mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            specialEffectsController$FragmentStateManagerOperation.completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Animation from operation " + specialEffectsController$FragmentStateManagerOperation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onCommit(final ViewGroup viewGroup) {
            viewGroup.getClass();
            AnimationInfo animationInfo = this.animationInfo;
            final SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = animationInfo.f866operation;
            if (animationInfo.isVisibilityUnchanged()) {
                specialEffectsController$FragmentStateManagerOperation.completeEffect(this);
                return;
            }
            Context context = viewGroup.getContext();
            final View view = specialEffectsController$FragmentStateManagerOperation.fragment.mView;
            context.getClass();
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            Animation animation2 = animation.animation;
            if (animation2 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            if (specialEffectsController$FragmentStateManagerOperation.finalState != 1) {
                view.startAnimation(animation2);
                specialEffectsController$FragmentStateManagerOperation.completeEffect(this);
                return;
            }
            viewGroup.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, viewGroup, view);
            endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation3) {
                    animation3.getClass();
                    ViewGroup viewGroup2 = viewGroup;
                    viewGroup2.post(new AFd1wSDK$$ExternalSyntheticLambda2(21, viewGroup2, view, this));
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Animation from operation " + SpecialEffectsController$FragmentStateManagerOperation.this + " has ended.");
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation3) {
                    animation3.getClass();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation3) {
                    animation3.getClass();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Animation from operation " + SpecialEffectsController$FragmentStateManagerOperation.this + " has reached onAnimationStart.");
                    }
                }
            });
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Animation from operation " + specialEffectsController$FragmentStateManagerOperation + " has started.");
            }
        }
    }

    public final class AnimationInfo extends SpecialEffectsInfo {
        public FragmentAnim.AnimationOrAnimator animation;
        public boolean isAnimLoaded;
        public final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation, boolean z) {
            super(specialEffectsController$FragmentStateManagerOperation);
            specialEffectsController$FragmentStateManagerOperation.getClass();
            this.isPop = z;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            Animation loadAnimation;
            FragmentAnim.AnimationOrAnimator animationOrAnimator;
            context.getClass();
            if (this.isAnimLoaded) {
                return this.animation;
            }
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = this.f866operation;
            Fragment fragment = specialEffectsController$FragmentStateManagerOperation.fragment;
            boolean z = specialEffectsController$FragmentStateManagerOperation.finalState == 2;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = this.isPop ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            FragmentAnim.AnimationOrAnimator animationOrAnimator2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
                if (onCreateAnimation != null) {
                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
                    if (onCreateAnimator != null) {
                        animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? FragmentAnim.toActivityTransitResId(context, android.R.attr.activityOpenEnterAnimation) : FragmentAnim.toActivityTransitResId(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? FragmentAnim.toActivityTransitResId(context, android.R.attr.activityCloseEnterAnimation) : FragmentAnim.toActivityTransitResId(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            try {
                                if (equals) {
                                    try {
                                        loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    } catch (Resources.NotFoundException e) {
                                        throw e;
                                    } catch (RuntimeException unused) {
                                    }
                                    if (loadAnimation != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(loadAnimation);
                                        animationOrAnimator2 = animationOrAnimator;
                                    }
                                }
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (loadAnimator != null) {
                                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(loadAnimator);
                                    animationOrAnimator2 = animationOrAnimator;
                                }
                            } catch (RuntimeException e2) {
                                if (equals) {
                                    throw e2;
                                }
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (loadAnimation2 != null) {
                                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(loadAnimation2);
                                }
                            }
                        }
                    }
                }
            }
            this.animation = animationOrAnimator2;
            this.isAnimLoaded = true;
            return animationOrAnimator2;
        }
    }

    public final class AnimatorEffect extends SpecialEffectsController$Effect {
        public AnimatorSet animator;
        public final AnimationInfo animatorInfo;

        public AnimatorEffect(AnimationInfo animationInfo) {
            this.animatorInfo = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onCancel(ViewGroup viewGroup) {
            viewGroup.getClass();
            AnimatorSet animatorSet = this.animator;
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = this.animatorInfo.f866operation;
            if (animatorSet == null) {
                specialEffectsController$FragmentStateManagerOperation.completeEffect(this);
                return;
            }
            if (specialEffectsController$FragmentStateManagerOperation.isSeeking) {
                Api26Impl.INSTANCE.reverse(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(specialEffectsController$FragmentStateManagerOperation);
                sb.append(" has been canceled");
                sb.append(specialEffectsController$FragmentStateManagerOperation.isSeeking ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onCommit(ViewGroup viewGroup) {
            viewGroup.getClass();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = this.animatorInfo.f866operation;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                specialEffectsController$FragmentStateManagerOperation.completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Animator from operation " + specialEffectsController$FragmentStateManagerOperation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onProgress(BackEventCompat backEventCompat, ViewGroup viewGroup) {
            backEventCompat.getClass();
            viewGroup.getClass();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = this.animatorInfo.f866operation;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                specialEffectsController$FragmentStateManagerOperation.completeEffect(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !specialEffectsController$FragmentStateManagerOperation.fragment.mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + specialEffectsController$FragmentStateManagerOperation);
            }
            long j = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long j2 = (long) (backEventCompat.progress * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j2 + " for Animator " + animatorSet + " on operation " + specialEffectsController$FragmentStateManagerOperation);
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, j2);
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onStart(final ViewGroup viewGroup) {
            final AnimatorEffect animatorEffect;
            viewGroup.getClass();
            AnimationInfo animationInfo = this.animatorInfo;
            if (animationInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = viewGroup.getContext();
            context.getClass();
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = animationInfo.f866operation;
            Fragment fragment = specialEffectsController$FragmentStateManagerOperation.fragment;
            final boolean z = specialEffectsController$FragmentStateManagerOperation.finalState == 3;
            final View view = fragment.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        animator.getClass();
                        ViewGroup viewGroup2 = viewGroup;
                        View view2 = view;
                        viewGroup2.endViewTransition(view2);
                        boolean z2 = z;
                        SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = specialEffectsController$FragmentStateManagerOperation;
                        if (z2 || specialEffectsController$FragmentStateManagerOperation2.finalState == 3) {
                            int i = specialEffectsController$FragmentStateManagerOperation2.finalState;
                            view2.getClass();
                            Fragment$5$$ExternalSyntheticOutline0._applyState(i, view2, viewGroup2);
                        }
                        DefaultSpecialEffectsController.AnimatorEffect animatorEffect2 = animatorEffect;
                        animatorEffect2.animatorInfo.f866operation.completeEffect(animatorEffect2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Animator from operation " + specialEffectsController$FragmentStateManagerOperation2 + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    public final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        public final long totalDuration(AnimatorSet animatorSet) {
            animatorSet.getClass();
            return animatorSet.getTotalDuration();
        }
    }

    public final class Api26Impl {
        public static final Api26Impl INSTANCE = new Api26Impl();

        public final void reverse(AnimatorSet animatorSet) {
            animatorSet.getClass();
            animatorSet.reverse();
        }

        public final void setCurrentPlayTime(AnimatorSet animatorSet, long j) {
            animatorSet.getClass();
            animatorSet.setCurrentPlayTime(j);
        }
    }

    public abstract class SpecialEffectsInfo {

        /* renamed from: operation, reason: collision with root package name */
        public final SpecialEffectsController$FragmentStateManagerOperation f866operation;

        public SpecialEffectsInfo(SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation) {
            specialEffectsController$FragmentStateManagerOperation.getClass();
            this.f866operation = specialEffectsController$FragmentStateManagerOperation;
        }

        public final boolean isVisibilityUnchanged() {
            int i;
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = this.f866operation;
            View view = specialEffectsController$FragmentStateManagerOperation.fragment.mView;
            if (view != null) {
                i = 4;
                if (view.getAlpha() != RecyclerView.DECELERATION_RATE || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        i = 2;
                    } else if (visibility != 4) {
                        if (visibility != 8) {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(visibility, "Unknown visibility "));
                            return false;
                        }
                        i = 3;
                    }
                }
            } else {
                i = 0;
            }
            int i2 = specialEffectsController$FragmentStateManagerOperation.finalState;
            if (i != i2) {
                return (i == 2 || i2 == 2) ? false : true;
            }
            return true;
        }
    }

    public final class TransitionEffect extends SpecialEffectsController$Effect {
        public Object controller;
        public final ArrayList enteringNames;
        public final ArrayList exitingNames;
        public final SpecialEffectsController$FragmentStateManagerOperation firstOut;
        public final ArrayMap firstOutViews;
        public final boolean isPop;
        public final SpecialEffectsController$FragmentStateManagerOperation lastIn;
        public final ArrayMap lastInViews;
        public boolean noControllerReturned;
        public final ArrayList sharedElementFirstOutViews;
        public final ArrayList sharedElementLastInViews;
        public final ArrayMap sharedElementNameMapping;
        public final Object sharedElementTransition;
        public final FragmentTransitionImpl transitionImpl;
        public final ArrayList transitionInfos;
        public final CancellationSignal transitionSignal;

        public TransitionEffect(ArrayList arrayList, SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation, SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2, FragmentTransitionImpl fragmentTransitionImpl, Object obj, ArrayList arrayList2, ArrayList arrayList3, ArrayMap arrayMap, ArrayList arrayList4, ArrayList arrayList5, ArrayMap arrayMap2, ArrayMap arrayMap3, boolean z) {
            arrayList4.getClass();
            this.transitionInfos = arrayList;
            this.firstOut = specialEffectsController$FragmentStateManagerOperation;
            this.lastIn = specialEffectsController$FragmentStateManagerOperation2;
            this.transitionImpl = fragmentTransitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = arrayList2;
            this.sharedElementLastInViews = arrayList3;
            this.sharedElementNameMapping = arrayMap;
            this.enteringNames = arrayList4;
            this.exitingNames = arrayList5;
            this.firstOutViews = arrayMap2;
            this.lastInViews = arrayMap3;
            this.isPop = z;
            this.transitionSignal = new CancellationSignal();
        }

        public static void captureTransitioningViews(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int i = ViewGroupCompat.$r8$clinit;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    captureTransitioningViews(childAt, arrayList);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0210 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01fc A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair createMergedTransition(ViewGroup viewGroup, SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation, SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Object obj;
            FragmentTransitionImpl fragmentTransitionImpl;
            Object obj2;
            ArrayList arrayList3;
            int i;
            ArrayList arrayList4;
            Iterator it;
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation3 = specialEffectsController$FragmentStateManagerOperation;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList5 = this.transitionInfos;
            Iterator it2 = arrayList5.iterator();
            View view2 = null;
            boolean z = false;
            while (true) {
                boolean hasNext = it2.hasNext();
                arrayList = this.sharedElementLastInViews;
                arrayList2 = this.sharedElementFirstOutViews;
                obj = this.sharedElementTransition;
                fragmentTransitionImpl = this.transitionImpl;
                if (!hasNext) {
                    break;
                }
                if (((TransitionInfo) it2.next()).sharedElementTransition == null || specialEffectsController$FragmentStateManagerOperation2 == null || specialEffectsController$FragmentStateManagerOperation3 == null || this.sharedElementNameMapping.isEmpty() || obj == null) {
                    arrayList4 = arrayList5;
                    it = it2;
                } else {
                    Fragment fragment = specialEffectsController$FragmentStateManagerOperation3.fragment;
                    Fragment fragment2 = specialEffectsController$FragmentStateManagerOperation2.fragment;
                    arrayList4 = arrayList5;
                    boolean z2 = this.isPop;
                    it = it2;
                    ArrayMap arrayMap = this.firstOutViews;
                    FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z2, arrayMap);
                    OneShotPreDrawListener.add(viewGroup, new AFd1wSDK$$ExternalSyntheticLambda2(22, specialEffectsController$FragmentStateManagerOperation3, specialEffectsController$FragmentStateManagerOperation2, this));
                    arrayList2.addAll(arrayMap.values());
                    ArrayList arrayList6 = this.exitingNames;
                    if (!arrayList6.isEmpty()) {
                        Object obj3 = arrayList6.get(0);
                        obj3.getClass();
                        View view3 = (View) arrayMap.get((String) obj3);
                        fragmentTransitionImpl.setEpicenter(view3, obj);
                        view2 = view3;
                    }
                    ArrayMap arrayMap2 = this.lastInViews;
                    arrayList.addAll(arrayMap2.values());
                    ArrayList arrayList7 = this.enteringNames;
                    if (!arrayList7.isEmpty()) {
                        Object obj4 = arrayList7.get(0);
                        obj4.getClass();
                        View view4 = (View) arrayMap2.get((String) obj4);
                        if (view4 != null) {
                            OneShotPreDrawListener.add(viewGroup, new DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4(fragmentTransitionImpl, view4, rect));
                            z = true;
                        }
                    }
                    fragmentTransitionImpl.setSharedElementTargets(obj, view, arrayList2);
                    Object obj5 = this.sharedElementTransition;
                    fragmentTransitionImpl.scheduleRemoveTargets(obj5, null, null, obj5, arrayList);
                }
                arrayList5 = arrayList4;
                it2 = it;
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList;
            ArrayList arrayList10 = new ArrayList();
            Iterator it3 = arrayList8.iterator();
            Object obj6 = null;
            Object obj7 = null;
            while (true) {
                ArrayList arrayList11 = arrayList9;
                if (!it3.hasNext()) {
                    break;
                }
                TransitionInfo transitionInfo = (TransitionInfo) it3.next();
                Iterator it4 = it3;
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation4 = transitionInfo.f866operation;
                boolean z3 = z;
                Object cloneTransition = fragmentTransitionImpl.cloneTransition(transitionInfo.transition);
                if (cloneTransition != null) {
                    ArrayList arrayList12 = arrayList2;
                    ArrayList arrayList13 = new ArrayList();
                    Object obj8 = obj;
                    Fragment fragment3 = specialEffectsController$FragmentStateManagerOperation4.fragment;
                    Object obj9 = obj7;
                    View view5 = fragment3.mView;
                    view5.getClass();
                    captureTransitioningViews(view5, arrayList13);
                    if (obj8 != null && (specialEffectsController$FragmentStateManagerOperation4 == specialEffectsController$FragmentStateManagerOperation2 || specialEffectsController$FragmentStateManagerOperation4 == specialEffectsController$FragmentStateManagerOperation3)) {
                        if (specialEffectsController$FragmentStateManagerOperation4 == specialEffectsController$FragmentStateManagerOperation2) {
                            arrayList13.removeAll(CollectionsKt.toSet(arrayList12));
                        } else {
                            arrayList13.removeAll(CollectionsKt.toSet(arrayList11));
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        fragmentTransitionImpl.addTarget(view, cloneTransition);
                        obj2 = cloneTransition;
                        arrayList3 = arrayList13;
                    } else {
                        fragmentTransitionImpl.addTargets(cloneTransition, arrayList13);
                        fragmentTransitionImpl.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList13, null, null);
                        obj2 = cloneTransition;
                        arrayList3 = arrayList13;
                        if (specialEffectsController$FragmentStateManagerOperation4.finalState == 3) {
                            specialEffectsController$FragmentStateManagerOperation4.isAwaitingContainerChanges = false;
                            ArrayList arrayList14 = new ArrayList(arrayList3);
                            arrayList14.remove(fragment3.mView);
                            fragmentTransitionImpl.scheduleHideFragmentView(obj2, fragment3.mView, arrayList14);
                            i = 2;
                            OneShotPreDrawListener.add(viewGroup, new Fragment$$ExternalSyntheticLambda1(arrayList3, i));
                            if (specialEffectsController$FragmentStateManagerOperation4.finalState != i) {
                                arrayList10.addAll(arrayList3);
                                if (z3) {
                                    fragmentTransitionImpl.setEpicenter(obj2, rect);
                                }
                                if (FragmentManager.isLoggingEnabled(i)) {
                                    Log.v("FragmentManager", "Entering Transition: " + obj2);
                                    Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                                    Iterator it5 = arrayList3.iterator();
                                    while (it5.hasNext()) {
                                        Object next = it5.next();
                                        next.getClass();
                                        Log.v("FragmentManager", "View: " + ((View) next));
                                    }
                                }
                            } else {
                                fragmentTransitionImpl.setEpicenter(view2, obj2);
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "Exiting Transition: " + obj2);
                                    Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                                    Iterator it6 = arrayList3.iterator();
                                    while (it6.hasNext()) {
                                        Object next2 = it6.next();
                                        next2.getClass();
                                        Log.v("FragmentManager", "View: " + ((View) next2));
                                    }
                                }
                            }
                            if (transitionInfo.isOverlapAllowed) {
                                obj7 = fragmentTransitionImpl.mergeTransitionsTogether(obj9, obj2);
                                specialEffectsController$FragmentStateManagerOperation3 = specialEffectsController$FragmentStateManagerOperation;
                                arrayList9 = arrayList11;
                                it3 = it4;
                                z = z3;
                                arrayList2 = arrayList12;
                                obj = obj8;
                            } else {
                                obj6 = fragmentTransitionImpl.mergeTransitionsTogether(obj6, obj2);
                                specialEffectsController$FragmentStateManagerOperation3 = specialEffectsController$FragmentStateManagerOperation;
                                arrayList9 = arrayList11;
                                it3 = it4;
                                z = z3;
                                arrayList2 = arrayList12;
                                obj = obj8;
                                obj7 = obj9;
                            }
                        }
                    }
                    i = 2;
                    if (specialEffectsController$FragmentStateManagerOperation4.finalState != i) {
                    }
                    if (transitionInfo.isOverlapAllowed) {
                    }
                } else {
                    arrayList9 = arrayList11;
                    it3 = it4;
                    z = z3;
                    specialEffectsController$FragmentStateManagerOperation3 = specialEffectsController$FragmentStateManagerOperation;
                }
            }
            Object mergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(obj6, obj7, obj);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Final merged transition: " + mergeTransitionsInSequence + " for container " + viewGroup);
            }
            return new Pair(arrayList10, mergeTransitionsInSequence);
        }

        public final boolean getTransitioning() {
            ArrayList arrayList = this.transitionInfos;
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).f866operation.fragment.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final boolean isSeekingSupported() {
            Object obj;
            FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
            if (!fragmentTransitionImpl.isSeekingSupported()) {
                return false;
            }
            ArrayList<TransitionInfo> arrayList = this.transitionInfos;
            if (!arrayList.isEmpty()) {
                for (TransitionInfo transitionInfo : arrayList) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = transitionInfo.transition) == null || !fragmentTransitionImpl.isSeekingSupported(obj)) {
                        return false;
                    }
                }
            }
            Object obj2 = this.sharedElementTransition;
            return obj2 == null || fragmentTransitionImpl.isSeekingSupported(obj2);
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onCancel(ViewGroup viewGroup) {
            viewGroup.getClass();
            this.transitionSignal.cancel();
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onCommit(ViewGroup viewGroup) {
            viewGroup.getClass();
            boolean isLaidOut = viewGroup.isLaidOut();
            ArrayList<TransitionInfo> arrayList = this.transitionInfos;
            if (!isLaidOut || this.noControllerReturned) {
                for (TransitionInfo transitionInfo : arrayList) {
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = transitionInfo.f866operation;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (this.noControllerReturned) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + specialEffectsController$FragmentStateManagerOperation);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + specialEffectsController$FragmentStateManagerOperation);
                        }
                    }
                    transitionInfo.f866operation.completeEffect(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = this.lastIn;
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation3 = this.firstOut;
            if (obj != null) {
                fragmentTransitionImpl.animateToEnd(obj);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + specialEffectsController$FragmentStateManagerOperation3 + " to " + specialEffectsController$FragmentStateManagerOperation2);
                    return;
                }
                return;
            }
            Pair createMergedTransition = createMergedTransition(viewGroup, specialEffectsController$FragmentStateManagerOperation2, specialEffectsController$FragmentStateManagerOperation3);
            ArrayList arrayList2 = (ArrayList) createMergedTransition.first;
            Object obj2 = createMergedTransition.second;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((TransitionInfo) it.next()).f866operation);
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation4 = (SpecialEffectsController$FragmentStateManagerOperation) it2.next();
                fragmentTransitionImpl.setListenerForTransitionEnd(specialEffectsController$FragmentStateManagerOperation4.fragment, obj2, this.transitionSignal, new DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1(specialEffectsController$FragmentStateManagerOperation4, this, 1));
            }
            runTransition(arrayList2, viewGroup, new DefaultSpecialEffectsController$TransitionEffect$onCommit$4(this, viewGroup, obj2));
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + specialEffectsController$FragmentStateManagerOperation3 + " to " + specialEffectsController$FragmentStateManagerOperation2);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onProgress(BackEventCompat backEventCompat, ViewGroup viewGroup) {
            backEventCompat.getClass();
            viewGroup.getClass();
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.setCurrentPlayTime(obj, backEventCompat.progress);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController$Effect
        public final void onStart(ViewGroup viewGroup) {
            Object obj;
            viewGroup.getClass();
            boolean isLaidOut = viewGroup.isLaidOut();
            ArrayList arrayList = this.transitionInfos;
            if (!isLaidOut) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = ((TransitionInfo) it.next()).f866operation;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + specialEffectsController$FragmentStateManagerOperation);
                    }
                }
                return;
            }
            boolean transitioning = getTransitioning();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = this.lastIn;
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation3 = this.firstOut;
            if (transitioning && (obj = this.sharedElementTransition) != null && !isSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + specialEffectsController$FragmentStateManagerOperation3 + " and " + specialEffectsController$FragmentStateManagerOperation2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (isSeekingSupported() && getTransitioning()) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Pair createMergedTransition = createMergedTransition(viewGroup, specialEffectsController$FragmentStateManagerOperation2, specialEffectsController$FragmentStateManagerOperation3);
                ArrayList arrayList2 = (ArrayList) createMergedTransition.first;
                Object obj2 = createMergedTransition.second;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((TransitionInfo) it2.next()).f866operation);
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation4 = (SpecialEffectsController$FragmentStateManagerOperation) it3.next();
                    Fragment$$ExternalSyntheticLambda1 fragment$$ExternalSyntheticLambda1 = new Fragment$$ExternalSyntheticLambda1(ref$ObjectRef, 1);
                    Fragment fragment = specialEffectsController$FragmentStateManagerOperation4.fragment;
                    this.transitionImpl.setListenerForTransitionEnd(obj2, this.transitionSignal, fragment$$ExternalSyntheticLambda1, new DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1(specialEffectsController$FragmentStateManagerOperation4, this, 0));
                }
                runTransition(arrayList2, viewGroup, new AndroidPopup_androidKt$Popup$3$1(this, viewGroup, obj2, ref$ObjectRef, 2));
            }
        }

        public final void runTransition(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
            FragmentTransition.setViewVisibility(4, arrayList);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.sharedElementLastInViews;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList3.get(i);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                arrayList2.add(view.getTransitionName());
                view.setTransitionName(null);
            }
            boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(2);
            ArrayList arrayList4 = this.sharedElementFirstOutViews;
            if (isLoggingEnabled) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    View view2 = (View) next;
                    StringBuilder sb = new StringBuilder("View: ");
                    sb.append(view2);
                    sb.append(" Name: ");
                    WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                    sb.append(view2.getTransitionName());
                    Log.v("FragmentManager", sb.toString());
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    next2.getClass();
                    View view3 = (View) next2;
                    StringBuilder sb2 = new StringBuilder("View: ");
                    sb2.append(view3);
                    sb2.append(" Name: ");
                    WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
                    sb2.append(view3.getTransitionName());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
            function0.invoke();
            int size2 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            for (int i2 = 0; i2 < size2; i2++) {
                View view4 = (View) arrayList4.get(i2);
                WeakHashMap weakHashMap4 = ViewCompat.sViewPropertyAnimatorMap;
                String transitionName = view4.getTransitionName();
                arrayList5.add(transitionName);
                if (transitionName != null) {
                    view4.setTransitionName(null);
                    String str = (String) this.sharedElementNameMapping.get(transitionName);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        if (str.equals(arrayList2.get(i3))) {
                            ((View) arrayList3.get(i3)).setTransitionName(transitionName);
                            break;
                        }
                        i3++;
                    }
                }
            }
            OneShotPreDrawListener.add(viewGroup, new FragmentTransitionImpl.AnonymousClass1(size2, arrayList3, arrayList2, arrayList4, arrayList5));
            FragmentTransition.setViewVisibility(0, arrayList);
            this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, arrayList4, arrayList3);
        }
    }

    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.container = viewGroup;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    public static void findNamedViews(ArrayMap arrayMap, View view) {
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            arrayMap.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(arrayMap, childAt);
                }
            }
        }
    }

    public static final DefaultSpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
        viewGroup.getClass();
        fragmentManager.getClass();
        zzf specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
        specialEffectsControllerFactory.getClass();
        return SpecialEffectsController$Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }

    public static boolean isOperationSeekable(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) it.next();
                if (!specialEffectsController$FragmentStateManagerOperation.effects.isEmpty()) {
                    ArrayList arrayList2 = specialEffectsController$FragmentStateManagerOperation.effects;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((SpecialEffectsController$Effect) it2.next()).isSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((SpecialEffectsController$FragmentStateManagerOperation) it3.next()).effects, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void applyContainerChangesToOperation$fragment_release(SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation) {
        specialEffectsController$FragmentStateManagerOperation.getClass();
        if (specialEffectsController$FragmentStateManagerOperation.isAwaitingContainerChanges) {
            int i = specialEffectsController$FragmentStateManagerOperation.finalState;
            View requireView = specialEffectsController$FragmentStateManagerOperation.fragment.requireView();
            requireView.getClass();
            Fragment$5$$ExternalSyntheticOutline0._applyState(i, requireView, this.container);
            specialEffectsController$FragmentStateManagerOperation.isAwaitingContainerChanges = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04f9 A[LOOP:7: B:90:0x04f3->B:92:0x04f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0516  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void collectEffects(ArrayList arrayList, boolean z) {
        Object obj;
        SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation;
        boolean z2;
        ArrayList arrayList2;
        int i;
        String str;
        boolean z3;
        ArrayList arrayList3;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z4;
        int i2;
        String findKeyForValue;
        Iterator it;
        Iterator it2;
        Iterator it3;
        int i3 = 2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = (SpecialEffectsController$FragmentStateManagerOperation) obj;
            View view = specialEffectsController$FragmentStateManagerOperation2.fragment.mView;
            view.getClass();
            if (view.getAlpha() != RecyclerView.DECELERATION_RATE || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    if (specialEffectsController$FragmentStateManagerOperation2.finalState != 2) {
                        break;
                    }
                } else if (visibility != 4 && visibility != 8) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(visibility, "Unknown visibility "));
                    return;
                }
            }
        }
        SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation3 = (SpecialEffectsController$FragmentStateManagerOperation) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                specialEffectsController$FragmentStateManagerOperation = 0;
                break;
            }
            specialEffectsController$FragmentStateManagerOperation = listIterator.previous();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation4 = (SpecialEffectsController$FragmentStateManagerOperation) specialEffectsController$FragmentStateManagerOperation;
            View view2 = specialEffectsController$FragmentStateManagerOperation4.fragment.mView;
            view2.getClass();
            if (view2.getAlpha() != RecyclerView.DECELERATION_RATE || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(visibility2, "Unknown visibility "));
                    return;
                }
            }
            if (specialEffectsController$FragmentStateManagerOperation4.finalState == 2) {
                break;
            }
        }
        SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation5 = specialEffectsController$FragmentStateManagerOperation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Executing operations from " + specialEffectsController$FragmentStateManagerOperation3 + " to " + specialEffectsController$FragmentStateManagerOperation5);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Fragment fragment = ((SpecialEffectsController$FragmentStateManagerOperation) CollectionsKt.last((List) arrayList)).fragment;
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            Fragment.AnimationInfo animationInfo = ((SpecialEffectsController$FragmentStateManagerOperation) it5.next()).fragment.mAnimationInfo;
            Fragment.AnimationInfo animationInfo2 = fragment.mAnimationInfo;
            animationInfo.mEnterAnim = animationInfo2.mEnterAnim;
            animationInfo.mExitAnim = animationInfo2.mExitAnim;
            animationInfo.mPopEnterAnim = animationInfo2.mPopEnterAnim;
            animationInfo.mPopExitAnim = animationInfo2.mPopExitAnim;
        }
        Iterator it6 = arrayList.iterator();
        while (true) {
            z2 = false;
            int i4 = 1;
            if (!it6.hasNext()) {
                break;
            }
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation6 = (SpecialEffectsController$FragmentStateManagerOperation) it6.next();
            arrayList6.add(new AnimationInfo(specialEffectsController$FragmentStateManagerOperation6, z));
            if (z) {
                if (specialEffectsController$FragmentStateManagerOperation6 != specialEffectsController$FragmentStateManagerOperation3) {
                    arrayList7.add(new TransitionInfo(specialEffectsController$FragmentStateManagerOperation6, z, z2));
                    specialEffectsController$FragmentStateManagerOperation6.completionListeners.add(new SpecialEffectsController$$ExternalSyntheticLambda0(this, specialEffectsController$FragmentStateManagerOperation6, i4));
                }
                z2 = true;
                arrayList7.add(new TransitionInfo(specialEffectsController$FragmentStateManagerOperation6, z, z2));
                specialEffectsController$FragmentStateManagerOperation6.completionListeners.add(new SpecialEffectsController$$ExternalSyntheticLambda0(this, specialEffectsController$FragmentStateManagerOperation6, i4));
            } else {
                if (specialEffectsController$FragmentStateManagerOperation6 != specialEffectsController$FragmentStateManagerOperation5) {
                    arrayList7.add(new TransitionInfo(specialEffectsController$FragmentStateManagerOperation6, z, z2));
                    specialEffectsController$FragmentStateManagerOperation6.completionListeners.add(new SpecialEffectsController$$ExternalSyntheticLambda0(this, specialEffectsController$FragmentStateManagerOperation6, i4));
                }
                z2 = true;
                arrayList7.add(new TransitionInfo(specialEffectsController$FragmentStateManagerOperation6, z, z2));
                specialEffectsController$FragmentStateManagerOperation6.completionListeners.add(new SpecialEffectsController$$ExternalSyntheticLambda0(this, specialEffectsController$FragmentStateManagerOperation6, i4));
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            Object next = it7.next();
            if (!((TransitionInfo) next).isVisibilityUnchanged()) {
                arrayList8.add(next);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it8 = arrayList8.iterator();
        while (it8.hasNext()) {
            Object next2 = it8.next();
            if (((TransitionInfo) next2).getHandlingImpl() != null) {
                arrayList9.add(next2);
            }
        }
        Iterator it9 = arrayList9.iterator();
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        while (it9.hasNext()) {
            TransitionInfo transitionInfo = (TransitionInfo) it9.next();
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(transitionInfo.f866operation.fragment);
                sb.append(" returned Transition ");
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline1.m(sb, transitionInfo.transition, " which uses a different Transition type than other Fragments."));
                return;
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 != null) {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            ArrayMap arrayMap = new ArrayMap(0);
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayMap arrayMap2 = new ArrayMap(0);
            ArrayList<String> arrayList14 = arrayList12;
            ArrayMap arrayMap3 = new ArrayMap(0);
            Iterator it10 = arrayList9.iterator();
            Object obj2 = null;
            while (it10.hasNext()) {
                Object obj3 = ((TransitionInfo) it10.next()).sharedElementTransition;
                if (obj3 == null || specialEffectsController$FragmentStateManagerOperation3 == null) {
                    arrayList3 = arrayList6;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    arrayList4 = arrayList10;
                    arrayList5 = arrayList11;
                    z4 = z2;
                    i2 = i3;
                } else {
                    i2 = i3;
                    Fragment fragment2 = specialEffectsController$FragmentStateManagerOperation3.fragment;
                    if (specialEffectsController$FragmentStateManagerOperation5 != null) {
                        Fragment fragment3 = specialEffectsController$FragmentStateManagerOperation5.fragment;
                        Object wrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(obj3));
                        ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                        sharedElementSourceNames.getClass();
                        ArrayList arrayList15 = arrayList6;
                        ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                        sharedElementSourceNames2.getClass();
                        FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                        ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        sharedElementTargetNames.getClass();
                        ArrayList arrayList16 = arrayList10;
                        int size = sharedElementTargetNames.size();
                        ArrayList arrayList17 = arrayList11;
                        int i5 = 0;
                        while (i5 < size) {
                            int i6 = size;
                            int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i5));
                            if (indexOf != -1) {
                                sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i5));
                            }
                            i5++;
                            size = i6;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                        sharedElementTargetNames2.getClass();
                        Pair pair = !z ? new Pair(fragment2.getExitTransitionCallback(), fragment3.getEnterTransitionCallback()) : new Pair(fragment2.getEnterTransitionCallback(), fragment3.getExitTransitionCallback());
                        SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.first;
                        SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.second;
                        int size2 = sharedElementSourceNames.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            String str2 = sharedElementSourceNames.get(i7);
                            str2.getClass();
                            SharedElementCallback sharedElementCallback3 = sharedElementCallback;
                            String str3 = str2;
                            String str4 = sharedElementTargetNames2.get(i7);
                            str4.getClass();
                            arrayMap.put(str3, str4);
                            i7++;
                            sharedElementCallback = sharedElementCallback3;
                            sharedElementCallback2 = sharedElementCallback2;
                        }
                        SharedElementCallback sharedElementCallback4 = sharedElementCallback;
                        SharedElementCallback sharedElementCallback5 = sharedElementCallback2;
                        if (FragmentManager.isLoggingEnabled(i2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            Iterator<String> it11 = sharedElementTargetNames2.iterator();
                            while (it11.hasNext()) {
                                Log.v("FragmentManager", "Name: " + it11.next());
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            Iterator<String> it12 = sharedElementSourceNames.iterator();
                            while (it12.hasNext()) {
                                Log.v("FragmentManager", "Name: " + it12.next());
                            }
                        }
                        View view3 = fragment2.mView;
                        view3.getClass();
                        findNamedViews(arrayMap2, view3);
                        arrayMap2.retainAll(sharedElementSourceNames);
                        if (sharedElementCallback4 != null) {
                            if (FragmentManager.isLoggingEnabled(i2)) {
                                Log.v("FragmentManager", "Executing exit callback for operation " + specialEffectsController$FragmentStateManagerOperation3);
                            }
                            int size3 = sharedElementSourceNames.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i8 = size3 - 1;
                                    String str5 = sharedElementSourceNames.get(size3);
                                    str5.getClass();
                                    String str6 = str5;
                                    View view4 = (View) arrayMap2.get(str6);
                                    if (view4 == null) {
                                        arrayMap.remove(str6);
                                    } else {
                                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                        if (!str6.equals(view4.getTransitionName())) {
                                            arrayMap.put(view4.getTransitionName(), (String) arrayMap.remove(str6));
                                        }
                                    }
                                    if (i8 < 0) {
                                        break;
                                    } else {
                                        size3 = i8;
                                    }
                                }
                            }
                        } else {
                            arrayMap.retainAll(arrayMap2.keySet());
                        }
                        View view5 = fragment3.mView;
                        view5.getClass();
                        findNamedViews(arrayMap3, view5);
                        arrayMap3.retainAll(sharedElementTargetNames2);
                        arrayMap3.retainAll(arrayMap.values());
                        if (sharedElementCallback5 != null) {
                            if (FragmentManager.isLoggingEnabled(i2)) {
                                Log.v("FragmentManager", "Executing enter callback for operation " + specialEffectsController$FragmentStateManagerOperation5);
                            }
                            int size4 = sharedElementTargetNames2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i9 = size4 - 1;
                                    String str7 = sharedElementTargetNames2.get(size4);
                                    str7.getClass();
                                    String str8 = str7;
                                    View view6 = (View) arrayMap3.get(str8);
                                    if (view6 == null) {
                                        String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str8);
                                        if (findKeyForValue2 != null) {
                                            arrayMap.remove(findKeyForValue2);
                                        }
                                    } else {
                                        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                                        if (!str8.equals(view6.getTransitionName()) && (findKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str8)) != null) {
                                            arrayMap.put(findKeyForValue, view6.getTransitionName());
                                        }
                                    }
                                    if (i9 < 0) {
                                        break;
                                    } else {
                                        size4 = i9;
                                    }
                                }
                            }
                        } else {
                            FragmentTransitionCompat21 fragmentTransitionCompat21 = FragmentTransition.PLATFORM_IMPL;
                            for (int i10 = arrayMap.size - 1; -1 < i10; i10--) {
                                if (!arrayMap3.containsKey((String) arrayMap.valueAt(i10))) {
                                    arrayMap.removeAt(i10);
                                }
                            }
                        }
                        int i11 = 20;
                        CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(arrayMap2.entrySet(), new BoundsAnimation$animate$1(arrayMap.keySet(), i11), false);
                        CollectionsKt__MutableCollectionsKt.filterInPlace$CollectionsKt__MutableCollectionsKt(arrayMap3.entrySet(), new BoundsAnimation$animate$1(arrayMap.values(), i11), false);
                        if (arrayMap.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + wrapTransitionInSet + " between " + specialEffectsController$FragmentStateManagerOperation3 + " and " + specialEffectsController$FragmentStateManagerOperation5 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList16.clear();
                            arrayList17.clear();
                            arrayList14 = sharedElementTargetNames2;
                            arrayList13 = sharedElementSourceNames;
                            i3 = i2;
                            arrayList6 = arrayList15;
                            arrayList10 = arrayList16;
                            arrayList11 = arrayList17;
                            obj2 = null;
                        } else {
                            arrayList14 = sharedElementTargetNames2;
                            arrayList13 = sharedElementSourceNames;
                            obj2 = wrapTransitionInSet;
                            i3 = i2;
                            arrayList6 = arrayList15;
                            arrayList10 = arrayList16;
                            arrayList11 = arrayList17;
                        }
                        z2 = false;
                        fragmentTransitionImpl2 = fragmentTransitionImpl3;
                    } else {
                        arrayList3 = arrayList6;
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList11;
                        z4 = z2;
                    }
                }
                z2 = z4;
                i3 = i2;
                arrayList6 = arrayList3;
                fragmentTransitionImpl2 = fragmentTransitionImpl;
                arrayList10 = arrayList4;
                arrayList11 = arrayList5;
            }
            arrayList2 = arrayList6;
            FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
            ArrayList arrayList18 = arrayList10;
            ArrayList arrayList19 = arrayList11;
            i = i3;
            if (obj2 == null) {
                if (!arrayList9.isEmpty()) {
                    Iterator it13 = arrayList9.iterator();
                    while (it13.hasNext()) {
                        if (((TransitionInfo) it13.next()).transition == null) {
                        }
                    }
                }
                z3 = true;
            }
            str = "FragmentManager";
            ArrayList<String> arrayList20 = arrayList13;
            z3 = true;
            TransitionEffect transitionEffect = new TransitionEffect(arrayList9, specialEffectsController$FragmentStateManagerOperation3, specialEffectsController$FragmentStateManagerOperation5, fragmentTransitionImpl4, obj2, arrayList18, arrayList19, arrayMap, arrayList14, arrayList20, arrayMap2, arrayMap3, z);
            Iterator it14 = arrayList9.iterator();
            while (it14.hasNext()) {
                ((TransitionInfo) it14.next()).f866operation._effects.add(transitionEffect);
            }
            ArrayList arrayList21 = new ArrayList();
            ArrayList arrayList22 = new ArrayList();
            it = arrayList2.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(((AnimationInfo) it.next()).f866operation.effects, arrayList22);
            }
            boolean isEmpty = arrayList22.isEmpty();
            it2 = arrayList2.iterator();
            boolean z5 = false;
            while (it2.hasNext()) {
                AnimationInfo animationInfo3 = (AnimationInfo) it2.next();
                Context context = this.container.getContext();
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation7 = animationInfo3.f866operation;
                context.getClass();
                FragmentAnim.AnimationOrAnimator animation = animationInfo3.getAnimation(context);
                if (animation != null) {
                    if (animation.animator == null) {
                        arrayList21.add(animationInfo3);
                    } else {
                        Fragment fragment4 = specialEffectsController$FragmentStateManagerOperation7.fragment;
                        if (specialEffectsController$FragmentStateManagerOperation7.effects.isEmpty()) {
                            if (specialEffectsController$FragmentStateManagerOperation7.finalState == 3) {
                                specialEffectsController$FragmentStateManagerOperation7.isAwaitingContainerChanges = false;
                            }
                            specialEffectsController$FragmentStateManagerOperation7._effects.add(new AnimatorEffect(animationInfo3));
                            z5 = z3;
                        } else if (FragmentManager.isLoggingEnabled(i)) {
                            Log.v(str, "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                        }
                    }
                }
            }
            it3 = arrayList21.iterator();
            while (it3.hasNext()) {
                AnimationInfo animationInfo4 = (AnimationInfo) it3.next();
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation8 = animationInfo4.f866operation;
                Fragment fragment5 = specialEffectsController$FragmentStateManagerOperation8.fragment;
                if (isEmpty) {
                    if (!z5) {
                        specialEffectsController$FragmentStateManagerOperation8._effects.add(new AnimationEffect(animationInfo4));
                    } else if (FragmentManager.isLoggingEnabled(i)) {
                        Log.v(str, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                    }
                } else if (FragmentManager.isLoggingEnabled(i)) {
                    Log.v(str, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
                }
            }
        }
        arrayList2 = arrayList6;
        z3 = true;
        i = 2;
        str = "FragmentManager";
        ArrayList arrayList212 = new ArrayList();
        ArrayList arrayList222 = new ArrayList();
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        boolean isEmpty2 = arrayList222.isEmpty();
        it2 = arrayList2.iterator();
        boolean z52 = false;
        while (it2.hasNext()) {
        }
        it3 = arrayList212.iterator();
        while (it3.hasNext()) {
        }
    }

    public final void commitEffects$fragment_release(ArrayList arrayList) {
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((SpecialEffectsController$FragmentStateManagerOperation) it.next()).effects, arrayList2);
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((SpecialEffectsController$Effect) list.get(i)).onCommit(this.container);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            applyContainerChangesToOperation$fragment_release((SpecialEffectsController$FragmentStateManagerOperation) arrayList.get(i2));
        }
        List list2 = CollectionsKt.toList(arrayList);
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) list2.get(i3);
            if (specialEffectsController$FragmentStateManagerOperation.effects.isEmpty()) {
                specialEffectsController$FragmentStateManagerOperation.complete$fragment_release();
            }
        }
    }

    public final void completeBack() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        ArrayList arrayList = this.runningOperations;
        processStart(arrayList);
        commitEffects$fragment_release(arrayList);
    }

    public final void enqueue(int i, int i2, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                Fragment fragment = fragmentStateManager.mFragment;
                fragment.getClass();
                SpecialEffectsController$FragmentStateManagerOperation findPendingOperation = findPendingOperation(fragment);
                if (findPendingOperation == null) {
                    Fragment fragment2 = fragmentStateManager.mFragment;
                    if (!fragment2.mTransitioning && !fragment2.mRemoving) {
                        findPendingOperation = null;
                    }
                    findPendingOperation = findRunningOperation(fragment2);
                }
                if (findPendingOperation != null) {
                    findPendingOperation.mergeWith(i, i2);
                    return;
                }
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = new SpecialEffectsController$FragmentStateManagerOperation(i, i2, fragmentStateManager);
                this.pendingOperations.add(specialEffectsController$FragmentStateManagerOperation);
                specialEffectsController$FragmentStateManagerOperation.completionListeners.add(new SpecialEffectsController$$ExternalSyntheticLambda0(this, specialEffectsController$FragmentStateManagerOperation, 0));
                specialEffectsController$FragmentStateManagerOperation.completionListeners.add(new SpecialEffectsController$$ExternalSyntheticLambda0(this, specialEffectsController$FragmentStateManagerOperation, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void executePendingOperations() {
        boolean z;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                ArrayList mutableList = CollectionsKt.toMutableList((Collection) this.runningOperations);
                this.runningOperations.clear();
                Iterator it = mutableList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) it.next();
                    if (this.pendingOperations.isEmpty() || !specialEffectsController$FragmentStateManagerOperation.fragment.mTransitioning) {
                        z = false;
                    }
                    specialEffectsController$FragmentStateManagerOperation.isSeeking = z;
                }
                Iterator it2 = mutableList.iterator();
                while (it2.hasNext()) {
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = (SpecialEffectsController$FragmentStateManagerOperation) it2.next();
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + specialEffectsController$FragmentStateManagerOperation2);
                        }
                        specialEffectsController$FragmentStateManagerOperation2.complete$fragment_release();
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + specialEffectsController$FragmentStateManagerOperation2);
                        }
                        specialEffectsController$FragmentStateManagerOperation2.cancel(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!specialEffectsController$FragmentStateManagerOperation2.isComplete) {
                        this.runningOperations.add(specialEffectsController$FragmentStateManagerOperation2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    updateFinalState();
                    ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) this.pendingOperations);
                    if (mutableList2.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(mutableList2);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    collectEffects(mutableList2, this.operationDirectionIsPop);
                    boolean isOperationSeekable = isOperationSeekable(mutableList2);
                    Iterator it3 = mutableList2.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        if (!((SpecialEffectsController$FragmentStateManagerOperation) it3.next()).fragment.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || isOperationSeekable) {
                        z = false;
                    }
                    this.runningNonSeekableTransition = z;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + isOperationSeekable + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        processStart(mutableList2);
                        commitEffects$fragment_release(mutableList2);
                    } else if (isOperationSeekable) {
                        processStart(mutableList2);
                        int size = mutableList2.size();
                        for (int i = 0; i < size; i++) {
                            applyContainerChangesToOperation$fragment_release((SpecialEffectsController$FragmentStateManagerOperation) mutableList2.get(i));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SpecialEffectsController$FragmentStateManagerOperation findPendingOperation(Fragment fragment) {
        Object obj;
        Iterator it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) obj;
            if (Intrinsics.areEqual(specialEffectsController$FragmentStateManagerOperation.fragment, fragment) && !specialEffectsController$FragmentStateManagerOperation.isCanceled) {
                break;
            }
        }
        return (SpecialEffectsController$FragmentStateManagerOperation) obj;
    }

    public final SpecialEffectsController$FragmentStateManagerOperation findRunningOperation(Fragment fragment) {
        Object obj;
        Iterator it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) obj;
            if (Intrinsics.areEqual(specialEffectsController$FragmentStateManagerOperation.fragment, fragment) && !specialEffectsController$FragmentStateManagerOperation.isCanceled) {
                break;
            }
        }
        return (SpecialEffectsController$FragmentStateManagerOperation) obj;
    }

    public final void forceCompleteAllOperations() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                processStart(this.pendingOperations);
                ArrayList mutableList = CollectionsKt.toMutableList((Collection) this.runningOperations);
                Iterator it = mutableList.iterator();
                while (it.hasNext()) {
                    ((SpecialEffectsController$FragmentStateManagerOperation) it.next()).isSeeking = false;
                }
                Iterator it2 = mutableList.iterator();
                while (it2.hasNext()) {
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) it2.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.container + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + specialEffectsController$FragmentStateManagerOperation);
                    }
                    specialEffectsController$FragmentStateManagerOperation.cancel(this.container);
                }
                ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) this.pendingOperations);
                Iterator it3 = mutableList2.iterator();
                while (it3.hasNext()) {
                    ((SpecialEffectsController$FragmentStateManagerOperation) it3.next()).isSeeking = false;
                }
                Iterator it4 = mutableList2.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = (SpecialEffectsController$FragmentStateManagerOperation) it4.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.container + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + specialEffectsController$FragmentStateManagerOperation2);
                    }
                    specialEffectsController$FragmentStateManagerOperation2.cancel(this.container);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    public final void markPostponedState() {
        Object obj;
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                ArrayList arrayList = this.pendingOperations;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) obj;
                    View view = specialEffectsController$FragmentStateManagerOperation.fragment.mView;
                    view.getClass();
                    char c = 4;
                    if (view.getAlpha() != RecyclerView.DECELERATION_RATE || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c = 3;
                        }
                    }
                    if (specialEffectsController$FragmentStateManagerOperation.finalState == 2 && c != 2) {
                        break;
                    }
                }
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = (SpecialEffectsController$FragmentStateManagerOperation) obj;
                Fragment fragment = specialEffectsController$FragmentStateManagerOperation2 != null ? specialEffectsController$FragmentStateManagerOperation2.fragment : null;
                this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void processProgress(BackEventCompat backEventCompat) {
        backEventCompat.getClass();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEventCompat.progress);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.runningOperations.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((SpecialEffectsController$FragmentStateManagerOperation) it.next()).effects, arrayList);
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((SpecialEffectsController$Effect) list.get(i)).onProgress(backEventCompat, this.container);
        }
    }

    public final void processStart(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) arrayList.get(i);
            FragmentStateManager fragmentStateManager = specialEffectsController$FragmentStateManagerOperation.fragmentStateManager;
            if (!specialEffectsController$FragmentStateManagerOperation.isStarted) {
                specialEffectsController$FragmentStateManagerOperation.isStarted = true;
                int i2 = specialEffectsController$FragmentStateManagerOperation.lifecycleImpact;
                if (i2 == 2) {
                    Fragment fragment = fragmentStateManager.mFragment;
                    fragment.getClass();
                    View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                        }
                    }
                    View requireView = specialEffectsController$FragmentStateManagerOperation.fragment.requireView();
                    requireView.getClass();
                    if (requireView.getParent() == null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Adding fragment " + fragment + " view " + requireView + " to container in onStart");
                        }
                        fragmentStateManager.addViewToContainer();
                        requireView.setAlpha(RecyclerView.DECELERATION_RATE);
                    }
                    if (requireView.getAlpha() == RecyclerView.DECELERATION_RATE && requireView.getVisibility() == 0) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Making view " + requireView + " INVISIBLE in onStart");
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + fragment.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (i2 == 3) {
                    Fragment fragment2 = fragmentStateManager.mFragment;
                    fragment2.getClass();
                    View requireView2 = fragment2.requireView();
                    requireView2.getClass();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((SpecialEffectsController$FragmentStateManagerOperation) it.next()).effects, arrayList2);
        }
        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList2));
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            SpecialEffectsController$Effect specialEffectsController$Effect = (SpecialEffectsController$Effect) list.get(i3);
            specialEffectsController$Effect.getClass();
            ViewGroup viewGroup = this.container;
            viewGroup.getClass();
            if (!specialEffectsController$Effect.isStarted) {
                specialEffectsController$Effect.onStart(viewGroup);
            }
            specialEffectsController$Effect.isStarted = true;
        }
    }

    public final void updateFinalState() {
        Iterator it = this.pendingOperations.iterator();
        while (it.hasNext()) {
            SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) it.next();
            int i = 2;
            if (specialEffectsController$FragmentStateManagerOperation.lifecycleImpact == 2) {
                View requireView = specialEffectsController$FragmentStateManagerOperation.fragment.requireView();
                requireView.getClass();
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(visibility, "Unknown visibility "));
                            return;
                        }
                        i = 3;
                    }
                }
                specialEffectsController$FragmentStateManagerOperation.mergeWith(i, 1);
            }
        }
    }

    public final void updateOperationDirection(boolean z) {
        this.operationDirectionIsPop = z;
    }

    public static final DefaultSpecialEffectsController getOrCreateController(ViewGroup viewGroup, zzf zzfVar) {
        return SpecialEffectsController$Companion.getOrCreateController(viewGroup, zzfVar);
    }

    public final class TransitionInfo extends SpecialEffectsInfo {
        public final boolean isOverlapAllowed;
        public final Object sharedElementTransition;
        public final Object transition;

        public TransitionInfo(SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation, boolean z, boolean z2) {
            super(specialEffectsController$FragmentStateManagerOperation);
            Fragment fragment = specialEffectsController$FragmentStateManagerOperation.fragment;
            this.transition = specialEffectsController$FragmentStateManagerOperation.finalState == 2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.isOverlapAllowed = specialEffectsController$FragmentStateManagerOperation.finalState == 2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionCompat21 fragmentTransitionCompat21 = FragmentTransition.PLATFORM_IMPL;
            if (obj instanceof Transition) {
                return fragmentTransitionCompat21;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(sb, " for fragment ", this.f866operation.fragment, " is not a valid framework Transition or AndroidX Transition");
            return null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            Object obj = this.transition;
            FragmentTransitionImpl handlingImpl = getHandlingImpl(obj);
            Object obj2 = this.sharedElementTransition;
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(obj2);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.f866operation.fragment, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
            return null;
        }
    }
}
