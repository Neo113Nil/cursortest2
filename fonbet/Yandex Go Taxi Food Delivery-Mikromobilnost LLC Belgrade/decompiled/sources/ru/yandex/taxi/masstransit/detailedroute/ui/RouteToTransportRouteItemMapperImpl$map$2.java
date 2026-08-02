package ru.yandex.taxi.masstransit.detailedroute.ui;

import defpackage.fay0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "Lrw30;", "", "", "it", "", "Lh711;", "<anonymous>", "(Lkotlin/Pair;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.RouteToTransportRouteItemMapperImpl$map$2", f = "RouteToTransportRouteItemMapperImpl.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteToTransportRouteItemMapperImpl$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $enableV2Design;
    final /* synthetic */ fay0 $taxiSectionData;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteToTransportRouteItemMapperImpl$map$2(f fVar, fay0 fay0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$taxiSectionData = fay0Var;
        this.$enableV2Design = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteToTransportRouteItemMapperImpl$map$2 routeToTransportRouteItemMapperImpl$map$2 = new RouteToTransportRouteItemMapperImpl$map$2(this.this$0, this.$taxiSectionData, this.$enableV2Design, continuation);
        routeToTransportRouteItemMapperImpl$map$2.L$0 = obj;
        return routeToTransportRouteItemMapperImpl$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteToTransportRouteItemMapperImpl$map$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
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
        f fVar = this.this$0;
        fay0 fay0Var = this.$taxiSectionData;
        boolean z = this.$enableV2Design;
        this.L$0 = null;
        this.label = 1;
        Serializable a = f.a(fVar, pair, fay0Var, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
