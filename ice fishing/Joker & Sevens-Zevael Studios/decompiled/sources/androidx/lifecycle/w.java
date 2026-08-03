package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f721a;

    /* renamed from: b, reason: collision with root package name */
    public o.a f722b;

    /* renamed from: c, reason: collision with root package name */
    public p f723c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f724d;

    /* renamed from: e, reason: collision with root package name */
    public int f725e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f727g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f728h;

    /* renamed from: i, reason: collision with root package name */
    public final bd.e0 f729i;

    public w(u uVar, boolean z10) {
        new AtomicReference(null);
        this.f721a = z10;
        this.f722b = new o.a();
        p pVar = p.f698h;
        this.f723c = pVar;
        this.f728h = new ArrayList();
        this.f724d = new WeakReference(uVar);
        this.f729i = bd.u.a(pVar);
    }

    public final void a(t tVar) {
        s hVar;
        Object obj;
        u uVar;
        pc.j.e(tVar, "observer");
        c("addObserver");
        p pVar = this.f723c;
        p pVar2 = p.f697g;
        if (pVar != pVar2) {
            pVar2 = p.f698h;
        }
        v vVar = new v();
        HashMap hashMap = y.f734a;
        boolean z10 = tVar instanceof s;
        boolean z11 = tVar instanceof f;
        if (z10 && z11) {
            hVar = new h((f) tVar, (s) tVar);
        } else if (z11) {
            hVar = new h((f) tVar, (s) null);
        } else if (z10) {
            hVar = (s) tVar;
        } else {
            Class<?> cls = tVar.getClass();
            if (y.b(cls) == 2) {
                Object obj2 = y.f735b.get(cls);
                pc.j.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    y.a((Constructor) list.get(0), tVar);
                    throw null;
                }
                int size = list.size();
                j[] jVarArr = new j[size];
                if (size > 0) {
                    y.a((Constructor) list.get(0), tVar);
                    throw null;
                }
                hVar = new e(r6, jVarArr);
            } else {
                hVar = new h(tVar);
            }
        }
        vVar.f720b = hVar;
        vVar.f719a = pVar2;
        o.a aVar = this.f722b;
        o.c a6 = aVar.a(tVar);
        if (a6 != null) {
            obj = a6.f5117h;
        } else {
            HashMap hashMap2 = aVar.f5112k;
            o.c cVar = new o.c(tVar, vVar);
            aVar.f5126j++;
            o.c cVar2 = aVar.f5124h;
            if (cVar2 == null) {
                aVar.f5123g = cVar;
                aVar.f5124h = cVar;
            } else {
                cVar2.f5118i = cVar;
                cVar.f5119j = cVar2;
                aVar.f5124h = cVar;
            }
            hashMap2.put(tVar, cVar);
            obj = null;
        }
        if (((v) obj) == null && (uVar = (u) this.f724d.get()) != null) {
            r6 = (this.f725e != 0 || this.f726f) ? 1 : 0;
            p b2 = b(tVar);
            this.f725e++;
            while (vVar.f719a.compareTo(b2) < 0 && this.f722b.f5112k.containsKey(tVar)) {
                p pVar3 = vVar.f719a;
                ArrayList arrayList = this.f728h;
                arrayList.add(pVar3);
                m mVar = o.Companion;
                p pVar4 = vVar.f719a;
                mVar.getClass();
                pc.j.e(pVar4, "state");
                int ordinal = pVar4.ordinal();
                o oVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : o.ON_RESUME : o.ON_START : o.ON_CREATE;
                if (oVar == null) {
                    throw new IllegalStateException("no event up from " + vVar.f719a);
                }
                vVar.a(uVar, oVar);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(tVar);
            }
            if (r6 == 0) {
                g();
            }
            this.f725e--;
        }
    }

    public final p b(t tVar) {
        HashMap hashMap = this.f722b.f5112k;
        o.c cVar = hashMap.containsKey(tVar) ? ((o.c) hashMap.get(tVar)).f5119j : null;
        p pVar = cVar != null ? ((v) cVar.f5117h).f719a : null;
        ArrayList arrayList = this.f728h;
        p pVar2 = arrayList.isEmpty() ? null : (p) arrayList.get(arrayList.size() - 1);
        p pVar3 = this.f723c;
        pc.j.e(pVar3, "state1");
        if (pVar == null || pVar.compareTo(pVar3) >= 0) {
            pVar = pVar3;
        }
        return (pVar2 == null || pVar2.compareTo(pVar) >= 0) ? pVar : pVar2;
    }

    public final void c(String str) {
        if (this.f721a) {
            n.a.a0().f4973d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(a4.d.j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(o oVar) {
        pc.j.e(oVar, "event");
        c("handleLifecycleEvent");
        e(oVar.a());
    }

    public final void e(p pVar) {
        if (this.f723c == pVar) {
            return;
        }
        u uVar = (u) this.f724d.get();
        p pVar2 = this.f723c;
        pc.j.e(pVar2, "current");
        p pVar3 = p.f698h;
        p pVar4 = p.f697g;
        if (pVar2 == pVar3 && pVar == pVar4) {
            throw new IllegalStateException(("State must be at least '" + p.f699i + "' to be moved to '" + pVar + "' in component " + uVar).toString());
        }
        if (pVar2 == pVar4 && pVar2 != pVar) {
            throw new IllegalStateException(("State is '" + pVar4 + "' and cannot be moved to `" + pVar + "` in component " + uVar).toString());
        }
        this.f723c = pVar;
        if (this.f726f || this.f725e != 0) {
            this.f727g = true;
            return;
        }
        this.f726f = true;
        g();
        this.f726f = false;
        if (this.f723c == pVar4) {
            this.f722b = new o.a();
        }
    }

    public final void f(t tVar) {
        pc.j.e(tVar, "observer");
        c("removeObserver");
        this.f722b.b(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r12.f727g = false;
        r0 = r12.f723c;
        r1 = r12.f729i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = cd.c.f1342b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.h(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        u uVar = (u) this.f724d.get();
        if (uVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            o.a aVar = this.f722b;
            if (aVar.f5126j != 0) {
                o.c cVar = aVar.f5123g;
                pc.j.b(cVar);
                p pVar = ((v) cVar.f5117h).f719a;
                o.c cVar2 = this.f722b.f5124h;
                pc.j.b(cVar2);
                p pVar2 = ((v) cVar2.f5117h).f719a;
                if (pVar == pVar2 && this.f723c == pVar2) {
                    break;
                }
                this.f727g = false;
                p pVar3 = this.f723c;
                o.c cVar3 = this.f722b.f5123g;
                pc.j.b(cVar3);
                int compareTo = pVar3.compareTo(((v) cVar3.f5117h).f719a);
                ArrayList arrayList = this.f728h;
                if (compareTo < 0) {
                    o.a aVar2 = this.f722b;
                    o.b bVar = new o.b(aVar2.f5124h, aVar2.f5123g, 1);
                    aVar2.f5125i.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f727g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        pc.j.b(entry);
                        t tVar = (t) entry.getKey();
                        v vVar = (v) entry.getValue();
                        while (vVar.f719a.compareTo(this.f723c) > 0 && !this.f727g && this.f722b.f5112k.containsKey(tVar)) {
                            m mVar = o.Companion;
                            p pVar4 = vVar.f719a;
                            mVar.getClass();
                            pc.j.e(pVar4, "state");
                            int ordinal = pVar4.ordinal();
                            o oVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : o.ON_PAUSE : o.ON_STOP : o.ON_DESTROY;
                            if (oVar == null) {
                                throw new IllegalStateException("no event down from " + vVar.f719a);
                            }
                            arrayList.add(oVar.a());
                            vVar.a(uVar, oVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                o.c cVar4 = this.f722b.f5124h;
                if (!this.f727g && cVar4 != null && this.f723c.compareTo(((v) cVar4.f5117h).f719a) > 0) {
                    o.a aVar3 = this.f722b;
                    aVar3.getClass();
                    o.d dVar = new o.d(aVar3);
                    aVar3.f5125i.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f727g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        t tVar2 = (t) entry2.getKey();
                        v vVar2 = (v) entry2.getValue();
                        while (vVar2.f719a.compareTo(this.f723c) < 0 && !this.f727g && this.f722b.f5112k.containsKey(tVar2)) {
                            arrayList.add(vVar2.f719a);
                            m mVar2 = o.Companion;
                            p pVar5 = vVar2.f719a;
                            mVar2.getClass();
                            pc.j.e(pVar5, "state");
                            int ordinal2 = pVar5.ordinal();
                            o oVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : o.ON_RESUME : o.ON_START : o.ON_CREATE;
                            if (oVar2 == null) {
                                throw new IllegalStateException("no event up from " + vVar2.f719a);
                            }
                            vVar2.a(uVar, oVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
