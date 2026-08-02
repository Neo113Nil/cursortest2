package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ms {
    public final ay a;
    public final z66 b;
    public final x0q c = y0q.b(0, 0, null, 7);

    public ms(ay ayVar, z66 z66Var) {
        this.a = ayVar;
        this.b = z66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, cg6 cg6Var) {
        gs gsVar;
        int i;
        oq oqVar;
        if (cg6Var instanceof gs) {
            gsVar = (gs) cg6Var;
            int i2 = gsVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gsVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gsVar.j;
                nm6 nm6Var = nm6.a;
                i = gsVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    gsVar.l = 1;
                    obj = x97.V(dm6.a, new xx(continuation, this.a, str, 0), gsVar);
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
                oqVar = (oq) obj;
                if (oqVar != null) {
                    return null;
                }
                g(oqVar);
                return oqVar;
            }
        }
        gsVar = new gs(this, cg6Var);
        Object obj2 = gsVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gsVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        oqVar = (oq) obj2;
        if (oqVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        hs hsVar;
        int i;
        mt mtVar;
        if (cg6Var instanceof hs) {
            hsVar = (hs) cg6Var;
            int i2 = hsVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hsVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hsVar.j;
                nm6 nm6Var = nm6.a;
                i = hsVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    hsVar.l = 1;
                    obj = x97.V(dm6.a, new xx(continuation, this.a, str, 1), hsVar);
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
                mtVar = (mt) obj;
                if (mtVar != null) {
                    return null;
                }
                g(mtVar.a);
                return mtVar;
            }
        }
        hsVar = new hs(this, cg6Var);
        Object obj2 = hsVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hsVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        mtVar = (mt) obj2;
        if (mtVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        is isVar;
        int i;
        mt mtVar;
        boolean contains;
        if (cg6Var instanceof is) {
            isVar = (is) cg6Var;
            int i2 = isVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                isVar.l = i2 - Integer.MIN_VALUE;
                Object obj = isVar.j;
                nm6 nm6Var = nm6.a;
                i = isVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ay ayVar = this.a;
                    isVar.l = 1;
                    obj = x97.V(dm6.a, new xx(continuation, ayVar, str, 1), isVar);
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
                mtVar = (mt) obj;
                if (mtVar != null) {
                    return null;
                }
                oq oqVar = mtVar.a;
                LinkedList linkedList = oqVar.F;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedList) {
                    mqs mqsVar = (mqs) obj2;
                    if (mqsVar == null) {
                        su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                        contains = false;
                    } else {
                        l18 l18Var = l18.b;
                        bdt I = hag.I(uaa.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                    }
                    if (contains) {
                        arrayList.add(obj2);
                    }
                }
                oqVar.k(arrayList);
                return mtVar;
            }
        }
        isVar = new is(this, cg6Var);
        Object obj3 = isVar.j;
        nm6 nm6Var2 = nm6.a;
        i = isVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        mtVar = (mt) obj3;
        if (mtVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005c, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, cg6 cg6Var) {
        js jsVar;
        int i;
        if (cg6Var instanceof js) {
            jsVar = (js) cg6Var;
            int i2 = jsVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jsVar.k;
                nm6 nm6Var = nm6.a;
                i = jsVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Parcelable.Creator<oq> creator = oq.CREATOR;
                    if (cxb.Y(str) || !this.b.g()) {
                        jsVar.j = null;
                        jsVar.m = 1;
                        obj = a(str, jsVar);
                    } else {
                        jsVar.j = str;
                        jsVar.m = 2;
                        obj = this.a.d(str, true, jsVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    oq oqVar = (oq) obj;
                    if (oqVar != null) {
                        return new Pair(oqVar, as.a);
                    }
                    return null;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    oq oqVar2 = (oq) obj;
                    if (oqVar2 != null) {
                        return new Pair(oqVar2, as.a);
                    }
                    return null;
                }
                str = jsVar.j;
                qgg.h0(obj);
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    return new Pair(((qj6) rj6Var).a, as.b);
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                jsVar.j = null;
                jsVar.m = 3;
                obj = a(str, jsVar);
            }
        }
        jsVar = new js(this, cg6Var);
        Object obj2 = jsVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jsVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005c, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, cg6 cg6Var) {
        ks ksVar;
        int i;
        if (cg6Var instanceof ks) {
            ksVar = (ks) cg6Var;
            int i2 = ksVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ksVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ksVar.k;
                nm6 nm6Var = nm6.a;
                i = ksVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Parcelable.Creator<oq> creator = oq.CREATOR;
                    if (cxb.Y(str) || !this.b.g()) {
                        ksVar.j = null;
                        ksVar.m = 1;
                        obj = b(str, ksVar);
                    } else {
                        ksVar.j = str;
                        ksVar.m = 2;
                        obj = this.a.e(str, true, ksVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    mt mtVar = (mt) obj;
                    if (mtVar != null) {
                        return new Pair(mtVar, as.a);
                    }
                    return null;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    mt mtVar2 = (mt) obj;
                    if (mtVar2 != null) {
                        return new Pair(mtVar2, as.a);
                    }
                    return null;
                }
                str = ksVar.j;
                qgg.h0(obj);
                rj6 rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    return new Pair(((qj6) rj6Var).a, as.b);
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                ksVar.j = null;
                ksVar.m = 3;
                obj = b(str, ksVar);
            }
        }
        ksVar = new ks(this, cg6Var);
        Object obj2 = ksVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ksVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r11.emit(r2, r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(oq oqVar, mq mqVar, cg6 cg6Var) {
        ls lsVar;
        int i;
        r10 r10Var;
        Object d;
        if (cg6Var instanceof ls) {
            lsVar = (ls) cg6Var;
            int i2 = lsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lsVar.n = i2 - Integer.MIN_VALUE;
                Object obj = lsVar.l;
                nm6 nm6Var = nm6.a;
                i = lsVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ay ayVar = this.a;
                    lsVar.j = oqVar;
                    lsVar.k = mqVar;
                    lsVar.n = 1;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    b20 b20Var = ayVar.c;
                    String str2 = oqVar.a;
                    int ordinal = mqVar.ordinal();
                    if (ordinal == 0) {
                        r10Var = r10.Asc;
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        r10Var = r10.Desc;
                    }
                    boolean z = mqVar == oqVar.f();
                    a20 a20Var = b20Var.a;
                    if (z) {
                        d = a20Var.b(str, str2, lsVar);
                        if (d != nm6Var) {
                            d = Unit.a;
                        }
                    } else {
                        d = a20Var.d(str, str2, r10Var, lsVar);
                        if (d != nm6Var) {
                            d = Unit.a;
                        }
                    }
                    if (d != nm6Var) {
                        d = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqVar = lsVar.k;
                    oqVar = lsVar.j;
                    qgg.h0(obj);
                }
                x0q x0qVar = this.c;
                Pair pair = new Pair(oqVar.a, mqVar);
                lsVar.j = null;
                lsVar.k = null;
                lsVar.n = 2;
            }
        }
        lsVar = new ls(this, cg6Var);
        Object obj2 = lsVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lsVar.n;
        if (i != 0) {
        }
        x0q x0qVar2 = this.c;
        Pair pair2 = new Pair(oqVar.a, mqVar);
        lsVar.j = null;
        lsVar.k = null;
        lsVar.n = 2;
    }

    public final void g(oq oqVar) {
        boolean contains;
        if (this.b.h()) {
            LinkedList linkedList = oqVar.F;
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedList) {
                mqs mqsVar = (mqs) obj;
                if (mqsVar == null) {
                    su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                    contains = false;
                } else {
                    l18 l18Var = l18.b;
                    bdt I = hag.I(uaa.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                }
                if (contains) {
                    arrayList.add(obj);
                }
            }
            oqVar.k(arrayList);
        }
    }
}
