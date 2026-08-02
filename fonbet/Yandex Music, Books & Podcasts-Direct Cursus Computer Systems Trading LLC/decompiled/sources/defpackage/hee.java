package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class hee extends qde implements Set {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 912559;
    public transient yde b;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static int t(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            o2g.J("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static hee u(int i, Object... objArr) {
        if (i == 0) {
            return wsn.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new gmq(obj);
        }
        int t = t(i);
        Object[] objArr2 = new Object[t];
        int i2 = t - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                jj4.j(k5r.i(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int I = ltg.I(hashCode);
            while (true) {
                int i6 = I & i2;
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
                I++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new gmq(obj4);
        }
        if (t(i4) < t / 2) {
            return u(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new wsn(i3, i2, i4, objArr, objArr2);
    }

    public static hee v(Collection collection) {
        if ((collection instanceof hee) && !(collection instanceof SortedSet)) {
            hee heeVar = (hee) collection;
            if (!heeVar.r()) {
                return heeVar;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    @Override // defpackage.qde
    public yde a() {
        yde ydeVar = this.b;
        if (ydeVar != null) {
            return ydeVar;
        }
        yde w = w();
        this.b = w;
        return w;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof hee) && (this instanceof wsn) && (((hee) obj) instanceof wsn) && hashCode() != obj.hashCode()) {
            return false;
        }
        return ezf.y(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ezf.E(this);
    }

    public yde w() {
        Object[] array = toArray(qde.a);
        ude udeVar = yde.b;
        return yde.t(array.length, array);
    }

    @Override // defpackage.qde
    public Object writeReplace() {
        return new gee(toArray(qde.a));
    }
}
