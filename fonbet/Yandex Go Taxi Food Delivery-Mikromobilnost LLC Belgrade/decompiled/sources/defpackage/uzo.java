package defpackage;

import androidx.window.core.VerificationMode;
import androidx.window.extensions.WindowExtensionsProvider;

/* loaded from: classes10.dex */
public abstract class uzo {
    static {
        qoi0.a(uzo.class).d();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            int i = wr6.a;
            VerificationMode verificationMode = VerificationMode.STRICT;
            return 0;
        } catch (NullPointerException unused2) {
            int i2 = wr6.a;
            VerificationMode verificationMode2 = VerificationMode.STRICT;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            int i3 = wr6.a;
            VerificationMode verificationMode3 = VerificationMode.STRICT;
            return 0;
        }
    }
}
