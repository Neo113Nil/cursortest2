package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public interface eak {
    static void a(eak eakVar, jgo jgoVar) {
        bak bakVar = bak.a;
        nh0 nh0Var = (nh0) eakVar;
        if (nh0Var.b == null) {
            nh0Var.b = new RectF();
        }
        RectF rectF = nh0Var.b;
        rectF.getClass();
        float f = jgoVar.a;
        long j = jgoVar.h;
        long j2 = jgoVar.g;
        long j3 = jgoVar.f;
        long j4 = jgoVar.e;
        rectF.set(f, jgoVar.b, jgoVar.c, jgoVar.d);
        if (nh0Var.c == null) {
            nh0Var.c = new float[8];
        }
        float[] fArr = nh0Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = nh0Var.a;
        RectF rectF2 = nh0Var.b;
        rectF2.getClass();
        float[] fArr2 = nh0Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, ph0.b(bakVar));
    }
}
