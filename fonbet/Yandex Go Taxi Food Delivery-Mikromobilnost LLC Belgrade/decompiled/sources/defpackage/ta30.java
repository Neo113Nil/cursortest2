package defpackage;

import androidx.constraintlayout.widget.e;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class ta30 implements Comparable {
    public static final String[] K = {"position", RemoteBioParameters.X, RemoteBioParameters.Y, "width", "height", "pathRotate"};
    public float A;
    public qbn a;
    public float c;
    public float w;
    public float x;
    public float y;
    public float z;
    public int b = 0;
    public float B = Float.NaN;
    public int C = -1;
    public int D = -1;
    public float E = Float.NaN;
    public ia30 F = null;
    public LinkedHashMap G = new LinkedHashMap();
    public int H = 0;
    public double[] I = new double[18];
    public double[] J = new double[18];

    public static boolean b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public static void e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public final void a(e.a aVar) {
        int ordinal;
        this.a = qbn.c(aVar.d.d);
        e.c cVar = aVar.d;
        this.C = cVar.e;
        this.D = cVar.b;
        this.B = cVar.h;
        this.b = cVar.f;
        float f = aVar.c.e;
        this.E = aVar.e.C;
        for (String str : aVar.g.keySet()) {
            c7e c7eVar = (c7e) aVar.g.get(str);
            if (c7eVar != null && (ordinal = c7eVar.c.ordinal()) != 4 && ordinal != 5 && ordinal != 7) {
                this.G.put(str, c7eVar);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.z;
        float f4 = this.A;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        ia30 ia30Var = this.F;
        if (ia30Var != null) {
            float[] fArr2 = new float[2];
            ia30Var.c(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f;
            double d3 = f2;
            double sin = Math.sin(d3) * d2;
            f2 = (float) ((f7 - (Math.cos(d3) * d2)) - (f4 / 2.0f));
            f = (float) ((sin + f6) - (f3 / 2.0f));
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.w, ((ta30) obj).w);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
    }

    public final void f(ia30 ia30Var, ta30 ta30Var) {
        double d = (((this.z / 2.0f) + this.x) - ta30Var.x) - (ta30Var.z / 2.0f);
        double d2 = (((this.A / 2.0f) + this.y) - ta30Var.y) - (ta30Var.A / 2.0f);
        this.F = ia30Var;
        this.x = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.E)) {
            this.y = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.y = (float) Math.toRadians(this.E);
        }
    }
}
