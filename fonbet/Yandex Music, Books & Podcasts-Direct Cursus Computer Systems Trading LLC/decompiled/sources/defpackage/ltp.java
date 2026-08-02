package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ltp extends ai3 {
    public Shader a;
    public long b = 9205357640488583168L;

    @Override // defpackage.ai3
    public final void a(float f, long j, gh0 gh0Var) {
        Paint paint = gh0Var.a;
        Shader shader = this.a;
        if (shader == null || !nmq.a(this.b, j)) {
            if (nmq.e(j)) {
                shader = null;
                this.a = null;
                this.b = 9205357640488583168L;
            } else {
                shader = b(j);
                this.a = shader;
                this.b = j;
            }
        }
        long f2 = c3x.f(paint.getColor());
        long j2 = d85.b;
        if (!d85.c(f2, j2)) {
            gh0Var.e(j2);
        }
        if (!Intrinsics.d(gh0Var.c, shader)) {
            gh0Var.h(shader);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        gh0Var.c(f);
    }

    public abstract Shader b(long j);
}
