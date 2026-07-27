package N6;

import D.y;
import F.d;
import I6.g;
import J6.k;
import L6.j;
import L6.n;
import O6.e;
import U6.c;
import a7.f;
import com.google.android.gms.internal.ads.C3112dq;
import i8.q;
import i8.r;
import i8.s;
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
import l7.C4707a;

/* loaded from: classes2.dex */
public final class b implements f {

    /* renamed from: n, reason: collision with root package name */
    public final g f2195n;

    /* renamed from: u, reason: collision with root package name */
    public final I6.b f2196u;

    /* renamed from: v, reason: collision with root package name */
    public final d f2197v;

    public b(g gVar, I6.b bVar) {
        this.f2195n = gVar;
        this.f2196u = bVar;
        this.f2197v = new d(new a(bVar));
    }

    @Override // a7.f
    public final c e(Collection collection) {
        boolean z8 = true;
        d dVar = this.f2197v;
        a aVar = (a) dVar.f910d;
        if (dVar.f908b == 1) {
            M6.c cVar = (M6.c) ((ConcurrentLinkedDeque) dVar.f909c).poll();
            if (cVar == null) {
                cVar = new M6.c();
            }
            cVar.d(collection);
            c cVar2 = (c) aVar.apply(cVar, Integer.valueOf(collection.size()));
            cVar2.f(new D5.b(4, dVar, cVar));
            return cVar2;
        }
        G6.b bVar = new G6.b(13);
        int i = k.f1435a;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        for (Object obj : collection) {
            Y6.a aVar2 = (Y6.a) obj;
            ((List) ((Map) identityHashMap.computeIfAbsent(aVar2.k(), new G6.b(2))).computeIfAbsent(aVar2.l(), new G6.b(3))).add(bVar.apply(obj));
        }
        j[] jVarArr = new j[identityHashMap.size()];
        int i4 = 0;
        for (Map.Entry entry : identityHashMap.entrySet()) {
            j[] jVarArr2 = new j[((Map) entry.getValue()).size()];
            int i9 = 0;
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                jVarArr2[i9] = new j(L6.k.d((U6.a) entry2.getKey()), k.f(((U6.a) entry2.getKey()).f3303c), (List) entry2.getValue());
                i9++;
                z8 = z8;
            }
            jVarArr[i4] = new j(n.d((C4707a) entry.getKey()), k.f(((C4707a) entry.getKey()).f39081a), jVarArr2);
            i4++;
            z8 = z8;
        }
        return (c) aVar.apply(new L6.c(jVarArr), Integer.valueOf(collection.size()));
    }

    @Override // a7.f
    public final c shutdown() {
        Socket socket;
        I6.b bVar = this.f2196u;
        if (!bVar.f1266b.compareAndSet(false, true)) {
            bVar.f1265a.a(Level.INFO, "Calling shutdown() multiple times.", null);
            return c.f3310e;
        }
        e eVar = bVar.f1268d;
        C3112dq c3112dq = eVar.f2536b.f37473a;
        synchronized (c3112dq) {
            try {
                Iterator it = ((ArrayDeque) c3112dq.f30235w).iterator();
                h.d(it, "iterator(...)");
                while (it.hasNext()) {
                    ((i8.n) it.next()).f38387v.h();
                }
                Iterator it2 = ((ArrayDeque) c3112dq.f30236x).iterator();
                h.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((i8.n) it2.next()).f38387v.h();
                }
                Iterator it3 = ((ArrayDeque) c3112dq.f30237y).iterator();
                h.d(it3, "iterator(...)");
                while (it3.hasNext()) {
                    ((q) it3.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar.f2535a) {
            ((ThreadPoolExecutor) eVar.f2536b.f37473a.d()).shutdownNow();
        }
        s sVar = (s) eVar.f2536b.f37472B.f38233u;
        Iterator it4 = sVar.f38428f.iterator();
        h.d(it4, "iterator(...)");
        while (it4.hasNext()) {
            r rVar = (r) it4.next();
            h.b(rVar);
            synchronized (rVar) {
                if (rVar.f38421r.isEmpty()) {
                    it4.remove();
                    rVar.f38415l = true;
                    socket = rVar.f38410f;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                f8.d.c(socket);
            }
        }
        if (sVar.f38428f.isEmpty()) {
            sVar.f38426d.a();
        }
        Iterator it5 = sVar.f38425c.values().iterator();
        if (it5.hasNext()) {
            throw y.h(it5);
        }
        return c.f3310e;
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.f2195n.a(false));
        int i = this.f2197v.f908b;
        stringJoiner.add("memoryMode=".concat(i != 1 ? i != 2 ? "null" : "IMMUTABLE_DATA" : "REUSABLE_DATA"));
        return stringJoiner.toString();
    }
}
