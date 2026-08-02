package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.gr4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkis;", "<anonymous>", "(Ltse;)Lkis;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage$setupMedia$2$1$results$3", f = "FullScreenBannerPage.kt", l = {248}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FullScreenBannerPage$setupMedia$2$1$results$3 extends SuspendLambda implements wls {
    final /* synthetic */ gr4 $animation;
    int label;
    final /* synthetic */ FullScreenBannerPage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPage$setupMedia$2$1$results$3(FullScreenBannerPage fullScreenBannerPage, gr4 gr4Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullScreenBannerPage;
        this.$animation = gr4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullScreenBannerPage$setupMedia$2$1$results$3(this.this$0, this.$animation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullScreenBannerPage$setupMedia$2$1$results$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        gr4 gr4Var = this.$animation;
        this.label = 1;
        obj2 = fullScreenBannerPage.setupAnimation(gr4Var, this);
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
