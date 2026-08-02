package defpackage;

import java.util.Arrays;
import yads.et1;
import yads.q91;

/* loaded from: classes7.dex */
public final class vm81 extends w771 {
    public static void a(et1 et1Var) {
        try {
            x4c x4cVar = hxk.b;
            m881 a = tb81.a("32.50.3");
            m881 a2 = tb81.a("32.18.1");
            Integer valueOf = a2 != null ? Integer.valueOf(a2.a) : null;
            if (valueOf == null || a != null) {
                return;
            }
            q91 q91Var = new q91(String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{valueOf, a != null ? Integer.valueOf(a.a) : null}, 2)));
            et1Var.getClass();
            throw q91Var;
        } catch (NoClassDefFoundError unused) {
            q91 q91Var2 = new q91(String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0)));
            et1Var.getClass();
            throw q91Var2;
        }
    }
}
