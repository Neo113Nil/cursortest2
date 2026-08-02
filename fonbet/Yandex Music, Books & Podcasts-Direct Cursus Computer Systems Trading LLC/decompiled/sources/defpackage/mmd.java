package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class mmd extends cw7 implements ipa {
    public final qg0 q;
    public final a1b r;
    public final o0k s;

    public mmd(iur iurVar, qg0 qg0Var, a1b a1bVar, o0k o0kVar) {
        this.q = qg0Var;
        this.r = a1bVar;
        this.s = o0kVar;
        S0(iurVar);
    }

    public static boolean V0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        boolean z;
        char c;
        long j;
        ou3 ou3Var = opfVar.a;
        long e = ou3Var.e();
        qg0 qg0Var = this.q;
        qg0Var.i(e);
        if (nmq.e(ou3Var.e())) {
            opfVar.a();
            return;
        }
        opfVar.a();
        qg0Var.d.getValue();
        Canvas a = vd0.a(ou3Var.b.s());
        a1b a1bVar = this.r;
        boolean f = a1b.f(a1bVar.f);
        o0k o0kVar = this.s;
        if (f) {
            EdgeEffect c2 = a1bVar.c();
            float f2 = -Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L));
            z = V0(270.0f, (Float.floatToRawIntBits(opfVar.n0(o0kVar.b(opfVar.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), c2, a);
        } else {
            z = false;
        }
        if (a1b.f(a1bVar.d)) {
            c = ' ';
            j = 4294967295L;
            z = V0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(opfVar.n0(o0kVar.d()))) & 4294967295L), a1bVar.e(), a) || z;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (a1b.f(a1bVar.g)) {
            z = V0(90.0f, (((long) Float.floatToRawIntBits(opfVar.n0(o0kVar.c(opfVar.getLayoutDirection())) + (-((float) eeh.b(Float.intBitsToFloat((int) (ou3Var.e() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), a1bVar.d(), a) || z;
        }
        if (a1b.f(a1bVar.e)) {
            EdgeEffect b = a1bVar.b();
            z = V0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (ou3Var.e() & j))) + opfVar.n0(o0kVar.a()))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ou3Var.e() >> c)))) << c), b, a) || z;
        }
        if (z) {
            qg0Var.d();
        }
    }
}
