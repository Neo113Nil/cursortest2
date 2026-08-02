package ru.yandex.taxi.locationsdk.common_utils;

import defpackage.idn;
import defpackage.mvg;
import defpackage.nqr;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.common_utils.FlowUtilsKt$bufferItemsBy$1", f = "flowUtils.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class FlowUtilsKt$bufferItemsBy$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $interval;
    final /* synthetic */ tpr $this_bufferItemsBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "ru.yandex.taxi.locationsdk.common_utils.FlowUtilsKt$bufferItemsBy$1$1", f = "flowUtils.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: ru.yandex.taxi.locationsdk.common_utils.FlowUtilsKt$bufferItemsBy$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ y6f0 $$this$channelFlow;
        final /* synthetic */ Ref$ObjectRef<List<Object>> $buffer;
        final /* synthetic */ long $interval;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Ref$ObjectRef ref$ObjectRef, y6f0 y6f0Var, Continuation continuation) {
            super(2, continuation);
            this.$interval = j;
            this.$buffer = ref$ObjectRef;
            this.$$this$channelFlow = y6f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$interval, this.$buffer, this.$$this$channelFlow, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                long j = this.$interval;
                rol0 rol0Var = new rol0(new FlowUtilsKt$tickerFlow$1(j, j, null));
                idn idnVar = new idn(3, this.$buffer, this.$$this$channelFlow);
                this.label = 1;
                if (rol0Var.collect(idnVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowUtilsKt$bufferItemsBy$1(tpr tprVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$this_bufferItemsBy = tprVar;
        this.$interval = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowUtilsKt$bufferItemsBy$1 flowUtilsKt$bufferItemsBy$1 = new FlowUtilsKt$bufferItemsBy$1(this.$this_bufferItemsBy, this.$interval, continuation);
        flowUtilsKt$bufferItemsBy$1.L$0 = obj;
        return flowUtilsKt$bufferItemsBy$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowUtilsKt$bufferItemsBy$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            z.element = new ArrayList();
            tje.N(y6f0Var, null, null, new AnonymousClass1(this.$interval, z, y6f0Var, null), 3);
            tpr tprVar = this.$this_bufferItemsBy;
            nqr nqrVar = new nqr(1, z);
            this.L$0 = y6f0Var;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(nqrVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ((x6f0) y6f0Var).l(null);
        return zy11.a;
    }
}
