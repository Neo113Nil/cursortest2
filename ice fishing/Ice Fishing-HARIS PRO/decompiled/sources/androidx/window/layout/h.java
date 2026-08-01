package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class h extends D1.j implements C1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final h f2235b = new h(0);

    public static WindowLayoutComponent a() {
        ClassLoader classLoader = i.class.getClassLoader();
        if (classLoader == null || !i.a(classLoader)) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // C1.a
    public final /* bridge */ /* synthetic */ Object c() {
        return a();
    }
}
