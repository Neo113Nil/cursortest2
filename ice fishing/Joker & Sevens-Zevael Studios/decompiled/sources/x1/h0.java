package x1;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.j0 f8067a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8069c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8070d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8071e;

    /* renamed from: f, reason: collision with root package name */
    public a f8072f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8074h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8068b = true;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f8073g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public h0(a aVar, int i10) {
        this.f8074h = i10;
        this.f8067a = (v1.j0) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [oc.e, pc.h] */
    /* JADX WARN: Type inference failed for: r3v7, types: [v1.j0, x1.a] */
    public static final void a(h0 h0Var, v1.k kVar, int i10, f1 f1Var) {
        HashMap hashMap = h0Var.f8073g;
        float f10 = i10;
        long floatToRawIntBits = Float.floatToRawIntBits(f10) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f10) & 4294967295L;
        while (true) {
            long j3 = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (h0Var.f8074h) {
                    case 0:
                        l1 l1Var = f1Var.O;
                        if (l1Var != null) {
                            j3 = ((y1.f1) l1Var).c(false, j3);
                        }
                        j3 = x4.f.Q(j3, f1Var.F);
                        break;
                    default:
                        p0 z02 = f1Var.z0();
                        pc.j.b(z02);
                        long j6 = z02.f8142v;
                        j3 = e1.b.g((Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32), j3);
                        break;
                }
                f1Var = f1Var.f8035w;
                pc.j.b(f1Var);
                if (f1Var.equals(h0Var.f8067a.k())) {
                    int round = Math.round(kVar instanceof v1.k ? Float.intBitsToFloat((int) (j3 & 4294967295L)) : Float.intBitsToFloat((int) (j3 >> 32)));
                    if (hashMap.containsKey(kVar)) {
                        int intValue = ((Number) bc.z.N(hashMap, kVar)).intValue();
                        v1.k kVar2 = v1.c.f7070a;
                        round = ((Number) kVar.f7090a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(kVar, Integer.valueOf(round));
                    return;
                }
            } while (!h0Var.b(f1Var).containsKey(kVar));
            float c3 = h0Var.c(f1Var, kVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c3);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c3);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(f1 f1Var) {
        switch (this.f8074h) {
            case 0:
                return f1Var.j0().a();
            default:
                p0 z02 = f1Var.z0();
                pc.j.b(z02);
                return z02.j0().a();
        }
    }

    public final int c(f1 f1Var, v1.k kVar) {
        switch (this.f8074h) {
            case 0:
                return f1Var.b0(kVar);
            default:
                p0 z02 = f1Var.z0();
                pc.j.b(z02);
                return z02.b0(kVar);
        }
    }

    public final boolean d() {
        return this.f8069c || this.f8070d || this.f8071e;
    }

    public final boolean e() {
        h();
        return this.f8072f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v1.j0, x1.a] */
    public final void f() {
        this.f8068b = true;
        ?? r02 = this.f8067a;
        a p8 = r02.p();
        if (p8 == null) {
            return;
        }
        if (this.f8069c) {
            p8.requestLayout();
        }
        if (this.f8070d) {
            r02.F();
        }
        if (this.f8071e) {
            r02.requestLayout();
        }
        p8.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [v1.j0, x1.a] */
    public final void g() {
        HashMap hashMap = this.f8073g;
        hashMap.clear();
        wc.i iVar = new wc.i(3, this);
        ?? r22 = this.f8067a;
        r22.n(iVar);
        hashMap.putAll(b(r22.k()));
        this.f8068b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [v1.j0, x1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        h0 a6;
        h0 a8;
        boolean d10 = d();
        ?? r12 = this.f8067a;
        a aVar = r12;
        if (!d10) {
            a p8 = r12.p();
            if (p8 == null) {
                return;
            }
            a aVar2 = p8.a().f8072f;
            if (aVar2 != null) {
                boolean d11 = aVar2.a().d();
                aVar = aVar2;
            }
            a aVar3 = this.f8072f;
            if (aVar3 == null || aVar3.a().d()) {
                return;
            }
            a p10 = aVar3.p();
            if (p10 != null && (a8 = p10.a()) != null) {
                a8.h();
            }
            a p11 = aVar3.p();
            aVar = (p11 == null || (a6 = p11.a()) == null) ? null : a6.f8072f;
        }
        this.f8072f = aVar;
    }
}
