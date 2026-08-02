package ru.yandex.taxi.banners.model;

import defpackage.azs;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynn;
import defpackage.yu0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lm1k;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.GeoBannersInteractor$downloadGeoBanners$2", f = "GeoBannersInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class GeoBannersInteractor$downloadGeoBanners$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<azs> $banners;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoBannersInteractor$downloadGeoBanners$2(List list, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$banners = list;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GeoBannersInteractor$downloadGeoBanners$2 geoBannersInteractor$downloadGeoBanners$2 = new GeoBannersInteractor$downloadGeoBanners$2(this.$banners, this.this$0, continuation);
        geoBannersInteractor$downloadGeoBanners$2.L$0 = obj;
        return geoBannersInteractor$downloadGeoBanners$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoBannersInteractor$downloadGeoBanners$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<azs> list = this.$banners;
        g gVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((azs) it.next()).a;
            l8x l8xVar = (l8x) gVar.f.computeIfAbsent(str, new yu0(9, new f(tseVar, gVar, str)));
            arrayList.add(l8xVar.w(new ynn(8, gVar, str, l8xVar)));
        }
        return arrayList;
    }
}
