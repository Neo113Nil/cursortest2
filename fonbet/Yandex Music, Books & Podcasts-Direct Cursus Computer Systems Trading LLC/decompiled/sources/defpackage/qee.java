package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.d0;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.w;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* loaded from: classes.dex */
public final class qee implements u6c, o3e, w2q, mx0, oob, uyp, r8e {
    public static boolean i;
    public final /* synthetic */ int a;
    public static final qee b = new qee(0);
    public static final qee c = new qee(1);
    public static final /* synthetic */ qee d = new qee(2);
    public static final sj6 e = new sj6();
    public static final qee f = new qee(3);
    public static final /* synthetic */ qee g = new qee(4);
    public static final qee h = new qee(5);
    public static final qee j = new qee(7);
    public static final /* synthetic */ qee k = new qee(8);
    public static final qee l = new qee(9);
    public static final qee m = new qee(11);
    public static final qee n = new qee(12);

    public /* synthetic */ qee(int i2) {
        this.a = i2;
    }

    public static final void f() {
        qee qeeVar = b;
        Set set = bp6.a;
        if (set.contains(qee.class)) {
            return;
        }
        try {
            if (set.contains(qeeVar)) {
                return;
            }
            try {
                AtomicBoolean atomicBoolean = see.s;
                ConcurrentHashMap C = imp.C();
                ConcurrentHashMap concurrentHashMap = null;
                if (!set.contains(see.class)) {
                    try {
                        concurrentHashMap = see.w;
                    } catch (Throwable th) {
                        bp6.a(see.class, th);
                    }
                }
                uee.e(C, concurrentHashMap);
                imp.C().clear();
            } catch (Throwable th2) {
                bp6.a(qeeVar, th2);
            }
        } catch (Throwable th3) {
            bp6.a(qee.class, th3);
        }
    }

    public static final String l(a0 a0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(s(a0Var.k()));
        sb.append('\n');
        x j2 = a0Var.j();
        j2.getClass();
        f s = uwf.s(j2);
        sb.append("current = " + (s != null ? ouj.o(s.t(), " - ", s.w()) : null));
        sb.append('\n');
        w C = a0Var.j().C();
        StringBuilder sb2 = new StringBuilder();
        if (C.s()) {
            sb2.append("hasWaveQueue ");
        }
        if (C.p()) {
            sb2.append("hasGenerativeQueue ");
        }
        if (C.o()) {
            sb2.append("hasFmRadioQueue ");
        }
        if (C.r()) {
            sb2.append("hasVideoWaveQueue ");
        }
        if (C.q()) {
            sb2.append("hasLocalTracksQueue ");
        }
        sb.append("queue = " + ((Object) sb2.toString()));
        sb.append('\n');
        List A = a0Var.j().A();
        A.getClass();
        sb.append("tracks = ".concat(CollectionsKt.X(A, null, null, null, new d9w(27), 31)));
        sb.append('\n');
        return sb.toString();
    }

    public static jzi m(String str, w0a w0aVar, xzb xzbVar, int i2) {
        Object g1aVar;
        View findViewWithTag = w0aVar.getView().findViewWithTag(str);
        if (findViewWithTag != null) {
            if (findViewWithTag instanceof hh9) {
                hh9 hh9Var = (hh9) findViewWithTag;
                eb8 div = hh9Var.getDiv();
                div.getClass();
                int ordinal = ((q09) div.c.C.a(xzbVar)).ordinal();
                if (ordinal == 0) {
                    g1aVar = new i1a(hh9Var, i2);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    g1aVar = new f1a(hh9Var, i2);
                }
            } else {
                g1aVar = findViewWithTag instanceof oc9 ? new g1a((oc9) findViewWithTag) : findViewWithTag instanceof lp9 ? new g1a((lp9) findViewWithTag) : null;
            }
            if (g1aVar != null) {
                return new jzi(g1aVar);
            }
        }
        return null;
    }

