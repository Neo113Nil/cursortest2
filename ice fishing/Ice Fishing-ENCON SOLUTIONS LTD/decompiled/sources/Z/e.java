package Z;

import a.AbstractC0083a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1935a;

    /* renamed from: b, reason: collision with root package name */
    public final V.b f1936b;

    /* renamed from: c, reason: collision with root package name */
    public final V.b f1937c;

    public e(ClassLoader classLoader, V.b bVar) {
        this.f1935a = classLoader;
        this.f1936b = bVar;
        this.f1937c = new V.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        V.b bVar = this.f1937c;
        bVar.getClass();
        boolean z2 = false;
        try {
            new V.a(bVar, 0).invoke();
            if (AbstractC0083a.t("WindowExtensionsProvider#getWindowExtensions is not valid", new V.a(bVar, 1)) && AbstractC0083a.t("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && AbstractC0083a.t("FoldingFeature class is not valid", new d(this, 0))) {
                int a2 = W.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0083a.t("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z2 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z2) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC0083a.t("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
