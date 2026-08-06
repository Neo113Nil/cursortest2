package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ne implements defpackage.me {
    public static final java.util.Map giKS3J6vZuNy;
    public final java.lang.Class ZpBGe2uQfcn8;

    static {
        java.util.List oCu53ZX2v4Ju = defpackage.ma0.oCu53ZX2v4Ju(defpackage.n10.class, defpackage.y10.class, defpackage.c20.class, defpackage.d20.class, defpackage.e20.class, defpackage.f20.class, defpackage.g20.class, defpackage.h20.class, defpackage.i20.class, defpackage.j20.class, defpackage.o10.class, defpackage.p10.class, defpackage.q10.class, defpackage.r10.class, defpackage.s10.class, defpackage.t10.class, defpackage.u10.class, defpackage.v10.class, defpackage.w10.class, defpackage.x10.class, defpackage.z10.class, defpackage.a20.class, defpackage.b20.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(oCu53ZX2v4Ju, 10));
        int i = 0;
        for (java.lang.Object obj : oCu53ZX2v4Ju) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.ma0.BXaznwstz2U0();
                throw null;
            }
            arrayList.add(new defpackage.bw0((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i = i2;
        }
        giKS3J6vZuNy = defpackage.jk0.Wc0TdmRSwbbi(arrayList);
    }

    public ne(java.lang.Class cls) {
        cls.getClass();
        this.ZpBGe2uQfcn8 = cls;
    }

    public final boolean JhCgjQRTAOCT(java.lang.Object obj) {
        java.lang.Class cls = this.ZpBGe2uQfcn8;
        cls.getClass();
        java.util.Map map = giKS3J6vZuNy;
        map.getClass();
        java.lang.Integer num = (java.lang.Integer) map.get(cls);
        if (num != null) {
            return defpackage.nq1.BXaznwstz2U0(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = defpackage.t80.w7APNrr0aGRc(defpackage.b41.ZpBGe2uQfcn8(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.me
    public final java.lang.Class ZpBGe2uQfcn8() {
        return this.ZpBGe2uQfcn8;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ne) && defpackage.t80.w7APNrr0aGRc(this).equals(defpackage.t80.w7APNrr0aGRc((defpackage.ne) obj));
    }

    public final java.lang.String fWTAfUmVKrZq() {
        java.lang.String xahdJg25P1Bv;
        java.lang.Class cls = this.ZpBGe2uQfcn8;
        cls.getClass();
        java.lang.String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                java.lang.String xahdJg25P1Bv2 = defpackage.vx1.xahdJg25P1Bv(cls.getName());
                return xahdJg25P1Bv2 == null ? cls.getSimpleName() : xahdJg25P1Bv2;
            }
            java.lang.Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (xahdJg25P1Bv = defpackage.vx1.xahdJg25P1Bv(componentType.getName())) != null) {
                str = xahdJg25P1Bv.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        java.lang.String simpleName = cls.getSimpleName();
        java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return defpackage.tg1.FhgBoOud6zyW(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int NkfcFfdaVTox = defpackage.tg1.NkfcFfdaVTox(simpleName, '$', 0, 6);
            return NkfcFfdaVTox == -1 ? simpleName : simpleName.substring(NkfcFfdaVTox + 1, simpleName.length());
        }
        return defpackage.tg1.FhgBoOud6zyW(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final java.lang.String giKS3J6vZuNy() {
        java.lang.String h3m55N1URyyK;
        java.lang.Class cls = this.ZpBGe2uQfcn8;
        cls.getClass();
        java.lang.String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            java.lang.String h3m55N1URyyK2 = defpackage.vx1.h3m55N1URyyK(cls.getName());
            return h3m55N1URyyK2 == null ? cls.getCanonicalName() : h3m55N1URyyK2;
        }
        java.lang.Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (h3m55N1URyyK = defpackage.vx1.h3m55N1URyyK(componentType.getName())) != null) {
            str = h3m55N1URyyK.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final int hashCode() {
        return defpackage.t80.w7APNrr0aGRc(this).hashCode();
    }

    public final java.lang.String toString() {
        return this.ZpBGe2uQfcn8.toString() + " (Kotlin reflection is not available)";
    }
}
