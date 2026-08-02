package com.google.common.collect;

import androidx.core.os.BundleKt;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzci;
import com.google.android.gms.internal.mlkit_vision_face.zzbd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzba;
import com.google.common.collect.Maps;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class CompactHashMap extends AbstractMap implements Serializable {
    public static final Object NOT_FOUND = new Object();
    public transient int[] entries;
    public transient KeySetView entrySetView;
    public transient KeySetView keySetView;
    public transient Object[] keys;
    public transient int metadata;
    public transient int size;
    public transient Object table;
    public transient Object[] values;
    public transient Maps.Values valuesView;

    /* renamed from: com.google.common.collect.CompactHashMap$1, reason: invalid class name */
    public final class AnonymousClass1 extends Itr {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ CompactHashMap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(CompactHashMap compactHashMap, int i) {
            super(compactHashMap);
            this.$r8$classId = i;
            this.this$0 = compactHashMap;
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public final Object getOutput(int i) {
            int i2 = this.$r8$classId;
            CompactHashMap compactHashMap = this.this$0;
            switch (i2) {
                case 0:
                    return compactHashMap.requireKeys()[i];
                case 1:
                    return compactHashMap.new MapEntry(i);
                default:
                    return compactHashMap.requireValues()[i];
            }
        }
    }

    public final class KeySetView extends AbstractSet {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ CompactHashMap this$0;

        public /* synthetic */ KeySetView(CompactHashMap compactHashMap, int i) {
            this.$r8$classId = i;
            this.this$0 = compactHashMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            int i = this.$r8$classId;
            CompactHashMap compactHashMap = this.this$0;
            switch (i) {
                case 0:
                    compactHashMap.clear();
                    break;
                default:
                    compactHashMap.clear();
                    break;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            int i = this.$r8$classId;
            CompactHashMap compactHashMap = this.this$0;
            switch (i) {
                case 0:
                    return compactHashMap.containsKey(obj);
                default:
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    if (delegateOrNull != null) {
                        return delegateOrNull.entrySet().contains(obj);
                    }
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        int indexOf = compactHashMap.indexOf(entry.getKey());
                        if (indexOf != -1 && Objects.equals(compactHashMap.requireValues()[indexOf], entry.getValue())) {
                            return true;
                        }
                    }
                    return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            int i = this.$r8$classId;
            CompactHashMap compactHashMap = this.this$0;
            switch (i) {
                case 0:
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    return delegateOrNull != null ? delegateOrNull.keySet().iterator() : new AnonymousClass1(compactHashMap, 0);
                default:
                    Map delegateOrNull2 = compactHashMap.delegateOrNull();
                    return delegateOrNull2 != null ? delegateOrNull2.entrySet().iterator() : new AnonymousClass1(compactHashMap, 1);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i = this.$r8$classId;
            CompactHashMap compactHashMap = this.this$0;
            switch (i) {
                case 0:
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    if (delegateOrNull == null) {
                        if (compactHashMap.removeHelper(obj) != CompactHashMap.NOT_FOUND) {
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                default:
                    Map delegateOrNull2 = compactHashMap.delegateOrNull();
                    if (delegateOrNull2 == null) {
                        if (obj instanceof Map.Entry) {
                            Map.Entry entry = (Map.Entry) obj;
                            if (!compactHashMap.needsAllocArrays()) {
                                int hashTableMask = compactHashMap.hashTableMask();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                Object obj2 = compactHashMap.table;
                                Objects.requireNonNull(obj2);
                                int remove = Maps.remove(key, value, hashTableMask, obj2, compactHashMap.requireEntries(), compactHashMap.requireKeys(), compactHashMap.requireValues());
                                if (remove != -1) {
                                    compactHashMap.moveLastEntry(remove, hashTableMask);
                                    compactHashMap.size--;
                                    compactHashMap.metadata += 32;
                                    break;
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            int i = this.$r8$classId;
            CompactHashMap compactHashMap = this.this$0;
            switch (i) {
            }
            return compactHashMap.size();
        }
    }

    public final class MapEntry implements Map.Entry {
        public final Object key;
        public int lastKnownIndex;

        public MapEntry(int i) {
            Object obj = CompactHashMap.NOT_FOUND;
            this.key = CompactHashMap.this.requireKeys()[i];
            this.lastKnownIndex = i;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map delegateOrNull = compactHashMap.delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.get(this.key);
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i == -1) {
                return null;
            }
            return compactHashMap.requireValues()[i];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object key = getKey();
            Object value = getValue();
            return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map delegateOrNull = compactHashMap.delegateOrNull();
            Object obj2 = this.key;
            if (delegateOrNull != null) {
                return delegateOrNull.put(obj2, obj);
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i == -1) {
                compactHashMap.put(obj2, obj);
                return null;
            }
            Object obj3 = compactHashMap.requireValues()[i];
            compactHashMap.requireValues()[this.lastKnownIndex] = obj;
            return obj3;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public final void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            Object obj = this.key;
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (i != -1 && i < compactHashMap.size()) {
                if (Objects.equals(obj, compactHashMap.requireKeys()[this.lastKnownIndex])) {
                    return;
                }
            }
            Object obj2 = CompactHashMap.NOT_FOUND;
            this.lastKnownIndex = compactHashMap.indexOf(obj);
        }
    }

    public static CompactHashMap createWithExpectedSize() {
        CompactHashMap compactHashMap = new CompactHashMap();
        compactHashMap.metadata = Math.min(Math.max(8, 1), 1073741823);
        return compactHashMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.metadata += 32;
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            this.metadata = Math.min(Math.max(size(), 3), 1073741823);
            delegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        Object obj = this.table;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.containsKey(obj) : indexOf(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (Objects.equals(obj, requireValues()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Map delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        KeySetView keySetView = this.entrySetView;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, 1);
        this.entrySetView = keySetView2;
        return keySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(obj);
        }
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return requireValues()[indexOf];
    }

    public final int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    public final int indexOf(Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int smearedHash = BundleKt.smearedHash(obj);
        int hashTableMask = hashTableMask();
        Object obj2 = this.table;
        Objects.requireNonNull(obj2);
        int tableGet = Maps.tableGet(smearedHash & hashTableMask, obj2);
        if (tableGet == 0) {
            return -1;
        }
        int i = ~hashTableMask;
        int i2 = smearedHash & i;
        do {
            int i3 = tableGet - 1;
            int i4 = requireEntries()[i3];
            if ((i4 & i) == i2 && Objects.equals(obj, requireKeys()[i3])) {
                return i3;
            }
            tableGet = i4 & hashTableMask;
        } while (tableGet != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySetView keySetView = this.keySetView;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, 0);
        this.keySetView = keySetView2;
        return keySetView2;
    }

    public final void moveLastEntry(int i, int i2) {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            requireKeys[i] = null;
            requireValues[i] = null;
            requireEntries[i] = 0;
            return;
        }
        Object obj2 = requireKeys[i3];
        requireKeys[i] = obj2;
        requireValues[i] = requireValues[i3];
        requireKeys[i3] = null;
        requireValues[i3] = null;
        requireEntries[i] = requireEntries[i3];
        requireEntries[i3] = 0;
        int smearedHash = BundleKt.smearedHash(obj2) & i2;
        int tableGet = Maps.tableGet(smearedHash, obj);
        if (tableGet == size) {
            Maps.tableSet(smearedHash, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = tableGet - 1;
            int i5 = requireEntries[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                requireEntries[i4] = Maps.maskCombine(i5, i + 1, i2);
                return;
            }
            tableGet = i6;
        }
    }

    public final boolean needsAllocArrays() {
        return this.table == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fe -> B:43:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = 32;
        int i4 = 1;
        if (needsAllocArrays()) {
            Trace.checkState("Arrays already allocated", needsAllocArrays());
            int i5 = this.metadata;
            int max = Math.max(i5 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.table = Maps.createTable(max2);
            this.metadata = Maps.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.entries = new int[i5];
            this.keys = new Object[i5];
            this.values = new Object[i5];
        }
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(obj, obj2);
        }
        int[] requireEntries = requireEntries();
        Object[] requireKeys = requireKeys();
        Object[] requireValues = requireValues();
        int i6 = this.size;
        int i7 = i6 + 1;
        int smearedHash = BundleKt.smearedHash(obj);
        int hashTableMask = hashTableMask();
        int i8 = smearedHash & hashTableMask;
        Object obj3 = this.table;
        Objects.requireNonNull(obj3);
        int tableGet = Maps.tableGet(i8, obj3);
        if (tableGet == 0) {
            if (i7 > hashTableMask) {
                hashTableMask = resizeTable(hashTableMask, (hashTableMask + 1) * (hashTableMask < 32 ? 4 : 2), smearedHash, i6);
            } else {
                Object obj4 = this.table;
                Objects.requireNonNull(obj4);
                Maps.tableSet(i8, i7, obj4);
            }
            i = 1;
        } else {
            int i9 = ~hashTableMask;
            int i10 = smearedHash & i9;
            int i11 = 0;
            while (true) {
                int i12 = tableGet - i4;
                i = i4;
                int i13 = requireEntries[i12];
                int i14 = i3;
                if ((i13 & i9) == i10 && Objects.equals(obj, requireKeys[i12])) {
                    Object obj5 = requireValues[i12];
                    requireValues[i12] = obj2;
                    return obj5;
                }
                int i15 = i13 & hashTableMask;
                int i16 = i11 + 1;
                if (i15 != 0) {
                    i11 = i16;
                    tableGet = i15;
                    i4 = i;
                    i3 = i14;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(hashTableMask() + 1, 1.0f);
                        if (!isEmpty()) {
                            i2 = 0;
                            while (i2 >= 0) {
                                linkedHashMap.put(requireKeys()[i2], requireValues()[i2]);
                                int i17 = i2 + 1;
                                if (i17 < this.size) {
                                    i2 = i17;
                                }
                            }
                            this.table = linkedHashMap;
                            this.entries = null;
                            this.keys = null;
                            this.values = null;
                            this.metadata += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i2 = -1;
                        while (i2 >= 0) {
                        }
                        this.table = linkedHashMap;
                        this.entries = null;
                        this.keys = null;
                        this.values = null;
                        this.metadata += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i7 > hashTableMask) {
                        hashTableMask = resizeTable(hashTableMask, (hashTableMask + 1) * (hashTableMask < i14 ? 4 : 2), smearedHash, i6);
                    } else {
                        requireEntries[i12] = Maps.maskCombine(i13, i7, hashTableMask);
                    }
                }
            }
        }
        int length = requireEntries().length;
        if (i7 > length) {
            int i18 = i;
            int min = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (min != length) {
                this.entries = Arrays.copyOf(requireEntries(), min);
                this.keys = Arrays.copyOf(requireKeys(), min);
                this.values = Arrays.copyOf(requireValues(), min);
            }
        }
        requireEntries()[i6] = Maps.maskCombine(smearedHash, 0, hashTableMask);
        requireKeys()[i6] = obj;
        requireValues()[i6] = obj2;
        this.size = i7;
        this.metadata += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        Object removeHelper = removeHelper(obj);
        if (removeHelper == NOT_FOUND) {
            return null;
        }
        return removeHelper;
    }

    public final Object removeHelper(Object obj) {
        if (!needsAllocArrays()) {
            int hashTableMask = hashTableMask();
            Object obj2 = this.table;
            Objects.requireNonNull(obj2);
            int remove = Maps.remove(obj, null, hashTableMask, obj2, requireEntries(), requireKeys(), null);
            if (remove != -1) {
                Object obj3 = requireValues()[remove];
                moveLastEntry(remove, hashTableMask);
                this.size--;
                this.metadata += 32;
                return obj3;
            }
        }
        return NOT_FOUND;
    }

    public final int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] requireKeys() {
        Object[] objArr = this.keys;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] requireValues() {
        Object[] objArr = this.values;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int resizeTable(int i, int i2, int i3, int i4) {
        Object createTable = Maps.createTable(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            Maps.tableSet(i3 & i5, i4 + 1, createTable);
        }
        Object obj = this.table;
        Objects.requireNonNull(obj);
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int tableGet = Maps.tableGet(i6, obj);
            while (tableGet != 0) {
                int i7 = tableGet - 1;
                int i8 = requireEntries[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int tableGet2 = Maps.tableGet(i10, createTable);
                Maps.tableSet(i10, tableGet, createTable);
                requireEntries[i7] = Maps.maskCombine(i9, tableGet2, i5);
                tableGet = i8 & i;
            }
        }
        this.table = createTable;
        this.metadata = Maps.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Maps.Values values = this.valuesView;
        if (values != null) {
            return values;
        }
        Maps.Values values2 = new Maps.Values((Object) this, 9);
        this.valuesView = values2;
        return values2;
    }

    public abstract class Itr implements Iterator {
        public final /* synthetic */ int $r8$classId = 1;
        public int currentIndex;
        public int expectedMetadata;
        public int indexToRemove;
        public final /* synthetic */ AbstractMap this$0;

        public Itr(zzci zzciVar) {
            this.this$0 = zzciVar;
            this.expectedMetadata = zzciVar.zzf;
            this.currentIndex = zzciVar.isEmpty() ? -1 : 0;
            this.indexToRemove = -1;
        }

        public abstract Object getOutput(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            switch (this.$r8$classId) {
                case 0:
                    if (this.currentIndex >= 0) {
                    }
                    break;
                case 1:
                    if (this.currentIndex >= 0) {
                    }
                    break;
                case 2:
                    if (this.currentIndex >= 0) {
                    }
                    break;
                default:
                    if (this.currentIndex >= 0) {
                    }
                    break;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.$r8$classId;
            AbstractMap abstractMap = this.this$0;
            Object obj = null;
            switch (i) {
                case 0:
                    CompactHashMap compactHashMap = (CompactHashMap) abstractMap;
                    if (compactHashMap.metadata != this.expectedMetadata) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else if (!hasNext()) {
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        int i2 = this.currentIndex;
                        this.indexToRemove = i2;
                        obj = getOutput(i2);
                        int i3 = this.currentIndex + 1;
                        this.currentIndex = i3 < compactHashMap.size ? i3 : -1;
                        break;
                    }
                case 1:
                    zzci zzciVar = (zzci) abstractMap;
                    if (zzciVar.zzf != this.expectedMetadata) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else if (!hasNext()) {
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        int i4 = this.currentIndex;
                        this.indexToRemove = i4;
                        obj = zza(i4);
                        int i5 = this.currentIndex + 1;
                        this.currentIndex = i5 < zzciVar.zzg ? i5 : -1;
                        break;
                    }
                case 2:
                    zzbd zzbdVar = (zzbd) abstractMap;
                    if (zzbdVar.zzf != this.expectedMetadata) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else if (!hasNext()) {
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        int i6 = this.currentIndex;
                        this.indexToRemove = i6;
                        obj = zza(i6);
                        int i7 = this.currentIndex + 1;
                        this.currentIndex = i7 < zzbdVar.zzg ? i7 : -1;
                        break;
                    }
                default:
                    zzba zzbaVar = (zzba) abstractMap;
                    if (zzbaVar.zzf != this.expectedMetadata) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else if (!hasNext()) {
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        int i8 = this.currentIndex;
                        this.indexToRemove = i8;
                        obj = zza(i8);
                        int i9 = this.currentIndex + 1;
                        this.currentIndex = i9 < zzbaVar.zzg ? i9 : -1;
                        break;
                    }
            }
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.$r8$classId;
            AbstractMap abstractMap = this.this$0;
            switch (i) {
                case 0:
                    CompactHashMap compactHashMap = (CompactHashMap) abstractMap;
                    if (compactHashMap.metadata != this.expectedMetadata) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else {
                        Trace.checkState("no calls to next() since the last call to remove()", this.indexToRemove >= 0);
                        this.expectedMetadata += 32;
                        compactHashMap.remove(compactHashMap.requireKeys()[this.indexToRemove]);
                        this.currentIndex--;
                        this.indexToRemove = -1;
                        break;
                    }
                case 1:
                    zzci zzciVar = (zzci) abstractMap;
                    if (zzciVar.zzf != this.expectedMetadata) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else {
                        TransactorKt.zzf("no calls to next() since the last call to remove()", this.indexToRemove >= 0);
                        this.expectedMetadata += 32;
                        zzciVar.remove(zzciVar.zzB()[this.indexToRemove]);
                        this.currentIndex--;
                        this.indexToRemove = -1;
                        break;
                    }
                case 2:
                    zzbd zzbdVar = (zzbd) abstractMap;
                    int i2 = zzbdVar.zzf;
                    int i3 = this.expectedMetadata;
                    if (i2 != i3) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else {
                        int i4 = this.indexToRemove;
                        if (!(i4 >= 0)) {
                            a$$ExternalSyntheticBUOutline0.m$1("no calls to next() since the last call to remove()");
                            break;
                        } else {
                            this.expectedMetadata = i3 + 32;
                            Object[] objArr = zzbdVar.zzb;
                            objArr.getClass();
                            zzbdVar.remove(objArr[i4]);
                            this.currentIndex--;
                            this.indexToRemove = -1;
                            break;
                        }
                    }
                default:
                    zzba zzbaVar = (zzba) abstractMap;
                    int i5 = zzbaVar.zzf;
                    int i6 = this.expectedMetadata;
                    if (i5 != i6) {
                        Drop$$ExternalSyntheticBUOutline0.m$1();
                        break;
                    } else {
                        int i7 = this.indexToRemove;
                        if (!(i7 >= 0)) {
                            a$$ExternalSyntheticBUOutline0.m$1("no calls to next() since the last call to remove()");
                            break;
                        } else {
                            this.expectedMetadata = i6 + 32;
                            zzbaVar.remove(zzbaVar.zzB()[i7]);
                            this.currentIndex--;
                            this.indexToRemove = -1;
                            break;
                        }
                    }
            }
        }

        public abstract Object zza(int i);

        public Itr(zzbd zzbdVar) {
            this.this$0 = zzbdVar;
            this.expectedMetadata = zzbdVar.zzf;
            this.currentIndex = zzbdVar.isEmpty() ? -1 : 0;
            this.indexToRemove = -1;
        }

        public Itr(zzba zzbaVar) {
            this.this$0 = zzbaVar;
            this.expectedMetadata = zzbaVar.zzf;
            this.currentIndex = zzbaVar.isEmpty() ? -1 : 0;
            this.indexToRemove = -1;
        }

        public Itr(CompactHashMap compactHashMap) {
            this.this$0 = compactHashMap;
            this.expectedMetadata = compactHashMap.metadata;
            this.currentIndex = compactHashMap.isEmpty() ? -1 : 0;
            this.indexToRemove = -1;
        }
    }
}
