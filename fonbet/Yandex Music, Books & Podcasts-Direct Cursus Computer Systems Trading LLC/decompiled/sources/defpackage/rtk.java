package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class rtk {
    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = qtk.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
