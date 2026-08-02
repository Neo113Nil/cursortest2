package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class y3u implements ParameterizedType {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public y3u(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            ny61.g(qv10.l(cls, "Must specify owner type for "));
            throw null;
        }
        this.a = type != null ? si91.h(type) : null;
        this.b = si91.h(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.c[i]);
            si91.i(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = si91.h(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && si91.k(this, (ParameterizedType) obj);
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
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Type type = this.b;
        if (length == 0) {
            return si91.r(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(si91.r(type));
        sb.append("<");
        sb.append(si91.r(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(Extension.FIX_SPACE);
            sb.append(si91.r(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
