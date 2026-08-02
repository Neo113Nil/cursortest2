package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.platform.j;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class si91 {
    public static final Type[] a = new Type[0];

    public static final void a(boolean z, fid fidVar, int i) {
        long l;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1930856266);
        int i2 = (btsVar.a(z) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            if (z) {
                btsVar.e0(-126993986);
                l = ((el51) btsVar.m(gl51.a)).n();
                btsVar.t(false);
            } else {
                if (z) {
                    throw unr0.y(-126995667, btsVar, false);
                }
                btsVar.e0(-126992422);
                l = ((el51) btsVar.m(gl51.a)).l();
                btsVar.t(false);
            }
            dk91.a(2.0f, 390, 0, l, btsVar, m);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vxd(z, i, 5);
        }
    }

    public static final void b(String str, boolean z, boolean z2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(327122560);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16) | (btsVar.a(z2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = z || !z2;
            if (z3) {
                btsVar.e0(832173804);
                g(str, btsVar, i2 & 14);
                btsVar.t(false);
            } else {
                if (z3) {
                    throw unr0.y(832172575, btsVar, false);
                }
                btsVar.e0(832174770);
                f(str, btsVar, i2 & 14);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new u240(str, z, z2, i, 2);
        }
    }

    public static final void c(ibe ibeVar, yur yurVar, tls tlsVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1718880792);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(yurVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            String a2 = ibeVar.a.a();
            String str = ibeVar.b;
            efb0 efb0Var = ibeVar.c;
            dur durVar = (dur) btsVar.m(j.i);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            boolean k = btsVar.k(efb0Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                String str2 = efb0Var.a;
                int i3 = efb0Var.b;
                Q2 = f.j(new hoy0(str2, eja1.c(i3, i3), 4));
                btsVar.o0(Q2);
            }
            hoy0 hoy0Var = (hoy0) ((oz40) Q2).getValue();
            boolean z = (i2 & 896) == 256;
            Object Q3 = btsVar.Q();
            if (z || Q3 == o430Var) {
                Q3 = new gv40(10, tlsVar);
                btsVar.o0(Q3);
            }
            tls tlsVar2 = (tls) Q3;
            f530 b = gi91.b(ljs0.c(an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), 1.0f), yurVar);
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new ttm(9, oz40Var);
                btsVar.o0(Q4);
            }
            f530 f = ci91.f(b, (tls) Q4);
            a S = wwg.S(-970236436, true, new t240(22, efb0Var, oz40Var, a2), btsVar);
            a S2 = wwg.S(1165248751, true, new fj5(slsVar, str), btsVar);
            int i4 = 0;
            lkx lkxVar = new lkx(i4, 3, i4, HProv.PP_PASSWD_TERM);
            boolean e = btsVar.e(durVar);
            Object Q5 = btsVar.Q();
            if (e || Q5 == o430Var) {
                Q5 = new i4b0(7, durVar);
                btsVar.o0(Q5);
            }
            xjx xjxVar = new xjx(62, (tls) Q5);
            long j = ldc.l;
            dmh d = tlb1.d(0L, 0L, j, j, 0L, 0L, btsVar, 14155782, 2097055);
            btsVar = btsVar;
            tlb1.a(0, 806879232, 24960, 232888, btsVar, tlsVar2, S, null, S2, xjxVar, lkxVar, f, null, null, d, hoy0Var, null, null, false, false, true);
            a(((Boolean) oz40Var.getValue()).booleanValue(), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(ibeVar, yurVar, tlsVar, slsVar, i, 27);
        }
    }

    public static final void d(String str, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1139295874);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16);
        int i3 = 6;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar, null, cyk0.c(100.0f), 0L, 0L, null, false, null, null, null, wwg.S(-1996384405, true, new jk30(str, i3), btsVar), btsVar, (i2 >> 3) & 14, 4090);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 6, slsVar, str);
        }
    }

    public static final void e(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(966345609);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.f(str, an91.l(c530.a, 14.0f, 9.0f), ((el51) btsVar2.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | 24624, 0, 65512);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 14);
        }
    }

    public static final void f(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1737870249);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.e(str, an91.o(c530.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((el51) btsVar2.m(gl51.a)).o(), null, lzr.D, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | 24624, 0, 65512);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 15);
        }
    }

    public static final void g(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-78596380);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.f(str, null, ((el51) btsVar2.m(gl51.a)).o(), null, lzr.D, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 13);
        }
    }

    public static Type h(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new x3u(0, h(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new y3u(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new x3u(0, ((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new z3u(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 0);
    }

    public static void i(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            ny61.g("Primitive type is not allowed");
        }
    }

    public static final lum j() {
        return new lum(new txk(2), fyk.a, new lhj(18), gyk.a);
    }

    public static boolean k(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return k(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type l(Type type, Class cls, Class cls2) {
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
                    return l(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return l(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class m(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m(((WildcardType) type).getUpperBounds()[0]);
        }
        w511.l("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static Type n(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return o(type, cls, l(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
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
    /* JADX WARN: Type inference failed for: r12v3, types: [z3u] */
    /* JADX WARN: Type inference failed for: r12v4, types: [z3u] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type o(Type type, Class cls, Type type2, HashMap hashMap) {
        Type o;
        Type y3uVar;
        TypeVariable typeVariable = null;
        while (true) {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                hashMap.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 != null) {
                    Type l = l(type, cls, cls3);
                    if (l instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable2.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) l).getActualTypeArguments()[i];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            } else {
                                i++;
                            }
                        }
                        ny61.p();
                        return null;
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type o2 = o(type, cls, componentType, hashMap);
                        if (Objects.equals(componentType, o2)) {
                            type2 = cls4;
                        } else {
                            y3uVar = new x3u(0, o2);
                            type2 = y3uVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type o3 = o(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, o3)) {
                        y3uVar = new x3u(0, o3);
                        type2 = y3uVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type o4 = o(type, cls, ownerType, hashMap);
                    boolean equals = Objects.equals(o4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z = false;
                    while (i < length2) {
                        Type o5 = o(type, cls, typeArr[i], hashMap);
                        if (!Objects.equals(o5, typeArr[i])) {
                            if (!z) {
                                typeArr = (Type[]) typeArr.clone();
                                z = true;
                            }
                            typeArr[i] = o5;
                        }
                        i++;
                    }
                    if (!equals || z) {
                        y3uVar = new y3u(o4, (Class) type2.getRawType(), typeArr);
                        type2 = y3uVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type o6 = o(type, cls, lowerBounds[0], hashMap);
                        if (o6 != lowerBounds[0]) {
                            type2 = new z3u(new Type[]{Object.class}, o6 instanceof WildcardType ? ((WildcardType) o6).getLowerBounds() : new Type[]{o6}, 0);
                        }
                    } else if (upperBounds.length == 1 && (o = o(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type2 = new z3u(o instanceof WildcardType ? ((WildcardType) o).getUpperBounds() : new Type[]{o}, a, 0);
                    }
                }
            }
        }
    }

    public static void p(ViewLayer viewLayer, int i) {
        viewLayer.setOutlineAmbientShadowColor(i);
    }

    public static void q(ViewLayer viewLayer, int i) {
        viewLayer.setOutlineSpotShadowColor(i);
    }

    public static String r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
