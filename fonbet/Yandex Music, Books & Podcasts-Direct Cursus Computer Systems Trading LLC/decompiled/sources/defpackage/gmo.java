package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class gmo implements yko {
    public final Path a = new Path();
    public float b;
    public float c;

    public gmo(ah3 ah3Var) {
        if (ah3Var == null) {
            return;
        }
        ah3Var.q(this);
    }

    @Override // defpackage.yko
    public final void a(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }

    @Override // defpackage.yko
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.yko
    public final void d(float f, float f2) {
        this.a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.yko
    public final void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
        this.b = f5;
        this.c = f6;
    }

    @Override // defpackage.yko
    public final void f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        mmo.b(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.b = f4;
        this.c = f5;
    }

    @Override // defpackage.yko
    public final void g(float f, float f2) {
        this.a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }
}
