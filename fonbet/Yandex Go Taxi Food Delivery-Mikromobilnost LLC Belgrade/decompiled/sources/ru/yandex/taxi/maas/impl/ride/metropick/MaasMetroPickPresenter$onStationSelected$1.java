package ru.yandex.taxi.maas.impl.ride.metropick;

import defpackage.atd0;
import defpackage.j7u0;
import defpackage.jst;
import defpackage.lmo;
import defpackage.mvg;
import defpackage.n100;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.ssd0;
import defpackage.svd0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickPresenter$onStationSelected$1", f = "MaasMetroPickPresenter.kt", l = {81, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class MaasMetroPickPresenter$onStationSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ j7u0 $station;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasMetroPickPresenter$onStationSelected$1(a aVar, j7u0 j7u0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$station = j7u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasMetroPickPresenter$onStationSelected$1(this.this$0, this.$station, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasMetroPickPresenter$onStationSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object y;
        pv0 pv0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((n100) this.this$0.Dg()).anchor();
                lmo lmoVar = (lmo) kotlin.collections.a.R(this.$station.a);
                if (lmoVar == null) {
                    return zy11Var;
                }
                ssd0 ssd0Var = lmoVar.b.a;
                zzs zzsVar = new zzs(ssd0Var.a, ssd0Var.b, 0, null, null, 28);
                ((n100) this.this$0.Dg()).setDoneEnabled(false);
                aVar = this.this$0;
                tpr a = atd0.a(aVar.C, zzsVar, RoutePointType.POINT_B);
                this.L$0 = null;
                this.L$1 = aVar;
                this.label = 1;
                y = e.y(a, this);
                if (y == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) this.L$2;
                    aVar = (a) this.L$1;
                    kotlin.b.b(obj);
                    ((n100) aVar.Dg()).setDoneEnabled(true);
                    aVar.F.I(pv0Var.a);
                    return zy11Var;
                }
                aVar = (a) this.L$1;
                kotlin.b.b(obj);
                y = obj;
            }
            pv0 pv0Var2 = (pv0) y;
            svd0 svd0Var = aVar.D;
            this.L$0 = null;
            this.L$1 = aVar;
            this.L$2 = pv0Var2;
            this.label = 2;
            if (((ru.yandex.taxi.preorder.source.sourcepointzone.a) svd0Var).a(pv0Var2, true, this) != coroutineSingletons) {
                pv0Var = pv0Var2;
                ((n100) aVar.Dg()).setDoneEnabled(true);
                aVar.F.I(pv0Var.a);
                return zy11Var;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "error when maas point decoding");
            return zy11Var;
        }
    }
}
