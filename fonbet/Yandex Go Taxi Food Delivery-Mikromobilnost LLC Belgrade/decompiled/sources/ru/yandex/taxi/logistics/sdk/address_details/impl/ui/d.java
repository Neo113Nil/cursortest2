package ru.yandex.taxi.logistics.sdk.address_details.impl.ui;

import defpackage.c2r0;
import defpackage.g2q0;
import defpackage.j73;
import defpackage.n351;
import defpackage.ny61;
import defpackage.ot0;
import defpackage.ps0;
import defpackage.qkg;
import defpackage.scc;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.x7l0;
import defpackage.zt0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public d(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressDetailsViewModel$special$$inlined$map$1$2$1 addressDetailsViewModel$special$$inlined$map$1$2$1;
        int i;
        ?? r14;
        boolean z;
        ps0 ps0Var;
        if (continuation instanceof AddressDetailsViewModel$special$$inlined$map$1$2$1) {
            addressDetailsViewModel$special$$inlined$map$1$2$1 = (AddressDetailsViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = addressDetailsViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressDetailsViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ot0 ot0Var = (ot0) obj;
                    int i3 = zt0.a[ot0Var.g.ordinal()];
                    if (i3 == 1) {
                        g2q0 g2q0Var = ot0Var.a;
                        List list = ot0Var.d;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it = list.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            r14 = EmptyList.a;
                            if (!hasNext) {
                                break;
                            }
                            x7l0 x7l0Var = (x7l0) it.next();
                            c2r0 c2r0Var = new c2r0(3, 1);
                            c2r0Var.a(x7l0Var.d);
                            c2r0Var.a(x7l0Var);
                            g2q0 g2q0Var2 = x7l0Var.o;
                            List list2 = g2q0Var2 != null ? g2q0Var2.a : null;
                            if (list2 != null) {
                                r14 = list2;
                            }
                            c2r0Var.b(((Collection) r14).toArray(new n351[0]));
                            ArrayList arrayList2 = c2r0Var.b;
                            arrayList.add(j73.A(arrayList2.toArray(new n351[arrayList2.size()])));
                        }
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((x7l0) it2.next()).r != null) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (!arrayList.isEmpty()) {
                            if (z) {
                                r14 = Collections.singletonList(new g2q0(tcc.o(arrayList), null, null, null, false, null, null, null, null, 1022));
                            } else {
                                r14 = new ArrayList(tcc.n(arrayList, 10));
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    r14.add(new g2q0((List) it3.next(), null, null, null, false, null, null, null, null, 1022));
                                }
                            }
                        }
                        g2q0 g2q0Var3 = ot0Var.b;
                        c2r0 c2r0Var2 = new c2r0(3, 1);
                        c2r0Var2.a(g2q0Var);
                        c2r0Var2.b(((Collection) r14).toArray(new g2q0[0]));
                        c2r0Var2.a(g2q0Var3);
                        ArrayList arrayList3 = c2r0Var2.b;
                        ps0Var = new ps0(ot0Var.l, new qkg(j73.A(arrayList3.toArray(new g2q0[arrayList3.size()])), null, null, null, 30), ot0Var.e, new qkg(scc.h(ot0Var.c), null, null, null, 30), ot0Var.j, ot0Var.k, ot0Var.h, ot0Var.i);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        ps0Var = this.b.z;
                    }
                    addressDetailsViewModel$special$$inlined$map$1$2$1.L$0 = null;
                    addressDetailsViewModel$special$$inlined$map$1$2$1.L$1 = null;
                    addressDetailsViewModel$special$$inlined$map$1$2$1.L$2 = null;
                    addressDetailsViewModel$special$$inlined$map$1$2$1.L$3 = null;
                    addressDetailsViewModel$special$$inlined$map$1$2$1.I$0 = 0;
                    addressDetailsViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ps0Var, addressDetailsViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressDetailsViewModel$special$$inlined$map$1$2$1 = new AddressDetailsViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressDetailsViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
