package V;

import W.c;
import W.d;
import android.app.Activity;
import b0.C0128b;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1828a;

    public d a(Object obj, kotlin.jvm.internal.d dVar, Activity activity, C0128b c0128b) {
        c cVar = new c(dVar, c0128b);
        Object newProxyInstance = Proxy.newProxyInstance(this.f1828a, new Class[]{b()}, cVar);
        i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f1828a.loadClass("java.util.function.Consumer");
        i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
