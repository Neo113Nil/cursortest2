package U;

import D.W;
import a.AbstractC0069a;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f1020a;

    /* renamed from: b, reason: collision with root package name */
    public final Q.a f1021b;

    /* renamed from: c, reason: collision with root package name */
    public final Q.a f1022c;

    public e(ClassLoader classLoader, Q.a aVar) {
        this.f1020a = classLoader;
        this.f1021b = aVar;
        this.f1022c = new Q.a(classLoader);
    }

    public final WindowLayoutComponent a() {
        Q.a aVar = this.f1022c;
        aVar.getClass();
        boolean z2 = false;
        try {
            E0.i.d(aVar.f913a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (AbstractC0069a.L("WindowExtensionsProvider#getWindowExtensions is not valid", new W(2, aVar)) && AbstractC0069a.L("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && AbstractC0069a.L("FoldingFeature class is not valid", new d(this, 0))) {
                int a2 = R.e.a();
                if (a2 == 1) {
                    z2 = b();
                } else if (2 <= a2 && a2 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0069a.L("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
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
        return AbstractC0069a.L("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
