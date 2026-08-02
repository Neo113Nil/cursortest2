package ru.yandex.taxi.surge.repository;

import defpackage.aze0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wt60;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.repository.PriceComplainRepository$updateSelectedIds$2", f = "PriceComplainRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PriceComplainRepository$updateSelectedIds$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ wt60 $offerWithTariffInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceComplainRepository$updateSelectedIds$2(a aVar, wt60 wt60Var, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$offerWithTariffInfo = wt60Var;
        this.$isSelected = z;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceComplainRepository$updateSelectedIds$2(this.this$0, this.$offerWithTariffInfo, this.$isSelected, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PriceComplainRepository$updateSelectedIds$2 priceComplainRepository$updateSelectedIds$2 = (PriceComplainRepository$updateSelectedIds$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        priceComplainRepository$updateSelectedIds$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        Set set;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = this.this$0.d;
        wt60 wt60Var = this.$offerWithTariffInfo;
        boolean z = this.$isSelected;
        String str = this.$id;
        do {
            value = r0Var.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            aze0 aze0Var = (aze0) linkedHashMap.get(wt60Var);
            Set linkedHashSet = (aze0Var == null || (set = aze0Var.a) == null) ? new LinkedHashSet() : kotlin.collections.a.M0(set);
            if (z) {
                linkedHashSet.add(str);
            } else {
                linkedHashSet.remove(str);
            }
            aze0 aze0Var2 = (aze0) linkedHashMap.get(wt60Var);
            linkedHashMap.put(wt60Var, aze0Var2 != null ? new aze0(linkedHashSet, aze0Var2.b) : new aze0(linkedHashSet, ""));
        } while (!r0Var.k(value, linkedHashMap));
        return zy11.a;
    }
}
