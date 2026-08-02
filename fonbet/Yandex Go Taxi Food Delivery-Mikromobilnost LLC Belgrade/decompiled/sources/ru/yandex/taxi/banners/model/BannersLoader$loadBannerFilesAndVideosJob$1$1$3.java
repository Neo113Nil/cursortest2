package ru.yandex.taxi.banners.model;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.shs;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lru/yandex/taxi/promotions/model/Promotion;", "Lru/yandex/taxi/communications/api/dto/Banner;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/promotions/model/Promotion;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$loadBannerFilesAndVideosJob$1$1$3", f = "BannersLoader.kt", l = {319}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersLoader$loadBannerFilesAndVideosJob$1$1$3 extends SuspendLambda implements wls {
    final /* synthetic */ Promotion $banner;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$loadBannerFilesAndVideosJob$1$1$3(d dVar, Promotion promotion, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$banner = promotion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersLoader$loadBannerFilesAndVideosJob$1$1$3(this.this$0, this.$banner, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersLoader$loadBannerFilesAndVideosJob$1$1$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        shs shsVar = (shs) this.$banner;
        this.label = 1;
        Object l = dVar.l(shsVar, true, this);
        return l == coroutineSingletons ? coroutineSingletons : l;
    }
}
