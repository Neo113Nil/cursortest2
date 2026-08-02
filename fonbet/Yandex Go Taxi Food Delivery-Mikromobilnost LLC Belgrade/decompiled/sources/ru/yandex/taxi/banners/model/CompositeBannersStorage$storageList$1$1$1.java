package ru.yandex.taxi.banners.model;

import defpackage.ctf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/promotions/model/Promotion;", "Lru/yandex/taxi/communications/api/dto/Banner;", "banner", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/promotions/model/Promotion;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.CompositeBannersStorage$storageList$1$1$1", f = "CompositeBannersStorage.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CompositeBannersStorage$storageList$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ctf0 $storage;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeBannersStorage$storageList$1$1$1(e eVar, ctf0 ctf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$storage = ctf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CompositeBannersStorage$storageList$1$1$1 compositeBannersStorage$storageList$1$1$1 = new CompositeBannersStorage$storageList$1$1$1(this.this$0, this.$storage, continuation);
        compositeBannersStorage$storageList$1$1$1.L$0 = obj;
        return compositeBannersStorage$storageList$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompositeBannersStorage$storageList$1$1$1) create((Promotion) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Promotion promotion = (Promotion) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zls zlsVar = this.this$0.c;
            ctf0 ctf0Var = this.$storage;
            this.L$0 = null;
            this.label = 1;
            if (((CompositeBannersStorage$promotionChangedListener$1) zlsVar).invoke(promotion, ctf0Var, this) == coroutineSingletons) {
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
