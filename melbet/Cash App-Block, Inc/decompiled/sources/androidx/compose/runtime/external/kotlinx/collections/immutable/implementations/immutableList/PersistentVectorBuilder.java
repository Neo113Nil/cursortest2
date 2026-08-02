package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.core.os.BundleKt;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda11;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator;

/* loaded from: classes3.dex */
public final class PersistentVectorBuilder extends AbstractMutableList implements Collection, KMutableCollection {
    public EndOfChain ownership = new EndOfChain();
    public Object[] root;
    public int rootShift;
    public int size;
    public Object[] tail;
    public AbstractPersistentList vector;
    public Object[] vectorRoot;
    public Object[] vectorTail;

    public PersistentVectorBuilder(AbstractPersistentList abstractPersistentList, Object[] objArr, Object[] objArr2, int i) {
        this.vector = abstractPersistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
        this.root = objArr;
        this.tail = objArr2;
        this.size = abstractPersistentList.size();
    }

    public static void copyToBuffer(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        BundleKt.checkPositionIndex$runtime(i, getSize());
        if (i == getSize()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize$2 = rootSize$2();
        if (i >= rootSize$2) {
            insertIntoTail(this.root, obj, i - rootSize$2);
            return;
        }
        DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider(null);
        Object[] objArr = this.root;
        objArr.getClass();
        insertIntoTail(insertIntoRoot$1(objArr, this.rootShift, i, obj, defaultDrmSessionManagerProvider), defaultDrmSessionManagerProvider.lock, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] mutableBuffer;
        BundleKt.checkPositionIndex$runtime(i, this.size);
        if (i == this.size) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.size - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] makeMutable = makeMutable(objArr);
            ArraysKt___ArraysJvmKt.copyInto(size2 + 1, i3, tailSize(), objArr, makeMutable);
            copyToBuffer(makeMutable, i3, collection.iterator());
            this.tail = makeMutable;
            this.size = collection.size() + this.size;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int tailSize = tailSize();
        int size3 = collection.size() + this.size;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= rootSize$2()) {
            mutableBuffer = mutableBuffer();
            collection2 = collection;
            splitToBuffers(collection2, i, this.tail, tailSize, objArr2, size, mutableBuffer);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.tail;
            if (size3 > tailSize) {
                int i4 = size3 - tailSize;
                Object[] makeMutableShiftingRight = makeMutableShiftingRight(i4, objArr3);
                insertIntoRoot(collection2, i, i4, objArr2, size, makeMutableShiftingRight);
                objArr2 = objArr2;
                mutableBuffer = makeMutableShiftingRight;
            } else {
                mutableBuffer = mutableBuffer();
                int i5 = tailSize - size3;
                ArraysKt___ArraysJvmKt.copyInto(0, i5, tailSize, objArr3, mutableBuffer);
                int i6 = 32 - i5;
                Object[] makeMutableShiftingRight2 = makeMutableShiftingRight(i6, this.tail);
                int i7 = size - 1;
                objArr2[i7] = makeMutableShiftingRight2;
                insertIntoRoot(collection2, i, i6, objArr2, i7, makeMutableShiftingRight2);
                collection2 = collection2;
            }
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i2, objArr2);
        this.tail = mutableBuffer;
        this.size = collection2.size() + this.size;
        return true;
    }

    public final AbstractPersistentList build() {
        AbstractPersistentList persistentVector;
        Object[] objArr = this.root;
        if (objArr == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new EndOfChain();
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                persistentVector = objArr2.length == 0 ? SmallPersistentVector.EMPTY : new SmallPersistentVector(Arrays.copyOf(this.tail, getSize()));
            } else {
                Object[] objArr3 = this.root;
                objArr3.getClass();
                persistentVector = new PersistentVector(getSize(), this.rootShift, objArr3, this.tail);
            }
        }
        this.vector = persistentVector;
        return persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        BundleKt.checkElementIndex$runtime(i, getSize());
        if (rootSize$2() <= i) {
            objArr = this.tail;
        } else {
            Object[] objArr2 = this.root;
            objArr2.getClass();
            for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[DimensionKt.indexSegment(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final int getModCount$runtime() {
        return ((AbstractList) this).modCount;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.size;
    }

    public final void insertIntoRoot(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root == null) {
            a$$ExternalSyntheticBUOutline0.m$1("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractListIterator leafBufferIterator = leafBufferIterator(rootSize$2() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (leafBufferIterator.index - 1 != i4) {
            Object[] objArr4 = (Object[]) leafBufferIterator.previous();
            ArraysKt___ArraysJvmKt.copyInto(0, 32 - i2, 32, objArr4, objArr3);
            objArr3 = makeMutableShiftingRight(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) leafBufferIterator.previous();
        int rootSize$2 = i3 - (((rootSize$2() >> 5) - 1) - i4);
        if (rootSize$2 < i3) {
            objArr2 = objArr[rootSize$2];
            objArr2.getClass();
        }
        splitToBuffers(collection, i, objArr5, 32, objArr, rootSize$2, objArr2);
    }

    public final Object[] insertIntoRoot$1(Object[] objArr, int i, int i2, Object obj, DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider) {
        Object obj2;
        int indexSegment = DimensionKt.indexSegment(i2, i);
        if (i == 0) {
            defaultDrmSessionManagerProvider.lock = objArr[31];
            Object[] makeMutable = makeMutable(objArr);
            ArraysKt___ArraysJvmKt.copyInto(indexSegment + 1, indexSegment, 31, objArr, makeMutable);
            makeMutable[indexSegment] = obj;
            return makeMutable;
        }
        Object[] makeMutable2 = makeMutable(objArr);
        int i3 = i - 5;
        Object obj3 = makeMutable2[indexSegment];
        obj3.getClass();
        makeMutable2[indexSegment] = insertIntoRoot$1((Object[]) obj3, i3, i2, obj, defaultDrmSessionManagerProvider);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable2[indexSegment]) == null) {
                break;
            }
            makeMutable2[indexSegment] = insertIntoRoot$1((Object[]) obj2, i3, 0, defaultDrmSessionManagerProvider.lock, defaultDrmSessionManagerProvider);
        }
        return makeMutable2;
    }

    public final void insertIntoTail(Object[] objArr, Object obj, int i) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        Object[] objArr2 = this.tail;
        if (tailSize >= 32) {
            Object obj2 = objArr2[31];
            ArraysKt___ArraysJvmKt.copyInto(i + 1, i, 31, objArr2, makeMutable);
            makeMutable[i] = obj;
            pushFilledTail(objArr, makeMutable, mutableBufferWith(obj2));
            return;
        }
        ArraysKt___ArraysJvmKt.copyInto(i + 1, i, tailSize, objArr2, makeMutable);
        makeMutable[i] = obj;
        this.root = objArr;
        this.tail = makeMutable;
        this.size++;
    }

    public final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final AbstractListIterator leafBufferIterator(int i) {
        Object[] objArr = this.root;
        if (objArr == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Invalid root");
            return null;
        }
        int rootSize$2 = rootSize$2() >> 5;
        BundleKt.checkPositionIndex$runtime(i, rootSize$2);
        int i2 = this.rootShift;
        return i2 == 0 ? new SingleElementListIterator(objArr, i) : new TrieIterator(objArr, i, rootSize$2, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        BundleKt.checkPositionIndex$runtime(i, this.size);
        return new PersistentVectorMutableIterator(this, i);
    }

    public final Object[] makeMutable(Object[] objArr) {
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ArraysKt___ArraysJvmKt.copyInto$default(0, length, 6, objArr, mutableBuffer);
        return mutableBuffer;
    }

    public final Object[] makeMutableShiftingRight(int i, Object[] objArr) {
        if (isMutable(objArr)) {
            ArraysKt___ArraysJvmKt.copyInto(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        ArraysKt___ArraysJvmKt.copyInto(i, 0, 32 - i, objArr, mutableBuffer);
        return mutableBuffer;
    }

    public final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    public final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    public final Object[] nullifyAfter(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int indexSegment = DimensionKt.indexSegment(i, i2);
        Object obj = objArr[indexSegment];
        obj.getClass();
        Object nullifyAfter = nullifyAfter(i, i2 - 5, (Object[]) obj);
        if (indexSegment < 31) {
            int i3 = indexSegment + 1;
            if (objArr[i3] != null) {
                if (isMutable(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] mutableBuffer = mutableBuffer();
                ArraysKt___ArraysJvmKt.copyInto(0, 0, i3, objArr, mutableBuffer);
                objArr = mutableBuffer;
            }
        }
        if (nullifyAfter == objArr[indexSegment]) {
            return objArr;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = nullifyAfter;
        return makeMutable;
    }

    public final Object[] pullLastBuffer$1(Object[] objArr, int i, int i2, DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider) {
        Object[] pullLastBuffer$1;
        int indexSegment = DimensionKt.indexSegment(i2 - 1, i);
        if (i == 5) {
            defaultDrmSessionManagerProvider.lock = objArr[indexSegment];
            pullLastBuffer$1 = null;
        } else {
            Object obj = objArr[indexSegment];
            obj.getClass();
            pullLastBuffer$1 = pullLastBuffer$1((Object[]) obj, i - 5, i2, defaultDrmSessionManagerProvider);
        }
        if (pullLastBuffer$1 == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer$1;
        return makeMutable;
    }

    public final void pullLastBufferFromRoot(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i;
            this.rootShift = i2;
            return;
        }
        DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider(null);
        objArr.getClass();
        Object[] pullLastBuffer$1 = pullLastBuffer$1(objArr, i2, i, defaultDrmSessionManagerProvider);
        pullLastBuffer$1.getClass();
        Object obj = defaultDrmSessionManagerProvider.lock;
        obj.getClass();
        this.tail = (Object[]) obj;
        this.size = i;
        if (pullLastBuffer$1[1] == null) {
            this.root = (Object[]) pullLastBuffer$1[0];
            this.rootShift = i2 - 5;
        } else {
            this.root = pullLastBuffer$1;
            this.rootShift = i2;
        }
    }

    public final Object[] pushBuffers(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] makeMutable = makeMutable(objArr);
        int indexSegment = DimensionKt.indexSegment(i, i2);
        int i3 = i2 - 5;
        makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i, i3, it);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || !it.hasNext()) {
                break;
            }
            makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i3, it);
        }
        return makeMutable;
    }

    public final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i, Object[][] objArr2) {
        ArrayIterator arrayIterator = new ArrayIterator(objArr2);
        int i2 = i >> 5;
        int i3 = this.rootShift;
        Object[] pushBuffers = i2 < (1 << i3) ? pushBuffers(objArr, i, i3, arrayIterator) : makeMutable(objArr);
        while (arrayIterator.hasNext()) {
            this.rootShift += 5;
            pushBuffers = mutableBufferWith(pushBuffers);
            int i4 = this.rootShift;
            pushBuffers(pushBuffers, 1 << i4, i4, arrayIterator);
        }
        return pushBuffers;
    }

    public final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.size;
        int i2 = i >> 5;
        int i3 = this.rootShift;
        if (i2 > (1 << i3)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size++;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = i + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i3);
            this.tail = objArr3;
            this.size++;
        }
    }

    public final Object[] pushTail(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = DimensionKt.indexSegment(getSize() - 1, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 5) {
            makeMutable[indexSegment] = objArr2;
            return makeMutable;
        }
        makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i - 5);
        return makeMutable;
    }

    public final int recyclableRemoveAll(Function1 function1, Object[] objArr, int i, int i2, DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider, ArrayList arrayList, ArrayList arrayList2) {
        if (isMutable(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = defaultDrmSessionManagerProvider.lock;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : mutableBuffer();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        defaultDrmSessionManagerProvider.lock = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int removeAll(Function1 function1, Object[] objArr, int i, DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = makeMutable(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        defaultDrmSessionManagerProvider.lock = objArr2;
        return i2;
    }

    public final int removeAllFromTail(Function1 function1, int i, DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider) {
        int removeAll = removeAll(function1, this.tail, i, defaultDrmSessionManagerProvider);
        Object obj = defaultDrmSessionManagerProvider.lock;
        if (removeAll == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, removeAll, i, (Object) null);
        this.tail = objArr;
        this.size -= i - removeAll;
        return removeAll;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (removeAllFromTail(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAllWithPredicate(Function1 function1) {
        int i;
        Function1 function12 = function1;
        int tailSize = tailSize();
        Object[] objArr = null;
        DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider(null);
        boolean z = false;
        if (this.root != null) {
            AbstractListIterator leafBufferIterator = leafBufferIterator(0);
            int i2 = 32;
            while (i2 == 32 && leafBufferIterator.hasNext()) {
                i2 = removeAll(function12, (Object[]) leafBufferIterator.next(), 32, defaultDrmSessionManagerProvider);
            }
            if (i2 == 32) {
                int removeAllFromTail = removeAllFromTail(function12, tailSize, defaultDrmSessionManagerProvider);
                if (removeAllFromTail == 0) {
                    pullLastBufferFromRoot(this.size, this.rootShift, this.root);
                }
            } else {
                int i3 = (leafBufferIterator.index - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (leafBufferIterator.hasNext()) {
                    i4 = recyclableRemoveAll(function12, (Object[]) leafBufferIterator.next(), 32, i4, defaultDrmSessionManagerProvider, arrayList2, arrayList);
                    function12 = function1;
                }
                int recyclableRemoveAll = recyclableRemoveAll(function1, this.tail, tailSize, i4, defaultDrmSessionManagerProvider, arrayList2, arrayList);
                Object obj = defaultDrmSessionManagerProvider.lock;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, recyclableRemoveAll, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.root;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = pushBuffers(objArr3, i3, this.rootShift, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    PreconditionsKt.throwIllegalArgumentException("invalid size");
                }
                if (size == 0) {
                    this.rootShift = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.rootShift;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.rootShift = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = nullifyAfter(i5, i, objArr3);
                }
                this.root = objArr;
                this.tail = objArr2;
                this.size = size + recyclableRemoveAll;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object removeAt(int i) {
        BundleKt.checkElementIndex$runtime(i, getSize());
        ((AbstractList) this).modCount++;
        int rootSize$2 = rootSize$2();
        if (i >= rootSize$2) {
            return removeFromTailAt(this.root, rootSize$2, this.rootShift, i - rootSize$2);
        }
        DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider(this.tail[0]);
        Object[] objArr = this.root;
        objArr.getClass();
        removeFromTailAt(removeFromRootAt$1(objArr, this.rootShift, i, defaultDrmSessionManagerProvider), rootSize$2, this.rootShift, 0);
        return defaultDrmSessionManagerProvider.lock;
    }

    public final Object[] removeFromRootAt$1(Object[] objArr, int i, int i2, DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider) {
        int indexSegment = DimensionKt.indexSegment(i2, i);
        if (i == 0) {
            Object obj = objArr[indexSegment];
            Object[] makeMutable = makeMutable(objArr);
            ArraysKt___ArraysJvmKt.copyInto(indexSegment, indexSegment + 1, 32, objArr, makeMutable);
            makeMutable[31] = defaultDrmSessionManagerProvider.lock;
            defaultDrmSessionManagerProvider.lock = obj;
            return makeMutable;
        }
        int indexSegment2 = objArr[31] == null ? DimensionKt.indexSegment(rootSize$2() - 1, i) : 31;
        Object[] makeMutable2 = makeMutable(objArr);
        int i3 = i - 5;
        int i4 = indexSegment + 1;
        if (i4 <= indexSegment2) {
            while (true) {
                Object obj2 = makeMutable2[indexSegment2];
                obj2.getClass();
                makeMutable2[indexSegment2] = removeFromRootAt$1((Object[]) obj2, i3, 0, defaultDrmSessionManagerProvider);
                if (indexSegment2 == i4) {
                    break;
                }
                indexSegment2--;
            }
        }
        Object obj3 = makeMutable2[indexSegment];
        obj3.getClass();
        makeMutable2[indexSegment] = removeFromRootAt$1((Object[]) obj3, i3, i2, defaultDrmSessionManagerProvider);
        return makeMutable2;
    }

    public final Object removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.size - i;
        Object[] objArr2 = this.tail;
        if (i4 == 1) {
            Object obj = objArr2[0];
            pullLastBufferFromRoot(i, i2, objArr);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] makeMutable = makeMutable(objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i3, i3 + 1, i4, objArr2, makeMutable);
        makeMutable[i4 - 1] = null;
        this.root = objArr;
        this.tail = makeMutable;
        this.size = (i + i4) - 1;
        this.rootShift = i2;
        return obj2;
    }

    public final int rootSize$2() {
        int i = this.size;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        BundleKt.checkElementIndex$runtime(i, getSize());
        if (rootSize$2() > i) {
            DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider = new DefaultDrmSessionManagerProvider(null);
            Object[] objArr = this.root;
            objArr.getClass();
            this.root = setInRoot(objArr, this.rootShift, i, obj, defaultDrmSessionManagerProvider);
            return defaultDrmSessionManagerProvider.lock;
        }
        Object[] makeMutable = makeMutable(this.tail);
        if (makeMutable != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = makeMutable[i2];
        makeMutable[i2] = obj;
        this.tail = makeMutable;
        return obj2;
    }

    public final Object[] setInRoot(Object[] objArr, int i, int i2, Object obj, DefaultDrmSessionManagerProvider defaultDrmSessionManagerProvider) {
        int indexSegment = DimensionKt.indexSegment(i2, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i != 0) {
            Object obj2 = makeMutable[indexSegment];
            obj2.getClass();
            makeMutable[indexSegment] = setInRoot((Object[]) obj2, i - 5, i2, obj, defaultDrmSessionManagerProvider);
            return makeMutable;
        }
        if (makeMutable != objArr) {
            ((AbstractList) this).modCount++;
        }
        defaultDrmSessionManagerProvider.lock = makeMutable[indexSegment];
        makeMutable[indexSegment] = obj;
        return makeMutable;
    }

    public final void splitToBuffers(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] mutableBuffer;
        if (i3 < 1) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] makeMutable = makeMutable(objArr);
        objArr2[0] = makeMutable;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ArraysKt___ArraysJvmKt.copyInto(size + 1, i4, i2, makeMutable, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                mutableBuffer = makeMutable;
            } else {
                mutableBuffer = mutableBuffer();
                i3--;
                objArr2[i3] = mutableBuffer;
            }
            int i7 = i2 - i6;
            ArraysKt___ArraysJvmKt.copyInto(0, i7, i2, makeMutable, objArr3);
            ArraysKt___ArraysJvmKt.copyInto(size + 1, i4, i7, makeMutable, mutableBuffer);
            objArr3 = mutableBuffer;
        }
        Iterator it = collection.iterator();
        copyToBuffer(makeMutable, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] mutableBuffer2 = mutableBuffer();
            copyToBuffer(mutableBuffer2, 0, it);
            objArr2[i8] = mutableBuffer2;
        }
        copyToBuffer(objArr3, 0, it);
    }

    public final int tailSize() {
        int i = this.size;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return removeAllWithPredicate(new AliasQueries$$ExternalSyntheticLambda11(2, collection));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = obj;
            this.tail = makeMutable;
            this.size = getSize() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator it = collection.iterator();
        if (32 - tailSize >= collection.size()) {
            Object[] makeMutable = makeMutable(this.tail);
            copyToBuffer(makeMutable, tailSize, it);
            this.tail = makeMutable;
            this.size = collection.size() + this.size;
            return true;
        }
        int size = ((collection.size() + tailSize) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] makeMutable2 = makeMutable(this.tail);
        copyToBuffer(makeMutable2, tailSize, it);
        objArr[0] = makeMutable2;
        for (int i = 1; i < size; i++) {
            Object[] mutableBuffer = mutableBuffer();
            copyToBuffer(mutableBuffer, 0, it);
            objArr[i] = mutableBuffer;
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize$2(), objArr);
        Object[] mutableBuffer2 = mutableBuffer();
        copyToBuffer(mutableBuffer2, 0, it);
        this.tail = mutableBuffer2;
        this.size = collection.size() + this.size;
        return true;
    }
}
