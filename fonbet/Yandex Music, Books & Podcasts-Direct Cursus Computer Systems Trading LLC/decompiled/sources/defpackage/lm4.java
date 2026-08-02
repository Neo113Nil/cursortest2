package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class lm4 implements f9f, dm4 {

    @NotNull
    public static final km4 b = new km4(null);
    public static final Map c;
    public final Class a;

    static {
        List h = u75.h(Function0.class, Function1.class, Function2.class, pyc.class, ryc.class, tyc.class, uyc.class, vyc.class, wyc.class, xyc.class, kyc.class, sn5.class, lyc.class, sn5.class, sn5.class, sn5.class, sn5.class, sn5.class, sn5.class, sn5.class, sn5.class, sn5.class, nyc.class);
        ArrayList arrayList = new ArrayList(v75.o(h, 10));
        int i = 0;
        for (Object obj : h) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = uah.n(arrayList);
    }

    public lm4(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.dm4
    public final Class b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lm4) && leu.Q(this).equals(leu.Q((f9f) obj));
    }

    public final String f() {
        String a;
        b.getClass();
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String a2 = km4.a(cls.getName());
            return a2 == null ? cls.getCanonicalName() : a2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (a = km4.a(componentType.getName())) != null) {
            str = a.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String h() {
        String b2;
        b.getClass();
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String b3 = km4.b(cls.getName());
                return b3 == null ? cls.getSimpleName() : b3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = km4.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.k0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int S = StringsKt.S(simpleName, '$', 0, 6);
            return S == -1 ? simpleName : simpleName.substring(S + 1, simpleName.length());
        }
        return StringsKt.k0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final int hashCode() {
        return leu.Q(this).hashCode();
    }

    public final boolean i(Object obj) {
        b.getClass();
        Class cls = this.a;
        cls.getClass();
        Map map = c;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return wct.D(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = leu.Q(ern.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
