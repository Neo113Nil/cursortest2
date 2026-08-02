package com.google.gson.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class GsonTypes {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type2) {
            Objects.requireNonNull(type2);
            this.componentType = GsonTypes.canonicalize(type2);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && GsonTypes.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return GsonTypes.typeToString(this.componentType) + "[]";
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type2, Class<?> cls, Type... typeArr) {
            Objects.requireNonNull(cls);
            if (type2 == null && GsonTypes.requiresOwnerType(cls)) {
                a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m((Class) cls, "Must specify owner type for "));
                throw null;
            }
            this.ownerType = type2 != null ? GsonTypes.canonicalize(type2) : null;
            this.rawType = GsonTypes.canonicalize(cls);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.typeArguments[i]);
                GsonTypes.checkNotPrimitive(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = GsonTypes.canonicalize(typeArr3[i]);
            }
        }

        private static int hashCodeOrZero(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && GsonTypes.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return hashCodeOrZero(this.ownerType) ^ (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode());
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return GsonTypes.typeToString(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(GsonTypes.typeToString(this.rawType));
            sb.append("<");
            sb.append(GsonTypes.typeToString(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(GsonTypes.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                a$$ExternalSyntheticBUOutline0.m$3("At most one lower bound is supported");
                throw null;
            }
            if (typeArr.length != 1) {
                a$$ExternalSyntheticBUOutline0.m$3("Exactly one upper bound must be specified");
                throw null;
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                GsonTypes.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = GsonTypes.canonicalize(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            GsonTypes.checkNotPrimitive(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                a$$ExternalSyntheticBUOutline0.m$3("When lower bound is specified, upper bound must be Object");
                throw null;
            }
            this.lowerBound = GsonTypes.canonicalize(typeArr2[0]);
            this.upperBound = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && GsonTypes.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type2 = this.lowerBound;
            return type2 != null ? new Type[]{type2} : GsonTypes.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type2 = this.lowerBound;
            return (this.upperBound.hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + GsonTypes.typeToString(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + GsonTypes.typeToString(this.upperBound);
        }
    }

    private GsonTypes() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType arrayOf(Type type2) {
        return new GenericArrayTypeImpl(type2);
    }

    public static Type canonicalize(Type type2) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            return cls.isArray() ? new GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type2).getGenericComponentType());
        }
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void checkNotPrimitive(Type type2) {
        if ((type2 instanceof Class) && ((Class) type2).isPrimitive()) {
            a$$ExternalSyntheticBUOutline0.m$3("Primitive type is not allowed");
        }
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean equals(Type type2, Type type3) {
        if (type2 == type3) {
            return true;
        }
        if (type2 instanceof Class) {
            return type2.equals(type3);
        }
        if (type2 instanceof ParameterizedType) {
            if (!(type3 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type3;
            return equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            if (type3 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type2).getGenericComponentType(), ((GenericArrayType) type3).getGenericComponentType());
            }
            return false;
        }
        if (type2 instanceof WildcardType) {
            if (!(type3 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            WildcardType wildcardType2 = (WildcardType) type3;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type2 instanceof TypeVariable) || !(type3 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type2;
        TypeVariable typeVariable2 = (TypeVariable) type3;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type getArrayComponentType(Type type2) {
        return type2 instanceof GenericArrayType ? ((GenericArrayType) type2).getGenericComponentType() : ((Class) type2).getComponentType();
    }

    public static Type getCollectionElementType(Type type2, Class<?> cls) {
        Type supertype = getSupertype(type2, cls, Collection.class);
        return supertype instanceof ParameterizedType ? ((ParameterizedType) supertype).getActualTypeArguments()[0] : Object.class;
    }

    private static Type getGenericSupertype(Type type2, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type2;
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
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] getMapKeyAndValueTypes(Type type2, Class<?> cls) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type supertype = getSupertype(type2, cls, Map.class);
        return supertype instanceof ParameterizedType ? ((ParameterizedType) supertype).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> getRawType(Type type2) {
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type2).getRawType();
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
        }
        if (type2 instanceof TypeVariable) {
            return Object.class;
        }
        if (type2 instanceof WildcardType) {
            return getRawType(((WildcardType) type2).getUpperBounds()[0]);
        }
        Handlers$$ExternalSyntheticBUOutline0.m$1("Expected a Class, ParameterizedType, or GenericArrayType, but <", type2, "> is of type ", type2 == null ? "null" : type2.getClass().getName());
        return null;
    }

    private static Type getSupertype(Type type2, Class<?> cls, Class<?> cls2) {
        if (type2 instanceof WildcardType) {
            type2 = ((WildcardType) type2).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return resolve(type2, cls, getGenericSupertype(type2, cls, cls2));
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m(cls, " is not the same as or a subtype of ", cls2);
        return null;
    }

    private static int indexOf(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        a$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type2, Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(type2, cls, typeArr);
    }

    public static boolean requiresOwnerType(Type type2) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    private static Type resolve(Type type2, Class<?> cls, Type type3, Map<TypeVariable<?>, Type> map) {
        Type resolve;
        Type newParameterizedTypeWithOwner;
        TypeVariable typeVariable = null;
        while (true) {
            if (type3 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type3;
                Type type4 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type4 != null) {
                    return type4 == cls2 ? type3 : type4;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                type3 = resolveTypeVariable(type2, cls, typeVariable2);
                if (type3 == typeVariable2) {
                    break;
                }
            } else {
                if (type3 instanceof Class) {
                    Class cls3 = type3;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type resolve2 = resolve(type2, cls, componentType, map);
                        if (equal(componentType, resolve2)) {
                            type3 = cls3;
                        } else {
                            newParameterizedTypeWithOwner = arrayOf(resolve2);
                            type3 = newParameterizedTypeWithOwner;
                        }
                    }
                }
                if (type3 instanceof GenericArrayType) {
                    type3 = (GenericArrayType) type3;
                    Type genericComponentType = type3.getGenericComponentType();
                    Type resolve3 = resolve(type2, cls, genericComponentType, map);
                    if (!equal(genericComponentType, resolve3)) {
                        newParameterizedTypeWithOwner = arrayOf(resolve3);
                        type3 = newParameterizedTypeWithOwner;
                    }
                } else {
                    if (type3 instanceof ParameterizedType) {
                        type3 = (ParameterizedType) type3;
                        Type ownerType = type3.getOwnerType();
                        Type resolve4 = resolve(type2, cls, ownerType, map);
                        boolean equal = equal(resolve4, ownerType);
                        Type[] actualTypeArguments = type3.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        Type[] typeArr = actualTypeArguments;
                        boolean z = false;
                        for (int i = 0; i < length; i++) {
                            Type resolve5 = resolve(type2, cls, typeArr[i], map);
                            if (!equal(resolve5, typeArr[i])) {
                                if (!z) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z = true;
                                }
                                typeArr[i] = resolve5;
                            }
                        }
                        if (!equal || z) {
                            newParameterizedTypeWithOwner = newParameterizedTypeWithOwner(resolve4, (Class) type3.getRawType(), typeArr);
                            type3 = newParameterizedTypeWithOwner;
                        }
                    } else if (type3 instanceof WildcardType) {
                        type3 = (WildcardType) type3;
                        Type[] lowerBounds = type3.getLowerBounds();
                        Type[] upperBounds = type3.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type resolve6 = resolve(type2, cls, lowerBounds[0], map);
                            if (resolve6 != lowerBounds[0]) {
                                type3 = supertypeOf(resolve6);
                            }
                        } else if (upperBounds.length == 1 && (resolve = resolve(type2, cls, upperBounds[0], map)) != upperBounds[0]) {
                            type3 = subtypeOf(resolve);
                        }
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type3);
        }
        return type3;
    }

    private static Type resolveTypeVariable(Type type2, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> declaringClassOf = declaringClassOf(typeVariable);
        if (declaringClassOf != null) {
            Type genericSupertype = getGenericSupertype(type2, cls, declaringClassOf);
            if (genericSupertype instanceof ParameterizedType) {
                return ((ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(declaringClassOf.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static WildcardType subtypeOf(Type type2) {
        return new WildcardTypeImpl(type2 instanceof WildcardType ? ((WildcardType) type2).getUpperBounds() : new Type[]{type2}, EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type2) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type2 instanceof WildcardType ? ((WildcardType) type2).getLowerBounds() : new Type[]{type2});
    }

    public static String typeToString(Type type2) {
        return type2 instanceof Class ? ((Class) type2).getName() : type2.toString();
    }

    public static Type resolve(Type type2, Class<?> cls, Type type3) {
        return resolve(type2, cls, type3, new HashMap());
    }
}
