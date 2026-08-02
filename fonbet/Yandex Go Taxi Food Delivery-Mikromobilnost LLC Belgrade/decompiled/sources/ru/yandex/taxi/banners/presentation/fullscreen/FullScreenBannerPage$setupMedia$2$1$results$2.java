package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkis;", "<anonymous>", "(Ltse;)Lkis;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage$setupMedia$2$1$results$2", f = "FullScreenBannerPage.kt", l = {247}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FullScreenBannerPage$setupMedia$2$1$results$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<PromotionBackground> $backgrounds;
    int label;
    final /* synthetic */ FullScreenBannerPage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPage$setupMedia$2$1$results$2(FullScreenBannerPage fullScreenBannerPage, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullScreenBannerPage;
        this.$backgrounds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullScreenBannerPage$setupMedia$2$1$results$2(this.this$0, this.$backgrounds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullScreenBannerPage$setupMedia$2$1$results$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        FullScreenBannerPage fullScreenBannerPage = this.this$0;
        List<PromotionBackground> list = this.$backgrounds;
        this.label = 1;
        obj2 = fullScreenBannerPage.setupBackground(list, this);
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
