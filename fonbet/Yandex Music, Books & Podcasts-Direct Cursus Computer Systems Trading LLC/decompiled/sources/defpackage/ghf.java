package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ghf extends bfu {
    public final xdr k = ydr.a(phf.a);
    public final j6e l;
    public final fkn m;
    public final j0q n;
    public final xdr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;

    public ghf() {
        j6e j6eVar = new j6e(25);
        this.l = j6eVar;
        this.m = (fkn) j6eVar.b;
        this.n = new j0q();
        xdr a = ydr.a(c5b.a);
        this.o = a;
        bdt I = hag.I(qy4.class);
        l18 l18Var = l18.b;
        this.p = l18Var.b(I, true);
        this.q = l18Var.b(hag.I(vxr.class), true);
        jyr b = btf.b(new v1e(21, this));
        this.r = b;
        this.s = btf.b(new bff(5));
        e15 e15Var = (e15) ((xy4) b.getValue()).a.getValue();
        ox6.B(new u21(10, a, zsd.b0(new w05(e15Var.h("track_mview"), e15Var, 0)), new w40(3, this, ghf.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7)), ot0.F(this), new otd(15, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ghf ghfVar, List list, List list2, Continuation continuation) {
        dhf dhfVar;
        int i;
        List o0;
        ghfVar.getClass();
        if (continuation instanceof dhf) {
            dhfVar = (dhf) continuation;
            int i2 = dhfVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dhfVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dhfVar.k;
                Object obj2 = nm6.a;
                i = dhfVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    dhfVar.j = list2;
                    dhfVar.m = 1;
                    obj = ghfVar.G(list, list2, dhfVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = dhfVar.j;
                    qgg.h0(obj);
                }
                ogf ogfVar = (ogf) obj;
                if (!list2.isEmpty()) {
                    return ohf.a;
                }
                int ordinal = ogfVar.ordinal();
                if (ordinal == 0) {
                    o0 = CollectionsKt.o0(list2, new ehf(3));
                } else if (ordinal == 1) {
                    o0 = CollectionsKt.o0(list2, new ehf(2));
                } else if (ordinal == 2) {
                    o0 = CollectionsKt.o0(list2, new eh(10, new ehf(0)));
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                    o0 = CollectionsKt.o0(list2, new eh(11, new ehf(1)));
                }
                List<mqs> list3 = o0;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                for (mqs mqsVar : list3) {
                    arrayList.add(new c2t(oo6.a.a(mqsVar), mqsVar));
                }
                return new rhf(arrayList);
            }
        }
        dhfVar = new dhf(ghfVar, continuation);
        Object obj3 = dhfVar.k;
        Object obj22 = nm6.a;
        i = dhfVar.m;
        if (i != 0) {
        }
        ogf ogfVar2 = (ogf) obj3;
        if (!list2.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00a3, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum G(List list, List list2, cg6 cg6Var) {
        bhf bhfVar;
        int i;
        Object obj;
        ogf a;
        List list3;
        Iterator it;
        khf khfVar;
        khf khfVar2;
        khf khfVar3;
        if (cg6Var instanceof bhf) {
            bhfVar = (bhf) cg6Var;
            int i2 = bhfVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bhfVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = bhfVar.m;
                nm6 nm6Var = nm6.a;
                i = bhfVar.o;
                jyr jyrVar = this.r;
                jyr jyrVar2 = this.s;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (!list.isEmpty()) {
                        ((mhf) jyrVar2.getValue()).getClass();
                        list.getClass();
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (((vbc) obj).b()) {
                                break;
                            }
                        }
                        vbc vbcVar = (vbc) obj;
                        a = vbcVar != null ? mhf.a(vbcVar) : ogf.a;
                        list3 = list2;
                        it = list3.iterator();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (it.hasNext()) {
                            int ordinal = ((mqs) it.next()).I().ordinal();
                            if (ordinal == 0) {
                                z = true;
                            } else if (ordinal != 1) {
                                z2 = true;
                            } else {
                                z3 = true;
                            }
                        }
                        khfVar = new khf(a, !z && (z2 || z3), !z3 && (z2 || z));
                        if (khfVar.d) {
                            xy4 xy4Var = (xy4) jyrVar.getValue();
                            ogf ogfVar = ogf.a;
                            bhfVar.j = null;
                            bhfVar.k = a;
                            bhfVar.l = khfVar;
                            bhfVar.o = 2;
                            if (xy4Var.a(ogfVar, bhfVar) != nm6Var) {
                                khfVar2 = khfVar;
                                khfVar = khfVar2;
                            }
                            return nm6Var;
                        }
                        if (khfVar.d) {
                        }
                        if (khfVar3 == null) {
                        }
                        ((mhf) jyrVar2.getValue()).getClass();
                        ogf ogfVar2 = khfVar3.a;
                        ArrayList j = u75.j(new nbc(ogfVar2 != ogf.a), new kbc(ogfVar2 != ogf.b));
                        if (khfVar3.b) {
                        }
                        if (khfVar3.c) {
                        }
                        xdr xdrVar = this.o;
                        xdrVar.getClass();
                        xdrVar.m(null, j);
                        return a;
                    }
                    xy4 xy4Var2 = (xy4) jyrVar.getValue();
                    bhfVar.j = list2;
                    bhfVar.o = 1;
                    obj2 = ((v55) xy4Var2.b.getValue()).u(bhfVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        khfVar2 = bhfVar.l;
                        a = bhfVar.k;
                        List list4 = bhfVar.j;
                        qgg.h0(obj2);
                        khfVar = khfVar2;
                        khfVar3 = khfVar.d ? khfVar : null;
                        if (khfVar3 == null) {
                            khfVar3 = new khf(ogf.a, khfVar.b, khfVar.c);
                        }
                        ((mhf) jyrVar2.getValue()).getClass();
                        ogf ogfVar22 = khfVar3.a;
                        ArrayList j2 = u75.j(new nbc(ogfVar22 != ogf.a), new kbc(ogfVar22 != ogf.b));
                        if (khfVar3.b) {
                            j2.add(new ubc(ogfVar22 == ogf.c));
                        }
                        if (khfVar3.c) {
                            j2.add(new qbc(ogfVar22 == ogf.d));
                        }
                        xdr xdrVar2 = this.o;
                        xdrVar2.getClass();
                        xdrVar2.m(null, j2);
                        return a;
                    }
                    list2 = bhfVar.j;
                    qgg.h0(obj2);
                }
                list3 = list2;
                a = (ogf) obj2;
                it = list3.iterator();
                boolean z4 = false;
                boolean z22 = false;
                boolean z32 = false;
                while (it.hasNext()) {
                }
                khfVar = new khf(a, !z4 && (z22 || z32), !z32 && (z22 || z4));
                if (khfVar.d) {
                }
                if (khfVar.d) {
                }
                if (khfVar3 == null) {
                }
                ((mhf) jyrVar2.getValue()).getClass();
                ogf ogfVar222 = khfVar3.a;
                ArrayList j22 = u75.j(new nbc(ogfVar222 != ogf.a), new kbc(ogfVar222 != ogf.b));
                if (khfVar3.b) {
                }
                if (khfVar3.c) {
                }
                xdr xdrVar22 = this.o;
                xdrVar22.getClass();
                xdrVar22.m(null, j22);
                return a;
            }
        }
        bhfVar = new bhf(this, cg6Var);
        Object obj22 = bhfVar.m;
        nm6 nm6Var2 = nm6.a;
        i = bhfVar.o;
        jyr jyrVar3 = this.r;
        jyr jyrVar22 = this.s;
        if (i != 0) {
        }
        list3 = list2;
        a = (ogf) obj22;
        it = list3.iterator();
        boolean z42 = false;
        boolean z222 = false;
        boolean z322 = false;
        while (it.hasNext()) {
        }
        khfVar = new khf(a, !z42 && (z222 || z322), !z322 && (z222 || z42));
        if (khfVar.d) {
        }
        if (khfVar.d) {
        }
        if (khfVar3 == null) {
        }
        ((mhf) jyrVar22.getValue()).getClass();
        ogf ogfVar2222 = khfVar3.a;
        ArrayList j222 = u75.j(new nbc(ogfVar2222 != ogf.a), new kbc(ogfVar2222 != ogf.b));
        if (khfVar3.b) {
        }
        if (khfVar3.c) {
        }
        xdr xdrVar222 = this.o;
        xdrVar222.getClass();
        xdrVar222.m(null, j222);
        return a;
    }
}
