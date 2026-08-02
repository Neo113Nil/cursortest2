package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class frd implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;
    public final Type b;

    public frd(Type[] typeArr, Type[] typeArr2) {
        vwb.K(typeArr2.length <= 1);
        vwb.K(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            qwp.E(typeArr[0]);
            this.b = null;
            this.a = qwp.z(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        qwp.E(typeArr2[0]);
        vwb.K(typeArr[0] == Object.class);
        this.b = qwp.z(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && qwp.K(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : qwp.e;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + qwp.t0(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + qwp.t0(type2);
    }
}
