package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class ern {
    public static final frn a;
    public static final f9f[] b;

    static {
        frn frnVar = null;
        try {
            frnVar = (frn) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (frnVar == null) {
            frnVar = new frn();
        }
        a = frnVar;
        b = new f9f[0];
    }

    public static lm4 a(Class cls) {
        a.getClass();
        return new lm4(cls);
    }

    public static yct b(Class cls) {
        lm4 a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new yct(a2, true);
    }

    public static yct c(Class cls) {
        lm4 a2 = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new yct(a2, false);
    }
}
