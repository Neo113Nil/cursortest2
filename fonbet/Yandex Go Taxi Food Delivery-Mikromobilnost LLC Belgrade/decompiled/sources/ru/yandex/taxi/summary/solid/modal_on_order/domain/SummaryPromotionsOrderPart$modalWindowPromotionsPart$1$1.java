package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.abu0;
import defpackage.c2n0;
import defpackage.egi;
import defpackage.flv0;
import defpackage.fnx0;
import defpackage.hlv0;
import defpackage.hxx;
import defpackage.ilv0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.sls;
import defpackage.tse;
import defpackage.vsc;
import defpackage.w511;
import defpackage.wls;
import defpackage.x880;
import defpackage.zau0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1", f = "SummaryPromotionsOrderPart.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ x880 $chainCallback;
    final /* synthetic */ ilv0 $summaryModalWindow;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((x880) this.receiver).n();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((x880) this.receiver).o();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1(ilv0 ilv0Var, c cVar, x880 x880Var, Continuation continuation) {
        super(2, continuation);
        this.$summaryModalWindow = ilv0Var;
        this.this$0 = cVar;
        this.$chainCallback = x880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1(this.$summaryModalWindow, this.this$0, this.$chainCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1 summaryPromotionsOrderPart$modalWindowPromotionsPart$1$1 = (SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summaryPromotionsOrderPart$modalWindowPromotionsPart$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ilv0 ilv0Var = this.$summaryModalWindow;
        boolean z = ilv0Var instanceof flv0;
        zy11 zy11Var = zy11.a;
        if (z) {
            this.this$0.e.a((flv0) ilv0Var, new AnonymousClass1(0, this.$chainCallback, x880.class, "onAccept", "onAccept()V", 0), new AnonymousClass2(0, this.$chainCallback, x880.class, "onReject", "onReject()V", 0));
            this.this$0.c.b(((flv0) this.$summaryModalWindow).a);
            return zy11Var;
        }
        if (!(ilv0Var instanceof hlv0)) {
            w511.b();
            return null;
        }
        fnx0 n = ((k) this.this$0.i).n();
        if (n != null && (mi31Var = n.a) != null) {
            c cVar = this.this$0;
            oep0 oep0Var = cVar.h;
            abu0 abu0Var = (abu0) cVar.g.get();
            x880 x880Var = this.$chainCallback;
            c2n0 c2n0Var = new c2n0(3, abu0Var, new egi(x880Var, 3), new egi(x880Var, 4));
            hlv0 hlv0Var = (hlv0) this.$summaryModalWindow;
            ((pep0) oep0Var).f(c2n0Var, new zau0(hlv0Var.b, new vsc(hlv0Var.a, CommunicationModalAnalyticsData$ModalType.STEPS, mi31Var.f, mi31Var.b, mi31Var.g, mi31Var.a.J0.b.a())), hxx.a);
            this.this$0.c.b(((hlv0) this.$summaryModalWindow).a);
        }
        return zy11Var;
    }
}
