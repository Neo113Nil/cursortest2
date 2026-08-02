package ru.yandex.taxi.banners;

import defpackage.cv4;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nu4;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnu4;", "<anonymous>", "(Ltse;)Lnu4;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1", f = "BannersController.kt", l = {166}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Promotion promotion;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            promotion = h.x;
            c cVar = this.this$0;
            if (jl40.l(cVar.r, cVar.q)) {
                c cVar2 = this.this$0;
                cv4 cv4Var = cVar2.d;
                if (!cv4Var.a.contains(cVar2.r)) {
                    c cVar3 = this.this$0;
                    h hVar = cVar3.b;
                    String str = cVar3.r;
                    this.L$0 = null;
                    this.label = 1;
                    obj = hVar.g(str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return new nu4(promotion, this.this$0.r);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        promotion = (Promotion) obj;
        return new nu4(promotion, this.this$0.r);
    }
}
