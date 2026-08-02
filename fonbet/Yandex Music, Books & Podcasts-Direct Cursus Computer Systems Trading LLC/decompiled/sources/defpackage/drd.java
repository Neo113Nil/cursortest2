package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class drd implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;

    public drd(Type type) {
        Objects.requireNonNull(type);
        this.a = qwp.z(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && qwp.K(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qwp.t0(this.a) + "[]";
    }
}
