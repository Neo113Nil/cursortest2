package ru.yandex.taxi.preorder.summary.solid;

import defpackage.egv0;
import defpackage.m6t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Legv0;", ClidProvider.STATE, "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lzy11;", "<anonymous>", "(Legv0;Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$35", f = "SolidSummaryPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryPresenter$attachView$35 extends SuspendLambda implements zls {
    final /* synthetic */ m6t0 $mvpView;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryPresenter$attachView$35(m6t0 m6t0Var, Continuation continuation) {
        super(3, continuation);
        this.$mvpView = m6t0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SolidSummaryPresenter$attachView$35 solidSummaryPresenter$attachView$35 = new SolidSummaryPresenter$attachView$35(this.$mvpView, (Continuation) obj3);
        solidSummaryPresenter$attachView$35.L$0 = (egv0) obj;
        zy11 zy11Var = zy11.a;
        solidSummaryPresenter$attachView$35.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        egv0 egv0Var = (egv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$mvpView.ba(egv0Var);
        return zy11.a;
    }
}
