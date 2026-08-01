package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final t1.h f2236a = new t1.h(h.f2235b);

    public static final boolean a(ClassLoader classLoader) {
        return c(new g(classLoader, 3)) && c(new g(classLoader, 1)) && c(new g(classLoader, 2)) && c(new g(classLoader, 0));
    }

    public static WindowLayoutComponent b() {
        return (WindowLayoutComponent) f2236a.getValue();
    }

    public static boolean c(C1.a aVar) {
        try {
            return ((Boolean) aVar.c()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
