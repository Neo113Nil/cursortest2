package ru.yandex.taxi.deeplinks;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.deeplinks.DeeplinkGeoPointDecoder$midPoints$2", f = "DeeplinkGeoPointDecoder.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DeeplinkGeoPointDecoder$midPoints$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $analyticsEventForRouteDeeplink;
    final /* synthetic */ List<zzs> $midPoints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkGeoPointDecoder$midPoints$2(List list, e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$midPoints = list;
        this.this$0 = eVar;
        this.$analyticsEventForRouteDeeplink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeeplinkGeoPointDecoder$midPoints$2 deeplinkGeoPointDecoder$midPoints$2 = new DeeplinkGeoPointDecoder$midPoints$2(this.$midPoints, this.this$0, this.$analyticsEventForRouteDeeplink, continuation);
        deeplinkGeoPointDecoder$midPoints$2.L$0 = obj;
        return deeplinkGeoPointDecoder$midPoints$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkGeoPointDecoder$midPoints$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
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
        List<zzs> list = this.$midPoints;
        e eVar = this.this$0;
        String str = this.$analyticsEventForRouteDeeplink;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new DeeplinkGeoPointDecoder$midPoints$2$1$1(eVar, (zzs) it.next(), str, null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
