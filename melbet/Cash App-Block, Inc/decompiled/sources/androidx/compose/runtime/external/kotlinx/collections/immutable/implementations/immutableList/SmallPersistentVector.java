package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.core.os.BundleKt;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda11;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes.dex */
public final class SmallPersistentVector extends AbstractPersistentList {
    public static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);
    public final Object[] buffer;

    public SmallPersistentVector(Object[] objArr) {
        this.buffer = objArr;
        int length = objArr.length;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List
    public final AbstractPersistentList add(int i, Object obj) {
        Object[] objArr = this.buffer;
        BundleKt.checkPositionIndex$runtime(i, objArr.length);
        if (i == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
            ArraysKt___ArraysJvmKt.copyInto(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new SmallPersistentVector(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArraysKt___ArraysJvmKt.copyInto(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new PersistentVector(objArr.length + 1, 0, copyOf, objArr3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List
    public final AbstractPersistentList addAll(Collection collection) {
        Object[] objArr = this.buffer;
        if (collection.size() + objArr.length > 32) {
            PersistentVectorBuilder builder = builder();
            builder.addAll(collection);
            return builder.build();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        BundleKt.checkElementIndex$runtime(i, getSize());
        return this.buffer[i];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.buffer.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ArraysKt___ArraysKt.indexOf(this.buffer, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return ArraysKt___ArraysKt.lastIndexOf(this.buffer, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.buffer;
        BundleKt.checkPositionIndex$runtime(i, objArr.length);
        return new BufferIterator(i, objArr.length, objArr);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public final AbstractPersistentList removeAll(AliasQueries$$ExternalSyntheticLambda11 aliasQueries$$ExternalSyntheticLambda11) {
        Object[] objArr = this.buffer;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) aliasQueries$$ExternalSyntheticLambda11.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? EMPTY : new SmallPersistentVector(ArraysKt___ArraysJvmKt.copyOfRange(0, length, objArr2));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public final AbstractPersistentList removeAt(int i) {
        Object[] objArr = this.buffer;
        BundleKt.checkElementIndex$runtime(i, objArr.length);
        if (objArr.length == 1) {
            return EMPTY;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        ArraysKt___ArraysJvmKt.copyInto(i, i + 1, objArr.length, objArr, copyOf);
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, kotlin.collections.AbstractList, java.util.List
    public final AbstractPersistentList set(int i, Object obj) {
        BundleKt.checkElementIndex$runtime(i, getSize());
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List
    public final AbstractPersistentList add(Object obj) {
        Object[] objArr = this.buffer;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new SmallPersistentVector(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new PersistentVector(objArr.length + 1, 0, objArr, objArr2);
    }
}
