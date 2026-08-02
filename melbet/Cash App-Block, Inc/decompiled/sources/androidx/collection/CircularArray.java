package androidx.collection;

import androidx.room.coroutines.ConnectionWithLock;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* loaded from: classes3.dex */
public final class CircularArray {
    public int capacityBitmask;
    public Object[] elements;
    public int head;
    public int tail;

    public void add(Disposable disposable) {
        Object obj;
        Object obj2;
        Object[] objArr = this.elements;
        int i = this.head;
        int hashCode = disposable.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(disposable)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(disposable));
            return;
        }
        objArr[i2] = disposable;
        int i3 = this.tail + 1;
        this.tail = i3;
        if (i3 < this.capacityBitmask) {
            return;
        }
        Object[] objArr2 = this.elements;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.head = i5;
                this.capacityBitmask = (int) (i4 * 0.75f);
                this.elements = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int hashCode2 = obj.hashCode() * (-1640531527);
            int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
            if (objArr3[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (objArr3[i7] != null);
            }
            objArr3[i7] = objArr2[length];
            i3 = i6;
        }
    }

    public void addLast(ConnectionWithLock connectionWithLock) {
        Object[] objArr = this.elements;
        int i = this.tail;
        objArr[i] = connectionWithLock;
        int i2 = this.capacityBitmask & (i + 1);
        this.tail = i2;
        int i3 = this.head;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Max array capacity exceeded");
                return;
            }
            Object[] objArr2 = new Object[i5];
            ArraysKt___ArraysJvmKt.copyInto(0, i3, length, objArr, objArr2);
            ArraysKt___ArraysJvmKt.copyInto(i4, 0, this.head, this.elements, objArr2);
            this.elements = objArr2;
            this.head = 0;
            this.tail = length;
            this.capacityBitmask = i5 - 1;
        }
    }

    public void removeEntry(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.tail--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < i5 && i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
