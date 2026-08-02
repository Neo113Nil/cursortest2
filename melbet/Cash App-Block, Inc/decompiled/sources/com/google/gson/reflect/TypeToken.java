package com.google.gson.reflect;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.TroubleshootingGuide;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final Class<? super T> rawType;

    /* renamed from: type, reason: collision with root package name */
    private final Type f1015type;

    private TypeToken(Type type2) {
        Objects.requireNonNull(type2);
        Type canonicalize = GsonTypes.canonicalize(type2);
        this.f1015type = canonicalize;
        this.rawType = (Class<? super T>) GsonTypes.getRawType(canonicalize);
        this.hashCode = canonicalize.hashCode();
    }

    private static IllegalArgumentException buildUnsupportedTypeException(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unsupported type, expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type2.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type2.toString());
        return new IllegalArgumentException(sb.toString());
    }

    public static TypeToken<?> get(Type type2) {
        return new TypeToken<>(type2);
    }

    public static TypeToken<?> getArray(Type type2) {
        return new TypeToken<>(GsonTypes.arrayOf(type2));
    }

    public static TypeToken<?> getParameterized(Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        Objects.requireNonNull(typeArr);
        if (!(type2 instanceof Class)) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) type2, "rawType must be of type Class, but was ");
            return null;
        }
        Class cls = (Class) type2;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            AesGcmSiv$$ExternalSyntheticLambda0.m(cls.getName(), " requires ", length, " type arguments, but got ", length2);
            return null;
        }
        if (typeArr.length == 0) {
            return get(cls);
        }
        if (GsonTypes.requiresOwnerType(type2)) {
            a$$ExternalSyntheticBUOutline0.m$3(re$$ExternalSyntheticOutline0.m(cls, new StringBuilder("Raw type "), " is not supported because it requires specifying an owner type"));
            return null;
        }
        for (int i = 0; i < length; i++) {
            Type type3 = typeArr[i];
            Objects.requireNonNull(type3, "Type argument must not be null");
            Type type4 = type3;
            Class<?> rawType = GsonTypes.getRawType(type4);
            TypeVariable<Class<T>> typeVariable = typeParameters[i];
            for (Type type5 : typeVariable.getBounds()) {
                if (!GsonTypes.getRawType(type5).isAssignableFrom(rawType)) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Type argument ", type4, " does not satisfy bounds for type variable ", typeVariable, " declared by ", type2);
                    return null;
                }
            }
        }
        return new TypeToken<>(GsonTypes.newParameterizedTypeWithOwner(null, cls, typeArr));
    }

    private Type getTypeTokenTypeArgument() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type canonicalize = GsonTypes.canonicalize(parameterizedType.getActualTypeArguments()[0]);
                if (isCapturingTypeVariablesForbidden()) {
                    verifyNoTypeVariable(canonicalize);
                }
                return canonicalize;
            }
        } else if (genericSuperclass == TypeToken.class) {
            a$$ExternalSyntheticBUOutline0.m$2(TroubleshootingGuide.createUrl("type-token-raw"), "TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Must only create direct subclasses of TypeToken");
        return null;
    }

    private static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class<?> rawType = GsonTypes.getRawType(type2);
        ParameterizedType parameterizedType2 = type2 instanceof ParameterizedType ? (ParameterizedType) type2 : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type3 = actualTypeArguments[i];
                TypeVariable<Class<?>> typeVariable = typeParameters[i];
                while (type3 instanceof TypeVariable) {
                    type3 = map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type4 : rawType.getGenericInterfaces()) {
            if (isAssignableFrom(type4, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(rawType.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean isCapturingTypeVariablesForbidden() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    private static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        if (type3.equals(type2)) {
            return true;
        }
        return (type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName()));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    private static void verifyNoTypeVariable(Type type2) {
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            StringBuilder sb = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
            sb.append(typeVariable.getName());
            sb.append(" declared by ");
            sb.append(typeVariable.getGenericDeclaration());
            Handlers$$ExternalSyntheticBUOutline0.m(sb, "\nSee ", TroubleshootingGuide.createUrl("typetoken-type-variable"));
            return;
        }
        if (type2 instanceof GenericArrayType) {
            verifyNoTypeVariable(((GenericArrayType) type2).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                verifyNoTypeVariable(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                verifyNoTypeVariable(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type2 instanceof WildcardType)) {
            if (type2 != null) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            return;
        }
        WildcardType wildcardType = (WildcardType) type2;
        for (Type type3 : wildcardType.getLowerBounds()) {
            verifyNoTypeVariable(type3);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            verifyNoTypeVariable(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && GsonTypes.equals(this.f1015type, ((TypeToken) obj).f1015type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.f1015type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return GsonTypes.typeToString(this.f1015type);
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    public TypeToken() {
        Type typeTokenTypeArgument = getTypeTokenTypeArgument();
        this.f1015type = typeTokenTypeArgument;
        this.rawType = (Class<? super T>) GsonTypes.getRawType(typeTokenTypeArgument);
        this.hashCode = typeTokenTypeArgument.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.f1015type.equals(type2)) {
            return true;
        }
        Type type3 = this.f1015type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(GsonTypes.getRawType(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) type3, new HashMap());
        }
        if (type3 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(GsonTypes.getRawType(type2)) && isAssignableFrom(type2, (GenericArrayType) this.f1015type);
        }
        throw buildUnsupportedTypeException(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> typeToken) {
        return isAssignableFrom(typeToken.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        } else if (type2 instanceof Class) {
            type2 = (Class) type2;
            while (type2.isArray()) {
                type2 = type2.getComponentType();
            }
        }
        return isAssignableFrom(type2, (ParameterizedType) genericComponentType, new HashMap());
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }
}
