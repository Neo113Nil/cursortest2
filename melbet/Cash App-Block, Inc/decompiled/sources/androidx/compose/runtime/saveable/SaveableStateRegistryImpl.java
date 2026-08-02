package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    public final Function1 canBeSaved;
    public final MutableScatterMap restored;
    public MutableScatterMap valueProviders;

    public SaveableStateRegistryImpl(Map map, Function1 function1) {
        MutableScatterMap mutableScatterMap;
        this.canBeSaved = function1;
        if (map == null || map.isEmpty()) {
            mutableScatterMap = null;
        } else {
            mutableScatterMap = new MutableScatterMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                mutableScatterMap.set(entry.getKey(), entry.getValue());
            }
        }
        this.restored = mutableScatterMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object obj) {
        return ((Boolean) this.canBeSaved.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String str) {
        MutableScatterMap mutableScatterMap = this.restored;
        List list = mutableScatterMap != null ? (List) mutableScatterMap.remove(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && mutableScatterMap != null) {
            List subList = list.subList(1, list.size());
            int findInsertIndex = mutableScatterMap.findInsertIndex(str);
            if (findInsertIndex < 0) {
                findInsertIndex = ~findInsertIndex;
            }
            Object[] objArr = mutableScatterMap.values;
            Object obj = objArr[findInsertIndex];
            mutableScatterMap.keys[findInsertIndex] = str;
            objArr[findInsertIndex] = subList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map performSave() {
        char c;
        long j;
        long j2;
        long j3;
        MutableScatterMap mutableScatterMap;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        MutableScatterMap mutableScatterMap2 = this.restored;
        if (mutableScatterMap2 == null && this.valueProviders == null) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        int i3 = 0;
        int i4 = mutableScatterMap2 != null ? mutableScatterMap2._size : 0;
        MutableScatterMap mutableScatterMap3 = this.valueProviders;
        HashMap hashMap = new HashMap(i4 + (mutableScatterMap3 != null ? mutableScatterMap3._size : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (mutableScatterMap2 != null) {
            Object[] objArr = mutableScatterMap2.keys;
            Object[] objArr2 = mutableScatterMap2.values;
            long[] jArr3 = mutableScatterMap2.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                mutableScatterMap = this.valueProviders;
                if (mutableScatterMap != null) {
                    Object[] objArr3 = mutableScatterMap.keys;
                    Object[] objArr4 = mutableScatterMap.values;
                    long[] jArr4 = mutableScatterMap.metadata;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object invoke = ((Function0) list.get(i3)).invoke();
                                            if (invoke != null) {
                                                if (!canBeSaved(invoke)) {
                                                    Path$$ExternalSyntheticBUOutline0.m((Object) SaverKt.generateCannotBeSavedErrorMessage(invoke));
                                                    return null;
                                                }
                                                hashMap.put(str, CollectionsKt__CollectionsKt.arrayListOf(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((Function0) list.get(i3)).invoke();
                                                if (invoke2 != null && !canBeSaved(invoke2)) {
                                                    Path$$ExternalSyntheticBUOutline0.m((Object) SaverKt.generateCannotBeSavedErrorMessage(invoke2));
                                                    return null;
                                                }
                                                arrayList.add(invoke2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        mutableScatterMap = this.valueProviders;
        if (mutableScatterMap != null) {
        }
        return hashMap;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final GrpcMethod registerProvider(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.isWhitespace(str.charAt(i))) {
                MutableScatterMap mutableScatterMap = this.valueProviders;
                if (mutableScatterMap == null) {
                    long[] jArr = ScatterMapKt.EmptyGroup;
                    mutableScatterMap = new MutableScatterMap();
                    this.valueProviders = mutableScatterMap;
                }
                Object obj = mutableScatterMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    mutableScatterMap.set(str, obj);
                }
                ((List) obj).add(function0);
                GrpcMethod grpcMethod = new GrpcMethod();
                grpcMethod.requestAdapter = mutableScatterMap;
                grpcMethod.path = str;
                grpcMethod.responseAdapter = function0;
                return grpcMethod;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("Registered key is empty or blank");
        return null;
    }
}
