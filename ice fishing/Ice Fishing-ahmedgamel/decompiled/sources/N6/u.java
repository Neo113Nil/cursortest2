package N6;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2099a = a();

    public static Unsafe a() {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return (Unsafe) declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
