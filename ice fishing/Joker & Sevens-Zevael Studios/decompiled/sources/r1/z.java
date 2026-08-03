package r1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import x1.r1;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends y0.m implements r, s2.c, r1 {
    public final o0.e A;
    public final o0.e B;
    public final o0.e C;
    public g D;
    public long E;

    /* renamed from: u, reason: collision with root package name */
    public Object f6007u;

    /* renamed from: v, reason: collision with root package name */
    public Object f6008v;

    /* renamed from: w, reason: collision with root package name */
    public hc.j f6009w;

    /* renamed from: x, reason: collision with root package name */
    public PointerInputEventHandler f6010x;

    /* renamed from: y, reason: collision with root package name */
    public yc.r1 f6011y;

    /* renamed from: z, reason: collision with root package name */
    public g f6012z = u.f5994a;

    public z(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f6007u = obj;
        this.f6008v = obj2;
        this.f6010x = pointerInputEventHandler;
        o0.e eVar = new o0.e(new y[16]);
        this.A = eVar;
        this.B = eVar;
        this.C = new o0.e(new y[16]);
        this.E = 0L;
    }

    @Override // x1.r1
    public final void M() {
        s0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // x1.r1
    public final void P() {
        g gVar = this.D;
        if (gVar == null) {
            return;
        }
        ?? r12 = gVar.f5954a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) r12.get(i10)).f5966d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    n nVar = (n) r12.get(i11);
                    long j3 = nVar.f5963a;
                    long j6 = nVar.f5965c;
                    long j10 = nVar.f5964b;
                    float f10 = nVar.f5967e;
                    boolean z10 = nVar.f5966d;
                    arrayList.add(new n(j3, j10, j6, false, f10, j10, j6, z10, z10, nVar.f5971i, 0L));
                }
                g gVar2 = new g(arrayList, null);
                this.f6012z = gVar2;
                r0(gVar2, h.f5956g);
                r0(gVar2, h.f5957h);
                r0(gVar2, h.f5958i);
                this.D = null;
                return;
            }
        }
    }

    @Override // x1.l
    public final void a() {
        s0();
    }

    @Override // s2.c
    public final float c() {
        return x1.f.v(this).B.c();
    }

    @Override // y0.m
    public final void k0() {
        s0();
    }

    @Override // s2.c
    public final float m() {
        return x1.f.v(this).B.m();
    }

    public final void r0(g gVar, h hVar) {
        yc.g gVar2;
        yc.g gVar3;
        synchronized (this.B) {
            o0.e eVar = this.C;
            eVar.d(eVar.f5136i, this.A);
        }
        try {
            int ordinal = hVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    o0.e eVar2 = this.C;
                    int i10 = eVar2.f5136i - 1;
                    Object[] objArr = eVar2.f5134g;
                    if (i10 < objArr.length) {
                        while (i10 >= 0) {
                            y yVar = (y) objArr[i10];
                            if (hVar == yVar.f6004j && (gVar3 = yVar.f6003i) != null) {
                                yVar.f6003i = null;
                                gVar3.resumeWith(gVar);
                            }
                            i10--;
                        }
                    }
                    this.C.g();
                }
                if (ordinal != 2) {
                    throw new ac.d();
                }
            }
            o0.e eVar3 = this.C;
            Object[] objArr2 = eVar3.f5134g;
            int i11 = eVar3.f5136i;
            for (int i12 = 0; i12 < i11; i12++) {
                y yVar2 = (y) objArr2[i12];
                if (hVar == yVar2.f6004j && (gVar2 = yVar2.f6003i) != null) {
                    yVar2.f6003i = null;
                    gVar2.resumeWith(gVar);
                }
            }
            this.C.g();
        } catch (Throwable th) {
            this.C.g();
            throw th;
        }
    }

    public final void s0() {
        yc.r1 r1Var = this.f6011y;
        if (r1Var != null) {
            r1Var.B(new q("Pointer input was reset", 1));
            this.f6011y = null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // x1.r1
    public final void z(g gVar, h hVar, long j3) {
        this.E = j3;
        if (hVar == h.f5956g) {
            this.f6012z = gVar;
        }
        fc.d dVar = null;
        if (this.f6011y == null) {
            this.f6011y = a0.q(f0(), null, new ld.c(this, dVar, 2), 1);
        }
        r0(gVar, hVar);
        ?? r42 = gVar.f5954a;
        int size = r42.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                gVar = null;
                break;
            } else if (!v.b((n) r42.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        this.D = gVar;
    }
}
