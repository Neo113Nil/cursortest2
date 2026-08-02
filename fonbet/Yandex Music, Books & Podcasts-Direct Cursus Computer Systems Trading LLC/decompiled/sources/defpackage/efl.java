package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class efl {
    public final rfl a;
    public final bgl b;
    public final kel c;
    public final oq7 d;
    public final vfl e;
    public final rjq f;
    public final um6 g;
    public final xdr h;
    public final xdr i;
    public final x0q j;

    public efl(rfl rflVar, bgl bglVar, kel kelVar, oq7 oq7Var, vfl vflVar) {
        rflVar.getClass();
        bglVar.getClass();
        kelVar.getClass();
        oq7Var.getClass();
        vflVar.getClass();
        this.a = rflVar;
        this.b = bglVar;
        this.c = kelVar;
        this.d = oq7Var;
        this.e = vflVar;
        rjq b = hyf.b();
        this.f = b;
        this.g = hld.s(b, dm6.b);
        this.h = ydr.a(egl.e);
        this.i = ydr.a(lel.a);
        this.j = y0q.b(0, 0, null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r3v5, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [arf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(efl eflVar, vbn vbnVar, List list, cg6 cg6Var) {
        afl aflVar;
        int i;
        rj6 rj6Var;
        Object obj;
        if (cg6Var instanceof afl) {
            aflVar = (afl) cg6Var;
            int i2 = aflVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aflVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = aflVar.l;
                nm6 nm6Var = nm6.a;
                i = aflVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    bgl bglVar = eflVar.b;
                    aflVar.j = vbnVar;
                    aflVar.k = list;
                    aflVar.n = 1;
                    obj2 = ((Boolean) bglVar.b.invoke()).booleanValue() ? ((agl) bglVar.e.getValue()).a(vbnVar, aflVar) : ((uel) bglVar.f.getValue()).c(vbnVar, aflVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = aflVar.k;
                    vbnVar = aflVar.j;
                    qgg.h0(obj2);
                }
                rj6Var = (rj6) obj2;
                if (!(rj6Var instanceof qj6)) {
                    List list2 = (List) ((Map) ((qj6) rj6Var).a).get(new vdl((rr5) vbnVar.b.c.getValue()));
                    wdl wdlVar = null;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            wdl wdlVar2 = (wdl) next;
                            list.getClass();
                            wdlVar2.getClass();
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (Intrinsics.d((rr5) ((wbn) ((Pair) obj).a).c.getValue(), wdlVar2.a().a)) {
                                    break;
                                }
                            }
                            Pair pair = (Pair) obj;
                            if (pair == null ? false : ((List) pair.b).contains(ern.a(wdlVar2.getClass()))) {
                                wdlVar = next;
                                break;
                            }
                        }
                        wdlVar = wdlVar;
                    }
                    if (wdlVar != null) {
                        return new mel(wdlVar);
                    }
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                return lel.a;
            }
        }
        aflVar = new afl(eflVar, cg6Var);
        Object obj22 = aflVar.l;
        nm6 nm6Var2 = nm6.a;
        i = aflVar.n;
        if (i != 0) {
        }
        rj6Var = (rj6) obj22;
        if (!(rj6Var instanceof qj6)) {
        }
        return lel.a;
    }
}
