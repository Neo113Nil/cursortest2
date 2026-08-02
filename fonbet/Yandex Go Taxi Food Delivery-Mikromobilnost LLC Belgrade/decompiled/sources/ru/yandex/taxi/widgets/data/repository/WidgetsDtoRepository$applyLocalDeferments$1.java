package ru.yandex.taxi.widgets.data.repository;

import com.yandex.go.dto.response.BundledOrdersPayload;
import com.yandex.go.dto.response.OrderDto;
import defpackage.cb80;
import defpackage.kv6;
import defpackage.m521;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o801;
import defpackage.w511;
import defpackage.x251;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lo801;", "", "Lx251;", "widgetsByScreen", "", "trackingFilters", "<anonymous>", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.data.repository.WidgetsDtoRepository$applyLocalDeferments$1", f = "WidgetsDtoRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WidgetsDtoRepository$applyLocalDeferments$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsDtoRepository$applyLocalDeferments$1(t tVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WidgetsDtoRepository$applyLocalDeferments$1 widgetsDtoRepository$applyLocalDeferments$1 = new WidgetsDtoRepository$applyLocalDeferments$1(this.this$0, (Continuation) obj3);
        widgetsDtoRepository$applyLocalDeferments$1.L$0 = (Map) obj;
        widgetsDtoRepository$applyLocalDeferments$1.L$1 = (Map) obj2;
        return widgetsDtoRepository$applyLocalDeferments$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
    
        if (r14.contains(((defpackage.cb80) r7).a.c) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        Map map2 = (Map) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.i.getClass();
        MapBuilder mapBuilder = new MapBuilder();
        Set keySet = map2.keySet();
        MapBuilder mapBuilder2 = new MapBuilder();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (x251 x251Var : (List) it.next()) {
                mapBuilder2.put(x251Var.getB(), x251Var);
                if (x251Var instanceof cb80) {
                    mapBuilder2.put(((cb80) x251Var).a.c, x251Var);
                } else if (x251Var instanceof kv6) {
                    for (OrderDto orderDto : ((kv6) x251Var).a.c) {
                        String str = orderDto.c;
                        mapBuilder2.put(str, new cb80(orderDto, str));
                    }
                } else if (!x251Var.equals(m521.INSTANCE)) {
                    w511.b();
                    return null;
                }
            }
        }
        MapBuilder j = mapBuilder2.j();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = ((o801) entry.getKey()).a;
            List<x251> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (x251 x251Var2 : list) {
                if (!keySet.contains(x251Var2.getB())) {
                    if (!(x251Var2 instanceof cb80)) {
                        if (x251Var2 instanceof kv6) {
                            kv6 kv6Var = (kv6) x251Var2;
                            BundledOrdersPayload bundledOrdersPayload = kv6Var.a;
                            List list2 = bundledOrdersPayload.c;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!keySet.contains(((OrderDto) obj2).c)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            BundledOrdersPayload a = BundledOrdersPayload.a(bundledOrdersPayload, arrayList2);
                            kv6 kv6Var2 = new kv6(a, kv6Var.b);
                            if (!a.c.isEmpty()) {
                                x251Var2 = kv6Var2;
                            }
                        } else if (!x251Var2.equals(m521.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        if (x251Var2 == null) {
                            arrayList.add(x251Var2);
                        }
                    }
                }
                x251Var2 = null;
                if (x251Var2 == null) {
                }
            }
            mapBuilder.put(new o801(str2), arrayList);
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            String str3 = (String) entry2.getKey();
            String str4 = ((o801) entry2.getValue()).a;
            x251 x251Var3 = (x251) j.get(str3);
            if (x251Var3 != null) {
                Collection collection = (List) mapBuilder.get(new o801(str4));
                if (collection == null) {
                    collection = EmptyList.a;
                }
                mapBuilder.put(new o801(str4), kotlin.collections.a.o0(collection, x251Var3));
            }
        }
        return mapBuilder.j();
    }
}
