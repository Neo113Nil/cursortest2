package ru.yandex.logistics.sdk.cargo_form.core.impl.order;

import com.yandex.delivery.mapper.model.PointType;
import defpackage.a0t;
import defpackage.a6s;
import defpackage.bwe;
import defpackage.c6f;
import defpackage.doe;
import defpackage.e0l0;
import defpackage.j6i;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.k6i;
import defpackage.l6s;
import defpackage.lkb0;
import defpackage.m6i;
import defpackage.mea0;
import defpackage.n6i;
import defpackage.ny61;
import defpackage.o6i;
import defpackage.oo0;
import defpackage.p1a0;
import defpackage.qv0;
import defpackage.s9e;
import defpackage.sr60;
import defpackage.tcc;
import defpackage.up21;
import defpackage.w511;
import defpackage.zls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final up21 b;
    public final l6s c;
    public final a6s d;

    public b(String str, up21 up21Var, l6s l6sVar, a6s a6sVar) {
        this.a = str;
        this.b = up21Var;
        this.c = l6sVar;
        this.d = a6sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c6f c6fVar, List list, a0t a0tVar, mea0 mea0Var, e0l0 e0l0Var, j6s j6sVar, zls zlsVar, ContinuationImpl continuationImpl) {
        FormOrderMapper$createDeliveryDraft$1 formOrderMapper$createDeliveryDraft$1;
        int i;
        ArrayList arrayList;
        List list2;
        ArrayList arrayList2;
        doe doeVar;
        p1a0 p1a0Var;
        Iterator it;
        Object k6iVar;
        if (continuationImpl instanceof FormOrderMapper$createDeliveryDraft$1) {
            formOrderMapper$createDeliveryDraft$1 = (FormOrderMapper$createDeliveryDraft$1) continuationImpl;
            int i2 = formOrderMapper$createDeliveryDraft$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formOrderMapper$createDeliveryDraft$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formOrderMapper$createDeliveryDraft$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formOrderMapper$createDeliveryDraft$1.label;
                ArrayList arrayList3 = null;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return null;
                }
                kotlin.b.b(obj);
                if (!jl40.l(c6fVar, c6f.a)) {
                    if (!jl40.l(c6fVar, c6f.b)) {
                        w511.b();
                        return null;
                    }
                    List list3 = list;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((sr60) it2.next()).a);
                    }
                    doe doeVar2 = new doe(a0tVar.a, a0tVar.b);
                    Object f = j6sVar != null ? this.c.f(j6sVar) : kotlin.collections.b.f();
                    a6s a6sVar = this.d;
                    return new o6i(arrayList4, doeVar2, f, this.a, a6sVar != null ? a6sVar.a : null);
                }
                if (mea0Var == null) {
                    Object R = kotlin.collections.a.R(list);
                    formOrderMapper$createDeliveryDraft$1.L$0 = null;
                    formOrderMapper$createDeliveryDraft$1.L$1 = null;
                    formOrderMapper$createDeliveryDraft$1.L$2 = null;
                    formOrderMapper$createDeliveryDraft$1.L$3 = null;
                    formOrderMapper$createDeliveryDraft$1.L$4 = null;
                    formOrderMapper$createDeliveryDraft$1.L$5 = null;
                    formOrderMapper$createDeliveryDraft$1.L$6 = null;
                    formOrderMapper$createDeliveryDraft$1.label = 1;
                    if (((FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$1) zlsVar).invoke(R, mea0Var, formOrderMapper$createDeliveryDraft$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return null;
                }
                List list4 = list;
                ArrayList arrayList5 = new ArrayList(tcc.n(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((sr60) it3.next()).a);
                }
                doe doeVar3 = new doe(a0tVar.a, a0tVar.b);
                p1a0 p1a0Var2 = new p1a0(mea0Var.b, mea0Var.a, mea0Var.g);
                List list5 = e0l0Var.a;
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    qv0 qv0Var = (qv0) it4.next();
                    oo0 oo0Var = qv0Var.a;
                    s9e s9eVar = qv0Var.g;
                    if (oo0Var == null) {
                        doeVar = doeVar3;
                        p1a0Var = p1a0Var2;
                        it = it4;
                        arrayList2 = arrayList3;
                        k6iVar = arrayList2;
                    } else {
                        if (s9eVar.b.length() == 0) {
                            s9eVar = new s9e("", this.b.a());
                        }
                        s9e s9eVar2 = s9eVar;
                        List list6 = qv0Var.h;
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj2 : list6) {
                            if (obj2 instanceof lkb0) {
                                arrayList7.add(obj2);
                            }
                        }
                        PointType pointType = oo0Var.b;
                        UUID.randomUUID().toString();
                        String str = oo0Var.c;
                        String str2 = str == null ? "" : str;
                        a0t a0tVar2 = oo0Var.f;
                        arrayList2 = arrayList3;
                        doe doeVar4 = new doe(a0tVar2.a, a0tVar2.b);
                        String str3 = oo0Var.e;
                        String str4 = qv0Var.e;
                        String str5 = oo0Var.a;
                        String str6 = oo0Var.d;
                        String str7 = qv0Var.b;
                        doeVar = doeVar3;
                        String str8 = qv0Var.d;
                        String str9 = qv0Var.c;
                        String str10 = qv0Var.f;
                        p1a0Var = p1a0Var2;
                        it = it4;
                        ArrayList arrayList8 = new ArrayList(tcc.n(arrayList7, 10));
                        for (Iterator it5 = arrayList7.iterator(); it5.hasNext(); it5 = it5) {
                            lkb0 lkb0Var = (lkb0) it5.next();
                            arrayList8.add(new m6i(lkb0Var.a(), lkb0Var.b()));
                        }
                        k6iVar = new k6i(pointType, str2, doeVar4, str3, str4, str5, str6, str7, str8, str9, str10, s9eVar2, arrayList8);
                    }
                    if (k6iVar != null) {
                        arrayList6.add(k6iVar);
                    }
                    p1a0Var2 = p1a0Var;
                    doeVar3 = doeVar;
                    it4 = it;
                    arrayList3 = arrayList2;
                }
                doe doeVar5 = doeVar3;
                p1a0 p1a0Var3 = p1a0Var2;
                ArrayList arrayList9 = arrayList3;
                if (j6sVar == null || (list2 = j6sVar.f) == null) {
                    arrayList = arrayList9;
                } else {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((bwe) obj3).c != null) {
                            arrayList10.add(obj3);
                        }
                    }
                    arrayList = new ArrayList(tcc.n(arrayList10, 10));
                    Iterator it6 = arrayList10.iterator();
                    while (it6.hasNext()) {
                        bwe bweVar = (bwe) it6.next();
                        String str11 = bweVar.a;
                        String str12 = bweVar.c;
                        if (str12 == null) {
                            str12 = "";
                        }
                        arrayList.add(new j6i(str11, bweVar.b, str12));
                    }
                }
                return new n6i(arrayList5, doeVar5, "", p1a0Var3, arrayList, arrayList6, null);
            }
        }
        formOrderMapper$createDeliveryDraft$1 = new FormOrderMapper$createDeliveryDraft$1(this, continuationImpl);
        Object obj4 = formOrderMapper$createDeliveryDraft$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formOrderMapper$createDeliveryDraft$1.label;
        ArrayList arrayList32 = null;
        if (i == 0) {
        }
    }
}
