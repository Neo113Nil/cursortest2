package defpackage;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: classes10.dex */
public abstract class ykx {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
