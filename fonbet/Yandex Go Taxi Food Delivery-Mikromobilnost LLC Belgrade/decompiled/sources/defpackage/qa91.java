package defpackage;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.input.pointer.util.a;
import com.adjust.sdk.Constants;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class qa91 {
    public static final String[] a = {"http", Constants.SCHEME};

    public static final void a(t631 t631Var, zvd0 zvd0Var, long j) {
        a aVar = t631Var.a;
        aVar.getClass();
        VelocityTracker1D velocityTracker1D = aVar.b;
        VelocityTracker1D velocityTracker1D2 = aVar.a;
        boolean b = kx91.b(zvd0Var);
        long j2 = zvd0Var.b;
        if (b) {
            f73.q(velocityTracker1D2.d, null);
            velocityTracker1D2.e = 0;
            f73.q(velocityTracker1D.d, null);
            velocityTracker1D.e = 0;
            aVar.c = 0L;
        }
        if (!kx91.d(zvd0Var)) {
            List c = zvd0Var.c();
            int i = 0;
            for (int size = c.size(); i < size; size = size) {
                plu pluVar = (plu) c.get(i);
                aVar.a(pluVar.a, wu60.f(pluVar.e, j));
                i++;
            }
            aVar.a(j2, wu60.f(zvd0Var.n, j));
        }
        if (kx91.d(zvd0Var) && j2 - aVar.c > 40) {
            f73.q(velocityTracker1D2.d, null);
            velocityTracker1D2.e = 0;
            f73.q(velocityTracker1D.d, null);
            velocityTracker1D.e = 0;
            aVar.c = 0L;
        }
        aVar.c = j2;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static rbv c(h5a0 h5a0Var) {
        rbv f;
        if (h5a0Var instanceof c5a0) {
            return ((c5a0) h5a0Var).c;
        }
        if (h5a0Var instanceof e5a0) {
            ThemedImageUrlEntity themedImageUrlEntity = ((e5a0) h5a0Var).c.a;
            return (themedImageUrlEntity == null || (f = job1.f(themedImageUrlEntity, new bd90(14))) == null) ? new nbv(txg0.ybsdk_ic_yb_placeholder, null) : f;
        }
        if (h5a0Var instanceof g5a0) {
            return j5a0.d(((g5a0) h5a0Var).g, 0, 3);
        }
        if (h5a0Var instanceof f5a0) {
            return j5a0.d(((f5a0) h5a0Var).d, 0, 3);
        }
        w511.b();
        return null;
    }

    public static ThemedImageUrlEntity d(h5a0 h5a0Var) {
        if (h5a0Var instanceof c5a0) {
            return ((c5a0) h5a0Var).d;
        }
        if (h5a0Var instanceof e5a0) {
            return ((e5a0) h5a0Var).c.a;
        }
        if (h5a0Var instanceof g5a0) {
            return ((g5a0) h5a0Var).g;
        }
        if (h5a0Var instanceof f5a0) {
            return ((f5a0) h5a0Var).d;
        }
        w511.b();
        return null;
    }

    public static final void e(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            ixv.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            System.arraycopy(fArr4[i9], 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float b = b(fArr7, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr8[i11] * b);
                }
            }
            float sqrt = (float) Math.sqrt(b(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? 0.0f : b(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float b2 = b(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    b2 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = b2 / fArr10[i14];
        }
    }
}
