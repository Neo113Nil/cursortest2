package w1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import u.AbstractC5050e;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f41491a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41492b;

    /* renamed from: c, reason: collision with root package name */
    public final I1.b f41493c;

    /* renamed from: d, reason: collision with root package name */
    public final b3.e f41494d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41495e;

    public i(Class cls, Class cls2, Class cls3, List list, I1.b bVar, b3.e eVar) {
        this.f41491a = cls;
        this.f41492b = list;
        this.f41493c = bVar;
        this.f41494d = eVar;
        this.f41495e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r0 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r2 != 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ba, code lost:
    
        if (r0 == 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(int i, int i4, I1.a aVar, com.bumptech.glide.load.data.f fVar, u1.h hVar) {
        w wVar;
        u1.l lVar;
        int i6;
        boolean z6;
        boolean z9;
        boolean z10;
        InterfaceC5066e c5136d;
        b3.e eVar = this.f41494d;
        List list = (List) eVar.k();
        try {
            w b9 = b(fVar, i, i4, hVar, list);
            eVar.D(list);
            h hVar2 = (h) aVar.f1304v;
            hVar2.getClass();
            Class<?> cls = b9.get().getClass();
            int i9 = aVar.f1303u;
            g gVar = hVar2.f41484n;
            u1.k kVar = null;
            if (i9 != 4) {
                u1.l e9 = gVar.e(cls);
                lVar = e9;
                wVar = e9.a(hVar2.f41460A, b9, hVar2.f41464E, hVar2.f41465F);
            } else {
                wVar = b9;
                lVar = null;
            }
            if (!b9.equals(wVar)) {
                b9.a();
            }
            if (gVar.f41444c.a().f24196d.r(wVar.c()) != null) {
                com.bumptech.glide.l a9 = gVar.f41444c.a();
                a9.getClass();
                kVar = a9.f24196d.r(wVar.c());
                if (kVar == null) {
                    throw new com.bumptech.glide.k(wVar.c());
                }
                i6 = kVar.b(hVar2.f41467H);
            } else {
                i6 = 3;
            }
            u1.k kVar2 = kVar;
            InterfaceC5066e interfaceC5066e = hVar2.f41474P;
            ArrayList b10 = gVar.b();
            int size = b10.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z6 = false;
                    break;
                }
                if (((A1.w) b10.get(i10)).f90a.equals(interfaceC5066e)) {
                    z6 = true;
                    break;
                }
                i10++;
            }
            switch (hVar2.f41466G.f41499a) {
                default:
                    z9 = true;
                    if (!z6) {
                        break;
                    }
                    break;
                case 0:
                case 1:
                    z9 = false;
                    break;
            }
            if (z9) {
                if (kVar2 == null) {
                    throw new com.bumptech.glide.k(wVar.get().getClass());
                }
                int d9 = AbstractC5050e.d(i6);
                if (d9 == 0) {
                    z10 = true;
                    c5136d = new C5136d(hVar2.f41474P, hVar2.f41461B);
                } else {
                    if (d9 != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z10 = true;
                    c5136d = new y(gVar.f41444c.f24179a, hVar2.f41474P, hVar2.f41461B, hVar2.f41464E, hVar2.f41465F, lVar, cls, hVar2.f41467H);
                }
                v vVar = (v) v.f41562x.k();
                vVar.f41566w = false;
                vVar.f41565v = z10;
                vVar.f41564u = wVar;
                l4.g gVar2 = hVar2.f41489y;
                gVar2.f38916u = c5136d;
                gVar2.f38917v = kVar2;
                gVar2.f38918w = vVar;
                wVar = vVar;
            }
            return this.f41493c.e(wVar, hVar);
        } catch (Throwable th) {
            eVar.D(list);
            throw th;
        }
    }

    public final w b(com.bumptech.glide.load.data.f fVar, int i, int i4, u1.h hVar, List list) {
        List list2 = this.f41492b;
        int size = list2.size();
        w wVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            u1.j jVar = (u1.j) list2.get(i6);
            try {
                if (jVar.b(fVar.a(), hVar)) {
                    wVar = jVar.a(fVar.a(), i, i4, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e9) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e9);
                }
                list.add(e9);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new s(this.f41495e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f41491a + ", decoders=" + this.f41492b + ", transcoder=" + this.f41493c + '}';
    }
}
