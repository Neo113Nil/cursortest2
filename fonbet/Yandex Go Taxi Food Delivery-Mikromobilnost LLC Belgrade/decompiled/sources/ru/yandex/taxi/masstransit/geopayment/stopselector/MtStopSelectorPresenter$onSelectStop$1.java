package ru.yandex.taxi.masstransit.geopayment.stopselector;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s340;
import defpackage.tiu0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ygu0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorPresenter$onSelectStop$1", f = "MtStopSelectorPresenter.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopSelectorPresenter$onSelectStop$1 extends SuspendLambda implements wls {
    final /* synthetic */ ygu0 $stopItem;
    int label;
    final /* synthetic */ s340 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopSelectorPresenter$onSelectStop$1(s340 s340Var, ygu0 ygu0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s340Var;
        this.$stopItem = ygu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopSelectorPresenter$onSelectStop$1(this.this$0, this.$stopItem, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopSelectorPresenter$onSelectStop$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tiu0 tiu0Var = this.this$0.E;
            String id = this.$stopItem.getId();
            this.label = 1;
            if (tiu0.b(tiu0Var, id, this) == coroutineSingletons) {
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
