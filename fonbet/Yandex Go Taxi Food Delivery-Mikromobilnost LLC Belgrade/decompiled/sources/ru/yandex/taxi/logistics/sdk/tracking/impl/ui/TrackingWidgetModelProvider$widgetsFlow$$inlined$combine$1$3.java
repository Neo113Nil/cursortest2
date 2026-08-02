package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.d2q0;
import defpackage.j801;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6q0;
import defpackage.vpr;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3", f = "TrackingWidgetModelProvider.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class TrackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ String[] $widgetOrder$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ j801 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3(Continuation continuation, String[] strArr, j801 j801Var) {
        super(3, continuation);
        this.$widgetOrder$inlined = strArr;
        this.this$0 = j801Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3 trackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3 = new TrackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3((Continuation) obj3, this.$widgetOrder$inlined, this.this$0);
        trackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        trackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return trackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Map u = kotlin.collections.b.u((Pair[]) ((Object[]) this.L$1));
            String[] strArr = this.$widgetOrder$inlined;
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (jl40.l(str, "separator-key")) {
                    iterable = Collections.singletonList(new o6q0());
                } else {
                    iterable = (List) u.get(str);
                    if (iterable == null) {
                        iterable = EmptyList.a;
                    }
                }
                ycc.r(iterable, arrayList);
            }
            this.this$0.b.getClass();
            ArrayList a = d2q0.a(arrayList);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(a, this) == coroutineSingletons) {
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
