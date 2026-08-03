package w;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends y1.e0 implements c1.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7517b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final g f7518c;

    /* renamed from: d, reason: collision with root package name */
    public final y f7519d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7520e;

    public w(g gVar, y yVar) {
        this.f7518c = gVar;
        this.f7519d = yVar;
    }

    public static boolean y(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f10);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean z(float f10, long j3, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f10);
        canvas.translate(e1.b.d(j3), e1.b.e(j3));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode A() {
        RenderNode renderNode = (RenderNode) this.f7520e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode c3 = i1.f.c();
        this.f7520e = c3;
        return c3;
    }

    @Override // c1.f
    public final void b(x1.i0 i0Var) {
        RecordingCanvas beginRecording;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        switch (this.f7517b) {
            case 0:
                z.c0 c0Var = ((u0) this.f7520e).f7514b;
                h1.b bVar = i0Var.f8081g;
                long d10 = bVar.d();
                g gVar = this.f7518c;
                gVar.l(d10);
                if (e1.e.e(bVar.d())) {
                    i0Var.a();
                    return;
                }
                i0Var.a();
                gVar.f7420i.getValue();
                Canvas a6 = f1.c.a(bVar.f2596h.t());
                y yVar = this.f7519d;
                boolean z11 = y.f(yVar.f7528f) ? z(270.0f, v6.a.h(-e1.e.b(bVar.d()), i0Var.x(c0Var.a(i0Var.getLayoutDirection()))), yVar.c(), a6) : false;
                if (y.f(yVar.f7526d)) {
                    z11 = z(0.0f, v6.a.h(0.0f, i0Var.x(c0Var.f8945b)), yVar.e(), a6) || z11;
                }
                if (y.f(yVar.f7529g)) {
                    z11 = z(90.0f, v6.a.h(0.0f, i0Var.x(c0Var.b(i0Var.getLayoutDirection())) + (-((float) bc.a0.I(e1.e.d(bVar.d()))))), yVar.d(), a6) || z11;
                }
                if (y.f(yVar.f7527e)) {
                    z11 = z(180.0f, v6.a.h(-e1.e.d(bVar.d()), (-e1.e.b(bVar.d())) + i0Var.x(c0Var.f8947d)), yVar.b(), a6) || z11;
                }
                if (z11) {
                    gVar.g();
                    return;
                }
                return;
            default:
                h1.b bVar2 = i0Var.f8081g;
                long d11 = bVar2.d();
                g gVar2 = this.f7518c;
                gVar2.l(d11);
                if (e1.e.e(bVar2.d())) {
                    i0Var.a();
                    return;
                }
                gVar2.f7420i.getValue();
                float x10 = i0Var.x(t.f7504a);
                Canvas a8 = f1.c.a(bVar2.f2596h.t());
                y yVar2 = this.f7519d;
                boolean z12 = y.f(yVar2.f7526d) || y.g(yVar2.f7530h) || y.f(yVar2.f7527e) || y.g(yVar2.f7531i);
                boolean z13 = y.f(yVar2.f7528f) || y.g(yVar2.f7532j) || y.f(yVar2.f7529g) || y.g(yVar2.f7533k);
                if (z12 && z13) {
                    A().setPosition(0, 0, a8.getWidth(), a8.getHeight());
                } else if (z12) {
                    A().setPosition(0, 0, (bc.a0.I(x10) * 2) + a8.getWidth(), a8.getHeight());
                } else {
                    if (!z13) {
                        i0Var.a();
                        return;
                    }
                    A().setPosition(0, 0, a8.getWidth(), (bc.a0.I(x10) * 2) + a8.getHeight());
                }
                beginRecording = A().beginRecording();
                if (y.g(yVar2.f7532j)) {
                    EdgeEffect edgeEffect = yVar2.f7532j;
                    if (edgeEffect == null) {
                        edgeEffect = yVar2.a();
                        yVar2.f7532j = edgeEffect;
                    }
                    y(90.0f, edgeEffect, beginRecording);
                    edgeEffect.finish();
                }
                boolean f14 = y.f(yVar2.f7528f);
                h hVar = h.f7427a;
                if (f14) {
                    EdgeEffect c3 = yVar2.c();
                    z10 = y(270.0f, c3, beginRecording);
                    if (y.g(yVar2.f7528f)) {
                        float e10 = e1.b.e(gVar2.f());
                        EdgeEffect edgeEffect2 = yVar2.f7532j;
                        if (edgeEffect2 == null) {
                            edgeEffect2 = yVar2.a();
                            yVar2.f7532j = edgeEffect2;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        float b2 = i10 >= 31 ? hVar.b(c3) : 0.0f;
                        f10 = x10;
                        float f15 = 1 - e10;
                        if (i10 >= 31) {
                            hVar.c(edgeEffect2, b2, f15);
                        } else {
                            edgeEffect2.onPull(b2, f15);
                        }
                    } else {
                        f10 = x10;
                    }
                } else {
                    f10 = x10;
                    z10 = false;
                }
                if (y.g(yVar2.f7530h)) {
                    EdgeEffect edgeEffect3 = yVar2.f7530h;
                    if (edgeEffect3 == null) {
                        edgeEffect3 = yVar2.a();
                        yVar2.f7530h = edgeEffect3;
                    }
                    y(180.0f, edgeEffect3, beginRecording);
                    edgeEffect3.finish();
                }
                if (y.f(yVar2.f7526d)) {
                    EdgeEffect e11 = yVar2.e();
                    boolean z14 = y(0.0f, e11, beginRecording) || z10;
                    if (y.g(yVar2.f7526d)) {
                        float d12 = e1.b.d(gVar2.f());
                        EdgeEffect edgeEffect4 = yVar2.f7530h;
                        if (edgeEffect4 == null) {
                            edgeEffect4 = yVar2.a();
                            yVar2.f7530h = edgeEffect4;
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        float b10 = i11 >= 31 ? hVar.b(e11) : 0.0f;
                        if (i11 >= 31) {
                            hVar.c(edgeEffect4, b10, d12);
                        } else {
                            edgeEffect4.onPull(b10, d12);
                        }
                    }
                    z10 = z14;
                }
                if (y.g(yVar2.f7533k)) {
                    EdgeEffect edgeEffect5 = yVar2.f7533k;
                    if (edgeEffect5 == null) {
                        edgeEffect5 = yVar2.a();
                        yVar2.f7533k = edgeEffect5;
                    }
                    y(270.0f, edgeEffect5, beginRecording);
                    edgeEffect5.finish();
                }
                if (y.f(yVar2.f7529g)) {
                    EdgeEffect d13 = yVar2.d();
                    boolean z15 = y(90.0f, d13, beginRecording) || z10;
                    if (y.g(yVar2.f7529g)) {
                        float e12 = e1.b.e(gVar2.f());
                        EdgeEffect edgeEffect6 = yVar2.f7533k;
                        if (edgeEffect6 == null) {
                            edgeEffect6 = yVar2.a();
                            yVar2.f7533k = edgeEffect6;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        float b11 = i12 >= 31 ? hVar.b(d13) : 0.0f;
                        if (i12 >= 31) {
                            hVar.c(edgeEffect6, b11, e12);
                        } else {
                            edgeEffect6.onPull(b11, e12);
                        }
                    }
                    z10 = z15;
                }
                if (y.g(yVar2.f7531i)) {
                    EdgeEffect edgeEffect7 = yVar2.f7531i;
                    if (edgeEffect7 == null) {
                        edgeEffect7 = yVar2.a();
                        yVar2.f7531i = edgeEffect7;
                    }
                    f11 = 0.0f;
                    y(0.0f, edgeEffect7, beginRecording);
                    edgeEffect7.finish();
                } else {
                    f11 = 0.0f;
                }
                if (y.f(yVar2.f7527e)) {
                    EdgeEffect b12 = yVar2.b();
                    boolean z16 = y(180.0f, b12, beginRecording) || z10;
                    if (y.g(yVar2.f7527e)) {
                        float d14 = e1.b.d(gVar2.f());
                        EdgeEffect edgeEffect8 = yVar2.f7531i;
                        if (edgeEffect8 == null) {
                            edgeEffect8 = yVar2.a();
                            yVar2.f7531i = edgeEffect8;
                        }
                        int i13 = Build.VERSION.SDK_INT;
                        float b13 = i13 >= 31 ? hVar.b(b12) : f11;
                        float f16 = 1 - d14;
                        if (i13 >= 31) {
                            hVar.c(edgeEffect8, b13, f16);
                        } else {
                            edgeEffect8.onPull(b13, f16);
                        }
                    }
                    z10 = z16;
                }
                if (z10) {
                    gVar2.g();
                }
                float f17 = z13 ? f11 : f10;
                if (!z12) {
                    f11 = f10;
                }
                s2.l layoutDirection = i0Var.getLayoutDirection();
                f1.b bVar3 = new f1.b();
                bVar3.f2214a = beginRecording;
                long d15 = bVar2.d();
                a5.c cVar = bVar2.f2596h;
                h1.a aVar = ((h1.b) cVar.f263i).f2595g;
                s2.c cVar2 = aVar.f2591a;
                s2.l lVar = aVar.f2592b;
                f1.o t3 = cVar.t();
                long x11 = bVar2.f2596h.x();
                a5.c cVar3 = bVar2.f2596h;
                i1.b bVar4 = (i1.b) cVar3.f261g;
                cVar3.N(i0Var);
                cVar3.P(layoutDirection);
                cVar3.M(bVar3);
                cVar3.Q(d15);
                cVar3.f261g = null;
                bVar3.k();
                try {
                    ((f8.c) bVar2.f2596h.f262h).u(f17, f11);
                    try {
                        i0Var.a();
                        bVar3.g();
                        a5.c cVar4 = bVar2.f2596h;
                        cVar4.N(cVar2);
                        cVar4.P(lVar);
                        cVar4.M(t3);
                        cVar4.Q(x11);
                        cVar4.f261g = bVar4;
                        A().endRecording();
                        int save = a8.save();
                        a8.translate(f12, f13);
                        a8.drawRenderNode(A());
                        a8.restoreToCount(save);
                        return;
                    } finally {
                        ((f8.c) bVar2.f2596h.f262h).u(-f17, -f11);
                    }
                } catch (Throwable th) {
                    bVar3.g();
                    a5.c cVar5 = bVar2.f2596h;
                    cVar5.N(cVar2);
                    cVar5.P(lVar);
                    cVar5.M(t3);
                    cVar5.Q(x11);
                    cVar5.f261g = bVar4;
                    throw th;
                }
        }
    }

    public w(g gVar, y yVar, u0 u0Var) {
        this.f7518c = gVar;
        this.f7519d = yVar;
        this.f7520e = u0Var;
    }
}
