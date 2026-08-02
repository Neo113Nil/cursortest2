package com.squareup.cash.pools.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $searchTerm$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(int i, MutableState mutableState, Continuation continuation, Flow flow) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow = flow;
        this.$searchTerm$delegate$inlined = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$searchTerm$delegate$inlined;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(0, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$1;
            case 1:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$12 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(1, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$12;
            case 2:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$13 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(2, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$13.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$13;
            case 3:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$14 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(3, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$14.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$14;
            case 4:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$15 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(4, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$15.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$15;
            case 5:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$16 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(5, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$16.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$16;
            case 6:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$17 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(6, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$17.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$17;
            case 7:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$18 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(7, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$18.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$18;
            case 8:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$19 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(8, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$19.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$19;
            default:
                PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1 poolInvitePeopleListPresenter$models$$inlined$CollectEffect$110 = new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(9, mutableState, continuation, flow);
                poolInvitePeopleListPresenter$models$$inlined$CollectEffect$110.L$0 = obj;
                return poolInvitePeopleListPresenter$models$$inlined$CollectEffect$110;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 8;
        MutableState mutableState = this.$searchTerm$delegate$inlined;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(coroutineScope, mutableState, 26);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass12 = new MusicPresenter$models$2$1.AnonymousClass1(coroutineScope2, mutableState, 6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass13 = new MusicPresenter$models$2$1.AnonymousClass1(coroutineScope3, mutableState, 7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass13, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass14 = new MusicPresenter$models$2$1.AnonymousClass1(coroutineScope4, mutableState, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass14, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass15 = new MusicPresenter$models$2$1.AnonymousClass1(coroutineScope5, mutableState, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass15, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass16 = new MusicPresenter$models$2$1.AnonymousClass1(coroutineScope6, mutableState, 14);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass16, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass17 = new MusicPresenter$models$2$1.AnonymousClass1(coroutineScope7, mutableState, 27);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass17, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(coroutineScope8, mutableState, 5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(shareSheetPresenter$models$1$1$5, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$52 = new ShareSheetPresenter$models$1$1$5(coroutineScope9, mutableState, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(shareSheetPresenter$models$1$1$52, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$53 = new ShareSheetPresenter$models$1$1$5(coroutineScope10, mutableState, 9);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(shareSheetPresenter$models$1$1$53, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i12 != 1) {
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
