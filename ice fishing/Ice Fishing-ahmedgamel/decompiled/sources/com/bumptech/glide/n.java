package com.bumptech.glide;

import B1.C0266h;
import B1.C0267i;
import B1.u;
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
    public final Context f23473K;

    /* renamed from: L, reason: collision with root package name */
    public final p f23474L;

    /* renamed from: M, reason: collision with root package name */
    public final Class f23475M;

    /* renamed from: N, reason: collision with root package name */
    public final i f23476N;

    /* renamed from: O, reason: collision with root package name */
    public a f23477O;

    /* renamed from: P, reason: collision with root package name */
    public Object f23478P;

    /* renamed from: Q, reason: collision with root package name */
    public ArrayList f23479Q;

    /* renamed from: R, reason: collision with root package name */
    public n f23480R;

    /* renamed from: S, reason: collision with root package name */
    public n f23481S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f23482T = true;

    /* renamed from: U, reason: collision with root package name */
    public boolean f23483U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f23484V;

    static {
    }

    public n(c cVar, p pVar, Class cls, Context context) {
        J1.e eVar;
        this.f23474L = pVar;
        this.f23475M = cls;
        this.f23473K = context;
        s.b bVar = pVar.f23491n.f23374v.f23397f;
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
        this.f23477O = aVar == null ? i.f23391k : aVar;
        this.f23476N = cVar.f23374v;
        Iterator it2 = pVar.f23489B.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            z();
        }
        synchronized (pVar) {
            eVar = pVar.f23490C;
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
    public final J1.c B(Object obj, K1.c cVar, J1.d dVar, a aVar, j jVar, int i, int i6, J1.a aVar2) {
        J1.d dVar2;
        J1.d dVar3;
        J1.a aVar3;
        J1.f fVar;
        j jVar2;
        if (this.f23481S != null) {
            dVar3 = new J1.b(obj, dVar);
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            dVar3 = dVar;
        }
        n nVar = this.f23480R;
        if (nVar == null) {
            Object obj2 = this.f23478P;
            ArrayList arrayList = this.f23479Q;
            i iVar = this.f23476N;
            aVar3 = aVar2;
            fVar = new J1.f(this.f23473K, iVar, obj, obj2, this.f23475M, aVar3, i, i6, jVar, cVar, arrayList, dVar3, iVar.f23398g, aVar.f23367n);
        } else {
            if (this.f23484V) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = nVar.f23482T ? aVar : nVar.f23477O;
            if (J1.a.l(nVar.f1421n, 8)) {
                jVar2 = this.f23480R.f1423v;
            } else {
                int ordinal = jVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    jVar2 = j.f23401n;
                } else if (ordinal == 2) {
                    jVar2 = j.f23402u;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f1423v);
                    }
                    jVar2 = j.f23403v;
                }
            }
            j jVar3 = jVar2;
            n nVar2 = this.f23480R;
            int i9 = nVar2.f1427z;
            int i10 = nVar2.f1426y;
            if (N1.p.i(i, i6)) {
                n nVar3 = this.f23480R;
                if (!N1.p.i(nVar3.f1427z, nVar3.f1426y)) {
                    i9 = aVar2.f1427z;
                    i10 = aVar2.f1426y;
                }
            }
            int i11 = i10;
            int i12 = i9;
            J1.g gVar = new J1.g(obj, dVar3);
            Object obj3 = this.f23478P;
            ArrayList arrayList2 = this.f23479Q;
            J1.g gVar2 = gVar;
            i iVar2 = this.f23476N;
            J1.f fVar2 = new J1.f(this.f23473K, iVar2, obj, obj3, this.f23475M, aVar2, i, i6, jVar, cVar, arrayList2, gVar2, iVar2.f23398g, aVar.f23367n);
            this.f23484V = true;
            n nVar4 = this.f23480R;
            J1.c B9 = nVar4.B(obj, cVar, gVar2, aVar4, jVar3, i12, i11, nVar4);
            this.f23484V = false;
            gVar2.f1464c = fVar2;
            gVar2.f1465d = B9;
            aVar3 = aVar2;
            fVar = gVar2;
        }
        if (dVar2 == null) {
            return fVar;
        }
        n nVar5 = this.f23481S;
        int i13 = nVar5.f1427z;
        int i14 = nVar5.f1426y;
        if (N1.p.i(i, i6)) {
            n nVar6 = this.f23481S;
            if (!N1.p.i(nVar6.f1427z, nVar6.f1426y)) {
                i13 = aVar3.f1427z;
                i14 = aVar3.f1426y;
            }
        }
        int i15 = i14;
        n nVar7 = this.f23481S;
        J1.b bVar = dVar2;
        J1.c B10 = nVar7.B(obj, cVar, bVar, nVar7.f23477O, nVar7.f1423v, i13, i15, nVar7);
        bVar.f1430c = fVar;
        bVar.f1431d = B10;
        return bVar;
    }

    @Override // J1.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final n h() {
        n nVar = (n) super.h();
        nVar.f23477O = nVar.f23477O.clone();
        if (nVar.f23479Q != null) {
            nVar.f23479Q = new ArrayList(nVar.f23479Q);
        }
        n nVar2 = nVar.f23480R;
        if (nVar2 != null) {
            nVar.f23480R = nVar2.clone();
        }
        n nVar3 = nVar.f23481S;
        if (nVar3 != null) {
            nVar.f23481S = nVar3.clone();
        }
        return nVar;
    }

    public final void D(K1.c cVar, J1.a aVar) {
        N1.g.b(cVar);
        if (!this.f23483U) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        J1.c B9 = B(new Object(), cVar, null, this.f23477O, aVar.f1423v, aVar.f1427z, aVar.f1426y, aVar);
        J1.c g4 = cVar.g();
        if (B9.f(g4) && (aVar.f1425x || !g4.j())) {
            N1.g.c(g4, "Argument must not be null");
            if (g4.isRunning()) {
                return;
            }
            g4.i();
            return;
        }
        this.f23474L.i(cVar);
        cVar.b(B9);
        p pVar = this.f23474L;
        synchronized (pVar) {
            pVar.f23496y.f23472n.add(cVar);
            com.bumptech.glide.manager.p pVar2 = pVar.f23494w;
            ((Set) pVar2.f23470v).add(B9);
            if (pVar2.f23469u) {
                B9.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) pVar2.f23471w).add(B9);
            } else {
                B9.i();
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
        if (!J1.a.l(this.f1421n, 2048) && imageView.getScaleType() != null) {
            switch (m.f23444a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().m(B1.n.f139d, new C0266h());
                    break;
                case 2:
                    aVar = clone().m(B1.n.f138c, new C0267i());
                    aVar.f1420I = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().m(B1.n.f137b, new u());
                    aVar.f1420I = true;
                    break;
                case 6:
                    aVar = clone().m(B1.n.f138c, new C0267i());
                    aVar.f1420I = true;
                    break;
            }
            this.f23476N.f23394c.getClass();
            cls = this.f23475M;
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
        this.f23476N.f23394c.getClass();
        cls = this.f23475M;
        if (!Bitmap.class.equals(cls)) {
        }
        D(aVar2, aVar);
    }

    public final n F(Object obj) {
        if (this.f1419H) {
            return clone().F(obj);
        }
        this.f23478P = obj;
        this.f23483U = true;
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
            return Objects.equals(this.f23475M, nVar.f23475M) && this.f23477O.equals(nVar.f23477O) && Objects.equals(this.f23478P, nVar.f23478P) && Objects.equals(this.f23479Q, nVar.f23479Q) && Objects.equals(this.f23480R, nVar.f23480R) && Objects.equals(this.f23481S, nVar.f23481S) && this.f23482T == nVar.f23482T && this.f23483U == nVar.f23483U;
        }
        return false;
    }

    @Override // J1.a
    public final int hashCode() {
        return N1.p.g(this.f23483U ? 1 : 0, N1.p.g(this.f23482T ? 1 : 0, N1.p.h(N1.p.h(N1.p.h(N1.p.h(N1.p.h(N1.p.h(N1.p.h(super.hashCode(), this.f23475M), this.f23477O), this.f23478P), this.f23479Q), this.f23480R), this.f23481S), null)));
    }

    public final n z() {
        if (this.f1419H) {
            return clone().z();
        }
        r();
        return this;
    }
}
