package com.squareup.cash.afterpayapplet.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AfterpaySearchPresenter$models$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref$ObjectRef $emptyQueryFilterResponse;
    public final /* synthetic */ SnapshotStateMap $filterSelections;
    public final /* synthetic */ MutableState $isDataRequestFailure$delegate;
    public final /* synthetic */ MutableState $query$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $response$delegate;
    public final /* synthetic */ MutableState $updateInProgress$delegate;
    public int label;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AfterpaySearchPresenter$models$1(SnapshotStateMap snapshotStateMap, LocalHomePresenter localHomePresenter, Ref$ObjectRef ref$ObjectRef, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$filterSelections = snapshotStateMap;
        this.this$0 = localHomePresenter;
        this.$emptyQueryFilterResponse = ref$ObjectRef;
        this.$updateInProgress$delegate = mutableState;
        this.$query$delegate = mutableState2;
        this.$isDataRequestFailure$delegate = mutableState3;
        this.$response$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AfterpaySearchPresenter$models$1(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, continuation, 0);
            case 1:
                return new AfterpaySearchPresenter$models$1(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, continuation, 1);
            case 2:
                return new AfterpaySearchPresenter$models$1(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, continuation, 2);
            case 3:
                return new AfterpaySearchPresenter$models$1(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, continuation, 3);
            case 4:
                return new AfterpaySearchPresenter$models$1(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, continuation, 4);
            default:
                return new AfterpaySearchPresenter$models$1(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AfterpaySearchPresenter$models$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$models$performSearch(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$models$performSearch(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$models$performSearch(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$models$performSearch(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$models$performSearch(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (LocalHomePresenter.access$models$performSearch(this.$filterSelections, this.this$0, this.$emptyQueryFilterResponse, this.$updateInProgress$delegate, this.$query$delegate, this.$isDataRequestFailure$delegate, this.$response$delegate, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i6 != 1) {
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
