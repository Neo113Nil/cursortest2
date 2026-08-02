package androidx.transition;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class TransitionManager {
    public static final AutoTransition sDefaultTransition = new AutoTransition();
    public static final ThreadLocal sRunningTransitions = new ThreadLocal();
    public static final ArrayList sPendingTransitions = new ArrayList();

    public final class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public ViewGroup mSceneRoot;
        public Transition mTransition;

        /* JADX WARN: Removed duplicated region for block: B:117:0x01eb A[EDGE_INSN: B:117:0x01eb->B:118:0x01eb BREAK  A[LOOP:1: B:18:0x0087->B:29:0x01e4], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x02f6  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x02fc  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPreDraw() {
            ArrayList arrayList;
            int i;
            ArrayMap arrayMap;
            ArrayMap arrayMap2;
            int i2;
            int[] iArr;
            int i3;
            int i4;
            ArrayList arrayList2;
            int i5;
            int i6;
            Transition.AnimationInfo animationInfo;
            boolean z;
            int i7;
            TransitionValues transitionValues;
            View view;
            View view2;
            boolean z2;
            int i8;
            Transition transition = this.mTransition;
            ViewGroup viewGroup = this.mSceneRoot;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            boolean z3 = true;
            if (!TransitionManager.sPendingTransitions.remove(viewGroup)) {
                return true;
            }
            final ArrayMap runningTransitions = TransitionManager.getRunningTransitions();
            ArrayList arrayList3 = (ArrayList) runningTransitions.get(viewGroup);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                runningTransitions.put(viewGroup, arrayList3);
            } else if (arrayList3.size() > 0) {
                arrayList = new ArrayList(arrayList3);
                arrayList3.add(transition);
                transition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition2) {
                        ((ArrayList) runningTransitions.get(MultiListener.this.mSceneRoot)).remove(transition2);
                        transition2.removeListener(this);
                    }
                });
                i = 0;
                transition.captureValues(viewGroup, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).resume(viewGroup);
                    }
                }
                transition.mStartValuesList = new ArrayList();
                transition.mEndValuesList = new ArrayList();
                UnleashContext unleashContext = transition.mStartValues;
                UnleashContext unleashContext2 = transition.mEndValues;
                arrayMap = new ArrayMap((ArrayMap) unleashContext.userId);
                arrayMap2 = new ArrayMap((ArrayMap) unleashContext2.userId);
                i2 = 0;
                while (true) {
                    iArr = transition.mMatchOrder;
                    if (i2 < iArr.length) {
                        break;
                    }
                    int i9 = iArr[i2];
                    if (i9 == z3) {
                        z = z3;
                        i7 = i2;
                        for (int i10 = arrayMap.size - 1; i10 >= 0; i10--) {
                            View view3 = (View) arrayMap.keyAt(i10);
                            if (view3 != null && transition.isValidTarget(view3) && (transitionValues = (TransitionValues) arrayMap2.remove(view3)) != null && transition.isValidTarget(transitionValues.view)) {
                                transition.mStartValuesList.add((TransitionValues) arrayMap.removeAt(i10));
                                transition.mEndValuesList.add(transitionValues);
                            }
                        }
                    } else if (i9 == 2) {
                        z = z3;
                        i7 = i2;
                        ArrayMap arrayMap3 = (ArrayMap) unleashContext.properties;
                        ArrayMap arrayMap4 = (ArrayMap) unleashContext2.properties;
                        int i11 = arrayMap3.size;
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view4 = (View) arrayMap3.valueAt(i12);
                            if (view4 != null && transition.isValidTarget(view4) && (view = (View) arrayMap4.get((String) arrayMap3.keyAt(i12))) != null && transition.isValidTarget(view)) {
                                TransitionValues transitionValues2 = (TransitionValues) arrayMap.get(view4);
                                TransitionValues transitionValues3 = (TransitionValues) arrayMap2.get(view);
                                if (transitionValues2 != null && transitionValues3 != null) {
                                    transition.mStartValuesList.add(transitionValues2);
                                    transition.mEndValuesList.add(transitionValues3);
                                    arrayMap.remove(view4);
                                    arrayMap2.remove(view);
                                }
                            }
                        }
                    } else if (i9 != 3) {
                        if (i9 == 4) {
                            LongSparseArray longSparseArray = (LongSparseArray) unleashContext.remoteAddress;
                            LongSparseArray longSparseArray2 = (LongSparseArray) unleashContext2.remoteAddress;
                            int size = longSparseArray.size();
                            int i13 = i;
                            while (i13 < size) {
                                View view5 = (View) longSparseArray.valueAt(i13);
                                if (view5 == null || !transition.isValidTarget(view5)) {
                                    z2 = z3;
                                    i8 = i2;
                                } else {
                                    i8 = i2;
                                    View view6 = (View) longSparseArray2.get(longSparseArray.keyAt(i13));
                                    if (view6 == null || !transition.isValidTarget(view6)) {
                                        z2 = z3;
                                    } else {
                                        TransitionValues transitionValues4 = (TransitionValues) arrayMap.get(view5);
                                        z2 = z3;
                                        TransitionValues transitionValues5 = (TransitionValues) arrayMap2.get(view6);
                                        if (transitionValues4 != null && transitionValues5 != null) {
                                            transition.mStartValuesList.add(transitionValues4);
                                            transition.mEndValuesList.add(transitionValues5);
                                            arrayMap.remove(view5);
                                            arrayMap2.remove(view6);
                                        }
                                    }
                                }
                                i13++;
                                i2 = i8;
                                z3 = z2;
                            }
                        }
                        z = z3;
                        i7 = i2;
                    } else {
                        z = z3;
                        i7 = i2;
                        SparseArray sparseArray = (SparseArray) unleashContext.sessionId;
                        SparseArray sparseArray2 = (SparseArray) unleashContext2.sessionId;
                        int size2 = sparseArray.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            View view7 = (View) sparseArray.valueAt(i14);
                            if (view7 != null && transition.isValidTarget(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i14))) != null && transition.isValidTarget(view2)) {
                                TransitionValues transitionValues6 = (TransitionValues) arrayMap.get(view7);
                                TransitionValues transitionValues7 = (TransitionValues) arrayMap2.get(view2);
                                if (transitionValues6 != null && transitionValues7 != null) {
                                    transition.mStartValuesList.add(transitionValues6);
                                    transition.mEndValuesList.add(transitionValues7);
                                    arrayMap.remove(view7);
                                    arrayMap2.remove(view2);
                                }
                            }
                        }
                    }
                    i2 = i7 + 1;
                    z3 = z;
                    i = 0;
                }
                boolean z4 = z3;
                for (i3 = 0; i3 < arrayMap.size; i3++) {
                    TransitionValues transitionValues8 = (TransitionValues) arrayMap.valueAt(i3);
                    if (transition.isValidTarget(transitionValues8.view)) {
                        transition.mStartValuesList.add(transitionValues8);
                        transition.mEndValuesList.add(null);
                    }
                }
                for (i4 = 0; i4 < arrayMap2.size; i4++) {
                    TransitionValues transitionValues9 = (TransitionValues) arrayMap2.valueAt(i4);
                    if (transition.isValidTarget(transitionValues9.view)) {
                        transition.mEndValuesList.add(transitionValues9);
                        transition.mStartValuesList.add(null);
                    }
                }
                ArrayMap runningAnimators = Transition.getRunningAnimators();
                int i15 = runningAnimators.size;
                WindowId windowId = viewGroup.getWindowId();
                arrayList2 = new ArrayList();
                i5 = i15 - 1;
                while (i5 >= 0) {
                    Animator animator = (Animator) runningAnimators.keyAt(i5);
                    if (animator != null && (animationInfo = (Transition.AnimationInfo) runningAnimators.get(animator)) != null) {
                        Transition transition2 = animationInfo.mTransition;
                        View view8 = animationInfo.mView;
                        if (view8 != null && Objects.equals(windowId, animationInfo.mWindowId)) {
                            TransitionValues transitionValues10 = animationInfo.mValues;
                            boolean z5 = z4;
                            TransitionValues transitionValues11 = transition.getTransitionValues(view8, z5);
                            TransitionValues matchedTransitionValues = transition.getMatchedTransitionValues(view8, z5);
                            if (transitionValues11 == null && matchedTransitionValues == null) {
                                matchedTransitionValues = (TransitionValues) ((ArrayMap) transition.mEndValues.userId).get(view8);
                            }
                            if ((transitionValues11 != null || matchedTransitionValues != null) && transition2.isTransitionRequired(transitionValues10, matchedTransitionValues)) {
                                Transition rootTransition = transition2.getRootTransition();
                                ArrayList arrayList4 = transition2.mCurrentAnimators;
                                if (rootTransition.mSeekController != null) {
                                    animator.cancel();
                                    arrayList4.remove(animator);
                                    runningAnimators.removeAt(i5);
                                    if (arrayList4.size() == 0) {
                                        arrayList2.add(transition2);
                                    }
                                } else if (animator.isRunning() || animator.isStarted()) {
                                    animator.cancel();
                                } else {
                                    runningAnimators.removeAt(i5);
                                }
                            }
                        }
                    }
                    i5--;
                    z4 = true;
                }
                for (i6 = 0; i6 < arrayList2.size(); i6++) {
                    Transition transition3 = (Transition) arrayList2.get(i6);
                    transition3.notifyFromTransition(transition3, Transition.TransitionNotification.ON_CANCEL, false);
                    if (!transition3.mEnded) {
                        transition3.mEnded = true;
                        transition3.notifyFromTransition(transition3, Transition.TransitionNotification.ON_END, false);
                    }
                }
                transition.createAnimators(viewGroup, transition.mStartValues, transition.mEndValues, transition.mStartValuesList, transition.mEndValuesList);
                if (transition.mSeekController != null) {
                    transition.runAnimators();
                    return true;
                }
                if (Build.VERSION.SDK_INT < 34) {
                    return true;
                }
                transition.prepareAnimatorsForSeeking();
                Transition.SeekController seekController = transition.mSeekController;
                TransitionSet transitionSet = seekController.this$0;
                long j = transitionSet.mTotalDuration == 0 ? 1L : 0L;
                transitionSet.setCurrentPlayTimeMillis(j, seekController.mCurrentPlayTime);
                seekController.mCurrentPlayTime = j;
                Transition.SeekController seekController2 = transition.mSeekController;
                seekController2.mIsReady = true;
                int i16 = seekController2.mOnReady;
                if (i16 == 1) {
                    seekController2.mOnReady = 0;
                    seekController2.animateToEnd();
                    return true;
                }
                if (i16 != 2) {
                    return true;
                }
                seekController2.mOnReady = 0;
                seekController2.mResetToStartState = seekController2.mResetToStartState;
                seekController2.ensureAnimation();
                seekController2.mSpringAnimation.animateToFinalPosition(RecyclerView.DECELERATION_RATE);
                return true;
            }
            arrayList = null;
            arrayList3.add(transition);
            transition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition22) {
                    ((ArrayList) runningTransitions.get(MultiListener.this.mSceneRoot)).remove(transition22);
                    transition22.removeListener(this);
                }
            });
            i = 0;
            transition.captureValues(viewGroup, false);
            if (arrayList != null) {
            }
            transition.mStartValuesList = new ArrayList();
            transition.mEndValuesList = new ArrayList();
            UnleashContext unleashContext3 = transition.mStartValues;
            UnleashContext unleashContext22 = transition.mEndValues;
            arrayMap = new ArrayMap((ArrayMap) unleashContext3.userId);
            arrayMap2 = new ArrayMap((ArrayMap) unleashContext22.userId);
            i2 = 0;
            while (true) {
                iArr = transition.mMatchOrder;
                if (i2 < iArr.length) {
                }
                i2 = i7 + 1;
                z3 = z;
                i = 0;
            }
            boolean z42 = z3;
            while (i3 < arrayMap.size) {
            }
            while (i4 < arrayMap2.size) {
            }
            ArrayMap runningAnimators2 = Transition.getRunningAnimators();
            int i152 = runningAnimators2.size;
            WindowId windowId2 = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i152 - 1;
            while (i5 >= 0) {
            }
            while (i6 < arrayList2.size()) {
            }
            transition.createAnimators(viewGroup, transition.mStartValues, transition.mEndValues, transition.mStartValuesList, transition.mEndValuesList);
            if (transition.mSeekController != null) {
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.mSceneRoot;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            TransitionManager.sPendingTransitions.remove(viewGroup);
            ArrayList arrayList = (ArrayList) TransitionManager.getRunningTransitions().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(viewGroup);
                }
            }
            this.mTransition.clearValues(true);
        }
    }

    public static void beginDelayedTransition(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = sPendingTransitions;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = sDefaultTransition;
        }
        Transition mo1193clone = transition.mo1193clone();
        sceneChangeSetup(viewGroup, mo1193clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        sceneChangeRunTransition(viewGroup, mo1193clone);
    }

    public static void endTransitions(ViewGroup viewGroup) {
        sPendingTransitions.remove(viewGroup);
        ArrayList arrayList = (ArrayList) getRunningTransitions().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    public static ArrayMap getRunningTransitions() {
        ArrayMap arrayMap;
        ThreadLocal threadLocal = sRunningTransitions;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    public static void go(Scene scene, TransitionSet transitionSet) {
        View view = scene.mLayout;
        ViewGroup viewGroup = scene.mSceneRoot;
        ArrayList arrayList = sPendingTransitions;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        Scene scene2 = (Scene) viewGroup.getTag(R.id.transition_current_scene);
        if (transitionSet == null) {
            if (scene2 != null) {
            }
            viewGroup.removeAllViews();
            viewGroup.addView(view);
            viewGroup.setTag(R.id.transition_current_scene, scene);
            return;
        }
        arrayList.add(viewGroup);
        Transition mo1193clone = transitionSet.mo1193clone();
        sceneChangeSetup(viewGroup, mo1193clone);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        viewGroup.setTag(R.id.transition_current_scene, scene);
        sceneChangeRunTransition(viewGroup, mo1193clone);
    }

    public static void sceneChangeRunTransition(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        MultiListener multiListener = new MultiListener();
        multiListener.mTransition = transition;
        multiListener.mSceneRoot = viewGroup;
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    public static void sceneChangeSetup(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) getRunningTransitions().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        Scene scene = (Scene) viewGroup.getTag(R.id.transition_current_scene);
        if (scene != null) {
        }
    }
}
