package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class rx40 {
    public float[] a;
    public int b;

    public rx40(int i) {
        this.a = i == 0 ? oor.a : new float[i];
    }

    public static String c(rx40 rx40Var, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        rx40Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = rx40Var.a;
        int i2 = rx40Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            float f = fArr[i3];
            if (i3 != 0) {
                sb.append((CharSequence) Extension.FIX_SPACE);
            }
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(f);
            i3++;
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        xva1.d("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rx40) {
            rx40 rx40Var = (rx40) obj;
            int i = rx40Var.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = rx40Var.a;
                d6w n = y6i0.n(0, i2);
                int i3 = n.a;
                int i4 = n.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        return c(this, 25);
    }

    public rx40() {
        this(16);
    }
}
