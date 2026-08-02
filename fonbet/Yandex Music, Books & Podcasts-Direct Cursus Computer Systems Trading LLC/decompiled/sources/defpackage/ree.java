package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class ree implements InvocationHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ ree(int i) {
        this.a = i;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.a) {
            case 0:
                if (!bp6.a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                        if (Intrinsics.d(method.getName(), "onBillingSetupFinished")) {
                            AtomicBoolean atomicBoolean = see.s;
                            imp.M().set(true);
                        } else {
                            String name = method.getName();
                            name.getClass();
                            if (c.n(name, "onBillingServiceDisconnected", false)) {
                                AtomicBoolean atomicBoolean2 = see.s;
                                imp.M().set(false);
                            }
                        }
                        break;
                    } catch (Throwable th) {
                        bp6.a(this, th);
                        break;
                    }
                }
                break;
            default:
                if (!bp6.a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                        break;
                    } catch (Throwable th2) {
                        bp6.a(this, th2);
                        break;
                    }
                }
                break;
        }
        return null;
        return null;
    }
}
