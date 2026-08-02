package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.phonoteka.playlist.SoMuchTracksException;

/* loaded from: classes6.dex */
public final class oul {
    public final kvn a;
    public final klg b;
    public final frt c;
    public final aoi d;

    public oul(kvn kvnVar, klg klgVar, frt frtVar, aoi aoiVar) {
        aoiVar.getClass();
        this.a = kvnVar;
        this.b = klgVar;
        this.c = frtVar;
        this.d = aoiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cvl cvlVar, List list, boolean z, cg6 cg6Var) {
        lul lulVar;
        lul lulVar2;
        nm6 nm6Var;
        int i;
        klg klgVar;
        cvl cvlVar2;
        List list2;
        ArrayList arrayList;
        cvl a;
        cvl cvlVar3;
        List list3;
        boolean z2 = z;
        if (cg6Var instanceof lul) {
            lulVar = (lul) cg6Var;
            int i2 = lulVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lulVar.q = i2 - Integer.MIN_VALUE;
                lulVar2 = lulVar;
                Object obj = lulVar2.o;
                nm6Var = nm6.a;
                i = lulVar2.q;
                klg klgVar2 = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.size() + cvlVar.g > 10000) {
                        throw new SoMuchTracksException();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        mqs mqsVar = (mqs) obj2;
                        if (!mqsVar.l() && mqsVar.k == dg2.b) {
                            ssg.a(5, null, "isValidForAdding(): available track with unknown album: " + mqsVar, null);
                        }
                        arrayList2.add(obj2);
                    }
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((mqs) it.next()).d());
                    }
                    Integer num = new Integer(cvlVar.g);
                    if (z2) {
                        num = null;
                    }
                    int intValue = num != null ? num.intValue() : 0;
                    lulVar2.j = cvlVar;
                    lulVar2.k = list;
                    lulVar2.l = arrayList3;
                    lulVar2.n = z2;
                    lulVar2.q = 1;
                    int i3 = intValue;
                    klgVar = klgVar2;
                    Object V = x97.V(dm6.a, new fr4(klgVar, cvlVar, arrayList3, i3, (Continuation) null, 3), lulVar2);
                    if (V != nm6.a) {
                        V = Unit.a;
                    }
                    if (V != nm6Var) {
                        cvlVar2 = cvlVar;
                        list2 = list;
                        arrayList = arrayList3;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvlVar3 = lulVar2.m;
                    list3 = lulVar2.k;
                    qgg.h0(obj);
                    this.d.d(list3);
                    return cvlVar3;
                }
                boolean z3 = lulVar2.n;
                arrayList = lulVar2.l;
                list2 = lulVar2.k;
                cvl cvlVar4 = lulVar2.j;
                qgg.h0(obj);
                z2 = z3;
                klgVar = klgVar2;
                cvlVar2 = cvlVar4;
                a = cvl.a(cvlVar2, null, null, 0, arrayList.size() + cvlVar2.g, 0L, null, null, null, null, null, null, null, null, null, null, 134217663);
                lulVar2.j = null;
                lulVar2.k = list2;
                lulVar2.l = null;
                lulVar2.m = a;
                lulVar2.n = z2;
                lulVar2.q = 2;
                if (klgVar.g(a, lulVar2) != nm6Var) {
                    cvlVar3 = a;
                    list3 = list2;
                    this.d.d(list3);
                    return cvlVar3;
                }
                return nm6Var;
            }
        }
        lulVar = new lul(this, cg6Var);
        lulVar2 = lulVar;
        Object obj3 = lulVar2.o;
        nm6Var = nm6.a;
        i = lulVar2.q;
        klg klgVar22 = this.b;
        if (i != 0) {
        }
        a = cvl.a(cvlVar2, null, null, 0, arrayList.size() + cvlVar2.g, 0L, null, null, null, null, null, null, null, null, null, null, 134217663);
        lulVar2.j = null;
        lulVar2.k = list2;
        lulVar2.l = null;
        lulVar2.m = a;
        lulVar2.n = z2;
        lulVar2.q = 2;
        if (klgVar.g(a, lulVar2) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cvl cvlVar, cg6 cg6Var) {
        mul mulVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof mul) {
            mulVar = (mul) cg6Var;
            int i2 = mulVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mulVar.l = i2 - Integer.MIN_VALUE;
                Object obj = mulVar.j;
                nm6 nm6Var = nm6.a;
                i = mulVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String e = cvlVar.e();
                    mulVar.l = 1;
                    obj = this.a.c(e, mulVar);
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
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return Unit.a;
                }
                if (rj6Var instanceof pj6) {
                    throw ((pj6) rj6Var).a();
                }
                b6e.s();
                return null;
            }
        }
        mulVar = new mul(this, cg6Var);
        Object obj2 = mulVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mulVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0084 -> B:22:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cvl cvlVar, List list, cg6 cg6Var) {
        nul nulVar;
        int i;
        Iterator it;
        cvl cvlVar2;
        int i2;
        if (cg6Var instanceof nul) {
            nulVar = (nul) cg6Var;
            int i3 = nulVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nulVar.p = i3 - Integer.MIN_VALUE;
                Object obj = nulVar.n;
                nm6 nm6Var = nm6.a;
                i = nulVar.p;
                klg klgVar = this.b;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    it = list.iterator();
                    cvlVar2 = cvlVar;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        return obj;
                    }
                    i2 = nulVar.l;
                    qgg.h0(obj);
                    cvl cvlVar3 = (cvl) obj;
                    cvl a = cvl.a(cvlVar3, null, null, 0, cvlVar3.g - i2, 0L, null, null, null, null, null, null, null, null, null, null, 134217663);
                    nulVar.j = null;
                    nulVar.k = null;
                    nulVar.l = i2;
                    nulVar.p = 3;
                    Object g = klgVar.g(a, nulVar);
                    return g == nm6Var ? nm6Var : g;
                }
                i2 = nulVar.m;
                Iterator it2 = nulVar.k;
                cvlVar2 = nulVar.j;
                qgg.h0(obj);
                i2 += ((Number) obj).intValue();
                it = it2;
                if (it.hasNext()) {
                    mqs mqsVar = (mqs) it.next();
                    nulVar.j = cvlVar2;
                    nulVar.k = it;
                    nulVar.l = 0;
                    nulVar.m = i2;
                    nulVar.p = 1;
                    Object V = x97.V(dm6.a, new fr4(klgVar, cvlVar2, mqsVar, continuation, 4), nulVar);
                    if (V != nm6Var) {
                        it2 = it;
                        obj = V;
                        i2 += ((Number) obj).intValue();
                        it = it2;
                        if (it.hasNext()) {
                            nulVar.j = null;
                            nulVar.k = null;
                            nulVar.l = i2;
                            nulVar.p = 2;
                            obj = klgVar.e(cvlVar2, nulVar);
                        }
                    }
                }
            }
        }
        nulVar = new nul(this, cg6Var);
        Object obj2 = nulVar.n;
        nm6 nm6Var2 = nm6.a;
        i = nulVar.p;
        klg klgVar2 = this.b;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }
}
