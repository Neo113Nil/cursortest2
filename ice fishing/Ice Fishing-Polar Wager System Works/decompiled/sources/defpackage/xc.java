package defpackage;

/* loaded from: classes.dex */
public final class xc implements defpackage.wc {
    public static final java.util.Map oh6vYeIP;
    public final java.lang.Class IHQe1A4L2xu;

    static {
        java.util.List yIx6ChFVk = defpackage.fm.yIx6ChFVk(defpackage.vz.class, defpackage.g00.class, defpackage.k00.class, defpackage.l00.class, defpackage.m00.class, defpackage.n00.class, defpackage.o00.class, defpackage.p00.class, defpackage.q00.class, defpackage.r00.class, defpackage.wz.class, defpackage.xz.class, defpackage.yz.class, defpackage.zz.class, defpackage.a00.class, defpackage.b00.class, defpackage.c00.class, defpackage.d00.class, defpackage.e00.class, defpackage.f00.class, defpackage.h00.class, defpackage.i00.class, defpackage.j00.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(yIx6ChFVk, 10));
        int i = 0;
        for (java.lang.Object obj : yIx6ChFVk) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.fm.hkbnNdmy();
                throw null;
            }
            arrayList.add(new defpackage.et0((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i = i2;
        }
        oh6vYeIP = defpackage.yh0.wll2JLbTBC2(arrayList);
    }

    public xc(java.lang.Class cls) {
        cls.getClass();
        this.IHQe1A4L2xu = cls;
    }

    public final boolean F7NU4MC0GW(java.lang.Object obj) {
        java.lang.Class cls = this.IHQe1A4L2xu;
        cls.getClass();
        java.util.Map map = oh6vYeIP;
        map.getClass();
        java.lang.Integer num = (java.lang.Integer) map.get(cls);
        if (num != null) {
            return defpackage.mj1.XZx205DYe(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = defpackage.a70.G3OKOH3wZRC(defpackage.sz0.IHQe1A4L2xu(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.wc
    public final java.lang.Class IHQe1A4L2xu() {
        return this.IHQe1A4L2xu;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.xc) && defpackage.a70.G3OKOH3wZRC(this).equals(defpackage.a70.G3OKOH3wZRC((defpackage.xc) obj));
    }

    public final int hashCode() {
        return defpackage.a70.G3OKOH3wZRC(this).hashCode();
    }

    public final java.lang.String oh6vYeIP() {
        java.lang.String V7bD7b8KA;
        java.lang.Class cls = this.IHQe1A4L2xu;
        cls.getClass();
        java.lang.String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            java.lang.String V7bD7b8KA2 = defpackage.s21.V7bD7b8KA(cls.getName());
            return V7bD7b8KA2 == null ? cls.getCanonicalName() : V7bD7b8KA2;
        }
        java.lang.Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (V7bD7b8KA = defpackage.s21.V7bD7b8KA(componentType.getName())) != null) {
            str = V7bD7b8KA.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final java.lang.String r1MBDhnF() {
        java.lang.String JcqDrWrgMf;
        java.lang.Class cls = this.IHQe1A4L2xu;
        cls.getClass();
        java.lang.String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                java.lang.String JcqDrWrgMf2 = defpackage.s21.JcqDrWrgMf(cls.getName());
                return JcqDrWrgMf2 == null ? cls.getSimpleName() : JcqDrWrgMf2;
            }
            java.lang.Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (JcqDrWrgMf = defpackage.s21.JcqDrWrgMf(componentType.getName())) != null) {
                str = JcqDrWrgMf.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        java.lang.String simpleName = cls.getSimpleName();
        java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return defpackage.rc1.mL9sMlGfef(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int nVhUznk1t = defpackage.rc1.nVhUznk1t(simpleName, '$', 0, 6);
            return nVhUznk1t == -1 ? simpleName : simpleName.substring(nVhUznk1t + 1, simpleName.length());
        }
        return defpackage.rc1.mL9sMlGfef(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final java.lang.String toString() {
        return this.IHQe1A4L2xu.toString() + " (Kotlin reflection is not available)";
    }
}
