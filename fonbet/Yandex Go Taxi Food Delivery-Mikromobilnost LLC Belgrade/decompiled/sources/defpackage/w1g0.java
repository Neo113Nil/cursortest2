package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.messaging.securepush.KeyNotFoundException;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class w1g0 {
    public final SharedPreferences a;

    static {
        new HashMap();
    }

    public w1g0(Context context) {
        this.a = context.getSharedPreferences("push_encryption_push_encryption_keychain_preferences", 0);
    }

    public final synchronized byte[] a() {
        if (!c()) {
            throw new KeyNotFoundException("Push encryption key not initialized");
        }
        return ew4.a(11, this.a.getString("push_auth_secret", null));
    }

    public final synchronized byte[] b() {
        if (!c()) {
            throw new KeyNotFoundException("Push encryption key not initialized");
        }
        return ew4.a(11, this.a.getString("push_public_key", null));
    }

    public final synchronized boolean c() {
        boolean z;
        if (this.a.contains("push_public_key") && this.a.contains("push_private_key")) {
            z = this.a.contains("push_auth_secret");
        }
        return z;
    }
}
