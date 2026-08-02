package ru.yandex.taxi.layers.source.factory;

import defpackage.g3e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u3e0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lshs0;", "<anonymous>", "(Ltse;)Lshs0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.PolygonsFactory$createMultiplePolygon$singlePolygons$1$1$1", f = "PolygonsFactory.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PolygonsFactory$createMultiplePolygon$singlePolygons$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<List<zzs>> $polygonCoordinate;
    final /* synthetic */ g3e0 $polygonFeature;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonsFactory$createMultiplePolygon$singlePolygons$1$1$1(g3e0 g3e0Var, List list, Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$polygonCoordinate = list;
        this.$polygonFeature = g3e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = this.this$0;
        return new PolygonsFactory$createMultiplePolygon$singlePolygons$1$1$1(this.$polygonFeature, this.$polygonCoordinate, continuation, dVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolygonsFactory$createMultiplePolygon$singlePolygons$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        d dVar = this.this$0;
        List<List<zzs>> list = this.$polygonCoordinate;
        u3e0 u3e0Var = this.$polygonFeature.c.a;
        this.label = 1;
        Object b = d.b(dVar, list, u3e0Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
