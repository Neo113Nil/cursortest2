package R6;

import D.y;
import F.d;
import F.n;
import M6.g;
import N6.k;
import P6.j;
import Y6.c;
import c7.InterfaceC0545a;
import com.google.android.gms.internal.ads.C2941aq;
import e7.e;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import kotlin.jvm.internal.h;
import m8.q;
import m8.r;
import m8.s;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: n, reason: collision with root package name */
    public final g f2755n;

    /* renamed from: u, reason: collision with root package name */
    public final M6.b f2756u;

    /* renamed from: v, reason: collision with root package name */
    public final d f2757v;

    public b(g gVar, M6.b bVar) {
        this.f2755n = gVar;
        this.f2756u = bVar;
        this.f2757v = new d(new a(bVar));
    }

    @Override // e7.e
    public final c f(Collection collection) {
        boolean z3 = true;
        d dVar = this.f2757v;
        a aVar = (a) dVar.f856d;
        if (dVar.f854b == 1) {
            Q6.c cVar = (Q6.c) ((ConcurrentLinkedDeque) dVar.f855c).poll();
            if (cVar == null) {
                cVar = new Q6.c();
            }
            cVar.d(collection);
            c cVar2 = (c) aVar.apply(cVar, Integer.valueOf(collection.size()));
            cVar2.f(new n(5, dVar, cVar));
            return cVar2;
        }
        K6.b bVar = new K6.b(13);
        int i = k.f1988a;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        for (Object obj : collection) {
            InterfaceC0545a interfaceC0545a = (InterfaceC0545a) obj;
            ((List) ((Map) identityHashMap.computeIfAbsent(interfaceC0545a.k(), new K6.b(2))).computeIfAbsent(interfaceC0545a.l(), new K6.b(3))).add(bVar.apply(obj));
        }
        j[] jVarArr = new j[identityHashMap.size()];
        int i6 = 0;
        for (Map.Entry entry : identityHashMap.entrySet()) {
            j[] jVarArr2 = new j[((Map) entry.getValue()).size()];
            int i9 = 0;
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                jVarArr2[i9] = new j(P6.k.d((Y6.a) entry2.getKey()), k.f(((Y6.a) entry2.getKey()).f3968c), (List) entry2.getValue());
                i9++;
                z3 = z3;
            }
            jVarArr[i6] = new j(P6.n.d((C4853a) entry.getKey()), k.f(((C4853a) entry.getKey()).f39798a), jVarArr2);
            i6++;
            z3 = z3;
        }
        return (c) aVar.apply(new P6.c(jVarArr), Integer.valueOf(collection.size()));
    }

    @Override // e7.e
    public final c shutdown() {
        Socket socket;
        M6.b bVar = this.f2756u;
        if (!bVar.f1876b.compareAndSet(false, true)) {
            bVar.f1875a.a(Level.INFO, "Calling shutdown() multiple times.", null);
            return c.f3975e;
        }
        S6.e eVar = bVar.f1878d;
        C2941aq c2941aq = eVar.f2900b.f38195a;
        synchronized (c2941aq) {
            try {
                Iterator it = ((ArrayDeque) c2941aq.f29134w).iterator();
                h.d(it, "iterator(...)");
                while (it.hasNext()) {
                    ((m8.n) it.next()).f39375v.h();
                }
                Iterator it2 = ((ArrayDeque) c2941aq.f29135x).iterator();
                h.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((m8.n) it2.next()).f39375v.h();
                }
                Iterator it3 = ((ArrayDeque) c2941aq.f29136y).iterator();
                h.d(it3, "iterator(...)");
                while (it3.hasNext()) {
                    ((q) it3.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar.f2899a) {
            ((ThreadPoolExecutor) eVar.f2900b.f38195a.d()).shutdownNow();
        }
        s sVar = (s) eVar.f2900b.f38194B.f1264u;
        Iterator it4 = sVar.f39416f.iterator();
        h.d(it4, "iterator(...)");
        while (it4.hasNext()) {
            r rVar = (r) it4.next();
            h.b(rVar);
            synchronized (rVar) {
                if (rVar.f39409r.isEmpty()) {
                    it4.remove();
                    rVar.f39403l = true;
                    socket = rVar.f39398f;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                j8.d.c(socket);
            }
        }
        if (sVar.f39416f.isEmpty()) {
            sVar.f39414d.a();
        }
        Iterator it5 = sVar.f39413c.values().iterator();
        if (it5.hasNext()) {
            throw y.j(it5);
        }
        return c.f3975e;
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.f2755n.a(false));
        int i = this.f2757v.f854b;
        stringJoiner.add("memoryMode=".concat(i != 1 ? i != 2 ? "null" : "IMMUTABLE_DATA" : "REUSABLE_DATA"));
        return stringJoiner.toString();
    }
}
