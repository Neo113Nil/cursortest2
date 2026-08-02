package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class jvt implements GenericArrayType {
    public final Type a;

    public jvt(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && jf0.B(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return jf0.d0(this.a) + "[]";
    }
}
