package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import defpackage.j9p0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderActionListFactory$isZoneWithBikesEnabled$1", f = "ScootersDetailedOrderActionListFactory.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderActionListFactory$isZoneWithBikesEnabled$1 extends SuspendLambda implements tls {
    final /* synthetic */ j9p0 $scootersZoneWithBikesExperimentRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderActionListFactory$isZoneWithBikesEnabled$1(j9p0 j9p0Var, Continuation continuation) {
        super(1, continuation);
        this.$scootersZoneWithBikesExperimentRepository = j9p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersDetailedOrderActionListFactory$isZoneWithBikesEnabled$1(this.$scootersZoneWithBikesExperimentRepository, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersDetailedOrderActionListFactory$isZoneWithBikesEnabled$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        j9p0 j9p0Var = this.$scootersZoneWithBikesExperimentRepository;
        this.label = 1;
        Object b = j9p0Var.a.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
