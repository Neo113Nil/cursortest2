package flex.core.loader.network;

import defpackage.c5j0;
import defpackage.hv90;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w511;
import defpackage.ywl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00c2 -> B:11:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, ywl ywlVar, c5j0 c5j0Var, ContinuationImpl continuationImpl) {
        PayloadExtenderKt$formatExtraPayload$3 payloadExtenderKt$formatExtraPayload$3;
        int i;
        ArrayList arrayList;
        Iterator it;
        PayloadExtenderKt$formatExtraPayload$3 payloadExtenderKt$formatExtraPayload$32;
        int i2;
        c5j0 c5j0Var2;
        int i3;
        if (continuationImpl instanceof PayloadExtenderKt$formatExtraPayload$3) {
            payloadExtenderKt$formatExtraPayload$3 = (PayloadExtenderKt$formatExtraPayload$3) continuationImpl;
            int i4 = payloadExtenderKt$formatExtraPayload$3.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                payloadExtenderKt$formatExtraPayload$3.label = i4 - Integer.MIN_VALUE;
                Object obj = payloadExtenderKt$formatExtraPayload$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payloadExtenderKt$formatExtraPayload$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int size = list.size();
                    if (size == 0) {
                        return kotlin.collections.b.f();
                    }
                    if (size == 1) {
                        hv90 hv90Var = (hv90) list.get(0);
                        payloadExtenderKt$formatExtraPayload$3.L$0 = null;
                        payloadExtenderKt$formatExtraPayload$3.L$1 = null;
                        payloadExtenderKt$formatExtraPayload$3.L$2 = null;
                        payloadExtenderKt$formatExtraPayload$3.label = 1;
                        Object a = hv90Var.a(ywlVar, c5j0Var, payloadExtenderKt$formatExtraPayload$3);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                    List list2 = list;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    payloadExtenderKt$formatExtraPayload$32 = payloadExtenderKt$formatExtraPayload$3;
                    i2 = 0;
                    c5j0Var2 = c5j0Var;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = payloadExtenderKt$formatExtraPayload$3.I$1;
                    int i5 = payloadExtenderKt$formatExtraPayload$3.I$0;
                    Collection collection = (Collection) payloadExtenderKt$formatExtraPayload$3.L$9;
                    Iterator it2 = (Iterator) payloadExtenderKt$formatExtraPayload$3.L$6;
                    ?? r4 = (Collection) payloadExtenderKt$formatExtraPayload$3.L$5;
                    c5j0 c5j0Var3 = (c5j0) payloadExtenderKt$formatExtraPayload$3.L$2;
                    ywl ywlVar2 = (ywl) payloadExtenderKt$formatExtraPayload$3.L$1;
                    kotlin.b.b(obj);
                    int i6 = i5;
                    ywlVar = ywlVar2;
                    Iterator it3 = it2;
                    payloadExtenderKt$formatExtraPayload$32 = payloadExtenderKt$formatExtraPayload$3;
                    c5j0Var2 = c5j0Var3;
                    Object a2 = obj;
                    ArrayList arrayList2 = r4;
                    collection.add((Map) a2);
                    i3 = i6;
                    arrayList = arrayList2;
                    it = it3;
                    if (it.hasNext()) {
                        hv90 hv90Var2 = (hv90) it.next();
                        payloadExtenderKt$formatExtraPayload$32.L$0 = null;
                        payloadExtenderKt$formatExtraPayload$32.L$1 = ywlVar;
                        payloadExtenderKt$formatExtraPayload$32.L$2 = c5j0Var2;
                        payloadExtenderKt$formatExtraPayload$32.L$3 = null;
                        payloadExtenderKt$formatExtraPayload$32.L$4 = null;
                        payloadExtenderKt$formatExtraPayload$32.L$5 = arrayList;
                        payloadExtenderKt$formatExtraPayload$32.L$6 = it;
                        payloadExtenderKt$formatExtraPayload$32.L$7 = null;
                        payloadExtenderKt$formatExtraPayload$32.L$8 = null;
                        payloadExtenderKt$formatExtraPayload$32.L$9 = arrayList;
                        payloadExtenderKt$formatExtraPayload$32.I$0 = i3;
                        payloadExtenderKt$formatExtraPayload$32.I$1 = i2;
                        payloadExtenderKt$formatExtraPayload$32.I$2 = 0;
                        payloadExtenderKt$formatExtraPayload$32.label = 2;
                        a2 = hv90Var2.a(ywlVar, c5j0Var2, payloadExtenderKt$formatExtraPayload$32);
                        if (a2 != coroutineSingletons) {
                            it3 = it;
                            ArrayList arrayList3 = arrayList;
                            i6 = i3;
                            collection = arrayList3;
                            arrayList2 = arrayList3;
                            collection.add((Map) a2);
                            i3 = i6;
                            arrayList = arrayList2;
                            it = it3;
                            if (it.hasNext()) {
                                Iterator it4 = arrayList.iterator();
                                if (!it4.hasNext()) {
                                    w511.x("Empty collection can't be reduced.");
                                    return null;
                                }
                                Object next = it4.next();
                                while (it4.hasNext()) {
                                    next = kotlin.collections.b.n((Map) next, (Map) it4.next());
                                }
                                return (Map) next;
                            }
                        }
                    }
                }
            }
        }
        payloadExtenderKt$formatExtraPayload$3 = new PayloadExtenderKt$formatExtraPayload$3(continuationImpl);
        Object obj2 = payloadExtenderKt$formatExtraPayload$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payloadExtenderKt$formatExtraPayload$3.label;
        if (i != 0) {
        }
    }
}
