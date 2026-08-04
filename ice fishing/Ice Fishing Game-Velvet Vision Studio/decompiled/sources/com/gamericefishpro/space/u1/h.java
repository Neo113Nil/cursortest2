package com.gamericefishpro.space.u1;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c0 {
    public com.gamericefishpro.space.o1.o b;
    public float f;
    public com.gamericefishpro.space.o1.o g;
    public float k;
    public float m;
    public boolean p;
    public com.gamericefishpro.space.q1.g q;
    public final com.gamericefishpro.space.o1.h r;
    public com.gamericefishpro.space.o1.h s;
    public com.gamericefishpro.space.o1.h t;
    public final Object u;
    public float c = 1.0f;
    public List d = g0.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public h() {
        com.gamericefishpro.space.o1.h hVarA = com.gamericefishpro.space.o1.j.a();
        this.r = hVarA;
        this.s = hVarA;
        this.u = com.gamericefishpro.space.oh.i.a(com.gamericefishpro.space.oh.j.e, g.e);
    }

    @Override // com.gamericefishpro.space.u1.c0
    public final void a(com.gamericefishpro.space.q1.d dVar) {
        com.gamericefishpro.space.q1.d dVar2;
        com.gamericefishpro.space.q1.g gVar;
        if (this.n) {
            b.e(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        com.gamericefishpro.space.o1.o oVar = this.b;
        if (oVar != null) {
            dVar2 = dVar;
            com.gamericefishpro.space.q1.d.j0(dVar2, this.s, oVar, this.c, null, 56);
        } else {
            dVar2 = dVar;
        }
        com.gamericefishpro.space.o1.o oVar2 = this.g;
        if (oVar2 != null) {
            com.gamericefishpro.space.q1.g gVar2 = this.q;
            if (this.o || gVar2 == null) {
                com.gamericefishpro.space.q1.g gVar3 = new com.gamericefishpro.space.q1.g(this.f, this.j, this.h, this.i, 16);
                this.q = gVar3;
                this.o = false;
                gVar = gVar3;
            } else {
                gVar = gVar2;
            }
            com.gamericefishpro.space.q1.d.j0(dVar2, this.s, oVar2, this.e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    public final void e() {
        float f = this.k;
        com.gamericefishpro.space.o1.h hVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = hVar;
            return;
        }
        if (Intrinsics.a(this.s, hVar)) {
            this.s = com.gamericefishpro.space.o1.j.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r0 = this.u;
        ((com.gamericefishpro.space.o1.i) r0.getValue()).a.setPath(hVar != null ? hVar.a : null, false);
        float length = ((com.gamericefishpro.space.o1.i) r0.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((com.gamericefishpro.space.o1.i) r0.getValue()).a(f4, f5, this.s);
            return;
        }
        com.gamericefishpro.space.o1.h hVarA = this.t;
        if (hVarA == null) {
            hVarA = com.gamericefishpro.space.o1.j.a();
            this.t = hVarA;
        }
        hVarA.f();
        ((com.gamericefishpro.space.o1.i) r0.getValue()).a(f4, length, hVarA);
        com.gamericefishpro.space.o1.h.a(this.s, hVarA);
        hVarA.f();
        ((com.gamericefishpro.space.o1.i) r0.getValue()).a(0.0f, f5, hVarA);
        com.gamericefishpro.space.o1.h.a(this.s, hVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
