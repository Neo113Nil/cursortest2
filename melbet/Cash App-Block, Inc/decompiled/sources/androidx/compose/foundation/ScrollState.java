package androidx.compose.foundation;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final WorkLauncherImpl Saver = new WorkLauncherImpl(8, new SaversKt$$ExternalSyntheticLambda0(1), new ScrollState$$ExternalSyntheticLambda4(0));
    public float accumulator;
    public final DerivedSnapshotState canScrollBackward$delegate;
    public final DerivedSnapshotState canScrollForward$delegate;
    public final ParcelableSnapshotMutableIntState value$delegate;
    public final ParcelableSnapshotMutableIntState viewportSize$delegate = new ParcelableSnapshotMutableIntState(0);
    public final ParcelableSnapshotMutableIntState contentSize$delegate = new ParcelableSnapshotMutableIntState(0);
    public final MutableInteractionSourceImpl internalInteractionSource = new MutableInteractionSourceImpl();
    public final ParcelableSnapshotMutableIntState _maxValueState = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    public final DefaultScrollableState scrollableState = new DefaultScrollableState(new CashApp$$ExternalSyntheticLambda2(this, 3));

    public ScrollState(int i) {
        this.value$delegate = new ParcelableSnapshotMutableIntState(i);
        final int i2 = 0;
        this.canScrollForward$delegate = Updater.derivedStateOf(new Function0(this) { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda1
            public final /* synthetic */ ScrollState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ScrollState scrollState = this.f$0;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(scrollState.value$delegate.getIntValue() < scrollState._maxValueState.getIntValue());
                    default:
                        return Boolean.valueOf(scrollState.value$delegate.getIntValue() > 0);
                }
            }
        });
        final int i3 = 1;
        this.canScrollBackward$delegate = Updater.derivedStateOf(new Function0(this) { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda1
            public final /* synthetic */ ScrollState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ScrollState scrollState = this.f$0;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(scrollState.value$delegate.getIntValue() < scrollState._maxValueState.getIntValue());
                    default:
                        return Boolean.valueOf(scrollState.value$delegate.getIntValue() > 0);
                }
            }
        });
    }

    public static Object animateScrollTo$default(ScrollState scrollState, int i, Continuation continuation) {
        Object animateScrollBy = PlatformKt.animateScrollBy(scrollState, i - scrollState.value$delegate.getIntValue(), new SpringSpec(null, 7), continuation);
        return animateScrollBy == CoroutineSingletons.COROUTINE_SUSPENDED ? animateScrollBy : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object scroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    public final void setMaxValue$foundation(int i) {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.value$delegate;
        this._maxValueState.setIntValue(i);
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (parcelableSnapshotMutableIntState.getIntValue() > i) {
                parcelableSnapshotMutableIntState.setIntValue(i);
            }
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }
}
