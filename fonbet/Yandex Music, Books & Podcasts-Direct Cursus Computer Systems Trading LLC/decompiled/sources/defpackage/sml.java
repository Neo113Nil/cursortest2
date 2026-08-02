package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.histogram.ComponentHistograms;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.quasar.glagol.impl.ConversationImpl;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes4.dex */
public final class sml implements lml, pur, j38, lci, x7o, zv3, re6, jb7, t0d, lpr, zdu, hv3, gxw {
    public final Object a;

    public sml(Intent intent, Bundle bundle) {
        Bundle bundle2;
        intent.getClass();
        dyd dydVar = null;
        if (bundle == null) {
            Bundle extras = intent.getExtras();
            if (extras != null && (bundle2 = extras.getBundle("trailer.intent.action")) != null) {
                dydVar = new dyd(new t5t(bundle2.getBoolean("TrailerPlay.key.open")));
                dydVar.c = bundle2.getBoolean("key.intent.action.executed", false);
            }
        } else {
            Bundle bundle3 = bundle.getBundle("trailer.intent.action");
            if (bundle3 != null) {
                dydVar = new dyd(new t5t(bundle3.getBoolean("TrailerPlay.key.open")));
                dydVar.c = bundle3.getBoolean("key.intent.action.executed", false);
            }
        }
        this.a = dydVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static r7c w(nou nouVar) {
        String str = nouVar.f;
        Long l = nouVar.g;
        String str2 = nouVar.i;
        Date date = nouVar.e;
        String str3 = nouVar.j;
        rr5 t = str != null ? q6k.t(str) : null;
        String str4 = nouVar.b;
        switch (str4.hashCode()) {
            case -911523732:
                if (str4.equals("undislike") && t != null && str3 != null) {
                    return new jit(date, str2, t, str3);
                }
                return null;
            case -840447568:
                if (str4.equals("unlike") && t != null && str3 != null) {
                    return new vkt(date, str2, t, str3);
                }
                return null;
            case -498961448:
                if (str4.equals("session_started")) {
                    return new wmp(date, str2);
                }
                return null;
            case 3321751:
                if (str4.equals("like") && t != null && str3 != null) {
                    return new xzf(date, str2, t, str3);
                }
                return null;
            case 3532159:
                if (str4.equals("skip")) {
                    Date date2 = nouVar.e;
                    String str5 = nouVar.i;
                    if (t != null && l != null) {
                        long longValue = l.longValue();
                        if (str3 != null) {
                            return new crq(date2, str5, t, longValue, str3);
                        }
                    }
                }
                return null;
            case 92882150:
                if (str4.equals("track_finished")) {
                    Date date3 = nouVar.e;
                    String str6 = nouVar.i;
                    if (t != null && l != null) {
                        long longValue2 = l.longValue();
                        Long l2 = nouVar.h;
                        if (l2 != null) {
                            long longValue3 = l2.longValue();
                            if (str3 != null) {
                                return new svs(date3, str6, t, longValue2, longValue3, str3);
                            }
                        }
                    }
                }
                return null;
            case 1671642405:
                if (str4.equals("dislike")) {
                    Date date4 = nouVar.e;
                    String str7 = nouVar.i;
                    if (t != null && l != null) {
                        long longValue4 = l.longValue();
                        if (str3 != null) {
                            return new k88(date4, str7, t, longValue4, str3);
                        }
                    }
                }
                return null;
            case 2006867341:
                if (str4.equals("track_started") && t != null && str3 != null) {
                    return new p1t(date, str2, t, str3);
                }
                return null;
            default:
                return null;
        }
    }

    public boolean A(dmr dmrVar, String str, Object obj) {
        am8 am8Var = (am8) this.a;
        try {
            dmrVar.w(obj, str);
            return true;
        } catch (IndexOutOfBoundsException unused) {
            am8Var.invoke("Position '" + str + "' is out of array bounds");
            return false;
        } catch (NumberFormatException unused2) {
            am8Var.invoke("Unable to use '" + str + "' as array index");
            return false;
        }
    }

    @Override // defpackage.lml
    public oq7 B() {
        return (oq7) ((rdk) this.a).g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(String str, s9p s9pVar, r7c r7cVar, aur aurVar) {
        String str2;
        String e;
        String str3;
        Long l;
        Long l2;
        oou oouVar = (oou) this.a;
        boolean z = r7cVar instanceof wmp;
        if (z) {
            str2 = "session_started";
        } else if (r7cVar instanceof p1t) {
            str2 = "track_started";
        } else if (r7cVar instanceof svs) {
            str2 = "track_finished";
        } else if (r7cVar instanceof crq) {
            str2 = "skip";
        } else if (r7cVar instanceof k88) {
            str2 = "dislike";
        } else if (r7cVar instanceof xzf) {
            str2 = "like";
        } else if (r7cVar instanceof jit) {
            str2 = "undislike";
        } else {
            if (!(r7cVar instanceof vkt)) {
                b6e.s();
                return null;
            }
            str2 = "unlike";
        }
        String str4 = str2;
        Date timestamp = r7cVar.getTimestamp();
        String str5 = null;
        if (z) {
            str3 = null;
        } else {
            if (r7cVar instanceof p1t) {
                e = ((p1t) r7cVar).c.e();
            } else if (r7cVar instanceof svs) {
                e = ((svs) r7cVar).c.e();
            } else if (r7cVar instanceof crq) {
                e = ((crq) r7cVar).c.e();
            } else if (r7cVar instanceof k88) {
                e = ((k88) r7cVar).c.e();
            } else if (r7cVar instanceof xzf) {
                e = ((xzf) r7cVar).c.e();
            } else if (r7cVar instanceof jit) {
                e = ((jit) r7cVar).c.e();
            } else {
                if (!(r7cVar instanceof vkt)) {
                    b6e.s();
                    return null;
                }
                e = ((vkt) r7cVar).c.e();
            }
            str3 = e;
        }
        if (!z && !(r7cVar instanceof p1t)) {
            if (r7cVar instanceof svs) {
                l = new Long(((svs) r7cVar).d);
            } else if (r7cVar instanceof crq) {
                l = new Long(((crq) r7cVar).d);
            } else if (r7cVar instanceof k88) {
                l = new Long(((k88) r7cVar).d);
            } else if (!(r7cVar instanceof xzf) && !(r7cVar instanceof jit) && !(r7cVar instanceof vkt)) {
                b6e.s();
                return null;
            }
            if (!z && !(r7cVar instanceof p1t)) {
                if (!(r7cVar instanceof svs)) {
                    l2 = new Long(((svs) r7cVar).e);
                    String a = r7cVar.a();
                    if (!z) {
                        if (r7cVar instanceof p1t) {
                            str5 = ((p1t) r7cVar).d;
                        } else if (r7cVar instanceof svs) {
                            str5 = ((svs) r7cVar).f;
                        } else if (r7cVar instanceof crq) {
                            str5 = ((crq) r7cVar).e;
                        } else if (r7cVar instanceof k88) {
                            str5 = ((k88) r7cVar).e;
                        } else if (r7cVar instanceof xzf) {
                            str5 = ((xzf) r7cVar).d;
                        } else if (r7cVar instanceof jit) {
                            str5 = ((jit) r7cVar).d;
                        } else {
                            if (!(r7cVar instanceof vkt)) {
                                b6e.s();
                                return null;
                            }
                            str5 = ((vkt) r7cVar).d;
                        }
                    }
                    Object e2 = ((uou) oouVar).e(new nou(0L, str4, str, s9pVar, timestamp, str3, l, l2, a, str5), aurVar);
                    return e2 == nm6.a ? e2 : Unit.a;
                }
                if (!(r7cVar instanceof crq) && !(r7cVar instanceof k88) && !(r7cVar instanceof xzf) && !(r7cVar instanceof jit) && !(r7cVar instanceof vkt)) {
                    b6e.s();
                    return null;
                }
            }
            l2 = null;
            String a2 = r7cVar.a();
            if (!z) {
            }
            Object e22 = ((uou) oouVar).e(new nou(0L, str4, str, s9pVar, timestamp, str3, l, l2, a2, str5), aurVar);
            if (e22 == nm6.a) {
            }
        }
        l = null;
        if (!z) {
            if (!(r7cVar instanceof svs)) {
            }
        }
        l2 = null;
        String a22 = r7cVar.a();
        if (!z) {
        }
        Object e222 = ((uou) oouVar).e(new nou(0L, str4, str, s9pVar, timestamp, str3, l, l2, a22, str5), aurVar);
        if (e222 == nm6.a) {
        }
    }

    @Override // defpackage.jb7
    public va7 K(DataSourceParameters dataSourceParameters, PlaybackParameters playbackParameters) {
        return ((ib7) this.a).b(dataSourceParameters.getTransferListener());
    }

    public dmr a(dmr dmrVar, List list) {
        am8 am8Var = (am8) this.a;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            String str = (String) obj;
            try {
                dmrVar = dmrVar.mo22get(str);
                if (Intrinsics.d(dmrVar, i9w.g)) {
                    am8Var.invoke("Element with path '" + CollectionsKt.X(CollectionsKt.q0(list, i2), "/", null, null, null, 62) + "' is not a structure");
                    return null;
                }
                if (dmrVar == null) {
                    am8Var.invoke("Element with path '" + CollectionsKt.X(CollectionsKt.q0(list, i2), "/", null, null, null, 62) + "' is not found");
                    return null;
                }
                i = i2;
            } catch (NumberFormatException unused) {
                am8Var.invoke("Unable to use '" + str + "' as array index");
                return null;
            }
        }
        return dmrVar;
    }

    @Override // defpackage.ib7
    public va7 b(t6t t6tVar) {
        return ((ib7) this.a).b(t6tVar);
    }

    @Override // defpackage.lml
    public mm6 c() {
        return (tf6) ((rdk) this.a).b;
    }

    @Override // defpackage.hv3
    public void d(Context context, hxo hxoVar) {
        context.getClass();
        hxoVar.invoke(new mi7(context, ((zdv) this.a).y()));
    }

    @Override // defpackage.zdu
    public Function0 e(z5 z5Var) {
        return ocg.n(z5Var, (nyf) this.a);
    }

    @Override // defpackage.gxw
    public void f(Bundle bundle) {
        dww dwwVar = (dww) this.a;
        Lock lock = dwwVar.s;
        lock.lock();
        try {
            Bundle bundle2 = dwwVar.o;
            if (bundle2 == null) {
                dwwVar.o = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            dwwVar.p = h66.e;
            dww.k(dwwVar);
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[EDGE_INSN: B:29:0x00a0->B:30:0x00a0 BREAK  A[LOOP:0: B:17:0x006d->B:26:0x006d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(cg6 cg6Var) {
        cpu cpuVar;
        int i;
        ArrayList arrayList;
        int i2;
        sml smlVar;
        Iterator it;
        if (cg6Var instanceof cpu) {
            cpuVar = (cpu) cg6Var;
            int i3 = cpuVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cpuVar.p = i3 - Integer.MIN_VALUE;
                Object obj = cpuVar.n;
                nm6 nm6Var = nm6.a;
                i = cpuVar.p;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    oou oouVar = (oou) this.a;
                    cpuVar.j = this;
                    cpuVar.k = q;
                    cpuVar.m = 0;
                    cpuVar.p = 1;
                    Serializable a = ((uou) oouVar).a(cpuVar);
                    if (a != nm6Var) {
                        arrayList = q;
                        obj = a;
                        i2 = 0;
                        smlVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList2 = cpuVar.l;
                    qgg.h0(obj);
                    return arrayList2;
                }
                i2 = cpuVar.m;
                arrayList = cpuVar.k;
                smlVar = cpuVar.j;
                qgg.h0(obj);
                ArrayList arrayList3 = new ArrayList();
                it = ((List) obj).iterator();
                while (true) {
                    bpu bpuVar = null;
                    if (it.hasNext()) {
                        break;
                    }
                    nou nouVar = (nou) it.next();
                    smlVar.getClass();
                    r7c w = w(nouVar);
                    long j = nouVar.a;
                    if (w == null) {
                        arrayList.add(new Long(j));
                    } else {
                        bpuVar = new bpu(j, w, nouVar.c, nouVar.d);
                    }
                    if (bpuVar != null) {
                        arrayList3.add(bpuVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    dfi.r(k5r.i(arrayList.size(), "Broken feedback rows found in db. Size="), "WaveFeedbackStorageDbAdapter");
                    oou oouVar2 = (oou) smlVar.a;
                    cpuVar.j = null;
                    cpuVar.k = null;
                    cpuVar.l = arrayList3;
                    cpuVar.m = i2;
                    cpuVar.p = 2;
                    if (((uou) oouVar2).c(arrayList, cpuVar) == nm6Var) {
                        return nm6Var;
                    }
                }
                return arrayList3;
            }
        }
        cpuVar = new cpu(this, cg6Var);
        Object obj2 = cpuVar.n;
        nm6 nm6Var2 = nm6.a;
        i = cpuVar.p;
        if (i != 0) {
        }
        ArrayList arrayList32 = new ArrayList();
        it = ((List) obj2).iterator();
        while (true) {
            bpu bpuVar2 = null;
            if (it.hasNext()) {
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return arrayList32;
    }

    @Override // defpackage.zv3
    public boolean h(ffk ffkVar) {
        ffkVar.getClass();
        mgk mgkVar = ((gdp) this.a).w;
        return mgkVar != null && mgkVar.g(ffkVar.a);
    }

    @Override // defpackage.t0d
    public Object i(Continuation continuation) {
        return (f0d) this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable j(cg6 cg6Var) {
        dpu dpuVar;
        int i;
        if (cg6Var instanceof dpu) {
            dpuVar = (dpu) cg6Var;
            int i2 = dpuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dpuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dpuVar.j;
                nm6 nm6Var = nm6.a;
                i = dpuVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dpuVar.l = 1;
                    obj = g(dpuVar);
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
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) obj) {
                    String str = ((bpu) obj2).c;
                    Object obj3 = linkedHashMap.get(str);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(str, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bpu bpuVar = (bpu) CollectionsKt.firstOrNull(list);
                    arrayList.add(new xlp(str2, bpuVar != null ? bpuVar.d : null, list));
                }
                return arrayList;
            }
        }
        dpuVar = new dpu(this, cg6Var);
        Object obj4 = dpuVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dpuVar.l;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r6.hasNext()) {
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        while (r0.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[EDGE_INSN: B:29:0x00a2->B:30:0x00a2 BREAK  A[LOOP:0: B:17:0x006f->B:26:0x006f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(String str, cg6 cg6Var) {
        epu epuVar;
        int i;
        ArrayList arrayList;
        int i2;
        sml smlVar;
        Iterator it;
        if (cg6Var instanceof epu) {
            epuVar = (epu) cg6Var;
            int i3 = epuVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                epuVar.p = i3 - Integer.MIN_VALUE;
                Object obj = epuVar.n;
                nm6 nm6Var = nm6.a;
                i = epuVar.p;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    oou oouVar = (oou) this.a;
                    epuVar.j = this;
                    epuVar.k = q;
                    epuVar.m = 0;
                    epuVar.p = 1;
                    Serializable b = ((uou) oouVar).b(str, epuVar);
                    if (b != nm6Var) {
                        arrayList = q;
                        obj = b;
                        i2 = 0;
                        smlVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList2 = epuVar.l;
                    qgg.h0(obj);
                    return arrayList2;
                }
                i2 = epuVar.m;
                arrayList = epuVar.k;
                smlVar = epuVar.j;
                qgg.h0(obj);
                ArrayList arrayList3 = new ArrayList();
                it = ((List) obj).iterator();
                while (true) {
                    bpu bpuVar = null;
                    if (it.hasNext()) {
                        break;
                    }
                    nou nouVar = (nou) it.next();
                    smlVar.getClass();
                    r7c w = w(nouVar);
                    long j = nouVar.a;
                    if (w == null) {
                        arrayList.add(new Long(j));
                    } else {
                        bpuVar = new bpu(j, w, nouVar.c, nouVar.d);
                    }
                    if (bpuVar != null) {
                        arrayList3.add(bpuVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    dfi.r(k5r.i(arrayList.size(), "Broken feedback rows found in db. Size="), "WaveFeedbackStorageDbAdapter");
                    oou oouVar2 = (oou) smlVar.a;
                    epuVar.j = null;
                    epuVar.k = null;
                    epuVar.l = arrayList3;
                    epuVar.m = i2;
                    epuVar.p = 2;
                    if (((uou) oouVar2).c(arrayList, epuVar) == nm6Var) {
                        return nm6Var;
                    }
                }
                return arrayList3;
            }
        }
        epuVar = new epu(this, cg6Var);
        Object obj2 = epuVar.n;
        nm6 nm6Var2 = nm6.a;
        i = epuVar.p;
        if (i != 0) {
        }
        ArrayList arrayList32 = new ArrayList();
        it = ((List) obj2).iterator();
        while (true) {
            bpu bpuVar2 = null;
            if (it.hasNext()) {
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return arrayList32;
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        ((knn) this.a).l(zcoVar, f);
    }

    @Override // defpackage.re6
    public void m(we6 we6Var) {
        sgr T = vut.T(we6Var);
        if (sgr.i.a.equals(T.a)) {
            ((ijp) this.a).g.f(T);
        }
    }

    @Override // defpackage.j38
    public boolean n(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.n.y()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.x()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.G0();
        return recyclerView.V(i, i2, 0, Integer.MAX_VALUE);
    }

    public lyd o(String str) {
        ciq ciqVar = (ciq) this.a;
        lyd lydVar = (lyd) ciqVar.get(str);
        if (lydVar != null) {
            return lydVar;
        }
        Object obj = ComponentHistograms.b;
        lyd b = xee.B().b(str, 1, ConversationImpl.INCORRECT_TOKEN, 100);
        ciqVar.put(str, b);
        return b;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        dro droVar = (dro) obj;
        droVar.getClass();
        ((jqo) this.a).M(StringsKt.s0(droVar.a));
    }

    @Override // defpackage.gxw
    public void p(h66 h66Var) {
        dww dwwVar = (dww) this.a;
        Lock lock = dwwVar.s;
        lock.lock();
        try {
            dwwVar.p = h66Var;
            dww.k(dwwVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.j38
    public float q() {
        float f;
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.n.y()) {
            f = recyclerView.I0;
        } else {
            if (!recyclerView.n.x()) {
                return 0.0f;
            }
            f = recyclerView.H0;
        }
        return -f;
    }

    @Override // defpackage.j38
    public void r() {
        ((RecyclerView) this.a).G0();
    }

    public cib s() {
        return new cib(26, ((fvf) this.a).j());
    }

    @Override // defpackage.lml
    public kll t() {
        return (kll) ((rdk) this.a).c;
    }

    @Override // defpackage.lml
    public Object u(mwk mwkVar) {
        mwkVar.getClass();
        rdk rdkVar = (rdk) this.a;
        qec qecVar = (qec) rdkVar.d;
        tjl tjlVar = (tjl) rdkVar.e;
        ujl ujlVar = (ujl) rdkVar.f;
        qecVar.getClass();
        tjlVar.getClass();
        ujlVar.getClass();
        return (wxk) dag.p(mwkVar, new yks(ujlVar, qecVar, tjlVar));
    }

    public ArrayList v(String str) {
        List split$default;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (str.length() <= 0 || !arrayList.isEmpty()) {
            return arrayList;
        }
        ((am8) this.a).invoke("Malformed path '" + str + "': all path segments are empty");
        return null;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        ((bfk) obj).getClass();
        jqo jqoVar = (jqo) this.a;
        CountDownTimer countDownTimer = jqoVar.u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        jqoVar.u = null;
        jqoVar.o.m(cqo.b);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new fr1((Resources) this.a, uit.b);
    }

    @Override // defpackage.gxw
    public void z(int i) {
        h66 h66Var;
        dww dwwVar = (dww) this.a;
        Lock lock = dwwVar.s;
        lock.lock();
        try {
            if (!dwwVar.r && (h66Var = dwwVar.q) != null && h66Var.e()) {
                dwwVar.r = true;
                dwwVar.k.p0(i);
                lock.unlock();
            }
            dwwVar.r = false;
            dww.j(dwwVar, i);
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public /* synthetic */ sml(Object obj) {
        this.a = obj;
    }

    public sml(int i) {
        switch (i) {
            case 4:
                this.a = new knn(3, new jwl(1));
                break;
            case 16:
                this.a = new mvt(20);
                break;
            case 17:
                this.a = new WeakHashMap();
                break;
            case 29:
                this.a = new onx();
                break;
            default:
                this.a = new ciq(0);
                break;
        }
    }

    public sml(ib7 ib7Var, pt0 pt0Var) {
        pt0Var.getClass();
        this.a = ib7Var;
        ib7Var.B0(pt0Var);
    }

    public sml(dn9 dn9Var, y7k y7kVar, klx klxVar, v8a v8aVar) {
        this.a = y7kVar;
        new ConcurrentHashMap();
        new xy0(0);
        new LinkedHashMap();
        new LinkedHashMap();
        btf.b(new kgk(28, this));
    }
}
