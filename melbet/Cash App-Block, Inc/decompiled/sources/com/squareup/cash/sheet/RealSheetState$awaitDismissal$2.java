package com.squareup.cash.sheet;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.biometrics.BiometricsStore$read$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.selects.SelectImplementation;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealSheetState$awaitDismissal$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealSheetState$awaitDismissal$2(RealSheetState realSheetState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                RealSheetState$awaitDismissal$2 realSheetState$awaitDismissal$2 = new RealSheetState$awaitDismissal$2(this.this$0, continuation, 0);
                realSheetState$awaitDismissal$2.L$0 = obj;
                return realSheetState$awaitDismissal$2;
            default:
                RealSheetState$awaitDismissal$2 realSheetState$awaitDismissal$22 = new RealSheetState$awaitDismissal$2(this.this$0, continuation, 1);
                realSheetState$awaitDismissal$22.L$0 = obj;
                return realSheetState$awaitDismissal$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealSheetState$awaitDismissal$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealSheetState$awaitDismissal$2) create((SheetPosition) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealSheetState realSheetState = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SelectImplementation selectImplementation = new SelectImplementation(getContext());
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    selectImplementation.invoke(JobKt.launch$default(coroutineScope, null, coroutineStart, new RealSheetState$peek$3(realSheetState, continuation, 13), 1).getOnJoin(), new BiometricsStore$read$1(1, null, 6));
                    selectImplementation.invoke(JobKt.launch$default(coroutineScope, null, coroutineStart, new RealSheetState$peek$3(realSheetState, continuation, 14), 1).getOnJoin(), new BiometricsStore$read$1(1, null, 7));
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (selectImplementation.doSelect(this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.cancelChildren$default(coroutineScope.getCoroutineContext());
                break;
            default:
                SheetPosition sheetPosition = (SheetPosition) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (sheetPosition == SheetPosition.Hidden) {
                        this.L$0 = null;
                        this.label = 1;
                        if (realSheetState.peek(this) == coroutineSingletons2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
