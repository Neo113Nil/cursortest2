package defpackage;

import com.squareup.moshi.Types;
import com.yandex.messaging.protojson.Util$GenericArrayTypeImpl;
import com.yandex.messaging.protojson.Util$ParameterizedTypeImpl;
import com.yandex.messaging.protojson.Util$WildcardTypeImpl;
import defpackage.w511;
import defpackage.y6a1;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class y6a1 {
    public static final Type[] a = new Type[0];

    public static final boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return cls;
            }
            final Type b = b(cls.getComponentType());
            return new GenericArrayType(b) { // from class: com.yandex.messaging.protojson.Util$GenericArrayTypeImpl
                public final Type a;

                {
                    this.a = y6a1.b(b);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof GenericArrayType) && Types.equals(this, (GenericArrayType) obj);
                }

                @Override // java.lang.reflect.GenericArrayType
                public final Type getGenericComponentType() {
                    return this.a;
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return y6a1.f(this.a) + "[]";
                }
            };
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof Util$ParameterizedTypeImpl) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new Util$ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type instanceof Util$GenericArrayTypeImpl) {
                return type;
            }
            final Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            return new GenericArrayType(genericComponentType) { // from class: com.yandex.messaging.protojson.Util$GenericArrayTypeImpl
                public final Type a;

                {
                    this.a = y6a1.b(genericComponentType);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof GenericArrayType) && Types.equals(this, (GenericArrayType) obj);
                }

                @Override // java.lang.reflect.GenericArrayType
                public final Type getGenericComponentType() {
                    return this.a;
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return y6a1.f(this.a) + "[]";
                }
            };
        }
        if (!(type instanceof WildcardType) || (type instanceof Util$WildcardTypeImpl)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        final Type[] upperBounds = wildcardType.getUpperBounds();
        final Type[] lowerBounds = wildcardType.getLowerBounds();
        return new WildcardType(upperBounds, lowerBounds) { // from class: com.yandex.messaging.protojson.Util$WildcardTypeImpl
            public final Type a;
            public final Type b;

            {
                if (lowerBounds.length > 1) {
                    w511.q();
                    throw null;
                }
                if (upperBounds.length != 1) {
                    w511.q();
                    throw null;
                }
                if (lowerBounds.length != 1) {
                    upperBounds[0].getClass();
                    y6a1.c(upperBounds[0]);
                    this.b = null;
                    this.a = y6a1.b(upperBounds[0]);
                    return;
                }
                lowerBounds[0].getClass();
                y6a1.c(lowerBounds[0]);
                if (upperBounds[0] != Object.class) {
                    w511.q();
                    throw null;
                }
                this.b = y6a1.b(lowerBounds[0]);
                this.a = Object.class;
            }

            public final boolean equals(Object obj) {
                return (obj instanceof WildcardType) && Types.equals(this, (WildcardType) obj);
            }

            @Override // java.lang.reflect.WildcardType
            public final Type[] getLowerBounds() {
                Type type2 = this.b;
                return type2 != null ? new Type[]{type2} : y6a1.a;
            }

            @Override // java.lang.reflect.WildcardType
            public final Type[] getUpperBounds() {
                return new Type[]{this.a};
            }

            public final int hashCode() {
                Type type2 = this.b;
                return (this.a.hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
            }

            public final String toString() {
                Type type2 = this.b;
                if (type2 != null) {
                    return "? super " + y6a1.f(type2);
                }
                Type type3 = this.a;
                if (type3 == Object.class) {
                    return "?";
                }
                return "? extends " + y6a1.f(type3);
            }
        };
    }

    public static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            w511.t("Unexpected primitive ", type, ". Use the boxed type.");
        }
    }

    public static Type d(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[LOOP:0: B:1:0x0000->B:18:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type e(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type e = e(type, cls, componentType);
                        return componentType == e ? cls2 : Types.arrayOf(e);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type e2 = e(type, cls, genericComponentType);
                    return genericComponentType == e2 ? genericArrayType : Types.arrayOf(e2);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type e3 = e(type, cls, ownerType);
                    boolean z = e3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type e4 = e(type, cls, actualTypeArguments[i]);
                        if (e4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = e4;
                        }
                        i++;
                    }
                    return z ? new Util$ParameterizedTypeImpl(e3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type e5 = e(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (e5 != lowerBounds[0]) {
                            return Types.supertypeOf(e5);
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type e6 = e(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (e6 != upperBounds[0]) {
                                return Types.subtypeOf(e6);
                            }
                        }
                    }
                }
                return type5;
            }
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type d = d(type, cls, cls3);
                if (d instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) d).getActualTypeArguments()[i];
                            if (type3 != typeVariable) {
                                return type3;
                            }
                            type4 = type3;
                        } else {
                            i++;
                        }
                    }
                    ny61.p();
                    return null;
                }
            }
            type3 = typeVariable;
            if (type3 != typeVariable) {
            }
        }
    }

    public static String f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
