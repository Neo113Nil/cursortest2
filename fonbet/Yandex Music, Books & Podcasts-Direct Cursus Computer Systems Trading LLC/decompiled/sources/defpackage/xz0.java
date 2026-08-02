package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public class xz0 extends uz0 {
    public static IntRange A(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static IntRange B(Object[] objArr) {
        return new IntRange(0, objArr.length - 1, 1);
    }

    public static int C(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int D(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Object E(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int F(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int G(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String H(Object[] objArr, CharSequence charSequence, Function1 function1) {
        objArr.getClass();
        charSequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            glr.b(sb, obj, function1);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String I(byte[] bArr, String str, Function1 function1) {
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static /* synthetic */ String J(Object[] objArr, String str, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        return H(objArr, str, function1);
    }

    public static Object K(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        wvs.h("Array is empty.");
        return null;
    }

    public static Float L(Float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                floatValue = Math.max(floatValue, fArr[i].floatValue());
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(floatValue);
    }

    public static Float M(Float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                floatValue = Math.min(floatValue, fArr[i].floatValue());
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(floatValue);
    }

    public static Integer N(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static Object O(Object[] objArr, ohn ohnVar) {
        objArr.getClass();
        ohnVar.getClass();
        if (objArr.length != 0) {
            return objArr[phn.b.d(objArr.length)];
        }
        wvs.h("Array is empty.");
        return null;
    }

    public static float[] P(float[] fArr) {
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                fArr2[length - i] = fArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fArr2;
    }

    public static int[] Q(int[] iArr) {
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int length = iArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                iArr2[length - i] = iArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iArr2;
    }

    public static char R(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            wvs.h("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        xq0.x("Array has more than one element.");
        return (char) 0;
    }

    public static int S(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final void T(int[] iArr, HashSet hashSet) {
        iArr.getClass();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public static final void U(Object[] objArr, AbstractSet abstractSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List V(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return c5b.a;
        }
        if (length == 1) {
            return t75.c(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List W(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return c5b.a;
        }
        if (length == 1) {
            return t75.c(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List X(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new rx0(objArr, false)) : t75.c(objArr[0]) : c5b.a;
    }

    public static Set Y(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return q5b.a;
        }
        if (length == 1) {
            return uop.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(tah.a(objArr.length));
        U(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Iterable q(Object[] objArr) {
        return objArr.length == 0 ? c5b.a : new vz0(0, objArr);
    }

    public static Sequence r(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? p5b.a : new wz0(0, objArr);
    }

    public static boolean s(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static boolean t(int[] iArr, int i) {
        iArr.getClass();
        return F(iArr, i) >= 0;
    }

    public static boolean u(Object[] objArr, Object obj) {
        objArr.getClass();
        return G(objArr, obj) >= 0;
    }

    public static List v(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0) {
            xq0.o(dfi.c(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            xq0.o(dfi.c(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return c5b.a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return X(objArr);
        }
        if (length == 1) {
            return t75.c(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = length2 - length; i2 < length2; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static List w(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int x(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        wvs.h("Array is empty.");
        return 0;
    }

    public static Object y(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        wvs.h("Array is empty.");
        return null;
    }

    public static Object z(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }
}
