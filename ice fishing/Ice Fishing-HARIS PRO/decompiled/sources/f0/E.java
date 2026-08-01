package f0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class E extends L {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2871r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(int i, boolean z2) {
        super(z2);
        this.f2871r = i;
    }

    public static float[] f(String str) {
        D1.i.e(str, "value");
        return new float[]{((Number) L.i.d(str)).floatValue()};
    }

    public static int[] g(String str) {
        D1.i.e(str, "value");
        return new int[]{((Number) L.f2878b.d(str)).intValue()};
    }

    public static long[] h(String str) {
        D1.i.e(str, "value");
        return new long[]{((Number) L.f2881f.d(str)).longValue()};
    }

    public static boolean[] i(String str) {
        D1.i.e(str, "value");
        return new boolean[]{((Boolean) L.f2885l.d(str)).booleanValue()};
    }

    @Override // f0.L
    public final Object a(Bundle bundle, String str) {
        switch (this.f2871r) {
            case 0:
                return (boolean[]) D1.h.c(bundle, "bundle", str, "key", str);
            case 1:
                boolean[] zArr = (boolean[]) D1.h.c(bundle, "bundle", str, "key", str);
                if (zArr == null) {
                    return null;
                }
                D1.i.e(zArr, "<this>");
                int length = zArr.length;
                if (length == 0) {
                    return u1.o.f4473a;
                }
                if (length == 1) {
                    return h0.f.s(Boolean.valueOf(zArr[0]));
                }
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z2 : zArr) {
                    arrayList.add(Boolean.valueOf(z2));
                }
                return arrayList;
            case 2:
                return (float[]) D1.h.c(bundle, "bundle", str, "key", str);
            case 3:
                float[] fArr = (float[]) D1.h.c(bundle, "bundle", str, "key", str);
                if (fArr == null) {
                    return null;
                }
                D1.i.e(fArr, "<this>");
                int length2 = fArr.length;
                if (length2 == 0) {
                    return u1.o.f4473a;
                }
                if (length2 == 1) {
                    return h0.f.s(Float.valueOf(fArr[0]));
                }
                ArrayList arrayList2 = new ArrayList(fArr.length);
                for (float f2 : fArr) {
                    arrayList2.add(Float.valueOf(f2));
                }
                return arrayList2;
            case 4:
                return (int[]) D1.h.c(bundle, "bundle", str, "key", str);
            case 5:
                int[] iArr = (int[]) D1.h.c(bundle, "bundle", str, "key", str);
                if (iArr == null) {
                    return null;
                }
                D1.i.e(iArr, "<this>");
                int length3 = iArr.length;
                return length3 != 0 ? length3 != 1 ? u1.f.I(iArr) : h0.f.s(Integer.valueOf(iArr[0])) : u1.o.f4473a;
            case 6:
                return (long[]) D1.h.c(bundle, "bundle", str, "key", str);
            case 7:
                long[] jArr = (long[]) D1.h.c(bundle, "bundle", str, "key", str);
                if (jArr == null) {
                    return null;
                }
                D1.i.e(jArr, "<this>");
                int length4 = jArr.length;
                if (length4 == 0) {
                    return u1.o.f4473a;
                }
                if (length4 == 1) {
                    return h0.f.s(Long.valueOf(jArr[0]));
                }
                ArrayList arrayList3 = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList3.add(Long.valueOf(j));
                }
                return arrayList3;
            case 8:
                return (String[]) D1.h.c(bundle, "bundle", str, "key", str);
            default:
                String[] strArr = (String[]) D1.h.c(bundle, "bundle", str, "key", str);
                if (strArr != null) {
                    return u1.f.H(strArr);
                }
                return null;
        }
    }

    @Override // f0.L
    public final String b() {
        switch (this.f2871r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // f0.L
    public final Object c(Object obj, String str) {
        switch (this.f2871r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] i = i(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(i, 0, copyOf, length, 1);
                D1.i.b(copyOf);
                return copyOf;
            case 1:
                List list = (List) obj;
                F f2 = L.f2885l;
                return list != null ? u1.g.U(list, h0.f.s(f2.d(str))) : h0.f.s(f2.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return f(str);
                }
                float[] f3 = f(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(f3, 0, copyOf2, length2, 1);
                D1.i.b(copyOf2);
                return copyOf2;
            case 3:
                List list2 = (List) obj;
                F f4 = L.i;
                return list2 != null ? u1.g.U(list2, h0.f.s(f4.d(str))) : h0.f.s(f4.d(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] g2 = g(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(g2, 0, copyOf3, length3, 1);
                D1.i.b(copyOf3);
                return copyOf3;
            case 5:
                List list3 = (List) obj;
                F f5 = L.f2878b;
                return list3 != null ? u1.g.U(list3, h0.f.s(f5.d(str))) : h0.f.s(f5.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] h2 = h(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(h2, 0, copyOf4, length4, 1);
                D1.i.b(copyOf4);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                F f6 = L.f2881f;
                return list4 != null ? u1.g.U(list4, h0.f.s(f6.d(str))) : h0.f.s(f6.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                D1.i.b(copyOf5);
                return (String[]) copyOf5;
            default:
                List list5 = (List) obj;
                return list5 != null ? u1.g.U(list5, h0.f.s(str)) : h0.f.s(str);
        }
    }

    @Override // f0.L
    public final Object d(String str) {
        switch (this.f2871r) {
            case 0:
                return i(str);
            case 1:
                D1.i.e(str, "value");
                return h0.f.s(L.f2885l.d(str));
            case 2:
                return f(str);
            case 3:
                D1.i.e(str, "value");
                return h0.f.s(L.i.d(str));
            case 4:
                return g(str);
            case 5:
                D1.i.e(str, "value");
                return h0.f.s(L.f2878b.d(str));
            case 6:
                return h(str);
            case 7:
                D1.i.e(str, "value");
                return h0.f.s(L.f2881f.d(str));
            case 8:
                D1.i.e(str, "value");
                return new String[]{str};
            default:
                D1.i.e(str, "value");
                return h0.f.s(str);
        }
    }

    @Override // f0.L
    public final void e(Bundle bundle, String str, Object obj) {
        boolean[] zArr;
        float[] fArr;
        long[] jArr;
        switch (this.f2871r) {
            case 0:
                D1.i.e(str, "key");
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                D1.i.e(str, "key");
                if (list != null) {
                    D1.i.e(list, "<this>");
                    zArr = new boolean[list.size()];
                    Iterator it = list.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        zArr[i] = ((Boolean) it.next()).booleanValue();
                        i++;
                    }
                } else {
                    zArr = null;
                }
                bundle.putBooleanArray(str, zArr);
                break;
            case 2:
                D1.i.e(str, "key");
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 3:
                List list2 = (List) obj;
                D1.i.e(str, "key");
                if (list2 != null) {
                    fArr = new float[list2.size()];
                    Iterator it2 = list2.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        fArr[i2] = ((Number) it2.next()).floatValue();
                        i2++;
                    }
                } else {
                    fArr = null;
                }
                bundle.putFloatArray(str, fArr);
                break;
            case 4:
                D1.i.e(str, "key");
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                List list3 = (List) obj;
                D1.i.e(str, "key");
                bundle.putIntArray(str, list3 != null ? u1.g.X(list3) : null);
                break;
            case 6:
                D1.i.e(str, "key");
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                List list4 = (List) obj;
                D1.i.e(str, "key");
                if (list4 != null) {
                    jArr = new long[list4.size()];
                    Iterator it3 = list4.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        jArr[i3] = ((Number) it3.next()).longValue();
                        i3++;
                    }
                } else {
                    jArr = null;
                }
                bundle.putLongArray(str, jArr);
                break;
            case 8:
                D1.i.e(str, "key");
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                List list5 = (List) obj;
                D1.i.e(str, "key");
                bundle.putStringArray(str, list5 != null ? (String[]) list5.toArray(new String[0]) : null);
                break;
        }
    }
}
