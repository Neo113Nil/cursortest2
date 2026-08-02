package ru.yandex.taxi.logistics.sdk.promotions.impl.ui;

import defpackage.doe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xbp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfpc;", "Lzrf0;", "<anonymous>", "(Ltse;)Lfpc;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.ui.BannersProviderImpl$loadBanners$3$banners$1", f = "BannersProvider.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersProviderImpl$loadBanners$3$banners$1 extends SuspendLambda implements wls {
    final /* synthetic */ doe $coordinates;
    final /* synthetic */ xbp0 $screen;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersProviderImpl$loadBanners$3$banners$1(b bVar, doe doeVar, xbp0 xbp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$coordinates = doeVar;
        this.$screen = xbp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersProviderImpl$loadBanners$3$banners$1(this.this$0, this.$coordinates, this.$screen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersProviderImpl$loadBanners$3$banners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.logistics.sdk.promotions.impl.a aVar = this.this$0.b;
        doe doeVar = this.$coordinates;
        xbp0 xbp0Var = this.$screen;
        this.label = 1;
        Object b = aVar.b(doeVar, xbp0Var, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
