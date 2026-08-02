package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.t4s;
import defpackage.tse;
import defpackage.u1n;
import defpackage.wls;
import defpackage.x2s;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormViewModel$sendAnalyticsOnShown$1", f = "CargoFormViewModel.kt", l = {241}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CargoFormViewModel$sendAnalyticsOnShown$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormViewModel$sendAnalyticsOnShown$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CargoFormViewModel$sendAnalyticsOnShown$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFormViewModel$sendAnalyticsOnShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CargoFormViewModel$sendAnalyticsOnShown$1$analyticsData$1 cargoFormViewModel$sendAnalyticsOnShown$1$analyticsData$1 = new CargoFormViewModel$sendAnalyticsOnShown$1$analyticsData$1(this.this$0, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(10000L, cargoFormViewModel$sendAnalyticsOnShown$1$analyticsData$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        x2s x2sVar = (x2s) obj;
        t4s t4sVar = this.this$0.b.a;
        LinkedHashMap l = t4sVar != null ? kotlin.collections.b.l(new Pair("input_point", t4sVar.a)) : new LinkedHashMap(kotlin.collections.b.f());
        Map map = this.this$0.b.y;
        if (map != null) {
            l.putAll(map);
        }
        u1n u1nVar = this.this$0.w;
        u1nVar.getClass();
        u1nVar.r("Shown", x2sVar != null ? x2sVar : null, l);
        return zy11.a;
    }
}
