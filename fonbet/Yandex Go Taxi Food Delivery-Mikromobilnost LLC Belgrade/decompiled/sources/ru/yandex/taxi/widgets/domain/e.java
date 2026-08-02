package ru.yandex.taxi.widgets.domain;

import defpackage.cb80;
import defpackage.j551;
import defpackage.jl40;
import defpackage.kv6;
import defpackage.m521;
import defpackage.ny61;
import defpackage.o801;
import defpackage.vpr;
import defpackage.w511;
import defpackage.x251;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j551 b;

    public e(vpr vprVar, j551 j551Var) {
        this.a = vprVar;
        this.b = j551Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1 widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1;
        int i;
        int i2;
        if (continuation instanceof WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1) {
            widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1 = (WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1) continuation;
            int i3 = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Map map = (Map) obj;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        String str = ((o801) entry.getKey()).a;
                        List<x251> list = (List) entry.getValue();
                        this.b.getClass();
                        int i4 = 0;
                        for (x251 x251Var : list) {
                            if (x251Var instanceof kv6) {
                                i2 = ((kv6) x251Var).getA().getC().size();
                            } else if (x251Var instanceof cb80) {
                                i2 = 1;
                            } else {
                                if (!jl40.l(x251Var, m521.INSTANCE)) {
                                    w511.b();
                                    return null;
                                }
                                i2 = 0;
                            }
                            i4 += i2;
                        }
                        arrayList.add(new Pair(str, new Integer(i4)));
                    }
                    Map s = kotlin.collections.b.s(arrayList);
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.L$0 = null;
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.L$1 = null;
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.L$2 = null;
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.L$3 = null;
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(s, widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1 = new WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1(this, continuation);
        Object obj22 = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