    public static long n() {
        int i2 = q7w.b;
        return up6.z(Long.valueOf(System.currentTimeMillis()));
    }

    public static void q(d0 d0Var) {
        StringBuilder sb = new StringBuilder("<<<- Request\n");
        if (d0Var.B()) {
            a0 j2 = d0Var.s().j();
            j2.getClass();
            sb.append("updateFullState \n".concat(l(j2)));
        }
        if (d0Var.z()) {
            sb.append("syncStateFromEov = " + d0Var.q().f());
        }
        if (d0Var.H()) {
            sb.append("updateVolumeInfo = " + d0Var.y().i().j());
        }
        if (d0Var.E()) {
            sb.append("updatePlayingStatus \n".concat(s(d0Var.v().h())));
        }
        if (d0Var.D()) {
            a0 h2 = d0Var.u().h();
            h2.getClass();
            sb.append("updatePlayerState \n".concat(l(h2)));
        }
        if (d0Var.G()) {
            sb.append("updateVolume = " + d0Var.x().g());
        }
        if (d0Var.A()) {
            sb.append("updateActiveDevice = " + d0Var.r().h().g());
        }
        if (d0Var.C()) {
            sb.append("updatePlayerQueueInject \n".concat(s(d0Var.t().g().g())));
        }
        if (d0Var.F()) {
            sb.append("updateSessionParams = " + d0Var.w());
        }
        ssg.a(2, "YnisonLogger", sb.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x001c, B:16:0x002f, B:18:0x0035, B:39:0x003d, B:41:0x0052, B:47:0x004f, B:52:0x002b, B:49:0x0027, B:44:0x004b), top: B:11:0x001c, outer: #0, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x001c, B:16:0x002f, B:18:0x0035, B:39:0x003d, B:41:0x0052, B:47:0x004f, B:52:0x002b, B:49:0x0027, B:44:0x004b), top: B:11:0x001c, outer: #0, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(Context context) {
        AtomicBoolean atomicBoolean;
        see a;
        Set set = bp6.a;
        if (set.contains(qee.class)) {
            return;
        }
        try {
            context.getClass();
            if (xee.C("com.android.billingclient.api.Purchase") == null) {
                return;
            }
            synchronized (see.x) {
                AtomicBoolean atomicBoolean2 = null;
                if (!set.contains(see.class)) {
                    try {
                        atomicBoolean = see.s;
                    } catch (Throwable th) {
                        bp6.a(see.class, th);
                    }
                    if (atomicBoolean.get()) {
                        imp.r(context);
                        if (!bp6.a.contains(see.class)) {
                            try {
                                atomicBoolean2 = see.s;
                            } catch (Throwable th2) {
                                bp6.a(see.class, th2);
                            }
                        }
                        atomicBoolean2.set(true);
                        a = see.a();
                    } else {
                        a = see.a();
                    }
                }
                atomicBoolean = null;
                if (atomicBoolean.get()) {
                }
            }
            if (a == null || !imp.M().get()) {
                return;
            }
            if (!uee.d()) {
                a.b();
            } else {
                if (set.contains(a)) {
                    return;
                }
                try {
                    a.c(new dsd(1, a));
                } catch (Throwable th3) {
                    bp6.a(a, th3);
                }
            }
        } catch (Throwable th4) {
            bp6.a(qee.class, th4);
        }
    }

