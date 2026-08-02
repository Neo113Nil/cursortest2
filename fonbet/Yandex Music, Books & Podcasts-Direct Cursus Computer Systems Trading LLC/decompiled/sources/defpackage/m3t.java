package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class m3t extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ Collection l;
    public final /* synthetic */ tf7 m;
    public final /* synthetic */ String n;
    public HashSet o;
    public List p;
    public List q;
    public List r;
    public HashSet s;
    public List t;
    public String u;
    public i2m v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3t(ueo ueoVar, Continuation continuation, Collection collection, tf7 tf7Var, String str) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = collection;
        this.m = tf7Var;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new m3t(this.k, continuation, this.l, this.m, this.n);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m3t) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0136, code lost:
    
        if (r4 == r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0332, code lost:
    
        if (r3.a(r8, r1, r4, null, r23) == r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x030a, code lost:
    
        if (r1 != r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0190, code lost:
    
        if (r12 != r7) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016f A[LOOP:4: B:86:0x0169->B:88:0x016f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashSet, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HashSet hashSet;
        int i;
        Object h;
        String str;
        Object f;
        List list;
        int i2;
        List list2;
        Iterator it;
        Object c;
        ArrayList arrayList;
        tf7 tf7Var;
        rus rusVar;
        Collection collection;
        int i3;
        List list3;
        HashSet hashSet2;
        ?? r0;
        int i4;
        List list4;
        ArrayList arrayList2;
        Iterator it2;
        Object w;
        int i5;
        List list5;
        tf7 tf7Var2;
        i2m i2mVar;
        Object h2;
        tf7 tf7Var3 = this.m;
        rus rusVar2 = (rus) tf7Var3.d;
        p51 p51Var = (p51) tf7Var3.b;
        et etVar = (et) tf7Var3.c;
        nm6 nm6Var = nm6.a;
        int i6 = this.j;
        Collection<mqs> collection2 = this.l;
        String str2 = this.n;
        Object obj2 = null;
        switch (i6) {
            case 0:
                qgg.h0(obj);
                HashSet hashSet3 = new HashSet();
                hashSet = new HashSet();
                for (mqs mqsVar : collection2) {
                    oq oqVar = mqsVar.t;
                    if (oqVar != null && (str = oqVar.a) != null) {
                        hashSet3.add(str);
                    }
                    List list6 = mqsVar.u;
                    if (list6 != null) {
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            hashSet.add(((c01) it3.next()).a);
                        }
                    }
                }
                this.o = hashSet;
                i = 0;
                this.w = 0;
                this.j = 1;
                h = etVar.h(str2, hashSet3, this);
                break;
            case 1:
                int i7 = this.w;
                hashSet = this.o;
                qgg.h0(obj);
                i = i7;
                h = obj;
                List list7 = (List) h;
                this.o = null;
                this.p = list7;
                this.w = i;
                this.j = 2;
                f = p51Var.f(str2, hashSet, this);
                if (f != nm6Var) {
                    int i8 = i;
                    list = list7;
                    i2 = i8;
                    list2 = (List) f;
                    Collection collection3 = collection2;
                    ArrayList arrayList3 = new ArrayList(v75.o(collection3, 10));
                    it = collection3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((mqs) it.next()).a);
                    }
                    this.o = null;
                    this.p = list;
                    this.q = list2;
                    this.w = i2;
                    this.j = 3;
                    c = rusVar2.c(this, str2, arrayList3);
                    break;
                }
                return nm6Var;
            case 2:
                i2 = this.w;
                List list8 = this.p;
                qgg.h0(obj);
                list = list8;
                f = obj;
                list2 = (List) f;
                Collection collection32 = collection2;
                ArrayList arrayList32 = new ArrayList(v75.o(collection32, 10));
                it = collection32.iterator();
                while (it.hasNext()) {
                }
                this.o = null;
                this.p = list;
                this.q = list2;
                this.w = i2;
                this.j = 3;
                c = rusVar2.c(this, str2, arrayList32);
                break;
            case 3:
                i2 = this.w;
                list2 = this.q;
                list = this.p;
                qgg.h0(obj);
                c = obj;
                List list9 = (List) c;
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                arrayList = new ArrayList();
                for (mqs mqsVar2 : collection2) {
                    Collection collection4 = collection2;
                    oq oqVar2 = mqsVar2.t;
                    if (oqVar2 != null && !list.contains(oqVar2)) {
                        hashSet4.add(oqVar2);
                    }
                    List list10 = mqsVar2.u;
                    if (list10 != null) {
                        List<c01> list11 = list10;
                        for (c01 c01Var : list11) {
                            List list12 = list11;
                            if (!list2.contains(c01Var)) {
                                hashSet5.add(c01Var);
                            }
                            list11 = list12;
                        }
                    }
                    List list13 = list2;
                    String str3 = mqsVar2.a;
                    oq oqVar3 = mqsVar2.t;
                    List list14 = list;
                    arrayList.add(new t2m(str3, oqVar3 != null ? oqVar3.a : null, new Date(System.currentTimeMillis())));
                    collection2 = collection4;
                    list2 = list13;
                    list = list14;
                    tf7Var3 = tf7Var3;
                    rusVar2 = rusVar2;
                    obj2 = null;
                }
                tf7Var = tf7Var3;
                rusVar = rusVar2;
                collection = collection2;
                ?? r02 = obj2;
                this.o = r02;
                this.p = r02;
                this.q = r02;
                this.r = list9;
                this.s = hashSet5;
                this.t = arrayList;
                this.w = i2;
                this.j = 4;
                if (etVar.b(str2, hashSet4, this) != nm6Var) {
                    i3 = i2;
                    list3 = list9;
                    hashSet2 = hashSet5;
                    r0 = 0;
                    this.o = r0;
                    this.p = r0;
                    this.q = r0;
                    this.r = list3;
                    this.s = r0;
                    this.t = arrayList;
                    this.w = i3;
                    this.j = 5;
                    if (p51Var.b(str2, hashSet2, this) != nm6Var) {
                        i4 = i3;
                        list4 = arrayList;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : collection) {
                            if (!list3.contains(((mqs) obj3).a)) {
                                arrayList4.add(obj3);
                            }
                        }
                        arrayList2 = new ArrayList();
                        it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (((mqs) next).Z) {
                                arrayList2.add(next);
                            }
                        }
                        this.o = null;
                        this.p = null;
                        this.q = null;
                        this.r = null;
                        this.s = null;
                        this.t = list4;
                        this.w = i4;
                        this.j = 6;
                        rusVar.getClass();
                        if (qld.H(arrayList2)) {
                            w = rusVar.b.w(str2, arrayList2, this);
                            if (w != nm6.a) {
                                w = Unit.a;
                            }
                        } else {
                            w = Unit.a;
                        }
                        if (w != nm6Var) {
                            i5 = i4;
                            list5 = list4;
                            tf7Var2 = tf7Var;
                            i2mVar = (i2m) tf7Var2.g;
                            this.o = null;
                            this.p = null;
                            this.q = null;
                            this.r = null;
                            this.s = null;
                            this.t = list5;
                            this.u = str2;
                            this.v = i2mVar;
                            this.w = i5;
                            this.j = 7;
                            h2 = tf7.h(tf7Var2, str2, this);
                            break;
                        }
                    }
                }
                return nm6Var;
            case 4:
                i3 = this.w;
                List list15 = this.t;
                hashSet2 = this.s;
                List list16 = this.r;
                List list17 = this.q;
                List list18 = this.p;
                qgg.h0(obj);
                tf7Var = tf7Var3;
                rusVar = rusVar2;
                arrayList = list15;
                collection = collection2;
                r0 = 0;
                list3 = list16;
                this.o = r0;
                this.p = r0;
                this.q = r0;
                this.r = list3;
                this.s = r0;
                this.t = arrayList;
                this.w = i3;
                this.j = 5;
                if (p51Var.b(str2, hashSet2, this) != nm6Var) {
                }
                return nm6Var;
            case 5:
                i4 = this.w;
                list4 = this.t;
                list3 = this.r;
                List list19 = this.q;
                List list20 = this.p;
                qgg.h0(obj);
                tf7Var = tf7Var3;
                rusVar = rusVar2;
                collection = collection2;
                ArrayList arrayList42 = new ArrayList();
                while (r1.hasNext()) {
                }
                arrayList2 = new ArrayList();
                it2 = arrayList42.iterator();
                while (it2.hasNext()) {
                }
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
                this.t = list4;
                this.w = i4;
                this.j = 6;
                rusVar.getClass();
                if (qld.H(arrayList2)) {
                }
                if (w != nm6Var) {
                }
                return nm6Var;
            case 6:
                int i9 = this.w;
                list5 = this.t;
                List list21 = this.r;
                List list22 = this.q;
                List list23 = this.p;
                qgg.h0(obj);
                tf7Var2 = tf7Var3;
                i5 = i9;
                i2mVar = (i2m) tf7Var2.g;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
                this.t = list5;
                this.u = str2;
                this.v = i2mVar;
                this.w = i5;
                this.j = 7;
                h2 = tf7.h(tf7Var2, str2, this);
                break;
            case 7:
                i5 = this.w;
                i2m i2mVar2 = this.v;
                str2 = this.u;
                list5 = this.t;
                List list24 = this.r;
                List list25 = this.q;
                List list26 = this.p;
                qgg.h0(obj);
                i2mVar = i2mVar2;
                h2 = obj;
                List list27 = list5;
                long longValue = ((Number) h2).longValue();
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = i5;
                this.j = 8;
                break;
            case 8:
                List list28 = this.t;
                List list29 = this.r;
                List list30 = this.q;
                List list31 = this.p;
                qgg.h0(obj);
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
