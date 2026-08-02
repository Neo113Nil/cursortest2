package ru.yandex.taxi.banners.model;

import defpackage.ctf0;
import defpackage.fuc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ssf0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.ssl.cl_88;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lru/yandex/taxi/promotions/model/Promotion;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.BannersLoader$getBannerFromServer$2", f = "BannersLoader.kt", l = {cl_88.n, 262, 264}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersLoader$getBannerFromServer$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ ctf0 $storage;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersLoader$getBannerFromServer$2(d dVar, String str, ctf0 ctf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$id = str;
        this.$storage = ctf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersLoader$getBannerFromServer$2(this.this$0, this.$id, this.$storage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersLoader$getBannerFromServer$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Promotion promotion;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = this.$id;
            this.label = 1;
            obj = dVar.d(null, str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    promotion = (Promotion) this.L$1;
                    kotlin.b.b(obj);
                    return new Result(promotion);
                }
                kotlin.b.b(obj);
                Promotion promotion2 = (Promotion) obj;
                d dVar2 = this.this$0;
                ctf0 ctf0Var = this.$storage;
                this.L$0 = null;
                this.L$1 = promotion2;
                this.label = 3;
                if (dVar2.m(promotion2, true, ctf0Var, this) != coroutineSingletons) {
                    promotion = promotion2;
                    return new Result(promotion);
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        fuc fucVar = this.this$0.c;
        this.L$0 = null;
        this.label = 2;
        obj = ((ru.yandex.taxi.communications.common.repository.a) fucVar).b((ssf0) obj, RetryPolicy.DEFAULT, this);
    }
}
