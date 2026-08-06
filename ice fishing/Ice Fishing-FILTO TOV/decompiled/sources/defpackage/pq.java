package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pq extends lv06NcmrQ implements oq, RandomAccess, Serializable {
    public final Enum[] OOA6hdeuvCS;

    public pq(Enum[] enumArr) {
        enumArr.getClass();
        this.OOA6hdeuvCS = enumArr;
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        return this.OOA6hdeuvCS.length;
    }

    @Override // defpackage.XnEVoBF0td1l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        Enum[] enumArr = this.OOA6hdeuvCS;
        enumArr.getClass();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.OOA6hdeuvCS;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", length));
        return null;
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.OOA6hdeuvCS;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.OOA6hdeuvCS;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }
}
