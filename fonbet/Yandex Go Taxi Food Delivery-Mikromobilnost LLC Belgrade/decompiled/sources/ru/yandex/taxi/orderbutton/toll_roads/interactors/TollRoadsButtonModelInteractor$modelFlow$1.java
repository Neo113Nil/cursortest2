package ru.yandex.taxi.orderbutton.toll_roads.interactors;

import defpackage.bms;
import defpackage.fnx0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wtk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfnx0;", "selection", "", "tollRoadsSelected", "Lwtk0;", "roadsLoadingState", "Lwi70;", "<anonymous>", "(Lfnx0;ZLwtk0;)Lwi70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderbutton.toll_roads.interactors.TollRoadsButtonModelInteractor$modelFlow$1", f = "TollRoadsButtonModelInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TollRoadsButtonModelInteractor$modelFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadsButtonModelInteractor$modelFlow$1(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TollRoadsButtonModelInteractor$modelFlow$1 tollRoadsButtonModelInteractor$modelFlow$1 = new TollRoadsButtonModelInteractor$modelFlow$1(this.this$0, (Continuation) obj4);
        tollRoadsButtonModelInteractor$modelFlow$1.L$0 = (fnx0) obj;
        tollRoadsButtonModelInteractor$modelFlow$1.Z$0 = booleanValue;
        tollRoadsButtonModelInteractor$modelFlow$1.L$1 = (wtk0) obj3;
        return tollRoadsButtonModelInteractor$modelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        boolean z = this.Z$0;
        wtk0 wtk0Var = (wtk0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        mi31 mi31Var = fnx0Var.a;
        this.L$0 = null;
        this.L$1 = null;
        this.Z$0 = z;
        this.label = 1;
        Object a = b.a(bVar, mi31Var, z, wtk0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
