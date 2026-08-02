package ru.yandex.taxi.superapp.orders.eats;

import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.superapp.tracking.api.dependencies.c;
import com.yandex.go.superapp.tracking.domain.f;
import defpackage.a3p;
import defpackage.c3p;
import defpackage.c4v;
import defpackage.c501;
import defpackage.d3p;
import defpackage.d501;
import defpackage.e401;
import defpackage.evu0;
import defpackage.f501;
import defpackage.ffn;
import defpackage.h1p;
import defpackage.hzk;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.nfn;
import defpackage.ny61;
import defpackage.oen;
import defpackage.pdc;
import defpackage.pen;
import defpackage.qen;
import defpackage.ren;
import defpackage.szv0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uwq0;
import defpackage.wl40;
import defpackage.wmh;
import defpackage.y2p;
import defpackage.z2p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;
import ru.yandex.taxi.experiments.superapp.j;

/* loaded from: classes10.dex */
public final class a extends c {
    public final k7x0 f;
    public final hzk g;
    public final com.yandex.go.order.ui.presentation.item_type.eats_order.mappers.timeline.a h;
    public final j i;
    public final d501 j;

    public a(tt2 tt2Var, tse tseVar, g gVar, wmh wmhVar, k7x0 k7x0Var, hzk hzkVar, com.yandex.go.order.ui.presentation.item_type.eats_order.mappers.timeline.a aVar, j jVar, d501 d501Var) {
        super(tt2Var, tseVar, gVar.h(), wmhVar);
        this.f = k7x0Var;
        this.g = hzkVar;
        this.h = aVar;
        this.i = jVar;
        this.j = d501Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pen penVar, ContinuationImpl continuationImpl) {
        EatsOrderModelSourceInteractor$getButton$1 eatsOrderModelSourceInteractor$getButton$1;
        int i;
        String str;
        String str2;
        c501 c501Var;
        pen penVar2;
        String str3;
        String str4;
        if (continuationImpl instanceof EatsOrderModelSourceInteractor$getButton$1) {
            eatsOrderModelSourceInteractor$getButton$1 = (EatsOrderModelSourceInteractor$getButton$1) continuationImpl;
            int i2 = eatsOrderModelSourceInteractor$getButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderModelSourceInteractor$getButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsOrderModelSourceInteractor$getButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderModelSourceInteractor$getButton$1.label;
                if (i != 0) {
                    b.b(obj);
                    String c = penVar.c();
                    String e = penVar.e();
                    String d = penVar.d();
                    if (d == null) {
                        str = c;
                        str2 = e;
                        c501Var = null;
                        Object obj2 = penVar.b().get("button_service");
                        String obj3 = obj2 != null ? obj2.toString() : null;
                        String a = penVar.a();
                        qen f = penVar.f();
                        return new z2p(str, str2, c501Var, obj3, a, f != null ? new c3p(f.a(), f.b()) : null);
                    }
                    eatsOrderModelSourceInteractor$getButton$1.L$0 = penVar;
                    eatsOrderModelSourceInteractor$getButton$1.L$1 = null;
                    eatsOrderModelSourceInteractor$getButton$1.L$2 = c;
                    eatsOrderModelSourceInteractor$getButton$1.L$3 = e;
                    eatsOrderModelSourceInteractor$getButton$1.label = 1;
                    Object b = ((f) this.j).b(d, eatsOrderModelSourceInteractor$getButton$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    penVar2 = penVar;
                    str3 = c;
                    obj = b;
                    str4 = e;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = (String) eatsOrderModelSourceInteractor$getButton$1.L$3;
                    str3 = (String) eatsOrderModelSourceInteractor$getButton$1.L$2;
                    penVar2 = (pen) eatsOrderModelSourceInteractor$getButton$1.L$0;
                    b.b(obj);
                }
                str2 = str4;
                str = str3;
                c501Var = (c501) obj;
                penVar = penVar2;
                Object obj22 = penVar.b().get("button_service");
                if (obj22 != null) {
                }
                String a2 = penVar.a();
                qen f2 = penVar.f();
                return new z2p(str, str2, c501Var, obj3, a2, f2 != null ? new c3p(f2.a(), f2.b()) : null);
            }
        }
        eatsOrderModelSourceInteractor$getButton$1 = new EatsOrderModelSourceInteractor$getButton$1(this, continuationImpl);
        Object obj4 = eatsOrderModelSourceInteractor$getButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderModelSourceInteractor$getButton$1.label;
        if (i != 0) {
        }
        str2 = str4;
        str = str3;
        c501Var = (c501) obj4;
        penVar = penVar2;
        Object obj222 = penVar.b().get("button_service");
        if (obj222 != null) {
        }
        String a22 = penVar.a();
        qen f22 = penVar.f();
        return new z2p(str, str2, c501Var, obj3, a22, f22 != null ? new c3p(f22.a(), f22.b()) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b9, code lost:
    
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r34v0, types: [ru.yandex.taxi.superapp.orders.eats.a] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x03ee -> B:12:0x0400). Please report as a decompilation issue!!! */
    @Override // com.yandex.go.superapp.tracking.api.dependencies.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wl40 wl40Var, Continuation continuation) {
        EatsOrderModelSourceInteractor$mapToModels$1 eatsOrderModelSourceInteractor$mapToModels$1;
        int i;
        String str;
        ArrayList arrayList;
        Iterator it;
        String str2;
        EatsOrderModelSourceInteractor$mapToModels$1 eatsOrderModelSourceInteractor$mapToModels$12;
        Iterator it2;
        ArrayList arrayList2;
        String str3;
        h1p h1pVar;
        String str4;
        f501 f501Var;
        String str5;
        EatsOrderStatus eatsOrderStatus;
        ArrayList arrayList3;
        String str6;
        a3p a3pVar;
        e401 e401Var;
        ren renVar;
        CoroutineSingletons coroutineSingletons;
        Object obj;
        ArrayList arrayList4;
        CoroutineSingletons coroutineSingletons2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        z2p z2pVar;
        a3p a3pVar2;
        EatsOrderModelSourceInteractor$mapToModels$1 eatsOrderModelSourceInteractor$mapToModels$13;
        e401 e401Var2;
        Iterator it3;
        String str7;
        ren renVar2;
        EatsOrderStatus eatsOrderStatus2;
        String str8;
        ArrayList arrayList7;
        String str9;
        String str10;
        ren renVar3;
        Object obj2;
        ffn f;
        a3p a3pVar3;
        ArrayList arrayList8;
        String str11;
        Object obj3;
        pen q;
        FormattedText c;
        Object b;
        String str12;
        a aVar = this;
        if (continuation instanceof EatsOrderModelSourceInteractor$mapToModels$1) {
            eatsOrderModelSourceInteractor$mapToModels$1 = (EatsOrderModelSourceInteractor$mapToModels$1) continuation;
            int i2 = eatsOrderModelSourceInteractor$mapToModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderModelSourceInteractor$mapToModels$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = eatsOrderModelSourceInteractor$mapToModels$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderModelSourceInteractor$mapToModels$1.label;
                if (i != 0) {
                    str = null;
                    b.b(obj4);
                    List list = wl40Var.c;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    ?? r1 = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$16;
                    String str13 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$14;
                    String str14 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$13;
                    EatsOrderStatus eatsOrderStatus3 = (EatsOrderStatus) eatsOrderModelSourceInteractor$mapToModels$1.L$12;
                    String str15 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$11;
                    f501 f501Var2 = (f501) eatsOrderModelSourceInteractor$mapToModels$1.L$10;
                    String str16 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$9;
                    h1p h1pVar2 = (h1p) eatsOrderModelSourceInteractor$mapToModels$1.L$8;
                    String str17 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$7;
                    ren renVar4 = (ren) eatsOrderModelSourceInteractor$mapToModels$1.L$6;
                    Iterator it4 = (Iterator) eatsOrderModelSourceInteractor$mapToModels$1.L$4;
                    ?? r14 = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$3;
                    b.b(obj4);
                    it2 = it4;
                    str3 = str17;
                    str4 = str16;
                    str5 = str15;
                    str9 = str14;
                    renVar3 = renVar4;
                    h1pVar = h1pVar2;
                    f501Var = f501Var2;
                    eatsOrderStatus = eatsOrderStatus3;
                    str10 = str13;
                    arrayList = r1;
                    obj2 = obj4;
                    arrayList7 = r14;
                    a3p a3pVar4 = (a3p) obj2;
                    f = renVar3.f();
                    CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                    hzk hzkVar = aVar.g;
                    hzkVar.getClass();
                    if (f == null) {
                    }
                    q = renVar3.q();
                    if (q == null) {
                    }
                } else if (i == 2) {
                    ?? r12 = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$19;
                    e401Var = (e401) eatsOrderModelSourceInteractor$mapToModels$1.L$17;
                    a3pVar = (a3p) eatsOrderModelSourceInteractor$mapToModels$1.L$16;
                    str6 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$14;
                    String str18 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$13;
                    eatsOrderStatus = (EatsOrderStatus) eatsOrderModelSourceInteractor$mapToModels$1.L$12;
                    str5 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$11;
                    f501Var = (f501) eatsOrderModelSourceInteractor$mapToModels$1.L$10;
                    str4 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$9;
                    h1pVar = (h1p) eatsOrderModelSourceInteractor$mapToModels$1.L$8;
                    str3 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$7;
                    ren renVar5 = (ren) eatsOrderModelSourceInteractor$mapToModels$1.L$6;
                    it2 = (Iterator) eatsOrderModelSourceInteractor$mapToModels$1.L$4;
                    ?? r13 = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$3;
                    b.b(obj4);
                    str2 = str18;
                    obj = obj4;
                    arrayList3 = r12;
                    eatsOrderModelSourceInteractor$mapToModels$12 = eatsOrderModelSourceInteractor$mapToModels$1;
                    coroutineSingletons = coroutineSingletons3;
                    renVar = renVar5;
                    arrayList2 = r13;
                    z2p z2pVar2 = (z2p) obj;
                    ArrayList arrayList9 = arrayList2;
                    List b2 = renVar.b();
                    ren renVar6 = renVar;
                    e401 e401Var3 = e401Var;
                    a3p a3pVar5 = a3pVar;
                    arrayList4 = arrayList9;
                    coroutineSingletons2 = coroutineSingletons;
                    arrayList5 = new ArrayList(tcc.n(b2, 10));
                    arrayList6 = arrayList3;
                    z2pVar = z2pVar2;
                    a3pVar2 = a3pVar5;
                    eatsOrderModelSourceInteractor$mapToModels$13 = eatsOrderModelSourceInteractor$mapToModels$12;
                    e401Var2 = e401Var3;
                    it3 = b2.iterator();
                    str7 = str5;
                    renVar2 = renVar6;
                    eatsOrderStatus2 = eatsOrderStatus;
                    str8 = str2;
                    if (it3.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r4 = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$26;
                    Collection collection = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$25;
                    Iterator it5 = (Iterator) eatsOrderModelSourceInteractor$mapToModels$1.L$22;
                    ?? r122 = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$21;
                    z2p z2pVar3 = (z2p) eatsOrderModelSourceInteractor$mapToModels$1.L$18;
                    e401 e401Var4 = (e401) eatsOrderModelSourceInteractor$mapToModels$1.L$17;
                    a3p a3pVar6 = (a3p) eatsOrderModelSourceInteractor$mapToModels$1.L$16;
                    str6 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$14;
                    String str19 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$13;
                    EatsOrderStatus eatsOrderStatus4 = (EatsOrderStatus) eatsOrderModelSourceInteractor$mapToModels$1.L$12;
                    String str20 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$11;
                    f501 f501Var3 = (f501) eatsOrderModelSourceInteractor$mapToModels$1.L$10;
                    String str21 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$9;
                    h1p h1pVar3 = (h1p) eatsOrderModelSourceInteractor$mapToModels$1.L$8;
                    String str22 = (String) eatsOrderModelSourceInteractor$mapToModels$1.L$7;
                    ren renVar7 = (ren) eatsOrderModelSourceInteractor$mapToModels$1.L$6;
                    Iterator it6 = (Iterator) eatsOrderModelSourceInteractor$mapToModels$1.L$4;
                    ?? r15 = (Collection) eatsOrderModelSourceInteractor$mapToModels$1.L$3;
                    b.b(obj4);
                    str8 = str19;
                    a3pVar2 = a3pVar6;
                    String str23 = str20;
                    eatsOrderStatus2 = eatsOrderStatus4;
                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons3;
                    arrayList6 = r4;
                    it3 = it5;
                    arrayList5 = r122;
                    renVar2 = renVar7;
                    String str24 = str21;
                    eatsOrderModelSourceInteractor$mapToModels$13 = eatsOrderModelSourceInteractor$mapToModels$1;
                    f501 f501Var4 = f501Var3;
                    Object b3 = obj4;
                    arrayList4 = r15;
                    collection.add((z2p) b3);
                    coroutineSingletons2 = coroutineSingletons5;
                    f501Var = f501Var4;
                    str4 = str24;
                    z2pVar = z2pVar3;
                    e401Var2 = e401Var4;
                    str7 = str23;
                    h1pVar = h1pVar3;
                    str3 = str22;
                    it2 = it6;
                    if (it3.hasNext()) {
                        ArrayList arrayList10 = arrayList5;
                        pen penVar = (pen) it3.next();
                        eatsOrderModelSourceInteractor$mapToModels$13.L$0 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$1 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$2 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$3 = arrayList4;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$4 = it2;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$5 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$6 = renVar2;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$7 = str3;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$8 = h1pVar;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$9 = str4;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$10 = f501Var;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$11 = str7;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$12 = eatsOrderStatus2;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$13 = str8;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$14 = str6;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$15 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$16 = a3pVar2;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$17 = e401Var2;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$18 = z2pVar;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$19 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$20 = null;
                        arrayList5 = arrayList10;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$21 = arrayList5;
                        ren renVar8 = renVar2;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$22 = it3;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$23 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$24 = null;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$25 = arrayList5;
                        ArrayList arrayList11 = arrayList6;
                        eatsOrderModelSourceInteractor$mapToModels$13.L$26 = arrayList11;
                        e401 e401Var5 = e401Var2;
                        eatsOrderModelSourceInteractor$mapToModels$13.label = 3;
                        z2p z2pVar4 = z2pVar;
                        b3 = b(penVar, eatsOrderModelSourceInteractor$mapToModels$13);
                        coroutineSingletons5 = coroutineSingletons2;
                        if (b3 == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        arrayList6 = arrayList11;
                        str22 = str3;
                        it6 = it2;
                        renVar2 = renVar8;
                        z2pVar3 = z2pVar4;
                        h1pVar3 = h1pVar;
                        str23 = str7;
                        e401Var4 = e401Var5;
                        str24 = str4;
                        f501Var4 = f501Var;
                        collection = arrayList5;
                        collection.add((z2p) b3);
                        coroutineSingletons2 = coroutineSingletons5;
                        f501Var = f501Var4;
                        str4 = str24;
                        z2pVar = z2pVar3;
                        e401Var2 = e401Var4;
                        str7 = str23;
                        h1pVar = h1pVar3;
                        str3 = str22;
                        it2 = it6;
                        if (it3.hasNext()) {
                            ren renVar9 = renVar2;
                            e401 e401Var6 = e401Var2;
                            z2p z2pVar5 = z2pVar;
                            CoroutineSingletons coroutineSingletons6 = coroutineSingletons2;
                            ArrayList arrayList12 = arrayList6;
                            ArrayList arrayList13 = arrayList5;
                            oen a = renVar9.a();
                            String str25 = str3;
                            arrayList12.add(new d3p(str25, f501Var, h1pVar, str4, str7, eatsOrderStatus2, str8, str6, a3pVar2, z2pVar5, arrayList13, a != null ? new y2p(a.a()) : null, e401Var6));
                            aVar = this;
                            eatsOrderModelSourceInteractor$mapToModels$1 = eatsOrderModelSourceInteractor$mapToModels$13;
                            arrayList = arrayList4;
                            str = null;
                            coroutineSingletons3 = coroutineSingletons6;
                            it = it2;
                            if (it.hasNext()) {
                                return arrayList;
                            }
                            renVar3 = (ren) it.next();
                            String i3 = renVar3.i();
                            k7x0 k7x0Var = aVar.f;
                            if (i3 != null) {
                                if (evu0.J(i3)) {
                                    i3 = str;
                                }
                            }
                            String h = renVar3.h();
                            if (h != null) {
                                if (evu0.J(h)) {
                                    h = str;
                                }
                                if (h != null) {
                                    i3 = ((m7x0) k7x0Var).a(h);
                                    String g = renVar3.g();
                                    h1p m = renVar3.m();
                                    String p = renVar3.p();
                                    String d = renVar3.d();
                                    EatsOrderStatus n = renVar3.n();
                                    if (i3 != null) {
                                        h1p m2 = renVar3.m();
                                        szv0 a2 = aVar.i.a();
                                        a2.getClass();
                                        uwq0 a3 = a2.a(m2.getValue());
                                        if (a3 != null && (str12 = a3.s) != null) {
                                            if (evu0.J(str12)) {
                                                str12 = str;
                                            }
                                            if (str12 != null) {
                                                str9 = ((m7x0) k7x0Var).a(str12);
                                            }
                                        }
                                        str9 = str;
                                    } else {
                                        str9 = i3;
                                    }
                                    String j = renVar3.j();
                                    if (i3 == null) {
                                        j = str;
                                    }
                                    nfn o = renVar3.o();
                                    String str26 = str;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$0 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$1 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$2 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$3 = arrayList;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$4 = it;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$5 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$6 = renVar3;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$7 = g;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$8 = m;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$9 = p;
                                    f501 f501Var5 = f501.a;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$10 = f501Var5;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$11 = d;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$12 = n;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$13 = str9;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$14 = j;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$15 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$16 = arrayList;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$17 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$18 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$19 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$20 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$21 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$22 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$23 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$24 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$25 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.L$26 = str26;
                                    eatsOrderModelSourceInteractor$mapToModels$1.label = 1;
                                    b = aVar.h.b(o, eatsOrderModelSourceInteractor$mapToModels$1);
                                    if (b != coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    it2 = it;
                                    obj2 = b;
                                    str10 = j;
                                    str3 = g;
                                    eatsOrderStatus = n;
                                    h1pVar = m;
                                    str5 = d;
                                    str4 = p;
                                    f501Var = f501Var5;
                                    arrayList7 = arrayList;
                                    a3p a3pVar42 = (a3p) obj2;
                                    f = renVar3.f();
                                    CoroutineSingletons coroutineSingletons42 = coroutineSingletons3;
                                    hzk hzkVar2 = aVar.g;
                                    hzkVar2.getClass();
                                    if (f == null) {
                                        a3pVar3 = a3pVar42;
                                        arrayList8 = arrayList;
                                        str11 = str10;
                                        str2 = str9;
                                        obj3 = null;
                                        e401Var = null;
                                    } else {
                                        if (f.d() != null) {
                                            arrayList8 = arrayList;
                                            a3pVar3 = a3pVar42;
                                            c = FormattedText.Companion.a(f.c(), f.d());
                                        } else {
                                            a3pVar3 = a3pVar42;
                                            arrayList8 = arrayList;
                                            c = FormattedText.Companion.c(f.c());
                                        }
                                        String b4 = f.b();
                                        str11 = str10;
                                        str2 = str9;
                                        obj3 = null;
                                        e401Var = new e401(c, new c4v(null, b4 != null ? ((m7x0) ((k7x0) hzkVar2.a)).a(b4) : null), ((ufu) ((pdc) hzkVar2.b)).b(f.a()));
                                    }
                                    q = renVar3.q();
                                    if (q == null) {
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$0 = obj3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$1 = obj3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$2 = obj3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$3 = arrayList7;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$4 = it2;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$5 = obj3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$6 = renVar3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$7 = str3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$8 = h1pVar;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$9 = str4;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$10 = f501Var;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$11 = str5;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$12 = eatsOrderStatus;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$13 = str2;
                                        String str27 = str11;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$14 = str27;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$15 = obj3;
                                        a3p a3pVar7 = a3pVar3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$16 = a3pVar7;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$17 = e401Var;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$18 = obj3;
                                        arrayList3 = arrayList8;
                                        eatsOrderModelSourceInteractor$mapToModels$1.L$19 = arrayList3;
                                        eatsOrderModelSourceInteractor$mapToModels$1.label = 2;
                                        obj = b(q, eatsOrderModelSourceInteractor$mapToModels$1);
                                        eatsOrderModelSourceInteractor$mapToModels$12 = eatsOrderModelSourceInteractor$mapToModels$1;
                                        coroutineSingletons = coroutineSingletons42;
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        str6 = str27;
                                        renVar = renVar3;
                                        a3pVar = a3pVar7;
                                        arrayList2 = arrayList7;
                                        z2p z2pVar22 = (z2p) obj;
                                        ArrayList arrayList92 = arrayList2;
                                        List b22 = renVar.b();
                                        ren renVar62 = renVar;
                                        e401 e401Var32 = e401Var;
                                        a3p a3pVar52 = a3pVar;
                                        arrayList4 = arrayList92;
                                        coroutineSingletons2 = coroutineSingletons;
                                        arrayList5 = new ArrayList(tcc.n(b22, 10));
                                        arrayList6 = arrayList3;
                                        z2pVar = z2pVar22;
                                        a3pVar2 = a3pVar52;
                                        eatsOrderModelSourceInteractor$mapToModels$13 = eatsOrderModelSourceInteractor$mapToModels$12;
                                        e401Var2 = e401Var32;
                                        it3 = b22.iterator();
                                        str7 = str5;
                                        renVar2 = renVar62;
                                        eatsOrderStatus2 = eatsOrderStatus;
                                        str8 = str2;
                                        if (it3.hasNext()) {
                                        }
                                    } else {
                                        a3p a3pVar8 = a3pVar3;
                                        EatsOrderModelSourceInteractor$mapToModels$1 eatsOrderModelSourceInteractor$mapToModels$14 = eatsOrderModelSourceInteractor$mapToModels$1;
                                        ArrayList arrayList14 = arrayList8;
                                        str6 = str11;
                                        ren renVar10 = renVar3;
                                        ArrayList arrayList15 = arrayList7;
                                        List b5 = renVar10.b();
                                        e401 e401Var7 = e401Var;
                                        arrayList4 = arrayList15;
                                        coroutineSingletons2 = coroutineSingletons42;
                                        arrayList5 = new ArrayList(tcc.n(b5, 10));
                                        arrayList6 = arrayList14;
                                        z2pVar = null;
                                        a3pVar2 = a3pVar8;
                                        eatsOrderModelSourceInteractor$mapToModels$13 = eatsOrderModelSourceInteractor$mapToModels$14;
                                        e401Var2 = e401Var7;
                                        it3 = b5.iterator();
                                        str7 = str5;
                                        renVar2 = renVar10;
                                        eatsOrderStatus2 = eatsOrderStatus;
                                        str8 = str2;
                                        if (it3.hasNext()) {
                                        }
                                    }
                                }
                            }
                            i3 = str;
                            String g2 = renVar3.g();
                            h1p m3 = renVar3.m();
                            String p2 = renVar3.p();
                            String d2 = renVar3.d();
                            EatsOrderStatus n2 = renVar3.n();
                            if (i3 != null) {
                            }
                            String j2 = renVar3.j();
                            if (i3 == null) {
                            }
                            nfn o2 = renVar3.o();
                            String str262 = str;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$0 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$1 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$2 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$3 = arrayList;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$4 = it;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$5 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$6 = renVar3;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$7 = g2;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$8 = m3;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$9 = p2;
                            f501 f501Var52 = f501.a;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$10 = f501Var52;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$11 = d2;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$12 = n2;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$13 = str9;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$14 = j2;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$15 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$16 = arrayList;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$17 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$18 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$19 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$20 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$21 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$22 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$23 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$24 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$25 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.L$26 = str262;
                            eatsOrderModelSourceInteractor$mapToModels$1.label = 1;
                            b = aVar.h.b(o2, eatsOrderModelSourceInteractor$mapToModels$1);
                            if (b != coroutineSingletons3) {
                            }
                        }
                    }
                }
            }
        }
        eatsOrderModelSourceInteractor$mapToModels$1 = new EatsOrderModelSourceInteractor$mapToModels$1(aVar, (ContinuationImpl) continuation);
        Object obj42 = eatsOrderModelSourceInteractor$mapToModels$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderModelSourceInteractor$mapToModels$1.label;
        if (i != 0) {
        }
    }
}
