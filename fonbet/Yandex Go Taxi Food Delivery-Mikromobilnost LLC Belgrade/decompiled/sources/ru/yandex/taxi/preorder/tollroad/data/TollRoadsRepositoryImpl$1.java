package ru.yandex.taxi.preorder.tollroad.data;

import defpackage.fnx0;
import defpackage.moz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vug;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "it", "Lzy11;", "<anonymous>", "(Lfnx0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.data.TollRoadsRepositoryImpl$1", f = "TollRoadsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TollRoadsRepositoryImpl$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadsRepositoryImpl$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TollRoadsRepositoryImpl$1 tollRoadsRepositoryImpl$1 = new TollRoadsRepositoryImpl$1(this.this$0, continuation);
        tollRoadsRepositoryImpl$1.L$0 = obj;
        return tollRoadsRepositoryImpl$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TollRoadsRepositoryImpl$1 tollRoadsRepositoryImpl$1 = (TollRoadsRepositoryImpl$1) create((fnx0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tollRoadsRepositoryImpl$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        pex0 pex0Var = fnx0Var.c;
        boolean z = eVar.b() != RoadRestriction.TOLL_ONLY;
        boolean z2 = eVar.a().size() > 1;
        boolean z3 = pex0Var.X;
        boolean z4 = !z3;
        if (z && z2 && !z3) {
            eVar.e(false, TollRoadSetReason.SELECTED_TARIFF_CHANGED);
        } else {
            moz0 moz0Var = eVar.b;
            moz0Var.getClass();
            com.yandex.go.analytics.b bVar = moz0Var.a;
            bVar.getClass();
            vug vugVar = new vug(bVar, "TollRoad.onSelectedTariffChanged");
            vugVar.g("noRestrictions", z);
            vugVar.g("hasDifferentRoads", z2);
            vugVar.g("tollRoadIsNotEnabled", z4);
            vugVar.m();
        }
        return zy11.a;
    }
}
