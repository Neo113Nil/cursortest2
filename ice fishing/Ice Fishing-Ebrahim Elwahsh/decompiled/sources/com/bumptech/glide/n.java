package com.bumptech.glide;

import B1.C0266h;
import B1.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class n extends J1.a {

    /* renamed from: K, reason: collision with root package name */
    public final Context f23627K;

    /* renamed from: L, reason: collision with root package name */
    public final p f23628L;

    /* renamed from: M, reason: collision with root package name */
    public final Class f23629M;

    /* renamed from: N, reason: collision with root package name */
    public final i f23630N;

    /* renamed from: O, reason: collision with root package name */
    public a f23631O;

    /* renamed from: P, reason: collision with root package name */
    public Object f23632P;

    /* renamed from: Q, reason: collision with root package name */
    public ArrayList f23633Q;

    /* renamed from: R, reason: collision with root package name */
    public n f23634R;

    /* renamed from: S, reason: collision with root package name */
    public n f23635S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f23636T = true;

    /* renamed from: U, reason: collision with root package name */
    public boolean f23637U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f23638V;

    static {
    }

    public n(c cVar, p pVar, Class cls, Context context) {
        J1.e eVar;
        this.f23628L = pVar;
        this.f23629M = cls;
        this.f23627K = context;
        s.b bVar = pVar.f23645n.f23532v.f23553f;
        a aVar = (a) bVar.getOrDefault(cls, null);
        if (aVar == null) {
            Iterator it = ((s.g) bVar.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f23631O = aVar == null ? i.f23547k : aVar;
        this.f23630N = cVar.f23532v;
        Iterator it2 = pVar.f23643B.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            z();
        }
        synchronized (pVar) {
            eVar = pVar.f23644C;
        }
        a(eVar);
    }

    @Override // J1.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final n a(J1.a aVar) {
        N1.g.b(aVar);
        return (n) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final J1.c B(Object obj, K1.c cVar, J1.d dVar, a aVar, j jVar, int i, int i4, J1.a aVar2) {
        J1.d dVar2;
        J1.d dVar3;
        J1.a aVar3;
        J1.f fVar;
        j jVar2;
        if (this.f23635S != null) {
            dVar3 = new J1.b(obj, dVar);
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            dVar3 = dVar;
        }
        n nVar = this.f23634R;
        if (nVar == null) {
            Object obj2 = this.f23632P;
            ArrayList arrayList = this.f23633Q;
            i iVar = this.f23630N;
            aVar3 = aVar2;
            fVar = new J1.f(this.f23627K, iVar, obj, obj2, this.f23629M, aVar3, i, i4, jVar, cVar, arrayList, dVar3, iVar.f23554g, aVar.f23525n);
        } else {
            if (this.f23638V) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = nVar.f23636T ? aVar : nVar.f23631O;
            if (J1.a.l(nVar.f1346n, 8)) {
                jVar2 = this.f23634R.f1348v;
            } else {
                int ordinal = jVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    jVar2 = j.f23557n;
                } else if (ordinal == 2) {
                    jVar2 = j.f23558u;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f1348v);
                    }
                    jVar2 = j.f23559v;
                }
            }
            j jVar3 = jVar2;
            n nVar2 = this.f23634R;
            int i9 = nVar2.f1352z;
            int i10 = nVar2.f1351y;
            if (N1.p.i(i, i4)) {
                n nVar3 = this.f23634R;
                if (!N1.p.i(nVar3.f1352z, nVar3.f1351y)) {
                    i9 = aVar2.f1352z;
                    i10 = aVar2.f1351y;
                }
            }
            int i11 = i10;
            int i12 = i9;
            J1.g gVar = new J1.g(obj, dVar3);
            Object obj3 = this.f23632P;
            ArrayList arrayList2 = this.f23633Q;
            J1.g gVar2 = gVar;
            i iVar2 = this.f23630N;
            J1.f fVar2 = new J1.f(this.f23627K, iVar2, obj, obj3, this.f23629M, aVar2, i, i4, jVar, cVar, arrayList2, gVar2, iVar2.f23554g, aVar.f23525n);
            this.f23638V = true;
            n nVar4 = this.f23634R;
            J1.c B8 = nVar4.B(obj, cVar, gVar2, aVar4, jVar3, i12, i11, nVar4);
            this.f23638V = false;
            gVar2.f1389c = fVar2;
            gVar2.f1390d = B8;
            aVar3 = aVar2;
            fVar = gVar2;
        }
        if (dVar2 == null) {
            return fVar;
        }
        n nVar5 = this.f23635S;
        int i13 = nVar5.f1352z;
        int i14 = nVar5.f1351y;
        if (N1.p.i(i, i4)) {
            n nVar6 = this.f23635S;
            if (!N1.p.i(nVar6.f1352z, nVar6.f1351y)) {
                i13 = aVar3.f1352z;
                i14 = aVar3.f1351y;
            }
        }
        int i15 = i14;
        n nVar7 = this.f23635S;
        J1.b bVar = dVar2;
        J1.c B9 = nVar7.B(obj, cVar, bVar, nVar7.f23631O, nVar7.f1348v, i13, i15, nVar7);
        bVar.f1355c = fVar;
        bVar.f1356d = B9;
        return bVar;
    }

    @Override // J1.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        n nVar = (n) super.clone();
        nVar.f23631O = nVar.f23631O.clone();
        if (nVar.f23633Q != null) {
            nVar.f23633Q = new ArrayList(nVar.f23633Q);
        }
        n nVar2 = nVar.f23634R;
        if (nVar2 != null) {
            nVar.f23634R = nVar2.clone();
        }
        n nVar3 = nVar.f23635S;
        if (nVar3 != null) {
            nVar.f23635S = nVar3.clone();
        }
        return nVar;
    }

    public final void D(K1.c cVar, J1.a aVar) {
        N1.g.b(cVar);
        if (!this.f23637U) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        J1.c B8 = B(new Object(), cVar, null, this.f23631O, aVar.f1348v, aVar.f1352z, aVar.f1351y, aVar);
        J1.c g9 = cVar.g();
        if (B8.f(g9) && (aVar.f1350x || !g9.j())) {
            N1.g.c(g9, "Argument must not be null");
            if (g9.isRunning()) {
                return;
            }
            g9.i();
            return;
        }
        this.f23628L.i(cVar);
        cVar.b(B8);
        p pVar = this.f23628L;
        synchronized (pVar) {
            pVar.f23650y.f23626n.add(cVar);
            com.bumptech.glide.manager.o oVar = pVar.f23648w;
            ((Set) oVar.f23624v).add(B8);
            if (oVar.f23623u) {
                B8.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) oVar.f23625w).add(B8);
            } else {
                B8.i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(ImageView imageView) {
        J1.a aVar;
        Class cls;
        K1.a aVar2;
        N1.p.a();
        N1.g.b(imageView);
        if (!J1.a.l(this.f1346n, 2048) && imageView.getScaleType() != null) {
            switch (m.f23600a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().m(B1.m.f104d, new C0266h());
                    break;
                case 2:
                    aVar = clone().m(B1.m.f103c, new B1.i());
                    aVar.f1345I = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().m(B1.m.f102b, new t());
                    aVar.f1345I = true;
                    break;
                case 6:
                    aVar = clone().m(B1.m.f103c, new B1.i());
                    aVar.f1345I = true;
                    break;
            }
            this.f23630N.f23550c.getClass();
            cls = this.f23629M;
            if (!Bitmap.class.equals(cls)) {
                aVar2 = new K1.a(imageView, 0);
            } else {
                if (!Drawable.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                }
                aVar2 = new K1.a(imageView, 1);
            }
            D(aVar2, aVar);
        }
        aVar = this;
        this.f23630N.f23550c.getClass();
        cls = this.f23629M;
        if (!Bitmap.class.equals(cls)) {
        }
        D(aVar2, aVar);
    }

    public final n F(Object obj) {
        if (this.f1344H) {
            return clone().F(obj);
        }
        this.f23632P = obj;
        this.f23637U = true;
        r();
        return this;
    }

    @Override // J1.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (super.equals(nVar)) {
            return Objects.equals(this.f23629M, nVar.f23629M) && this.f23631O.equals(nVar.f23631O) && Objects.equals(this.f23632P, nVar.f23632P) && Objects.equals(this.f23633Q, nVar.f23633Q) && Objects.equals(this.f23634R, nVar.f23634R) && Objects.equals(this.f23635S, nVar.f23635S) && this.f23636T == nVar.f23636T && this.f23637U == nVar.f23637U;
        }
        return false;
    }

    @Override // J1.a
    public final int hashCode() {
        return N1.p.g(this.f23637U ? 1 : 0, N1.p.g(this.f23636T ? 1 : 0, N1.p.h(N1.p.h(N1.p.h(N1.p.h(N1.p.h(N1.p.h(N1.p.h(super.hashCode(), this.f23629M), this.f23631O), this.f23632P), this.f23633Q), this.f23634R), this.f23635S), null)));
    }

    public final n z() {
        if (this.f1344H) {
            return clone().z();
        }
        r();
        return this;
    }
}
