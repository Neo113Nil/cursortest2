package com.gamericefishpro.space.y;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.gamericefishpro.space.h2.j implements com.gamericefishpro.space.h2.l {
    public final /* synthetic */ int J = 1;
    public final l K;
    public final f0 L;
    public Object M;

    public j0(com.gamericefishpro.space.b2.f0 f0Var, l lVar, f0 f0Var2) {
        this.K = lVar;
        this.L = f0Var2;
        A0(f0Var);
    }

    public static boolean D0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean E0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public RenderNode F0() {
        RenderNode renderNode = (RenderNode) this.M;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = com.gamericefishpro.space.u3.e.b();
        this.M = renderNodeB;
        return renderNodeB;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01f8 A[PHI: r16
      0x01f8: PHI (r16v5 boolean) = (r16v4 boolean), (r16v15 boolean) binds: [B:94:0x01ae, B:102:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.gamericefishpro.space.h2.l
    public final void f(com.gamericefishpro.space.h2.h0 h0Var) {
        boolean zE0;
        char c;
        long j;
        float f;
        boolean z;
        boolean zD0;
        char c2;
        boolean z2;
        switch (this.J) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.d0.u0 u0Var = (com.gamericefishpro.space.d0.u0) this.M;
                com.gamericefishpro.space.q1.b bVar = h0Var.d;
                long jC = bVar.c();
                l lVar = this.K;
                lVar.i(jC);
                if (com.gamericefishpro.space.n1.e.c(bVar.c())) {
                    h0Var.a();
                    return;
                }
                h0Var.a();
                lVar.d.getValue();
                Canvas canvasA = com.gamericefishpro.space.o1.c.a(bVar.e.j());
                f0 f0Var = this.L;
                if (f0.f(f0Var.f)) {
                    zE0 = E0(270.0f, (((long) Float.floatToRawIntBits(h0Var.r(u0Var.d(h0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.c() & 4294967295L)))) << 32), f0Var.c(), canvasA);
                } else {
                    zE0 = false;
                }
                if (f0.f(f0Var.d)) {
                    c = ' ';
                    j = 4294967295L;
                    zE0 = E0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(h0Var.r(u0Var.b()))) & 4294967295L), f0Var.e(), canvasA) || zE0;
                } else {
                    c = ' ';
                    j = 4294967295L;
                }
                if (f0.f(f0Var.g)) {
                    zE0 = E0(90.0f, (((long) Float.floatToRawIntBits(h0Var.r(u0Var.c(h0Var.getLayoutDirection())) + (-((float) com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (bVar.c() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), f0Var.d(), canvasA) || zE0;
                }
                if (f0.f(f0Var.e)) {
                    zE0 = E0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (bVar.c() & j))) + h0Var.r(u0Var.a()))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.c() >> c)))) << c), f0Var.b(), canvasA) || zE0;
                }
                if (zE0) {
                    lVar.d();
                    return;
                }
                return;
            default:
                com.gamericefishpro.space.q1.b bVar2 = h0Var.d;
                long jC2 = bVar2.c();
                l lVar2 = this.K;
                lVar2.i(jC2);
                Canvas canvasA2 = com.gamericefishpro.space.o1.c.a(bVar2.e.j());
                lVar2.d.getValue();
                if (com.gamericefishpro.space.n1.e.c(bVar2.c())) {
                    h0Var.a();
                    return;
                }
                boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
                f0 f0Var2 = this.L;
                if (!zIsHardwareAccelerated) {
                    EdgeEffect edgeEffect = f0Var2.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = f0Var2.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = f0Var2.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = f0Var2.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = f0Var2.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = f0Var2.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = f0Var2.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = f0Var2.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    h0Var.a();
                    return;
                }
                float fR = h0Var.r(b0.a);
                boolean z3 = f0.f(f0Var2.d) || f0.g(f0Var2.h) || f0.f(f0Var2.e) || f0.g(f0Var2.i);
                boolean z4 = f0.f(f0Var2.f) || f0.g(f0Var2.j) || f0.f(f0Var2.g) || f0.g(f0Var2.k);
                if (z3 && z4) {
                    F0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z3) {
                    F0().setPosition(0, 0, (com.gamericefishpro.space.gi.c.a(fR) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z4) {
                        h0Var.a();
                        return;
                    }
                    F0().setPosition(0, 0, canvasA2.getWidth(), (com.gamericefishpro.space.gi.c.a(fR) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = F0().beginRecording();
                if (f0.g(f0Var2.j)) {
                    EdgeEffect edgeEffectA = f0Var2.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = f0Var2.a(com.gamericefishpro.space.z.v0.e);
                        f0Var2.j = edgeEffectA;
                    }
                    D0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (f0.f(f0Var2.f)) {
                    EdgeEffect edgeEffectC = f0Var2.c();
                    zD0 = D0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (f0.g(f0Var2.f)) {
                        z = z4;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lVar2.c() & 4294967295L));
                        EdgeEffect edgeEffectA2 = f0Var2.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = f0Var2.a(com.gamericefishpro.space.z.v0.e);
                            f0Var2.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fB = i >= 31 ? o.b(edgeEffectC) : 0.0f;
                        f = fR;
                        float f2 = 1 - fIntBitsToFloat;
                        if (i >= 31) {
                            o.c(edgeEffectA2, fB, f2);
                        } else {
                            edgeEffectA2.onPull(fB, f2);
                        }
                    } else {
                        f = fR;
                        z = z4;
                    }
                } else {
                    f = fR;
                    z = z4;
                    zD0 = false;
                }
                if (f0.g(f0Var2.h)) {
                    EdgeEffect edgeEffectA3 = f0Var2.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = f0Var2.a(com.gamericefishpro.space.z.v0.d);
                        f0Var2.h = edgeEffectA3;
                    }
                    D0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (f0.f(f0Var2.d)) {
                    EdgeEffect edgeEffectE = f0Var2.e();
                    zD0 = D0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zD0;
                    if (f0.g(f0Var2.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lVar2.c() >> 32));
                        EdgeEffect edgeEffectA4 = f0Var2.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = f0Var2.a(com.gamericefishpro.space.z.v0.d);
                            f0Var2.h = edgeEffectA4;
                        }
                        c2 = ' ';
                        int i2 = Build.VERSION.SDK_INT;
                        float fB2 = i2 >= 31 ? o.b(edgeEffectE) : 0.0f;
                        if (i2 >= 31) {
                            o.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                        }
                    } else {
                        c2 = ' ';
                    }
                } else {
                    c2 = ' ';
                }
                if (f0.g(f0Var2.k)) {
                    EdgeEffect edgeEffectA5 = f0Var2.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = f0Var2.a(com.gamericefishpro.space.z.v0.e);
                        f0Var2.k = edgeEffectA5;
                    }
                    D0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (f0.f(f0Var2.g)) {
                    EdgeEffect edgeEffectD = f0Var2.d();
                    zD0 = D0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zD0;
                    if (f0.g(f0Var2.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lVar2.c() & 4294967295L));
                        EdgeEffect edgeEffectA6 = f0Var2.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = f0Var2.a(com.gamericefishpro.space.z.v0.e);
                            f0Var2.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fB3 = i3 >= 31 ? o.b(edgeEffectD) : 0.0f;
                        if (i3 >= 31) {
                            o.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                        }
                    }
                }
                if (f0.g(f0Var2.i)) {
                    EdgeEffect edgeEffectA7 = f0Var2.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = f0Var2.a(com.gamericefishpro.space.z.v0.d);
                        f0Var2.i = edgeEffectA7;
                    }
                    D0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (f0.f(f0Var2.e)) {
                    EdgeEffect edgeEffectB = f0Var2.b();
                    boolean z5 = D0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zD0;
                    if (f0.g(f0Var2.e)) {
                        z2 = z5;
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lVar2.c() >> c2));
                        EdgeEffect edgeEffectA8 = f0Var2.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = f0Var2.a(com.gamericefishpro.space.z.v0.d);
                            f0Var2.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fB4 = i4 >= 31 ? o.b(edgeEffectB) : 0.0f;
                        float f3 = 1 - fIntBitsToFloat4;
                        if (i4 >= 31) {
                            o.c(edgeEffectA8, fB4, f3);
                        } else {
                            edgeEffectA8.onPull(fB4, f3);
                        }
                    } else {
                        z2 = z5;
                    }
                    zD0 = z2;
                }
                if (zD0) {
                    lVar2.d();
                }
                float f4 = z ? 0.0f : f;
                float f5 = z3 ? 0.0f : f;
                com.gamericefishpro.space.c3.l layoutDirection = h0Var.getLayoutDirection();
                com.gamericefishpro.space.o1.b bVar3 = new com.gamericefishpro.space.o1.b();
                bVar3.a = recordingCanvasBeginRecording;
                long jC3 = bVar2.c();
                com.gamericefishpro.space.a8.c cVar = bVar2.e;
                com.gamericefishpro.space.q1.a aVar = ((com.gamericefishpro.space.q1.b) cVar.v).d;
                com.gamericefishpro.space.c3.c cVar2 = aVar.a;
                com.gamericefishpro.space.c3.l lVar3 = aVar.b;
                com.gamericefishpro.space.o1.q qVarJ = cVar.j();
                long jO = bVar2.e.o();
                com.gamericefishpro.space.a8.c cVar3 = bVar2.e;
                com.gamericefishpro.space.r1.b bVar4 = (com.gamericefishpro.space.r1.b) cVar3.i;
                cVar3.E(h0Var);
                cVar3.G(layoutDirection);
                cVar3.D(bVar3);
                cVar3.H(jC3);
                cVar3.i = null;
                bVar3.k();
                try {
                    ((com.gamericefishpro.space.m.d) bVar2.e.e).B(f4, f5);
                    try {
                        h0Var.a();
                        float f6 = -f4;
                        float f7 = -f5;
                        ((com.gamericefishpro.space.m.d) bVar2.e.e).B(f6, f7);
                        bVar3.i();
                        com.gamericefishpro.space.a8.c cVar4 = bVar2.e;
                        cVar4.E(cVar2);
                        cVar4.G(lVar3);
                        cVar4.D(qVarJ);
                        cVar4.H(jO);
                        cVar4.i = bVar4;
                        F0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f6, f7);
                        canvasA2.drawRenderNode(F0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((com.gamericefishpro.space.m.d) bVar2.e.e).B(-f4, -f5);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar3.i();
                    com.gamericefishpro.space.a8.c cVar5 = bVar2.e;
                    cVar5.E(cVar2);
                    cVar5.G(lVar3);
                    cVar5.D(qVarJ);
                    cVar5.H(jO);
                    cVar5.i = bVar4;
                    throw th2;
                }
        }
    }

    public j0(com.gamericefishpro.space.b2.f0 f0Var, l lVar, f0 f0Var2, com.gamericefishpro.space.d0.u0 u0Var) {
        this.K = lVar;
        this.L = f0Var2;
        this.M = u0Var;
        A0(f0Var);
    }
}
