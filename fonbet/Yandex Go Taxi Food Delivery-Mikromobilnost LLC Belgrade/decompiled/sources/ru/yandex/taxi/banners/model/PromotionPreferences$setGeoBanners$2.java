package ru.yandex.taxi.banners.model;

import android.content.SharedPreferences;
import defpackage.azs;
import defpackage.dsf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.PromotionPreferences$setGeoBanners$2", f = "PromotionPreferences.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PromotionPreferences$setGeoBanners$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<azs> $banners;
    int label;
    final /* synthetic */ dsf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionPreferences$setGeoBanners$2(dsf0 dsf0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dsf0Var;
        this.$banners = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionPreferences$setGeoBanners$2(this.this$0, this.$banners, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PromotionPreferences$setGeoBanners$2 promotionPreferences$setGeoBanners$2 = (PromotionPreferences$setGeoBanners$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        promotionPreferences$setGeoBanners$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SharedPreferences a = this.this$0.a();
        dsf0 dsf0Var = this.this$0;
        List<azs> list = this.$banners;
        SharedPreferences.Editor edit = a.edit();
        edit.putString("ru.yandex.taxi.PromotionsProvider.FIELD_SUGGEST_BANNERS", ((xnt) dsf0Var.b).e(list, dsf0.f));
        edit.apply();
        return zy11.a;
    }
}
