package ru.yandex.taxi.banners.model;

import defpackage.dsf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lazs;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.PromotionPreferences$geoBanners$2", f = "PromotionPreferences.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PromotionPreferences$geoBanners$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ dsf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionPreferences$geoBanners$2(dsf0 dsf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dsf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionPreferences$geoBanners$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionPreferences$geoBanners$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String string = this.this$0.a().getString("ru.yandex.taxi.PromotionsProvider.FIELD_SUGGEST_BANNERS", null);
        if (string == null) {
            return EmptyList.a;
        }
        Object c = ((xnt) this.this$0.b).c(string, dsf0.f);
        this.this$0.e = (List) c;
        return c;
    }
}
