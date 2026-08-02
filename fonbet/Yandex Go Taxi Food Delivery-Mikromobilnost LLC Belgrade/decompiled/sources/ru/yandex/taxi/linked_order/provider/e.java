package ru.yandex.taxi.linked_order.provider;

import defpackage.ny61;
import defpackage.u5c;
import defpackage.v4r0;
import defpackage.yww0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class e {
    public final u5c a;

    public e(u5c u5cVar) {
        this.a = u5cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ClosedLinkedOrdersInteractor$addClosedOrder$1 closedLinkedOrdersInteractor$addClosedOrder$1;
        int i;
        if (continuationImpl instanceof ClosedLinkedOrdersInteractor$addClosedOrder$1) {
            closedLinkedOrdersInteractor$addClosedOrder$1 = (ClosedLinkedOrdersInteractor$addClosedOrder$1) continuationImpl;
            int i2 = closedLinkedOrdersInteractor$addClosedOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                closedLinkedOrdersInteractor$addClosedOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = closedLinkedOrdersInteractor$addClosedOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = closedLinkedOrdersInteractor$addClosedOrder$1.label;
                u5c u5cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    closedLinkedOrdersInteractor$addClosedOrder$1.L$0 = str;
                    closedLinkedOrdersInteractor$addClosedOrder$1.label = 1;
                    obj = ((yww0) u5cVar.a.getValue()).a(closedLinkedOrdersInteractor$addClosedOrder$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) closedLinkedOrdersInteractor$addClosedOrder$1.L$0;
                    kotlin.b.b(obj);
                }
                LinkedHashSet i3 = v4r0.i((Set) obj, str);
                closedLinkedOrdersInteractor$addClosedOrder$1.L$0 = null;
                closedLinkedOrdersInteractor$addClosedOrder$1.L$1 = null;
                closedLinkedOrdersInteractor$addClosedOrder$1.L$2 = null;
                closedLinkedOrdersInteractor$addClosedOrder$1.label = 2;
                Object d = ((yww0) u5cVar.a.getValue()).d(i3, closedLinkedOrdersInteractor$addClosedOrder$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        closedLinkedOrdersInteractor$addClosedOrder$1 = new ClosedLinkedOrdersInteractor$addClosedOrder$1(this, continuationImpl);
        Object obj2 = closedLinkedOrdersInteractor$addClosedOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = closedLinkedOrdersInteractor$addClosedOrder$1.label;
        u5c u5cVar2 = this.a;
        if (i != 0) {
        }
        LinkedHashSet i32 = v4r0.i((Set) obj2, str);
        closedLinkedOrdersInteractor$addClosedOrder$1.L$0 = null;
        closedLinkedOrdersInteractor$addClosedOrder$1.L$1 = null;
        closedLinkedOrdersInteractor$addClosedOrder$1.L$2 = null;
        closedLinkedOrdersInteractor$addClosedOrder$1.label = 2;
        Object d2 = ((yww0) u5cVar2.a.getValue()).d(i32, closedLinkedOrdersInteractor$addClosedOrder$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ClosedLinkedOrdersInteractor$clearUnknownOrders$1 closedLinkedOrdersInteractor$clearUnknownOrders$1;
        int i;
        Collection collection;
        if (continuationImpl instanceof ClosedLinkedOrdersInteractor$clearUnknownOrders$1) {
            closedLinkedOrdersInteractor$clearUnknownOrders$1 = (ClosedLinkedOrdersInteractor$clearUnknownOrders$1) continuationImpl;
            int i2 = closedLinkedOrdersInteractor$clearUnknownOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                closedLinkedOrdersInteractor$clearUnknownOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = closedLinkedOrdersInteractor$clearUnknownOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = closedLinkedOrdersInteractor$clearUnknownOrders$1.label;
                u5c u5cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    closedLinkedOrdersInteractor$clearUnknownOrders$1.L$0 = arrayList;
                    closedLinkedOrdersInteractor$clearUnknownOrders$1.label = 1;
                    obj = ((yww0) u5cVar.a.getValue()).a(closedLinkedOrdersInteractor$clearUnknownOrders$1);
                    collection = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    Collection collection2 = (List) closedLinkedOrdersInteractor$clearUnknownOrders$1.L$0;
                    kotlin.b.b(obj);
                    collection = collection2;
                }
                LinkedHashSet U = kotlin.collections.a.U((Set) obj, collection);
                closedLinkedOrdersInteractor$clearUnknownOrders$1.L$0 = null;
                closedLinkedOrdersInteractor$clearUnknownOrders$1.L$1 = null;
                closedLinkedOrdersInteractor$clearUnknownOrders$1.L$2 = null;
                closedLinkedOrdersInteractor$clearUnknownOrders$1.label = 2;
                Object d = ((yww0) u5cVar.a.getValue()).d(U, closedLinkedOrdersInteractor$clearUnknownOrders$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        closedLinkedOrdersInteractor$clearUnknownOrders$1 = new ClosedLinkedOrdersInteractor$clearUnknownOrders$1(this, continuationImpl);
        Object obj2 = closedLinkedOrdersInteractor$clearUnknownOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = closedLinkedOrdersInteractor$clearUnknownOrders$1.label;
        u5c u5cVar2 = this.a;
        if (i != 0) {
        }
        LinkedHashSet U2 = kotlin.collections.a.U((Set) obj2, collection);
        closedLinkedOrdersInteractor$clearUnknownOrders$1.L$0 = null;
        closedLinkedOrdersInteractor$clearUnknownOrders$1.L$1 = null;
        closedLinkedOrdersInteractor$clearUnknownOrders$1.L$2 = null;
        closedLinkedOrdersInteractor$clearUnknownOrders$1.label = 2;
        Object d2 = ((yww0) u5cVar2.a.getValue()).d(U2, closedLinkedOrdersInteractor$clearUnknownOrders$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ClosedLinkedOrdersInteractor$isOrderClosed$1 closedLinkedOrdersInteractor$isOrderClosed$1;
        int i;
        if (continuationImpl instanceof ClosedLinkedOrdersInteractor$isOrderClosed$1) {
            closedLinkedOrdersInteractor$isOrderClosed$1 = (ClosedLinkedOrdersInteractor$isOrderClosed$1) continuationImpl;
            int i2 = closedLinkedOrdersInteractor$isOrderClosed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                closedLinkedOrdersInteractor$isOrderClosed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = closedLinkedOrdersInteractor$isOrderClosed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = closedLinkedOrdersInteractor$isOrderClosed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    closedLinkedOrdersInteractor$isOrderClosed$1.L$0 = str;
                    closedLinkedOrdersInteractor$isOrderClosed$1.label = 1;
                    obj = ((yww0) this.a.a.getValue()).a(closedLinkedOrdersInteractor$isOrderClosed$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) closedLinkedOrdersInteractor$isOrderClosed$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((Set) obj).contains(str));
            }
        }
        closedLinkedOrdersInteractor$isOrderClosed$1 = new ClosedLinkedOrdersInteractor$isOrderClosed$1(this, continuationImpl);
        Object obj2 = closedLinkedOrdersInteractor$isOrderClosed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = closedLinkedOrdersInteractor$isOrderClosed$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((Set) obj2).contains(str));
    }
}
