package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import defpackage.bpv0;
import defpackage.bvf0;
import defpackage.cpv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.sourcedestination.SummarySourceDestinationViewHolderDelegate$observeData$4", f = "SummarySourceDestinationViewHolderDelegate.kt", l = {371}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummarySourceDestinationViewHolderDelegate$observeData$4 extends SuspendLambda implements wls {
    final /* synthetic */ b $viewHolder;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cpv0 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzy11;", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "<anonymous>", "(VLru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.summary.solid.sourcedestination.SummarySourceDestinationViewHolderDelegate$observeData$4$1", f = "SummarySourceDestinationViewHolderDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.summary.solid.sourcedestination.SummarySourceDestinationViewHolderDelegate$observeData$4$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummarySourceDestinationViewHolderDelegate$observeData$4(cpv0 cpv0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cpv0Var;
        this.$viewHolder = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummarySourceDestinationViewHolderDelegate$observeData$4(this.this$0, this.$viewHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummarySourceDestinationViewHolderDelegate$observeData$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 m0Var = new m0(this.this$0.n.b(bvf0.c(Boolean.FALSE)), this.this$0.s.a(), new AnonymousClass1(3, null));
            b bVar = this.$viewHolder;
            o oVar = new o(m0Var, new SummarySourceDestinationViewHolderDelegate$observeData$4$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            bpv0 bpv0Var = new bpv0(bVar, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(bpv0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
