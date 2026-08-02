package ru.yandex.taxi.logistics.sdk.promotions.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xbp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxbp0;", MetaDataField.SCREEN_FIELD, "Lzy11;", "<anonymous>", "(Lxbp0;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.ui.BannersProviderImpl$loadBanners$2", f = "BannersProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersProviderImpl$loadBanners$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersProviderImpl$loadBanners$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BannersProviderImpl$loadBanners$2 bannersProviderImpl$loadBanners$2 = new BannersProviderImpl$loadBanners$2(this.this$0, continuation);
        bannersProviderImpl$loadBanners$2.L$0 = obj;
        return bannersProviderImpl$loadBanners$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BannersProviderImpl$loadBanners$2 bannersProviderImpl$loadBanners$2 = (BannersProviderImpl$loadBanners$2) create((xbp0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bannersProviderImpl$loadBanners$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xbp0 xbp0Var = (xbp0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.f = xbp0Var;
        return zy11.a;
    }
}
