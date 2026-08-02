package ru.yandex.taxi.layers.source.factory;

import defpackage.g3e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lnm40;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.PolygonsFactory$createPolygons$2$1", f = "PolygonsFactory.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PolygonsFactory$createPolygons$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<g3e0> $features;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonsFactory$createPolygons$2$1(List list, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$features = list;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolygonsFactory$createPolygons$2$1 polygonsFactory$createPolygons$2$1 = new PolygonsFactory$createPolygons$2$1(this.$features, this.this$0, continuation);
        polygonsFactory$createPolygons$2$1.L$0 = obj;
        return polygonsFactory$createPolygons$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolygonsFactory$createPolygons$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<g3e0> list = this.$features;
            d dVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new PolygonsFactory$createPolygons$2$1$1$1(dVar, (g3e0) it.next(), null), 3));
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
