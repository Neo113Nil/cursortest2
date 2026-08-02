package ru.yandex.taxi.layers.source.factory;

import defpackage.g3e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lshs0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.PolygonsFactory$createMultiplePolygon$singlePolygons$1", f = "PolygonsFactory.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PolygonsFactory$createMultiplePolygon$singlePolygons$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<List<List<zzs>>> $coordinates;
    final /* synthetic */ g3e0 $polygonFeature;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonsFactory$createMultiplePolygon$singlePolygons$1(g3e0 g3e0Var, List list, Continuation continuation, d dVar) {
        super(2, continuation);
        this.$coordinates = list;
        this.this$0 = dVar;
        this.$polygonFeature = g3e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolygonsFactory$createMultiplePolygon$singlePolygons$1 polygonsFactory$createMultiplePolygon$singlePolygons$1 = new PolygonsFactory$createMultiplePolygon$singlePolygons$1(this.$polygonFeature, this.$coordinates, continuation, this.this$0);
        polygonsFactory$createMultiplePolygon$singlePolygons$1.L$0 = obj;
        return polygonsFactory$createMultiplePolygon$singlePolygons$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolygonsFactory$createMultiplePolygon$singlePolygons$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<List<List<zzs>>> list = this.$coordinates;
            d dVar = this.this$0;
            g3e0 g3e0Var = this.$polygonFeature;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new PolygonsFactory$createMultiplePolygon$singlePolygons$1$1$1(g3e0Var, (List) it.next(), null, dVar), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
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
        return kotlin.collections.a.M((Iterable) obj);
    }
}
