package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkis;", "<anonymous>", "()Lkis;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage$setupBackground$backgroundResult$3", f = "FullScreenBannerPage.kt", l = {322}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class FullScreenBannerPage$setupBackground$backgroundResult$3 extends SuspendLambda implements tls {
    final /* synthetic */ List<PromotionBackground> $backgrounds;
    int label;
    final /* synthetic */ FullScreenBannerPage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPage$setupBackground$backgroundResult$3(FullScreenBannerPage fullScreenBannerPage, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fullScreenBannerPage;
        this.$backgrounds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FullScreenBannerPage$setupBackground$backgroundResult$3(this.this$0, this.$backgrounds, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FullScreenBannerPage$setupBackground$backgroundResult$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryToSetImageBackground;
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
        tryToSetImageBackground = fullScreenBannerPage.tryToSetImageBackground(list, this);
        return tryToSetImageBackground == coroutineSingletons ? coroutineSingletons : tryToSetImageBackground;
    }
}
