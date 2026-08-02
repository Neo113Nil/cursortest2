package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class au7 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public au7(Context context) {
        this.b = new HashSet();
        this.c = new HashSet();
        this.f = new xy0(0);
        this.h = new xy0(0);
        this.a = -1;
        this.l = pmd.e;
        this.m = wxw.a;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.g = context;
        this.k = context.getMainLooper();
        this.d = context.getPackageName();
        this.e = context.getClass().getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(au7 au7Var, mwu mwuVar, mwu mwuVar2, v5j v5jVar, Continuation continuation) {
        rt7 rt7Var;
        int i;
        mwu mwuVar3;
        boolean z;
        jzs jzsVar;
        sfo j;
        eu7 eu7Var;
        jzs jzsVar2;
        atn atnVar;
        cu7 cu7Var;
        izs izsVar;
        Iterator it;
        int i2;
        Integer valueOf;
        mmo mmoVar = (mmo) au7Var.c;
        if (continuation instanceof rt7) {
            rt7Var = (rt7) continuation;
            int i3 = rt7Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rt7Var.m = i3 - Integer.MIN_VALUE;
                Object obj = rt7Var.k;
                nm6 nm6Var = nm6.a;
                i = rt7Var.m;
                boolean z2 = true;
                if (i != 0) {
                    qgg.h0(obj);
                    if (((tvu) au7Var.f).a) {
                        return Boolean.FALSE;
                    }
                    if (mwuVar != null && (mwuVar instanceof fwu)) {
                        fwu fwuVar = (fwu) mwuVar;
                        eu7 eu7Var2 = fwuVar.a.a;
                        if (eu7Var2.b.c && (j = j((jzsVar = (jzs) eu7Var2.b()), k(fwuVar.b.getId()))) != null) {
                            rt7Var.j = mwuVar2;
                            rt7Var.m = 1;
                            if (mmoVar.y0(j, jzsVar, v5jVar, rt7Var) == nm6Var) {
                                return nm6Var;
                            }
                            mwuVar3 = mwuVar2;
                        }
                    }
                    mwuVar3 = mwuVar2;
                    z = false;
                    if (mwuVar3 != null && (mwuVar3 instanceof fwu)) {
                        eu7 eu7Var3 = ((fwu) mwuVar3).a.a;
                        jzsVar2 = (jzs) eu7Var3.b();
                        atnVar = (atn) au7Var.k;
                        cu7Var = eu7Var3.a;
                        jzsVar2.getClass();
                        cu7Var.getClass();
                        izsVar = jzsVar2.g;
                        String str = jzsVar2.i;
                        if ((izsVar instanceof d6v) && ((LinkedHashSet) atnVar.c).add(new rwk(str))) {
                            String str2 = jzsVar2.a.a;
                            List list = (List) cu7Var.d.getValue();
                            int max = Math.max(0, list.size() - 100);
                            it = CollectionsKt.L(list, max).iterator();
                            i2 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                Object next = it.next();
                                if (i2 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                jzs jzsVar3 = (jzs) next;
                                if (!Intrinsics.d(jzsVar3.i, str) && Intrinsics.d(jzsVar3.a.a, str2)) {
                                    break;
                                }
                                i2++;
                            }
                            Integer valueOf2 = Integer.valueOf(i2);
                            if (i2 == -1) {
                                valueOf2 = null;
                            }
                            valueOf = valueOf2 == null ? Integer.valueOf(valueOf2.intValue() + max) : null;
                            if (valueOf != null) {
                                ssg.a(7, "WaveTrackVisitAnalytics", hrg.r("Duplicate found in wave queue: new element = (", p6g.m(jzsVar2, list.size() - 1), ", duplicate = (", p6g.m((jzs) list.get(valueOf.intValue()), valueOf.intValue())), null);
                            }
                            pv9 pv9Var = (pv9) atnVar.b;
                            f9h f9hVar = new f9h();
                            f9hVar.put("isDuplicated", Boolean.valueOf(valueOf == null));
                            f9h b = f9hVar.b();
                            pv9Var.getClass();
                            it0.b.e().c(new y70("FIRST_WAVE_TRACK_VISIT", b), "Wave");
                        }
                    }
                    if (mwuVar3 != null && (mwuVar3 instanceof fwu)) {
                        fwu fwuVar2 = (fwu) mwuVar3;
                        eu7Var = fwuVar2.a.a;
                        if (eu7Var.b.c) {
                            jzs jzsVar4 = (jzs) eu7Var.b();
                            sfo j2 = j(jzsVar4, k(fwuVar2.b.getId()));
                            mqs mqsVar = jzsVar4.a;
                            if (j2 != null) {
                                v3w.l("Reporting track start for trackFullId=", mqsVar.d().e(), 3, "WaveFeedbackOwner", null);
                                mmoVar.D0(x97.p((tf6) mmoVar.f, null, null, new nr3(mmoVar, (Continuation) null, mmoVar, j2, new p1t(new Date(System.currentTimeMillis()), jzsVar4.b.a, mqsVar.d(), mmoVar.e0(jzsVar4)), 4), 3));
                                return Boolean.valueOf(z2);
                            }
                        }
                    }
                    z2 = z;
                    return Boolean.valueOf(z2);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mwuVar3 = rt7Var.j;
                qgg.h0(obj);
                z = true;
                if (mwuVar3 != null) {
                    eu7 eu7Var32 = ((fwu) mwuVar3).a.a;
                    jzsVar2 = (jzs) eu7Var32.b();
                    atnVar = (atn) au7Var.k;
                    cu7Var = eu7Var32.a;
                    jzsVar2.getClass();
                    cu7Var.getClass();
                    izsVar = jzsVar2.g;
                    String str3 = jzsVar2.i;
                    if (izsVar instanceof d6v) {
                        String str22 = jzsVar2.a.a;
                        List list2 = (List) cu7Var.d.getValue();
                        int max2 = Math.max(0, list2.size() - 100);
                        it = CollectionsKt.L(list2, max2).iterator();
                        i2 = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i2++;
                        }
                        Integer valueOf22 = Integer.valueOf(i2);
                        if (i2 == -1) {
                        }
                        if (valueOf22 == null) {
                        }
                        if (valueOf != null) {
                        }
                        pv9 pv9Var2 = (pv9) atnVar.b;
                        f9h f9hVar2 = new f9h();
                        f9hVar2.put("isDuplicated", Boolean.valueOf(valueOf == null));
                        f9h b2 = f9hVar2.b();
                        pv9Var2.getClass();
                        it0.b.e().c(new y70("FIRST_WAVE_TRACK_VISIT", b2), "Wave");
                    }
                }
                if (mwuVar3 != null) {
                    fwu fwuVar22 = (fwu) mwuVar3;
                    eu7Var = fwuVar22.a.a;
                    if (eu7Var.b.c) {
                    }
                }
                z2 = z;
                return Boolean.valueOf(z2);
            }
        }
        rt7Var = new rt7(au7Var, continuation);
        Object obj2 = rt7Var.k;
        nm6 nm6Var2 = nm6.a;
        i = rt7Var.m;
        boolean z22 = true;
        if (i != 0) {
        }
        z = true;
        if (mwuVar3 != null) {
        }
        if (mwuVar3 != null) {
        }
        z22 = z;
        return Boolean.valueOf(z22);
    }

    public static final xvu b(au7 au7Var, fwu fwuVar, v5j v5jVar, rdg rdgVar) {
        e5q e5qVar = fwuVar.b;
        tyu tyuVar = fwuVar.a;
        v5j v5jVar2 = v5j.a;
        eu7 eu7Var = (v5jVar == v5jVar2 || v5jVar == v5j.d || v5jVar == v5j.b) ? (eu7) tyuVar.f.getValue() : (eu7) tyuVar.g.getValue();
        if (eu7Var != null) {
            return (v5jVar == v5jVar2 || v5jVar == v5j.d || v5jVar == v5j.b) ? au7Var.f(eu7Var, tyuVar.b, e5qVar, false, m(v5jVar)) : au7Var.f(i4w.x(eu7Var, 0), tyuVar.b, e5qVar, true, m(v5jVar));
        }
        rdgVar.m = true;
        eu7 eu7Var2 = tyuVar.a;
        eu7Var2.getClass();
        int size = eu7Var2.a.a.getElements().size();
        eu7Var2.b.getClass();
        eu7 a = eu7.a(eu7Var2, null, new du7(size, size), 1);
        gyn gynVar = tyuVar.b;
        b3l m = m(v5jVar);
        if (((tvu) au7Var.f).a) {
            return null;
        }
        return au7Var.e(a, gynVar, e5qVar, m, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(au7 au7Var, boolean z, fwu fwuVar, int i, cg6 cg6Var) {
        ut7 ut7Var;
        int i2;
        if (cg6Var instanceof ut7) {
            ut7Var = (ut7) cg6Var;
            int i3 = ut7Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ut7Var.n = i3 - Integer.MIN_VALUE;
                Object obj = ut7Var.l;
                nm6 nm6Var = nm6.a;
                i2 = ut7Var.n;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (z) {
                        jac jacVar = (jac) au7Var.b;
                        ut7Var.j = fwuVar;
                        ut7Var.k = i;
                        ut7Var.n = 1;
                        if (jacVar.c(ut7Var) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = ut7Var.k;
                    fwuVar = ut7Var.j;
                    qgg.h0(obj);
                }
                tyu tyuVar = fwuVar.a;
                eu7 eu7Var = tyuVar.a;
                g(au7Var, tyuVar.a, fwuVar.b, false, null, null, null, 124);
                int c = eu7Var.c();
                return c != i ? qvu.a : new rvu(c, eu7Var.a.c(c));
            }
        }
        ut7Var = new ut7(au7Var, cg6Var);
        Object obj2 = ut7Var.l;
        nm6 nm6Var2 = nm6.a;
        i2 = ut7Var.n;
        if (i2 != 0) {
        }
        tyu tyuVar2 = fwuVar.a;
        eu7 eu7Var2 = tyuVar2.a;
        g(au7Var, tyuVar2.a, fwuVar.b, false, null, null, null, 124);
        int c2 = eu7Var2.c();
        if (c2 != i) {
        }
    }

    public static void g(au7 au7Var, eu7 eu7Var, e5q e5qVar, boolean z, rr5 rr5Var, rdg rdgVar, s9p s9pVar, int i) {
        boolean z2 = (i & 4) != 0 ? false : z;
        rr5 rr5Var2 = (i & 8) != 0 ? null : rr5Var;
        rdg rdgVar2 = (i & 16) != 0 ? null : rdgVar;
        s9p s9pVar2 = (i & 32) != 0 ? null : s9pVar;
        boolean z3 = (i & 64) == 0;
        jac jacVar = (jac) au7Var.b;
        if (((tvu) au7Var.f).a) {
            return;
        }
        eu7Var.getClass();
        if (eu7Var.a.f - eu7Var.b.a > 2 && !z3 && s9pVar2 == null) {
            return;
        }
        ssg.a(3, "DefaultWavePlayback", "Queue is about to end or ended. Launching async prolongation", null);
        hxu hxuVar = (hxu) jacVar.g;
        if (hxuVar != null) {
            if (!hxuVar.m.X()) {
                ssg.a(3, "DefaultWavePlayback", "Prolongation is already started. Cancel it first if new one is needed.", null);
                return;
            }
            jacVar.g = null;
        }
        jzi jziVar = (jzi) au7Var.n;
        e5qVar.getClass();
        jziVar.getClass();
        if (((hxu) jacVar.g) != null) {
            xq0.q("Previous prolongation operation is not consumed or cancelled. Consume or cancel it first");
            return;
        }
        qzc qzcVar = (qzc) jacVar.a;
        f5v f5vVar = (f5v) jacVar.b;
        mmo mmoVar = (mmo) jacVar.c;
        fmu fmuVar = (fmu) jacVar.d;
        cvu cvuVar = (cvu) jacVar.f;
        a aVar = (a) jacVar.e;
        aVar.getClass();
        jacVar.g = new hxu(eu7Var, e5qVar, jziVar, qzcVar, f5vVar, mmoVar, fmuVar, cvuVar, z2, rr5Var2, rdgVar2, aVar, z3, s9pVar2);
    }

    public static sfo j(jzs jzsVar, sfo sfoVar) {
        izs izsVar = jzsVar.g;
        sfo sfoVar2 = null;
        if (izsVar instanceof e6v) {
            e6v e6vVar = (e6v) izsVar;
            if (!(e6vVar instanceof b6v)) {
                if (!(e6vVar instanceof d6v)) {
                    b6e.s();
                    return null;
                }
                sfoVar2 = szf.r0(((d6v) e6vVar).a);
            }
        } else if (!Intrinsics.d(izsVar, hzs.a)) {
            b6e.s();
            return null;
        }
        return sfoVar2 == null ? sfoVar : sfoVar2;
    }

    public static sfo k(aou aouVar) {
        if (aouVar instanceof tnu) {
            tnu tnuVar = (tnu) aouVar;
            return new sfo(tnuVar.a, tnuVar.b);
        }
        if (aouVar instanceof unu) {
            unu unuVar = (unu) aouVar;
            return new sfo(unuVar.a, unuVar.b);
        }
        if (aouVar instanceof znu) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static b3l m(v5j v5jVar) {
        int ordinal = v5jVar.ordinal();
        if (ordinal == 0) {
            return t2l.a;
        }
        if (ordinal == 1 || ordinal == 2) {
            return u2l.a;
        }
        if (ordinal == 3) {
            return a3l.a;
        }
        if (ordinal == 4) {
            return y2l.a;
        }
        if (ordinal == 5) {
            return s2l.a;
        }
        b6e.s();
        return null;
    }

    public uww d() {
        y1g.y("must call addApi() to add at least one API", !((xy0) this.h).isEmpty());
        tfq tfqVar = tfq.a;
        xy0 xy0Var = (xy0) this.h;
        po0 po0Var = wxw.b;
        if (xy0Var.containsKey(po0Var)) {
            tfqVar = (tfq) xy0Var.get(po0Var);
        }
        rn5 rn5Var = new rn5((HashSet) this.b, (xy0) this.f, (String) this.d, (String) this.e, tfqVar);
        Map map = (Map) rn5Var.d;
        boolean z = false;
        xy0 xy0Var2 = new xy0(0);
        xy0 xy0Var3 = new xy0(0);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((uy0) ((xy0) this.h).keySet()).iterator();
        po0 po0Var2 = null;
        while (it.hasNext()) {
            po0 po0Var3 = (po0) it.next();
            Object obj = ((xy0) this.h).get(po0Var3);
            boolean z2 = map.get(po0Var3) != null ? true : z;
            xy0Var2.put(po0Var3, Boolean.valueOf(z2));
            wyw wywVar = new wyw(po0Var3, z2);
            arrayList.add(wywVar);
            po0 po0Var4 = po0Var2;
            i4w i4wVar = po0Var3.a;
            y1g.G(i4wVar);
            rn5 rn5Var2 = rn5Var;
            fo0 p = i4wVar.p((Context) this.g, (Looper) this.k, rn5Var2, obj, wywVar, wywVar);
            xy0Var3.put(po0Var3.b, p);
            if (!p.a()) {
                po0Var2 = po0Var4;
            } else {
                if (po0Var4 != null) {
                    xq0.q(ouj.o(po0Var3.c, " cannot be used with ", po0Var4.c));
                    return null;
                }
                po0Var2 = po0Var3;
            }
            rn5Var = rn5Var2;
            z = false;
        }
        rn5 rn5Var3 = rn5Var;
        po0 po0Var5 = po0Var2;
        if (po0Var5 != null) {
            boolean equals = ((HashSet) this.b).equals((HashSet) this.c);
            String str = po0Var5.c;
            if (!equals) {
                xq0.q(hrg.q("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                return null;
            }
        }
        uww uwwVar = new uww((Context) this.g, new ReentrantLock(), (Looper) this.k, rn5Var3, (pmd) this.l, (bww) this.m, xy0Var2, (ArrayList) this.n, (ArrayList) this.o, xy0Var3, this.a, uww.i(xy0Var3.values(), true), arrayList);
        Set set = tmd.a;
        synchronized (set) {
            set.add(uwwVar);
        }
        if (this.a >= 0) {
            vyf c = LifecycleCallback.c((oyf) this.i);
            nyw nywVar = (nyw) c.b("AutoManageHelper", nyw.class);
            if (nywVar == null) {
                nywVar = new nyw(c);
            }
            int i = this.a;
            com.yandex.passport.internal.social.a aVar = (com.yandex.passport.internal.social.a) this.j;
            y1g.I(k5r.i(i, "Already managing a GoogleApiClient with id "), nywVar.f.indexOfKey(i) < 0);
            pyw pywVar = (pyw) nywVar.c.get();
            Log.d("AutoManageHelper", "starting AutoManage for client " + i + StringUtil.SPACE + nywVar.b + StringUtil.SPACE + String.valueOf(pywVar));
            kyw kywVar = new kyw(nywVar, i, uwwVar, aVar);
            uwwVar.c.a(kywVar);
            nywVar.f.put(i, kywVar);
            if (nywVar.b && pywVar == null) {
                Log.d("AutoManageHelper", "connecting ".concat(uwwVar.toString()));
                uwwVar.g();
            }
        }
        return uwwVar;
    }

    public bwu e(eu7 eu7Var, gyn gynVar, e5q e5qVar, b3l b3lVar, awu awuVar) {
        e5q m0 = hdg.m0(e5qVar, eu7Var.a);
        return new bwu(new tyu(this.a, eu7Var, u7g.X(y7g.t(u7g.O(gynVar), hdg.W(m0))), (j2t) this.e), m0, awuVar, b3lVar);
    }

    public fwu f(eu7 eu7Var, gyn gynVar, e5q e5qVar, boolean z, b3l b3lVar) {
        e5q m0 = hdg.m0(e5qVar, eu7Var.a);
        if (z) {
            int ordinal = hdg.W(m0).ordinal();
            if (ordinal == 0) {
                gynVar = lyn.a;
            } else if (ordinal != 1) {
                b6e.s();
                return null;
            }
        }
        return new fwu(new tyu(this.a, eu7Var, u7g.X(y7g.t(u7g.O(gynVar), hdg.W(m0))), (j2t) this.e), m0, b3lVar);
    }

    public Boolean h() {
        ssg.a(3, "DefaultWavePlayback", "launchProlongationIfNeededAsync", null);
        Object value = ((xdr) this.o).getValue();
        xvu xvuVar = value instanceof xvu ? (xvu) value : null;
        if (xvuVar == null) {
            return Boolean.FALSE;
        }
        if (xvuVar instanceof bwu) {
            bwu bwuVar = (bwu) xvuVar;
            g(this, bwuVar.a.a, bwuVar.b, false, null, null, null, 124);
        } else {
            if (!(xvuVar instanceof fwu)) {
                b6e.s();
                return null;
            }
            fwu fwuVar = (fwu) xvuVar;
            g(this, fwuVar.a.a, fwuVar.b, false, null, null, null, 124);
        }
        return Boolean.TRUE;
    }

    public Boolean i(int i, int i2) {
        Object f;
        ssg.a(3, "DefaultWavePlayback", hrg.s("movePlayable(fromQueuePosition=", ran.a(i), ", toQueuePosition=", ran.a(i2), ")"), null);
        xdr xdrVar = (xdr) this.o;
        Object value = xdrVar.getValue();
        xvu xvuVar = value instanceof xvu ? (xvu) value : null;
        if (xvuVar == null) {
            return Boolean.FALSE;
        }
        boolean z = xvuVar instanceof bwu;
        a3l a3lVar = a3l.a;
        if (z) {
            bwu bwuVar = (bwu) xvuVar;
            tyu tyuVar = bwuVar.a;
            f = e(leu.c0(tyuVar.a, i, i2), tyuVar.b, bwuVar.b, a3lVar, null);
        } else {
            if (!(xvuVar instanceof fwu)) {
                b6e.s();
                return null;
            }
            fwu fwuVar = (fwu) xvuVar;
            tyu tyuVar2 = fwuVar.a;
            f = f(leu.c0(tyuVar2.a, i, i2), tyuVar2.b, fwuVar.b, false, a3lVar);
        }
        xdrVar.getClass();
        xdrVar.m(null, f);
        if (f instanceof fwu) {
            fwu fwuVar2 = (fwu) f;
            g(this, fwuVar2.a.a, fwuVar2.b, false, null, null, null, 124);
        } else {
            if (!(f instanceof bwu)) {
                b6e.s();
                return null;
            }
            bwu bwuVar2 = (bwu) f;
            g(this, bwuVar2.a.a, bwuVar2.b, false, null, null, null, 124);
        }
        return Boolean.TRUE;
    }

    public void l(c9g c9gVar) {
        x97.y(gld.X((tf6) this.l, saf.p()), null, null, new j57(this, c9gVar, (Continuation) null, 8), 3);
    }

    public au7(jac jacVar, mmo mmoVar, mmo mmoVar2, j2t j2tVar, tvu tvuVar, yks yksVar, a aVar, kou kouVar, cvu cvuVar, atn atnVar) {
        aVar.getClass();
        kouVar.getClass();
        this.b = jacVar;
        this.c = mmoVar;
        this.d = mmoVar2;
        this.e = j2tVar;
        this.f = tvuVar;
        this.g = yksVar;
        this.h = aVar;
        this.i = kouVar;
        this.j = cvuVar;
        this.k = atnVar;
        this.l = gld.e(e.c(a4g.n(), aVar).plus(new im6("DefaultWavePlayback")));
        this.m = rqi.a();
        this.n = new jzi(this);
        this.o = ydr.a(yvu.a);
    }
}
