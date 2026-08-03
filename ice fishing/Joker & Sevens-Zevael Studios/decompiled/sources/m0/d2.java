package m0;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d2 extends v {

    /* renamed from: x, reason: collision with root package name */
    public static final bd.e0 f4547x = bd.u.a(s0.b.f6370j);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReference f4548y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final f f4549a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4550b;

    /* renamed from: c, reason: collision with root package name */
    public yc.b1 f4551c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f4552d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4553e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4554f;

    /* renamed from: g, reason: collision with root package name */
    public s.h0 f4555g;

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f4556h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4557i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4558j;

    /* renamed from: k, reason: collision with root package name */
    public final s.g0 f4559k;

    /* renamed from: l, reason: collision with root package name */
    public final x4.e f4560l;

    /* renamed from: m, reason: collision with root package name */
    public final s.g0 f4561m;

    /* renamed from: n, reason: collision with root package name */
    public final s.g0 f4562n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4563o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashSet f4564p;

    /* renamed from: q, reason: collision with root package name */
    public yc.g f4565q;

    /* renamed from: r, reason: collision with root package name */
    public f8.c f4566r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4567s;

    /* renamed from: t, reason: collision with root package name */
    public final bd.e0 f4568t;

    /* renamed from: u, reason: collision with root package name */
    public final yc.e1 f4569u;

    /* renamed from: v, reason: collision with root package name */
    public final fc.i f4570v;

    /* renamed from: w, reason: collision with root package name */
    public final z0 f4571w;

    public d2(fc.i iVar) {
        f fVar = new f(new androidx.lifecycle.n0(2, this));
        this.f4549a = fVar;
        this.f4550b = new Object();
        this.f4553e = new ArrayList();
        this.f4555g = new s.h0();
        this.f4556h = new o0.e(new y[16]);
        this.f4557i = new ArrayList();
        this.f4558j = new ArrayList();
        this.f4559k = new s.g0();
        this.f4560l = new x4.e(6);
        this.f4561m = new s.g0();
        this.f4562n = new s.g0();
        this.f4568t = bd.u.a(z1.f4848i);
        new a5.c(19);
        yc.e1 e1Var = new yc.e1((yc.b1) iVar.v(yc.v.f8910h));
        e1Var.k(new k2.e(2, this));
        this.f4569u = e1Var;
        this.f4570v = iVar.d(fVar).d(e1Var);
        this.f4571w = new z0(8);
    }

    public static void r(w0.c cVar) {
        try {
            if (cVar.w() instanceof w0.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.c();
        }
    }

    public static final void x(ArrayList arrayList, d2 d2Var, y yVar) {
        arrayList.clear();
        synchronized (d2Var.f4550b) {
            Iterator it = d2Var.f4558j.iterator();
            if (it.hasNext()) {
                ((c1) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void A(Throwable th, y yVar) {
        if (!((Boolean) f4548y.get()).booleanValue() || (th instanceof k)) {
            synchronized (this.f4550b) {
                f8.c cVar = this.f4566r;
                if (cVar != null) {
                    throw ((Throwable) cVar.f2340h);
                }
                this.f4566r = new f8.c(29, th);
            }
            throw th;
        }
        synchronized (this.f4550b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f4557i.clear();
                this.f4556h.g();
                this.f4555g = new s.h0();
                this.f4558j.clear();
                this.f4559k.a();
                this.f4561m.a();
                this.f4566r = new f8.c(29, th);
                if (yVar != null) {
                    C(yVar);
                }
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean B() {
        synchronized (this.f4550b) {
            boolean z10 = true;
            if (this.f4555g.g()) {
                if (this.f4556h.f5136i == 0 && !u() && !this.f4559k.j()) {
                    z10 = false;
                }
                return z10;
            }
            List w3 = w();
            o0.h hVar = new o0.h(this.f4555g);
            this.f4555g = new s.h0();
            try {
                int size = w3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((y) w3.get(i10)).x(hVar);
                    if (((z1) this.f4568t.getValue()).compareTo(z1.f4847h) <= 0) {
                        break;
                    }
                }
                synchronized (this.f4550b) {
                    if (t() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f4556h.f5136i == 0 && !u() && !this.f4559k.j()) {
                        z10 = false;
                    }
                }
                return z10;
            } catch (Throwable th) {
                synchronized (this.f4550b) {
                    s.h0 h0Var = this.f4555g;
                    h0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        h0Var.i(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void C(y yVar) {
        ArrayList arrayList = this.f4563o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4563o = arrayList;
        }
        if (!arrayList.contains(yVar)) {
            arrayList.add(yVar);
        }
        if (this.f4553e.remove(yVar)) {
            this.f4554f = null;
        }
    }

    @Override // m0.v
    public final void a(y yVar, oc.e eVar) {
        Object obj;
        boolean z10;
        w0.c C;
        boolean z11 = yVar.f4832z.F;
        synchronized (this.f4550b) {
            obj = null;
            if (((z1) this.f4568t.getValue()).compareTo(z1.f4847h) > 0) {
                boolean contains = w().contains(yVar);
                z10 = !contains;
                if (!contains) {
                    this.f4553e.add(yVar);
                    this.f4554f = null;
                }
            } else {
                z10 = true;
            }
        }
        try {
            k2.e eVar2 = new k2.e(1, yVar);
            ae.a aVar = new ae.a(1, yVar, obj);
            w0.g k3 = w0.m.k();
            w0.c cVar = k3 instanceof w0.c ? (w0.c) k3 : null;
            if (cVar == null || (C = cVar.C(eVar2, aVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                w0.g j3 = C.j();
                try {
                    yVar.j(eVar);
                    if (!z11) {
                        w0.m.k().m();
                    }
                    try {
                        synchronized (this.f4550b) {
                            ArrayList arrayList = this.f4558j;
                            if (arrayList.size() > 0) {
                                ((c1) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            yVar.d();
                            yVar.f();
                            if (z11) {
                                return;
                            }
                            w0.m.k().m();
                        } catch (Throwable th) {
                            A(th, null);
                        }
                    } catch (Throwable th2) {
                        A(th2, yVar);
                    }
                } finally {
                    w0.g.q(j3);
                }
            } finally {
                r(C);
            }
        } catch (Throwable th3) {
            A(th3, yVar);
            if (z10) {
                synchronized (this.f4550b) {
                    if (this.f4553e.remove(yVar)) {
                        this.f4554f = null;
                    }
                }
            }
        }
    }

    @Override // m0.v
    public final boolean c() {
        return ((Boolean) f4548y.get()).booleanValue();
    }

    @Override // m0.v
    public final boolean d() {
        return false;
    }

    @Override // m0.v
    public final boolean e() {
        return false;
    }

    @Override // m0.v
    public final long f() {
        return 1000;
    }

    @Override // m0.v
    public final u g() {
        return null;
    }

    @Override // m0.v
    public final fc.i i() {
        return this.f4570v;
    }

    @Override // m0.v
    public final void j(y yVar) {
        yc.f fVar;
        synchronized (this.f4550b) {
            if (this.f4556h.h(yVar)) {
                fVar = null;
            } else {
                this.f4556h.b(yVar);
                fVar = t();
            }
        }
        if (fVar != null) {
            ((yc.g) fVar).resumeWith(ac.o.f277a);
        }
    }

    @Override // m0.v
    public final b1 k(c1 c1Var) {
        b1 b1Var;
        synchronized (this.f4550b) {
            b1Var = (b1) this.f4561m.k(c1Var);
        }
        return b1Var;
    }

    @Override // m0.v
    public final void n(y yVar) {
        synchronized (this.f4550b) {
            try {
                LinkedHashSet linkedHashSet = this.f4564p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f4564p = linkedHashSet;
                }
                linkedHashSet.add(yVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.v
    public final void q(y yVar) {
        synchronized (this.f4550b) {
            if (this.f4553e.remove(yVar)) {
                this.f4554f = null;
            }
            this.f4556h.j(yVar);
            this.f4557i.remove(yVar);
        }
    }

    public final void s() {
        synchronized (this.f4550b) {
            if (((z1) this.f4568t.getValue()).compareTo(z1.f4850k) >= 0) {
                bd.e0 e0Var = this.f4568t;
                z1 z1Var = z1.f4847h;
                e0Var.getClass();
                e0Var.h(null, z1Var);
            }
        }
        this.f4569u.a(null);
    }

    public final yc.f t() {
        bd.e0 e0Var = this.f4568t;
        int compareTo = ((z1) e0Var.getValue()).compareTo(z1.f4847h);
        ArrayList arrayList = this.f4558j;
        ArrayList arrayList2 = this.f4557i;
        o0.e eVar = this.f4556h;
        if (compareTo <= 0) {
            for (y yVar : w()) {
            }
            this.f4553e.clear();
            this.f4554f = bc.v.f1067g;
            this.f4555g = new s.h0();
            eVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f4563o = null;
            yc.g gVar = this.f4565q;
            if (gVar != null) {
                gVar.n(null);
            }
            this.f4565q = null;
            this.f4566r = null;
            return null;
        }
        f8.c cVar = this.f4566r;
        z1 z1Var = z1.f4851l;
        z1 z1Var2 = z1.f4848i;
        if (cVar == null) {
            if (this.f4551c == null) {
                this.f4555g = new s.h0();
                eVar.g();
                if (u()) {
                    z1Var2 = z1.f4849j;
                }
            } else {
                z1Var2 = (eVar.f5136i == 0 && !this.f4555g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !u() && !this.f4559k.j()) ? z1.f4850k : z1Var;
            }
        }
        e0Var.getClass();
        e0Var.h(null, z1Var2);
        if (z1Var2 != z1Var) {
            return null;
        }
        yc.g gVar2 = this.f4565q;
        this.f4565q = null;
        return gVar2;
    }

    public final boolean u() {
        return !this.f4567s && (this.f4549a.f4580j.get() & 134217727) > 0;
    }

    public final boolean v() {
        boolean z10;
        synchronized (this.f4550b) {
            if (!this.f4555g.h() && this.f4556h.f5136i == 0) {
                z10 = u();
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List w() {
        ?? r02 = this.f4554f;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f4553e;
        List arrayList2 = arrayList.isEmpty() ? bc.v.f1067g : new ArrayList(arrayList);
        this.f4554f = arrayList2;
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0139, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
    
        if (((ac.i) r10.get(r4)).f271h == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015b, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        r11 = (ac.i) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (r11.f271h != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
    
        r11 = (m0.c1) r11.f270g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016e, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0171, code lost:
    
        r4 = r17.f4550b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0173, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
    
        bc.s.Q(r3, r17.f4558j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0188, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0193, code lost:
    
        if (((ac.i) r11).f271h == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0195, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0198, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List y(List list, s.h0 h0Var) {
        w0.c C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            ((c1) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            y yVar = (y) entry.getKey();
            List list2 = (List) entry.getValue();
            if (yVar.f4832z.F) {
                t.c("Check failed");
            }
            k2.e eVar = new k2.e(1, yVar);
            ae.a aVar = new ae.a(1, yVar, h0Var);
            w0.g k3 = w0.m.k();
            w0.c cVar = k3 instanceof w0.c ? (w0.c) k3 : null;
            if (cVar == null || (C = cVar.C(eVar, aVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                w0.g j3 = C.j();
                try {
                    synchronized (this.f4550b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                c1 c1Var = (c1) list2.get(i11);
                                s.g0 g0Var = this.f4559k;
                                c1Var.getClass();
                                Object a6 = o0.a.a(g0Var);
                                arrayList.add(new ac.i(c1Var, a6));
                            }
                            int size3 = arrayList.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size3) {
                                    break;
                                }
                                ac.i iVar = (ac.i) arrayList.get(i12);
                                if (iVar.f271h == null) {
                                    x4.e eVar2 = this.f4560l;
                                    ((c1) iVar.f270g).getClass();
                                    if (((s.g0) eVar2.f8294g).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(bc.o.O(arrayList));
                                        int size4 = arrayList.size();
                                        int i13 = 0;
                                        while (i13 < size4) {
                                            Object obj3 = arrayList.get(i13);
                                            i13++;
                                            ac.i iVar2 = (ac.i) obj3;
                                            if (iVar2.f271h == null) {
                                                x4.e eVar3 = this.f4560l;
                                                ((c1) iVar2.f270g).getClass();
                                                s.g0 g0Var2 = (s.g0) eVar3.f8294g;
                                                if (g0Var2.i()) {
                                                    ((s.g0) eVar3.f8295h).a();
                                                }
                                            }
                                            arrayList2.add(iVar2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i12++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size5) {
                            break;
                        }
                        if (((ac.i) arrayList.get(i14)).f271h != null) {
                            break;
                        }
                        i14++;
                    }
                    yVar.q(arrayList);
                    w0.g.q(j3);
                } catch (Throwable th) {
                    w0.g.q(j3);
                    throw th;
                }
            } finally {
                r(C);
            }
        }
        return bc.m.e0(hashMap.keySet());
    }

    public final y z(y yVar, s.h0 h0Var) {
        w0.c C;
        if (yVar.f4832z.F || yVar.A == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f4564p;
        if (linkedHashSet == null || !linkedHashSet.contains(yVar)) {
            k2.e eVar = new k2.e(1, yVar);
            ae.a aVar = new ae.a(1, yVar, h0Var);
            w0.g k3 = w0.m.k();
            w0.c cVar = k3 instanceof w0.c ? (w0.c) k3 : null;
            if (cVar == null || (C = cVar.C(eVar, aVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                w0.g j3 = C.j();
                if (h0Var != null) {
                    try {
                        if (h0Var.h()) {
                            y1 y1Var = new y1(0, h0Var, yVar);
                            r rVar = yVar.f4832z;
                            if (rVar.F) {
                                t.c("Preparing a composition while composing is not supported");
                            }
                            rVar.F = true;
                            try {
                                y1Var.invoke();
                                rVar.F = false;
                            } catch (Throwable th) {
                                rVar.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        w0.g.q(j3);
                        throw th2;
                    }
                }
                boolean w3 = yVar.w();
                w0.g.q(j3);
                if (w3) {
                    return yVar;
                }
            } finally {
                r(C);
            }
        }
        return null;
    }

    @Override // m0.v
    public final void l(Set set) {
    }
}
