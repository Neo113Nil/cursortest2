package com.gamericefishpro.space.b2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.gamericefishpro.space.h2.t1;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.pi.s1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.gamericefishpro.space.h1.l implements r, com.gamericefishpro.space.c3.c, t1 {
    public Object H;
    public Object I;
    public PointerInputEventHandler J;
    public s1 K;
    public h L = b0.a;
    public final com.gamericefishpro.space.v0.e M;
    public final com.gamericefishpro.space.v0.e N;
    public final com.gamericefishpro.space.v0.e O;
    public h P;

    public f0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.H = obj;
        this.I = obj2;
        this.J = pointerInputEventHandler;
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new c0[16]);
        this.M = eVar;
        this.N = eVar;
        this.O = new com.gamericefishpro.space.v0.e(new c0[16]);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0042, B:26:0x0045, B:28:0x004e, B:30:0x0056, B:32:0x005a), top: B:43:0x000d }] */
    public final void A0(h hVar, i iVar) {
        Object[] objArr;
        int i;
        int i2;
        c0 c0Var;
        com.gamericefishpro.space.pi.h hVar2;
        com.gamericefishpro.space.pi.h hVar3;
        synchronized (this.N) {
            com.gamericefishpro.space.v0.e eVar = this.O;
            eVar.c(eVar.i, this.M);
        }
        try {
            int iOrdinal = iVar.ordinal();
            if (iOrdinal == 0) {
                com.gamericefishpro.space.v0.e eVar2 = this.O;
                objArr = eVar2.d;
                i = eVar2.i;
                for (i2 = 0; i2 < i; i2++) {
                    c0Var = (c0) objArr[i2];
                    if (iVar != c0Var.v && (hVar2 = c0Var.i) != null) {
                        c0Var.i = null;
                        com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                        hVar2.resumeWith(hVar);
                    }
                }
            } else if (iOrdinal == 1) {
                com.gamericefishpro.space.v0.e eVar3 = this.O;
                int i3 = eVar3.i - 1;
                Object[] objArr2 = eVar3.d;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        c0 c0Var2 = (c0) objArr2[i3];
                        if (iVar == c0Var2.v && (hVar3 = c0Var2.i) != null) {
                            c0Var2.i = null;
                            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                            hVar3.resumeWith(hVar);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                com.gamericefishpro.space.v0.e eVar4 = this.O;
                objArr = eVar4.d;
                i = eVar4.i;
                while (i2 < i) {
                    c0Var = (c0) objArr[i2];
                    if (iVar != c0Var.v) {
                    }
                }
            }
            this.O.g();
        } catch (Throwable th) {
            this.O.g();
            throw th;
        }
    }

    public final void B0() {
        s1 s1Var = this.K;
        if (s1Var != null) {
            s1Var.u(new q("Pointer input was reset", 2));
            this.K = null;
        }
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void U() {
        B0();
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void X() {
        h hVar = this.P;
        if (hVar == null) {
            return;
        }
        List list = hVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((m) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    m mVar = (m) list.get(i2);
                    long j = mVar.a;
                    long j2 = mVar.c;
                    long j3 = mVar.b;
                    float f = mVar.e;
                    boolean z = mVar.d;
                    arrayList.add(new m(j, j3, j2, false, f, j3, j2, z, z, mVar.i, 0L));
                }
                h hVar2 = new h(arrayList, null);
                this.L = hVar2;
                A0(hVar2, i.d);
                A0(hVar2, i.e);
                A0(hVar2, i.i);
                this.P = null;
                return;
            }
        }
    }

    @Override // com.gamericefishpro.space.h2.i, com.gamericefishpro.space.h2.t1
    public final void a() {
        B0();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return com.gamericefishpro.space.h2.k.s(this).S.b();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return com.gamericefishpro.space.h2.k.s(this).S.g();
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void p(h hVar, i iVar, long j) {
        if (iVar == i.d) {
            this.L = hVar;
        }
        int i = 0;
        com.gamericefishpro.space.th.a aVar = null;
        if (this.K == null) {
            com.gamericefishpro.space.pi.x xVarO0 = o0();
            com.gamericefishpro.space.pi.y yVar = com.gamericefishpro.space.pi.y.d;
            this.K = com.gamericefishpro.space.pi.a0.u(xVarO0, null, new e0(this, aVar, i), 1);
        }
        A0(hVar, iVar);
        List list = hVar.a;
        int size = list.size();
        while (i < size) {
            if (!d5.p((m) list.get(i))) {
                this.P = hVar;
            }
            i++;
        }
        hVar = null;
        this.P = hVar;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        B0();
    }
}
