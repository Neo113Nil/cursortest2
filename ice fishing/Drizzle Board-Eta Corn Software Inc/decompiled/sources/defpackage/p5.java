package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p5 implements o5 {
    public static final Map NCTxEWno;
    public final Class qoPGr6Ce;

    static {
        List N8VPGzVC = y5.N8VPGzVC(ok.class, zk.class, dl.class, el.class, fl.class, gl.class, hl.class, il.class, jl.class, kl.class, pk.class, qk.class, rk.class, sk.class, tk.class, uk.class, vk.class, wk.class, xk.class, yk.class, al.class, bl.class, cl.class);
        ArrayList arrayList = new ArrayList(z5.bvfAo0eO(N8VPGzVC, 10));
        int i = 0;
        for (Object obj : N8VPGzVC) {
            int i2 = i + 1;
            if (i < 0) {
                y5.ZyZthT5G();
                throw null;
            }
            arrayList.add(new hx((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        NCTxEWno = zq.VGmz0ccI(arrayList);
    }

    public p5(Class cls) {
        cls.getClass();
        this.qoPGr6Ce = cls;
    }

    public final String MdtA4re8() {
        String nSmgoSB5;
        Class cls = this.qoPGr6Ce;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String nSmgoSB52 = ej0.nSmgoSB5(cls.getName());
                return nSmgoSB52 == null ? cls.getSimpleName() : nSmgoSB52;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (nSmgoSB5 = ej0.nSmgoSB5(componentType.getName())) != null) {
                str = nSmgoSB5.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ba0.i7xS8jrb(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int gjV1z5T1 = ba0.gjV1z5T1(simpleName, '$', 0, 6);
            return gjV1z5T1 == -1 ? simpleName : simpleName.substring(gjV1z5T1 + 1, simpleName.length());
        }
        return ba0.i7xS8jrb(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String NCTxEWno() {
        String Qr9iLBAD;
        Class cls = this.qoPGr6Ce;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String Qr9iLBAD2 = ej0.Qr9iLBAD(cls.getName());
            return Qr9iLBAD2 == null ? cls.getCanonicalName() : Qr9iLBAD2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (Qr9iLBAD = ej0.Qr9iLBAD(componentType.getName())) != null) {
            str = Qr9iLBAD.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p5) && ej0.RXQxj5Oe(this).equals(ej0.RXQxj5Oe((p5) obj));
    }

    public final int hashCode() {
        return ej0.RXQxj5Oe(this).hashCode();
    }

    public final Class qoPGr6Ce() {
        return this.qoPGr6Ce;
    }

    public final String toString() {
        return this.qoPGr6Ce.toString() + " (Kotlin reflection is not available)";
    }

    public final boolean wxUZMvaN(Object obj) {
        Class cls = this.qoPGr6Ce;
        cls.getClass();
        Map map = NCTxEWno;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return le0.lwWCatUu(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = ej0.RXQxj5Oe(m20.qoPGr6Ce(cls));
        }
        return cls.isInstance(obj);
    }
}
