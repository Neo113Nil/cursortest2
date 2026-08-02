package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import defpackage.bvf0;
import defpackage.hmv0;
import defpackage.imv0;
import defpackage.m051;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p230;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.x880;
import defpackage.z051;
import defpackage.zkv0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhmv0;", "<anonymous>", "(Ltse;)Lhmv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionOnOrderModelMapper$toDomainModel$2", f = "SummaryPromotionOnOrderModelMapper.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionOnOrderModelMapper$toDomainModel$2 extends SuspendLambda implements wls {
    final /* synthetic */ x880 $chainCallback;
    final /* synthetic */ zkv0 $promotion;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ imv0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionOnOrderModelMapper$toDomainModel$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((x880) this.receiver).n();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionOnOrderModelMapper$toDomainModel$2$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((x880) this.receiver).o();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionOnOrderModelMapper$toDomainModel$2(zkv0 zkv0Var, imv0 imv0Var, x880 x880Var, Continuation continuation) {
        super(2, continuation);
        this.$promotion = zkv0Var;
        this.this$0 = imv0Var;
        this.$chainCallback = x880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionOnOrderModelMapper$toDomainModel$2(this.$promotion, this.this$0, this.$chainCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionOnOrderModelMapper$toDomainModel$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zkv0 zkv0Var = this.$promotion;
            z051 z051Var = zkv0Var.f;
            List list = z051Var instanceof m051 ? ((m051) z051Var).a : EmptyList.a;
            imv0 imv0Var = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            imv0Var.getClass();
            obj = bvf0.n(new SummaryPromotionOnOrderModelMapper$mapUIState$2(zkv0Var, list, imv0Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new hmv0((p230) obj, new AnonymousClass1(0, this.$chainCallback, x880.class, "onAccept", "onAccept()V", 0), new AnonymousClass2(0, this.$chainCallback, x880.class, "onReject", "onReject()V", 0));
    }
}
