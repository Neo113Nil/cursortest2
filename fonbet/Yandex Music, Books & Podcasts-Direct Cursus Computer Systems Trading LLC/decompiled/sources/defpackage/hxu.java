package defpackage;

import com.yandex.music.shared.wave.domain.offline.OfflineProlongationException;
import com.yandex.music.shared.wave.domain.offline.OfflineSessionCreationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class hxu {
    public final eu7 a;
    public final e5q b;
    public final jzi c;
    public final qzc d;
    public final f5v e;
    public final mmo f;
    public final fmu g;
    public final cvu h;
    public final boolean i;
    public final rr5 j;
    public final rdg k;
    public final tf6 l;
    public final ou7 m;

    public hxu(eu7 eu7Var, e5q e5qVar, jzi jziVar, qzc qzcVar, f5v f5vVar, mmo mmoVar, fmu fmuVar, cvu cvuVar, boolean z, rr5 rr5Var, rdg rdgVar, a aVar, boolean z2, s9p s9pVar) {
        this.a = eu7Var;
        this.b = e5qVar;
        this.c = jziVar;
        this.d = qzcVar;
        this.e = f5vVar;
        this.f = mmoVar;
        this.g = fmuVar;
        this.h = cvuVar;
        this.i = z;
        this.j = rr5Var;
        this.k = rdgVar;
        tf6 e = gld.e(e.c(a4g.n(), aVar));
        this.l = e;
        this.m = x97.p(e, null, null, new ak1(this, s9pVar, z2, (Continuation) null, 13), 3);
    }

    public static final boolean a(hxu hxuVar, a5q a5qVar) {
        boolean l;
        cvu cvuVar = hxuVar.h;
        if (a5qVar instanceof w4q) {
            s9p h0 = hdg.h0(a5qVar);
            h0.getClass();
            vuu b = cvuVar.b();
            if (b != null) {
                l = wxf.m(b, h0);
            }
            l = false;
        } else {
            if (!(a5qVar instanceof y4q)) {
                b6e.s();
                return false;
            }
            s9p h02 = hdg.h0(a5qVar);
            h02.getClass();
            vuu b2 = cvuVar.b();
            if (b2 != null) {
                l = wxf.l(b2, h02);
            }
            l = false;
        }
        vuu b3 = cvuVar.b();
        return (b3 != null ? (plj) b3.g.c : null) == plj.c && l;
    }

    public static final boolean b(hxu hxuVar, q4q q4qVar) {
        cvu cvuVar = hxuVar.h;
        vuu b = cvuVar.b();
        if (b != null ? b.a : false) {
            s9p s9pVar = q4qVar.getId().a;
            s9pVar.getClass();
            vuu b2 = cvuVar.b();
            if (b2 != null ? wxf.m(b2, s9pVar) : false) {
                eu7 eu7Var = hxuVar.a;
                eu7Var.getClass();
                if (eu7Var.a.f - eu7Var.b.a <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r6.o(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(hxu hxuVar, qxu qxuVar, Function1 function1, cg6 cg6Var) {
        vwu vwuVar;
        Object obj;
        nm6 nm6Var;
        int i;
        Function1 function12;
        qxu qxuVar2;
        qxu qxuVar3;
        if (cg6Var instanceof vwu) {
            vwuVar = (vwu) cg6Var;
            int i2 = vwuVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vwuVar.n = i2 - Integer.MIN_VALUE;
                obj = vwuVar.l;
                nm6Var = nm6.a;
                i = vwuVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    jzi jziVar = hxuVar.c;
                    vwuVar.j = qxuVar;
                    vwuVar.k = (aur) function1;
                    vwuVar.n = 1;
                    function12 = function1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qxuVar2 = vwuVar.j;
                        qgg.h0(obj);
                        qxuVar3 = (qxu) obj;
                        if (!(qxuVar3 instanceof pxu) || (qxuVar3 instanceof oxu)) {
                            ssg.a(3, "WaveProlongationOperation", "GetProlongationResult: online prolongation completed after offline, take online result", null);
                            return qxuVar3;
                        }
                        if (qxuVar3 instanceof nxu) {
                            dfi.r("GetProlongationResult: local prolongation completed after offline, this is an unreachable state", "WaveProlongationOperation");
                            return qxuVar3;
                        }
                        if (qxuVar3 instanceof mxu) {
                            ssg.a(3, "WaveProlongationOperation", "GetProlongationResult: online prolongation failed after offline, keeping offline result", null);
                            return new kxu(((mxu) qxuVar3).a(), qxuVar2);
                        }
                        b6e.s();
                        return null;
                    }
                    Function1 function13 = (Function1) vwuVar.k;
                    qxuVar = vwuVar.j;
                    qgg.h0(obj);
                    function12 = function13;
                }
                vwuVar.j = qxuVar;
                vwuVar.k = null;
                vwuVar.n = 2;
                obj = function12.invoke(vwuVar);
                if (obj != nm6Var) {
                    qxuVar2 = qxuVar;
                    qxuVar3 = (qxu) obj;
                    if (qxuVar3 instanceof pxu) {
                    }
                    ssg.a(3, "WaveProlongationOperation", "GetProlongationResult: online prolongation completed after offline, take online result", null);
                    return qxuVar3;
                }
                return nm6Var;
            }
        }
        vwuVar = new vwu(hxuVar, cg6Var);
        obj = vwuVar.l;
        nm6Var = nm6.a;
        i = vwuVar.n;
        if (i != 0) {
        }
        vwuVar.j = qxuVar;
        vwuVar.k = null;
        vwuVar.n = 2;
        obj = function12.invoke(vwuVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(hxu hxuVar, s4q s4qVar, cg6 cg6Var) {
        bxu bxuVar;
        int i;
        b5v b5vVar;
        if (cg6Var instanceof bxu) {
            bxuVar = (bxu) cg6Var;
            int i2 = bxuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bxuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bxuVar.j;
                Object obj2 = nm6.a;
                i = bxuVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "WaveProlongationOperation", "Perform migration from offline to online session", null);
                    eu7 eu7Var = hxuVar.a;
                    bxuVar.l = 1;
                    obj = hxuVar.j(eu7Var, s4qVar, bxuVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                b5vVar = (b5v) obj;
                if (b5vVar instanceof a5v) {
                    if (b5vVar instanceof z4v) {
                        return new jxu(((z4v) b5vVar).a);
                    }
                    b6e.s();
                    return null;
                }
                cvu cvuVar = hxuVar.h;
                a5v a5vVar = (a5v) b5vVar;
                tfo tfoVar = a5vVar.a;
                q4q q4qVar = a5vVar.b;
                cvuVar.j(q4qVar.getId().b, tfoVar.d);
                return new pxu(tfoVar, q4qVar, false);
            }
        }
        bxuVar = new bxu(hxuVar, cg6Var);
        Object obj3 = bxuVar.j;
        Object obj22 = nm6.a;
        i = bxuVar.l;
        if (i != 0) {
        }
        b5vVar = (b5v) obj3;
        if (b5vVar instanceof a5v) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(hxu hxuVar, eu7 eu7Var, a5q a5qVar, cg6 cg6Var) {
        cxu cxuVar;
        int i;
        ulj uljVar;
        pfn pfnVar;
        gxc gxcVar;
        s4v s4vVar;
        String str;
        String str2;
        s9p s9pVar;
        d9b d9bVar;
        cvu cvuVar = hxuVar.h;
        if (cg6Var instanceof cxu) {
            cxuVar = (cxu) cg6Var;
            int i2 = cxuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cxuVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cxuVar.k;
                nm6 nm6Var = nm6.a;
                i = cxuVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    vnu id = a5qVar.getId();
                    cxuVar.j = a5qVar;
                    cxuVar.m = 1;
                    obj = cvuVar.e(eu7Var, id, cxuVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a5qVar = cxuVar.j;
                    qgg.h0(obj);
                }
                uljVar = (ulj) obj;
                if (uljVar instanceof tlj) {
                    if (!(uljVar instanceof slj)) {
                        b6e.s();
                        return null;
                    }
                    ouu a = cvuVar.a();
                    slj sljVar = (slj) uljVar;
                    a.getClass();
                    a.b(sljVar.a, sljVar.c, sljVar.b, sljVar.d, sljVar.e);
                    return new lxu(new OfflineSessionCreationException(null, null));
                }
                f5v f5vVar = hxuVar.e;
                tlj tljVar = (tlj) uljVar;
                String str3 = tljVar.b;
                String str4 = tljVar.c;
                List list = tljVar.d;
                a5qVar.getClass();
                str3.getClass();
                str4.getClass();
                list.getClass();
                boolean z = a5qVar instanceof w4q;
                if (z) {
                    pfnVar = ((w4q) a5qVar).b.a;
                } else {
                    if (!(a5qVar instanceof y4q)) {
                        b6e.s();
                        return null;
                    }
                    pfnVar = ((y4q) a5qVar).b.a;
                }
                if (z) {
                    gxcVar = ((w4q) a5qVar).b.c;
                } else {
                    if (!(a5qVar instanceof y4q)) {
                        b6e.s();
                        return null;
                    }
                    gxcVar = ((y4q) a5qVar).b.b;
                }
                bou bouVar = (bou) f5vVar.b.getValue();
                yku a2 = bouVar != null ? bouVar.a() : null;
                if (z) {
                    s4vVar = ((w4q) a5qVar).c;
                } else {
                    if (!(a5qVar instanceof y4q)) {
                        b6e.s();
                        return null;
                    }
                    if (a2 == null || (str = a2.c) == null) {
                        str = "";
                    }
                    s4vVar = new s4v(str, a2 != null ? a2.d : null);
                }
                if (a2 == null || (str2 = a2.b) == null) {
                    str2 = "user-onyourwave";
                }
                r4q r4qVar = new r4q(pfnVar, str2, gxcVar);
                vnu id2 = a5qVar.getId();
                if (id2 instanceof wnu) {
                    s9pVar = new s9p(t75.c(r9p.a));
                } else if (id2 instanceof tnu) {
                    s9pVar = ((tnu) id2).a;
                } else {
                    if (!(id2 instanceof unu)) {
                        b6e.s();
                        return null;
                    }
                    s9pVar = ((unu) id2).a;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new zfo((mqs) it.next(), bzs.e));
                }
                tfo tfoVar = new tfo(str4, null, arrayList, null);
                s4q s4qVar = new s4q(new tnu(s9pVar, str3), r4qVar, s4vVar);
                if (z) {
                    d9bVar = d9b.d;
                } else {
                    if (!(a5qVar instanceof y4q)) {
                        b6e.s();
                        return null;
                    }
                    d9bVar = d9b.c;
                }
                cvuVar.a().a(tljVar, d9bVar);
                return new pxu(tfoVar, s4qVar, true);
            }
        }
        cxuVar = new cxu(hxuVar, cg6Var);
        Object obj2 = cxuVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cxuVar.m;
        if (i != 0) {
        }
        uljVar = (ulj) obj2;
        if (uljVar instanceof tlj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(hxu hxuVar, eu7 eu7Var, v4v v4vVar, cg6 cg6Var) {
        dxu dxuVar;
        int i;
        hxu hxuVar2;
        b5v b5vVar;
        if (cg6Var instanceof dxu) {
            dxuVar = (dxu) cg6Var;
            int i2 = dxuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dxuVar.l = i2 - Integer.MIN_VALUE;
                dxu dxuVar2 = dxuVar;
                Object obj = dxuVar2.j;
                nm6 nm6Var = nm6.a;
                i = dxuVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pfn o = hxuVar.o();
                    gxc i3 = hxuVar.i();
                    dxuVar2.l = 1;
                    hxuVar2 = hxuVar;
                    obj = hxuVar2.k(eu7Var, v4vVar, o, i3, false, dxuVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    hxuVar2 = hxuVar;
                }
                b5vVar = (b5v) obj;
                if (b5vVar instanceof a5v) {
                    if (b5vVar instanceof z4v) {
                        return new jxu(((z4v) b5vVar).a);
                    }
                    b6e.s();
                    return null;
                }
                cvu cvuVar = hxuVar2.h;
                a5v a5vVar = (a5v) b5vVar;
                tfo tfoVar = a5vVar.a;
                q4q q4qVar = a5vVar.b;
                cvuVar.j(q4qVar.getId().b, tfoVar.d);
                return new pxu(tfoVar, q4qVar, false);
            }
        }
        dxuVar = new dxu(hxuVar, cg6Var);
        dxu dxuVar22 = dxuVar;
        Object obj2 = dxuVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = dxuVar22.l;
        if (i != 0) {
        }
        b5vVar = (b5v) obj2;
        if (b5vVar instanceof a5v) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x005c, code lost:
    
        if (r13 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a A[LOOP:0: B:37:0x0074->B:39:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(hxu hxuVar, u4q u4qVar, cg6 cg6Var) {
        fxu fxuVar;
        Object obj;
        int i;
        Iterator it;
        Object l;
        u4q u4qVar2;
        List list;
        vxu vxuVar;
        vxu vxuVar2;
        rdg rdgVar = hxuVar.k;
        if (cg6Var instanceof fxu) {
            fxuVar = (fxu) cg6Var;
            int i2 = fxuVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fxuVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = fxuVar.m;
                obj = nm6.a;
                i = fxuVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    mmo mmoVar = hxuVar.f;
                    String str = u4qVar.a.b;
                    fxuVar.j = u4qVar;
                    fxuVar.o = 1;
                    obj2 = mmoVar.d0(str, rdgVar, fxuVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vxuVar2 = fxuVar.l;
                            qgg.h0(obj2);
                            if (rdgVar != null) {
                                rdgVar.c.a();
                            }
                            return new oxu(((uxu) vxuVar2).a, rdgVar, ixu.a);
                        }
                        List list2 = fxuVar.k;
                        u4q u4qVar3 = fxuVar.j;
                        qgg.h0(obj2);
                        list = list2;
                        u4qVar2 = u4qVar3;
                        vxuVar = (vxu) obj2;
                        if (rdgVar != null) {
                            rdgVar.l = rdgVar.c.a();
                        }
                        if (vxuVar instanceof uxu) {
                            if (vxuVar instanceof txu) {
                                return p((txu) vxuVar);
                            }
                            b6e.s();
                            return null;
                        }
                        l8j l8jVar = l8j.c;
                        h0t h0tVar = new h0t(hxuVar, u4qVar2, list, null, 15);
                        fxuVar.j = null;
                        fxuVar.k = null;
                        fxuVar.l = (uxu) vxuVar;
                        fxuVar.o = 3;
                        if (x97.V(l8jVar, h0tVar, fxuVar) != obj) {
                            vxuVar2 = vxuVar;
                            if (rdgVar != null) {
                            }
                            return new oxu(((uxu) vxuVar2).a, rdgVar, ixu.a);
                        }
                        return obj;
                    }
                    u4qVar = fxuVar.j;
                    qgg.h0(obj2);
                }
                List list3 = (List) obj2;
                List list4 = list3;
                ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bpu) it.next()).b);
                }
                if (rdgVar != null) {
                    rdgVar.k = rdgVar.c.a();
                }
                eu7 eu7Var = hxuVar.a;
                fxuVar.j = u4qVar;
                fxuVar.k = list3;
                fxuVar.o = 2;
                l = hxuVar.l(eu7Var, u4qVar, arrayList, fxuVar);
                if (l != obj) {
                    u4qVar2 = u4qVar;
                    list = list3;
                    obj2 = l;
                    vxuVar = (vxu) obj2;
                    if (rdgVar != null) {
                    }
                    if (vxuVar instanceof uxu) {
                    }
                }
                return obj;
            }
        }
        fxuVar = new fxu(hxuVar, cg6Var);
        Object obj22 = fxuVar.m;
        obj = nm6.a;
        i = fxuVar.o;
        if (i != 0) {
        }
        List list32 = (List) obj22;
        List list42 = list32;
        ArrayList arrayList2 = new ArrayList(v75.o(list42, 10));
        it = list42.iterator();
        while (it.hasNext()) {
        }
        if (rdgVar != null) {
        }
        eu7 eu7Var2 = hxuVar.a;
        fxuVar.j = u4qVar;
        fxuVar.k = list32;
        fxuVar.o = 2;
        l = hxuVar.l(eu7Var2, u4qVar, arrayList2, fxuVar);
        if (l != obj) {
        }
        return obj;
    }

    public static final v4v h(hxu hxuVar, a5q a5qVar) {
        if (a5qVar instanceof w4q) {
            return new t4v(((w4q) a5qVar).a.b);
        }
        if (a5qVar instanceof y4q) {
            return new u4v(((y4q) a5qVar).a.e(), hxuVar.i);
        }
        b6e.s();
        return null;
    }

    public static mxu p(txu txuVar) {
        if (txuVar instanceof rxu) {
            return new jxu(((rxu) txuVar).a);
        }
        if (txuVar instanceof sxu) {
            return new lxu(((sxu) txuVar).a);
        }
        b6e.s();
        return null;
    }

    public final gxc i() {
        e5q e5qVar = this.b;
        if (e5qVar instanceof w4q) {
            return ((w4q) e5qVar).b.c;
        }
        if (e5qVar instanceof d5q) {
            return ((d5q) e5qVar).b().b;
        }
        if (e5qVar instanceof s4q) {
            return ((s4q) e5qVar).b.c;
        }
        if (e5qVar instanceof u4q) {
            return ((u4q) e5qVar).b.c;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(eu7 eu7Var, s4q s4qVar, cg6 cg6Var) {
        ywu ywuVar;
        Object obj;
        nm6 nm6Var;
        int i;
        pfn pfnVar;
        eu7 eu7Var2;
        gxc gxcVar;
        List list;
        b5v b5vVar;
        s4q s4qVar2 = s4qVar;
        if (cg6Var instanceof ywu) {
            ywuVar = (ywu) cg6Var;
            int i2 = ywuVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ywuVar.r = i2 - Integer.MIN_VALUE;
                ywu ywuVar2 = ywuVar;
                obj = ywuVar2.p;
                nm6Var = nm6.a;
                i = ywuVar2.r;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (s4qVar2 == null) {
                        b6e.s();
                        return null;
                    }
                    pfnVar = s4qVar2.b.a;
                    if (s4qVar2 == null) {
                        b6e.s();
                        return null;
                    }
                    gxc gxcVar2 = s4qVar2.b.c;
                    eu7Var2 = eu7Var;
                    ywuVar2.j = eu7Var2;
                    ywuVar2.k = s4qVar2;
                    ywuVar2.l = pfnVar;
                    ywuVar2.m = gxcVar2;
                    ywuVar2.r = 1;
                    Object c0 = this.f.c0(this.k, ywuVar2);
                    if (c0 != nm6Var) {
                        gxcVar = gxcVar2;
                        obj = c0;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a5v a5vVar = ywuVar2.o;
                        List list2 = ywuVar2.n;
                        qgg.h0(obj);
                        return a5vVar;
                    }
                    list = ywuVar2.n;
                    qgg.h0(obj);
                    b5vVar = (b5v) obj;
                    if (b5vVar instanceof a5v) {
                        if (b5vVar instanceof z4v) {
                            return b5vVar;
                        }
                        b6e.s();
                        return null;
                    }
                    l8j l8jVar = l8j.c;
                    xwu xwuVar = new xwu(this, list, continuation, 1);
                    ywuVar2.j = null;
                    ywuVar2.k = null;
                    ywuVar2.l = null;
                    ywuVar2.m = null;
                    ywuVar2.n = null;
                    ywuVar2.o = (a5v) b5vVar;
                    ywuVar2.r = 3;
                    return x97.V(l8jVar, xwuVar, ywuVar2) == nm6Var ? nm6Var : b5vVar;
                }
                gxc gxcVar3 = ywuVar2.m;
                pfnVar = ywuVar2.l;
                s4q s4qVar3 = ywuVar2.k;
                eu7Var2 = ywuVar2.j;
                qgg.h0(obj);
                gxcVar = gxcVar3;
                s4qVar2 = s4qVar3;
                eu7 eu7Var3 = eu7Var2;
                pfn pfnVar2 = pfnVar;
                List list3 = (List) obj;
                u4v u4vVar = new u4v(s4qVar2.getId().a, this.i);
                ywuVar2.j = null;
                ywuVar2.k = null;
                ywuVar2.l = null;
                ywuVar2.m = null;
                ywuVar2.n = list3;
                ywuVar2.r = 2;
                obj = this.e.a(u4vVar, eu7Var3, pfnVar2, gxcVar, true, this.j, false, list3, ywuVar2);
                if (obj != nm6Var) {
                    list = list3;
                    b5vVar = (b5v) obj;
                    if (b5vVar instanceof a5v) {
                    }
                }
            }
        }
        ywuVar = new ywu(this, cg6Var);
        ywu ywuVar22 = ywuVar;
        obj = ywuVar22.p;
        nm6Var = nm6.a;
        i = ywuVar22.r;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        eu7 eu7Var32 = eu7Var2;
        pfn pfnVar22 = pfnVar;
        List list32 = (List) obj;
        u4v u4vVar2 = new u4v(s4qVar2.getId().a, this.i);
        ywuVar22.j = null;
        ywuVar22.k = null;
        ywuVar22.l = null;
        ywuVar22.m = null;
        ywuVar22.n = list32;
        ywuVar22.r = 2;
        obj = this.e.a(u4vVar2, eu7Var32, pfnVar22, gxcVar, true, this.j, false, list32, ywuVar22);
        if (obj != nm6Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(eu7 eu7Var, v4v v4vVar, pfn pfnVar, gxc gxcVar, boolean z, cg6 cg6Var) {
        wwu wwuVar;
        Object obj;
        nm6 nm6Var;
        int i;
        v4v v4vVar2;
        eu7 eu7Var2;
        Object obj2;
        boolean z2;
        gxc gxcVar2;
        pfn pfnVar2;
        boolean z3;
        List list;
        b5v b5vVar;
        if (cg6Var instanceof wwu) {
            wwuVar = (wwu) cg6Var;
            int i2 = wwuVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wwuVar.s = i2 - Integer.MIN_VALUE;
                wwu wwuVar2 = wwuVar;
                obj = wwuVar2.q;
                nm6Var = nm6.a;
                i = wwuVar2.s;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    wwuVar2.j = eu7Var;
                    v4vVar2 = v4vVar;
                    wwuVar2.k = v4vVar2;
                    wwuVar2.l = pfnVar;
                    wwuVar2.m = gxcVar;
                    wwuVar2.p = z;
                    wwuVar2.s = 1;
                    Object c0 = this.f.c0(this.k, wwuVar2);
                    if (c0 != nm6Var) {
                        eu7Var2 = eu7Var;
                        obj2 = c0;
                        z2 = z;
                        gxcVar2 = gxcVar;
                        pfnVar2 = pfnVar;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a5v a5vVar = wwuVar2.o;
                        List list2 = wwuVar2.n;
                        qgg.h0(obj);
                        return a5vVar;
                    }
                    z3 = wwuVar2.p;
                    list = wwuVar2.n;
                    qgg.h0(obj);
                    b5vVar = (b5v) obj;
                    if (b5vVar instanceof a5v) {
                        if (b5vVar instanceof z4v) {
                            return b5vVar;
                        }
                        b6e.s();
                        return null;
                    }
                    l8j l8jVar = l8j.c;
                    xwu xwuVar = new xwu(this, list, continuation, 0);
                    wwuVar2.j = null;
                    wwuVar2.k = null;
                    wwuVar2.l = null;
                    wwuVar2.m = null;
                    wwuVar2.n = null;
                    wwuVar2.o = (a5v) b5vVar;
                    wwuVar2.p = z3;
                    wwuVar2.s = 3;
                    return x97.V(l8jVar, xwuVar, wwuVar2) == nm6Var ? nm6Var : b5vVar;
                }
                boolean z4 = wwuVar2.p;
                gxc gxcVar3 = wwuVar2.m;
                pfn pfnVar3 = wwuVar2.l;
                v4v v4vVar3 = wwuVar2.k;
                eu7 eu7Var3 = wwuVar2.j;
                qgg.h0(obj);
                z2 = z4;
                obj2 = obj;
                v4vVar2 = v4vVar3;
                pfnVar2 = pfnVar3;
                eu7Var2 = eu7Var3;
                gxcVar2 = gxcVar3;
                List list3 = (List) obj2;
                wwuVar2.j = null;
                wwuVar2.k = null;
                wwuVar2.l = null;
                wwuVar2.m = null;
                wwuVar2.n = list3;
                wwuVar2.p = z2;
                wwuVar2.s = 2;
                obj = this.e.a(v4vVar2, eu7Var2, pfnVar2, gxcVar2, true, this.j, z2, list3, wwuVar2);
                if (obj != nm6Var) {
                    z3 = z2;
                    list = list3;
                    b5vVar = (b5v) obj;
                    if (b5vVar instanceof a5v) {
                    }
                }
            }
        }
        wwuVar = new wwu(this, cg6Var);
        wwu wwuVar22 = wwuVar;
        obj = wwuVar22.q;
        nm6Var = nm6.a;
        i = wwuVar22.s;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        List list32 = (List) obj2;
        wwuVar22.j = null;
        wwuVar22.k = null;
        wwuVar22.l = null;
        wwuVar22.m = null;
        wwuVar22.n = list32;
        wwuVar22.p = z2;
        wwuVar22.s = 2;
        obj = this.e.a(v4vVar2, eu7Var2, pfnVar2, gxcVar2, true, this.j, z2, list32, wwuVar22);
        if (obj != nm6Var) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(eu7 eu7Var, u4q u4qVar, ArrayList arrayList, cg6 cg6Var) {
        zwu zwuVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof zwu) {
            zwuVar = (zwu) cg6Var;
            int i2 = zwuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zwuVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zwuVar.k;
                nm6 nm6Var = nm6.a;
                i = zwuVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = u4qVar.a.b;
                    List O = e3s.O(eu7Var);
                    zwuVar.j = u4qVar;
                    zwuVar.m = 1;
                    obj = this.d.E(str, O, arrayList, zwuVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u4qVar = zwuVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return new rxu((pj6) rj6Var);
                    }
                    b6e.s();
                    return null;
                }
                String str2 = u4qVar.a.b;
                bgo bgoVar = (bgo) ((qj6) rj6Var).a;
                this.h.j(str2, bgoVar.a.d);
                return new uxu(bgoVar.a);
            }
        }
        zwuVar = new zwu(this, cg6Var);
        Object obj2 = zwuVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zwuVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(tnu tnuVar, boolean z, cg6 cg6Var) {
        axu axuVar;
        int i;
        boolean z2;
        tfo tfoVar;
        if (cg6Var instanceof axu) {
            axuVar = (axu) cg6Var;
            int i2 = axuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                axuVar.m = i2 - Integer.MIN_VALUE;
                Object obj = axuVar.k;
                nm6 nm6Var = nm6.a;
                i = axuVar.m;
                cvu cvuVar = this.h;
                if (i != 0) {
                    qgg.h0(obj);
                    axuVar.j = z;
                    axuVar.m = 1;
                    obj = cvuVar.g(this.a, tnuVar, axuVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = axuVar.j;
                    qgg.h0(obj);
                }
                ylj yljVar = (ylj) obj;
                z2 = yljVar instanceof tlj;
                bzs bzsVar = bzs.e;
                if (!z2) {
                    tlj tljVar = (tlj) yljVar;
                    cvuVar.a().a(tljVar, z ? d9b.b : d9b.a);
                    String str = tljVar.c;
                    List list = tljVar.d;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new zfo((mqs) it.next(), bzsVar));
                    }
                    tfoVar = new tfo(str, null, arrayList, null);
                } else {
                    if (!(yljVar instanceof wlj)) {
                        if (yljVar instanceof slj) {
                            ouu a = cvuVar.a();
                            slj sljVar = (slj) yljVar;
                            a.getClass();
                            a.b(sljVar.a, sljVar.c, sljVar.b, sljVar.d, sljVar.e);
                            return new sxu(new OfflineProlongationException("Offline tracks not found!"));
                        }
                        if (!(yljVar instanceof vlj)) {
                            b6e.s();
                            return null;
                        }
                        ouu a2 = cvuVar.a();
                        vlj vljVar = (vlj) yljVar;
                        a2.getClass();
                        a2.b(vljVar.a, vljVar.c, vljVar.b, vljVar.d, vljVar.e);
                        return new sxu(new OfflineProlongationException("Offline track not found!"));
                    }
                    ouu a3 = cvuVar.a();
                    wlj wljVar = (wlj) yljVar;
                    mqs mqsVar = wljVar.c;
                    String str2 = wljVar.b;
                    a3.getClass();
                    pv9 pv9Var = a3.a;
                    f9h f9hVar = new f9h();
                    f9hVar.put("batchId", str2);
                    f9hVar.put("track", mqsVar.a);
                    olj oljVar = wljVar.a;
                    f9hVar.put("programVersion", oljVar.a);
                    f9hVar.put("programUpdateDate", oljVar.b);
                    f9hVar.put("programSize", Integer.valueOf(oljVar.e));
                    f9hVar.put("programStateSize", Integer.valueOf(oljVar.f));
                    f9hVar.put("availableTrackCount", Integer.valueOf(oljVar.c));
                    f9hVar.put("telemetry", wljVar.d);
                    ((it0) pv9Var.b).a("OFFLINEWAVE_NEXTTRACK", f9hVar.b());
                    tfoVar = new tfo(str2, null, t75.c(new zfo(mqsVar, bzsVar)), null);
                }
                return new uxu(tfoVar);
            }
        }
        axuVar = new axu(this, cg6Var);
        Object obj2 = axuVar.k;
        nm6 nm6Var2 = nm6.a;
        i = axuVar.m;
        cvu cvuVar2 = this.h;
        if (i != 0) {
        }
        ylj yljVar2 = (ylj) obj2;
        z2 = yljVar2 instanceof tlj;
        bzs bzsVar2 = bzs.e;
        if (!z2) {
        }
        return new uxu(tfoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(q4q q4qVar, boolean z, cg6 cg6Var) {
        exu exuVar;
        int i;
        vxu vxuVar;
        if (cg6Var instanceof exu) {
            exuVar = (exu) cg6Var;
            int i2 = exuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exuVar.m = i2 - Integer.MIN_VALUE;
                Object obj = exuVar.k;
                Object obj2 = nm6.a;
                i = exuVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tnu id = q4qVar.getId();
                    exuVar.j = z;
                    exuVar.m = 1;
                    obj = m(id, z, exuVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = exuVar.j;
                    qgg.h0(obj);
                }
                vxuVar = (vxu) obj;
                if (!(vxuVar instanceof uxu)) {
                    return new oxu(((uxu) vxuVar).a, null, z ? ixu.c : ixu.b);
                }
                if (vxuVar instanceof txu) {
                    return p((txu) vxuVar);
                }
                b6e.s();
                return null;
            }
        }
        exuVar = new exu(this, cg6Var);
        Object obj3 = exuVar.k;
        Object obj22 = nm6.a;
        i = exuVar.m;
        if (i != 0) {
        }
        vxuVar = (vxu) obj3;
        if (!(vxuVar instanceof uxu)) {
        }
    }

    public final pfn o() {
        e5q e5qVar = this.b;
        if (e5qVar instanceof w4q) {
            return ((w4q) e5qVar).b.a;
        }
        if (e5qVar instanceof d5q) {
            return ((d5q) e5qVar).b().a;
        }
        if (e5qVar instanceof s4q) {
            return ((s4q) e5qVar).b.a;
        }
        if (e5qVar instanceof u4q) {
            return ((u4q) e5qVar).b.a;
        }
        b6e.s();
        return null;
    }
}
