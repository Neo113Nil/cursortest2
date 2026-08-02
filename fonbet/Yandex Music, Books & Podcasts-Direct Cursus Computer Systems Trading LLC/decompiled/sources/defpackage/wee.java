package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wee {
    public static wee g;
    public static final AtomicBoolean h = new AtomicBoolean(false);
    public final Class a;
    public final Class b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;

    public wee(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        this.a = cls;
        this.b = cls2;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
    }

    public final Object a(ArrayList arrayList) {
        Object G;
        Object G2;
        Class cls = this.b;
        if (!bp6.a.contains(this)) {
            try {
                Object G3 = xee.G(this.a, null, this.c, new Object[0]);
                if (G3 != null && (G = xee.G(cls, G3, this.d, "inapp")) != null && (G2 = xee.G(cls, G, this.e, arrayList)) != null) {
                    return xee.G(cls, G2, this.f, new Object[0]);
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }
}
