package com.nimbusds.jose.shaded.gson.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public abstract class GsonTypes {
    public static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    public final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        public final Type componentType;

        public GenericArrayTypeImpl(Type type2) {
            Objects.requireNonNull(type2);
            this.componentType = GsonTypes.canonicalize(type2);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && GsonTypes.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            return GsonTypes.typeToString(this.componentType) + "[]";
        }
    }

    public final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        public final Type ownerType;
        public final Type rawType;
        public final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type2, Class cls, Type... typeArr) {
            Objects.requireNonNull(cls);
            if (type2 == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(cls, "Must specify owner type for "));
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

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && GsonTypes.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.rawType;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Type type2 = this.ownerType;
            return (type2 != null ? type2.hashCode() : 0) ^ hashCode;
        }

        public final String toString() {
            Type[] typeArr = this.typeArguments;
            int length = typeArr.length;
            Type type2 = this.rawType;
            if (length == 0) {
                return GsonTypes.typeToString(type2);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(GsonTypes.typeToString(type2));
            sb.append("<");
            sb.append(GsonTypes.typeToString(typeArr[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(GsonTypes.typeToString(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public final class WildcardTypeImpl implements WildcardType, Serializable {
        public final Type lowerBound;
        public final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            GsonTypes.checkArgument(typeArr2.length <= 1);
            GsonTypes.checkArgument(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                GsonTypes.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = GsonTypes.canonicalize(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            GsonTypes.checkNotPrimitive(typeArr2[0]);
            GsonTypes.checkArgument(typeArr[0] == Object.class);
            this.lowerBound = GsonTypes.canonicalize(typeArr2[0]);
            this.upperBound = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && GsonTypes.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type2 = this.lowerBound;
            return type2 != null ? new Type[]{type2} : GsonTypes.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public final int hashCode() {
            Type type2 = this.lowerBound;
            return (this.upperBound.hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
        }

        public final String toString() {
            Type type2 = this.lowerBound;
            if (type2 != null) {
                return "? super " + GsonTypes.typeToString(type2);
            }
            Type type3 = this.upperBound;
            if (type3 == Object.class) {
                return "?";
            }
            return "? extends " + GsonTypes.typeToString(type3);
        }
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

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
    }

    public static void checkNotPrimitive(Type type2) {
        checkArgument(((type2 instanceof Class) && ((Class) type2).isPrimitive()) ? false : true);
    }

    public static void checkNumberStringLength(String str) {
        if (str.length() <= 10000) {
            return;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("Number string too large: ", (Object) str.substring(0, 30), (Object) "...");
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
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
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

    public static void getFilterResult(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
    }

    public static Type getGenericSupertype(Type type2, Class cls, Class cls2) {
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
                Class<?> superclass = cls.getSuperclass();
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

    public static Class getRawType(Type type2) {
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type2).getRawType();
            checkArgument(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) getRawType(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
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

    public static BigDecimal parseBigDecimal(String str) {
        checkNumberStringLength(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[EDGE_INSN: B:24:0x013f->B:25:0x013f BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.nimbusds.jose.shaded.gson.internal.GsonTypes$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.nimbusds.jose.shaded.gson.internal.GsonTypes$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type resolve(Type type2, Class cls, Type type3, HashMap hashMap) {
        Type resolve;
        Type parameterizedTypeImpl;
        TypeVariable typeVariable = null;
        while (true) {
            int i = 0;
            if (type3 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type3;
                Type type4 = (Type) hashMap.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type4 != null) {
                    return type4 == cls2 ? type3 : type4;
                }
                hashMap.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 != null) {
                    Type genericSupertype = getGenericSupertype(type2, cls, cls3);
                    if (genericSupertype instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable2.equals(typeParameters[i])) {
                                type3 = ((ParameterizedType) genericSupertype).getActualTypeArguments()[i];
                                if (type3 != typeVariable2) {
                                    break;
                                }
                            } else {
                                i++;
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                }
                type3 = typeVariable2;
                if (type3 != typeVariable2) {
                }
            } else {
                if (type3 instanceof Class) {
                    Class cls4 = type3;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type resolve2 = resolve(type2, cls, componentType, hashMap);
                        if (Objects.equals(componentType, resolve2)) {
                            type3 = cls4;
                        } else {
                            parameterizedTypeImpl = new GenericArrayTypeImpl(resolve2);
                            type3 = parameterizedTypeImpl;
                        }
                    }
                }
                if (type3 instanceof GenericArrayType) {
                    type3 = (GenericArrayType) type3;
                    Type genericComponentType = type3.getGenericComponentType();
                    Type resolve3 = resolve(type2, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, resolve3)) {
                        parameterizedTypeImpl = new GenericArrayTypeImpl(resolve3);
                        type3 = parameterizedTypeImpl;
                    }
                } else if (type3 instanceof ParameterizedType) {
                    type3 = (ParameterizedType) type3;
                    Type ownerType = type3.getOwnerType();
                    Type resolve4 = resolve(type2, cls, ownerType, hashMap);
                    boolean equals = Objects.equals(resolve4, ownerType);
                    Type[] actualTypeArguments = type3.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z = false;
                    while (i < length2) {
                        Type resolve5 = resolve(type2, cls, typeArr[i], hashMap);
                        if (!Objects.equals(resolve5, typeArr[i])) {
                            if (!z) {
                                typeArr = (Type[]) typeArr.clone();
                                z = true;
                            }
                            typeArr[i] = resolve5;
                        }
                        i++;
                    }
                    if (!equals || z) {
                        parameterizedTypeImpl = new ParameterizedTypeImpl(resolve4, (Class) type3.getRawType(), typeArr);
                        type3 = parameterizedTypeImpl;
                    }
                } else if (type3 instanceof WildcardType) {
                    type3 = (WildcardType) type3;
                    Type[] lowerBounds = type3.getLowerBounds();
                    Type[] upperBounds = type3.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type resolve6 = resolve(type2, cls, lowerBounds[0], hashMap);
                        if (resolve6 != lowerBounds[0]) {
                            type3 = new WildcardTypeImpl(new Type[]{Object.class}, resolve6 instanceof WildcardType ? ((WildcardType) resolve6).getLowerBounds() : new Type[]{resolve6});
                        }
                    } else if (upperBounds.length == 1 && (resolve = resolve(type2, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type3 = new WildcardTypeImpl(resolve instanceof WildcardType ? ((WildcardType) resolve).getUpperBounds() : new Type[]{resolve}, EMPTY_TYPE_ARRAY);
                    }
                }
            }
        }
    }

    public static String typeToString(Type type2) {
        return type2 instanceof Class ? ((Class) type2).getName() : type2.toString();
    }

    public static Class wrap(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
