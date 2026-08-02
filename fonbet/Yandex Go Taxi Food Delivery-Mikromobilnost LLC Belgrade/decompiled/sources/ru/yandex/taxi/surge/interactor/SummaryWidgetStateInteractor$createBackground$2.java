package ru.yandex.taxi.surge.interactor;

import android.content.Context;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.trv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetStateInteractor$createBackground$2", f = "SummaryWidgetStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetStateInteractor$createBackground$2 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $color;
    int label;
    final /* synthetic */ trv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetStateInteractor$createBackground$2(Integer num, trv0 trv0Var, Continuation continuation) {
        super(2, continuation);
        this.$color = num;
        this.this$0 = trv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryWidgetStateInteractor$createBackground$2(this.$color, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetStateInteractor$createBackground$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Integer num = this.$color;
        trv0 trv0Var = this.this$0;
        if (num == null) {
            ru.yandex.taxi.design.utils.a aVar = trv0Var.c;
            Context context = trv0Var.f;
            int r = tje.r(mrg0.go_design_m_space, context);
            Context context2 = this.this$0.f;
            return gtq0.v(aVar, context, r, new hgr0(0.0f, tje.w(8, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowBottom)), 0, 24);
        }
        ru.yandex.taxi.design.utils.a aVar2 = trv0Var.c;
        Context context3 = trv0Var.f;
        int r2 = tje.r(mrg0.go_design_m_space, context3);
        Context context4 = this.this$0.f;
        return gtq0.v(aVar2, context3, r2, new hgr0(0.0f, tje.w(8, context4), tje.w(20, context4), qje.u(context4.getTheme(), xng0.effectShadowBottom)), this.$color.intValue(), 8);
    }
}
