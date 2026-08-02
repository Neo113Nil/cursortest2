package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* loaded from: classes.dex */
public abstract class m1c {
    static {
        ern.a(m1c.class).h();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
