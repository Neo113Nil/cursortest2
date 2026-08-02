package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class cnn extends tr5 {
    public static final xdr y = ydr.a(emk.e);
    public static final AtomicReference z = new AtomicReference(Boolean.FALSE);
    public long a;
    public final wh3 b;
    public final Object c;
    public r2f d;
    public Throwable e;
    public final ArrayList f;
    public Object g;
    public upi h;
    public final eqi i;
    public final ArrayList j;
    public final ArrayList k;
    public final tpi l;
    public final nnd m;
    public final tpi n;
    public final tpi o;
    public ArrayList p;
    public LinkedHashSet q;
    public zt3 r;
    public f4m s;
    public boolean t;
    public final xdr u;
    public final w2f v;
    public final CoroutineContext w;
    public final rxk x;

    public cnn(CoroutineContext coroutineContext) {
        wh3 wh3Var = new wh3(new kgk(10, this));
        this.b = wh3Var;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new upi();
        this.i = new eqi(new wr5[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new tpi();
        this.m = new nnd(12);
        this.n = new tpi();
        this.o = new tpi();
        this.u = ydr.a(zmn.c);
        new AtomicReference(vut.j);
        w2f w2fVar = new w2f((r2f) coroutineContext.get(o6c.l));
        w2fVar.R(new ybg(20, this));
        this.v = w2fVar;
        this.w = coroutineContext.plus(wh3Var).plus(w2fVar);
        this.x = new rxk();
    }

    public static final void D(ArrayList arrayList, cnn cnnVar, wr5 wr5Var) {
        arrayList.clear();
        synchronized (cnnVar.c) {
            Iterator it = cnnVar.k.iterator();
            while (it.hasNext()) {
                mfi mfiVar = (mfi) it.next();
                if (mfiVar.c.equals(wr5Var)) {
                    arrayList.add(mfiVar);
                    it.remove();
                }
            }
        }
    }

    public static final wr5 t(cnn cnnVar, wr5 wr5Var, upi upiVar) {
        LinkedHashSet linkedHashSet;
        ypi C;
        if (!wr5Var.s.E && !wr5Var.t && ((linkedHashSet = cnnVar.q) == null || !linkedHashSet.contains(wr5Var))) {
            ybg ybgVar = new ybg(21, wr5Var);
            afg afgVar = new afg(24, wr5Var, upiVar);
            b2r k = g2r.k();
            ypi ypiVar = k instanceof ypi ? (ypi) k : null;
            if (ypiVar == null || (C = ypiVar.C(ybgVar, afgVar)) == null) {
                xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                b2r j = C.j();
                if (upiVar != null) {
                    try {
                        if (upiVar.i()) {
                            j5n j5nVar = new j5n(1, upiVar, wr5Var);
                            oq5 oq5Var = wr5Var.s;
                            if (oq5Var.E) {
                                pq5.c("Preparing a composition while composing is not supported");
                            }
                            oq5Var.E = true;
                            try {
                                j5nVar.invoke();
                                oq5Var.E = false;
                            } catch (Throwable th) {
                                oq5Var.E = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        b2r.q(j);
                        throw th2;
                    }
                }
                boolean x = wr5Var.x();
                b2r.q(j);
                if (x) {
                    return wr5Var;
                }
            } finally {
                v(C);
            }
        }
        return null;
    }

    public static final boolean u(cnn cnnVar) {
        List B;
        synchronized (cnnVar.c) {
            boolean z2 = true;
            if (cnnVar.h.h()) {
                if (cnnVar.i.c == 0 && !cnnVar.z()) {
                    z2 = false;
                }
                return z2;
            }
            yso ysoVar = new yso(cnnVar.h);
            cnnVar.h = new upi();
            synchronized (cnnVar.c) {
                B = cnnVar.B();
            }
            try {
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    ((wr5) B.get(i)).y(ysoVar);
                    if (((zmn) cnnVar.u.getValue()).compareTo(zmn.b) <= 0) {
                        break;
                    }
                }
                synchronized (cnnVar.c) {
                    cnnVar.h = new upi();
                }
                synchronized (cnnVar.c) {
                    if (cnnVar.y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (cnnVar.i.c == 0 && !cnnVar.z()) {
                        z2 = false;
                    }
                }
                return z2;
            } catch (Throwable th) {
                synchronized (cnnVar.c) {
                    cnnVar.h.b(ysoVar);
                    throw th;
                }
            }
        }
    }

    public static void v(ypi ypiVar) {
        try {
            if (ypiVar.w() instanceof c2r) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            ypiVar.c();
        }
    }

    public static final void x(cnn cnnVar, mfi mfiVar, mfi mfiVar2) {
        List list = mfiVar2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mfi mfiVar3 = (mfi) list.get(i);
                nnd nndVar = cnnVar.m;
                jfi jfiVar = mfiVar3.a;
                sgi.a((tpi) nndVar.b, jfiVar, new txi(mfiVar3, mfiVar));
                sgi.a((tpi) nndVar.c, mfiVar, jfiVar);
                x(cnnVar, mfiVar, mfiVar3);
            }
        }
    }

    public final boolean A() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.i() && this.i.c == 0) {
                z2 = z();
            }
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List B() {
        Object obj = this.g;
        ?? r0 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f;
            RandomAccess arrayList2 = arrayList.isEmpty() ? c5b.a : new ArrayList(arrayList);
            this.g = arrayList2;
            r0 = arrayList2;
        }
        return r0;
    }

    public final void C(wr5 wr5Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((mfi) arrayList.get(i)).c.equals(wr5Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    D(arrayList2, this, wr5Var);
                    while (!arrayList2.isEmpty()) {
                        E(arrayList2, null);
                        D(arrayList2, this, wr5Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c1, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0159, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
    
        if (r4 >= r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0168, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).b == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if (r8 >= r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017d, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0185, code lost:
    
        if (r11.b != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0187, code lost:
    
        r11 = (defpackage.mfi) r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018f, code lost:
    
        if (r11 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0191, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0194, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018e, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
    
        r4 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019a, code lost:
    
        defpackage.z75.t(r16.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a0, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ae, code lost:
    
        if (r8 >= r4) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b0, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b9, code lost:
    
        if (((kotlin.Pair) r11).b == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bb, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01be, code lost:
    
        r8 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List E(List list, upi upiVar) {
        ypi C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            wr5 wr5Var = ((mfi) obj).c;
            Object obj2 = hashMap.get(wr5Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(wr5Var, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            wr5 wr5Var2 = (wr5) entry.getKey();
            List list2 = (List) entry.getValue();
            if (wr5Var2.s.E) {
                pq5.c("Check failed");
            }
            ybg ybgVar = new ybg(21, wr5Var2);
            afg afgVar = new afg(24, wr5Var2, upiVar);
            b2r k = g2r.k();
            ypi ypiVar = k instanceof ypi ? (ypi) k : null;
            if (ypiVar == null || (C = ypiVar.C(ybgVar, afgVar)) == null) {
                xq0.q("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                b2r j = C.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                mfi mfiVar = (mfi) list2.get(i2);
                                Object b = sgi.b(this.l, mfiVar.a);
                                mfi mfiVar2 = (mfi) b;
                                if (mfiVar2 != null) {
                                    this.m.U(mfiVar2);
                                }
                                arrayList.add(new Pair(mfiVar, b));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.b == null) {
                                    if (((tpi) this.m.b).b(((mfi) pair.a).a)) {
                                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            Pair pair2 = (Pair) it.next();
                                            if (pair2.b == null) {
                                                nnd nndVar = this.m;
                                                jfi jfiVar = ((mfi) pair2.a).a;
                                                tpi tpiVar = (tpi) nndVar.b;
                                                txi txiVar = (txi) sgi.b(tpiVar, jfiVar);
                                                if (tpiVar.i()) {
                                                    ((tpi) nndVar.c).a();
                                                }
                                                if (txiVar != null) {
                                                    mfi mfiVar3 = txiVar.a;
                                                    sgi.a(this.o, txiVar.b, mfiVar3);
                                                    pair2 = new Pair(pair2.a, mfiVar3);
                                                }
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size4 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size4) {
                            break;
                        }
                        if (((Pair) arrayList.get(i4)).b != null) {
                            break;
                        }
                        i4++;
                    }
                    wr5Var2.s(arrayList);
                    b2r.q(j);
                } catch (Throwable th) {
                    b2r.q(j);
                    throw th;
                }
            } finally {
                v(C);
            }
        }
        return CollectionsKt.w0(hashMap.keySet());
    }

    public final void F(Throwable th, wr5 wr5Var) {
        if (!((Boolean) z.get()).booleanValue() || (th instanceof pp5)) {
            synchronized (this.c) {
                f4m f4mVar = this.s;
                if (f4mVar != null) {
                    throw ((Throwable) f4mVar.b);
                }
                this.s = new f4m(3, th);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.i();
                this.h = new upi();
                this.k.clear();
                this.l.a();
                this.n.a();
                this.s = new f4m(3, th);
                if (wr5Var != null) {
                    G(wr5Var);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void G(wr5 wr5Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(wr5Var)) {
            arrayList.add(wr5Var);
        }
        if (this.f.remove(wr5Var)) {
            this.g = null;
        }
    }

    public final Object H(aur aurVar) {
        Object V = x97.V(this.b, new ckg(this, new bnn(this, null), bzf.D(aurVar.getContext()), (Continuation) null, 25), aurVar);
        nm6 nm6Var = nm6.a;
        if (V != nm6Var) {
            V = Unit.a;
        }
        return V == nm6Var ? V : Unit.a;
    }

    @Override // defpackage.tr5
    public final void a(wr5 wr5Var, wn5 wn5Var) {
        ypi C;
        boolean z2 = wr5Var.s.E;
        try {
            ybg ybgVar = new ybg(21, wr5Var);
            afg afgVar = new afg(24, wr5Var, (Object) null);
            b2r k = g2r.k();
            ypi ypiVar = k instanceof ypi ? (ypi) k : null;
            if (ypiVar == null || (C = ypiVar.C(ybgVar, afgVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                b2r j = C.j();
                try {
                    wr5Var.m(wn5Var);
                    if (!z2) {
                        g2r.k().m();
                    }
                    synchronized (this.c) {
                        if (((zmn) this.u.getValue()).compareTo(zmn.b) > 0 && !B().contains(wr5Var)) {
                            this.f.add(wr5Var);
                            this.g = null;
                        }
                    }
                    try {
                        C(wr5Var);
                        try {
                            wr5Var.h();
                            wr5Var.j();
                            if (z2) {
                                return;
                            }
                            g2r.k().m();
                        } catch (Throwable th) {
                            F(th, null);
                        }
                    } catch (Throwable th2) {
                        F(th2, wr5Var);
                    }
                } finally {
                    b2r.q(j);
                }
            } finally {
                v(C);
            }
        } catch (Throwable th3) {
            F(th3, wr5Var);
        }
    }

    @Override // defpackage.tr5
    public final void b(mfi mfiVar) {
        synchronized (this.c) {
            sgi.a(this.l, mfiVar.a, mfiVar);
            if (mfiVar.h != null) {
                x(this, mfiVar, mfiVar);
            }
        }
    }

    @Override // defpackage.tr5
    public final boolean d() {
        return ((Boolean) z.get()).booleanValue();
    }

    @Override // defpackage.tr5
    public final boolean e() {
        return false;
    }

    @Override // defpackage.tr5
    public final boolean f() {
        return false;
    }

    @Override // defpackage.tr5
    public final int h() {
        return 1000;
    }

    @Override // defpackage.tr5
    public final CoroutineContext i() {
        return this.w;
    }

    @Override // defpackage.tr5
    public final void j(mfi mfiVar) {
        yt3 y2;
        synchronized (this.c) {
            this.k.add(mfiVar);
            y2 = y();
        }
        if (y2 != null) {
            r7o r7oVar = z7o.b;
            ((zt3) y2).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.tr5
    public final void k(wr5 wr5Var) {
        yt3 yt3Var;
        synchronized (this.c) {
            if (this.i.j(wr5Var)) {
                yt3Var = null;
            } else {
                this.i.d(wr5Var);
                yt3Var = y();
            }
        }
        if (yt3Var != null) {
            r7o r7oVar = z7o.b;
            ((zt3) yt3Var).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.tr5
    public final void l(mfi mfiVar, lfi lfiVar, nw0 nw0Var) {
        gpi gpiVar;
        synchronized (this.c) {
            this.n.m(mfiVar, lfiVar);
            Object g = this.o.g(mfiVar);
            boolean z2 = true;
            if (g == null) {
                gpiVar = whj.b;
                gpiVar.getClass();
            } else if (g instanceof gpi) {
                gpiVar = (gpi) g;
            } else {
                Object[] objArr = whj.a;
                gpi gpiVar2 = new gpi(1);
                gpiVar2.a(g);
                gpiVar = gpiVar2;
            }
            if (gpiVar.b == 0) {
                z2 = false;
            }
            if (z2) {
                tpi b = lfiVar.b(nw0Var, gpiVar);
                Object[] objArr2 = b.b;
                Object[] objArr3 = b.c;
                long[] jArr = b.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr2[i4];
                                    this.n.m((mfi) obj, (lfi) objArr3[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.tr5
    public final lfi m(mfi mfiVar) {
        lfi lfiVar;
        synchronized (this.c) {
            lfiVar = (lfi) this.n.k(mfiVar);
        }
        return lfiVar;
    }

    @Override // defpackage.tr5
    public final void p(wr5 wr5Var) {
        synchronized (this.c) {
            try {
                LinkedHashSet linkedHashSet = this.q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.q = linkedHashSet;
                }
                linkedHashSet.add(wr5Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tr5
    public final void s(wr5 wr5Var) {
        synchronized (this.c) {
            if (this.f.remove(wr5Var)) {
                this.g = null;
            }
            this.i.l(wr5Var);
            this.j.remove(wr5Var);
        }
    }

    public final void w() {
        synchronized (this.c) {
            if (((zmn) this.u.getValue()).compareTo(zmn.e) >= 0) {
                xdr xdrVar = this.u;
                zmn zmnVar = zmn.b;
                xdrVar.getClass();
                xdrVar.m(null, zmnVar);
            }
        }
        this.v.g(null);
    }

    public final yt3 y() {
        zmn zmnVar;
        xdr xdrVar = this.u;
        int compareTo = ((zmn) xdrVar.getValue()).compareTo(zmn.b);
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        eqi eqiVar = this.i;
        if (compareTo <= 0) {
            this.f.clear();
            this.g = c5b.a;
            this.h = new upi();
            eqiVar.i();
            arrayList2.clear();
            arrayList.clear();
            this.p = null;
            zt3 zt3Var = this.r;
            if (zt3Var != null) {
                zt3Var.h(null);
            }
            this.r = null;
            this.s = null;
            return null;
        }
        if (this.s != null) {
            zmnVar = zmn.c;
        } else if (this.d == null) {
            this.h = new upi();
            eqiVar.i();
            zmnVar = z() ? zmn.d : zmn.c;
        } else {
            zmnVar = (eqiVar.c == 0 && !this.h.i() && arrayList2.isEmpty() && arrayList.isEmpty() && !z()) ? zmn.e : zmn.f;
        }
        xdrVar.getClass();
        xdrVar.m(null, zmnVar);
        if (zmnVar != zmn.f) {
            return null;
        }
        zt3 zt3Var2 = this.r;
        this.r = null;
        return zt3Var2;
    }

    public final boolean z() {
        return (this.t || this.b.f.get() == 0) ? false : true;
    }

    @Override // defpackage.tr5
    public final void n(Set set) {
    }
}
