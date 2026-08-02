package defpackage;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class tfu {
    public cr a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    public static tfu b(String str) {
        if (str.startsWith("CUSTOM")) {
            qfu qfuVar = new qfu();
            qfuVar.g = new float[1];
            return qfuVar;
        }
        switch (str) {
            case "rotationX":
                return new pfu(3);
            case "rotationY":
                return new pfu(4);
            case "translationX":
                return new pfu(7);
            case "translationY":
                return new pfu(8);
            case "translationZ":
                return new pfu(9);
            case "progress":
                sfu sfuVar = new sfu();
                sfuVar.g = false;
                return sfuVar;
            case "scaleX":
                return new pfu(5);
            case "scaleY":
                return new pfu(6);
            case "waveVariesBy":
                return new pfu(0);
            case "rotation":
                return new pfu(2);
            case "elevation":
                return new pfu(1);
            case "transitionPathRotate":
                return new rfu();
            case "alpha":
                return new pfu(0);
            case "waveOffset":
                return new pfu(0);
            default:
                return null;
        }
    }

    public final float a(float f) {
        char c;
        double signum;
        double abs;
        cr crVar = this.a;
        lg3 lg3Var = (lg3) crVar.h;
        double[] dArr = (double[]) crVar.i;
        if (lg3Var != null) {
            lg3Var.i0(f, dArr);
        } else {
            dArr[0] = ((float[]) crVar.f)[0];
            dArr[1] = ((float[]) crVar.g)[0];
            dArr[2] = ((float[]) crVar.c)[0];
        }
        double[] dArr2 = (double[]) crVar.i;
        double d = dArr2[0];
        double d2 = dArr2[1];
        c1t c1tVar = (c1t) crVar.b;
        double d3 = f;
        c1tVar.getClass();
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            c = 2;
        } else if (d3 >= 1.0d) {
            c = 2;
            d4 = 1.0d;
        } else {
            int binarySearch = Arrays.binarySearch((double[]) c1tVar.d, d3);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            float[] fArr = (float[]) c1tVar.c;
            float f2 = fArr[binarySearch];
            int i = binarySearch - 1;
            float f3 = fArr[i];
            c = 2;
            double[] dArr3 = (double[]) c1tVar.d;
            double d5 = dArr3[binarySearch];
            double d6 = dArr3[i];
            double d7 = (f2 - f3) / (d5 - d6);
            d4 = ((((d3 * d3) - (d6 * d6)) * d7) / 2.0d) + ((d3 - d6) * (f3 - (d7 * d6))) + ((double[]) c1tVar.e)[i];
        }
        double d8 = d4 + d2;
        switch (c1tVar.b) {
            case 1:
                signum = Math.signum(0.5d - (d8 % 1.0d));
                break;
            case 2:
                abs = Math.abs((((d8 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                signum = 1.0d - abs;
                break;
            case 3:
                signum = (((d8 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                signum = 1.0d - (((d8 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                signum = Math.cos((d2 + d8) * 6.283185307179586d);
                break;
            case 6:
                double abs2 = 1.0d - Math.abs(((d8 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                signum = 1.0d - abs;
                break;
            case 7:
                signum = ((pdi) c1tVar.f).h0(d8 % 1.0d);
                break;
            default:
                signum = Math.sin(6.283185307179586d * d8);
                break;
        }
        return (float) ((signum * ((double[]) crVar.i)[c]) + d);
    }

    public abstract void d(View view, float f);

    public final void e() {
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
        Collections.sort(arrayList, new zda(15));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.c;
        String str = this.d;
        cr crVar = new cr(10);
        c1t c1tVar = new c1t(7);
        c1tVar.c = new float[0];
        c1tVar.d = new double[0];
        crVar.b = c1tVar;
        c1tVar.b = i6;
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
            c1tVar.f = new pdi(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        crVar.c = new float[size];
        crVar.d = new double[size];
        crVar.e = new float[size];
        crVar.f = new float[size];
        crVar.g = new float[size];
        float[] fArr = new float[size];
        this.a = crVar;
        Iterator it = arrayList.iterator();
        int i12 = i4;
        while (it.hasNext()) {
            laf lafVar = (laf) it.next();
            float f = lafVar.d;
            dArr[i12] = f * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = lafVar.b;
            dArr6[i4] = f2;
            float f3 = lafVar.c;
            dArr6[i2] = f3;
            float f4 = lafVar.e;
            dArr6[i] = f4;
            cr crVar2 = this.a;
            ((double[]) crVar2.d)[i12] = lafVar.a / 100.0d;
            ((float[]) crVar2.e)[i12] = f;
            ((float[]) crVar2.f)[i12] = f3;
            ((float[]) crVar2.g)[i12] = f4;
            ((float[]) crVar2.c)[i12] = f2;
            i12++;
        }
        cr crVar3 = this.a;
        float[] fArr2 = (float[]) crVar3.e;
        c1t c1tVar2 = (c1t) crVar3.b;
        double[] dArr7 = (double[]) crVar3.d;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) crVar3.c;
        crVar3.i = new double[fArr3.length + i13];
        double[] dArr9 = new double[fArr3.length + i13];
        double d6 = 0.0d;
        if (dArr7[i4] > 0.0d) {
            c1tVar2.a(0.0d, fArr2[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            c1tVar2.a(d, fArr2[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr10 = dArr8[i14];
            dArr10[i4] = ((float[]) crVar3.f)[i14];
            dArr10[i2] = ((float[]) crVar3.g)[i14];
            dArr10[2] = fArr3[i14];
            c1tVar2.a(dArr7[i14], fArr2[i14]);
        }
        double d7 = 0.0d;
        int i15 = i4;
        while (true) {
            if (i15 >= ((float[]) c1tVar2.c).length) {
                break;
            }
            d7 += r10[i15];
            i15++;
        }
        double d8 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr4 = (float[]) c1tVar2.c;
            if (i16 >= fArr4.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr4[i17] + fArr4[i16]) / 2.0f;
            double d9 = d6;
            double[] dArr11 = (double[]) c1tVar2.d;
            d8 = ((dArr11[i16] - dArr11[i17]) * f5) + d8;
            i16++;
            d6 = d9;
        }
        double d10 = d6;
        int i18 = i4;
        while (true) {
            float[] fArr5 = (float[]) c1tVar2.c;
            if (i18 >= fArr5.length) {
                break;
            }
            fArr5[i18] = fArr5[i18] * ((float) (d7 / d8));
            i18++;
        }
        ((double[]) c1tVar2.e)[i4] = d10;
        int i19 = i2;
        while (true) {
            float[] fArr6 = (float[]) c1tVar2.c;
            if (i19 >= fArr6.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr6[i20] + fArr6[i19]) / 2.0f;
            double[] dArr12 = (double[]) c1tVar2.d;
            double d11 = dArr12[i19] - dArr12[i20];
            double[] dArr13 = (double[]) c1tVar2.e;
            dArr13[i19] = (d11 * f6) + dArr13[i20];
            i19++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            crVar3.h = lg3.f0(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            crVar3.h = null;
        }
        lg3.f0(i5, dArr, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            laf lafVar = (laf) it.next();
            StringBuilder m = tlm.m(str, "[");
            m.append(lafVar.a);
            m.append(" , ");
            m.append(decimalFormat.format(lafVar.b));
            m.append("] ");
            str = m.toString();
        }
        return str;
    }

    public void c(p86 p86Var) {
    }
}
