package com.bumptech.glide;

import D1.C0303h;
import D1.u;
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
public final class n extends L1.a {

    /* renamed from: K, reason: collision with root package name */
    public final Context f24258K;

    /* renamed from: L, reason: collision with root package name */
    public final p f24259L;

    /* renamed from: M, reason: collision with root package name */
    public final Class f24260M;

    /* renamed from: N, reason: collision with root package name */
    public final i f24261N;

    /* renamed from: O, reason: collision with root package name */
    public a f24262O;

    /* renamed from: P, reason: collision with root package name */
    public Object f24263P;

    /* renamed from: Q, reason: collision with root package name */
    public ArrayList f24264Q;

    /* renamed from: R, reason: collision with root package name */
    public n f24265R;

    /* renamed from: S, reason: collision with root package name */
    public n f24266S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f24267T = true;

    /* renamed from: U, reason: collision with root package name */
    public boolean f24268U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f24269V;

    static {
    }

    public n(c cVar, p pVar, Class cls, Context context) {
        L1.e eVar;
        this.f24259L = pVar;
        this.f24260M = cls;
        this.f24258K = context;
        s.b bVar = pVar.f24276n.f24161v.f24184f;
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
        this.f24262O = aVar == null ? i.f24178k : aVar;
        this.f24261N = cVar.f24161v;
        Iterator it2 = pVar.f24274B.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            z();
        }
        synchronized (pVar) {
            eVar = pVar.f24275C;
        }
        a(eVar);
    }

    @Override // L1.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final n a(L1.a aVar) {
        P1.g.b(aVar);
        return (n) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final L1.c B(Object obj, M1.c cVar, L1.d dVar, a aVar, j jVar, int i, int i4, L1.a aVar2) {
        L1.d dVar2;
        L1.d dVar3;
        L1.a aVar3;
        L1.f fVar;
        j jVar2;
        if (this.f24266S != null) {
            dVar3 = new L1.b(obj, dVar);
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            dVar3 = dVar;
        }
        n nVar = this.f24265R;
        if (nVar == null) {
            Object obj2 = this.f24263P;
            ArrayList arrayList = this.f24264Q;
            i iVar = this.f24261N;
            aVar3 = aVar2;
            fVar = new L1.f(this.f24258K, iVar, obj, obj2, this.f24260M, aVar3, i, i4, jVar, cVar, arrayList, dVar3, iVar.f24185g, aVar.f24154n);
        } else {
            if (this.f24269V) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = nVar.f24267T ? aVar : nVar.f24262O;
            if (L1.a.l(nVar.f1737n, 8)) {
                jVar2 = this.f24265R.f1739v;
            } else {
                int ordinal = jVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    jVar2 = j.f24188n;
                } else if (ordinal == 2) {
                    jVar2 = j.f24189u;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f1739v);
                    }
                    jVar2 = j.f24190v;
                }
            }
            j jVar3 = jVar2;
            n nVar2 = this.f24265R;
            int i6 = nVar2.f1743z;
            int i9 = nVar2.f1742y;
            if (P1.p.i(i, i4)) {
                n nVar3 = this.f24265R;
                if (!P1.p.i(nVar3.f1743z, nVar3.f1742y)) {
                    i6 = aVar2.f1743z;
                    i9 = aVar2.f1742y;
                }
            }
            int i10 = i9;
            int i11 = i6;
            L1.g gVar = new L1.g(obj, dVar3);
            Object obj3 = this.f24263P;
            ArrayList arrayList2 = this.f24264Q;
            L1.g gVar2 = gVar;
            i iVar2 = this.f24261N;
            L1.f fVar2 = new L1.f(this.f24258K, iVar2, obj, obj3, this.f24260M, aVar2, i, i4, jVar, cVar, arrayList2, gVar2, iVar2.f24185g, aVar.f24154n);
            this.f24269V = true;
            n nVar4 = this.f24265R;
            L1.c B3 = nVar4.B(obj, cVar, gVar2, aVar4, jVar3, i11, i10, nVar4);
            this.f24269V = false;
            gVar2.f1780c = fVar2;
            gVar2.f1781d = B3;
            aVar3 = aVar2;
            fVar = gVar2;
        }
        if (dVar2 == null) {
            return fVar;
        }
        n nVar5 = this.f24266S;
        int i12 = nVar5.f1743z;
        int i13 = nVar5.f1742y;
        if (P1.p.i(i, i4)) {
            n nVar6 = this.f24266S;
            if (!P1.p.i(nVar6.f1743z, nVar6.f1742y)) {
                i12 = aVar3.f1743z;
                i13 = aVar3.f1742y;
            }
        }
        int i14 = i13;
        n nVar7 = this.f24266S;
        L1.b bVar = dVar2;
        L1.c B9 = nVar7.B(obj, cVar, bVar, nVar7.f24262O, nVar7.f1739v, i12, i14, nVar7);
        bVar.f1746c = fVar;
        bVar.f1747d = B9;
        return bVar;
    }

    @Override // L1.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        n nVar = (n) super.clone();
        nVar.f24262O = nVar.f24262O.clone();
        if (nVar.f24264Q != null) {
            nVar.f24264Q = new ArrayList(nVar.f24264Q);
        }
        n nVar2 = nVar.f24265R;
        if (nVar2 != null) {
            nVar.f24265R = nVar2.clone();
        }
        n nVar3 = nVar.f24266S;
        if (nVar3 != null) {
            nVar.f24266S = nVar3.clone();
        }
        return nVar;
    }

    public final void D(M1.c cVar, L1.a aVar) {
        P1.g.b(cVar);
        if (!this.f24268U) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        L1.c B3 = B(new Object(), cVar, null, this.f24262O, aVar.f1739v, aVar.f1743z, aVar.f1742y, aVar);
        L1.c g9 = cVar.g();
        if (B3.f(g9) && (aVar.f1741x || !g9.j())) {
            P1.g.c(g9, "Argument must not be null");
            if (g9.isRunning()) {
                return;
            }
            g9.i();
            return;
        }
        this.f24259L.i(cVar);
        cVar.c(B3);
        p pVar = this.f24259L;
        synchronized (pVar) {
            pVar.f24281y.f24257n.add(cVar);
            com.bumptech.glide.manager.o oVar = pVar.f24279w;
            ((Set) oVar.f24255v).add(B3);
            if (oVar.f24254u) {
                B3.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) oVar.f24256w).add(B3);
            } else {
                B3.i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(ImageView imageView) {
        L1.a aVar;
        Class cls;
        M1.a aVar2;
        P1.p.a();
        P1.g.b(imageView);
        if (!L1.a.l(this.f1737n, 2048) && imageView.getScaleType() != null) {
            switch (m.f24231a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().m(D1.n.f553d, new C0303h());
                    break;
                case 2:
                    aVar = clone().m(D1.n.f552c, new D1.i());
                    aVar.f1736I = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().m(D1.n.f551b, new u());
                    aVar.f1736I = true;
                    break;
                case 6:
                    aVar = clone().m(D1.n.f552c, new D1.i());
                    aVar.f1736I = true;
                    break;
            }
            this.f24261N.f24181c.getClass();
            cls = this.f24260M;
            if (!Bitmap.class.equals(cls)) {
                aVar2 = new M1.a(imageView, 0);
            } else {
                if (!Drawable.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                }
                aVar2 = new M1.a(imageView, 1);
            }
            D(aVar2, aVar);
        }
        aVar = this;
        this.f24261N.f24181c.getClass();
        cls = this.f24260M;
        if (!Bitmap.class.equals(cls)) {
        }
        D(aVar2, aVar);
    }

    public final n F(Object obj) {
        if (this.f1735H) {
            return clone().F(obj);
        }
        this.f24263P = obj;
        this.f24268U = true;
        r();
        return this;
    }

    @Override // L1.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (super.equals(nVar)) {
            return Objects.equals(this.f24260M, nVar.f24260M) && this.f24262O.equals(nVar.f24262O) && Objects.equals(this.f24263P, nVar.f24263P) && Objects.equals(this.f24264Q, nVar.f24264Q) && Objects.equals(this.f24265R, nVar.f24265R) && Objects.equals(this.f24266S, nVar.f24266S) && this.f24267T == nVar.f24267T && this.f24268U == nVar.f24268U;
        }
        return false;
    }

    @Override // L1.a
    public final int hashCode() {
        return P1.p.g(this.f24268U ? 1 : 0, P1.p.g(this.f24267T ? 1 : 0, P1.p.h(P1.p.h(P1.p.h(P1.p.h(P1.p.h(P1.p.h(P1.p.h(super.hashCode(), this.f24260M), this.f24262O), this.f24263P), this.f24264Q), this.f24265R), this.f24266S), null)));
    }

    public final n z() {
        if (this.f1735H) {
            return clone().z();
        }
        r();
        return this;
    }
}
