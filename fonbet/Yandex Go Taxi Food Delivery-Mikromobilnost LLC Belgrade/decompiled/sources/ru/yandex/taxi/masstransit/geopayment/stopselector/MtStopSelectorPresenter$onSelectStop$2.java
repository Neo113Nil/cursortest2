package ru.yandex.taxi.masstransit.geopayment.stopselector;

import defpackage.k1a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ohu0;
import defpackage.s340;
import defpackage.tse;
import defpackage.vqy;
import defpackage.wls;
import defpackage.ygu0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorPresenter$onSelectStop$2", f = "MtStopSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopSelectorPresenter$onSelectStop$2 extends SuspendLambda implements wls {
    final /* synthetic */ ygu0 $stopItem;
    int label;
    final /* synthetic */ s340 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopSelectorPresenter$onSelectStop$2(s340 s340Var, ygu0 ygu0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s340Var;
        this.$stopItem = ygu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopSelectorPresenter$onSelectStop$2(this.this$0, this.$stopItem, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtStopSelectorPresenter$onSelectStop$2 mtStopSelectorPresenter$onSelectStop$2 = (MtStopSelectorPresenter$onSelectStop$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtStopSelectorPresenter$onSelectStop$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s340 s340Var = this.this$0;
        String str = ((ohu0) s340Var.E.d.getValue()).d;
        String id = this.$stopItem.getId();
        String str2 = ((ohu0) this.this$0.E.d.getValue()).e;
        Object a = this.this$0.E.a();
        k1a k1aVar = (k1a) s340Var.x.a;
        if (k1aVar.u()) {
            k1aVar.r(new vqy(str, id, str2, a, 7));
        }
        return zy11.a;
    }
}
