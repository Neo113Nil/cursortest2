package ru.yandex.taxi.banners;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tg60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltg60;", "<anonymous>", "(Ltse;)Ltg60;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$processGeoNotificationBanners$1$1$banner$1", f = "BannersController.kt", l = {213}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersController$processGeoNotificationBanners$1$1$banner$1 extends SuspendLambda implements wls {
    final /* synthetic */ Promotion $lastReadyGeoBanner;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$processGeoNotificationBanners$1$1$banner$1(Promotion promotion, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$lastReadyGeoBanner = promotion;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$processGeoNotificationBanners$1$1$banner$1(this.$lastReadyGeoBanner, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$processGeoNotificationBanners$1$1$banner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tg60 tg60Var;
        tg60 tg60Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            Promotion promotion = this.$lastReadyGeoBanner;
            tg60Var = promotion instanceof tg60 ? (tg60) promotion : null;
            if (tg60Var != null) {
                c cVar = this.this$0;
                if (((tg60) promotion).k.contains(cVar.r)) {
                    h hVar = cVar.b;
                    this.L$0 = tg60Var;
                    this.L$1 = null;
                    this.label = 1;
                    obj = hVar.b(promotion, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tg60Var2 = tg60Var;
                }
                z = false;
                tg60Var2 = tg60Var;
                if (!z) {
                    return tg60Var2;
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tg60Var2 = (tg60) this.L$0;
        kotlin.b.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            tg60Var = tg60Var2;
            z = false;
            tg60Var2 = tg60Var;
        }
        if (!z) {
            return null;
        }
    }
}
