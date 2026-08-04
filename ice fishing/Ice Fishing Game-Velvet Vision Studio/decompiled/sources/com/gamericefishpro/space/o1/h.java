package com.gamericefishpro.space.o1;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final Path a;
    public RectF b;
    public float[] c;

    public h(Path path) {
        this.a = path;
    }

    public static void a(h hVar, h hVar2) {
        hVar.a.addPath(hVar2.a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(h hVar, com.gamericefishpro.space.n1.d dVar) {
        e0[] e0VarArr = e0.d;
        if (hVar.b == null) {
            hVar.b = new RectF();
        }
        RectF rectF = hVar.b;
        Intrinsics.b(rectF);
        float f = dVar.a;
        long j = dVar.h;
        long j2 = dVar.g;
        long j3 = dVar.f;
        long j4 = dVar.e;
        rectF.set(f, dVar.b, dVar.c, dVar.d);
        if (hVar.c == null) {
            hVar.c = new float[8];
        }
        float[] fArr = hVar.c;
        Intrinsics.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = hVar.a;
        RectF rectF2 = hVar.b;
        Intrinsics.b(rectF2);
        float[] fArr2 = hVar.c;
        Intrinsics.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final com.gamericefishpro.space.n1.c c() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        Intrinsics.b(rectF);
        this.a.computeBounds(rectF, true);
        return new com.gamericefishpro.space.n1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void d(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean e(h hVar, h hVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(hVar instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = hVar.a;
        if (hVar2 instanceof h) {
            return this.a.op(path, hVar2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void f() {
        this.a.reset();
    }
}
