package com.squareup.cash.fidesmo.presenters;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPresenter$models$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $syntheticProgressFinishing$delegate;
    public final /* synthetic */ boolean $syntheticProgressPaused;
    public final /* synthetic */ Object $syntheticProgressPercent$delegate;
    public final /* synthetic */ Object $syntheticProgressTarget$delegate;
    public int I$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPresenter$models$7$1(int i, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, LazyListState lazyListState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.label = i;
        this.$syntheticProgressTarget$delegate = collapsingToolbarScaffoldState;
        this.$syntheticProgressPercent$delegate = lazyListState;
        this.$syntheticProgressFinishing$delegate = parcelableSnapshotMutableIntState;
        this.$syntheticProgressPaused = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$syntheticProgressPercent$delegate;
        Object obj3 = this.$syntheticProgressTarget$delegate;
        switch (i) {
            case 0:
                return new FidesmoProvisioningPresenter$models$7$1(this.$syntheticProgressPaused, (MutableState) obj3, (MutableState) obj2, this.$syntheticProgressFinishing$delegate, continuation, 0);
            case 1:
                return new FidesmoProvisioningPresenter$models$7$1(this.$syntheticProgressPaused, (MutableState) obj3, (MutableState) obj2, this.$syntheticProgressFinishing$delegate, continuation, 1);
            default:
                return new FidesmoProvisioningPresenter$models$7$1(this.label, (CollapsingToolbarScaffoldState) obj3, (LazyListState) obj2, (ParcelableSnapshotMutableIntState) this.$syntheticProgressFinishing$delegate, this.$syntheticProgressPaused, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FidesmoProvisioningPresenter$models$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.animateScrollToItem(r0, 0, r14) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6.scrollToItem(r0, 0, r14) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState.collapse$default(r15, r14) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0142  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b9 -> B:27:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0131 -> B:59:0x0135). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int intValue;
        Integer num2;
        Integer num3;
        int intValue2;
        Integer num4;
        int i = this.$r8$classId;
        boolean z = this.$syntheticProgressPaused;
        Object obj2 = this.$syntheticProgressPercent$delegate;
        Object obj3 = this.$syntheticProgressTarget$delegate;
        MutableState mutableState = this.$syntheticProgressFinishing$delegate;
        switch (i) {
            case 0:
                MutableState mutableState2 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z && (num = (Integer) ((MutableState) obj3).getValue()) != null) {
                        intValue = num.intValue();
                        num2 = (Integer) mutableState2.getValue();
                        if ((num2 != null ? num2.intValue() : 0) >= intValue) {
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    intValue = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                    Integer num5 = (Integer) mutableState2.getValue();
                    int intValue3 = num5 == null ? num5.intValue() : 0;
                    if (intValue3 < intValue) {
                        mutableState2.setValue(new Integer(intValue3 + 1));
                    }
                    num2 = (Integer) mutableState2.getValue();
                    if ((num2 != null ? num2.intValue() : 0) >= intValue) {
                        break;
                    } else {
                        long j = ((Boolean) mutableState.getValue()).booleanValue() ? 30L : 300L;
                        this.I$0 = intValue;
                        this.label = 1;
                        if (JobKt.delay(j, this) == coroutineSingletons) {
                            break;
                        }
                        Integer num52 = (Integer) mutableState2.getValue();
                        if (num52 == null) {
                        }
                        if (intValue3 < intValue) {
                        }
                        num2 = (Integer) mutableState2.getValue();
                        if ((num2 != null ? num2.intValue() : 0) >= intValue) {
                        }
                    }
                }
                break;
            case 1:
                MutableState mutableState3 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z && (num3 = (Integer) ((MutableState) obj3).getValue()) != null) {
                        intValue2 = num3.intValue();
                        num4 = (Integer) mutableState3.getValue();
                        if ((num4 != null ? num4.intValue() : 0) >= intValue2) {
                        }
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    intValue2 = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                    Integer num6 = (Integer) mutableState3.getValue();
                    int intValue4 = num6 == null ? num6.intValue() : 0;
                    if (intValue4 < intValue2) {
                        mutableState3.setValue(new Integer(intValue4 + 1));
                    }
                    num4 = (Integer) mutableState3.getValue();
                    if ((num4 != null ? num4.intValue() : 0) >= intValue2) {
                        break;
                    } else {
                        long j2 = ((Boolean) mutableState.getValue()).booleanValue() ? 30L : 300L;
                        this.I$0 = intValue2;
                        this.label = 1;
                        if (JobKt.delay(j2, this) == coroutineSingletons2) {
                            break;
                        }
                        Integer num62 = (Integer) mutableState3.getValue();
                        if (num62 == null) {
                        }
                        if (intValue4 < intValue2) {
                        }
                        num4 = (Integer) mutableState3.getValue();
                        if ((num4 != null ? num4.intValue() : 0) >= intValue2) {
                        }
                    }
                }
                break;
            default:
                int i4 = this.label;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.I$0;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((ParcelableSnapshotMutableIntState) mutableState).setIntValue(i4);
                    CollapsingToolbarState collapsingToolbarState = ((CollapsingToolbarScaffoldState) obj3).toolbarState;
                    this.I$0 = 1;
                    break;
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i5 != 2 && i5 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                LazyListState lazyListState = (LazyListState) obj2;
                if (!z) {
                    this.I$0 = 3;
                    WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                    break;
                } else {
                    this.I$0 = 2;
                    WorkLauncherImpl workLauncherImpl2 = LazyListState.Saver;
                    break;
                }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FidesmoProvisioningPresenter$models$7$1(boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$syntheticProgressPaused = z;
        this.$syntheticProgressTarget$delegate = mutableState;
        this.$syntheticProgressPercent$delegate = mutableState2;
        this.$syntheticProgressFinishing$delegate = mutableState3;
    }
}
