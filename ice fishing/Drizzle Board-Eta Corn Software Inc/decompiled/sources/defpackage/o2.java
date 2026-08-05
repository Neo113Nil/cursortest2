package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o2 extends ev {
    public final /* synthetic */ int amk52bBQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(int i, boolean z) {
        super(z);
        this.amk52bBQ = i;
    }

    public static long[] Qr9iLBAD(String str) {
        str.getClass();
        return new long[]{((Number) ev.P7K7Inc8.wxUZMvaN(str)).longValue()};
    }

    public static int[] b2ZJblxo(String str) {
        str.getClass();
        return new int[]{((Number) ev.NCTxEWno.wxUZMvaN(str)).intValue()};
    }

    public static boolean[] jb9XjC4I(String str) {
        str.getClass();
        return new boolean[]{((Boolean) ev.ow5vqvCr.wxUZMvaN(str)).booleanValue()};
    }

    @Override // defpackage.ev
    public final Object MdtA4re8(Object obj, String str) {
        switch (this.amk52bBQ) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return jb9XjC4I(str);
                }
                boolean[] jb9XjC4I = jb9XjC4I(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(jb9XjC4I, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                List list = (List) obj;
                p2 p2Var = ev.ow5vqvCr;
                return list != null ? x5.QT4Tf9Dt(list, ra.FySoLYna(p2Var.wxUZMvaN(str))) : ra.FySoLYna(p2Var.wxUZMvaN(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                return copyOf2;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? x5.QT4Tf9Dt(list2, ra.FySoLYna(Float.valueOf(Float.parseFloat(str)))) : ra.FySoLYna(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return b2ZJblxo(str);
                }
                int[] b2ZJblxo = b2ZJblxo(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(b2ZJblxo, 0, copyOf3, length3, 1);
                return copyOf3;
            case 5:
                List list3 = (List) obj;
                p2 p2Var2 = ev.NCTxEWno;
                return list3 != null ? x5.QT4Tf9Dt(list3, ra.FySoLYna(p2Var2.wxUZMvaN(str))) : ra.FySoLYna(p2Var2.wxUZMvaN(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return Qr9iLBAD(str);
                }
                long[] Qr9iLBAD = Qr9iLBAD(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(Qr9iLBAD, 0, copyOf4, length4, 1);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                p2 p2Var3 = ev.P7K7Inc8;
                return list4 != null ? x5.QT4Tf9Dt(list4, ra.FySoLYna(p2Var3.wxUZMvaN(str))) : ra.FySoLYna(p2Var3.wxUZMvaN(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, copyOf5, length5, 1);
                return (String[]) copyOf5;
            default:
                List list5 = (List) obj;
                return list5 != null ? x5.QT4Tf9Dt(list5, ra.FySoLYna(str)) : ra.FySoLYna(str);
        }
    }

    @Override // defpackage.ev
    public final String NCTxEWno() {
        switch (this.amk52bBQ) {
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

    @Override // defpackage.ev
    public final void VgvYg0wo(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.amk52bBQ) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, zArr);
                    break;
                }
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, x5.SMax8wMR(list));
                    break;
                }
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, fArr);
                    break;
                }
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        fArr2[i] = ((Number) it.next()).floatValue();
                        i++;
                    }
                    bundle.putFloatArray(str, fArr2);
                    break;
                }
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, x5.CTE3lpUp(list3));
                    break;
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putLongArray(str, jArr);
                    break;
                }
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    long[] jArr2 = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        jArr2[i] = ((Number) it2.next()).longValue();
                        i++;
                    }
                    bundle.putLongArray(str, jArr2);
                    break;
                }
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putStringArray(str, strArr);
                    break;
                }
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    break;
                }
        }
    }

    @Override // defpackage.ev
    public final Object qoPGr6Ce(String str, Bundle bundle) {
        switch (this.amk52bBQ) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                n50.P7K7Inc8(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return a1.hGvurcGl(booleanArray2);
                }
                n50.P7K7Inc8(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                n50.P7K7Inc8(str);
                throw null;
            case 3:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return a1.tef3qNMP(floatArray2);
                }
                n50.P7K7Inc8(str);
                throw null;
            case 4:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                n50.P7K7Inc8(str);
                throw null;
            case 5:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 == null) {
                    n50.P7K7Inc8(str);
                    throw null;
                }
                int length = intArray2.length;
                if (length == 0) {
                    return wf.NCTxEWno;
                }
                if (length == 1) {
                    return ra.FySoLYna(Integer.valueOf(intArray2[0]));
                }
                ArrayList arrayList = new ArrayList(intArray2.length);
                for (int i : intArray2) {
                    arrayList.add(Integer.valueOf(i));
                }
                return arrayList;
            case 6:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                n50.P7K7Inc8(str);
                throw null;
            case 7:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return a1.Sjrx9cEN(longArray2);
                }
                n50.P7K7Inc8(str);
                throw null;
            case 8:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                n50.P7K7Inc8(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || m50.b2ZJblxo(str, bundle)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(str);
                if (stringArray2 != null) {
                    return a1.LvHlPNBd(stringArray2);
                }
                n50.P7K7Inc8(str);
                throw null;
        }
    }

    @Override // defpackage.ev
    public final Object wxUZMvaN(String str) {
        switch (this.amk52bBQ) {
            case 0:
                return jb9XjC4I(str);
            case 1:
                str.getClass();
                return ra.FySoLYna(ev.ow5vqvCr.wxUZMvaN(str));
            case 2:
                str.getClass();
                return new float[]{Float.parseFloat(str)};
            case 3:
                str.getClass();
                return ra.FySoLYna(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return b2ZJblxo(str);
            case 5:
                str.getClass();
                return ra.FySoLYna(ev.NCTxEWno.wxUZMvaN(str));
            case 6:
                return Qr9iLBAD(str);
            case 7:
                str.getClass();
                return ra.FySoLYna(ev.P7K7Inc8.wxUZMvaN(str));
            case 8:
                str.getClass();
                return new String[]{str};
            default:
                str.getClass();
                return ra.FySoLYna(str);
        }
    }
}
