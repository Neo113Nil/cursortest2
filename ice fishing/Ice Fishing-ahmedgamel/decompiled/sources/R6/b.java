package R6;

import D.x;
import F.d;
import F.n;
import M6.g;
import N6.k;
import P6.j;
import S6.f;
import Y6.c;
import c7.InterfaceC0556a;
import com.google.android.gms.internal.ads.C2964aq;
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
import m8.m;
import m8.p;
import m8.q;
import m8.r;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: n, reason: collision with root package name */
    public final g f2882n;

    /* renamed from: u, reason: collision with root package name */
    public final M6.b f2883u;

    /* renamed from: v, reason: collision with root package name */
    public final d f2884v;

    public b(g gVar, M6.b bVar) {
        this.f2882n = gVar;
        this.f2883u = bVar;
        this.f2884v = new d(new a(bVar));
    }

    @Override // e7.e
    public final c f(Collection collection) {
        boolean z6 = true;
        d dVar = this.f2884v;
        a aVar = (a) dVar.f919d;
        if (dVar.f917b == 1) {
            Q6.c cVar = (Q6.c) ((ConcurrentLinkedDeque) dVar.f918c).poll();
            if (cVar == null) {
                cVar = new Q6.c();
            }
            cVar.d(collection);
            c cVar2 = (c) aVar.apply(cVar, Integer.valueOf(collection.size()));
            cVar2.f(new n(5, dVar, cVar));
            return cVar2;
        }
        K6.b bVar = new K6.b(13);
        int i = k.f2076a;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        for (Object obj : collection) {
            InterfaceC0556a interfaceC0556a = (InterfaceC0556a) obj;
            ((List) ((Map) identityHashMap.computeIfAbsent(interfaceC0556a.k(), new K6.b(2))).computeIfAbsent(interfaceC0556a.l(), new K6.b(3))).add(bVar.apply(obj));
        }
        j[] jVarArr = new j[identityHashMap.size()];
        int i4 = 0;
        for (Map.Entry entry : identityHashMap.entrySet()) {
            j[] jVarArr2 = new j[((Map) entry.getValue()).size()];
            int i6 = 0;
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                jVarArr2[i6] = new j(P6.k.d((Y6.a) entry2.getKey()), k.f(((Y6.a) entry2.getKey()).f3912c), (List) entry2.getValue());
                i6++;
                z6 = z6;
            }
            jVarArr[i4] = new j(P6.n.d((C4853a) entry.getKey()), k.f(((C4853a) entry.getKey()).f39848a), jVarArr2);
            i4++;
            z6 = z6;
        }
        return (c) aVar.apply(new P6.c(jVarArr), Integer.valueOf(collection.size()));
    }

    @Override // e7.e
    public final c shutdown() {
        Socket socket;
        M6.b bVar = this.f2883u;
        if (!bVar.f1878b.compareAndSet(false, true)) {
            bVar.f1877a.a(Level.INFO, "Calling shutdown() multiple times.", null);
            return c.f3919e;
        }
        f fVar = bVar.f1880d;
        C2964aq c2964aq = fVar.f2983b.f38314a;
        synchronized (c2964aq) {
            try {
                Iterator it = ((ArrayDeque) c2964aq.f29919w).iterator();
                h.d(it, "iterator(...)");
                while (it.hasNext()) {
                    ((m) it.next()).f39532v.h();
                }
                Iterator it2 = ((ArrayDeque) c2964aq.f29920x).iterator();
                h.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((m) it2.next()).f39532v.h();
                }
                Iterator it3 = ((ArrayDeque) c2964aq.f29921y).iterator();
                h.d(it3, "iterator(...)");
                while (it3.hasNext()) {
                    ((p) it3.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fVar.f2982a) {
            ((ThreadPoolExecutor) fVar.f2983b.f38314a.d()).shutdownNow();
        }
        r rVar = (r) fVar.f2983b.f38313B.f38152u;
        Iterator it4 = rVar.f39573f.iterator();
        h.d(it4, "iterator(...)");
        while (it4.hasNext()) {
            q qVar = (q) it4.next();
            h.b(qVar);
            synchronized (qVar) {
                if (qVar.f39566r.isEmpty()) {
                    it4.remove();
                    qVar.f39560l = true;
                    socket = qVar.f39555f;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                j8.d.c(socket);
            }
        }
        if (rVar.f39573f.isEmpty()) {
            rVar.f39571d.a();
        }
        Iterator it5 = rVar.f39570c.values().iterator();
        if (it5.hasNext()) {
            throw x.i(it5);
        }
        return c.f3919e;
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.f2882n.a(false));
        int i = this.f2884v.f917b;
        stringJoiner.add("memoryMode=".concat(i != 1 ? i != 2 ? "null" : "IMMUTABLE_DATA" : "REUSABLE_DATA"));
        return stringJoiner.toString();
    }
}
