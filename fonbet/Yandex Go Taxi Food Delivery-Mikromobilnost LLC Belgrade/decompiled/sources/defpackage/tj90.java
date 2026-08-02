package defpackage;

import android.graphics.RectF;
import java.util.Random;

/* loaded from: classes5.dex */
public final class tj90 extends v05 {
    public final ssn a;
    public final float b;
    public final Random c;
    public float d;
    public float e;

    public tj90(ssn ssnVar, float f) {
        Random random = new Random();
        this.a = ssnVar;
        this.b = f;
        this.c = random;
    }

    public final fce0 a(s1a1 s1a1Var, RectF rectF) {
        if (s1a1Var instanceof fce0) {
            fce0 fce0Var = (fce0) s1a1Var;
            return new fce0(fce0Var.b, fce0Var.c);
        }
        if (s1a1Var instanceof jce0) {
            jce0 jce0Var = (jce0) s1a1Var;
            return new fce0(rectF.width() * ((float) jce0Var.b), rectF.height() * ((float) jce0Var.c));
        }
        if (!(s1a1Var instanceof gce0)) {
            w511.b();
            return null;
        }
        gce0 gce0Var = (gce0) s1a1Var;
        fce0 a = a(gce0Var.b, rectF);
        fce0 a2 = a(gce0Var.c, rectF);
        Random random = this.c;
        float nextFloat = random.nextFloat();
        float f = a2.b;
        float f2 = a.b;
        float b = g8e.b(f, f2, nextFloat, f2);
        float nextFloat2 = random.nextFloat();
        float f3 = a2.c;
        float f4 = a.c;
        return new fce0(b, g8e.b(f3, f4, nextFloat2, f4));
    }

    public final float b(vwk0 vwk0Var) {
        if (!vwk0Var.a) {
            return 0.0f;
        }
        float nextFloat = (this.c.nextFloat() * 2.0f) - 1.0f;
        float f = vwk0Var.b;
        return (vwk0Var.c * f * nextFloat) + f;
    }
}
