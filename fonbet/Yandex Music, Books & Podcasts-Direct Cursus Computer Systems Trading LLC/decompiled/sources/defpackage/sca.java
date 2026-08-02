package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.databases.user.UserDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class sca {
    public final dst a;
    public final i5h b;

    public sca(dst dstVar, i5h i5hVar) {
        this.a = dstVar;
        this.b = i5hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        lca lcaVar;
        int i;
        if (cg6Var instanceof lca) {
            lcaVar = (lca) cg6Var;
            int i2 = lcaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lcaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lcaVar.j;
                nm6 nm6Var = nm6.a;
                i = lcaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    lcaVar.l = 1;
                    obj = this.a.b(str, lcaVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((UserDatabase) obj).x();
            }
        }
        lcaVar = new lca(this, cg6Var);
        Object obj2 = lcaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lcaVar.l;
        if (i != 0) {
        }
        return ((UserDatabase) obj2).x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, cg6 cg6Var) {
        mca mcaVar;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof mca) {
            mcaVar = (mca) cg6Var;
            int i2 = mcaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mcaVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = mcaVar.k;
                obj = nm6.a;
                i = mcaVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    mcaVar.j = str2;
                    mcaVar.m = 1;
                    obj2 = a(str, mcaVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = mcaVar.j;
                    qgg.h0(obj2);
                }
                mcaVar.j = null;
                mcaVar.m = 2;
                G = up6.G(((ada) obj2).a, false, true, new wq(str2, 24), mcaVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        mcaVar = new mca(this, cg6Var);
        Object obj22 = mcaVar.k;
        obj = nm6.a;
        i = mcaVar.m;
        if (i != 0) {
        }
        mcaVar.j = null;
        mcaVar.m = 2;
        G = up6.G(((ada) obj22).a, false, true, new wq(str2, 24), mcaVar);
        if (G != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        nca ncaVar;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof nca) {
            ncaVar = (nca) cg6Var;
            int i2 = ncaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ncaVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = ncaVar.j;
                obj = nm6.a;
                i = ncaVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    ncaVar.l = 1;
                    obj2 = a(str, ncaVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                ncaVar.l = 2;
                G = up6.G(((ada) obj2).a, false, true, new c68(22), ncaVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        ncaVar = new nca(this, cg6Var);
        Object obj22 = ncaVar.j;
        obj = nm6.a;
        i = ncaVar.l;
        if (i != 0) {
        }
        ncaVar.l = 2;
        G = up6.G(((ada) obj22).a, false, true, new c68(22), ncaVar);
        if (G != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, cg6 cg6Var) {
        oca ocaVar;
        int i;
        if (cg6Var instanceof oca) {
            ocaVar = (oca) cg6Var;
            int i2 = ocaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ocaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ocaVar.j;
                nm6 nm6Var = nm6.a;
                i = ocaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ocaVar.l = 1;
                    obj = a(str, ocaVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable<ica> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (ica icaVar : iterable) {
                            arrayList.add(new jca(icaVar.a, icaVar.b));
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                ocaVar.l = 2;
                obj = up6.G(((ada) obj).a, true, false, new c68(21), ocaVar);
            }
        }
        ocaVar = new oca(this, cg6Var);
        Object obj2 = ocaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ocaVar.l;
        if (i != 0) {
        }
        ocaVar.l = 2;
        obj2 = up6.G(((ada) obj2).a, true, false, new c68(21), ocaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fc, code lost:
    
        if (r2 != r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[LOOP:1: B:27:0x009a->B:29:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r11v4, types: [vhn] */
    /* JADX WARN: Type inference failed for: r22v0, types: [sca] */
    /* JADX WARN: Type inference failed for: r9v5, types: [vhn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, uhn uhnVar, Boolean bool, Integer num, cg6 cg6Var) {
        pca pcaVar;
        nm6 nm6Var;
        int i;
        uhn uhnVar2;
        Boolean bool2;
        Object d;
        String str2;
        Integer num2;
        Iterator it;
        Object b;
        Integer num3;
        uhn uhnVar3;
        Boolean bool3;
        ArrayList arrayList;
        String str3;
        if (cg6Var instanceof pca) {
            pcaVar = (pca) cg6Var;
            int i2 = pcaVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pcaVar.r = i2 - Integer.MIN_VALUE;
                Object obj = pcaVar.p;
                nm6Var = nm6.a;
                i = pcaVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    pcaVar.j = str;
                    uhnVar2 = uhnVar;
                    pcaVar.k = uhnVar2;
                    bool2 = bool;
                    pcaVar.l = bool2;
                    pcaVar.m = num;
                    pcaVar.r = 1;
                    d = d(str, pcaVar);
                    if (d != nm6Var) {
                        str2 = str;
                        num2 = num;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    num2 = pcaVar.m;
                    bool2 = pcaVar.l;
                    ?? r9 = pcaVar.k;
                    str2 = pcaVar.j;
                    qgg.h0(obj);
                    d = obj;
                    uhnVar2 = r9;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List list = (List) obj;
                        ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(h4a.X((zv) it2.next()));
                        }
                        return arrayList2;
                    }
                    String str4 = pcaVar.o;
                    ArrayList arrayList3 = pcaVar.n;
                    Integer num4 = pcaVar.m;
                    Boolean bool4 = pcaVar.l;
                    ?? r11 = pcaVar.k;
                    qgg.h0(obj);
                    str3 = str4;
                    arrayList = arrayList3;
                    num3 = num4;
                    bool3 = bool4;
                    uhnVar3 = r11;
                    ueo ueoVar = (ueo) obj;
                    qca qcaVar = new qca(ueoVar, (Continuation) null, str3, num3, uhnVar3, bool3, arrayList);
                    pcaVar.j = null;
                    pcaVar.k = null;
                    pcaVar.l = null;
                    pcaVar.m = null;
                    pcaVar.n = null;
                    pcaVar.o = null;
                    pcaVar.r = 3;
                    obj = tyf.N(ueoVar, qcaVar, pcaVar);
                }
                List list2 = (List) d;
                ArrayList arrayList4 = new ArrayList(v75.o(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((jca) it.next()).a);
                }
                String X = CollectionsKt.X(list2, StringUtil.SPACE, null, null, new c68(20), 30);
                pcaVar.j = null;
                pcaVar.k = uhnVar2;
                pcaVar.l = bool2;
                pcaVar.m = num2;
                pcaVar.n = arrayList4;
                pcaVar.o = X;
                pcaVar.r = 2;
                b = this.b.b(str2, pcaVar);
                if (b != nm6Var) {
                    num3 = num2;
                    uhnVar3 = uhnVar2;
                    bool3 = bool2;
                    obj = b;
                    arrayList = arrayList4;
                    str3 = X;
                    ueo ueoVar2 = (ueo) obj;
                    qca qcaVar2 = new qca(ueoVar2, (Continuation) null, str3, num3, uhnVar3, bool3, arrayList);
                    pcaVar.j = null;
                    pcaVar.k = null;
                    pcaVar.l = null;
                    pcaVar.m = null;
                    pcaVar.n = null;
                    pcaVar.o = null;
                    pcaVar.r = 3;
                    obj = tyf.N(ueoVar2, qcaVar2, pcaVar);
                }
                return nm6Var;
            }
        }
        pcaVar = new pca(this, cg6Var);
        Object obj2 = pcaVar.p;
        nm6Var = nm6.a;
        i = pcaVar.r;
        if (i != 0) {
        }
        List list22 = (List) d;
        ArrayList arrayList42 = new ArrayList(v75.o(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        String X2 = CollectionsKt.X(list22, StringUtil.SPACE, null, null, new c68(20), 30);
        pcaVar.j = null;
        pcaVar.k = uhnVar2;
        pcaVar.l = bool2;
        pcaVar.m = num2;
        pcaVar.n = arrayList42;
        pcaVar.o = X2;
        pcaVar.r = 2;
        b = this.b.b(str2, pcaVar);
        if (b != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, jca jcaVar, cg6 cg6Var) {
        rca rcaVar;
        Object obj;
        int i;
        ica icaVar;
        Object G;
        if (cg6Var instanceof rca) {
            rcaVar = (rca) cg6Var;
            int i2 = rcaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rcaVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = rcaVar.k;
                obj = nm6.a;
                i = rcaVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    ica icaVar2 = new ica(jcaVar.a, jcaVar.b);
                    rcaVar.j = icaVar2;
                    rcaVar.m = 1;
                    Object a = a(str, rcaVar);
                    if (a != obj) {
                        obj2 = a;
                        icaVar = icaVar2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj2);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                icaVar = rcaVar.j;
                qgg.h0(obj2);
                ada adaVar = (ada) obj2;
                rcaVar.j = null;
                rcaVar.m = 2;
                G = up6.G(adaVar.a, false, true, new ny2(19, adaVar, icaVar), rcaVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        rcaVar = new rca(this, cg6Var);
        Object obj22 = rcaVar.k;
        obj = nm6.a;
        i = rcaVar.m;
        if (i != 0) {
        }
        ada adaVar2 = (ada) obj22;
        rcaVar.j = null;
        rcaVar.m = 2;
        G = up6.G(adaVar2.a, false, true, new ny2(19, adaVar2, icaVar), rcaVar);
        if (G != obj) {
        }
    }
}
