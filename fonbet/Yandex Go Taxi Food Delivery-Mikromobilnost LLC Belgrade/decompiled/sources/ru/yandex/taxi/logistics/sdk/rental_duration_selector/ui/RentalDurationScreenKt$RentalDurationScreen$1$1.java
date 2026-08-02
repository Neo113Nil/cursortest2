package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import defpackage.jwh;
import defpackage.kzi0;
import defpackage.m8h;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.RentalDurationScreenKt$RentalDurationScreen$1$1", f = "RentalDurationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RentalDurationScreenKt$RentalDurationScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalDurationScreenKt$RentalDurationScreen$1$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.$viewModel = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RentalDurationScreenKt$RentalDurationScreen$1$1(this.$viewModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RentalDurationScreenKt$RentalDurationScreen$1$1 rentalDurationScreenKt$RentalDurationScreen$1$1 = (RentalDurationScreenKt$RentalDurationScreen$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rentalDurationScreenKt$RentalDurationScreen$1$1.invokeSuspend(zy11Var);
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
        d dVar = this.$viewModel;
        m8h m8hVar = dVar.y;
        List W = dVar.W();
        ArrayList arrayList = new ArrayList(tcc.n(W, 10));
        Iterator it = W.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((kzi0) it.next()).a));
        }
        jwh jwhVar = m8hVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("available_time_options", kotlin.collections.a.X(arrayList, null, null, null, null, 63));
        jwhVar.a.o("DeliveryCargoHour.SelectTimeScreen.Shown", null, linkedHashMap);
        return zy11.a;
    }
}
