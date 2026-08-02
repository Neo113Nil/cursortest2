package ru.yandex.taxi.preorder.tollroad;

import defpackage.dms;
import defpackage.drz0;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ntj0;
import defpackage.ntk0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.quk0;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lquk0;", "roadsTariffsInfo", "Lpex0;", "selectedTariff", "", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "lastRoutes", "", "isTollRoadSelected", "Lntk0;", "<anonymous>", "(Lquk0;Lpex0;Ljava/util/List;Z)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.TollRoadsDialogInteractor$roadOptionsFlow$3", f = "TollRoadsDialogInteractor.kt", l = {HProv.PP_CONTAINER_DEFAULT, 143}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TollRoadsDialogInteractor$roadOptionsFlow$3 extends SuspendLambda implements dms {
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadsDialogInteractor$roadOptionsFlow$3(o oVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = oVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        TollRoadsDialogInteractor$roadOptionsFlow$3 tollRoadsDialogInteractor$roadOptionsFlow$3 = new TollRoadsDialogInteractor$roadOptionsFlow$3(this.this$0, (Continuation) obj5);
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$0 = (quk0) obj;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$1 = (pex0) obj2;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$2 = (List) obj3;
        tollRoadsDialogInteractor$roadOptionsFlow$3.Z$0 = booleanValue;
        return tollRoadsDialogInteractor$roadOptionsFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RoadType roadType;
        int i;
        drz0 drz0Var;
        Object a;
        Object[] objArr;
        Object[] objArr2;
        Object b;
        Object[] objArr3;
        Object[] objArr4;
        TollRoadsDialogInteractor$roadOptionsFlow$3 tollRoadsDialogInteractor$roadOptionsFlow$3 = this;
        quk0 quk0Var = (quk0) tollRoadsDialogInteractor$roadOptionsFlow$3.L$0;
        pex0 pex0Var = (pex0) tollRoadsDialogInteractor$roadOptionsFlow$3.L$1;
        List list = (List) tollRoadsDialogInteractor$roadOptionsFlow$3.L$2;
        boolean z = tollRoadsDialogInteractor$roadOptionsFlow$3.Z$0;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tollRoadsDialogInteractor$roadOptionsFlow$3.label;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.b.b(obj);
            RoadRestriction b2 = tollRoadsDialogInteractor$roadOptionsFlow$3.this$0.b.b();
            boolean f = tollRoadsDialogInteractor$roadOptionsFlow$3.this$0.b.f();
            if (f) {
                roadType = RoadType.TOLL;
            } else {
                if (f) {
                    w511.b();
                    return null;
                }
                roadType = RoadType.FREE;
            }
            drz0 drz0Var2 = new drz0(pex0Var, roadType);
            Object[] objArr5 = new ntk0[2];
            o oVar = tollRoadsDialogInteractor$roadOptionsFlow$3.this$0;
            ntj0 ntj0Var = quk0Var.a;
            int intValue = ((Number) oVar.b.d.getValue()).intValue();
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$0 = quk0Var;
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$1 = null;
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$2 = list;
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$3 = null;
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$4 = null;
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$5 = drz0Var2;
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$6 = objArr5;
            tollRoadsDialogInteractor$roadOptionsFlow$3.L$7 = objArr5;
            tollRoadsDialogInteractor$roadOptionsFlow$3.Z$0 = z;
            i = 0;
            tollRoadsDialogInteractor$roadOptionsFlow$3.I$0 = 0;
            tollRoadsDialogInteractor$roadOptionsFlow$3.label = 1;
            drz0Var = drz0Var2;
            a = o.a(oVar, ntj0Var, drz0Var, list, intValue, b2, z, tollRoadsDialogInteractor$roadOptionsFlow$3);
            z = z;
            tollRoadsDialogInteractor$roadOptionsFlow$3 = tollRoadsDialogInteractor$roadOptionsFlow$3;
            if (a != obj2) {
                objArr = objArr5;
                objArr2 = objArr5;
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = tollRoadsDialogInteractor$roadOptionsFlow$3.I$0;
            Object[] objArr6 = (ntk0[]) tollRoadsDialogInteractor$roadOptionsFlow$3.L$7;
            objArr3 = (ntk0[]) tollRoadsDialogInteractor$roadOptionsFlow$3.L$6;
            kotlin.b.b(obj);
            objArr4 = objArr6;
            b = obj;
            objArr4[i3] = b;
            return j73.A(objArr3);
        }
        int i4 = tollRoadsDialogInteractor$roadOptionsFlow$3.I$0;
        Object[] objArr7 = (ntk0[]) tollRoadsDialogInteractor$roadOptionsFlow$3.L$7;
        Object[] objArr8 = (ntk0[]) tollRoadsDialogInteractor$roadOptionsFlow$3.L$6;
        drz0 drz0Var3 = (drz0) tollRoadsDialogInteractor$roadOptionsFlow$3.L$5;
        kotlin.b.b(obj);
        i = i4;
        objArr2 = objArr8;
        drz0Var = drz0Var3;
        a = obj;
        objArr = objArr7;
        objArr[i] = a;
        o oVar2 = tollRoadsDialogInteractor$roadOptionsFlow$3.this$0;
        ntj0 ntj0Var2 = quk0Var.b;
        int intValue2 = ((Number) oVar2.b.c.getValue()).intValue();
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$0 = null;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$1 = null;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$2 = null;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$3 = null;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$4 = null;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$5 = null;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$6 = objArr2;
        tollRoadsDialogInteractor$roadOptionsFlow$3.L$7 = objArr2;
        tollRoadsDialogInteractor$roadOptionsFlow$3.Z$0 = z;
        tollRoadsDialogInteractor$roadOptionsFlow$3.I$0 = 1;
        tollRoadsDialogInteractor$roadOptionsFlow$3.label = 2;
        b = o.b(oVar2, ntj0Var2, drz0Var, intValue2, list, z, tollRoadsDialogInteractor$roadOptionsFlow$3);
        if (b != obj2) {
            objArr3 = objArr2;
            objArr4 = objArr2;
            objArr4[i3] = b;
            return j73.A(objArr3);
        }
        return obj2;
    }
}
