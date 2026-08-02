package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectListKt;

/* loaded from: classes.dex */
public final class MultiValueMap {
    public final MutableScatterMap map;

    public /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final Object m578removeLastimpl(MutableScatterMap mutableScatterMap) {
        Object obj = mutableScatterMap.get(null);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof MutableObjectList)) {
            mutableScatterMap.remove(null);
            return obj;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) obj;
        Object removeLast = ExtensionsKt.removeLast(mutableObjectList);
        removeLast.getClass();
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(null);
        }
        if (mutableObjectList._size == 1) {
            mutableScatterMap.set(null, mutableObjectList.first());
        }
        return removeLast;
    }

    /* renamed from: values-impl, reason: not valid java name */
    public static final MutableObjectList m579valuesimpl(MutableScatterMap mutableScatterMap) {
        if (mutableScatterMap.isEmpty()) {
            MutableObjectList mutableObjectList = ObjectListKt.EmptyObjectList;
            mutableObjectList.getClass();
            return mutableObjectList;
        }
        MutableObjectList mutableObjectList2 = new MutableObjectList();
        Object[] objArr = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof MutableObjectList) {
                                mutableObjectList2.addAll((MutableObjectList) obj);
                            } else {
                                obj.getClass();
                                mutableObjectList2.add(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return mutableObjectList2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MultiValueMap) {
            return this.map.equals(((MultiValueMap) obj).map);
        }
        return false;
    }

    public final int hashCode() {
        return this.map.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.map + ')';
    }
}
