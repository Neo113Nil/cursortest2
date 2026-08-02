package com.google.common.collect;

import androidx.core.os.BundleKt;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzci;
import com.google.android.gms.internal.mlkit_vision_face.zzah;
import com.google.android.gms.internal.mlkit_vision_face.zzao;
import com.google.android.gms.internal.mlkit_vision_face.zzas;
import com.google.android.gms.internal.mlkit_vision_face.zzav;
import com.google.android.gms.internal.mlkit_vision_face.zzbd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzar;
import com.google.android.gms.internal.mlkit_vision_text_common.zzba;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates$AndPredicate;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableList;
import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.withpersona.sdk2.camera.BitmapUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes4.dex */
public abstract class Maps {

    /* renamed from: com.google.common.collect.Maps$2, reason: invalid class name */
    public final class AnonymousClass2 extends TransformedIterator {
        @Override // com.google.common.collect.TransformedIterator
        public final Object transform(Object obj) {
            return ((Map.Entry) obj).getValue();
        }
    }

    public static int capacity(int i) {
        if (i < 3) {
            DimensionKt.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static Object[] copy(int i, int i2, Object[] objArr, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Object createTable(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static boolean equalsImpl(Object obj, List list) {
        list.getClass();
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static Sets$FilteredSet filter(Set set, Predicate predicate) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof Sets$FilteredSet)) {
                return new Sets$FilteredSortedSet(set2, predicate);
            }
            Sets$FilteredSet sets$FilteredSet = (Sets$FilteredSet) set2;
            Predicate predicate2 = sets$FilteredSet.predicate;
            predicate2.getClass();
            return new Sets$FilteredSortedSet((SortedSet) sets$FilteredSet.unfiltered, new Predicates$AndPredicate(Arrays.asList(predicate2, predicate)));
        }
        if (!(set instanceof Sets$FilteredSet)) {
            set.getClass();
            return new Sets$FilteredSet(set, predicate);
        }
        Sets$FilteredSet sets$FilteredSet2 = (Sets$FilteredSet) set;
        Predicate predicate3 = sets$FilteredSet2.predicate;
        predicate3.getClass();
        return new Sets$FilteredSet(sets$FilteredSet2.unfiltered, new Predicates$AndPredicate(Arrays.asList(predicate3, predicate)));
    }

    public static Object getLast(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object getOnlyElement(RegularImmutableList regularImmutableList) {
        ImmutableList.Itr listIterator = regularImmutableList.listIterator(0);
        Object next = listIterator.next();
        if (!listIterator.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && listIterator.hasNext(); i++) {
            sb.append(", ");
            sb.append(listIterator.next());
        }
        if (listIterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean hasSameComparator(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = NaturalOrdering.INSTANCE;
            }
        } else {
            if (!(collection instanceof ImmutableSortedSet)) {
                return false;
            }
            obj = ((ImmutableSortedSet) collection).comparator;
        }
        return comparator.equals(obj);
    }

    public static int hashCodeImpl(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static int indexOfImpl(ImmutableList immutableList, Object obj) {
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(immutableList.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static Sets$2 intersection(Set set, ImmutableSet immutableSet) {
        Trace.checkNotNull(set, "set1");
        Trace.checkNotNull(immutableSet, "set2");
        return new Sets$2(set, immutableSet);
    }

    public static int lastIndexOfImpl(ImmutableList immutableList, Object obj) {
        for (int size = immutableList.size() - 1; size >= 0; size--) {
            if (obj.equals(immutableList.get(size))) {
                return size;
            }
        }
        return -1;
    }

    public static int maskCombine(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static Object[] newArray(int i, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static ArrayList newArrayList(Object... objArr) {
        int length = objArr.length;
        DimensionKt.checkNonnegative(length, "arraySize");
        ArrayList arrayList = new ArrayList(CompositeException.WrappedPrintStream.saturatedCast(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        tableSet(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = maskCombine(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int remove(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int smearedHash = BundleKt.smearedHash(obj);
        int i2 = smearedHash & i;
        int tableGet = tableGet(i2, obj3);
        if (tableGet != 0) {
            int i3 = ~i;
            int i4 = smearedHash & i3;
            int i5 = -1;
            while (true) {
                int i6 = tableGet - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !Objects.equals(obj, objArr[i6]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    tableGet = i8;
                }
            }
        }
        return -1;
    }

    public static List reverse(List list) {
        return list instanceof ImmutableList ? ((ImmutableList) list).reverse() : list instanceof Lists$ReverseList ? ((Lists$ReverseList) list).forwardList : list instanceof RandomAccess ? new Lists$RandomAccessReverseList(list) : new Lists$ReverseList(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.Iterators$SingletonIterator] */
    public static Iterators$SingletonIterator singletonIterator(final Object obj) {
        return new UnmodifiableIterator(obj) { // from class: com.google.common.collect.Iterators$SingletonIterator
            public boolean done;
            public final Object value;

            {
                super(0);
                this.value = obj;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return !this.done;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.done) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                this.done = true;
                return this.value;
            }
        };
    }

    public static void slowRemoveIfForRemainingElements(List list, Predicate predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static int tableGet(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & HPKE.aead_EXPORT_ONLY : ((int[]) obj)[i];
    }

    public static void tableSet(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static Object[] toArray(Iterable iterable) {
        return (iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable.iterator())).toArray();
    }

    public static String toStringImpl(RegularImmutableMap regularImmutableMap) {
        int i = regularImmutableMap.size;
        DimensionKt.checkNonnegative(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : regularImmutableMap.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static AbstractList transform(List list, Function function) {
        return list instanceof RandomAccess ? new Lists$TransformingRandomAccessList(list, function) : new Lists$TransformingSequentialList(list, function);
    }

    public class Values extends AbstractCollection {
        public final /* synthetic */ int $r8$classId;
        public final Object map;

        public /* synthetic */ Values(Object obj, int i) {
            this.$r8$classId = i;
            this.map = obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int i = this.$r8$classId;
            Object obj = this.map;
            switch (i) {
                case 0:
                    ((AbstractMap) obj).clear();
                    break;
                case 1:
                    ((zzbw) ((zzbv) obj)).zzs();
                    break;
                case 2:
                    ((zzci) obj).clear();
                    break;
                case 3:
                    ((zzah) obj).clear();
                    break;
                case 4:
                    ((zzbd) obj).clear();
                    break;
                case 5:
                    ((zzah) obj).clear();
                    break;
                case 6:
                    ((zzba) obj).clear();
                    break;
                case 7:
                    ((zzah) obj).clear();
                    break;
                case 8:
                    ((Multimaps$CustomListMultimap) obj).clear();
                    break;
                default:
                    ((CompactHashMap) obj).clear();
                    break;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.map;
            switch (i) {
                case 0:
                    return ((AbstractMap) obj2).containsValue(obj);
                case 1:
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    zzao zza = ((zzah) ((zzbv) obj2).zzv()).zza(key);
                    return zza != null && zza.contains(value);
                case 2:
                case 4:
                case 6:
                default:
                    return super.contains(obj);
                case 3:
                    return ((zzah) obj2).containsValue(obj);
                case 5:
                    return ((zzah) obj2).containsValue(obj);
                case 7:
                    return ((zzah) obj2).containsValue(obj);
                case 8:
                    Iterator it = ((Multimaps$CustomListMultimap) obj2).asMap().values().iterator();
                    while (it.hasNext()) {
                        if (((Collection) it.next()).contains(obj)) {
                            return true;
                        }
                    }
                    return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            switch (this.$r8$classId) {
                case 0:
                    return ((AbstractMap) this.map).isEmpty();
                case 3:
                    return ((zzah) this.map).isEmpty();
                case 5:
                    return ((zzah) this.map).isEmpty();
                case 7:
                    return ((zzah) this.map).isEmpty();
                default:
                    return super.isEmpty();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            int i = this.$r8$classId;
            int i2 = 2;
            Object obj = this.map;
            switch (i) {
                case 0:
                    return new AnonymousClass2(((AbstractMap) obj).entrySet().iterator(), 0);
                case 1:
                    zzbw zzbwVar = (zzbw) ((zzbv) obj);
                    zzbwVar.getClass();
                    return new AbstractMapBasedMultimap$1(zzbwVar);
                case 2:
                    zzci zzciVar = (zzci) obj;
                    Map zzl = zzciVar.zzl();
                    return zzl != null ? zzl.values().iterator() : new zzbz(zzciVar, i2);
                case 3:
                    return new zzbe(((zzah) obj).entrySet().iterator(), 1);
                case 4:
                    zzbd zzbdVar = (zzbd) obj;
                    Map zzl2 = zzbdVar.zzl();
                    return zzl2 != null ? zzl2.values().iterator() : new zzav(zzbdVar, i2);
                case 5:
                    return new zzbe(((zzah) obj).entrySet().iterator(), 2);
                case 6:
                    zzba zzbaVar = (zzba) obj;
                    Map zzl3 = zzbaVar.zzl();
                    return zzl3 != null ? zzl3.values().iterator() : new zzar(zzbaVar, i2);
                case 7:
                    return new com.google.android.gms.internal.mlkit_vision_text_common.zzbw(((zzah) obj).entrySet().iterator(), 1);
                case 8:
                    return new AbstractMapBasedMultimap$1((Multimaps$CustomListMultimap) obj);
                default:
                    CompactHashMap compactHashMap = (CompactHashMap) obj;
                    Map delegateOrNull = compactHashMap.delegateOrNull();
                    return delegateOrNull != null ? delegateOrNull.values().iterator() : new CompactHashMap.AnonymousClass1(compactHashMap, i2);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.map;
            switch (i) {
                case 0:
                    AbstractMap abstractMap = (AbstractMap) obj2;
                    try {
                        return super.remove(obj);
                    } catch (UnsupportedOperationException unused) {
                        for (Map.Entry entry : abstractMap.entrySet()) {
                            if (Objects.equals(obj, entry.getValue())) {
                                abstractMap.remove(entry.getKey());
                                return true;
                            }
                        }
                        return false;
                    }
                case 1:
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry2 = (Map.Entry) obj;
                    Object key = entry2.getKey();
                    Object value = entry2.getValue();
                    zzao zza = ((zzah) ((zzbv) obj2).zzv()).zza(key);
                    return zza != null && zza.remove(value);
                case 2:
                case 4:
                case 6:
                default:
                    return super.remove(obj);
                case 3:
                    zzah zzahVar = (zzah) obj2;
                    try {
                        return super.remove(obj);
                    } catch (UnsupportedOperationException unused2) {
                        for (Map.Entry entry3 : zzahVar.entrySet()) {
                            if (Logger.zza(obj, entry3.getValue())) {
                                zzahVar.remove(entry3.getKey());
                                return true;
                            }
                        }
                        return false;
                    }
                case 5:
                    zzah zzahVar2 = (zzah) obj2;
                    try {
                        return super.remove(obj);
                    } catch (UnsupportedOperationException unused3) {
                        for (Map.Entry entry4 : zzahVar2.entrySet()) {
                            if (ScanningStarPulseKt.zza(obj, entry4.getValue())) {
                                zzahVar2.remove(entry4.getKey());
                                return true;
                            }
                        }
                        return false;
                    }
                case 7:
                    zzah zzahVar3 = (zzah) obj2;
                    try {
                        return super.remove(obj);
                    } catch (UnsupportedOperationException unused4) {
                        for (Map.Entry entry5 : zzahVar3.entrySet()) {
                            if (BitmapUtils.zza(obj, entry5.getValue())) {
                                zzahVar3.remove(entry5.getKey());
                                return true;
                            }
                        }
                        return false;
                    }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i = this.$r8$classId;
            Object obj = this.map;
            switch (i) {
                case 0:
                    AbstractMap abstractMap = (AbstractMap) obj;
                    try {
                        collection.getClass();
                        return super.removeAll(collection);
                    } catch (UnsupportedOperationException unused) {
                        HashSet hashSet = new HashSet();
                        for (Map.Entry entry : abstractMap.entrySet()) {
                            if (collection.contains(entry.getValue())) {
                                hashSet.add(entry.getKey());
                            }
                        }
                        return abstractMap.keySet().removeAll(hashSet);
                    }
                case 3:
                    zzah zzahVar = (zzah) obj;
                    try {
                        if (collection != null) {
                            return super.removeAll(collection);
                        }
                        throw null;
                    } catch (UnsupportedOperationException unused2) {
                        HashSet hashSet2 = new HashSet();
                        for (Map.Entry entry2 : zzahVar.entrySet()) {
                            if (collection.contains(entry2.getValue())) {
                                hashSet2.add(entry2.getKey());
                            }
                        }
                        return ((zzbw) zzahVar.zzb).zzw().removeAll(hashSet2);
                    }
                case 5:
                    zzah zzahVar2 = (zzah) obj;
                    try {
                        if (collection != null) {
                            return super.removeAll(collection);
                        }
                        throw null;
                    } catch (UnsupportedOperationException unused3) {
                        HashSet hashSet3 = new HashSet();
                        for (Map.Entry entry3 : zzahVar2.entrySet()) {
                            if (collection.contains(entry3.getValue())) {
                                hashSet3.add(entry3.getKey());
                            }
                        }
                        return ((zzas) zzahVar2.zzb).zzq().removeAll(hashSet3);
                    }
                case 7:
                    zzah zzahVar3 = (zzah) obj;
                    try {
                        if (collection != null) {
                            return super.removeAll(collection);
                        }
                        throw null;
                    } catch (UnsupportedOperationException unused4) {
                        HashSet hashSet4 = new HashSet();
                        for (Map.Entry entry4 : zzahVar3.entrySet()) {
                            if (collection.contains(entry4.getValue())) {
                                hashSet4.add(entry4.getKey());
                            }
                        }
                        return ((com.google.android.gms.internal.mlkit_vision_text_common.zzao) zzahVar3.zzb).zzo().removeAll(hashSet4);
                    }
                default:
                    return super.removeAll(collection);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i = this.$r8$classId;
            Object obj = this.map;
            switch (i) {
                case 0:
                    AbstractMap abstractMap = (AbstractMap) obj;
                    try {
                        collection.getClass();
                        return super.retainAll(collection);
                    } catch (UnsupportedOperationException unused) {
                        HashSet hashSet = new HashSet();
                        for (Map.Entry entry : abstractMap.entrySet()) {
                            if (collection.contains(entry.getValue())) {
                                hashSet.add(entry.getKey());
                            }
                        }
                        return abstractMap.keySet().retainAll(hashSet);
                    }
                case 3:
                    zzah zzahVar = (zzah) obj;
                    try {
                        if (collection != null) {
                            return super.retainAll(collection);
                        }
                        throw null;
                    } catch (UnsupportedOperationException unused2) {
                        HashSet hashSet2 = new HashSet();
                        for (Map.Entry entry2 : zzahVar.entrySet()) {
                            if (collection.contains(entry2.getValue())) {
                                hashSet2.add(entry2.getKey());
                            }
                        }
                        return ((zzbw) zzahVar.zzb).zzw().retainAll(hashSet2);
                    }
                case 5:
                    zzah zzahVar2 = (zzah) obj;
                    try {
                        if (collection != null) {
                            return super.retainAll(collection);
                        }
                        throw null;
                    } catch (UnsupportedOperationException unused3) {
                        HashSet hashSet3 = new HashSet();
                        for (Map.Entry entry3 : zzahVar2.entrySet()) {
                            if (collection.contains(entry3.getValue())) {
                                hashSet3.add(entry3.getKey());
                            }
                        }
                        return ((zzas) zzahVar2.zzb).zzq().retainAll(hashSet3);
                    }
                case 7:
                    zzah zzahVar3 = (zzah) obj;
                    try {
                        if (collection != null) {
                            return super.retainAll(collection);
                        }
                        throw null;
                    } catch (UnsupportedOperationException unused4) {
                        HashSet hashSet4 = new HashSet();
                        for (Map.Entry entry4 : zzahVar3.entrySet()) {
                            if (collection.contains(entry4.getValue())) {
                                hashSet4.add(entry4.getKey());
                            }
                        }
                        return ((com.google.android.gms.internal.mlkit_vision_text_common.zzao) zzahVar3.zzb).zzo().retainAll(hashSet4);
                    }
                default:
                    return super.retainAll(collection);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            int i = this.$r8$classId;
            Object obj = this.map;
            switch (i) {
                case 0:
                    return ((AbstractMap) obj).size();
                case 1:
                    return ((zzbw) ((zzbv) obj)).zzb;
                case 2:
                    return ((zzci) obj).size();
                case 3:
                    return ((zzah) obj).zza.size();
                case 4:
                    return ((zzbd) obj).size();
                case 5:
                    return ((zzah) obj).zza.size();
                case 6:
                    return ((zzba) obj).size();
                case 7:
                    return ((zzah) obj).zza.size();
                case 8:
                    return ((Multimaps$CustomListMultimap) obj).totalSize;
                default:
                    return ((CompactHashMap) obj).size();
            }
        }

        public /* synthetic */ Values(AbstractMap abstractMap, int i) {
            this.$r8$classId = i;
            this.map = abstractMap;
        }
    }

    public static ArrayList newArrayList(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static boolean equalsImpl(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean equalsImpl(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
