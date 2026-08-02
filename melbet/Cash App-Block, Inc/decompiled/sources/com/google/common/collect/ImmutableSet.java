package com.google.common.collect;

import androidx.core.os.BundleKt;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class ImmutableSet extends ImmutableCollection implements Set {
    public static final /* synthetic */ int $r8$clinit = 0;
    public transient ImmutableList asList;

    /* loaded from: classes4.dex */
    public class Builder extends ImmutableCollection.ArrayBasedBuilder {
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public Builder add(Object obj) {
            obj.getClass();
            m2032add(obj);
            return this;
        }

        public ImmutableSet build() {
            int i = this.size;
            if (i == 0) {
                int i2 = ImmutableSet.$r8$clinit;
                return RegularImmutableSet.EMPTY;
            }
            Object[] objArr = this.contents;
            if (i != 1) {
                ImmutableSet construct = ImmutableSet.construct(i, objArr);
                this.size = construct.size();
                this.forceCopy = true;
                return construct;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i3 = ImmutableSet.$r8$clinit;
            return new SingletonImmutableSet(obj);
        }

        public Builder combine(Builder builder) {
            addAll(builder.size, builder.contents);
            return this;
        }
    }

    public static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            Trace.checkArgument("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static ImmutableSet construct(int i, Object... objArr) {
        if (i == 0) {
            return RegularImmutableSet.EMPTY;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int chooseTableSize = chooseTableSize(i);
        Object[] objArr2 = new Object[chooseTableSize];
        int i2 = chooseTableSize - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int smear = BundleKt.smear(hashCode);
            while (true) {
                int i6 = smear & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                smear++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (chooseTableSize(i4) < chooseTableSize / 2) {
            return construct(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(i3, i2, i4, objArr, objArr2);
    }

    public static ImmutableSet copyOf(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? construct(objArr.length, (Object[]) objArr.clone()) : new SingletonImmutableSet(objArr[0]) : RegularImmutableSet.EMPTY;
    }

    public static ImmutableSet of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Trace.checkArgument("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return construct(length, objArr2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        ImmutableList immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    public ImmutableList createAsList() {
        Object[] array2 = toArray(ImmutableCollection.EMPTY_ARRAY);
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        return ImmutableList.asImmutableList(array2.length, array2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && (this instanceof RegularImmutableSet) && (((ImmutableSet) obj) instanceof RegularImmutableSet) && ((RegularImmutableSet) this).hashCode != obj.hashCode()) {
            return false;
        }
        return Maps.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Maps.hashCodeImpl(this);
    }

    public static ImmutableSet copyOf(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array2 = collection.toArray();
        return construct(array2.length, array2);
    }

    public static ImmutableSet of(Object obj, Object obj2) {
        return construct(2, obj, obj2);
    }

    public static void of(String str) {
        new SingletonImmutableSet(str);
    }
}
