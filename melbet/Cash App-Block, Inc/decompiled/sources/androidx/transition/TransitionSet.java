package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.transition.Transition;
import coil3.size.DimensionKt;
import com.fillr.featuretoggle.UnleashContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class TransitionSet extends Transition {
    public int mChangeFlags;
    public int mCurrentListeners;
    public boolean mPlayTogether;
    public boolean mStarted;
    public ArrayList mTransitions;
    public Transition[] mTransitionsCache;

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTransitions = new ArrayList();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_SET);
        setOrdering(DimensionKt.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public final void addTarget(View view) {
        for (int i = 0; i < this.mTransitions.size(); i++) {
            ((Transition) this.mTransitions.get(i)).addTarget(view);
        }
        this.mTargets.add(view);
    }

    public final void addTransition(Transition transition) {
        this.mTransitions.add(transition);
        transition.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            transition.setDuration(j);
        }
        if ((this.mChangeFlags & 1) != 0) {
            transition.setInterpolator(this.mInterpolator);
        }
        if ((this.mChangeFlags & 2) != 0) {
            transition.setPropagation(this.mPropagation);
        }
        if ((this.mChangeFlags & 4) != 0) {
            transition.setPathMotion(this.mPathMotion);
        }
        if ((this.mChangeFlags & 8) != 0) {
            transition.setEpicenterCallback(this.mEpicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        Transition[] transitionsAsArray = transitionsAsArray();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            transitionsAsArray[i].cancel();
        }
        Arrays.fill(transitionsAsArray, (Object) null);
        this.mTransitionsCache = transitionsAsArray;
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (isValidTarget(view)) {
            Iterator it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.isValidTarget(view)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void capturePropagationValues(TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (isValidTarget(view)) {
            Iterator it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.isValidTarget(view)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public final Transition mo1193clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo1193clone();
        transitionSet.mTransitions = new ArrayList();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            Transition mo1193clone = ((Transition) this.mTransitions.get(i)).mo1193clone();
            transitionSet.mTransitions.add(mo1193clone);
            mo1193clone.mParent = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void createAnimators(ViewGroup viewGroup, UnleashContext unleashContext, UnleashContext unleashContext2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.mStartDelay;
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.mTransitions.get(i);
            if (j > 0 && (this.mPlayTogether || i == 0)) {
                long j2 = transition.mStartDelay;
                if (j2 > 0) {
                    transition.setStartDelay(j2 + j);
                } else {
                    transition.setStartDelay(j);
                }
            }
            transition.createAnimators(viewGroup, unleashContext, unleashContext2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        Transition[] transitionsAsArray = transitionsAsArray();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            transitionsAsArray[i].forceToEnd(viewGroup);
        }
        Arrays.fill(transitionsAsArray, (Object) null);
        this.mTransitionsCache = transitionsAsArray;
    }

    public final Transition getTransitionAt(int i) {
        if (i < 0 || i >= this.mTransitions.size()) {
            return null;
        }
        return (Transition) this.mTransitions.get(i);
    }

    @Override // androidx.transition.Transition
    public final boolean hasAnimators() {
        for (int i = 0; i < this.mTransitions.size(); i++) {
            if (((Transition) this.mTransitions.get(i)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            if (!((Transition) this.mTransitions.get(i)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public final void pause(View view) {
        super.pause(view);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        int i = 0;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, i);
        while (i < this.mTransitions.size()) {
            Transition transition = (Transition) this.mTransitions.get(i);
            transition.addListener(anonymousClass2);
            transition.prepareAnimatorsForSeeking();
            long j = transition.mTotalDuration;
            boolean z = this.mPlayTogether;
            long j2 = this.mTotalDuration;
            if (z) {
                this.mTotalDuration = Math.max(j2, j);
            } else {
                transition.mSeekOffsetInParent = j2;
                this.mTotalDuration = j2 + j;
            }
            i++;
        }
    }

    @Override // androidx.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        super.removeListener(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void removeTarget(View view) {
        for (int i = 0; i < this.mTransitions.size(); i++) {
            ((Transition) this.mTransitions.get(i)).removeTarget(view);
        }
        this.mTargets.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void resume(View view) {
        super.resume(view);
        Transition[] transitionsAsArray = transitionsAsArray();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            transitionsAsArray[i].resume(view);
        }
        Arrays.fill(transitionsAsArray, (Object) null);
        this.mTransitionsCache = transitionsAsArray;
    }

    @Override // androidx.transition.Transition
    public final void runAnimators() {
        ArrayList arrayList;
        if (this.mTransitions.isEmpty()) {
            start();
            end();
            return;
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.this$0 = this;
        Iterator it = this.mTransitions.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).addListener(anonymousClass2);
        }
        this.mCurrentListeners = this.mTransitions.size();
        if (this.mPlayTogether) {
            Iterator it2 = this.mTransitions.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).runAnimators();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.mTransitions.size();
            arrayList = this.mTransitions;
            if (i >= size) {
                break;
            }
            ((Transition) arrayList.get(i - 1)).addListener(new AnonymousClass2((Transition) this.mTransitions.get(i), 2));
            i++;
        }
        Transition transition = (Transition) arrayList.get(0);
        if (transition != null) {
            transition.runAnimators();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCurrentPlayTimeMillis(long j, long j2) {
        long j3;
        long j4 = this.mTotalDuration;
        long j5 = 0;
        if (this.mParent != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.mEnded = false;
            notifyFromTransition(this, Transition.TransitionNotification.ON_START, z);
        }
        if (!this.mPlayTogether) {
            int i = 1;
            while (true) {
                int size = this.mTransitions.size();
                ArrayList arrayList = this.mTransitions;
                if (i >= size) {
                    i = arrayList.size();
                    break;
                } else if (((Transition) arrayList.get(i)).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = i - 1;
            if (j >= j2) {
                while (i2 < this.mTransitions.size()) {
                    Transition transition = (Transition) this.mTransitions.get(i2);
                    long j6 = transition.mSeekOffsetInParent;
                    j3 = j5;
                    long j7 = j - j6;
                    if (j7 < j3) {
                        break;
                    }
                    transition.setCurrentPlayTimeMillis(j7, j2 - j6);
                    i2++;
                    j5 = j3;
                }
            } else {
                j3 = 0;
                while (i2 >= 0) {
                    Transition transition2 = (Transition) this.mTransitions.get(i2);
                    long j8 = transition2.mSeekOffsetInParent;
                    long j9 = j - j8;
                    transition2.setCurrentPlayTimeMillis(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            if (this.mParent == null) {
                if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.mEnded = true;
                }
                notifyFromTransition(this, Transition.TransitionNotification.ON_END, z);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < this.mTransitions.size(); i3++) {
            ((Transition) this.mTransitions.get(i3)).setCurrentPlayTimeMillis(j, j2);
        }
        j3 = j5;
        if (this.mParent == null) {
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: setDuration$1, reason: merged with bridge method [inline-methods] */
    public final void setDuration(long j) {
        ArrayList arrayList;
        this.mDuration = j;
        if (j < 0 || (arrayList = this.mTransitions) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).setDuration(j);
        }
    }

    @Override // androidx.transition.Transition
    public final void setEpicenterCallback(Styleable styleable) {
        this.mEpicenterCallback = styleable;
        this.mChangeFlags |= 8;
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).setEpicenterCallback(styleable);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: setInterpolator$1, reason: merged with bridge method [inline-methods] */
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mChangeFlags |= 1;
        ArrayList arrayList = this.mTransitions;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.mTransitions.get(i)).setInterpolator(timeInterpolator);
            }
        }
        this.mInterpolator = timeInterpolator;
    }

    public final void setOrdering(int i) {
        if (i == 0) {
            this.mPlayTogether = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.mPlayTogether = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void setPathMotion(Transition.AnonymousClass1 anonymousClass1) {
        super.setPathMotion(anonymousClass1);
        this.mChangeFlags |= 4;
        if (this.mTransitions != null) {
            for (int i = 0; i < this.mTransitions.size(); i++) {
                ((Transition) this.mTransitions.get(i)).setPathMotion(anonymousClass1);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void setPropagation(SidePropagation sidePropagation) {
        this.mPropagation = sidePropagation;
        this.mChangeFlags |= 2;
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.mTransitions.get(i)).setPropagation(sidePropagation);
        }
    }

    @Override // androidx.transition.Transition
    public final void setStartDelay(long j) {
        this.mStartDelay = j;
    }

    @Override // androidx.transition.Transition
    public final String toString(String str) {
        String transition = super.toString(str);
        for (int i = 0; i < this.mTransitions.size(); i++) {
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(transition, "\n");
            m108m.append(((Transition) this.mTransitions.get(i)).toString(str.concat("  ")));
            transition = m108m.toString();
        }
        return transition;
    }

    public final Transition[] transitionsAsArray() {
        Transition[] transitionArr = this.mTransitionsCache;
        this.mTransitionsCache = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.mTransitions.size()];
        }
        return (Transition[]) this.mTransitions.toArray(transitionArr);
    }

    /* renamed from: androidx.transition.TransitionSet$2, reason: invalid class name */
    public final class AnonymousClass2 extends TransitionListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public Transition this$0;

        public /* synthetic */ AnonymousClass2(Transition transition, int i) {
            this.$r8$classId = i;
            this.this$0 = transition;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            switch (this.$r8$classId) {
                case 0:
                    TransitionSet transitionSet = (TransitionSet) this.this$0;
                    transitionSet.mTransitions.remove(transition);
                    if (!transitionSet.hasAnimators()) {
                        transitionSet.notifyFromTransition(transitionSet, Transition.TransitionNotification.ON_CANCEL, false);
                        transitionSet.mEnded = true;
                        transitionSet.notifyFromTransition(transitionSet, Transition.TransitionNotification.ON_END, false);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            switch (this.$r8$classId) {
                case 1:
                    TransitionSet transitionSet = (TransitionSet) this.this$0;
                    int i = transitionSet.mCurrentListeners - 1;
                    transitionSet.mCurrentListeners = i;
                    if (i == 0) {
                        transitionSet.mStarted = false;
                        transitionSet.end();
                    }
                    transition.removeListener(this);
                    break;
                case 2:
                    this.this$0.runAnimators();
                    transition.removeListener(this);
                    break;
            }
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            switch (this.$r8$classId) {
                case 1:
                    TransitionSet transitionSet = (TransitionSet) this.this$0;
                    if (!transitionSet.mStarted) {
                        transitionSet.start();
                        transitionSet.mStarted = true;
                        break;
                    }
                    break;
            }
        }

        public /* synthetic */ AnonymousClass2() {
            this.$r8$classId = 1;
        }
    }

    public TransitionSet() {
        this.mTransitions = new ArrayList();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
    }
}
