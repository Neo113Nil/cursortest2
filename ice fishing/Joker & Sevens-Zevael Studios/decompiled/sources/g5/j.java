package g5;

import ac.m;
import ac.o;
import bc.a0;
import java.io.Closeable;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public final h4.d f2530g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f2531h;

    /* renamed from: i, reason: collision with root package name */
    public final m f2532i;

    /* renamed from: j, reason: collision with root package name */
    public final i f2533j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f2534k;

    public j(h4.d dVar, i4.c cVar, int i10) {
        this.f2530g = dVar;
        if (!((dVar != null) ^ (cVar != null))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f2531h = new ThreadLocal();
        this.f2532i = a0.y(new c1.b(2, this, cVar));
        this.f2533j = new i(i10);
        this.f2534k = new LinkedHashMap();
    }

    public final f5.d a(Integer num, String str, oc.c cVar) {
        return new f5.d(b(num, new c1.b(3, this, str), cVar, f.f2524g));
    }

    public final Object b(Integer num, oc.a aVar, oc.c cVar, oc.c cVar2) {
        i iVar = this.f2533j;
        k kVar = num != null ? (k) iVar.remove(num) : null;
        if (kVar == null) {
            kVar = (k) aVar.invoke();
        }
        if (cVar != null) {
            try {
                cVar.invoke(kVar);
            } catch (Throwable th) {
                if (num != null) {
                    k kVar2 = (k) iVar.put(num, kVar);
                    if (kVar2 != null) {
                        kVar2.close();
                    }
                } else {
                    kVar.close();
                }
                throw th;
            }
        }
        Object invoke = cVar2.invoke(kVar);
        if (num == null) {
            kVar.close();
            return invoke;
        }
        k kVar3 = (k) iVar.put(num, kVar);
        if (kVar3 != null) {
            kVar3.close();
        }
        return invoke;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o oVar;
        this.f2533j.evictAll();
        h4.d dVar = this.f2530g;
        if (dVar != null) {
            dVar.close();
            oVar = o.f277a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            ((i4.c) this.f2532i.getValue()).close();
        }
    }

    public final f5.d d(Integer num, String str, oc.c cVar, int i10, k2.e eVar) {
        pc.j.e(str, "sql");
        return new f5.d(b(num, new g(str, this, i10), eVar, new h(0, cVar)));
    }

    public /* synthetic */ j(i4.c cVar) {
        this(null, cVar, 1);
    }
}
