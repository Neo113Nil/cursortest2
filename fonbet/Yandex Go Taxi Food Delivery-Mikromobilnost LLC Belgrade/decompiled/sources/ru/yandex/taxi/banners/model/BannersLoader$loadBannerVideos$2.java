package ru.yandex.taxi.banners.model;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.shs;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$loadBannerVideos$2", f = "BannersLoader.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersLoader$loadBannerVideos$2 extends SuspendLambda implements wls {
    final /* synthetic */ shs $banner;
    final /* synthetic */ boolean $onlyFirstPageVideo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$loadBannerVideos$2$1", f = "BannersLoader.kt", l = {363}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.banners.model.BannersLoader$loadBannerVideos$2$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ PromotionBackground $background;
        final /* synthetic */ shs $banner;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, PromotionBackground promotionBackground, shs shsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$background = promotionBackground;
            this.$banner = shsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$background, this.$banner, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar = this.this$0;
                PromotionBackground promotionBackground = this.$background;
                shs shsVar = this.$banner;
                this.label = 1;
                if (d.b(dVar, promotionBackground, shsVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$loadBannerVideos$2(shs shsVar, d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$banner = shsVar;
        this.this$0 = dVar;
        this.$onlyFirstPageVideo = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BannersLoader$loadBannerVideos$2 bannersLoader$loadBannerVideos$2 = new BannersLoader$loadBannerVideos$2(this.$banner, this.this$0, this.$onlyFirstPageVideo, continuation);
        bannersLoader$loadBannerVideos$2.L$0 = obj;
        return bannersLoader$loadBannerVideos$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BannersLoader$loadBannerVideos$2 bannersLoader$loadBannerVideos$2 = (BannersLoader$loadBannerVideos$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bannersLoader$loadBannerVideos$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Iterator it = this.$banner.l.iterator();
        while (it.hasNext()) {
            for (PromotionBackground promotionBackground : ((shs.a) it.next()).f) {
                this.this$0.getClass();
                if (promotionBackground.a == PromotionBackground.Type.VIDEO && (str = promotionBackground.b) != null && str.length() != 0) {
                    tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, promotionBackground, this.$banner, null), 3);
                }
            }
            if (this.$onlyFirstPageVideo) {
                break;
            }
        }
        return zy11.a;
    }
}
