package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ox0 {
    public static final Class GWasM1elztuh;
    public static final mc1 X1lG3V04pd;
    public static final mc1 Yi7zF1RB1;

    static {
        Class<?> cls;
        Class<?> cls2;
        ns0 ns0Var = ns0.X1lG3V04pd;
        mc1 mc1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        GWasM1elztuh = cls;
        try {
            ns0 ns0Var2 = ns0.X1lG3V04pd;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                mc1Var = (mc1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        Yi7zF1RB1 = mc1Var;
        X1lG3V04pd = new mc1();
    }

    public static int AvO7iQsrTN(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += pb.JFJ3QoxA((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static boolean E7jCp8Ls(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int EljAMC1QTz(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += pb.mOu10nynGul((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int GWasM1elztuh(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pb.JFJ3QoxA(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void Mjvvu5DE(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                pbVar.getClass();
                pbVar.Mjvvu5DE(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = pb.EljAMC1QTz;
            i3 += 4;
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.mE4lRynR(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static int OOA6hdeuvCS(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pb.JFJ3QoxA(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void WIEu4Ya2g8(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.Mjvvu5DE(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = pb.EljAMC1QTz;
            i3 += 4;
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.mE4lRynR(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void WRKkgoJXwDn(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.k8h8IjolWQ(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += pb.mOu10nynGul(((Integer) list.get(i4)).intValue());
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.EXrPz3p7hFb(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void WdrkLMV3xh(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                pbVar.ozMwhSAI(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += pb.JFJ3QoxA((longValue2 >> 63) ^ (longValue2 << 1));
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            pbVar.AEn1Rrio((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static int X1lG3V04pd(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (pb.encWxUiV2(i) + 8) * size;
    }

    public static void XnEVoBF0td1l(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.iwATDS1i01k(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = pb.EljAMC1QTz;
            i3++;
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.XnEVoBF0td1l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void Y6hRI1cF8(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.Mjvvu5DE(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = pb.EljAMC1QTz;
            i3 += 4;
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.mE4lRynR(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int Yi7zF1RB1(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (pb.encWxUiV2(i) + 4) * size;
    }

    public static void YmKjaVtbfp5Z(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.jivtDDk9H(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = pb.EljAMC1QTz;
            i3 += 8;
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.Y6hRI1cF8(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void arNh8D4Z5gB(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.ozMwhSAI(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += pb.JFJ3QoxA(((Long) list.get(i4)).longValue());
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.AEn1Rrio(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void cilMamHF(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.jivtDDk9H(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = pb.EljAMC1QTz;
            i3 += 8;
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.Y6hRI1cF8(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int encWxUiV2(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pb.mOu10nynGul(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void iwATDS1i01k(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.cilMamHF(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += pb.JFJ3QoxA(((Integer) list.get(i4)).intValue());
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.lv06NcmrQ(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void jivtDDk9H(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.ozMwhSAI(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += pb.JFJ3QoxA(((Long) list.get(i4)).longValue());
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.AEn1Rrio(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void lv06NcmrQ(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                pbVar.k8h8IjolWQ(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += pb.mOu10nynGul((intValue2 >> 31) ^ (intValue2 << 1));
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            pbVar.EXrPz3p7hFb((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void mE4lRynR(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                pbVar.cilMamHF(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += pb.JFJ3QoxA(((Integer) list.get(i4)).intValue());
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.lv06NcmrQ(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int mOu10nynGul(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pb.JFJ3QoxA(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void rQPn8YBR(mc1 mc1Var, Object obj, Object obj2) {
        mc1Var.getClass();
        ay ayVar = (ay) obj;
        lc1 lc1Var = ayVar.unknownFields;
        lc1 lc1Var2 = ((ay) obj2).unknownFields;
        lc1 lc1Var3 = lc1.EljAMC1QTz;
        if (!lc1Var3.equals(lc1Var2)) {
            if (lc1Var3.equals(lc1Var)) {
                int i = lc1Var.GWasM1elztuh + lc1Var2.GWasM1elztuh;
                int[] copyOf = Arrays.copyOf(lc1Var.Yi7zF1RB1, i);
                System.arraycopy(lc1Var2.Yi7zF1RB1, 0, copyOf, lc1Var.GWasM1elztuh, lc1Var2.GWasM1elztuh);
                Object[] copyOf2 = Arrays.copyOf(lc1Var.X1lG3V04pd, i);
                System.arraycopy(lc1Var2.X1lG3V04pd, 0, copyOf2, lc1Var.GWasM1elztuh, lc1Var2.GWasM1elztuh);
                lc1Var = new lc1(i, copyOf, copyOf2, true);
            } else {
                lc1Var.getClass();
                if (!lc1Var2.equals(lc1Var3)) {
                    if (!lc1Var.OOA6hdeuvCS) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = lc1Var.GWasM1elztuh + lc1Var2.GWasM1elztuh;
                    lc1Var.GWasM1elztuh(i2);
                    System.arraycopy(lc1Var2.Yi7zF1RB1, 0, lc1Var.Yi7zF1RB1, lc1Var.GWasM1elztuh, lc1Var2.GWasM1elztuh);
                    System.arraycopy(lc1Var2.X1lG3V04pd, 0, lc1Var.X1lG3V04pd, lc1Var.GWasM1elztuh, lc1Var2.GWasM1elztuh);
                    lc1Var.GWasM1elztuh = i2;
                }
            }
        }
        ayVar.unknownFields = lc1Var;
    }

    public static void uFEq9NpZ(int i, List list, j6IIN2O8eOU j6iin2o8eou, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                pbVar.getClass();
                pbVar.jivtDDk9H(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        pbVar.M3K9sHhK(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = pb.EljAMC1QTz;
            i3 += 8;
        }
        pbVar.EXrPz3p7hFb(i3);
        while (i2 < list.size()) {
            pbVar.Y6hRI1cF8(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static int xqGvceK5x(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += pb.JFJ3QoxA(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static Object JFJ3QoxA(Object obj, int i, h30 h30Var, Object obj2, mc1 mc1Var) {
        return obj2;
    }
}
