package defpackage;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public class qbn {
    public static final qbn b = new qbn();
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public String a = ClidProvider.IDENTITY;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0134, code lost:
    
        if (r19.equals("linear") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qbn c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new pbn(str);
        }
        char c2 = 3;
        if (str.startsWith("spline")) {
            iau0 iau0Var = new iau0();
            iau0Var.a = str;
            double[] dArr = new double[str.length() / 2];
            int indexOf = str.indexOf(40) + 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i = 0;
            while (indexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < copyOf.length; i2++) {
                double d2 = copyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d2;
                double d3 = i2 * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
            }
            q630 q630Var = new q630(dArr3, dArr2);
            PrintStream printStream = System.out;
            q630Var.b(0.0d);
            printStream.getClass();
            PrintStream printStream2 = System.out;
            q630Var.b(1.0d);
            printStream2.getClass();
            iau0Var.d = q630Var;
            return iau0Var;
        }
        if (str.startsWith("Schlick")) {
            xom0 xom0Var = new xom0();
            xom0Var.a = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            xom0Var.d = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i6 = indexOf4 + 1;
            xom0Var.e = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return xom0Var;
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1102672091:
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new pbn("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new pbn("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new pbn("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new pbn("cubic(1, 1, 0, 0)");
            case 4:
                return new pbn("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new pbn("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream3 = System.err;
                Arrays.toString(c);
                printStream3.getClass();
                return b;
        }
    }

    public double a(double d) {
        return d;
    }

    public double b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.a;
    }
}
