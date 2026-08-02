package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class g04 extends aur implements pyc {
    public int j;
    public /* synthetic */ rjc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j04 m;
    public rjc n;
    public to1 o;
    public Collection p;
    public Iterator q;
    public List r;
    public Collection s;
    public Collection t;
    public int u;
    public int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g04(Continuation continuation, j04 j04Var) {
        super(3, continuation);
        this.m = j04Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g04 g04Var = new g04((Continuation) obj3, this.m);
        g04Var.k = (rjc) obj;
        g04Var.l = obj2;
        return g04Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0226, code lost:
    
        if (defpackage.zsd.e0(r8, r2, r19) == r7) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x01c8 -> B:13:0x01cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0139 -> B:28:0x013c). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        to1 to1Var;
        List list;
        Iterator it;
        int i;
        int i2;
        Collection collection;
        rjc rjcVar;
        int i3;
        ?? r14;
        String str;
        List list2;
        rjc rjcVar2;
        int i4;
        List list3;
        List list4;
        to1 to1Var2;
        int i5;
        Iterator it2;
        Collection collection2;
        int i6;
        rjc rjcVar3;
        List list5;
        List list6;
        to1 to1Var3;
        List list7;
        j04 j04Var = this.m;
        a04 a04Var = j04Var.a;
        nm6 nm6Var = nm6.a;
        int i7 = this.j;
        String str2 = "track_mview";
        rjc rjcVar4 = null;
        if (i7 == 0) {
            qgg.h0(obj);
            rjc rjcVar5 = this.k;
            Pair pair = (Pair) this.l;
            wgg wggVar = (wgg) pair.a;
            to1 to1Var4 = (to1) jf0.F((rj6) pair.b);
            List list8 = wggVar.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list8) {
                c01 c01Var = (c01) obj2;
                if (to1Var4 != null) {
                    List list9 = to1Var4.a;
                    r14 = new ArrayList(v75.o(list9, 10));
                    Iterator it3 = list9.iterator();
                    while (it3.hasNext()) {
                        r14.add(((so1) it3.next()).a.a);
                    }
                } else {
                    r14 = c5b.a;
                }
                if (!r14.contains(c01Var.a)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            to1Var = to1Var4;
            list = arrayList;
            it = arrayList.iterator();
            i = 0;
            i2 = 0;
            collection = arrayList2;
            rjcVar = rjcVar5;
            i3 = 0;
            if (it.hasNext()) {
            }
        } else if (i7 == 1) {
            int i8 = this.w;
            i = this.v;
            i2 = this.u;
            collection = this.s;
            list = this.r;
            it = this.q;
            Collection collection3 = this.p;
            to1Var = this.o;
            rjcVar = this.n;
            qgg.h0(obj);
            String str3 = "track_mview";
            int i9 = i8;
            Object b0 = obj;
            collection.add(zsd.b0((pjc) b0));
            i3 = i9;
            collection = collection3;
            str2 = str3;
            rjcVar4 = null;
            if (it.hasNext()) {
                String str4 = ((c01) it.next()).a;
                this.k = rjcVar4;
                this.l = rjcVar4;
                this.n = rjcVar;
                this.o = to1Var;
                Collection collection4 = collection;
                this.p = collection4;
                this.q = it;
                this.r = list;
                this.s = collection4;
                this.u = i2;
                this.v = i;
                this.w = i3;
                this.j = 1;
                e15 e15Var = (e15) a04Var.a.getValue();
                int i10 = i3;
                str3 = str2;
                b0 = zsd.b0(new c05(e15Var.h(str2), e15Var, str4, 2));
                if (b0 != nm6Var) {
                    i9 = i10;
                    collection3 = collection;
                    collection.add(zsd.b0((pjc) b0));
                    i3 = i9;
                    collection = collection3;
                    str2 = str3;
                    rjcVar4 = null;
                    if (it.hasNext()) {
                        str = str2;
                        list2 = (List) collection;
                        if (to1Var != null) {
                            List list10 = to1Var.a;
                            ArrayList arrayList3 = new ArrayList(v75.o(list10, 10));
                            rjcVar2 = rjcVar;
                            i4 = i2;
                            list3 = list2;
                            list4 = list;
                            to1Var2 = to1Var;
                            i5 = 0;
                            it2 = list10.iterator();
                            collection2 = arrayList3;
                            i6 = 0;
                            if (it2.hasNext()) {
                            }
                        }
                        rjcVar3 = rjcVar;
                        list5 = list2;
                        list6 = list;
                        to1Var3 = to1Var;
                        list7 = c5b.a;
                        eno enoVar = new eno(new ov((pjc[]) CollectionsKt.w0(CollectionsKt.g0(list5, list7)).toArray(new pjc[0]), (Continuation) null, to1Var3, list6, j04Var));
                        this.k = null;
                        this.l = null;
                        this.n = null;
                        this.o = null;
                        this.p = null;
                        this.q = null;
                        this.r = null;
                        this.s = null;
                        this.t = null;
                        this.j = 3;
                    }
                }
                return nm6Var;
            }
        } else {
            if (i7 != 2) {
                if (i7 == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = this.w;
            i5 = this.v;
            i4 = this.u;
            collection2 = this.t;
            Collection collection5 = this.s;
            list4 = this.r;
            it2 = this.q;
            Collection collection6 = this.p;
            to1Var2 = this.o;
            rjcVar2 = this.n;
            qgg.h0(obj);
            a04 a04Var2 = a04Var;
            str = "track_mview";
            Object b02 = obj;
            List list11 = collection5;
            collection2.add(zsd.b0((pjc) b02));
            collection2 = collection6;
            a04Var = a04Var2;
            list3 = list11;
            if (it2.hasNext()) {
                String str5 = ((so1) it2.next()).a.a;
                this.k = null;
                this.l = null;
                this.n = rjcVar2;
                this.o = to1Var2;
                Collection collection7 = collection2;
                this.p = collection7;
                this.q = it2;
                this.r = list4;
                this.s = list3;
                this.t = collection7;
                this.u = i4;
                this.v = i5;
                this.w = i6;
                this.j = 2;
                e15 e15Var2 = (e15) a04Var.a.getValue();
                a04Var2 = a04Var;
                int i11 = i6;
                b02 = zsd.b0(new c05(e15Var2.h(str), e15Var2, str5, 2));
                if (b02 != nm6Var) {
                    collection6 = collection2;
                    i6 = i11;
                    list11 = list3;
                    collection2.add(zsd.b0((pjc) b02));
                    collection2 = collection6;
                    a04Var = a04Var2;
                    list3 = list11;
                    if (it2.hasNext()) {
                        List list12 = (List) collection2;
                        if (list12 != null) {
                            list7 = list12;
                            rjcVar3 = rjcVar2;
                            to1Var3 = to1Var2;
                            list6 = list4;
                            list5 = list3;
                            eno enoVar2 = new eno(new ov((pjc[]) CollectionsKt.w0(CollectionsKt.g0(list5, list7)).toArray(new pjc[0]), (Continuation) null, to1Var3, list6, j04Var));
                            this.k = null;
                            this.l = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.q = null;
                            this.r = null;
                            this.s = null;
                            this.t = null;
                            this.j = 3;
                        } else {
                            rjcVar = rjcVar2;
                            to1Var = to1Var2;
                            list2 = list3;
                            list = list4;
                            rjcVar3 = rjcVar;
                            list5 = list2;
                            list6 = list;
                            to1Var3 = to1Var;
                            list7 = c5b.a;
                            eno enoVar22 = new eno(new ov((pjc[]) CollectionsKt.w0(CollectionsKt.g0(list5, list7)).toArray(new pjc[0]), (Continuation) null, to1Var3, list6, j04Var));
                            this.k = null;
                            this.l = null;
                            this.n = null;
                            this.o = null;
                            this.p = null;
                            this.q = null;
                            this.r = null;
                            this.s = null;
                            this.t = null;
                            this.j = 3;
                        }
                    }
                }
                return nm6Var;
            }
        }
    }
}
