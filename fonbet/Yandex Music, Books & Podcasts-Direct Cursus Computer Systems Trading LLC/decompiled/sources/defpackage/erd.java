package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class erd implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;
    public final Type b;
    public final Type[] c;

    public erd(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            xq0.x(tlm.j("Must specify owner type for ", cls));
            throw null;
        }
        this.a = type == null ? null : qwp.z(type);
        this.b = qwp.z(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.c[i]);
            qwp.E(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = qwp.z(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && qwp.K(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Type type = this.b;
        if (length == 0) {
            return qwp.t0(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(qwp.t0(type));
        sb.append("<");
        sb.append(qwp.t0(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(qwp.t0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
