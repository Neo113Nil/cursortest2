package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public class jya implements rzb {
    public static final jya c = new jya();
    public static final String[] d = {"standard", "accelerate", "decelerate", "linear"};
    public final /* synthetic */ int a;
    public String b;

    public jya(String str, int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = str;
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if (r19.equals("linear") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jya c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new iya(str);
        }
        char c2 = 3;
        if (str.startsWith("spline")) {
            ygr ygrVar = new ygr();
            ygrVar.b = str;
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
            double d2 = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < copyOf.length; i2++) {
                double d3 = copyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d3;
                double d4 = i2 * d2;
                dArr3[i3] = d4;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d3 + 1.0d;
                    dArr3[i4] = d4 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d3 - 1.0d) - d2;
                    dArr3[i5] = (d4 - 1.0d) - d2;
                }
            }
            pdi pdiVar = new pdi(dArr3, dArr2);
            System.out.println(" 0 " + pdiVar.h0(0.0d));
            System.out.println(" 1 " + pdiVar.h0(1.0d));
            ygrVar.e = pdiVar;
            return ygrVar;
        }
        if (str.startsWith("Schlick")) {
            guo guoVar = new guo();
            guoVar.b = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            guoVar.e = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i6 = indexOf4 + 1;
            guoVar.f = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return guoVar;
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
                return new iya("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new iya("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new iya("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new iya("cubic(1, 1, 0, 0)");
            case 4:
                return new iya("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new iya("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(d));
                return c;
        }
    }

    public double b(double d2) {
        return 1.0d;
    }

    @Override // defpackage.rzb
    public jxt d(Map map) {
        String str = this.b;
        if (!map.containsKey(str)) {
            throw new mac("There is no variable ".concat(str), (Throwable) null);
        }
        Object obj = map.get(str);
        obj.getClass();
        return (jxt) obj;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 4:
                return this.b;
            default:
                return super.toString();
        }
    }

    public jya(String str, yxt yxtVar) {
        this.a = 1;
        this.b = str;
    }

    public jya() {
        this.a = 0;
        this.b = "identity";
    }

    public double a(double d2) {
        return d2;
    }
}
