package ru.yandex.taxi.masstransit.overlay;

import defpackage.g631;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uel0;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.model.VariantStyle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.VehicleVariantImageRepositoryImpl$cacheFromVariants$1", f = "VehicleVariantImageRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class VehicleVariantImageRepositoryImpl$cacheFromVariants$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, VariantStyle> $variantStyles;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleVariantImageRepositoryImpl$cacheFromVariants$1(d dVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$variantStyles = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VehicleVariantImageRepositoryImpl$cacheFromVariants$1 vehicleVariantImageRepositoryImpl$cacheFromVariants$1 = new VehicleVariantImageRepositoryImpl$cacheFromVariants$1(this.this$0, this.$variantStyles, continuation);
        vehicleVariantImageRepositoryImpl$cacheFromVariants$1.L$0 = obj;
        return vehicleVariantImageRepositoryImpl$cacheFromVariants$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VehicleVariantImageRepositoryImpl$cacheFromVariants$1 vehicleVariantImageRepositoryImpl$cacheFromVariants$1 = (VehicleVariantImageRepositoryImpl$cacheFromVariants$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        vehicleVariantImageRepositoryImpl$cacheFromVariants$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        Map<String, VariantStyle> map = this.$variantStyles;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, VariantStyle> entry : map.entrySet()) {
            String key = entry.getKey();
            List<VariantStyle.a> list = entry.getValue().b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            for (VariantStyle.a aVar : list) {
                RouteType.Companion.getClass();
                arrayList2.add(new g631(uel0.a(key), aVar.b, aVar.c));
            }
            ycc.r(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!dVar.e.containsKey((g631) next)) {
                arrayList3.add(next);
            }
        }
        d dVar2 = this.this$0;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            tje.N(tseVar, null, null, new VehicleVariantImageRepositoryImpl$cacheFromVariants$1$1$1(dVar2, (g631) it2.next(), null), 3);
        }
        return zy11.a;
    }
}