    public static String s(c0 c0Var) {
        if (c0Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("playing = " + (!c0Var.m()));
        sb.append('\n');
        sb.append("progress = " + c0Var.o());
        sb.append('\n');
        sb.append("from device = " + c0Var.p().j());
        sb.append('\n');
        long k2 = c0Var.p().k();
        sb.append("timestamp = " + ((Object) (k2 + "  -  " + new Date(k2))));
        return sb.toString();
    }

    public static w4f u(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), u(entry.getValue()));
            }
            return new q5f(linkedHashMap);
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            ArrayList arrayList = new ArrayList(v75.o(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(u(it.next()));
            }
            return new c4f(arrayList);
        }
        if (obj instanceof Long) {
            return x4f.b((Number) obj);
        }
        if (obj instanceof Integer) {
            return x4f.b((Number) obj);
        }
        if (obj instanceof Double) {
            return x4f.b((Number) obj);
        }
        if (obj instanceof Float) {
            return x4f.b((Number) obj);
        }
        if (obj instanceof String) {
            return x4f.c((String) obj);
        }
        if (obj instanceof Boolean) {
            return x4f.a((Boolean) obj);
        }
        if (obj instanceof w4f) {
            return (w4f) obj;
        }
        xq0.x(tlm.j("Unsupported for wrapping type ", obj.getClass()));
        return null;
    }

    @Override // defpackage.uyp
    public Object A(StartRelayQueueCommand startRelayQueueCommand) {
        startRelayQueueCommand.getClass();
        throw new uej("there is no relay queue in the app");
    }

    @Override // defpackage.uyp
    public Object C(StartGenerativeQueueCommand startGenerativeQueueCommand) {
        startGenerativeQueueCommand.getClass();
        return startGenerativeQueueCommand.getStartRequest().a;
    }

    @Override // defpackage.r8e
    public void E(String str, String str2, Throwable th) {
        str2.getClass();
        th.getClass();
        Log.e(str, str2, th);
    }

    @Override // defpackage.uyp
    public Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand) {
        startVideoClipRadioQueueCommand.getClass();
        return startVideoClipRadioQueueCommand.getStartRequest().a;
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            boolean z2 = x2i.b;
            if (bp6.a.contains(x2i.class)) {
                return;
            }
            try {
                try {
                    j3c.d().execute(q.l);
                } catch (Exception unused) {
                    HashSet hashSet = j3c.a;
                }
            } catch (Throwable th) {
                bp6.a(x2i.class, th);
            }
        }
    }

    @Override // defpackage.r8e
    public void a(String str, String str2) {
        str2.getClass();
        Log.e(str, str2);
    }

    @Override // defpackage.o3e
    public bg5 b(List list, spd spdVar, hq5 hq5Var, int i2) {
        list.getClass();
        spdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1531670177);
        crm crmVar = crm.a;
        oq5Var.p(false);
        return crmVar;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        switch (this.a) {
            case 9:
                focVar.getClass();
                return null;
            default:
                focVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.r8e
    public void e(String str, String str2) {
        str2.getClass();
        Log.d(str, str2);
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        boolean z;
        switch (this.a) {
            case 9:
                faqVar.getClass();
                break;
            default:
                faqVar.getClass();
                if (faqVar instanceof naq) {
                    z = true;
                } else if (!(faqVar instanceof saq) && !(faqVar instanceof daq) && !(faqVar instanceof qaq)) {
                    b6e.s();
                    break;
                } else {
                    z = false;
                }
                break;
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 9:
                jzsVar.getClass();
                return null;
            default:
                jzsVar.getClass();
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        boolean z;
        switch (this.a) {
            case 9:
                m1qVar.getClass();
                break;
            default:
                m1qVar.getClass();
                if (m1qVar instanceof c2q) {
                    z = true;
                } else if (!(m1qVar instanceof j1q) && !(m1qVar instanceof e2q)) {
                    b6e.s();
                    break;
                } else {
                    z = false;
                }
                break;
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        switch (this.a) {
            case 9:
                i5uVar.getClass();
                return new tfn(i5uVar.a.a);
            default:
                i5uVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        switch (this.a) {
            case 9:
                k4dVar.getClass();
                return null;
            default:
                k4dVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.uyp
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        startYnisonQueueCommand.getClass();
        return ((pqw) startYnisonQueueCommand.getStartRequest().a.getValue()).b.k().getId();
    }

    public Object t(w4f w4fVar) {
        if (w4fVar instanceof q5f) {
            return uah.m(jhp.e(new o7t(CollectionsKt.F(((q5f) w4fVar).a.entrySet()), new san(27))));
        }
        if (w4fVar instanceof c4f) {
            c4f c4fVar = (c4f) w4fVar;
            ArrayList arrayList = new ArrayList(v75.o(c4fVar, 10));
            Iterator it = c4fVar.a.iterator();
            while (it.hasNext()) {
                Object t = h.t((w4f) it.next());
                if (t == null) {
                    xq0.x("Unexpected null value in json array");
                    return null;
                }
                arrayList.add(t);
            }
            return arrayList;
        }
        if (!(w4fVar instanceof v6f)) {
            b6e.s();
            return null;
        }
        v6f v6fVar = (v6f) w4fVar;
        if (v6fVar.g()) {
            return v6fVar.a();
        }
        if (v6fVar instanceof m5f) {
            return null;
        }
        ome omeVar = x4f.a;
        Object b2 = pkr.b(v6fVar.a());
        if (b2 != null || (b2 = x4f.e(v6fVar)) != null || (b2 = x4f.h(v6fVar)) != null) {
            return b2;
        }
        Double h2 = b.h(v6fVar.a());
        if (h2 != null) {
            return h2;
        }
        kac.j(this, "Unsupported json primitive ");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.uyp
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        throw null;
    }

    @Override // defpackage.mx0
    public void w(jx7 jx7Var, int i2, int[] iArr, xof xofVar, int[] iArr2) {
        qx0.c(i2, iArr, iArr2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    @Override // defpackage.uyp
    public Object x(StartWaveQueueCommand startWaveQueueCommand) {
        Object obj;
        ?? r6;
        dd5 id;
        jzs jzsVar;
        startWaveQueueCommand.getClass();
        oyu oyuVar = startWaveQueueCommand.getStartRequest().c;
        r3q r3qVar = null;
        if (oyuVar instanceof kyu) {
            obj = ((kyu) oyuVar).a;
        } else if (oyuVar instanceof hyu) {
            obj = ((hyu) oyuVar).a;
        } else if (oyuVar instanceof iyu) {
            obj = new d0t((List) o8g.R(((iyu) oyuVar).a), true);
        } else {
            if (!(oyuVar instanceof jyu)) {
                b6e.s();
                return null;
            }
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        xsu xsuVar = startWaveQueueCommand.getStartRequest().a;
        wsu wsuVar = xsuVar instanceof wsu ? (wsu) xsuVar : null;
        List list = wsuVar != null ? wsuVar.a : null;
        xsu xsuVar2 = startWaveQueueCommand.getStartRequest().a;
        wsu wsuVar2 = xsuVar2 instanceof wsu ? (wsu) xsuVar2 : null;
        List list2 = wsuVar2 != null ? wsuVar2.a : null;
        izs izsVar = (list2 == null || (jzsVar = (jzs) CollectionsKt.firstOrNull(list2)) == null) ? null : jzsVar.g;
        b6v b6vVar = izsVar instanceof b6v ? (b6v) izsVar : null;
        r3q r3qVar2 = b6vVar != null ? b6vVar.a : null;
        if (r3qVar2 != null) {
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    izs izsVar2 = ((jzs) it.next()).g;
                    b6v b6vVar2 = izsVar2 instanceof b6v ? (b6v) izsVar2 : null;
                    if (!Intrinsics.d(b6vVar2 != null ? b6vVar2.a : null, r3qVar2)) {
                        break;
                    }
                }
            }
            r3qVar = r3qVar2;
        }
        if (r3qVar != null && (id = r3qVar.getId()) != null) {
            return id;
        }
        if (list != null) {
            List list4 = list;
            r6 = new ArrayList(v75.o(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                r6.add(((jzs) it2.next()).a.a);
            }
        } else {
            r6 = c5b.a;
        }
        return new cd5(r6);
    }
}
