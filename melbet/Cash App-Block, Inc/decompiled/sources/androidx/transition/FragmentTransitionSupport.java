package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$$ExternalSyntheticLambda1;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import java.util.ArrayList;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public class FragmentTransitionSupport extends FragmentTransitionImpl {

    /* renamed from: androidx.transition.FragmentTransitionSupport$1, reason: invalid class name */
    public final class AnonymousClass1 extends Styleable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Rect val$epicenter;

        public /* synthetic */ AnonymousClass1(int i, Rect rect) {
            this.$r8$classId = i;
            this.val$epicenter = rect;
        }

        @Override // androidx.transition.Styleable
        public final Rect onGetEpicenter() {
            int i = this.$r8$classId;
            Rect rect = this.val$epicenter;
            switch (i) {
                case 0:
                    break;
                default:
                    if (rect.isEmpty()) {
                    }
                    break;
            }
            return rect;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void addTarget(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void addTargets(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.mTransitions.size();
            while (i < size) {
                addTargets(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (FragmentTransitionImpl.isNullOrEmpty(transition.mTargetIds) && FragmentTransitionImpl.isNullOrEmpty(transition.mTargets)) {
            int size2 = arrayList.size();
            while (i < size2) {
                transition.addTarget((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void animateToEnd(Object obj) {
        ((Transition.SeekController) obj).animateToEnd();
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void animateToStart(Object obj, DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4 defaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4) {
        Transition.SeekController seekController = (Transition.SeekController) obj;
        seekController.mResetToStartState = defaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4;
        if (!seekController.mIsReady) {
            seekController.mOnReady = 2;
        } else {
            seekController.ensureAnimation();
            seekController.mSpringAnimation.animateToFinalPosition(RecyclerView.DECELERATION_RATE);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean canHandle(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((Transition) obj).mo1193clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object controlDelayedTransition(ViewGroup viewGroup, Object obj) {
        Transition transition = (Transition) obj;
        ArrayList arrayList = TransitionManager.sPendingTransitions;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (transition.isSeekingSupported()) {
                arrayList.add(viewGroup);
                Transition mo1193clone = transition.mo1193clone();
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(mo1193clone);
                TransitionManager.sceneChangeSetup(viewGroup, transitionSet);
                viewGroup.setTag(R.id.transition_current_scene, null);
                TransitionManager.sceneChangeRunTransition(viewGroup, transitionSet);
                viewGroup.invalidate();
                Transition.SeekController seekController = new Transition.SeekController(transitionSet);
                transitionSet.mSeekController = seekController;
                transitionSet.addListener(seekController);
                return transitionSet.mSeekController;
            }
            a$$ExternalSyntheticBUOutline0.m$3("The Transition must support seeking.");
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean isSeekingSupported(Object obj) {
        boolean isSeekingSupported = ((Transition) obj).isSeekingSupported();
        if (!isSeekingSupported) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return isSeekingSupported;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(transition);
            transitionSet.addTransition(transition2);
            transitionSet.setOrdering(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.addTransition(transition);
        }
        transitionSet2.addTransition(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object mergeTransitionsTogether(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public final void replaceTargets(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.mTransitions.size();
            while (i < size) {
                replaceTargets(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (FragmentTransitionImpl.isNullOrEmpty(transition.mTargetIds)) {
            ArrayList arrayList3 = transition.mTargets;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.removeTarget((View) arrayList.get(size3));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void scheduleHideFragmentView(Object obj, final View view, final ArrayList arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList2.get(i)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void scheduleRemoveTargets(Object obj, final Object obj2, final ArrayList arrayList, final Object obj3, final ArrayList arrayList2) {
        ((Transition) obj).addListener(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                FragmentTransitionSupport fragmentTransitionSupport = FragmentTransitionSupport.this;
                Object obj4 = obj2;
                if (obj4 != null) {
                    fragmentTransitionSupport.replaceTargets(obj4, arrayList, null);
                }
                Object obj5 = obj3;
                if (obj5 != null) {
                    fragmentTransitionSupport.replaceTargets(obj5, arrayList2, null);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setCurrentPlayTime(Object obj, float f) {
        Transition.SeekController seekController = (Transition.SeekController) obj;
        boolean z = seekController.mIsReady;
        if (z) {
            TransitionSet transitionSet = seekController.this$0;
            long j = transitionSet.mTotalDuration;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (seekController.mSpringAnimation != null) {
                a$$ExternalSyntheticBUOutline0.m$1("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j3 = seekController.mCurrentPlayTime;
            if (j2 == j3 || !z) {
                return;
            }
            if (!seekController.mIsCanceled) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    transitionSet.setCurrentPlayTimeMillis(j2, j3);
                    seekController.mCurrentPlayTime = j2;
                }
            }
            HuffmanTreeGroup huffmanTreeGroup = seekController.mVelocityTracker;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (huffmanTreeGroup.alphabetSize + 1) % 20;
            huffmanTreeGroup.alphabetSize = i;
            ((long[]) huffmanTreeGroup.codes)[i] = currentAnimationTimeMillis;
            ((float[]) huffmanTreeGroup.trees)[i] = j2;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setEpicenter(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            FragmentTransitionImpl.getBoundsOnScreen(rect, view);
            ((Transition) obj).setEpicenterCallback(new AnonymousClass1(0, rect));
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setListenerForTransitionEnd(Object obj, CancellationSignal cancellationSignal, Fragment$$ExternalSyntheticLambda1 fragment$$ExternalSyntheticLambda1, final Runnable runnable) {
        Transition transition = (Transition) obj;
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = new PreviewView$1$$ExternalSyntheticLambda2(5, fragment$$ExternalSyntheticLambda1, transition, runnable);
        synchronized (cancellationSignal) {
            while (cancellationSignal.mCancelInProgress) {
                try {
                    try {
                        cancellationSignal.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (((PreviewView$1$$ExternalSyntheticLambda2) cancellationSignal.mOnCancelListener) != previewView$1$$ExternalSyntheticLambda2) {
                cancellationSignal.mOnCancelListener = previewView$1$$ExternalSyntheticLambda2;
                if (cancellationSignal.mIsCanceled) {
                    Runnable runnable2 = (Runnable) previewView$1$$ExternalSyntheticLambda2.f$0;
                    Transition transition2 = (Transition) previewView$1$$ExternalSyntheticLambda2.f$1;
                    Runnable runnable3 = (Runnable) previewView$1$$ExternalSyntheticLambda2.f$2;
                    if (runnable2 == null) {
                        transition2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        transition.addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition3) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition3) {
                runnable.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition3) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setSharedElementTargets(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList arrayList2 = transitionSet.mTargets;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.bfsAddViewChildren(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        addTargets(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void swapSharedElementTargets(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList arrayList3 = transitionSet.mTargets;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            replaceTargets(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setEpicenter(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new AnonymousClass1(1, rect));
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void setListenerForTransitionEnd(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        setListenerForTransitionEnd(obj, cancellationSignal, (Fragment$$ExternalSyntheticLambda1) null, runnable);
    }
}
