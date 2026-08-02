package ru.yandex.taxi.layers.source.factory;

import defpackage.fkp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llm00;", "<anonymous>", "(Ltse;)Llm00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.MapObjectFactory$createMapObjects$2$1$1", f = "MapObjectFactory.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectFactory$createMapObjects$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ fkp $feature;
    final /* synthetic */ int $index;
    final /* synthetic */ List<fkp> $validFeatures;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectFactory$createMapObjects$2$1$1(c cVar, fkp fkpVar, int i, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$feature = fkpVar;
        this.$index = i;
        this.$validFeatures = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectFactory$createMapObjects$2$1$1(this.this$0, this.$feature, this.$index, this.$validFeatures, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectFactory$createMapObjects$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        c cVar = this.this$0;
        fkp fkpVar = this.$feature;
        int i2 = this.$index;
        int size = this.$validFeatures.size();
        this.label = 1;
        Object a = c.a(cVar, fkpVar, i2, size, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
