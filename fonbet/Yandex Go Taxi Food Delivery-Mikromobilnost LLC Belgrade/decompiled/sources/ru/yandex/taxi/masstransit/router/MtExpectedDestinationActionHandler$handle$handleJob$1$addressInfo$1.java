package ru.yandex.taxi.masstransit.router;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpv0;", "<anonymous>", "(Ltse;)Lpv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1", f = "MtExpectedDestinationActionHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $addressFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1(tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$addressFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1(this.$addressFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tpr tprVar = this.$addressFlow;
                this.label = 1;
                obj = kotlinx.coroutines.flow.e.A(tprVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return (pv0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "TransportAddress", null, th, "Error when try to finalize address for expected destination", 2);
            return null;
        }
    }
}
