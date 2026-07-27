package R;

import E0.q;
import androidx.window.extensions.WindowExtensionsProvider;

/* loaded from: classes.dex */
public abstract class e {
    static {
        q.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
