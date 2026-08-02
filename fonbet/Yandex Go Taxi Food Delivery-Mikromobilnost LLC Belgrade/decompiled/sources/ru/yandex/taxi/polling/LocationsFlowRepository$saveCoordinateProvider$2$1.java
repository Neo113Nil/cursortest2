package ru.yandex.taxi.polling;

import defpackage.g9z;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzo;
import defpackage.tse;
import defpackage.wls;
import defpackage.xne;
import defpackage.yne;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationsFlowRepository$saveCoordinateProvider$2$1", f = "LocationsFlowRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationsFlowRepository$saveCoordinateProvider$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ yne $coordinateProvider;
    final /* synthetic */ long $maxCountCoordinates;
    final /* synthetic */ CoordinateProvider$Source $source;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationsFlowRepository$saveCoordinateProvider$2$1(yne yneVar, e eVar, CoordinateProvider$Source coordinateProvider$Source, long j, Continuation continuation) {
        super(2, continuation);
        this.$coordinateProvider = yneVar;
        this.this$0 = eVar;
        this.$source = coordinateProvider$Source;
        this.$maxCountCoordinates = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationsFlowRepository$saveCoordinateProvider$2$1(this.$coordinateProvider, this.this$0, this.$source, this.$maxCountCoordinates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LocationsFlowRepository$saveCoordinateProvider$2$1 locationsFlowRepository$saveCoordinateProvider$2$1 = (LocationsFlowRepository$saveCoordinateProvider$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        locationsFlowRepository$saveCoordinateProvider$2$1.invokeSuspend(zy11Var);
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
        xne N = rzo.N(this.$coordinateProvider);
        LinkedHashMap linkedHashMap = this.this$0.k;
        CoordinateProvider$Source coordinateProvider$Source = this.$source;
        Object obj2 = linkedHashMap.get(coordinateProvider$Source);
        if (obj2 == null) {
            obj2 = new ArrayList();
            linkedHashMap.put(coordinateProvider$Source, obj2);
        }
        List list = (List) obj2;
        if (list.size() >= this.$maxCountCoordinates) {
            xne xneVar = (xne) kp50.L(list);
            g9z g9zVar = this.this$0.f;
            CoordinateProvider$Source coordinateProvider$Source2 = this.$source;
            String str = xneVar.e;
            Objects.toString(coordinateProvider$Source2);
            g9zVar.getClass();
        }
        list.add(N);
        g9z g9zVar2 = this.this$0.f;
        CoordinateProvider$Source coordinateProvider$Source3 = this.$source;
        yne yneVar = this.$coordinateProvider;
        list.size();
        Objects.toString(coordinateProvider$Source3);
        Objects.toString(yneVar);
        g9zVar2.getClass();
        return zy11.a;
    }
}
