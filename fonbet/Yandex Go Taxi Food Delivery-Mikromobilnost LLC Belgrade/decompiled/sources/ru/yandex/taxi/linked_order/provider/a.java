package ru.yandex.taxi.linked_order.provider;

import defpackage.nly;
import defpackage.ny61;
import defpackage.sly;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public a(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        if (r7.emit((java.util.List) r6, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b0 -> B:17:0x00b3). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ActiveLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1 activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1;
        int i;
        Collection collection;
        vpr vprVar;
        Iterator it;
        boolean z;
        if (continuation instanceof ActiveLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1) {
            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1 = (ActiveLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1) continuation;
            int i2 = activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((List) obj).iterator();
                    collection = arrayList;
                    vprVar = this.a;
                    it = it2;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                Object next = activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$11;
                it = (Iterator) activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$10;
                collection = (Collection) activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$9;
                vprVar = (vpr) activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    z = false;
                    if (z) {
                        collection.add(next);
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        sly slyVar = (sly) next;
                        if (!(slyVar instanceof nly)) {
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$0 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$1 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$2 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$3 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$4 = vprVar;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$5 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$6 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$7 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$8 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$9 = collection;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$10 = it;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$11 = next;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$12 = null;
                            activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.label = 1;
                            obj2 = d.a(this.b, slyVar, activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1);
                        }
                    } else {
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$0 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$1 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$2 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$3 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$4 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$5 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$6 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$7 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$8 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$9 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$10 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$11 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.L$12 = null;
                        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.label = 2;
                    }
                    return coroutineSingletons;
                }
                z = true;
                if (z) {
                }
                if (it.hasNext()) {
                }
                return coroutineSingletons;
            }
        }
        activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1 = new ActiveLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeLinkedOrderRepository$activeOrdersFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
    }
}
