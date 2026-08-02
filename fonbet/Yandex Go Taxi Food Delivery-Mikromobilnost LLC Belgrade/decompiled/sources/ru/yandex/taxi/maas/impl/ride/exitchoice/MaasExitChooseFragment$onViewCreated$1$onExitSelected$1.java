package ru.yandex.taxi.maas.impl.ride.exitchoice;

import defpackage.atd0;
import defpackage.h100;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseFragment$onViewCreated$1$onExitSelected$1", f = "MaasExitChooseFragment.kt", l = {90, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasExitChooseFragment$onViewCreated$1$onExitSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MaasExitChooseFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasExitChooseFragment$onViewCreated$1$onExitSelected$1(MaasExitChooseFragment maasExitChooseFragment, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = maasExitChooseFragment;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasExitChooseFragment$onViewCreated$1$onExitSelected$1(this.this$0, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasExitChooseFragment$onViewCreated$1$onExitSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MaasExitChooseFragment maasExitChooseFragment;
        Object y;
        MaasExitChooseFragment maasExitChooseFragment2;
        pv0 pv0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "error when maas point decoding");
        }
        if (i == 0) {
            kotlin.b.b(obj);
            maasExitChooseFragment = this.this$0;
            tpr c = atd0.c(maasExitChooseFragment.getPointAddressDecoder(), this.$geoPoint, RoutePointType.POINT_B, null, null, null, null, 56);
            this.L$0 = maasExitChooseFragment;
            this.label = 1;
            y = e.y(c, this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pv0Var = (pv0) this.L$1;
                maasExitChooseFragment2 = (MaasExitChooseFragment) this.L$0;
                kotlin.b.b(obj);
                maasExitChooseFragment2.moveCameraToAddress(pv0Var);
                ((h100) maasExitChooseFragment2.requireCallback()).a = pv0Var;
                return zy11.a;
            }
            MaasExitChooseFragment maasExitChooseFragment3 = (MaasExitChooseFragment) this.L$0;
            kotlin.b.b(obj);
            y = obj;
            maasExitChooseFragment = maasExitChooseFragment3;
        }
        pv0 pv0Var2 = (pv0) y;
        svd0 pointZoneInteractor = maasExitChooseFragment.getPointZoneInteractor();
        this.L$0 = maasExitChooseFragment;
        this.L$1 = pv0Var2;
        this.label = 2;
        if (((ru.yandex.taxi.preorder.source.sourcepointzone.a) pointZoneInteractor).a(pv0Var2, true, this) != coroutineSingletons) {
            maasExitChooseFragment2 = maasExitChooseFragment;
            pv0Var = pv0Var2;
            maasExitChooseFragment2.moveCameraToAddress(pv0Var);
            ((h100) maasExitChooseFragment2.requireCallback()).a = pv0Var;
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
