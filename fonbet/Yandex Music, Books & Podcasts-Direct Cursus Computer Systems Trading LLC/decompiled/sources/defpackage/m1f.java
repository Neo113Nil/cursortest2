package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m1f {

    @NotNull
    public static final m1f a = new m1f();
    public static final Integer b;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            b = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        b = num2;
    }
}
