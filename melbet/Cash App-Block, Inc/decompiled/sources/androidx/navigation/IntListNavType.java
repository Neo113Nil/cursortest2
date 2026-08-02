package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReaderKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt__ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes3.dex */
public final class IntListNavType extends NavType {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntListNavType(boolean z, int i) {
        super(z);
        this.$r8$classId = i;
    }

    @Override // androidx.navigation.NavType
    public final Object get(Bundle bundle, String str) {
        switch (this.$r8$classId) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return ArraysKt___ArraysKt.toList(intArray);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return ArraysKt___ArraysKt.toList(booleanArray2);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 3:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 4:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return ArraysKt___ArraysKt.toList(floatArray2);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 5:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return intArray2;
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 6:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 7:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return ArraysKt___ArraysKt.toList(longArray2);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            case 8:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || BundleKt.m1098isNullimpl(bundle, str)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(str);
                if (stringArray2 != null) {
                    return ArraysKt___ArraysKt.toList(stringArray2);
                }
                SavedStateReaderKt.keyOrValueNotFoundError(str);
                throw null;
        }
    }

    @Override // androidx.navigation.NavType
    public final String getName() {
        switch (this.$r8$classId) {
            case 0:
                return "List<Int>";
            case 1:
                return "boolean[]";
            case 2:
                return "List<Boolean>";
            case 3:
                return "float[]";
            case 4:
                return "List<Float>";
            case 5:
                return "integer[]";
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

    @Override // androidx.navigation.NavType
    public final Object parseValue(Object obj, String str) {
        switch (this.$r8$classId) {
            case 0:
                List list = (List) obj;
                IntNavType intNavType = NavType.IntType;
                if (list != null) {
                    return CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(intNavType.mo1158parseValue(str)), (Collection) list);
                }
                return CollectionsKt__CollectionsJVMKt.listOf(intNavType.mo1158parseValue(str));
            case 1:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return m1157parseValue(str);
                }
                boolean[] m1157parseValue = m1157parseValue(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(m1157parseValue, 0, copyOf, length, 1);
                return copyOf;
            case 2:
                List list2 = (List) obj;
                IntNavType intNavType2 = NavType.BoolType;
                if (list2 != null) {
                    return CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(intNavType2.mo1158parseValue(str)), (Collection) list2);
                }
                return CollectionsKt__CollectionsJVMKt.listOf(intNavType2.mo1158parseValue(str));
            case 3:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return parseValue(str);
                }
                float[] parseValue = parseValue(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(parseValue, 0, copyOf2, length2, 1);
                return copyOf2;
            case 4:
                List list3 = (List) obj;
                if (list3 != null) {
                    return CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(Float.parseFloat(str))), (Collection) list3);
                }
                return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(Float.parseFloat(str)));
            case 5:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return m1155parseValue(str);
                }
                int[] m1155parseValue = m1155parseValue(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(m1155parseValue, 0, copyOf3, length3, 1);
                return copyOf3;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return m1156parseValue(str);
                }
                long[] m1156parseValue = m1156parseValue(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(m1156parseValue, 0, copyOf4, length4, 1);
                return copyOf4;
            case 7:
                List list4 = (List) obj;
                IntNavType intNavType3 = NavType.LongType;
                if (list4 != null) {
                    return CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(intNavType3.mo1158parseValue(str)), (Collection) list4);
                }
                return CollectionsKt__CollectionsJVMKt.listOf(intNavType3.mo1158parseValue(str));
            case 8:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) ArraysKt___ArraysJvmKt.plus(strArr, new String[]{str}) : new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(str), (Collection) list5);
                }
                return CollectionsKt__CollectionsJVMKt.listOf(str);
        }
    }

    @Override // androidx.navigation.NavType
    public final void put(Bundle bundle, String str, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                List list = (List) obj;
                str.getClass();
                if (list != null) {
                    bundle.putIntArray(str, CollectionsKt.toIntArray(list));
                    break;
                }
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, zArr);
                    break;
                }
            case 2:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, CollectionsKt.toBooleanArray(list2));
                    break;
                }
            case 3:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, fArr);
                    break;
                }
            case 4:
                List list3 = (List) obj;
                str.getClass();
                if (list3 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, CollectionsKt.toFloatArray(list3));
                    break;
                }
            case 5:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
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
                    bundle.putLongArray(str, CollectionsKt.toLongArray(list4));
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

    @Override // androidx.navigation.NavType
    public final boolean valueEquals(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Long[] lArr;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                return ArraysKt__ArraysKt.contentDeepEquals(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
            case 1:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    r1 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    while (i < length2) {
                        r1[i] = Boolean.valueOf(zArr2[i]);
                        i++;
                    }
                }
                return ArraysKt__ArraysKt.contentDeepEquals(boolArr, r1);
            case 2:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return ArraysKt__ArraysKt.contentDeepEquals(list3 != null ? (Boolean[]) list3.toArray(new Boolean[0]) : null, list4 != null ? (Boolean[]) list4.toArray(new Boolean[0]) : null);
            case 3:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    r1 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    while (i < length4) {
                        r1[i] = Float.valueOf(fArr3[i]);
                        i++;
                    }
                }
                return ArraysKt__ArraysKt.contentDeepEquals(fArr, r1);
            case 4:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return ArraysKt__ArraysKt.contentDeepEquals(list5 != null ? (Float[]) list5.toArray(new Float[0]) : null, list6 != null ? (Float[]) list6.toArray(new Float[0]) : null);
            case 5:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                return ArraysKt__ArraysKt.contentDeepEquals(iArr != null ? ArraysKt___ArraysJvmKt.toTypedArray(iArr) : null, iArr2 != null ? ArraysKt___ArraysJvmKt.toTypedArray(iArr2) : null);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length5 = jArr.length;
                    for (int i4 = 0; i4 < length5; i4++) {
                        lArr[i4] = Long.valueOf(jArr[i4]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    r1 = new Long[jArr2.length];
                    int length6 = jArr2.length;
                    while (i < length6) {
                        r1[i] = Long.valueOf(jArr2[i]);
                        i++;
                    }
                }
                return ArraysKt__ArraysKt.contentDeepEquals(lArr, r1);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return ArraysKt__ArraysKt.contentDeepEquals(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return ArraysKt__ArraysKt.contentDeepEquals((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return ArraysKt__ArraysKt.contentDeepEquals(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }

    /* renamed from: parseValue, reason: collision with other method in class */
    public static int[] m1155parseValue(String str) {
        str.getClass();
        return new int[]{((Number) NavType.IntType.mo1158parseValue(str)).intValue()};
    }

    /* renamed from: parseValue, reason: collision with other method in class */
    public static long[] m1156parseValue(String str) {
        str.getClass();
        return new long[]{((Number) NavType.LongType.mo1158parseValue(str)).longValue()};
    }

    public static float[] parseValue(String str) {
        str.getClass();
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    /* renamed from: parseValue, reason: collision with other method in class */
    public static boolean[] m1157parseValue(String str) {
        str.getClass();
        return new boolean[]{((Boolean) NavType.BoolType.mo1158parseValue(str)).booleanValue()};
    }

    @Override // androidx.navigation.NavType
    /* renamed from: parseValue, reason: collision with other method in class */
    public final Object mo1158parseValue(String str) {
        switch (this.$r8$classId) {
            case 0:
                str.getClass();
                return CollectionsKt__CollectionsJVMKt.listOf(NavType.IntType.mo1158parseValue(str));
            case 1:
                return m1157parseValue(str);
            case 2:
                str.getClass();
                return CollectionsKt__CollectionsJVMKt.listOf(NavType.BoolType.mo1158parseValue(str));
            case 3:
                return parseValue(str);
            case 4:
                str.getClass();
                return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(Float.parseFloat(str)));
            case 5:
                return m1155parseValue(str);
            case 6:
                return m1156parseValue(str);
            case 7:
                str.getClass();
                return CollectionsKt__CollectionsJVMKt.listOf(NavType.LongType.mo1158parseValue(str));
            case 8:
                str.getClass();
                return new String[]{str};
            default:
                str.getClass();
                return CollectionsKt__CollectionsJVMKt.listOf(str);
        }
    }
}
