package ru.yandex.taxi.banners.model;

import defpackage.fb7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$processBanner$2", f = "BannersLoader.kt", l = {226}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersLoader$processBanner$2 extends SuspendLambda implements wls {
    final /* synthetic */ Promotion $banner;
    final /* synthetic */ Promotion $cachedBanner;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$processBanner$2(d dVar, Promotion promotion, Promotion promotion2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$cachedBanner = promotion;
        this.$banner = promotion2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersLoader$processBanner$2(this.this$0, this.$cachedBanner, this.$banner, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersLoader$processBanner$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Set g = v4r0.g(this.this$0.l.a(this.$cachedBanner), this.this$0.l.a(this.$banner));
            this.this$0.r.getClass();
            fb7.a(g);
            b bVar = this.this$0.s;
            String b = this.$banner.getB();
            List b2 = this.$banner.b();
            this.L$0 = null;
            this.label = 1;
            if (bVar.d(b, b2, this) == coroutineSingletons) {
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
