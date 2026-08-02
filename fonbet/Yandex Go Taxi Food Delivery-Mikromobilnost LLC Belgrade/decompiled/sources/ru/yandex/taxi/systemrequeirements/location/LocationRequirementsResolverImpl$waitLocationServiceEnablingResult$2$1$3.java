package ru.yandex.taxi.systemrequeirements.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$3", f = "LocationRequirementsResolverImpl.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$3(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2$1$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        n0 n0Var = this.this$0.g;
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(n0Var, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
