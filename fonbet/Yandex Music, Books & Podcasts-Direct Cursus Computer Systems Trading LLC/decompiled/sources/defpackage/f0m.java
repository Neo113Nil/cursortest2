package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0m extends aur implements tyc {
    public int j;
    public /* synthetic */ scc k;
    public /* synthetic */ String l;
    public /* synthetic */ e4m m;
    public /* synthetic */ a1m n;
    public final /* synthetic */ n0m o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0m(n0m n0mVar, Continuation continuation) {
        super(5, continuation);
        this.o = n0mVar;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f0m f0mVar = new f0m(this.o, (Continuation) obj5);
        f0mVar.k = (scc) obj;
        f0mVar.l = (String) obj2;
        f0mVar.m = (e4m) obj3;
        f0mVar.n = (a1m) obj4;
        return f0mVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0053, code lost:
    
        if (r3 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c5, code lost:
    
        if (r1.emit(r4, r20) == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131 A[SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object b;
        Iterator it;
        ora oraVar;
        Object obj3;
        IndexedValue indexedValue;
        List list;
        jdc jdcVar = jdc.a;
        hdc hdcVar = hdc.a;
        scc sccVar = this.k;
        String str = this.l;
        e4m e4mVar = this.m;
        a1m a1mVar = this.n;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            if (!Intrinsics.d(sccVar, pcc.a)) {
                if (!Intrinsics.d(sccVar, qcc.a)) {
                    if (Intrinsics.d(sccVar, occ.a)) {
                        xdr xdrVar = this.o.C0;
                        xdrVar.getClass();
                        xdrVar.m(null, "all");
                        return hdcVar;
                    }
                    if (!(sccVar instanceof rcc)) {
                        b6e.s();
                        return null;
                    }
                    Iterator it2 = ((rcc) sccVar).a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (((zbc) obj2).a.equals(str)) {
                            break;
                        }
                    }
                    if (obj2 == null) {
                        xdr xdrVar2 = this.o.C0;
                        xdrVar2.getClass();
                        xdrVar2.m(null, "all");
                        j0q j0qVar = this.o.F0;
                        Integer num = new Integer(0);
                        this.k = sccVar;
                        this.l = null;
                        this.m = e4mVar;
                        this.n = a1mVar;
                        this.j = 2;
                    }
                    rcc rccVar = (rcc) sccVar;
                    List list2 = rccVar.a;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    int i2 = 0;
                    while (r1.hasNext()) {
                    }
                    it = CollectionsKt.B0(rccVar.a).iterator();
                    while (true) {
                        oraVar = (ora) it;
                        if (oraVar.b.hasNext()) {
                        }
                    }
                    indexedValue = (IndexedValue) obj3;
                    if (indexedValue != null) {
                    }
                }
            }
            dzl dzlVar = (dzl) this.o.z.getValue();
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.j = 1;
            b = dzlVar.b(this);
            return nm6Var;
        }
        if (i == 1) {
            qgg.h0(obj);
            b = obj;
            return ((Boolean) b).booleanValue() ? jdcVar : hdcVar;
        }
        if (i != 2) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        str = "all";
        rcc rccVar2 = (rcc) sccVar;
        List list22 = rccVar2.a;
        ArrayList arrayList2 = new ArrayList(v75.o(list22, 10));
        int i22 = 0;
        for (Object obj4 : list22) {
            int i3 = i22 + 1;
            if (i22 < 0) {
                u75.n();
                throw null;
            }
            zbc zbcVar = (zbc) obj4;
            String str2 = zbcVar.a;
            arrayList2.add(new hcc(i22, str2, zbcVar.b, str2.equals(str)));
            i22 = i3;
        }
        it = CollectionsKt.B0(rccVar2.a).iterator();
        while (true) {
            oraVar = (ora) it;
            if (oraVar.b.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = oraVar.next();
            if (((zbc) ((IndexedValue) obj3).b).a.equals(str)) {
                break;
            }
        }
        indexedValue = (IndexedValue) obj3;
        if (indexedValue != null) {
            z0m z0mVar = a1mVar instanceof z0m ? (z0m) a1mVar : null;
            if (z0mVar == null || (list = z0mVar.d) == null) {
                list = c5b.a;
            }
            zbc zbcVar2 = (zbc) indexedValue.b;
            Set set = zbcVar2.c;
            if (set != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list) {
                    if (set.contains(((mqs) obj5).d())) {
                        arrayList3.add(obj5);
                    }
                }
                list = arrayList3;
            }
            hjq hjqVar = this.o.v;
            if (!zbcVar2.a.equals("all")) {
                e4mVar = null;
            }
            ArrayList a = hjqVar.a(list, e4mVar);
            if (!Intrinsics.d(this.o.I0, rccVar2.a)) {
                List list3 = rccVar2.a;
                n0m n0mVar = this.o;
                int i4 = 0;
                for (Object obj6 : list3) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        u75.n();
                        throw null;
                    }
                    zbc zbcVar3 = (zbc) obj6;
                    n0mVar.m.b().g(new u0s(zbcVar3.a, i5, zbcVar3.a.equals(str)));
                    i4 = i5;
                }
                this.o.I0 = rccVar2.a;
            }
            return new ldc(arrayList2, indexedValue.a, this.o.H0, a, list);
        }
    }
}
