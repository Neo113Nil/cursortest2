package androidx.compose.runtime;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.collection.MutableScatterSet;
import androidx.collection.MutableSetWrapper;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.trace.core.CoreTracer;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda16;
import com.squareup.cash.mooncake.components.LoadingHelper$InDirection;
import com.squareup.cash.mooncake.components.LoadingHelper$Position;
import com.squareup.cash.mooncake.components.LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1;
import com.squareup.cash.mooncake.components.LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes3.dex */
public final class PausedCompositionImpl {
    public Object applier;
    public Object composer;
    public final Object composition;
    public Object content;
    public final Object context;
    public Object invalidScopes;
    public Object lock;
    public long owningThread;
    public Object pausableApplier;
    public Object rememberManager;
    public boolean reusable;
    public Object state;

    /* JADX WARN: Multi-variable type inference failed */
    public PausedCompositionImpl(ViewGroup viewGroup, List list, ToolbarTuckTargets toolbarTuckTargets, Function1 function1, int i) {
        list = (i & 4) != 0 ? EmptyList.INSTANCE : list;
        int i2 = 2;
        toolbarTuckTargets = (i & 8) != 0 ? new ToolbarTuckTargets(LoadingHelper$Position.TopLeft, new SplitButtons$$ExternalSyntheticLambda0(i2)) : toolbarTuckTargets;
        LoadingHelper$InDirection loadingHelper$InDirection = LoadingHelper$InDirection.FORWARD;
        function1 = (i & 32) != 0 ? new SplitButtons$$ExternalSyntheticLambda0(1) : function1;
        viewGroup.getClass();
        list.getClass();
        this.composition = viewGroup;
        this.owningThread = 300L;
        this.context = toolbarTuckTargets;
        this.composer = loadingHelper$InDirection;
        this.content = function1;
        this.applier = new ArrayList(list);
        Context context = viewGroup.getContext();
        context.getClass();
        FigmaTextView figmaTextView = new FigmaTextView(context, null, i2, 0 == true ? 1 : 0);
        figmaTextView.setTextColor(ThemeHelpersKt.themeInfo(figmaTextView).colorPalette.label);
        Strings.applyStyle(figmaTextView, TextStyles.header3);
        figmaTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        measureWithinContainer(figmaTextView);
        this.lock = figmaTextView;
        Context context2 = viewGroup.getContext();
        context2.getClass();
        View mooncakeProgress = new MooncakeProgress(context2, null, true, 2, null);
        measureWithinContainer(mooncakeProgress);
        this.state = mooncakeProgress;
        View view = new View(viewGroup.getContext());
        view.setBackgroundColor(ThemeHelpersKt.themeInfo(view).colorPalette.background);
        measureWithinContainer(view);
        this.invalidScopes = view;
        SearchView.AnonymousClass4 anonymousClass4 = new SearchView.AnonymousClass4(this, 11);
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnLayoutChangeListener(anonymousClass4);
        }
        viewGroup.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(6, viewGroup, anonymousClass4));
    }

    public void animate(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.composition;
        ValueAnimator valueAnimator = (ValueAnimator) this.rememberManager;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) this.pausableApplier;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ((Function1) this.content).invoke(Boolean.valueOf(z));
        List list = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(new ViewGroupKt$children$1(viewGroup), new Overlay$$ExternalSyntheticLambda0(this, 10)));
        int ordinal = ((LoadingHelper$InDirection) this.composer).ordinal();
        if (ordinal == 0) {
            animateSlide(1, list, z);
            return;
        }
        if (ordinal == 1) {
            animateSlide(-1, list, z);
            return;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        MooncakeProgress mooncakeProgress = (MooncakeProgress) this.state;
        FigmaTextView figmaTextView = (FigmaTextView) this.lock;
        if (z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
            viewGroup.getOverlay().add(figmaTextView);
            viewGroup.getOverlay().add(mooncakeProgress);
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(0);
        }
        viewGroup.getOverlay().remove(figmaTextView);
        viewGroup.getOverlay().remove(mooncakeProgress);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void animateSlide(int i, List list, boolean z) {
        float f;
        float f2;
        ViewGroup viewGroup = (ViewGroup) this.composition;
        boolean isEmpty = list.isEmpty();
        float f3 = RecyclerView.DECELERATION_RATE;
        if (!isEmpty) {
            f = ((View) CollectionsKt.first(list)).getTranslationX();
        } else {
            if (z) {
                f2 = 0.0f;
                if (z) {
                    f3 = i * (-viewGroup.getWidth());
                }
                float f4 = f3;
                int width = viewGroup.getWidth() * i;
                LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1 loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1 = new LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
                ofFloat.setStartDelay(0L);
                ofFloat.setDuration(300L);
                ofFloat.setRepeatCount(0);
                ofFloat.setRepeatMode(1);
                ofFloat.addUpdateListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1);
                ofFloat.addListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1);
                ValueAnimator duration = ofFloat.setDuration(1000L);
                duration.getClass();
                duration.start();
                this.pausableApplier = duration;
                LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2 loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2 = new LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2(z, this, list, width, z);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, f4);
                ofFloat2.setStartDelay(0L);
                ofFloat2.setDuration(300L);
                ofFloat2.setRepeatCount(0);
                ofFloat2.setRepeatMode(1);
                ofFloat2.addUpdateListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2);
                ofFloat2.addListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2);
                ValueAnimator duration2 = ofFloat2.setDuration(this.owningThread);
                duration2.getClass();
                duration2.start();
                this.rememberManager = duration2;
            }
            f = (-viewGroup.getWidth()) * i;
        }
        f2 = f;
        if (z) {
        }
        float f42 = f3;
        int width2 = viewGroup.getWidth() * i;
        LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1 loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$12 = new LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$1();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat3.setStartDelay(0L);
        ofFloat3.setDuration(300L);
        ofFloat3.setRepeatCount(0);
        ofFloat3.setRepeatMode(1);
        ofFloat3.addUpdateListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$12);
        ofFloat3.addListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$12);
        ValueAnimator duration3 = ofFloat3.setDuration(1000L);
        duration3.getClass();
        duration3.start();
        this.pausableApplier = duration3;
        LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2 loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$22 = new LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2(z, this, list, width2, z);
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(f2, f42);
        ofFloat22.setStartDelay(0L);
        ofFloat22.setDuration(300L);
        ofFloat22.setRepeatCount(0);
        ofFloat22.setRepeatMode(1);
        ofFloat22.addUpdateListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$22);
        ofFloat22.addListener(loadingHelper$animateSlide$$inlined$valueAnimatorOf$default$22);
        ValueAnimator duration22 = ofFloat22.setDuration(this.owningThread);
        duration22.getClass();
        duration22.start();
        this.rememberManager = duration22;
    }

    public void apply() {
        AtomicReference atomicReference = (AtomicReference) this.state;
        try {
            switch (((PausedCompositionState) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    applyChanges();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                        if (atomicReference.get() != pausedCompositionState) {
                            PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    public void applyChanges() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.lock) {
                try {
                    RecordingApplier recordingApplier = (RecordingApplier) this.pausableApplier;
                    Applier applier = (Applier) this.applier;
                    applier.getClass();
                    recordingApplier.playTo(applier, (RememberEventDispatcher) this.rememberManager);
                    ((RememberEventDispatcher) this.rememberManager).dispatchRememberObservers();
                    ((RememberEventDispatcher) this.rememberManager).dispatchSideEffects();
                } finally {
                    ((RememberEventDispatcher) this.rememberManager).dispatchAbandons();
                    ((CompositionImpl) this.composition).pendingPausedComposition = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public RecordingApplier getPausableApplier$runtime() {
        return (RecordingApplier) this.pausableApplier;
    }

    public RememberEventDispatcher getRememberManager$runtime() {
        return (RememberEventDispatcher) this.rememberManager;
    }

    public boolean isComplete() {
        return ((PausedCompositionState) ((AtomicReference) this.state).get()).compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    public boolean isRecomposing$runtime() {
        return ((AtomicReference) this.state).get() == PausedCompositionState.Recomposing && this.owningThread == Expect_jvmKt.currentThreadId();
    }

    public void markComplete() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        AtomicReference atomicReference = (AtomicReference) this.state;
        while (true) {
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                z = true;
                break;
            } else if (atomicReference.get() != pausedCompositionState) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    public void markIncomplete$runtime() {
        AtomicReference atomicReference = (AtomicReference) this.state;
        PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
        while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
        }
    }

    public void measureWithinContainer(View view) {
        ViewGroup viewGroup = (ViewGroup) this.composition;
        view.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0));
    }

    public boolean resume(ShouldPauseCallback shouldPauseCallback) {
        CompositionImpl compositionImpl = (CompositionImpl) this.composition;
        CompositionContext compositionContext = (CompositionContext) this.context;
        GapComposer gapComposer = (GapComposer) this.composer;
        boolean z = this.reusable;
        AtomicReference atomicReference = (AtomicReference) this.state;
        try {
            switch (((PausedCompositionState) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    if (z) {
                        gapComposer.reusingGroup = 0;
                        gapComposer.reusing = true;
                    }
                    try {
                        this.invalidScopes = compositionContext.composeInitialPaused$runtime(compositionImpl, shouldPauseCallback, (Function2) this.content);
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                if (atomicReference.get() != pausedCompositionState) {
                                    PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                                }
                            }
                        }
                        if (((MutableScatterSet) this.invalidScopes).isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } finally {
                        if (z) {
                            gapComposer.endReuseFromRoot$runtime();
                        }
                    }
                case 3:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            if (atomicReference.get() != pausedCompositionState3) {
                                PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                            }
                        }
                    }
                    long j = this.owningThread;
                    try {
                        this.owningThread = Expect_jvmKt.currentThreadId();
                        this.invalidScopes = compositionContext.recomposePaused$runtime(compositionImpl, shouldPauseCallback, (MutableScatterSet) this.invalidScopes);
                        this.owningThread = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                                if (atomicReference.get() != pausedCompositionState5) {
                                    PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + '.');
                                }
                            }
                        }
                        if (((MutableScatterSet) this.invalidScopes).isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } catch (Throwable th) {
                        this.owningThread = j;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState7, pausedCompositionState8)) {
                                if (atomicReference.get() != pausedCompositionState7) {
                                    PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    ComposerKt.composeRuntimeError("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    public void setLoading(boolean z) {
        if (this.reusable == z) {
            return;
        }
        this.reusable = z;
        Views.waitForMeasure$default((ViewGroup) this.composition, new MoneyTabUIKt$$ExternalSyntheticLambda16(z, this, 4));
    }

    public PausedCompositionImpl(CompositionImpl compositionImpl, CompositionContext compositionContext, GapComposer gapComposer, MutableSetWrapper mutableSetWrapper, Function2 function2, boolean z, Applier applier, Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = gapComposer;
        this.content = function2;
        this.reusable = z;
        this.applier = applier;
        this.lock = obj;
        this.state = new AtomicReference(PausedCompositionState.InitialPending);
        this.owningThread = Expect_jvmKt.currentThreadId();
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        mutableScatterSet.getClass();
        this.invalidScopes = mutableScatterSet;
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher();
        rememberEventDispatcher.prepare(mutableSetWrapper, gapComposer.getErrorContext$runtime());
        this.rememberManager = rememberEventDispatcher;
        this.pausableApplier = new RecordingApplier(applier.getCurrent());
    }

    public PausedCompositionImpl(CoreTracer coreTracer, String str, String str2, CoreTracer coreTracer2) {
        this.pausableApplier = coreTracer;
        this.reusable = false;
        this.composition = str;
        this.context = str2;
        this.composer = coreTracer2;
    }
}
