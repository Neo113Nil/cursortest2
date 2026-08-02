package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class rdb extends a implements qdb, Serializable {
    public final Enum[] b;

    public rdb(Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new tdb(this.b);
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) xz0.E(r4.ordinal(), this.b)) == r4;
    }

    @Override // defpackage.w5
    public final int f() {
        return this.b.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b7 b7Var = a.a;
        Enum[] enumArr = this.b;
        int length = enumArr.length;
        b7Var.getClass();
        b7.b(i, length);
        return enumArr[i];
    }

    @Override // kotlin.collections.a, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) xz0.E(ordinal, this.b)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) xz0.E(ordinal, this.b)) == r4) {
            return ordinal;
        }
        return -1;
    }
}
