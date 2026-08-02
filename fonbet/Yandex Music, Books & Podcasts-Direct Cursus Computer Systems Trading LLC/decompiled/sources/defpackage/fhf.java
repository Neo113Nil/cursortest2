package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fhf extends bfu {
    public final xdr k = ydr.a(nhf.b);
    public final xdr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;

    public fhf() {
        xdr a = ydr.a(c5b.a);
        this.l = a;
        this.m = l18.b.b(hag.I(zx4.class), true);
        jyr b = btf.b(new v1e(20, this));
        this.n = b;
        this.o = btf.b(new bff(4));
        ox6.B(new u21(10, a, ((yx4) ((xgf) b.getValue()).a.getValue()).x(null), new w40(3, this, fhf.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6)), ot0.F(this), new otd(14, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(fhf fhfVar, List list, List list2, Continuation continuation) {
        chf chfVar;
        int i;
        List o0;
        fhfVar.getClass();
        if (continuation instanceof chf) {
            chfVar = (chf) continuation;
            int i2 = chfVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chfVar.m = i2 - Integer.MIN_VALUE;
                Object obj = chfVar.k;
                Object obj2 = nm6.a;
                i = chfVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    chfVar.j = list2;
                    chfVar.m = 1;
                    obj = fhfVar.G(list, list2, chfVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = chfVar.j;
                    qgg.h0(obj);
                }
                yfa yfaVar = (yfa) obj;
                if (!list2.isEmpty()) {
                    return nhf.a;
                }
                int ordinal = yfaVar.ordinal();
                if (ordinal == 0) {
                    o0 = CollectionsKt.o0(list2, new zda(29));
                } else if (ordinal == 1) {
                    o0 = CollectionsKt.o0(list2, new zda(28));
                } else if (ordinal == 2) {
                    o0 = CollectionsKt.o0(list2, new eh(8, new zda(26)));
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                    o0 = CollectionsKt.o0(list2, new eh(9, new zda(27)));
                }
                List list3 = o0;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    mqs mqsVar = ((jja) it.next()).a;
                    arrayList.add(new b2t(oo6.a.a(mqsVar), mqsVar));
                }
                return new qhf(arrayList);
            }
        }
        chfVar = new chf(fhfVar, continuation);
        Object obj3 = chfVar.k;
        Object obj22 = nm6.a;
        i = chfVar.m;
        if (i != 0) {
        }
        yfa yfaVar2 = (yfa) obj3;
        if (!list2.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00a3, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum G(List list, List list2, cg6 cg6Var) {
        ahf ahfVar;
        int i;
        Object obj;
        yfa a;
        List list3;
        Iterator it;
        jhf jhfVar;
        jhf jhfVar2;
        jhf jhfVar3;
        if (cg6Var instanceof ahf) {
            ahfVar = (ahf) cg6Var;
            int i2 = ahfVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ahfVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = ahfVar.m;
                nm6 nm6Var = nm6.a;
                i = ahfVar.o;
                jyr jyrVar = this.n;
                jyr jyrVar2 = this.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (!list.isEmpty()) {
                        ((lhf) jyrVar2.getValue()).getClass();
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
                        a = vbcVar != null ? lhf.a(vbcVar) : yfa.a;
                        list3 = list2;
                        it = list3.iterator();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (it.hasNext()) {
                            int ordinal = ((jja) it.next()).a.I().ordinal();
                            if (ordinal == 0) {
                                z = true;
                            } else if (ordinal != 1) {
                                z2 = true;
                            } else {
                                z3 = true;
                            }
                        }
                        jhfVar = new jhf(a, !z && (z2 || z3), !z3 && (z2 || z));
                        if (jhfVar.d) {
                            xgf xgfVar = (xgf) jyrVar.getValue();
                            yfa yfaVar = yfa.a;
                            ahfVar.j = null;
                            ahfVar.k = a;
                            ahfVar.l = jhfVar;
                            ahfVar.o = 2;
                            if (xgfVar.a(yfaVar, ahfVar) != nm6Var) {
                                jhfVar2 = jhfVar;
                                jhfVar = jhfVar2;
                            }
                            return nm6Var;
                        }
                        if (jhfVar.d) {
                        }
                        if (jhfVar3 == null) {
                        }
                        ((lhf) jyrVar2.getValue()).getClass();
                        yfa yfaVar2 = jhfVar3.a;
                        ArrayList j = u75.j(new pbc(yfaVar2 != yfa.a), new kbc(yfaVar2 != yfa.b));
                        if (jhfVar3.b) {
                        }
                        if (jhfVar3.c) {
                        }
                        xdr xdrVar = this.l;
                        xdrVar.getClass();
                        xdrVar.m(null, j);
                        return a;
                    }
                    xgf xgfVar2 = (xgf) jyrVar.getValue();
                    ahfVar.j = list2;
                    ahfVar.o = 1;
                    obj2 = ((v55) xgfVar2.b.getValue()).l(ahfVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jhfVar2 = ahfVar.l;
                        a = ahfVar.k;
                        List list4 = ahfVar.j;
                        qgg.h0(obj2);
                        jhfVar = jhfVar2;
                        jhfVar3 = jhfVar.d ? jhfVar : null;
                        if (jhfVar3 == null) {
                            jhfVar3 = new jhf(yfa.a, jhfVar.b, jhfVar.c);
                        }
                        ((lhf) jyrVar2.getValue()).getClass();
                        yfa yfaVar22 = jhfVar3.a;
                        ArrayList j2 = u75.j(new pbc(yfaVar22 != yfa.a), new kbc(yfaVar22 != yfa.b));
                        if (jhfVar3.b) {
                            j2.add(new ubc(yfaVar22 == yfa.c));
                        }
                        if (jhfVar3.c) {
                            j2.add(new qbc(yfaVar22 == yfa.d));
                        }
                        xdr xdrVar2 = this.l;
                        xdrVar2.getClass();
                        xdrVar2.m(null, j2);
                        return a;
                    }
                    list2 = ahfVar.j;
                    qgg.h0(obj2);
                }
                list3 = list2;
                a = (yfa) obj2;
                it = list3.iterator();
                boolean z4 = false;
                boolean z22 = false;
                boolean z32 = false;
                while (it.hasNext()) {
                }
                jhfVar = new jhf(a, !z4 && (z22 || z32), !z32 && (z22 || z4));
                if (jhfVar.d) {
                }
                if (jhfVar.d) {
                }
                if (jhfVar3 == null) {
                }
                ((lhf) jyrVar2.getValue()).getClass();
                yfa yfaVar222 = jhfVar3.a;
                ArrayList j22 = u75.j(new pbc(yfaVar222 != yfa.a), new kbc(yfaVar222 != yfa.b));
                if (jhfVar3.b) {
                }
                if (jhfVar3.c) {
                }
                xdr xdrVar22 = this.l;
                xdrVar22.getClass();
                xdrVar22.m(null, j22);
                return a;
            }
        }
        ahfVar = new ahf(this, cg6Var);
        Object obj22 = ahfVar.m;
        nm6 nm6Var2 = nm6.a;
        i = ahfVar.o;
        jyr jyrVar3 = this.n;
        jyr jyrVar22 = this.o;
        if (i != 0) {
        }
        list3 = list2;
        a = (yfa) obj22;
        it = list3.iterator();
        boolean z42 = false;
        boolean z222 = false;
        boolean z322 = false;
        while (it.hasNext()) {
        }
        jhfVar = new jhf(a, !z42 && (z222 || z322), !z322 && (z222 || z42));
        if (jhfVar.d) {
        }
        if (jhfVar.d) {
        }
        if (jhfVar3 == null) {
        }
        ((lhf) jyrVar22.getValue()).getClass();
        yfa yfaVar2222 = jhfVar3.a;
        ArrayList j222 = u75.j(new pbc(yfaVar2222 != yfa.a), new kbc(yfaVar2222 != yfa.b));
        if (jhfVar3.b) {
        }
        if (jhfVar3.c) {
        }
        xdr xdrVar222 = this.l;
        xdrVar222.getClass();
        xdrVar222.m(null, j222);
        return a;
    }
}
