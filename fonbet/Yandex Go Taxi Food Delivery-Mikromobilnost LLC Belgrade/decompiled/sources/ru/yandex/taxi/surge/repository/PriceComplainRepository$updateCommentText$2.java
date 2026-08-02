package ru.yandex.taxi.surge.repository;

import defpackage.aze0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wt60;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.repository.PriceComplainRepository$updateCommentText$2", f = "PriceComplainRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PriceComplainRepository$updateCommentText$2 extends SuspendLambda implements wls {
    final /* synthetic */ wt60 $offerWithTariffInfo;
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceComplainRepository$updateCommentText$2(a aVar, wt60 wt60Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$offerWithTariffInfo = wt60Var;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceComplainRepository$updateCommentText$2(this.this$0, this.$offerWithTariffInfo, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PriceComplainRepository$updateCommentText$2 priceComplainRepository$updateCommentText$2 = (PriceComplainRepository$updateCommentText$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        priceComplainRepository$updateCommentText$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = this.this$0.d;
        wt60 wt60Var = this.$offerWithTariffInfo;
        String str = this.$text;
        do {
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            aze0 aze0Var = (aze0) linkedHashMap.get(wt60Var);
            linkedHashMap.put(wt60Var, aze0Var != null ? new aze0(aze0Var.a, str) : new aze0(EmptySet.a, str));
        } while (!r0Var.k(value, linkedHashMap));
        return zy11.a;
    }
}
