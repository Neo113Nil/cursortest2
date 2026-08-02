package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class sno {
    public final ClassLoader a;
    public final sld b;
    public final knn c;

    public sno(ClassLoader classLoader, sld sldVar) {
        this.a = classLoader;
        this.b = sldVar;
        this.c = new knn(4, classLoader);
    }

    public final WindowLayoutComponent a() {
        knn knnVar = this.c;
        knnVar.getClass();
        boolean z = false;
        try {
            new qno(knnVar, 0).invoke();
            if (ixf.M("WindowExtensionsProvider#getWindowExtensions is not valid", new qno(knnVar, 1)) && ixf.M("WindowExtensions#getWindowLayoutComponent is not valid", new rno(this, 3)) && ixf.M("FoldingFeature class is not valid", new rno(this, 0))) {
                int a = m1c.a();
                if (a == 1) {
                    z = b();
                } else if (2 <= a && a <= Integer.MAX_VALUE && b()) {
                    if (ixf.M("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new rno(this, 2))) {
                        z = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return ixf.M("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new rno(this, 1));
    }
}
