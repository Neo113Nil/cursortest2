package ru.yandex.taxi.preorder.summary.solid;

import com.yandex.go.zone.dto.objects.VerticalMode;
import defpackage.jl40;
import defpackage.m6t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p81;
import defpackage.q6t0;
import defpackage.r6t0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.xev0;
import defpackage.yev0;
import defpackage.zev0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorView$SelectorMargin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$23", f = "SolidSummaryPresenter.kt", l = {1109}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryPresenter$attachView$23 extends SuspendLambda implements wls {
    final /* synthetic */ m6t0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$23$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements zls {
        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            VerticalMode verticalMode = (VerticalMode) obj;
            zev0 zev0Var = (zev0) obj2;
            if (((l) this.receiver).E0.a instanceof p81) {
                return TariffsSelectorView$SelectorMargin.SMALL;
            }
            int i = q6t0.a[verticalMode.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return TariffsSelectorView$SelectorMargin.USUAL;
                }
                w511.b();
                return null;
            }
            if (jl40.l(zev0Var, xev0.a)) {
                return TariffsSelectorView$SelectorMargin.USUAL;
            }
            if (jl40.l(zev0Var, yev0.a)) {
                return TariffsSelectorView$SelectorMargin.SMALL;
            }
            w511.b();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryPresenter$attachView$23(l lVar, m6t0 m6t0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$mvpView = m6t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryPresenter$attachView$23(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryPresenter$attachView$23) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new m0(this.this$0.W.b(), this.this$0.q0.O(null), new AnonymousClass1(3, this.this$0, l.class, "mapTariffsSelectorMargins", "mapTariffsSelectorMargins(Lcom/yandex/go/zone/dto/objects/VerticalMode;Lcom/yandex/go/taxi/summary/shared/sourcedestination/SummaryControlState;)Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/TariffsSelectorView$SelectorMargin;", 4)));
            this.this$0.E.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
            m6t0 m6t0Var = this.$mvpView;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(F, new SolidSummaryPresenter$attachView$23$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            r6t0 r6t0Var = new r6t0(m6t0Var, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(r6t0Var, this) == coroutineSingletons) {
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
