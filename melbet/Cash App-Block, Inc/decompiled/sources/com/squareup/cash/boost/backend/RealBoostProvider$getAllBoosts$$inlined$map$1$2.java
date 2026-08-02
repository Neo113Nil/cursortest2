package com.squareup.cash.boost.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.db.RewardWithSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RealBoostProvider$getAllBoosts$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ RealBoostProvider this$0;

    /* renamed from: com.squareup.cash.boost.backend.RealBoostProvider$getAllBoosts$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return RealBoostProvider$getAllBoosts$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealBoostProvider$getAllBoosts$$inlined$map$1$2(FlowCollector flowCollector, RealBoostProvider realBoostProvider, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = realBoostProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        RealBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1 realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        RealBoostProvider realBoostProvider = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            long millis = realBoostProvider.clock.millis();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : (List) obj) {
                                Long l = ((RewardWithSelection) obj3).expiration_date_time_ms;
                                if ((l != null ? l.longValue() : Long.MAX_VALUE) > millis) {
                                    arrayList.add(obj3);
                                }
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            default:
                if (continuation instanceof RealBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1) {
                    realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1 = (RealBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1) continuation;
                    int i5 = realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj4 = realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            long millis2 = realBoostProvider.clock.millis();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : (List) obj) {
                                Long l2 = ((RewardWithSelection) obj5).expiration_date_time_ms;
                                if ((l2 != null ? l2.longValue() : Long.MAX_VALUE) > millis2) {
                                    arrayList2.add(obj5);
                                }
                            }
                            realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList2, realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1 = new RealBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj42 = realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realBoostProvider$getSelectableBoosts$lambda$0$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
