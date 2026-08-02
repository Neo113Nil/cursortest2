package ru.yandex.taxi.summary.requirements.list.ui;

import defpackage.lmw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vot0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.ui.SpecialNeedsPresenter$processBanners$1", f = "SpecialNeedsPresenter.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SpecialNeedsPresenter$processBanners$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<lmw0> $requirements;
    int label;
    final /* synthetic */ vot0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialNeedsPresenter$processBanners$1(vot0 vot0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vot0Var;
        this.$requirements = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpecialNeedsPresenter$processBanners$1(this.this$0, this.$requirements, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpecialNeedsPresenter$processBanners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.summary.requirements.list.router.a aVar = this.this$0.D;
            List<lmw0> list = this.$requirements;
            this.label = 1;
            if (aVar.c.c(list, this) == coroutineSingletons) {
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
