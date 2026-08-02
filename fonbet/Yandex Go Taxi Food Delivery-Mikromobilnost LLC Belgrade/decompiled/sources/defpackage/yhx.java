package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class yhx {
    public bu0 a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    public final float a(float f) {
        bu0 bu0Var = this.a;
        mif mifVar = (mif) bu0Var.g;
        double[] dArr = (double[]) bu0Var.h;
        if (mifVar != null) {
            mifVar.c(f, dArr);
        } else {
            dArr[0] = ((float[]) bu0Var.e)[0];
            dArr[1] = ((float[]) bu0Var.f)[0];
            dArr[2] = ((float[]) bu0Var.b)[0];
        }
        double[] dArr2 = (double[]) bu0Var.h;
        return (float) ((((br80) bu0Var.a).c(f, dArr2[1]) * ((double[]) bu0Var.h)[2]) + dArr2[0]);
    }

    public final float b(float f) {
        char c;
        char c2;
        double d;
        double d2;
        double d3;
        double signum;
        bu0 bu0Var = this.a;
        br80 br80Var = (br80) bu0Var.a;
        mif mifVar = (mif) bu0Var.g;
        double[] dArr = (double[]) bu0Var.i;
        if (mifVar != null) {
            double d4 = f;
            mifVar.f(d4, dArr);
            ((mif) bu0Var.g).c(d4, (double[]) bu0Var.h);
        } else {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d5 = f;
        double c3 = br80Var.c(d5, ((double[]) bu0Var.h)[1]);
        double d6 = ((double[]) bu0Var.h)[1];
        double d7 = ((double[]) bu0Var.i)[1];
        double b = br80Var.b(d5) + d6;
        if (d5 <= 0.0d) {
            c = 2;
            c2 = 0;
            d = 0.0d;
        } else if (d5 >= 1.0d) {
            c = 2;
            c2 = 0;
            d = 1.0d;
        } else {
            int binarySearch = Arrays.binarySearch(br80Var.b, d5);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            float[] fArr = br80Var.a;
            float f2 = fArr[binarySearch];
            int i = binarySearch - 1;
            float f3 = fArr[i];
            c = 2;
            float f4 = f2 - f3;
            c2 = 0;
            double d8 = f4;
            double[] dArr2 = br80Var.b;
            double d9 = dArr2[binarySearch];
            double d10 = dArr2[i];
            double d11 = d8 / (d9 - d10);
            d = (f3 - (d11 * d10)) + (d5 * d11);
        }
        double d12 = d + d7;
        switch (br80Var.e) {
            case 1:
                d2 = 0.0d;
                break;
            case 2:
                d3 = d12 * 4.0d;
                signum = Math.signum((((b * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                d2 = signum * d3;
                break;
            case 3:
                d2 = d12 * 2.0d;
                break;
            case 4:
                d2 = (-d12) * 2.0d;
                break;
            case 5:
                d2 = Math.sin(6.283185307179586d * b) * (-6.283185307179586d) * d12;
                break;
            case 6:
                d2 = ((((b * 4.0d) + 2.0d) % 4.0d) - 2.0d) * d12 * 4.0d;
                break;
            case 7:
                d2 = br80Var.d.e(b % 1.0d);
                break;
            default:
                d3 = d12 * 6.283185307179586d;
                signum = Math.cos(6.283185307179586d * b);
                d2 = signum * d3;
                break;
        }
        double[] dArr3 = (double[]) bu0Var.i;
        return (float) ((d2 * ((double[]) bu0Var.h)[c]) + (c3 * dArr3[c]) + dArr3[c2]);
    }

    public void c(c7e c7eVar) {
    }

    public final void d() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new rvr(9));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.c;
        String str = this.d;
        bu0 bu0Var = new bu0();
        br80 br80Var = new br80();
        bu0Var.a = br80Var;
        br80Var.e = i6;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int indexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i7 = 0;
            d = 1.0d;
            while (indexOf2 != -1) {
                dArr3[i7] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i7++;
            }
            dArr3[i7] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr3, i7 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d2 = 1.0d / length2;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i8 = 0;
            while (i8 < copyOf.length) {
                double d3 = copyOf[i8];
                int i9 = i8 + length2;
                dArr4[i9][0] = d3;
                double d4 = d2;
                double d5 = i8 * d4;
                dArr5[i9] = d5;
                if (i8 > 0) {
                    int i10 = (length2 * 2) + i8;
                    dArr4[i10][0] = d3 + 1.0d;
                    dArr5[i10] = d5 + 1.0d;
                    int i11 = i8 - 1;
                    dArr4[i11][0] = (d3 - 1.0d) - d4;
                    dArr5[i11] = (d5 - 1.0d) - d4;
                }
                i8++;
                d2 = d4;
            }
            br80Var.d = new q630(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        bu0Var.b = new float[size];
        bu0Var.c = new double[size];
        bu0Var.d = new float[size];
        bu0Var.e = new float[size];
        bu0Var.f = new float[size];
        float[] fArr = new float[size];
        this.a = bu0Var;
        Iterator it = arrayList.iterator();
        int i12 = i4;
        while (it.hasNext()) {
            xhx xhxVar = (xhx) it.next();
            float f = xhxVar.d;
            dArr[i12] = f * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = xhxVar.b;
            dArr6[i4] = f2;
            float f3 = xhxVar.c;
            dArr6[i2] = f3;
            float f4 = xhxVar.e;
            dArr6[i] = f4;
            bu0 bu0Var2 = this.a;
            ((double[]) bu0Var2.c)[i12] = xhxVar.a / 100.0d;
            ((float[]) bu0Var2.d)[i12] = f;
            ((float[]) bu0Var2.e)[i12] = f3;
            ((float[]) bu0Var2.f)[i12] = f4;
            ((float[]) bu0Var2.b)[i12] = f2;
            i12++;
        }
        bu0 bu0Var3 = this.a;
        float[] fArr2 = (float[]) bu0Var3.d;
        br80 br80Var2 = (br80) bu0Var3.a;
        double[] dArr7 = (double[]) bu0Var3.c;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) bu0Var3.b;
        bu0Var3.h = new double[fArr3.length + i13];
        bu0Var3.i = new double[fArr3.length + i13];
        double d6 = 0.0d;
        if (dArr7[i4] > 0.0d) {
            br80Var2.a(0.0d, fArr2[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            br80Var2.a(d, fArr2[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr9 = dArr8[i14];
            dArr9[i4] = ((float[]) bu0Var3.e)[i14];
            dArr9[i2] = ((float[]) bu0Var3.f)[i14];
            dArr9[2] = fArr3[i14];
            br80Var2.a(dArr7[i14], fArr2[i14]);
        }
        double d7 = 0.0d;
        int i15 = i4;
        while (true) {
            if (i15 >= br80Var2.a.length) {
                break;
            }
            d7 += r9[i15];
            i15++;
        }
        double d8 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr4 = br80Var2.a;
            if (i16 >= fArr4.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr4[i17] + fArr4[i16]) / 2.0f;
            double[] dArr10 = br80Var2.b;
            d8 = ((dArr10[i16] - dArr10[i17]) * f5) + d8;
            i16++;
        }
        int i18 = i4;
        while (true) {
            float[] fArr5 = br80Var2.a;
            if (i18 >= fArr5.length) {
                break;
            }
            fArr5[i18] = fArr5[i18] * ((float) (d7 / d8));
            i18++;
            d6 = d6;
        }
        br80Var2.c[i4] = d6;
        int i19 = i2;
        while (true) {
            float[] fArr6 = br80Var2.a;
            if (i19 >= fArr6.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr6[i20] + fArr6[i19]) / 2.0f;
            double[] dArr11 = br80Var2.b;
            double d9 = dArr11[i19] - dArr11[i20];
            double[] dArr12 = br80Var2.c;
            dArr12[i19] = (d9 * f6) + dArr12[i20];
            i19++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            bu0Var3.g = mif.a(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            bu0Var3.g = null;
        }
        mif.a(i5, dArr, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            xhx xhxVar = (xhx) it.next();
            StringBuilder v = oyr.v(str, "[");
            v.append(xhxVar.a);
            v.append(" , ");
            v.append(decimalFormat.format(xhxVar.b));
            v.append("] ");
            str = v.toString();
        }
        return str;
    }
}
