package ru.yandex.taxi.banners;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tg60;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$processGeoNotificationBanners$1", f = "BannersController.kt", l = {211}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersController$processGeoNotificationBanners$1 extends SuspendLambda implements wls {
    final /* synthetic */ Promotion $lastReadyGeoBanner;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$processGeoNotificationBanners$1(Promotion promotion, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$lastReadyGeoBanner = promotion;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$processGeoNotificationBanners$1(this.$lastReadyGeoBanner, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$processGeoNotificationBanners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Failed to process geto notifications for screen");
        }
        if (i == 0) {
            kotlin.b.b(obj);
            Promotion promotion = this.$lastReadyGeoBanner;
            c cVar2 = this.this$0;
            if (promotion.m() == Promotion.Type.NOTIFICATION) {
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                BannersController$processGeoNotificationBanners$1$1$banner$1 bannersController$processGeoNotificationBanners$1$1$banner$1 = new BannersController$processGeoNotificationBanners$1$1$banner$1(promotion, cVar2, null);
                this.L$0 = cVar2;
                this.label = 1;
                obj = tje.k0(mdhVar, bannersController$processGeoNotificationBanners$1$1$banner$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = cVar2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cVar = (c) this.L$0;
        kotlin.b.b(obj);
        tg60 tg60Var = (tg60) obj;
        if (tg60Var != null) {
            cVar.n(tg60Var);
        }
        return zy11.a;
    }
}
