package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class jf0 {
    public static final wn5 a = new wn5(new go5(2), 1478369917, false);
    public static final wn5 b = new wn5(new fo5(5), 962712158, false);
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final wn5 k;
    public static final wn5 l;
    public static final wn5 m;
    public static final lc8 n;
    public static final StringBuilder o;
    public static final Type[] p;

    static {
        new wn5(new fo5(6), 691643271, false);
        c = new wn5(new fo5(7), 292869702, false);
        new wn5(new fo5(8), -581826435, false);
        d = new wn5(new jo5(27), -1736810673, false);
        e = new wn5(new po5(26), 1422444081, false);
        f = new wn5(new wo5(23), -1169360537, false);
        g = new wn5(new wo5(24), 1265857791, false);
        h = new wn5(new po5(27), -619712512, false);
        i = new wn5(new wo5(25), -987627288, false);
        j = new wn5(new wo5(26), 1447591040, false);
        k = new wn5(new po5(28), 1785910579, false);
        l = new wn5(new wo5(27), -805894039, false);
        m = new wn5(new wo5(28), 1629324289, false);
        n = new lc8(6);
        o = new StringBuilder("launch_app");
        p = new Type[0];
    }

    public static final float A(int i2, int i3, float[] fArr, float[] fArr2) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static boolean B(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return B(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final pu0 C(pu0 pu0Var, ru0 ru0Var) {
        ru0Var.getClass();
        Boolean bool = ru0Var.a;
        return bool != null ? new pu0(ydr.a(bool), pu0Var.b, pu0Var.c, pu0Var.d) : pu0Var;
    }

    public static n60 D(List list) {
        list.getClass();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        HashSet hashSet7 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i4p i4pVar = (i4p) it.next();
            if (i4pVar instanceof f3p) {
                hashSet4.add(((f3p) i4pVar).b.a);
            } else if (i4pVar instanceof g3p) {
                hashSet.add(((g3p) i4pVar).b.a);
            } else if (i4pVar instanceof c4p) {
                hashSet3.add(((c4p) i4pVar).b.a);
            } else if (i4pVar instanceof b4p) {
                hashSet2.add(((b4p) i4pVar).b.e());
            } else if (i4pVar instanceof a4p) {
                hashSet4.add(((a4p) i4pVar).b.a);
            } else if (i4pVar instanceof f4p) {
                hashSet3.add(((f4p) i4pVar).b.a);
            } else if (i4pVar instanceof g4p) {
                hashSet5.add(((g4p) i4pVar).b.a.h());
            } else if (i4pVar instanceof h4p) {
                hashSet6.add(((h4p) i4pVar).b.a);
            } else if (i4pVar instanceof z3p) {
                hashSet7.add(((z3p) i4pVar).b.a.a);
            } else if (i4pVar instanceof u3p) {
                hashSet3.add(((u3p) i4pVar).b.a);
            } else if (i4pVar instanceof i3p) {
                hashSet.add(((i3p) i4pVar).b.a);
            } else if (i4pVar instanceof h3p) {
                hashSet4.add(((h3p) i4pVar).b.a);
            } else if (i4pVar instanceof o3p) {
                hashSet2.add(((o3p) i4pVar).b.f);
            } else if (!(i4pVar instanceof l3p) && !(i4pVar instanceof v3p)) {
                if (i4pVar instanceof x3p) {
                    hashSet5.add(((x3p) i4pVar).b.e);
                } else if (i4pVar instanceof r3p) {
                    hashSet4.add(((r3p) i4pVar).b.a);
                } else if (i4pVar instanceof p3p) {
                    hashSet4.add(((p3p) i4pVar).b.a);
                } else if (i4pVar instanceof m3p) {
                    hashSet4.add(((m3p) i4pVar).b.a);
                } else if (i4pVar instanceof j3p) {
                    continue;
                } else if (i4pVar instanceof q3p) {
                    hashSet3.add(((q3p) i4pVar).b.a);
                } else if (i4pVar instanceof k3p) {
                    hashSet3.add(((k3p) i4pVar).b.a);
                } else if (i4pVar instanceof n3p) {
                    continue;
                } else if (i4pVar instanceof w3p) {
                    hashSet6.add(((w3p) i4pVar).b.a);
                } else if (i4pVar instanceof t3p) {
                    continue;
                } else {
                    if (!(i4pVar instanceof d4p)) {
                        b6e.s();
                        return null;
                    }
                    hashSet5.add(CollectionsKt.X(((d4p) i4pVar).b.c, StringUtils.COMMA, null, null, null, 62));
                }
            }
        }
        return new n60(hashSet, hashSet2, hashSet3, hashSet4, hashSet5, hashSet6, hashSet7);
    }

    public static final o6g E(hq5 hq5Var) {
        Float valueOf = Float.valueOf(0.0f);
        agr agrVar = eq0.a;
        oq5 oq5Var = (oq5) hq5Var;
        long j2 = ((dq0) oq5Var.j(agrVar)).c.a;
        agr agrVar2 = pa5.a;
        return y9w.U(new Pair[]{new Pair(valueOf, new d85(d85.b(j2, !((ma5) oq5Var.j(agrVar2)).g() ? 0.88f : 0.96f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.8f), new d85(d85.b(((dq0) oq5Var.j(agrVar)).c.a, !((ma5) oq5Var.j(agrVar2)).g() ? 0.88f : 0.96f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(((dq0) oq5Var.j(agrVar)).c.a))}, 14);
    }

    public static final Object F(rj6 rj6Var) {
        rj6Var.getClass();
        if (rj6Var instanceof qj6) {
            return ((qj6) rj6Var).a;
        }
        if (rj6Var instanceof pj6) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static Type G(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return G(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
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
                    return G(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type H(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder q = k5r.q(i2, "Index ", " not in range [0,");
        q.append(actualTypeArguments.length);
        q.append(") for ");
        q.append(parameterizedType);
        throw new IllegalArgumentException(q.toString());
    }

    public static Class I(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            e7o.e();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) I(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return I(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        wvs.l(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type J(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return V(type, cls, G(type, cls, Map.class));
        }
        e7o.e();
        return null;
    }

    public static boolean K(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return K(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            wvs.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (K(type2)) {
                return true;
            }
        }
        return false;
    }

    public static ztd L(mt mtVar) {
        CoverPath coverPath;
        List list;
        oq oqVar = mtVar.a;
        String L = xp3.L(oqVar.n, c5b.a);
        String str = oqVar.i;
        List list2 = mtVar.b;
        c01 c01Var = (c01) CollectionsKt.l0(list2);
        String str2 = null;
        if (c01Var != null) {
            if (c01Var.c || ((list = c01Var.h) != null && !list.isEmpty())) {
                c01Var = null;
            }
            if (c01Var != null && (coverPath = c01Var.k) != null) {
                str2 = coverPath.getPathForSize(wct.s());
            }
        }
        List list3 = list2;
        boolean z = true;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((c01) it.next()).c) {
                    z = false;
                    break;
                }
            }
        }
        return new ztd(L, str2, str, z);
    }

    public static boolean M(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static void N(String str, String str2) {
        ssg.a(3, "lifecycle", ouj.o(str, ": ", str2), null);
        String m2 = k5r.m(str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2, "←");
        StringBuilder sb = o;
        sb.insert(0, m2);
        int length = sb.length();
        if (length > 1024) {
            length = 1024;
        }
        sb.setLength(length);
        bow.z("navigation", sb.toString());
    }

    public static final void O(View view) {
        view.setEnabled(false);
        view.setClickable(false);
        view.setFocusable(true);
        view.setFocusableInTouchMode(false);
        view.setImportantForAccessibility(1);
        view.setAccessibilityLiveRegion(0);
        if (view instanceof ViewGroup) {
            c7 c7Var = new c7(8, (ViewGroup) view);
            while (c7Var.hasNext()) {
                O((View) c7Var.next());
            }
        }
    }

    public static IllegalArgumentException P(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder m2 = tlm.m(String.format(str, objArr), "\n    for method ");
        m2.append(method.getDeclaringClass().getSimpleName());
        m2.append(".");
        m2.append(method.getName());
        return new IllegalArgumentException(m2.toString(), exc);
    }

    public static final rj6 Q(rj6 rj6Var, Object obj) {
        obj.getClass();
        return rj6Var instanceof nj6 ? new qj6(obj) : rj6Var;
    }

    public static IllegalArgumentException R(Method method, int i2, String str, Object... objArr) {
        StringBuilder m2 = tlm.m(str, " (parameter #");
        m2.append(i2 + 1);
        m2.append(")");
        return P(method, null, m2.toString(), objArr);
    }

    public static IllegalArgumentException S(Method method, Exception exc, int i2, String str, Object... objArr) {
        StringBuilder m2 = tlm.m(str, " (parameter #");
        m2.append(i2 + 1);
        m2.append(")");
        return P(method, exc, m2.toString(), objArr);
    }

    public static final void T(float[] fArr, float[] fArr2) {
        float A = A(0, 0, fArr2, fArr);
        float A2 = A(0, 1, fArr2, fArr);
        float A3 = A(0, 2, fArr2, fArr);
        float A4 = A(0, 3, fArr2, fArr);
        float A5 = A(1, 0, fArr2, fArr);
        float A6 = A(1, 1, fArr2, fArr);
        float A7 = A(1, 2, fArr2, fArr);
        float A8 = A(1, 3, fArr2, fArr);
        float A9 = A(2, 0, fArr2, fArr);
        float A10 = A(2, 1, fArr2, fArr);
        float A11 = A(2, 2, fArr2, fArr);
        float A12 = A(2, 3, fArr2, fArr);
        float A13 = A(3, 0, fArr2, fArr);
        float A14 = A(3, 1, fArr2, fArr);
        float A15 = A(3, 2, fArr2, fArr);
        float A16 = A(3, 3, fArr2, fArr);
        fArr[0] = A;
        fArr[1] = A2;
        fArr[2] = A3;
        fArr[3] = A4;
        fArr[4] = A5;
        fArr[5] = A6;
        fArr[6] = A7;
        fArr[7] = A8;
        fArr[8] = A9;
        fArr[9] = A10;
        fArr[10] = A11;
        fArr[11] = A12;
        fArr[12] = A13;
        fArr[13] = A14;
        fArr[14] = A15;
        fArr[15] = A16;
    }

    public static boolean U(nen nenVar, nen nenVar2) {
        int i2;
        if (nenVar.a.a.length == nenVar2.a.a.length) {
            vu1[] u = nenVar.u();
            vu1[] u2 = nenVar2.u();
            if (u.length == u2.length) {
                for (0; i2 != u.length; i2 + 1) {
                    vu1 vu1Var = u[i2];
                    vu1 vu1Var2 = u2[i2];
                    i2 = (vu1Var == vu1Var2 || (vu1Var != null && vu1Var2 != null && vu1Var.a.x(vu1Var2.a) && xp3.r(vu1Var.b).equals(xp3.r(vu1Var2.b)))) ? i2 + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[LOOP:0: B:1:0x0000->B:18:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type V(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i2 = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type V = V(type, cls, componentType);
                        return componentType == V ? cls2 : new jvt(V);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type V2 = V(type, cls, genericComponentType);
                    return genericComponentType == V2 ? genericArrayType : new jvt(V2);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type V3 = V(type, cls, ownerType);
                    boolean z = V3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i2 < length) {
                        Type V4 = V(type, cls, actualTypeArguments[i2]);
                        if (V4 != actualTypeArguments[i2]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i2] = V4;
                        }
                        i2++;
                    }
                    return z ? new kvt(V3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type V5 = V(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (V5 != lowerBounds[0]) {
                            return new lvt(new Type[]{Object.class}, new Type[]{V5});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type V6 = V(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (V6 != upperBounds[0]) {
                                return new lvt(new Type[]{V6}, p);
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
                Type G = G(type, cls, cls3);
                if (G instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i2 < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i2])) {
                            type3 = ((ParameterizedType) G).getActualTypeArguments()[i2];
                            if (type3 != typeVariable) {
                                return type3;
                            }
                            type4 = type3;
                        } else {
                            i2++;
                        }
                    }
                    wvs.n();
                    return null;
                }
            }
            type3 = typeVariable;
            if (type3 != typeVariable) {
            }
        }
    }

    public static final aqe W(ynn ynnVar) {
        return new aqe(Math.round(ynnVar.a), Math.round(ynnVar.b), Math.round(ynnVar.c), Math.round(ynnVar.d));
    }

    public static void X(qne qneVar, float f2) {
        kgo kgoVar = (kgo) qneVar.a;
        CardView cardView = (CardView) qneVar.b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != kgoVar.e || kgoVar.f != useCompatPadding || kgoVar.g != preventCornerOverlap) {
            kgoVar.e = f2;
            kgoVar.f = useCompatPadding;
            kgoVar.g = preventCornerOverlap;
            kgoVar.b(null);
            kgoVar.invalidateSelf();
        }
        e0(qneVar);
    }

    public static s0 Y(n0 n0Var, String str) {
        if (str.length() != 0 && str.charAt(0) == '#') {
            try {
                int length = (str.length() - 1) / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 != length; i2++) {
                    int i3 = i2 * 2;
                    char charAt = str.charAt(i3 + 1);
                    bArr[i2] = (byte) (xp3.y(str.charAt(i3 + 2)) | (xp3.y(charAt) << 4));
                }
                return s0.y(bArr);
            } catch (IOException unused) {
                throw new q0("can't recode value for oid " + n0Var.a, 0);
            }
        }
        if (str.length() != 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (n0Var.x(zh2.y) || n0Var.x(zh2.z)) {
            return new xz6(str);
        }
        if (n0Var.x(zh2.w)) {
            return new h0(str);
        }
        if (n0Var.x(zh2.s) || n0Var.x(zh2.u) || n0Var.x(zh2.v) || n0Var.x(zh2.x)) {
            return new c07(str);
        }
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fxf.b0(charArray, byteArrayOutputStream);
            return new g07(byteArrayOutputStream.toByteArray());
        } catch (IOException unused2) {
            xq0.q("cannot encode string to byte array!");
            return null;
        }
    }

    public static void Z(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(qzm[] qzmVarArr, pu0 pu0Var, boolean z, Function2 function2, hq5 hq5Var, int i2, int i3) {
        int i4;
        aqi O;
        boolean booleanValue;
        boolean z2;
        pu0 pu0Var2;
        boolean z3;
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1224581693);
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = i2 | 48;
        } else if ((i2 & 48) == 0) {
            i4 = (oq5Var.f(pu0Var) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && oq5Var.g(z)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function2) ? 2048 : 1024;
        }
        oq5Var.W(-1967243, Integer.valueOf(qzmVarArr.length));
        int i6 = i4 | (oq5Var.d(qzmVarArr.length) ? 4 : 0);
        for (qzm qzmVar : qzmVarArr) {
            i6 |= (i2 & 8) == 0 ? oq5Var.f(qzmVar) : oq5Var.h(qzmVar) ? 4 : 0;
        }
        oq5Var.p(false);
        if ((i6 & 14) == 0) {
            i6 |= 2;
        }
        if ((i6 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            z3 = z;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                if (i5 != 0) {
                    pu0Var = null;
                }
                if ((i3 & 4) != 0) {
                    vdr vdrVar = pu0Var != null ? pu0Var.a : null;
                    if (vdrVar == null) {
                        oq5Var.Z(-60840351);
                        oq5Var.p(false);
                        O = null;
                    } else {
                        oq5Var.Z(-1962592);
                        O = gld.O(vdrVar, oq5Var);
                        oq5Var.p(false);
                    }
                    Boolean bool = O != null ? (Boolean) O.getValue() : null;
                    if (bool == null) {
                        oq5Var.Z(-1961047);
                        booleanValue = !((ma5) oq5Var.j(pa5.a)).g();
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1963372);
                        oq5Var.p(false);
                        booleanValue = bool.booleanValue();
                    }
                    i6 &= -897;
                    z2 = booleanValue;
                    oq5Var.q();
                    if (pu0Var != null) {
                        oq5Var.Z(-1957814);
                        pu0Var2 = (pu0) oq5Var.j(qu0.a);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1958899);
                        oq5Var.p(false);
                        pu0Var2 = pu0Var;
                    }
                    pz0 pz0Var = new pz0(3);
                    pz0Var.c(pu0Var2.d.invoke(oq5Var, 0));
                    pz0Var.c(qzmVarArr);
                    pz0Var.b(qu0.a.a(pu0Var2));
                    ArrayList arrayList = pz0Var.a;
                    qzm[] qzmVarArr2 = (qzm[]) arrayList.toArray(new qzm[arrayList.size()]);
                    agr agrVar = koe.a;
                    g(qzmVarArr2, z2, !((Boolean) oq5Var.j(agrVar)).booleanValue() ? new gmr(1) : pu0Var2.b, !((Boolean) oq5Var.j(agrVar)).booleanValue() ? imr.a : pu0Var2.c, function2, oq5Var, ((i6 >> 3) & 112) | 8 | ((i6 << 3) & 57344));
                    z3 = z2;
                }
            } else {
                oq5Var.S();
                if ((i3 & 4) != 0) {
                    i6 &= -897;
                }
            }
            z2 = z;
            oq5Var.q();
            if (pu0Var != null) {
            }
            pz0 pz0Var2 = new pz0(3);
            pz0Var2.c(pu0Var2.d.invoke(oq5Var, 0));
            pz0Var2.c(qzmVarArr);
            pz0Var2.b(qu0.a.a(pu0Var2));
            ArrayList arrayList2 = pz0Var2.a;
            qzm[] qzmVarArr22 = (qzm[]) arrayList2.toArray(new qzm[arrayList2.size()]);
            agr agrVar2 = koe.a;
            g(qzmVarArr22, z2, !((Boolean) oq5Var.j(agrVar2)).booleanValue() ? new gmr(1) : pu0Var2.b, !((Boolean) oq5Var.j(agrVar2)).booleanValue() ? imr.a : pu0Var2.c, function2, oq5Var, ((i6 >> 3) & 112) | 8 | ((i6 << 3) & 57344));
            z3 = z2;
        }
        pu0 pu0Var3 = pu0Var;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu0(qzmVarArr, pu0Var3, z3, function2, i2, i3, 0);
        }
    }

    public static final String a0(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f3 = f2 * pow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function0 function0, jd1 jd1Var, yci yciVar, Function2 function2, e9g e9gVar, Function0 function02, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        yci yciVar2;
        Function2 function22;
        e9g e9gVar2;
        xmn r;
        function0.getClass();
        jd1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-305761682);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? oq5Var.f(jd1Var) : oq5Var.h(jd1Var) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i6 = i4 | 3072;
        int i7 = i3 & 16;
        if (i7 != 0) {
            i6 = i4 | 27648;
        } else if ((i2 & 24576) == 0) {
            i6 |= oq5Var.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i6 |= 196608;
        } else if ((196608 & i2) == 0) {
            function03 = function02;
            i6 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i6) == 74898 || !oq5Var.z()) {
                yci yciVar3 = i5 == 0 ? vci.a : yciVar;
                int i9 = i6;
                wn5 wn5Var = etn.f;
                e9g e9gVar3 = i7 == 0 ? e9g.a : e9gVar;
                if (i8 != 0) {
                    function03 = null;
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                int i10 = i9 << 6;
                c(function0, jd1Var, nu0.j(), nu0.i(), yciVar3, wn5Var, e9gVar3, function03, oq5Var, (i10 & 29360128) | (i9 & 126) | (57344 & i10) | (458752 & i10) | (3670016 & i10), 0);
                yciVar2 = yciVar3;
                function22 = wn5Var;
                e9gVar2 = e9gVar3;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
                function22 = function2;
                e9gVar2 = e9gVar;
            }
            Function0 function04 = function03;
            r = oq5Var.r();
            if (r == null) {
                r.d = new fd1(function0, jd1Var, yciVar2, function22, e9gVar2, function04, i2, i3);
                return;
            }
            return;
        }
        function03 = function02;
        if ((74899 & i6) == 74898) {
        }
        if (i5 == 0) {
        }
        int i92 = i6;
        wn5 wn5Var2 = etn.f;
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        h6g h6gVar3 = nu0.a;
        h6g h6gVar22 = h6g.c;
        int i102 = i92 << 6;
        c(function0, jd1Var, nu0.j(), nu0.i(), yciVar3, wn5Var2, e9gVar3, function03, oq5Var, (i102 & 29360128) | (i92 & 126) | (57344 & i102) | (458752 & i102) | (3670016 & i102), 0);
        yciVar2 = yciVar3;
        function22 = wn5Var2;
        e9gVar2 = e9gVar3;
        Function0 function042 = function03;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final o43 b0(BlockActionDto blockActionDto) {
        String deeplink = blockActionDto.getDeeplink();
        if (deeplink == null || StringsKt.U(deeplink)) {
            return null;
        }
        return new o43(blockActionDto.getDeeplink(), blockActionDto.getWeblink());
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Function0 function0, jd1 jd1Var, ges gesVar, ges gesVar2, yci yciVar, wn5 wn5Var, e9g e9gVar, Function0 function02, hq5 hq5Var, int i2, int i3) {
        int i4;
        wn5 wn5Var2;
        Function0 function03;
        oq5 oq5Var;
        xmn r;
        function0.getClass();
        jd1Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2019925538);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? oq5Var2.f(jd1Var) : oq5Var2.h(jd1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.f(gesVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var2.f(gesVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            wn5Var2 = wn5Var;
            i4 |= oq5Var2.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            wn5Var2 = wn5Var;
        }
        if ((1572864 & i2) == 0) {
            i4 |= oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 1048576 : 524288;
        }
        int i5 = i3 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i2) == 0) {
            function03 = function02;
            i4 |= oq5Var2.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            if ((4793491 & i4) == 4793490 || !oq5Var2.z()) {
                Function0 function04 = i5 == 0 ? null : function03;
                oq5Var = oq5Var2;
                ngg.i(function0, a.a(yciVar, "artist_list_item"), ild.C(903162972, new a3(15, jd1Var, e9gVar), oq5Var2), false, 0L, function04, wn5Var2, 0.0f, null, ild.C(1763490531, new x3(24, jd1Var, gesVar, gesVar2), oq5Var2), oq5Var, (i4 & 14) | 805306752 | (458752 & (i4 >> 6)) | ((i4 << 3) & 3670016), 408);
                function03 = function04;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new gd1(function0, jd1Var, gesVar, gesVar2, yciVar, wn5Var, e9gVar, function03, i2, i3);
                return;
            }
            return;
        }
        function03 = function02;
        if ((4793491 & i4) == 4793490) {
        }
        if (i5 == 0) {
        }
        oq5Var = oq5Var2;
        ngg.i(function0, a.a(yciVar, "artist_list_item"), ild.C(903162972, new a3(15, jd1Var, e9gVar), oq5Var2), false, 0L, function04, wn5Var2, 0.0f, null, ild.C(1763490531, new x3(24, jd1Var, gesVar, gesVar2), oq5Var2), oq5Var, (i4 & 14) | 805306752 | (458752 & (i4 >> 6)) | ((i4 << 3) & 3670016), 408);
        function03 = function04;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final long c0(long j2) {
        p85 b0 = pd.b0(j2);
        float f2 = b0.b * 2.5f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return p85.a(b0, f2, 0.85f, 9).b();
    }

    public static final void d(int i2, hq5 hq5Var, e9g e9gVar, yci yciVar, Function2 function2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-959618237);
        if (((i2 | 3072) & 74899) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            qo6 qo6Var = qo6.a;
            vci vciVar = vci.a;
            c9g.f(14380470, oq5Var, e9gVar, vciVar, function2);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(yciVar2, e9gVar, function2, i2, 23);
        }
    }

    public static String d0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final boolean z, yci yciVar, e9g e9gVar, boolean z2, boolean z3, Function2 function2, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        final yci yciVar2;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        final boolean z6;
        final e9g e9gVar2;
        final boolean z7;
        final Function2 function22;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(255822841);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= oq5Var.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z4 = z2;
                i4 |= oq5Var.g(z4) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    z5 = z3;
                    i4 |= oq5Var.g(z5) ? 16384 : RemoteCameraConfig.Notification.ID;
                    i8 = i4 | 196608;
                    if ((74899 & i8) == 74898 || !oq5Var.z()) {
                        yci yciVar3 = i9 == 0 ? vci.a : yciVar2;
                        e9g e9gVar3 = i5 == 0 ? e9g.a : e9gVar;
                        boolean z8 = i6 == 0 ? false : z4;
                        boolean z9 = i7 == 0 ? false : z5;
                        wn5 wn5Var = etn.g;
                        int i10 = i8 << 3;
                        c9g.g(z, qo6.d, z9, e9gVar3, yciVar3, z8, wn5Var, oq5Var, ((i8 << 6) & 458752) | (i8 & 14) | 48 | ((i8 >> 6) & 896) | (i10 & 7168) | ((i8 << 9) & 57344) | (3670016 & i10), 0);
                        z6 = z9;
                        e9gVar2 = e9gVar3;
                        yciVar2 = yciVar3;
                        z7 = z8;
                        function22 = wn5Var;
                    } else {
                        oq5Var.S();
                        e9gVar2 = e9gVar;
                        function22 = function2;
                        z7 = z4;
                        z6 = z5;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new Function2() { // from class: hd1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jf0.e(z, yciVar2, e9gVar2, z7, z6, function22, (hq5) obj, rvf.R(i2 | 1), i3);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z5 = z3;
                i8 = i4 | 196608;
                if ((74899 & i8) == 74898) {
                }
                if (i9 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                wn5 wn5Var2 = etn.g;
                int i102 = i8 << 3;
                c9g.g(z, qo6.d, z9, e9gVar3, yciVar3, z8, wn5Var2, oq5Var, ((i8 << 6) & 458752) | (i8 & 14) | 48 | ((i8 >> 6) & 896) | (i102 & 7168) | ((i8 << 9) & 57344) | (3670016 & i102), 0);
                z6 = z9;
                e9gVar2 = e9gVar3;
                yciVar2 = yciVar3;
                z7 = z8;
                function22 = wn5Var2;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            z4 = z2;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            z5 = z3;
            i8 = i4 | 196608;
            if ((74899 & i8) == 74898) {
            }
            if (i9 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            wn5 wn5Var22 = etn.g;
            int i1022 = i8 << 3;
            c9g.g(z, qo6.d, z9, e9gVar3, yciVar3, z8, wn5Var22, oq5Var, ((i8 << 6) & 458752) | (i8 & 14) | 48 | ((i8 >> 6) & 896) | (i1022 & 7168) | ((i8 << 9) & 57344) | (3670016 & i1022), 0);
            z6 = z9;
            e9gVar2 = e9gVar3;
            yciVar2 = yciVar3;
            z7 = z8;
            function22 = wn5Var22;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        z4 = z2;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z5 = z3;
        i8 = i4 | 196608;
        if ((74899 & i8) == 74898) {
        }
        if (i9 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        wn5 wn5Var222 = etn.g;
        int i10222 = i8 << 3;
        c9g.g(z, qo6.d, z9, e9gVar3, yciVar3, z8, wn5Var222, oq5Var, ((i8 << 6) & 458752) | (i8 & 14) | 48 | ((i8 >> 6) & 896) | (i10222 & 7168) | ((i8 << 9) & 57344) | (3670016 & i10222), 0);
        z6 = z9;
        e9gVar2 = e9gVar3;
        yciVar2 = yciVar3;
        z7 = z8;
        function22 = wn5Var222;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static void e0(qne qneVar) {
        float f2;
        float f3;
        CardView cardView = (CardView) qneVar.b;
        if (!cardView.getUseCompatPadding()) {
            qneVar.z(0, 0, 0, 0);
            return;
        }
        kgo kgoVar = (kgo) qneVar.a;
        float f4 = kgoVar.e;
        float f5 = kgoVar.a;
        if (cardView.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - lgo.a) * f5) + f4);
        } else {
            int i2 = lgo.b;
            f2 = f4;
        }
        int ceil = (int) Math.ceil(f2);
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - lgo.a) * f5) + (f4 * 1.5f));
        } else {
            f3 = f4 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f3);
        qneVar.z(ceil, ceil2, ceil, ceil2);
    }

    public static final void f(int i2, long j2, hq5 hq5Var, yci yciVar, List list) {
        yci yciVar2;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1138733501);
        int i3 = i2 | (oq5Var.e(j2) ? 4 : 2) | (oq5Var.h(list) ? 32 : 16) | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.a0(-2115993395);
            iag iagVar = (iag) oq5Var.j(r8g.a);
            oq5Var.p(false);
            if (!iagVar.P) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new ok2(j2, list, i2, 0);
                    return;
                }
                return;
            }
            List<tk2> list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            for (tk2 tk2Var : list2) {
                arrayList.add(new jod(Long.valueOf(tk2Var.b), tk2Var.a));
            }
            oq5Var.a0(-483455358);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            vci vciVar = vci.a;
            wn5 A = ghh.A(vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            h4a.m(0, 6, oq5Var, null, rvf.M(R.string.bandwidthLabel, oq5Var), false);
            oq5Var.a0(118080530);
            h95 h95Var = (h95) oq5Var.j(bfs.a);
            oq5Var.p(false);
            y5g.a(arrayList, j2, h95Var.e, d.e(d.d(vciVar, 1.0f), dpd.a), null, vut.I(oq5Var).Q, vut.I(oq5Var).R, Integer.valueOf(R.string.bandwidthMinValue), vut.I(oq5Var).S, vut.I(oq5Var).T, Integer.valueOf(R.string.bandwidthMaxValue), vut.I(oq5Var).U, vut.I(oq5Var).V, Integer.valueOf(R.string.bandwidthLastValue), rq1.y, oq5Var, ((i3 << 3) & 112) | 24960);
            oq5Var = oq5Var;
            k5r.s(oq5Var, false, true, false, false);
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new pk2(i2, 0, j2, yciVar2, list);
        }
    }

    public static o1u f0(String str, String str2, qo6 qo6Var, String str3, String str4, String str5, String str6) {
        String str7;
        enu enuVar;
        str.getClass();
        if (str3 != null) {
            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
            webPath$Storage.getClass();
            str7 = etn.B(str3, webPath$Storage).getPathForSize(frv.b());
        } else {
            str7 = null;
        }
        String str8 = str7;
        String I = neg.I(str4);
        if (str5 != null) {
            int hashCode = str5.hashCode();
            if (hashCode != -2032180703) {
                if (hashCode != 68795) {
                    if (hashCode == 79219778 && str5.equals("START")) {
                        enuVar = enu.b;
                    }
                } else if (str5.equals("END")) {
                    enuVar = enu.c;
                }
            } else if (str5.equals("DEFAULT")) {
                enuVar = enu.a;
            }
            return new o1u(str, str2, str8, I, qo6Var, enuVar, str6);
        }
        enuVar = enu.a;
        return new o1u(str, str2, str8, I, qo6Var, enuVar, str6);
    }

    public static final void g(qzm[] qzmVarArr, boolean z, cce cceVar, q8r q8rVar, Function2 function2, hq5 hq5Var, int i2) {
        dq0 dq0Var;
        ma5 ma5Var;
        qzmVarArr.getClass();
        cceVar.getClass();
        q8rVar.getClass();
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1922252657);
        int i3 = (i2 & 48) == 0 ? (oq5Var.g(z) ? 32 : 16) | i2 : i2;
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(cceVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(q8rVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        oq5Var.W(448866915, Integer.valueOf(qzmVarArr.length));
        int i4 = i3 | (oq5Var.d(qzmVarArr.length) ? 4 : 0);
        for (qzm qzmVar : qzmVarArr) {
            i4 |= (i2 & 8) == 0 ? oq5Var.f(qzmVar) : oq5Var.h(qzmVar) ? 4 : 0;
        }
        oq5Var.p(false);
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (z) {
                oq5Var.Z(-954934868);
                dq0Var = ksw.y;
                if (dq0Var == null) {
                    oq5Var.Z(661934046);
                    dq0Var = ksw.E(true, oq5Var);
                    ksw.y = dq0Var;
                } else {
                    oq5Var.Z(661932310);
                }
                oq5Var.p(false);
                oq5Var.p(false);
            } else {
                if (z) {
                    throw vz1.i(oq5Var, 661931160, false);
                }
                oq5Var.Z(-954827639);
                dq0Var = ksw.x;
                if (dq0Var == null) {
                    oq5Var.Z(661937567);
                    dq0Var = ksw.E(false, oq5Var);
                    ksw.x = dq0Var;
                } else {
                    oq5Var.Z(661935769);
                }
                oq5Var.p(false);
                oq5Var.p(false);
            }
            dq0 dq0Var2 = dq0Var;
            if (z) {
                oq5Var.Z(-1873560550);
                ma5Var = avf.b;
                if (ma5Var == null) {
                    oq5Var.Z(1186490443);
                    ma5Var = avf.C(true, oq5Var);
                    avf.b = ma5Var;
                } else {
                    oq5Var.Z(1186488552);
                }
                oq5Var.p(false);
                oq5Var.p(false);
            } else {
                if (z) {
                    throw vz1.i(oq5Var, 1186487407, false);
                }
                oq5Var.Z(-1873448361);
                ma5 ma5Var2 = avf.a;
                if (ma5Var2 == null) {
                    oq5Var.Z(1186494124);
                    ma5Var2 = avf.C(false, oq5Var);
                    avf.a = ma5Var2;
                } else {
                    oq5Var.Z(1186492171);
                }
                oq5Var.p(false);
                ma5Var = ma5Var2;
                oq5Var.p(false);
            }
            ma5 ma5Var3 = ma5Var;
            pz0 pz0Var = new pz0(2);
            pz0Var.c(qzmVarArr);
            pz0Var.b(zc4.v(dq0Var2.c.c));
            ArrayList arrayList = pz0Var.a;
            int i5 = i4 << 3;
            xv.f((qzm[]) arrayList.toArray(new qzm[arrayList.size()]), dq0Var2, ma5Var3, cceVar, q8rVar, function2, oq5Var, (i5 & 7168) | 8 | (57344 & i5) | (i5 & 458752));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(qzmVarArr, z, cceVar, q8rVar, function2, i2, 0);
        }
    }

    public static long g0(long j2, Float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = null;
        }
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        p85 b0 = pd.b0(j2);
        int i3 = d85.o;
        return mvt.z(b0.a, b0.b, yhn.c(f2 != null ? f2.floatValue() : b0.c, 0.0f, f3), 0.0f, 24);
    }

    public static void h(vuf vufVar, fvf fvfVar, o0k o0kVar) {
        float f2 = edo.a;
        vufVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        vuf.Y(vufVar, "bottom_empty_space", new wn5(new oe3(vci.a, fvfVar, o0kVar), -487688892, true), 2);
    }

    public static final void i(ukd ukdVar, b95 b95Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-525156579);
        if ((((oq5Var.f(ukdVar) ? 4 : 2) | i2 | (oq5Var.f(b95Var) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            int i3 = tl4.a;
            oq5Var.a0(-1115894518);
            oq5Var.a0(1886828752);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            int i4 = 0;
            if (oq5Var.O) {
                oq5Var.k(new b8w(i4, 9));
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, ukdVar, af0.Y);
            g0g.U(oq5Var, b95Var, af0.Z);
            oq5Var.p(true);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s30(ukdVar, b95Var, i2, 13);
        }
    }

    public static final void j(yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1620116037);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ges j2 = nu0.j();
            float p2 = w1g.p(nu0.j(), 0, oq5Var, 0, 2) + w1g.p(nu0.d(), 0, oq5Var, 0, 2) + w1g.p(j2, 0, oq5Var, 0, 2) + 12;
            vci vciVar = vci.a;
            ivf.k(i4 & 14, 0, oq5Var, xp3.u(androidx.compose.foundation.layout.a.d(d.e(vciVar, p2), 0.82f), o5g.F(oq5Var)), true);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i2, 5);
        }
    }

    public static final void k(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        o0k n2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(476099321);
        if ((((oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci a2 = b.a.a(vci.a, b2c.c);
            if (irv.g(oq5Var)) {
                oq5Var.Z(-96058910);
                oq5Var.p(false);
                n2 = androidx.compose.foundation.layout.a.c(0.0f, 100, 0.0f, 0.0f, 13);
            } else {
                oq5Var.Z(-95957478);
                WeakHashMap weakHashMap = rqv.w;
                n2 = p6g.n(z7l.h(oq5Var).f, oq5Var);
                oq5Var.p(false);
            }
            wdp.S(ild.C(-1702061318, new xu0(8, z), oq5Var), a2, null, n2, null, null, null, null, ild.C(378438955, new fp5(3), oq5Var), null, false, 110, 16, 0.0f, oq5Var, 100687878, 3456, 20196);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z, yciVar, i2, 7);
        }
    }

    public static final void l(int i2, hq5 hq5Var, yci yciVar, String str, String str2) {
        String str3;
        oq5 oq5Var;
        oq5 oq5Var2;
        boolean z;
        vci vciVar;
        str.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(864718138);
        int i3 = i2 | (oq5Var3.f(str) ? 4 : 2) | (oq5Var3.f(str2) ? 256 : 128);
        if (oq5Var3.P(i3 & 1, (i3 & 147) != 146)) {
            float f2 = 16;
            yci p2 = androidx.compose.foundation.layout.a.p(d.d(yciVar, 1.0f), f2, 24, f2, f2);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var3, 48);
            int i4 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H = vnj.H(oq5Var3, p2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a2, wp5.f);
            g0g.U(oq5Var3, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var3, i4, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            vci vciVar2 = vci.a;
            if (str2 == null || StringsKt.U(str2)) {
                oq5Var2 = oq5Var3;
                z = false;
                vciVar = vciVar2;
                oq5Var2.Z(812413278);
            } else {
                oq5Var3.Z(813985970);
                ges c2 = nu0.c();
                long j2 = ((dq0) oq5Var3.j(eq0.a)).b.a;
                yci a3 = a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 0.0f, f2, 7), "overview_title");
                Object K = oq5Var3.K();
                if (K == gq5.a) {
                    K = new dcb(19);
                    oq5Var3.k0(K);
                }
                z = false;
                vciVar = vciVar2;
                xcs.b(str2, nfp.a(a3, (Function1) K), j2, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 5, 0, null, c2, oq5Var3, (i3 >> 6) & 14, 3120, 54776);
                oq5Var2 = oq5Var3;
            }
            oq5Var2.p(z);
            oq5 oq5Var4 = oq5Var2;
            str3 = str2;
            xv7.i(f8g.J(str, oq5Var2), a.a(d.d(vciVar, 1.0f), "overview_message"), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 0, 0, null, null, nu0.j(), null, null, oq5Var4, 48, 48, 915448);
            oq5Var = oq5Var4;
            WeakHashMap weakHashMap = rqv.w;
            u1g.l(oq5Var, d.e(vciVar, p6g.n(z7l.h(oq5Var).e, oq5Var).a()));
            oq5Var.p(true);
        } else {
            str3 = str2;
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cw5(str, yciVar, str3, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(final nii niiVar, final int i2, final int i3, final int i4, final wn5 wn5Var, final yci yciVar, o0k o0kVar, float f2, float f3, hq5 hq5Var, final int i5, final int i6) {
        int i7;
        o0k o0kVar2;
        int i8;
        final float f4;
        int i9;
        float f5;
        int i10;
        final float f6;
        final o0k o0kVar3;
        xmn r;
        niiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-822244117);
        if ((i5 & 6) == 0) {
            i7 = (oq5Var.f(niiVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= oq5Var.d(i3) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= oq5Var.d(i4) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i5) == 0) {
            i7 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i11 = i6 & 32;
        if (i11 != 0) {
            i7 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i5) == 0) {
            o0kVar2 = o0kVar;
            i7 |= oq5Var.f(o0kVar2) ? 1048576 : 524288;
            i8 = i6 & 64;
            if (i8 == 0) {
                i7 |= 12582912;
            } else if ((12582912 & i5) == 0) {
                f4 = f2;
                i7 |= oq5Var.c(f4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                i9 = i6 & 128;
                if (i9 != 0) {
                    i7 |= 100663296;
                } else if ((100663296 & i5) == 0) {
                    f5 = f3;
                    i7 |= oq5Var.c(f5) ? 67108864 : 33554432;
                    i10 = i7 | 805306368;
                    if ((i10 & 306783379) == 306783378 || !oq5Var.z()) {
                        o0k o0kVar4 = i11 == 0 ? i3e.b : o0kVar2;
                        float f7 = i8 == 0 ? 0 : f4;
                        float f8 = i9 == 0 ? 48 : f5;
                        int i12 = (i10 >> 3) & 1022;
                        int i13 = i10 >> 15;
                        niiVar.a(i2, i3, i4, f8, yciVar, o0kVar4, f7, wn5Var, oq5Var, i12 | (i13 & 7168) | (i13 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | ((i10 << 12) & 234881024) | ((i10 << 27) & 1879048192));
                        f6 = f8;
                        o0kVar3 = o0kVar4;
                        f4 = f7;
                    } else {
                        oq5Var.S();
                        o0kVar3 = o0kVar2;
                        f6 = f5;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new Function2() { // from class: dz7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                jf0.m(nii.this, i2, i3, i4, wn5Var, yciVar, o0kVar3, f4, f6, (hq5) obj, rvf.R(i5 | 1), i6);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                f5 = f3;
                i10 = i7 | 805306368;
                if ((i10 & 306783379) == 306783378) {
                }
                if (i11 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                int i122 = (i10 >> 3) & 1022;
                int i132 = i10 >> 15;
                niiVar.a(i2, i3, i4, f8, yciVar, o0kVar4, f7, wn5Var, oq5Var, i122 | (i132 & 7168) | (i132 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | ((i10 << 12) & 234881024) | ((i10 << 27) & 1879048192));
                f6 = f8;
                o0kVar3 = o0kVar4;
                f4 = f7;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            f4 = f2;
            i9 = i6 & 128;
            if (i9 != 0) {
            }
            f5 = f3;
            i10 = i7 | 805306368;
            if ((i10 & 306783379) == 306783378) {
            }
            if (i11 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            int i1222 = (i10 >> 3) & 1022;
            int i1322 = i10 >> 15;
            niiVar.a(i2, i3, i4, f8, yciVar, o0kVar4, f7, wn5Var, oq5Var, i1222 | (i1322 & 7168) | (i1322 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | ((i10 << 12) & 234881024) | ((i10 << 27) & 1879048192));
            f6 = f8;
            o0kVar3 = o0kVar4;
            f4 = f7;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        o0kVar2 = o0kVar;
        i8 = i6 & 64;
        if (i8 == 0) {
        }
        f4 = f2;
        i9 = i6 & 128;
        if (i9 != 0) {
        }
        f5 = f3;
        i10 = i7 | 805306368;
        if ((i10 & 306783379) == 306783378) {
        }
        if (i11 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        int i12222 = (i10 >> 3) & 1022;
        int i13222 = i10 >> 15;
        niiVar.a(i2, i3, i4, f8, yciVar, o0kVar4, f7, wn5Var, oq5Var, i12222 | (i13222 & 7168) | (i13222 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | ((i10 << 12) & 234881024) | ((i10 << 27) & 1879048192));
        f6 = f8;
        o0kVar3 = o0kVar4;
        f4 = f7;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void n(nii niiVar, ArrayList arrayList, o3e o3eVar, yci yciVar, pyc pycVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        o0k o0kVar2;
        niiVar.getClass();
        o3eVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(70882609);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(niiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(arrayList) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(o3eVar) : oq5Var.h(o3eVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(pycVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3 | 196608;
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
            o0kVar2 = o0kVar;
        } else {
            o0kVar2 = i3e.b;
            niiVar.b(arrayList, o3eVar, yciVar, pycVar, o0kVar2, oq5Var, ((i4 >> 3) & 65534) | ((i4 << 15) & 458752));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bz7(niiVar, arrayList, o3eVar, yciVar, pycVar, o0kVar2, i2, 0);
        }
    }

    public static final void o(nii niiVar, boolean z, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        niiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(799050679);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(niiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            niiVar.c(((i3 << 9) & 7168) | ((i3 >> 3) & 1022), oq5Var, yciVar, z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cz7(niiVar, z, yciVar, i2, 0);
        }
    }

    public static final void p(ydf ydfVar, yci yciVar, hq5 hq5Var, int i2) {
        ydf ydfVar2;
        oq5 oq5Var;
        yci yciVar2;
        kjn kjnVar;
        int i3;
        ydfVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(14583514);
        int i4 = (oq5Var2.f(ydfVar) ? 4 : 2) | i2 | 48;
        if (oq5Var2.P(i4 & 1, (i4 & 19) != 18)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yciVar2 = vci.a;
            yci H = vnj.H(oq5Var2, yciVar2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            String M = rvf.M(R.string.albums, oq5Var2);
            w4k E = a0g.E(R.drawable.ic_album_24, 0, oq5Var2);
            int i6 = i4 & 14;
            boolean z = i6 == 4;
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                i3 = i6;
                aub aubVar = new aub(1, ydfVar, ydf.class, "onAlbumsClick", "onAlbumsClick(Lcom/yandex/music/shared/core/evgen/analytics/ObjectInfo;)V", 0, 28);
                oq5Var2.k0(aubVar);
                K = aubVar;
            } else {
                i3 = i6;
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            boolean z2 = i3 == 4;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                w40 w40Var = new w40(3, ydfVar, ydf.class, "onVisibilityChanged", "onVisibilityChanged(Lcom/yandex/music/shared/core/evgen/analytics/ObjectInfo;ZLjava/lang/String;)V", 0, 4);
                oq5Var2.k0(w40Var);
                K2 = w40Var;
            }
            q(M, E, 0, (Function1) h9fVar, (pyc) ((h9f) K2), a.a(yciVar2, "kids_favourite_section_albums"), oq5Var2, 196992);
            String M2 = rvf.M(R.string.playlists, oq5Var2);
            w4k E2 = a0g.E(R.drawable.ic_playlist_24, 0, oq5Var2);
            boolean z3 = i3 == 4;
            Object K3 = oq5Var2.K();
            if (z3 || K3 == kjnVar) {
                aub aubVar2 = new aub(1, ydfVar, ydf.class, "onPlaylistsClick", "onPlaylistsClick(Lcom/yandex/music/shared/core/evgen/analytics/ObjectInfo;)V", 0, 29);
                oq5Var2.k0(aubVar2);
                K3 = aubVar2;
            }
            h9f h9fVar2 = (h9f) K3;
            boolean z4 = i3 == 4;
            Object K4 = oq5Var2.K();
            if (z4 || K4 == kjnVar) {
                K4 = new w40(3, ydfVar, ydf.class, "onVisibilityChanged", "onVisibilityChanged(Lcom/yandex/music/shared/core/evgen/analytics/ObjectInfo;ZLjava/lang/String;)V", 0, 5);
                ydfVar2 = ydfVar;
                oq5Var2.k0(K4);
            } else {
                ydfVar2 = ydfVar;
            }
            oq5Var = oq5Var2;
            q(M2, E2, 1, (Function1) h9fVar2, (pyc) ((h9f) K4), a.a(yciVar2, "kids_favourite_section_playlists"), oq5Var, 196992);
            oq5Var.p(true);
        } else {
            ydfVar2 = ydfVar;
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t1b(ydfVar2, yciVar2, i2, 18);
        }
    }

    public static final void q(String str, w4k w4kVar, int i2, Function1 function1, pyc pycVar, yci yciVar, hq5 hq5Var, int i3) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1159850034);
        int i4 = i3 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(w4kVar) ? 32 : 16) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.h(pycVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i4 & 1, (74899 & i4) != 74898)) {
            pkb pkbVar = pkb.Shortcut;
            str.getClass();
            thj thjVar = new thj(pkbVar, str, 1, i2 + 1, "");
            boolean h2 = ((57344 & i4) == 16384) | oq5Var.h(thjVar);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (h2 || K == obj) {
                K = new su(pycVar, thjVar, 1);
                oq5Var.k0(K);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(yciVar, null, 0L, 0.0f, null, (Function2) K, 15);
            boolean h3 = oq5Var.h(thjVar) | ((i4 & 7168) == 2048);
            Object K2 = oq5Var.K();
            if (h3 || K2 == obj) {
                K2 = new zya(25, function1, thjVar);
                oq5Var.k0(K2);
            }
            x97.b(str, b2, w4kVar, (Function0) K2, oq5Var, (i4 << 3) & 896, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(str, w4kVar, i2, function1, pycVar, yciVar, i3);
        }
    }

    public static final void r(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1124086907);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.g(true) ? 32 : 16);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            int i5 = (i3 >> 3) & 14;
            j(null, oq5Var, i5);
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.r(vciVar, 16));
            ta5 a3 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (z) {
                oq5Var.Z(-1871162525);
                z2 = true;
                ivf.l(true, d.r(vciVar, 95), nu0.j(), oq5Var, i5 | 48, 0);
                eta.p(vciVar, 4, oq5Var, false);
            } else {
                z2 = true;
                oq5Var.Z(-1874897715);
                oq5Var.p(false);
            }
            int i7 = i5 | 48;
            ivf.l(z2, d.r(vciVar, 160), nu0.d(), oq5Var, i7, 0);
            u1g.l(oq5Var, d.e(vciVar, 4));
            ivf.l(z2, d.r(vciVar, 95), nu0.j(), oq5Var, i7, 0);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z, yciVar, i2, 8);
        }
    }

    public static final long s(int i2, int i3, hq5 hq5Var, boolean z) {
        if (z) {
            i2 = i3;
        }
        return kg5.r(i2, hq5Var);
    }

    public static final boolean t(mma mmaVar, long j2) {
        if (!mmaVar.a.n) {
            return false;
        }
        ane aneVar = (ane) bcx.F(mmaVar).F.c;
        if (!aneVar.X.n) {
            return false;
        }
        long S = aneVar.S(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (S >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (S & 4294967295L));
        long j3 = mmaVar.q;
        float f2 = ((int) (j3 >> 32)) + intBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f2) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3;
    }

    public static te u(mt mtVar) {
        ff ffVar = mtVar.c;
        if (ffVar == null) {
            return null;
        }
        String str = ffVar.b;
        String str2 = ffVar.a;
        if (str2.length() <= 0 || str.length() <= 0) {
            return null;
        }
        d85 T = pd.T(ffVar.c);
        Boolean bool = ffVar.d;
        return new te(str2, T, str, bool != null ? bool.booleanValue() : true);
    }

    public static boolean w(q6w q6wVar, q6w q6wVar2) {
        nen[] nenVarArr = (nen[]) q6wVar.d.clone();
        nen[] nenVarArr2 = (nen[]) q6wVar2.d.clone();
        if (nenVarArr.length == nenVarArr2.length) {
            boolean z = (nenVarArr[0].t() == null || nenVarArr2[0].t() == null) ? false : !nenVarArr[0].t().a.x(nenVarArr2[0].t().a);
            for (int i2 = 0; i2 != nenVarArr.length; i2++) {
                nen nenVar = nenVarArr[i2];
                if (z) {
                    for (int length = nenVarArr2.length - 1; length >= 0; length--) {
                        nen nenVar2 = nenVarArr2[length];
                        if (nenVar2 != null && U(nenVar, nenVar2)) {
                            nenVarArr2[length] = null;
                        }
                    }
                } else {
                    for (int i3 = 0; i3 != nenVarArr2.length; i3++) {
                        nen nenVar3 = nenVarArr2[i3];
                        if (nenVar3 != null && U(nenVar, nenVar3)) {
                            nenVarArr2[i3] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void y(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            e7o.e();
        }
    }

    public static final fs z(pjc pjcVar, Function1 function1) {
        return new fs(new ukc(function1, pjcVar, null));
    }

    public abstract int v(int i2, xof xofVar, ksk kskVar, int i3);

    public Integer x(ksk kskVar) {
        return null;
    }
}
