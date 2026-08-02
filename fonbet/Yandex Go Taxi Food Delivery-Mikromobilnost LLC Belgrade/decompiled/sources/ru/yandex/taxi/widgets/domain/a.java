package ru.yandex.taxi.widgets.domain;

import com.yandex.go.dto.response.BundledOrdersPayload;
import com.yandex.go.dto.response.OrderCardDto;
import com.yandex.go.dto.response.OrderDto;
import defpackage.d3p;
import defpackage.evu0;
import defpackage.h1p;
import defpackage.i501;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.kv6;
import defpackage.lia1;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.ou6;
import defpackage.pu6;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tcc;
import defpackage.txw0;
import defpackage.vez0;
import defpackage.w201;
import defpackage.yaf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final class a {
    public final k7x0 a;
    public final c b;

    public a(k7x0 k7x0Var, c cVar) {
        this.a = k7x0Var;
        this.b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x023f A[LOOP:0: B:13:0x0239->B:15:0x023f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0110 -> B:22:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0128 -> B:23:0x0129). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, BundledOrdersPayload bundledOrdersPayload, String str, yaf0 yaf0Var, ContinuationImpl continuationImpl) {
        BundledOrdersMapper$mapBundledOrdersWidget$1 bundledOrdersMapper$mapBundledOrdersWidget$1;
        int i;
        yaf0 yaf0Var2;
        List a;
        List list2;
        BundledOrdersMapper$mapBundledOrdersWidget$1 bundledOrdersMapper$mapBundledOrdersWidget$12;
        Iterator it;
        List list3;
        BundledOrdersPayload bundledOrdersPayload2;
        String str2;
        boolean hasNext;
        ListBuilder listBuilder;
        ArrayList arrayList;
        BundledOrdersPayload bundledOrdersPayload3;
        Object obj;
        String str3;
        h1p h1pVar;
        w201 w201Var;
        Iterator it2;
        if (continuationImpl instanceof BundledOrdersMapper$mapBundledOrdersWidget$1) {
            bundledOrdersMapper$mapBundledOrdersWidget$1 = (BundledOrdersMapper$mapBundledOrdersWidget$1) continuationImpl;
            int i2 = bundledOrdersMapper$mapBundledOrdersWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bundledOrdersMapper$mapBundledOrdersWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bundledOrdersMapper$mapBundledOrdersWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bundledOrdersMapper$mapBundledOrdersWidget$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    yaf0Var2 = yaf0Var;
                    a = rcc.a();
                    list2 = a;
                    bundledOrdersMapper$mapBundledOrdersWidget$12 = bundledOrdersMapper$mapBundledOrdersWidget$1;
                    it = bundledOrdersPayload.getC().iterator();
                    list3 = list;
                    bundledOrdersPayload2 = bundledOrdersPayload;
                    str2 = str;
                    hasNext = it.hasNext();
                    c cVar = this.b;
                    if (!hasNext) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r0 = (List) bundledOrdersMapper$mapBundledOrdersWidget$1.L$5;
                    ?? r3 = (List) bundledOrdersMapper$mapBundledOrdersWidget$1.L$4;
                    str2 = (String) bundledOrdersMapper$mapBundledOrdersWidget$1.L$2;
                    bundledOrdersPayload3 = (BundledOrdersPayload) bundledOrdersMapper$mapBundledOrdersWidget$1.L$1;
                    kotlin.b.b(obj2);
                    arrayList = r0;
                    listBuilder = r3;
                    String str4 = str2;
                    i501 i501Var = (i501) obj2;
                    FormattedText a2 = bundledOrdersPayload3.getA();
                    FormattedText b = bundledOrdersPayload3.getB();
                    List c = bundledOrdersPayload3.getC();
                    ArrayList arrayList2 = new ArrayList(tcc.n(c, 10));
                    it2 = c.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((OrderDto) it2.next()).getA());
                    }
                    return new pu6(str4, i501Var, a2, b, arrayList, arrayList2, listBuilder);
                }
                List list4 = (List) bundledOrdersMapper$mapBundledOrdersWidget$1.L$11;
                Iterator it3 = (Iterator) bundledOrdersMapper$mapBundledOrdersWidget$1.L$7;
                List list5 = (List) bundledOrdersMapper$mapBundledOrdersWidget$1.L$5;
                List list6 = (List) bundledOrdersMapper$mapBundledOrdersWidget$1.L$4;
                yaf0 yaf0Var3 = (yaf0) bundledOrdersMapper$mapBundledOrdersWidget$1.L$3;
                String str5 = (String) bundledOrdersMapper$mapBundledOrdersWidget$1.L$2;
                BundledOrdersPayload bundledOrdersPayload4 = (BundledOrdersPayload) bundledOrdersMapper$mapBundledOrdersWidget$1.L$1;
                List list7 = (List) bundledOrdersMapper$mapBundledOrdersWidget$1.L$0;
                kotlin.b.b(obj2);
                boolean z = true;
                list4.add(obj2);
                yaf0 yaf0Var4 = yaf0Var3;
                it = it3;
                yaf0Var2 = yaf0Var4;
                str2 = str5;
                list3 = list7;
                list2 = list6;
                a = list5;
                bundledOrdersMapper$mapBundledOrdersWidget$12 = bundledOrdersMapper$mapBundledOrdersWidget$1;
                bundledOrdersPayload2 = bundledOrdersPayload4;
                hasNext = it.hasNext();
                c cVar2 = this.b;
                if (!hasNext) {
                    OrderDto orderDto = (OrderDto) it.next();
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            w201Var = 0;
                            break;
                        }
                        w201Var = it4.next();
                        if (jl40.l(lia1.e((w201) w201Var), orderDto.getC())) {
                            break;
                        }
                    }
                    w201 w201Var2 = w201Var;
                    if (w201Var2 != null) {
                        String D = vez0.D(yaf0Var2);
                        OrderCardDto d = orderDto.getD();
                        txw0 a3 = d != null ? d.getA() : null;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$0 = list3;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$1 = bundledOrdersPayload2;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$2 = str2;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$3 = yaf0Var2;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$4 = list2;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$5 = a;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$6 = null;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$7 = it;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$8 = null;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$9 = null;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$10 = null;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.L$11 = a;
                        z = true;
                        bundledOrdersMapper$mapBundledOrdersWidget$12.label = 1;
                        Object a4 = cVar2.a(w201Var2, D, a3, bundledOrdersMapper$mapBundledOrdersWidget$12);
                        if (a4 != coroutineSingletons) {
                            Iterator it5 = it;
                            yaf0Var3 = yaf0Var2;
                            it3 = it5;
                            list7 = list3;
                            bundledOrdersPayload4 = bundledOrdersPayload2;
                            obj2 = a4;
                            bundledOrdersMapper$mapBundledOrdersWidget$1 = bundledOrdersMapper$mapBundledOrdersWidget$12;
                            list5 = a;
                            list6 = list2;
                            str5 = str2;
                            list4 = list5;
                            list4.add(obj2);
                            yaf0 yaf0Var42 = yaf0Var3;
                            it = it3;
                            yaf0Var2 = yaf0Var42;
                            str2 = str5;
                            list3 = list7;
                            list2 = list6;
                            a = list5;
                            bundledOrdersMapper$mapBundledOrdersWidget$12 = bundledOrdersMapper$mapBundledOrdersWidget$1;
                            bundledOrdersPayload2 = bundledOrdersPayload4;
                            hasNext = it.hasNext();
                            c cVar22 = this.b;
                            if (!hasNext) {
                                ListBuilder j = ((ListBuilder) list2).j();
                                List c2 = bundledOrdersPayload2.getC();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj3 : c2) {
                                    if (((OrderDto) obj3).getB().length() > 0) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it6 = arrayList3.iterator();
                                while (it6.hasNext()) {
                                    OrderDto orderDto2 = (OrderDto) it6.next();
                                    ListIterator listIterator = j.listIterator(0);
                                    while (true) {
                                        qqy qqyVar = (qqy) listIterator;
                                        if (!qqyVar.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = qqyVar.next();
                                        if (jl40.l(lia1.e((w201) obj), orderDto2.getC())) {
                                            break;
                                        }
                                    }
                                    w201 w201Var3 = (w201) obj;
                                    boolean z2 = w201Var3 instanceof d3p;
                                    d3p d3pVar = z2 ? (d3p) w201Var3 : null;
                                    Integer num = (d3pVar == null || (h1pVar = d3pVar.c) == null) ? null : new Integer(h1pVar.getLogoId());
                                    String b2 = orderDto2.getB();
                                    if (evu0.J(b2)) {
                                        b2 = null;
                                    }
                                    if (b2 == null || (str3 = ((m7x0) this.a).a(b2)) == null) {
                                        d3p d3pVar2 = z2 ? (d3p) w201Var3 : null;
                                        str3 = d3pVar2 != null ? d3pVar2.g : null;
                                    }
                                    ou6 ou6Var = (num == null && str3 == null) ? null : new ou6(str3, num);
                                    if (ou6Var != null) {
                                        arrayList4.add(ou6Var);
                                    }
                                }
                                txw0 d2 = bundledOrdersPayload2.getD();
                                String D2 = vez0.D(yaf0Var2);
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$0 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$1 = bundledOrdersPayload2;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$2 = str2;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$3 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$4 = j;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$5 = arrayList4;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$6 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$7 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$8 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$9 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$10 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.L$11 = null;
                                bundledOrdersMapper$mapBundledOrdersWidget$12.label = 2;
                                Object b3 = cVar22.b(d2, D2, bundledOrdersMapper$mapBundledOrdersWidget$12);
                                if (b3 != coroutineSingletons) {
                                    listBuilder = j;
                                    arrayList = arrayList4;
                                    obj2 = b3;
                                    bundledOrdersPayload3 = bundledOrdersPayload2;
                                    String str42 = str2;
                                    i501 i501Var2 = (i501) obj2;
                                    FormattedText a22 = bundledOrdersPayload3.getA();
                                    FormattedText b4 = bundledOrdersPayload3.getB();
                                    List c3 = bundledOrdersPayload3.getC();
                                    ArrayList arrayList22 = new ArrayList(tcc.n(c3, 10));
                                    it2 = c3.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    return new pu6(str42, i501Var2, a22, b4, arrayList, arrayList22, listBuilder);
                                }
                            }
                        }
                    } else {
                        z = true;
                        hasNext = it.hasNext();
                        c cVar222 = this.b;
                        if (!hasNext) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        bundledOrdersMapper$mapBundledOrdersWidget$1 = new BundledOrdersMapper$mapBundledOrdersWidget$1(this, continuationImpl);
        Object obj22 = bundledOrdersMapper$mapBundledOrdersWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bundledOrdersMapper$mapBundledOrdersWidget$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01a9, code lost:
    
        if (r2 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ab, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011f, code lost:
    
        if (r13 == r0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01a9 -> B:18:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01af -> B:19:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, kv6 kv6Var, yaf0 yaf0Var, ContinuationImpl continuationImpl) {
        BundledOrdersMapper$mapOrdersWidget$1 bundledOrdersMapper$mapOrdersWidget$1;
        int i;
        a aVar;
        txw0 txw0Var;
        Iterator it;
        Collection collection;
        kv6 kv6Var2;
        yaf0 yaf0Var2;
        Object obj;
        if (continuationImpl instanceof BundledOrdersMapper$mapOrdersWidget$1) {
            bundledOrdersMapper$mapOrdersWidget$1 = (BundledOrdersMapper$mapOrdersWidget$1) continuationImpl;
            int i2 = bundledOrdersMapper$mapOrdersWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bundledOrdersMapper$mapOrdersWidget$1.label = i2 - Integer.MIN_VALUE;
                BundledOrdersMapper$mapOrdersWidget$1 bundledOrdersMapper$mapOrdersWidget$12 = bundledOrdersMapper$mapOrdersWidget$1;
                Object obj2 = bundledOrdersMapper$mapOrdersWidget$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bundledOrdersMapper$mapOrdersWidget$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (list.size() > 1 && kv6Var.getA().getC().size() > 1) {
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(lia1.e((w201) it2.next()));
                        }
                        List c = kv6Var.getA().getC();
                        ArrayList arrayList2 = new ArrayList(tcc.n(c, 10));
                        Iterator it3 = c.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((OrderDto) it3.next()).getC());
                        }
                        int i3 = 0;
                        if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                if (arrayList2.contains((String) it4.next()) && (i3 = i3 + 1) < 0) {
                                    scc.l();
                                    throw null;
                                }
                            }
                        }
                        if (i3 > 1) {
                            BundledOrdersPayload a = kv6Var.getA();
                            String b = kv6Var.getB();
                            bundledOrdersMapper$mapOrdersWidget$12.L$0 = null;
                            bundledOrdersMapper$mapOrdersWidget$12.L$1 = null;
                            bundledOrdersMapper$mapOrdersWidget$12.L$2 = null;
                            bundledOrdersMapper$mapOrdersWidget$12.label = 2;
                            obj2 = a(list, a, b, yaf0Var, bundledOrdersMapper$mapOrdersWidget$12);
                        }
                    }
                    aVar = this;
                    txw0Var = null;
                    ArrayList arrayList3 = new ArrayList();
                    it = list.iterator();
                    collection = arrayList3;
                    kv6Var2 = kv6Var;
                    yaf0Var2 = yaf0Var;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    it = (Iterator) bundledOrdersMapper$mapOrdersWidget$12.L$7;
                    collection = (Collection) bundledOrdersMapper$mapOrdersWidget$12.L$5;
                    yaf0Var2 = (yaf0) bundledOrdersMapper$mapOrdersWidget$12.L$2;
                    kv6 kv6Var3 = (kv6) bundledOrdersMapper$mapOrdersWidget$12.L$1;
                    kotlin.b.b(obj2);
                    aVar = this;
                    kv6Var2 = kv6Var3;
                    Object a2 = obj2;
                    txw0Var = null;
                    Object obj3 = (w201) a2;
                    if (obj3 != null) {
                        collection.add(obj3);
                    }
                    if (it.hasNext()) {
                        w201 w201Var = (w201) it.next();
                        Iterator it5 = kv6Var2.getA().getC().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = txw0Var;
                                break;
                            }
                            obj = it5.next();
                            if (jl40.l(((OrderDto) obj).getC(), lia1.e(w201Var))) {
                                break;
                            }
                        }
                        OrderDto orderDto = (OrderDto) obj;
                        if (orderDto != null) {
                            String D = vez0.D(yaf0Var2);
                            OrderCardDto d = orderDto.getD();
                            txw0 a3 = d != null ? d.getA() : txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$0 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$1 = kv6Var2;
                            bundledOrdersMapper$mapOrdersWidget$12.L$2 = yaf0Var2;
                            bundledOrdersMapper$mapOrdersWidget$12.L$3 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$4 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$5 = collection;
                            bundledOrdersMapper$mapOrdersWidget$12.L$6 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$7 = it;
                            bundledOrdersMapper$mapOrdersWidget$12.L$8 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$9 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$10 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$11 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.L$12 = txw0Var;
                            bundledOrdersMapper$mapOrdersWidget$12.label = 1;
                            a2 = aVar.b.a(w201Var, D, a3, bundledOrdersMapper$mapOrdersWidget$12);
                        } else {
                            obj3 = txw0Var;
                            if (obj3 != null) {
                            }
                            if (it.hasNext()) {
                                return (List) collection;
                            }
                        }
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return Collections.singletonList(obj2);
            }
        }
        bundledOrdersMapper$mapOrdersWidget$1 = new BundledOrdersMapper$mapOrdersWidget$1(this, continuationImpl);
        BundledOrdersMapper$mapOrdersWidget$1 bundledOrdersMapper$mapOrdersWidget$122 = bundledOrdersMapper$mapOrdersWidget$1;
        Object obj22 = bundledOrdersMapper$mapOrdersWidget$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bundledOrdersMapper$mapOrdersWidget$122.label;
        if (i != 0) {
        }
        return Collections.singletonList(obj22);
    }
}
