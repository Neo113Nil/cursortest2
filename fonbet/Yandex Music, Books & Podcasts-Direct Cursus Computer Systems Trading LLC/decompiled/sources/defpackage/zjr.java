package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class zjr extends cw7 implements ipa {
    public final qg0 q;
    public final a1b r;
    public RenderNode s;

    public zjr(iur iurVar, qg0 qg0Var, a1b a1bVar) {
        this.q = qg0Var;
        this.r = a1bVar;
        S0(iurVar);
    }

    public static boolean V0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final RenderNode W0() {
        RenderNode renderNode = this.s;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode h = e43.h();
        this.s = h;
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
    @Override // defpackage.ipa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(opf opfVar) {
        boolean z;
        boolean z2;
        char c;
        float f;
        ud0 ud0Var;
        jx7 y;
        xof A;
        mu3 s;
        long B;
        xod xodVar;
        float f2;
        float f3;
        boolean z3;
        ou3 ou3Var = opfVar.a;
        long e = ou3Var.e();
        qg0 qg0Var = this.q;
        qg0Var.i(e);
        Canvas a = vd0.a(ou3Var.b.s());
        qg0Var.d.getValue();
        if (nmq.e(ou3Var.e())) {
            opfVar.a();
            return;
        }
        boolean isHardwareAccelerated = a.isHardwareAccelerated();
        a1b a1bVar = this.r;
        if (!isHardwareAccelerated) {
            EdgeEffect edgeEffect = a1bVar.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = a1bVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = a1bVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = a1bVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = a1bVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = a1bVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = a1bVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = a1bVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            opfVar.a();
            return;
        }
        float n0 = opfVar.n0(jp4.a);
        boolean z4 = a1b.f(a1bVar.d) || a1b.g(a1bVar.h) || a1b.f(a1bVar.e) || a1b.g(a1bVar.i);
        boolean z5 = a1b.f(a1bVar.f) || a1b.g(a1bVar.j) || a1b.f(a1bVar.g) || a1b.g(a1bVar.k);
        if (z4 && z5) {
            W0().setPosition(0, 0, a.getWidth(), a.getHeight());
        } else if (z4) {
            W0().setPosition(0, 0, (eeh.b(n0) * 2) + a.getWidth(), a.getHeight());
        } else {
            if (!z5) {
                opfVar.a();
                return;
            }
            W0().setPosition(0, 0, a.getWidth(), (eeh.b(n0) * 2) + a.getHeight());
        }
        RecordingCanvas beginRecording = W0().beginRecording();
        if (a1b.g(a1bVar.j)) {
            EdgeEffect edgeEffect9 = a1bVar.j;
            if (edgeEffect9 == null) {
                edgeEffect9 = a1bVar.a(bxj.b);
                a1bVar.j = edgeEffect9;
            }
            V0(90.0f, edgeEffect9, beginRecording);
            edgeEffect9.finish();
        }
        if (a1b.f(a1bVar.f)) {
            EdgeEffect c2 = a1bVar.c();
            z2 = V0(270.0f, c2, beginRecording);
            if (a1b.g(a1bVar.f)) {
                z = z5;
                float intBitsToFloat = Float.intBitsToFloat((int) (qg0Var.c() & 4294967295L));
                EdgeEffect edgeEffect10 = a1bVar.j;
                if (edgeEffect10 == null) {
                    edgeEffect10 = a1bVar.a(bxj.b);
                    a1bVar.j = edgeEffect10;
                }
                int i = Build.VERSION.SDK_INT;
                float l = i >= 31 ? rf0.l(c2) : 0.0f;
                float f4 = 1 - intBitsToFloat;
                if (i >= 31) {
                    rf0.u(edgeEffect10, l, f4);
                } else {
                    edgeEffect10.onPull(l, f4);
                }
            } else {
                z = z5;
            }
        } else {
            z = z5;
            z2 = false;
        }
        if (a1b.g(a1bVar.h)) {
            EdgeEffect edgeEffect11 = a1bVar.h;
            if (edgeEffect11 == null) {
                edgeEffect11 = a1bVar.a(bxj.a);
                a1bVar.h = edgeEffect11;
            }
            V0(180.0f, edgeEffect11, beginRecording);
            edgeEffect11.finish();
        }
        try {
            try {
                if (a1b.f(a1bVar.d)) {
                    EdgeEffect e2 = a1bVar.e();
                    z2 = V0(0.0f, e2, beginRecording) || z2;
                    if (a1b.g(a1bVar.d)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (qg0Var.c() >> 32));
                        EdgeEffect edgeEffect12 = a1bVar.h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = a1bVar.a(bxj.a);
                            a1bVar.h = edgeEffect12;
                        }
                        c = ' ';
                        int i2 = Build.VERSION.SDK_INT;
                        float l2 = i2 >= 31 ? rf0.l(e2) : 0.0f;
                        if (i2 >= 31) {
                            rf0.u(edgeEffect12, l2, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(l2, intBitsToFloat2);
                        }
                        if (a1b.g(a1bVar.k)) {
                            EdgeEffect edgeEffect13 = a1bVar.k;
                            if (edgeEffect13 == null) {
                                edgeEffect13 = a1bVar.a(bxj.b);
                                a1bVar.k = edgeEffect13;
                            }
                            V0(270.0f, edgeEffect13, beginRecording);
                            edgeEffect13.finish();
                        }
                        if (a1b.f(a1bVar.g)) {
                            EdgeEffect d = a1bVar.d();
                            z2 = V0(90.0f, d, beginRecording) || z2;
                            if (a1b.g(a1bVar.g)) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (qg0Var.c() & 4294967295L));
                                EdgeEffect edgeEffect14 = a1bVar.k;
                                if (edgeEffect14 == null) {
                                    edgeEffect14 = a1bVar.a(bxj.b);
                                    a1bVar.k = edgeEffect14;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                float l3 = i3 >= 31 ? rf0.l(d) : 0.0f;
                                if (i3 >= 31) {
                                    rf0.u(edgeEffect14, l3, intBitsToFloat3);
                                } else {
                                    edgeEffect14.onPull(l3, intBitsToFloat3);
                                }
                            }
                        }
                        if (a1b.g(a1bVar.i)) {
                            EdgeEffect edgeEffect15 = a1bVar.i;
                            if (edgeEffect15 == null) {
                                edgeEffect15 = a1bVar.a(bxj.a);
                                a1bVar.i = edgeEffect15;
                            }
                            V0(0.0f, edgeEffect15, beginRecording);
                            edgeEffect15.finish();
                        }
                        if (a1b.f(a1bVar.e)) {
                            EdgeEffect b = a1bVar.b();
                            boolean z6 = V0(180.0f, b, beginRecording) || z2;
                            if (a1b.g(a1bVar.e)) {
                                z3 = z6;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (qg0Var.c() >> c));
                                EdgeEffect edgeEffect16 = a1bVar.i;
                                if (edgeEffect16 == null) {
                                    edgeEffect16 = a1bVar.a(bxj.a);
                                    a1bVar.i = edgeEffect16;
                                }
                                int i4 = Build.VERSION.SDK_INT;
                                float l4 = i4 >= 31 ? rf0.l(b) : 0.0f;
                                float f5 = 1 - intBitsToFloat4;
                                if (i4 >= 31) {
                                    rf0.u(edgeEffect16, l4, f5);
                                } else {
                                    edgeEffect16.onPull(l4, f5);
                                }
                            } else {
                                z3 = z6;
                            }
                            z2 = z3;
                        }
                        if (z2) {
                            qg0Var.d();
                        }
                        f = !z ? 0.0f : n0;
                        if (z4) {
                            n0 = 0.0f;
                        }
                        xof layoutDirection = opfVar.getLayoutDirection();
                        ud0Var = new ud0();
                        ud0Var.a = beginRecording;
                        long e3 = ou3Var.e();
                        y = ou3Var.b.y();
                        A = ou3Var.b.A();
                        s = ou3Var.b.s();
                        B = ou3Var.b.B();
                        nsh nshVar = ou3Var.b;
                        xodVar = (xod) nshVar.c;
                        nshVar.O(opfVar);
                        nshVar.P(layoutDirection);
                        nshVar.M(ud0Var);
                        nshVar.R(e3);
                        nshVar.c = null;
                        ud0Var.r();
                        ((xzi) ou3Var.b.b).m0(f, n0);
                        opfVar.a();
                        ud0Var.k();
                        nsh nshVar2 = ou3Var.b;
                        nshVar2.O(y);
                        nshVar2.P(A);
                        nshVar2.M(s);
                        nshVar2.R(B);
                        nshVar2.c = xodVar;
                        W0().endRecording();
                        int save = a.save();
                        a.translate(f2, f3);
                        a.drawRenderNode(W0());
                        a.restoreToCount(save);
                        return;
                    }
                }
                opfVar.a();
                ud0Var.k();
                nsh nshVar22 = ou3Var.b;
                nshVar22.O(y);
                nshVar22.P(A);
                nshVar22.M(s);
                nshVar22.R(B);
                nshVar22.c = xodVar;
                W0().endRecording();
                int save2 = a.save();
                a.translate(f2, f3);
                a.drawRenderNode(W0());
                a.restoreToCount(save2);
                return;
            } finally {
                ((xzi) ou3Var.b.b).m0(-f, -n0);
            }
            ((xzi) ou3Var.b.b).m0(f, n0);
        } catch (Throwable th) {
            ud0Var.k();
            nsh nshVar3 = ou3Var.b;
            nshVar3.O(y);
            nshVar3.P(A);
            nshVar3.M(s);
            nshVar3.R(B);
            nshVar3.c = xodVar;
            throw th;
        }
        c = ' ';
        if (a1b.g(a1bVar.k)) {
        }
        if (a1b.f(a1bVar.g)) {
        }
        if (a1b.g(a1bVar.i)) {
        }
        if (a1b.f(a1bVar.e)) {
        }
        if (z2) {
        }
        if (!z) {
        }
        if (z4) {
        }
        xof layoutDirection2 = opfVar.getLayoutDirection();
        ud0Var = new ud0();
        ud0Var.a = beginRecording;
        long e32 = ou3Var.e();
        y = ou3Var.b.y();
        A = ou3Var.b.A();
        s = ou3Var.b.s();
        B = ou3Var.b.B();
        nsh nshVar4 = ou3Var.b;
        xodVar = (xod) nshVar4.c;
        nshVar4.O(opfVar);
        nshVar4.P(layoutDirection2);
        nshVar4.M(ud0Var);
        nshVar4.R(e32);
        nshVar4.c = null;
        ud0Var.r();
    }
}
