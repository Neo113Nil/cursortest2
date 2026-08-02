package kotlin.reflect;

import defpackage.j73;
import defpackage.jl40;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class a implements ParameterizedType, Type {
    public final Class a;
    public final Type b;
    public final Type[] c;

    public a(Class cls, Type type, ArrayList arrayList) {
        this.a = cls;
        this.b = type;
        this.c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.a.equals(parameterizedType.getRawType()) && jl40.l(this.b, parameterizedType.getOwnerType()) && Arrays.equals(this.c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.a;
        Type type = this.b;
        if (type != null) {
            sb.append(b.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(b.a(cls));
        }
        Type[] typeArr = this.c;
        if (typeArr.length != 0) {
            j73.J(typeArr, sb, ParameterizedTypeImpl$getTypeName$1$1.b, 50);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Type type = this.b;
        return Arrays.hashCode(this.c) ^ (hashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
