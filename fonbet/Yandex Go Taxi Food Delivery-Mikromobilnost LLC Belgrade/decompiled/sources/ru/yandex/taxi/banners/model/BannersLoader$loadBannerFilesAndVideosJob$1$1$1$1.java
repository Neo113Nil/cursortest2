package ru.yandex.taxi.banners.model;

import defpackage.lvj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$loadBannerFilesAndVideosJob$1$1$1$1", f = "BannersLoader.kt", l = {lvj0.NOT_MODIFIED}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersLoader$loadBannerFilesAndVideosJob$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Promotion $banner;
    final /* synthetic */ boolean $intoMemory;
    final /* synthetic */ String $mediaUrl;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$loadBannerFilesAndVideosJob$1$1$1$1(d dVar, String str, Promotion promotion, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mediaUrl = str;
        this.$banner = promotion;
        this.$intoMemory = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersLoader$loadBannerFilesAndVideosJob$1$1$1$1(this.this$0, this.$mediaUrl, this.$banner, this.$intoMemory, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersLoader$loadBannerFilesAndVideosJob$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = this.$mediaUrl;
            Promotion promotion = this.$banner;
            boolean z = this.$intoMemory;
            this.label = 1;
            if (d.a(dVar, str, promotion, z, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
