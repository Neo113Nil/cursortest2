package l1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import m0.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f3976b;

    /* renamed from: c, reason: collision with root package name */
    public String f3977c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3978d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3979e;

    /* renamed from: f, reason: collision with root package name */
    public pc.k f3980f;

    /* renamed from: g, reason: collision with root package name */
    public final l1 f3981g;

    /* renamed from: h, reason: collision with root package name */
    public f1.l f3982h;

    /* renamed from: i, reason: collision with root package name */
    public final l1 f3983i;

    /* renamed from: j, reason: collision with root package name */
    public long f3984j;

    /* renamed from: k, reason: collision with root package name */
    public float f3985k;

    /* renamed from: l, reason: collision with root package name */
    public float f3986l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f3987m;

    public e0(c cVar) {
        this.f3976b = cVar;
        cVar.f3941i = new d0(this, 0);
        this.f3977c = "";
        this.f3978d = true;
        this.f3979e = new a();
        this.f3980f = g.f4003i;
        this.f3981g = m0.z.s(null);
        this.f3983i = m0.z.s(new e1.e(0L));
        this.f3984j = 9205357640488583168L;
        this.f3985k = 1.0f;
        this.f3986l = 1.0f;
        this.f3987m = new d0(this, 1);
    }

    @Override // l1.c0
    public final void a(h1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r3 != (r8 == null ? r8.a() : 0)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f3, code lost:
    
        if (r9.f3927d == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(h1.d dVar, float f10, f1.l lVar) {
        int i10;
        boolean z10;
        a aVar;
        f1.g gVar;
        char c3;
        long j3;
        f1.g gVar2;
        int i11;
        int i12;
        f1.l lVar2 = lVar;
        c cVar = this.f3976b;
        boolean z11 = cVar.f3936d;
        l1 l1Var = this.f3981g;
        if (z11 && cVar.f3937e != 16) {
            f1.l lVar3 = (f1.l) l1Var.getValue();
            int i13 = h0.f4034a;
            if (lVar3 == null ? lVar3 == null : !((i12 = lVar3.f2271c) != 5 && i12 != 3)) {
                if (lVar2 == null ? lVar2 == null : !((i11 = lVar2.f2271c) != 5 && i11 != 3)) {
                    i10 = 1;
                    z10 = this.f3978d;
                    aVar = this.f3979e;
                    if (!z10 && e1.e.a(this.f3984j, dVar.d())) {
                        f1.g gVar3 = aVar.f3924a;
                    }
                    this.f3982h = i10 != 1 ? new f1.l(5, cVar.f3937e) : null;
                    float intBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
                    l1 l1Var2 = this.f3983i;
                    this.f3985k = intBitsToFloat / Float.intBitsToFloat((int) (((e1.e) l1Var2.getValue()).f1943a >> 32));
                    this.f3986l = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((e1.e) l1Var2.getValue()).f1943a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() & 4294967295L)))) & 4294967295L);
                    s2.l layoutDirection = dVar.getLayoutDirection();
                    gVar = aVar.f3924a;
                    f1.b bVar = aVar.f3925b;
                    if (gVar != null || bVar == null) {
                        c3 = ' ';
                        j3 = 4294967295L;
                    } else {
                        int i14 = (int) (ceil >> 32);
                        Bitmap bitmap = gVar.f2252a;
                        c3 = ' ';
                        j3 = 4294967295L;
                        if (i14 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    gVar = f1.d0.e((int) (ceil >> c3), (int) (ceil & j3), i10);
                    Canvas canvas = f1.c.f2217a;
                    bVar = new f1.b();
                    bVar.f2214a = new Canvas(gVar.f2252a);
                    aVar.f3924a = gVar;
                    aVar.f3925b = bVar;
                    aVar.f3927d = i10;
                    aVar.f3926c = ceil;
                    h1.b bVar2 = aVar.f3928e;
                    long F = i7.b.F(ceil);
                    h1.a aVar2 = bVar2.f2595g;
                    s2.c cVar2 = aVar2.f2591a;
                    s2.l lVar4 = aVar2.f2592b;
                    f1.o oVar = aVar2.f2593c;
                    f1.b bVar3 = bVar;
                    long j6 = aVar2.f2594d;
                    aVar2.f2591a = dVar;
                    aVar2.f2592b = layoutDirection;
                    aVar2.f2593c = bVar3;
                    aVar2.f2594d = F;
                    bVar3.k();
                    h1.d.l(bVar2, f1.q.f2277b, 0L, 62);
                    this.f3987m.invoke(bVar2);
                    bVar3.g();
                    h1.a aVar3 = bVar2.f2595g;
                    aVar3.f2591a = cVar2;
                    aVar3.f2592b = lVar4;
                    aVar3.f2593c = oVar;
                    aVar3.f2594d = j6;
                    gVar.f2252a.prepareToDraw();
                    this.f3978d = false;
                    this.f3984j = dVar.d();
                    if (lVar2 == null) {
                        lVar2 = ((f1.l) l1Var.getValue()) != null ? (f1.l) l1Var.getValue() : this.f3982h;
                    }
                    f1.l lVar5 = lVar2;
                    gVar2 = aVar.f3924a;
                    if (gVar2 == null) {
                        u1.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    h1.d.V(dVar, gVar2, aVar.f3926c, 0L, f10, lVar5, 0, 858);
                }
            }
        }
        i10 = 0;
        z10 = this.f3978d;
        aVar = this.f3979e;
        if (!z10) {
            f1.g gVar32 = aVar.f3924a;
        }
        this.f3982h = i10 != 1 ? new f1.l(5, cVar.f3937e) : null;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() >> 32));
        l1 l1Var22 = this.f3983i;
        this.f3985k = intBitsToFloat2 / Float.intBitsToFloat((int) (((e1.e) l1Var22.getValue()).f1943a >> 32));
        this.f3986l = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((e1.e) l1Var22.getValue()).f1943a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() & 4294967295L)))) & 4294967295L);
        s2.l layoutDirection2 = dVar.getLayoutDirection();
        gVar = aVar.f3924a;
        f1.b bVar4 = aVar.f3925b;
        if (gVar != null) {
        }
        c3 = ' ';
        j3 = 4294967295L;
        gVar = f1.d0.e((int) (ceil2 >> c3), (int) (ceil2 & j3), i10);
        Canvas canvas2 = f1.c.f2217a;
        bVar4 = new f1.b();
        bVar4.f2214a = new Canvas(gVar.f2252a);
        aVar.f3924a = gVar;
        aVar.f3925b = bVar4;
        aVar.f3927d = i10;
        aVar.f3926c = ceil2;
        h1.b bVar22 = aVar.f3928e;
        long F2 = i7.b.F(ceil2);
        h1.a aVar22 = bVar22.f2595g;
        s2.c cVar22 = aVar22.f2591a;
        s2.l lVar42 = aVar22.f2592b;
        f1.o oVar2 = aVar22.f2593c;
        f1.b bVar32 = bVar4;
        long j62 = aVar22.f2594d;
        aVar22.f2591a = dVar;
        aVar22.f2592b = layoutDirection2;
        aVar22.f2593c = bVar32;
        aVar22.f2594d = F2;
        bVar32.k();
        h1.d.l(bVar22, f1.q.f2277b, 0L, 62);
        this.f3987m.invoke(bVar22);
        bVar32.g();
        h1.a aVar32 = bVar22.f2595g;
        aVar32.f2591a = cVar22;
        aVar32.f2592b = lVar42;
        aVar32.f2593c = oVar2;
        aVar32.f2594d = j62;
        gVar.f2252a.prepareToDraw();
        this.f3978d = false;
        this.f3984j = dVar.d();
        if (lVar2 == null) {
        }
        f1.l lVar52 = lVar2;
        gVar2 = aVar.f3924a;
        if (gVar2 == null) {
        }
        h1.d.V(dVar, gVar2, aVar.f3926c, 0L, f10, lVar52, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f3977c);
        sb.append("\n\tviewportWidth: ");
        l1 l1Var = this.f3983i;
        sb.append(Float.intBitsToFloat((int) (((e1.e) l1Var.getValue()).f1943a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((e1.e) l1Var.getValue()).f1943a & 4294967295L)));
        sb.append("\n");
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
