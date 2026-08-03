package w0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final pc.k f7606a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7608c;

    /* renamed from: h, reason: collision with root package name */
    public c6.f f7613h;

    /* renamed from: i, reason: collision with root package name */
    public s f7614i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f7607b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final ae.b f7609d = new ae.b(6, this);

    /* renamed from: e, reason: collision with root package name */
    public final k2.e f7610e = new k2.e(13, this);

    /* renamed from: f, reason: collision with root package name */
    public final o0.e f7611f = new o0.e(new s[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f7612g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public long f7615j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public t(oc.c cVar) {
        this.f7606a = (pc.k) cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z10;
        Set set;
        Set set2;
        synchronized (this.f7612g) {
            z10 = this.f7608c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f7607b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        m0.t.d("Unexpected notification");
                        throw new ac.d();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z11;
            }
            synchronized (this.f7612g) {
                o0.e eVar = this.f7611f;
                Object[] objArr = eVar.f5134g;
                int i10 = eVar.f5136i;
                for (int i11 = 0; i11 < i10; i11++) {
                    z11 = ((s) objArr[i11]).b(set) || z11;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void b() {
        ae.b bVar = this.f7609d;
        m.f(m.f7578a);
        synchronized (m.f7580c) {
            m.f7585h = bc.m.Z(m.f7585h, bVar);
        }
        this.f7613h = new c6.f(13, bVar);
    }
}
