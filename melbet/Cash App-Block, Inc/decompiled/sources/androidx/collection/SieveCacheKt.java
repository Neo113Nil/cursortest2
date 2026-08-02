package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public abstract class SieveCacheKt {
    public static final Object DELETED = new Object();
    public static final long[] EmptyNodes = new long[0];
    public static final Object DELETED$1 = new Object();

    public static final void access$gc(SparseArrayCompat sparseArrayCompat) {
        int i = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED$1) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i2;
    }

    public static final Object commonGet(SparseArrayCompat sparseArrayCompat, int i) {
        Object obj;
        sparseArrayCompat.getClass();
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.size, i, sparseArrayCompat.keys);
        if (binarySearch < 0 || (obj = sparseArrayCompat.values[binarySearch]) == DELETED$1) {
            return null;
        }
        return obj;
    }

    public static Object[] resizeForToArray(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
