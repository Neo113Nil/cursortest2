package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w5q extends aur implements Function2 {
    public final /* synthetic */ oq A;
    public Set j;
    public Set k;
    public List l;
    public Set m;
    public Collection n;
    public Object o;
    public List p;
    public List q;
    public y5q r;
    public Iterator s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ y5q w;
    public final /* synthetic */ Collection x;
    public final /* synthetic */ String y;
    public final /* synthetic */ cvl z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5q(y5q y5qVar, Collection collection, String str, cvl cvlVar, oq oqVar, Continuation continuation) {
        super(2, continuation);
        this.w = y5qVar;
        this.x = collection;
        this.y = str;
        this.z = cvlVar;
        this.A = oqVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        w5q w5qVar = new w5q(this.w, this.x, this.y, this.z, this.A, continuation);
        w5qVar.v = obj;
        return w5qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w5q) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0430, code lost:
    
        if (r9.a(r10, r21) == r7) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01a4, code lost:
    
        if (r14 == r7) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0185, code lost:
    
        if (r5 == r7) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0164, code lost:
    
        if (r8 == r7) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039f A[LOOP:10: B:117:0x0399->B:119:0x039f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c6 A[LOOP:12: B:139:0x02c0->B:141:0x02c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01ff A[LOOP:14: B:174:0x01f9->B:176:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0457 A[LOOP:2: B:31:0x0451->B:33:0x0457, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04fd  */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.Set] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object v;
        Set set;
        Object s;
        Set set2;
        Object c;
        jyr jyrVar;
        Object c2;
        Set set3;
        ArrayList arrayList;
        Set set4;
        LinkedHashSet linkedHashSet;
        Iterator it;
        jyr jyrVar2;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet2;
        List d0;
        Object b;
        List list;
        LinkedHashSet linkedHashSet3;
        Set set5;
        List list2;
        Set set6;
        Set set7;
        Set set8;
        Collection collection;
        Set set9;
        LinkedHashSet linkedHashSet4;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Collection b2;
        Set set10;
        List list3;
        Set set11;
        Set set12;
        Set set13;
        int i;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        Iterator it8;
        List list4;
        int i2;
        y5q y5qVar;
        Iterator it9;
        int i3;
        y5q y5qVar2 = this.w;
        q3t q3tVar = y5qVar2.b;
        jyr jyrVar3 = y5qVar2.e;
        jyr jyrVar4 = y5qVar2.d;
        jyr jyrVar5 = y5qVar2.f;
        mm6 mm6Var = (mm6) this.v;
        nm6 nm6Var = nm6.a;
        int i4 = this.u;
        String str = this.y;
        oq oqVar = this.A;
        cvl cvlVar = this.z;
        Collection collection2 = this.x;
        switch (i4) {
            case 0:
                qgg.h0(obj);
                yx4 yx4Var = (yx4) jyrVar5.getValue();
                Set A0 = CollectionsKt.A0(collection2);
                this.v = mm6Var;
                this.u = 1;
                v = yx4Var.v(A0, true, this);
                break;
            case 1:
                qgg.h0(obj);
                v = obj;
                set = (Set) v;
                yx4 yx4Var2 = (yx4) jyrVar5.getValue();
                Set A02 = CollectionsKt.A0(collection2);
                this.v = mm6Var;
                this.j = set;
                this.u = 2;
                s = yx4Var2.s(A02, this);
                break;
            case 2:
                Set set14 = this.j;
                qgg.h0(obj);
                set = set14;
                s = obj;
                set2 = (Set) s;
                wca wcaVar = (wca) jyrVar4.getValue();
                this.v = mm6Var;
                this.j = set;
                this.k = set2;
                this.u = 3;
                c = wcaVar.c(this);
                break;
            case 3:
                set2 = this.k;
                set = this.j;
                qgg.h0(obj);
                c = obj;
                Iterable iterable = (Iterable) c;
                jyrVar = jyrVar3;
                ArrayList arrayList3 = new ArrayList(v75.o(iterable, 10));
                Iterator it10 = iterable.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(((jca) it10.next()).a);
                }
                sga sgaVar = (sga) jyrVar.getValue();
                this.v = mm6Var;
                this.j = set;
                this.k = set2;
                this.l = arrayList3;
                this.u = 4;
                c2 = sgaVar.c(this);
                if (c2 != nm6Var) {
                    set3 = set;
                    arrayList = arrayList3;
                    set4 = set2;
                    linkedHashSet = new LinkedHashSet();
                    for (it = ((Iterable) c2).iterator(); it.hasNext(); it = it) {
                        fga fgaVar = (fga) it.next();
                        linkedHashSet.add(new rw4(fgaVar.a, fgaVar.b));
                    }
                    if (cvlVar == null) {
                        drt drtVar = cvlVar.c;
                        jyrVar2 = jyrVar4;
                        arrayList2 = arrayList;
                        linkedHashSet2 = wop.g(linkedHashSet, new rw4(new uga(drtVar.a, drtVar.b, drtVar.c), cvlVar.a));
                    } else {
                        jyrVar2 = jyrVar4;
                        arrayList2 = arrayList;
                        linkedHashSet2 = linkedHashSet;
                    }
                    d0 = oqVar == null ? CollectionsKt.d0(arrayList2, oqVar.a) : arrayList2;
                    if (cvlVar == null || oqVar != null) {
                        this.v = null;
                        this.j = set3;
                        this.k = set4;
                        this.l = arrayList2;
                        this.m = linkedHashSet;
                        this.n = collection2;
                        this.o = null;
                        this.p = d0;
                        this.t = 0;
                        this.u = 5;
                        b = y5q.b(y5qVar2, collection2, set3, linkedHashSet2, this);
                        if (b != nm6Var) {
                            list = arrayList2;
                            linkedHashSet4 = linkedHashSet;
                            Set set15 = (Set) b;
                            ArrayList arrayList4 = new ArrayList();
                            it2 = set4.iterator();
                            LinkedHashSet linkedHashSet5 = linkedHashSet4;
                            while (it2.hasNext()) {
                                Iterator it11 = it2;
                                Object next = it11.next();
                                LinkedHashSet linkedHashSet6 = linkedHashSet5;
                                if (d0.contains(((qw4) next).a)) {
                                    arrayList4.add(next);
                                }
                                it2 = it11;
                                linkedHashSet5 = linkedHashSet6;
                            }
                            LinkedHashSet linkedHashSet7 = linkedHashSet5;
                            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                            it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                z75.t(linkedHashSet8, ((qw4) it3.next()).b);
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj2 : collection2) {
                                String str2 = (String) obj2;
                                if (!set15.contains(str2) && !linkedHashSet8.contains(str2)) {
                                    arrayList5.add(obj2);
                                }
                            }
                            collection2 = arrayList5;
                            linkedHashSet3 = linkedHashSet7;
                            xdr xdrVar = saa.a;
                            if (str != null) {
                                String str3 = collection2.contains(str) ? str : null;
                                if (str3 != null) {
                                    cur curVar = y5qVar2.c;
                                    zvs zvsVar = new zvs(str3);
                                    this.v = null;
                                    this.j = set3;
                                    this.k = set4;
                                    this.l = list;
                                    this.m = linkedHashSet3;
                                    this.n = collection2;
                                    this.o = str3;
                                    this.p = null;
                                    this.t = 0;
                                    this.u = 6;
                                    LinkedHashSet linkedHashSet9 = linkedHashSet3;
                                    Object V = x97.V(dm6.a, new n6p((Continuation) null, curVar, zvsVar), this);
                                    if (V != nm6.a) {
                                        V = Unit.a;
                                    }
                                    if (V != nm6Var) {
                                        set8 = linkedHashSet9;
                                        collection = collection2;
                                        set9 = set4;
                                        set7 = set3;
                                        Set set16 = set9;
                                        collection2 = collection;
                                        set5 = set8;
                                        list2 = list;
                                        set6 = set16;
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj3 : collection2) {
                                            if (!Intrinsics.d((String) obj3, str)) {
                                                arrayList6.add(obj3);
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                                        it4 = arrayList6.iterator();
                                        while (it4.hasNext()) {
                                            arrayList7.add(new zvs((String) it4.next()));
                                        }
                                        b2 = q3tVar.b(arrayList7);
                                        if (cvlVar == null) {
                                            set10 = set5;
                                            list3 = list2;
                                            set11 = set6;
                                            set12 = set7;
                                            if (oqVar != null) {
                                            }
                                            i = 0;
                                            y5qVar2.c(cvlVar, b2);
                                            xdr xdrVar2 = saa.a;
                                            Set set17 = q3tVar.c().a;
                                            ArrayList arrayList8 = new ArrayList(v75.o(set17, 10));
                                            it5 = set17.iterator();
                                            while (it5.hasNext()) {
                                            }
                                            ArrayList arrayList9 = new ArrayList();
                                            while (r6.hasNext()) {
                                            }
                                            ArrayList arrayList10 = new ArrayList();
                                            it6 = arrayList9.iterator();
                                            while (it6.hasNext()) {
                                            }
                                            ArrayList arrayList11 = new ArrayList();
                                            while (r6.hasNext()) {
                                            }
                                            ArrayList arrayList12 = new ArrayList();
                                            it7 = arrayList11.iterator();
                                            while (it7.hasNext()) {
                                            }
                                            it8 = arrayList10.iterator();
                                            list4 = arrayList12;
                                            i2 = i;
                                            y5qVar = y5qVar2;
                                            while (it8.hasNext()) {
                                            }
                                            it9 = list4.iterator();
                                            i3 = i;
                                            while (it9.hasNext()) {
                                            }
                                            return Unit.a;
                                        }
                                        sga sgaVar2 = (sga) jyrVar.getValue();
                                        drt drtVar2 = cvlVar.c;
                                        uga ugaVar = new uga(drtVar2.a, drtVar2.b, drtVar2.c);
                                        String str4 = cvlVar.a;
                                        this.v = null;
                                        this.j = set7;
                                        this.k = set6;
                                        this.l = list2;
                                        this.m = set5;
                                        this.n = null;
                                        this.o = b2;
                                        this.p = null;
                                        this.t = 0;
                                        this.u = 7;
                                        if (sgaVar2.a(ugaVar, str4, this) != nm6Var) {
                                            set13 = set7;
                                            set10 = set5;
                                            list3 = list2;
                                            set11 = set6;
                                            set12 = set13;
                                            if (oqVar != null) {
                                                wca wcaVar2 = (wca) jyrVar2.getValue();
                                                String str5 = oqVar.a;
                                                this.v = null;
                                                this.j = set12;
                                                this.k = set11;
                                                this.l = list3;
                                                this.m = set10;
                                                this.n = null;
                                                this.o = b2;
                                                this.p = null;
                                                i = 0;
                                                this.t = 0;
                                                this.u = 8;
                                                break;
                                            }
                                            i = 0;
                                            y5qVar2.c(cvlVar, b2);
                                            xdr xdrVar22 = saa.a;
                                            Set set172 = q3tVar.c().a;
                                            ArrayList arrayList82 = new ArrayList(v75.o(set172, 10));
                                            it5 = set172.iterator();
                                            while (it5.hasNext()) {
                                                arrayList82.add(((zvs) it5.next()).a);
                                            }
                                            ArrayList arrayList92 = new ArrayList();
                                            for (Object obj4 : set11) {
                                                if (list3.contains(((qw4) obj4).a)) {
                                                    arrayList92.add(obj4);
                                                }
                                            }
                                            ArrayList arrayList102 = new ArrayList();
                                            it6 = arrayList92.iterator();
                                            while (it6.hasNext()) {
                                                Object next2 = it6.next();
                                                Set set18 = ((qw4) next2).b;
                                                if (!(set18 instanceof Collection) || !set18.isEmpty()) {
                                                    Iterator it12 = set18.iterator();
                                                    while (it12.hasNext()) {
                                                        if (arrayList82.contains((String) it12.next())) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                arrayList102.add(next2);
                                            }
                                            ArrayList arrayList112 = new ArrayList();
                                            for (Object obj5 : set12) {
                                                if (set10.contains(((sw4) obj5).a)) {
                                                    arrayList112.add(obj5);
                                                }
                                            }
                                            ArrayList arrayList122 = new ArrayList();
                                            it7 = arrayList112.iterator();
                                            while (it7.hasNext()) {
                                                Object next3 = it7.next();
                                                Set set19 = ((sw4) next3).b;
                                                if (!(set19 instanceof Collection) || !set19.isEmpty()) {
                                                    Iterator it13 = set19.iterator();
                                                    while (it13.hasNext()) {
                                                        if (arrayList82.contains((String) it13.next())) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                arrayList122.add(next3);
                                            }
                                            it8 = arrayList102.iterator();
                                            list4 = arrayList122;
                                            i2 = i;
                                            y5qVar = y5qVar2;
                                            while (it8.hasNext()) {
                                                qw4 qw4Var = (qw4) it8.next();
                                                wca wcaVar3 = (wca) y5qVar.d.getValue();
                                                String str6 = qw4Var.a;
                                                this.v = null;
                                                this.j = null;
                                                this.k = null;
                                                this.l = null;
                                                this.m = null;
                                                this.n = null;
                                                this.o = null;
                                                this.p = null;
                                                this.q = list4;
                                                this.r = y5qVar;
                                                this.s = it8;
                                                this.t = i2;
                                                this.u = 9;
                                                if (wcaVar3.a(str6, this) == nm6Var) {
                                                }
                                            }
                                            it9 = list4.iterator();
                                            i3 = i;
                                            while (it9.hasNext()) {
                                                sw4 sw4Var = (sw4) it9.next();
                                                sga sgaVar3 = (sga) y5qVar2.e.getValue();
                                                rw4 rw4Var = sw4Var.a;
                                                uga ugaVar2 = rw4Var.a;
                                                String str7 = rw4Var.b;
                                                this.v = null;
                                                this.j = null;
                                                this.k = null;
                                                this.l = null;
                                                this.m = null;
                                                this.n = null;
                                                this.o = null;
                                                this.p = null;
                                                this.q = null;
                                                this.r = y5qVar2;
                                                this.s = it9;
                                                this.t = i3;
                                                this.u = 10;
                                                if (sgaVar3.a(ugaVar2, str7, this) == nm6Var) {
                                                }
                                            }
                                            return Unit.a;
                                        }
                                    }
                                }
                            }
                            set5 = linkedHashSet3;
                            list2 = list;
                            set6 = set4;
                            set7 = set3;
                            ArrayList arrayList62 = new ArrayList();
                            while (r4.hasNext()) {
                            }
                            ArrayList arrayList72 = new ArrayList(v75.o(arrayList62, 10));
                            it4 = arrayList62.iterator();
                            while (it4.hasNext()) {
                            }
                            b2 = q3tVar.b(arrayList72);
                            if (cvlVar == null) {
                            }
                        }
                    } else {
                        list = arrayList2;
                        linkedHashSet3 = linkedHashSet;
                        xdr xdrVar3 = saa.a;
                        if (str != null) {
                        }
                        set5 = linkedHashSet3;
                        list2 = list;
                        set6 = set4;
                        set7 = set3;
                        ArrayList arrayList622 = new ArrayList();
                        while (r4.hasNext()) {
                        }
                        ArrayList arrayList722 = new ArrayList(v75.o(arrayList622, 10));
                        it4 = arrayList622.iterator();
                        while (it4.hasNext()) {
                        }
                        b2 = q3tVar.b(arrayList722);
                        if (cvlVar == null) {
                        }
                    }
                }
                return nm6Var;
            case 4:
                List list5 = this.l;
                Set set20 = this.k;
                Set set21 = this.j;
                qgg.h0(obj);
                jyrVar = jyrVar3;
                set4 = set20;
                set3 = set21;
                c2 = obj;
                arrayList = list5;
                linkedHashSet = new LinkedHashSet();
                while (it.hasNext()) {
                }
                if (cvlVar == null) {
                }
                if (oqVar == null) {
                }
                if (cvlVar == null) {
                }
                this.v = null;
                this.j = set3;
                this.k = set4;
                this.l = arrayList2;
                this.m = linkedHashSet;
                this.n = collection2;
                this.o = null;
                this.p = d0;
                this.t = 0;
                this.u = 5;
                b = y5q.b(y5qVar2, collection2, set3, linkedHashSet2, this);
                if (b != nm6Var) {
                }
                return nm6Var;
            case 5:
                d0 = this.p;
                collection2 = this.n;
                Set set22 = this.m;
                list = this.l;
                set4 = this.k;
                set3 = this.j;
                qgg.h0(obj);
                jyrVar = jyrVar3;
                jyrVar2 = jyrVar4;
                b = obj;
                linkedHashSet4 = set22;
                Set set152 = (Set) b;
                ArrayList arrayList42 = new ArrayList();
                it2 = set4.iterator();
                LinkedHashSet linkedHashSet52 = linkedHashSet4;
                while (it2.hasNext()) {
                }
                LinkedHashSet linkedHashSet72 = linkedHashSet52;
                LinkedHashSet linkedHashSet82 = new LinkedHashSet();
                it3 = arrayList42.iterator();
                while (it3.hasNext()) {
                }
                ArrayList arrayList52 = new ArrayList();
                while (r6.hasNext()) {
                }
                collection2 = arrayList52;
                linkedHashSet3 = linkedHashSet72;
                xdr xdrVar32 = saa.a;
                if (str != null) {
                }
                set5 = linkedHashSet3;
                list2 = list;
                set6 = set4;
                set7 = set3;
                ArrayList arrayList6222 = new ArrayList();
                while (r4.hasNext()) {
                }
                ArrayList arrayList7222 = new ArrayList(v75.o(arrayList6222, 10));
                it4 = arrayList6222.iterator();
                while (it4.hasNext()) {
                }
                b2 = q3tVar.b(arrayList7222);
                if (cvlVar == null) {
                }
                break;
            case 6:
                collection = this.n;
                set8 = this.m;
                list = this.l;
                set9 = this.k;
                set7 = this.j;
                qgg.h0(obj);
                jyrVar = jyrVar3;
                jyrVar2 = jyrVar4;
                Set set162 = set9;
                collection2 = collection;
                set5 = set8;
                list2 = list;
                set6 = set162;
                ArrayList arrayList62222 = new ArrayList();
                while (r4.hasNext()) {
                }
                ArrayList arrayList72222 = new ArrayList(v75.o(arrayList62222, 10));
                it4 = arrayList62222.iterator();
                while (it4.hasNext()) {
                }
                b2 = q3tVar.b(arrayList72222);
                if (cvlVar == null) {
                }
                break;
            case 7:
                b2 = (Collection) this.o;
                Collection collection3 = this.n;
                set5 = this.m;
                list2 = this.l;
                set6 = this.k;
                set13 = this.j;
                qgg.h0(obj);
                jyrVar2 = jyrVar4;
                set10 = set5;
                list3 = list2;
                set11 = set6;
                set12 = set13;
                if (oqVar != null) {
                }
                i = 0;
                y5qVar2.c(cvlVar, b2);
                xdr xdrVar222 = saa.a;
                Set set1722 = q3tVar.c().a;
                ArrayList arrayList822 = new ArrayList(v75.o(set1722, 10));
                it5 = set1722.iterator();
                while (it5.hasNext()) {
                }
                ArrayList arrayList922 = new ArrayList();
                while (r6.hasNext()) {
                }
                ArrayList arrayList1022 = new ArrayList();
                it6 = arrayList922.iterator();
                while (it6.hasNext()) {
                }
                ArrayList arrayList1122 = new ArrayList();
                while (r6.hasNext()) {
                }
                ArrayList arrayList1222 = new ArrayList();
                it7 = arrayList1122.iterator();
                while (it7.hasNext()) {
                }
                it8 = arrayList1022.iterator();
                list4 = arrayList1222;
                i2 = i;
                y5qVar = y5qVar2;
                while (it8.hasNext()) {
                }
                it9 = list4.iterator();
                i3 = i;
                while (it9.hasNext()) {
                }
                return Unit.a;
            case 8:
                b2 = (Collection) this.o;
                Collection collection4 = this.n;
                set10 = this.m;
                list3 = this.l;
                set11 = this.k;
                set12 = this.j;
                qgg.h0(obj);
                i = 0;
                y5qVar2.c(cvlVar, b2);
                xdr xdrVar2222 = saa.a;
                Set set17222 = q3tVar.c().a;
                ArrayList arrayList8222 = new ArrayList(v75.o(set17222, 10));
                it5 = set17222.iterator();
                while (it5.hasNext()) {
                }
                ArrayList arrayList9222 = new ArrayList();
                while (r6.hasNext()) {
                }
                ArrayList arrayList10222 = new ArrayList();
                it6 = arrayList9222.iterator();
                while (it6.hasNext()) {
                }
                ArrayList arrayList11222 = new ArrayList();
                while (r6.hasNext()) {
                }
                ArrayList arrayList12222 = new ArrayList();
                it7 = arrayList11222.iterator();
                while (it7.hasNext()) {
                }
                it8 = arrayList10222.iterator();
                list4 = arrayList12222;
                i2 = i;
                y5qVar = y5qVar2;
                while (it8.hasNext()) {
                }
                it9 = list4.iterator();
                i3 = i;
                while (it9.hasNext()) {
                }
                return Unit.a;
            case 9:
                i2 = this.t;
                it8 = this.s;
                y5qVar = this.r;
                list4 = this.q;
                List list6 = this.p;
                Collection collection5 = this.n;
                Set set23 = this.m;
                List list7 = this.l;
                Set set24 = this.k;
                Set set25 = this.j;
                qgg.h0(obj);
                i = 0;
                while (it8.hasNext()) {
                }
                it9 = list4.iterator();
                i3 = i;
                while (it9.hasNext()) {
                }
                return Unit.a;
            case 10:
                int i5 = this.t;
                it9 = this.s;
                y5q y5qVar3 = this.r;
                List list8 = this.q;
                List list9 = this.p;
                Collection collection6 = this.n;
                Set set26 = this.m;
                List list10 = this.l;
                Set set27 = this.k;
                Set set28 = this.j;
                qgg.h0(obj);
                i3 = i5;
                y5qVar2 = y5qVar3;
                while (it9.hasNext()) {
                }
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
