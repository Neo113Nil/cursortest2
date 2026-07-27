package u1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s1.InterfaceC4970e;
import u.AbstractC5049e;
import y1.C5222q;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Class f41105a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41106b;

    /* renamed from: c, reason: collision with root package name */
    public final G1.c f41107c;

    /* renamed from: d, reason: collision with root package name */
    public final Z2.e f41108d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41109e;

    public j(Class cls, Class cls2, Class cls3, List list, G1.c cVar, Z2.e eVar) {
        this.f41105a = cls;
        this.f41106b = list;
        this.f41107c = cVar;
        this.f41108d = eVar;
        this.f41109e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
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
    public final x a(int i, int i6, G1.a aVar, com.bumptech.glide.load.data.f fVar, s1.h hVar) {
        x xVar;
        s1.l lVar;
        int i9;
        boolean z3;
        boolean z6;
        boolean z9;
        InterfaceC4970e c5065d;
        Z2.e eVar = this.f41108d;
        List list = (List) eVar.k();
        try {
            x b9 = b(fVar, i, i6, hVar, list);
            eVar.D(list);
            i iVar = (i) aVar.f1051v;
            iVar.getClass();
            Class<?> cls = b9.get().getClass();
            int i10 = aVar.f1050u;
            g gVar = iVar.f41098n;
            s1.k kVar = null;
            if (i10 != 4) {
                s1.l e9 = gVar.e(cls);
                lVar = e9;
                xVar = e9.b(iVar.f41074A, b9, iVar.f41078E, iVar.f41079F);
            } else {
                xVar = b9;
                lVar = null;
            }
            if (!b9.equals(xVar)) {
                b9.a();
            }
            if (gVar.f41058c.a().f23409d.b(xVar.d()) != null) {
                com.bumptech.glide.l a9 = gVar.f41058c.a();
                a9.getClass();
                kVar = a9.f23409d.b(xVar.d());
                if (kVar == null) {
                    throw new com.bumptech.glide.k(xVar.d());
                }
                i9 = kVar.p(iVar.f41081H);
            } else {
                i9 = 3;
            }
            s1.k kVar2 = kVar;
            InterfaceC4970e interfaceC4970e = iVar.f41088P;
            ArrayList b10 = gVar.b();
            int size = b10.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z3 = false;
                    break;
                }
                if (((C5222q) b10.get(i11)).f41817a.equals(interfaceC4970e)) {
                    z3 = true;
                    break;
                }
                i11++;
            }
            switch (iVar.f41080G.f41113a) {
                default:
                    z6 = true;
                    if (!z3) {
                        break;
                    }
                    break;
                case 0:
                case 1:
                    z6 = false;
                    break;
            }
            if (z6) {
                if (kVar2 == null) {
                    throw new com.bumptech.glide.k(xVar.get().getClass());
                }
                int d2 = AbstractC5049e.d(i9);
                if (d2 == 0) {
                    z9 = true;
                    c5065d = new C5065d(iVar.f41088P, iVar.f41075B);
                } else {
                    if (d2 != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z9 = true;
                    c5065d = new z(gVar.f41058c.f23392a, iVar.f41088P, iVar.f41075B, iVar.f41078E, iVar.f41079F, lVar, cls, iVar.f41081H);
                }
                w wVar = (w) w.f41176x.k();
                wVar.f41180w = false;
                wVar.f41179v = z9;
                wVar.f41178u = xVar;
                j4.g gVar2 = iVar.f41103y;
                gVar2.f38404u = c5065d;
                gVar2.f38405v = kVar2;
                gVar2.f38406w = wVar;
                xVar = wVar;
            }
            return this.f41107c.g(xVar, hVar);
        } catch (Throwable th) {
            eVar.D(list);
            throw th;
        }
    }

    public final x b(com.bumptech.glide.load.data.f fVar, int i, int i6, s1.h hVar, List list) {
        List list2 = this.f41106b;
        int size = list2.size();
        x xVar = null;
        for (int i9 = 0; i9 < size; i9++) {
            s1.j jVar = (s1.j) list2.get(i9);
            try {
                if (jVar.b(fVar.a(), hVar)) {
                    xVar = jVar.a(fVar.a(), i, i6, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e9) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e9);
                }
                list.add(e9);
            }
            if (xVar != null) {
                break;
            }
        }
        if (xVar != null) {
            return xVar;
        }
        throw new t(this.f41109e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f41105a + ", decoders=" + this.f41106b + ", transcoder=" + this.f41107c + '}';
    }
}
