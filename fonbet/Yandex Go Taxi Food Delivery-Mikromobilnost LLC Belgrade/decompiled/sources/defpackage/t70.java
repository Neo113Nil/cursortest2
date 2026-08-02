package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class t70 {
    public final z22 a;

    public t70(z22 z22Var) {
        this.a = z22Var;
    }

    public final Object a(Class cls, String str) {
        try {
            Class<?> cls2 = Class.forName(str);
            Object newInstance = cls2.getConstructor(null).newInstance(null);
            Method method = cls2.getMethod("create", null);
            if (cls.isAssignableFrom(method.getReturnType())) {
                return method.invoke(newInstance, null);
            }
            return null;
        } catch (Exception e) {
            ((a) this.a).c("adapter_creation_failed", e);
            return null;
        }
    }
}
