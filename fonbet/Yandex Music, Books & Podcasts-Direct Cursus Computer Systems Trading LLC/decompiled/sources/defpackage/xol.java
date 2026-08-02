package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xol {
    public final uzn a;
    public final udp b;
    public final ynf c;
    public final tf6 d;
    public volatile wol e;
    public vgl f;
    public String g;
    public LinkedHashMap h;
    public final ReentrantLock i;
    public UUID j;
    public final lu3 k;
    public final ConcurrentHashMap l;
    public final AtomicReference m;
    public final AtomicBoolean n;

    public xol(b7q b7qVar) {
        bdt I = hag.I(uzn.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        uzn uznVar = (uzn) qdcVar.C(I);
        bdt I2 = hag.I(udp.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        udp udpVar = (udp) qdcVar2.C(I2);
        bdt I3 = hag.I(ynf.class);
        qdc qdcVar3 = b7qVar.a;
        qdcVar3.getClass();
        ynf ynfVar = (ynf) qdcVar3.C(I3);
        tf6 e = gld.e(e.c(a4g.n(), dm6.b.I0(1)));
        this.a = uznVar;
        this.b = udpVar;
        this.c = ynfVar;
        this.d = e;
        this.h = new LinkedHashMap(1000);
        this.i = new ReentrantLock();
        this.j = UUID.randomUUID();
        this.k = new lu3(1);
        new AtomicReference(null);
        this.l = new ConcurrentHashMap();
        this.m = new AtomicReference(null);
        this.n = new AtomicBoolean(true);
    }

    public static final void a(xol xolVar, vgl vglVar, Integer num, fwk fwkVar) {
        xolVar.getClass();
        hjm hjmVar = num == null ? hjm.NONE : num.intValue() == 0 ? hjm.META_LOADED : num.intValue() < 100 ? hjm.PRACTICALLY_PREFETCHED : hjm.FULLY_PREFETCHED;
        nnd nndVar = xolVar.a.a;
        String str = vglVar.c;
        String S = asq.S(vglVar.d);
        String uuid = xolVar.j.toString();
        uuid.getClass();
        int intValue = num != null ? num.intValue() : 0;
        nndVar.getClass();
        str.getClass();
        fwkVar.getClass();
        qdc qdcVar = (qdc) nndVar.b;
        mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
        p3i p3iVar = new p3i(450);
        p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
        new bzn(str, S, uuid, intValue, hjmVar, fwkVar).d(p3iVar);
        LinkedHashMap a = p3iVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a.size()));
        for (Map.Entry entry : a.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
        }
        mibVar.b("CACHE_TRACK_DATA2", linkedHashMap);
    }

    public final void b(String str) {
        Set entrySet = this.l.entrySet();
        entrySet.getClass();
        z75.w(entrySet, new q1h(str, 12), true);
    }

    public final void c(Exception exc) {
        UUID uuid = this.j;
        uuid.getClass();
        if (Intrinsics.d(this.k.a.getAndSet(uuid), uuid)) {
            return;
        }
        vgl vglVar = this.f;
        String str = vglVar != null ? vglVar.c : null;
        String uuid2 = uuid.toString();
        vgl vglVar2 = this.f;
        be6 be6Var = vglVar2 != null ? vglVar2.d : null;
        nnd nndVar = this.a.a;
        nndVar.getClass();
        qdc qdcVar = (qdc) nndVar.b;
        mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
        p3i p3iVar = new p3i(450);
        p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
        new czn(str, be6Var != null ? asq.S(be6Var) : null, uuid2, null, null, exc.getClass().getName(), asq.U(exc)).d(p3iVar);
        LinkedHashMap a = p3iVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a.size()));
        for (Map.Entry entry : a.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
        }
        mibVar.b("CACHE_UNAVAILABLE_FALLBACK", linkedHashMap);
    }

    public final void d(vgl vglVar) {
        wol wolVar = this.e;
        if (!Intrinsics.d(wolVar != null ? wolVar.a : null, vglVar)) {
            ssg.a(5, "PlayerStateToReporterTransferer", "Can't writeTrackUrlReceivedTime", null);
            return;
        }
        ynf ynfVar = this.c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        wnf wnfVar = ynfVar.a;
        if (wnfVar == null) {
            ssg.a(3, "LaunchTrackMetricsHelper", "LaunchTrackMetrics not initialized", null);
        } else if (wnfVar.b == null) {
            ynfVar.a = wnf.a(wnfVar, null, Long.valueOf(elapsedRealtime), null, null, 13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r8 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(tim timVar) {
        zvs zvsVar = timVar.a;
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
            tim timVar2 = (tim) this.h.get(zvsVar.a);
            if (this.h.size() > 1000) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set entrySet = this.h.entrySet();
                entrySet.getClass();
                for (Map.Entry entry : CollectionsKt.L(entrySet, 500)) {
                    entry.getClass();
                    Object key = entry.getKey();
                    key.getClass();
                    Object value = entry.getValue();
                    value.getClass();
                    linkedHashMap.put((String) key, (tim) value);
                }
                this.h = linkedHashMap;
            }
            if (timVar2 instanceof sim) {
                if (timVar instanceof rim) {
                    timVar = null;
                }
                if (timVar == null) {
                    timVar = timVar2;
                }
                this.h.put(zvsVar.a, timVar);
                reentrantLock.unlock();
            }
            if (timVar2 instanceof qim) {
                if (!(timVar instanceof sim)) {
                    timVar = null;
                }
            } else if (!(timVar2 instanceof rim) && timVar2 != null) {
                throw new x7j();
            }
            this.h.put(zvsVar.a, timVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
