package ru.yandex.taxi.maas.impl.ride.metropick;

import defpackage.ik50;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n100;
import defpackage.ny61;
import defpackage.o100;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.maas.api.analytics.MultiTransportErrorAnalytics$ErrorCode;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickPresenter$requestMetro$1", f = "MaasMetroPickPresenter.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasMetroPickPresenter$requestMetro$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasMetroPickPresenter$requestMetro$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasMetroPickPresenter$requestMetro$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasMetroPickPresenter$requestMetro$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar3 = this.this$0;
                try {
                    zzs bb = ((n100) aVar3.Dg()).bb();
                    aVar3.z.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    MaasMetroPickPresenter$requestMetro$1$1$nearestMetro$1 maasMetroPickPresenter$requestMetro$1$1$nearestMetro$1 = new MaasMetroPickPresenter$requestMetro$1$1$nearestMetro$1(aVar3, bb, null);
                    this.L$0 = aVar3;
                    this.L$1 = aVar3;
                    this.L$2 = null;
                    this.label = 1;
                    Object k0 = tje.k0(mdhVar, maasMetroPickPresenter$requestMetro$1$1$nearestMetro$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = aVar3;
                    obj = k0;
                    aVar2 = aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    aVar.getClass();
                    MultiTransportErrorAnalytics$ErrorCode multiTransportErrorAnalytics$ErrorCode = !(th instanceof GoApiHttpException) ? MultiTransportErrorAnalytics$ErrorCode.Network : MultiTransportErrorAnalytics$ErrorCode.Unknown;
                    aVar.I = new o100(multiTransportErrorAnalytics$ErrorCode);
                    aVar.J = ik50.d;
                    aVar.H.q(multiTransportErrorAnalytics$ErrorCode);
                    jst.e.k(th, "error when maas nearest metro fetch");
                    ((n100) aVar.Dg()).S3(kyh0.maas_metro_error_title, kyh0.maas_metro_unknown_error, true);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    aVar.getClass();
                    if (!(th instanceof GoApiHttpException)) {
                    }
                    aVar.I = new o100(multiTransportErrorAnalytics$ErrorCode);
                    aVar.J = ik50.d;
                    aVar.H.q(multiTransportErrorAnalytics$ErrorCode);
                    jst.e.k(th, "error when maas nearest metro fetch");
                    ((n100) aVar.Dg()).S3(kyh0.maas_metro_error_title, kyh0.maas_metro_unknown_error, true);
                    return zy11.a;
                }
            }
            a.Kg(aVar2, (ik50) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
