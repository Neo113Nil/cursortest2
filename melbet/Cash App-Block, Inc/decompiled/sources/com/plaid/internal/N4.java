package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.plaid.internal.C0095a6;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class N4 {
    public static final a a = new a();

    public static final class a {
        public final synchronized String a(Application application) {
            String string2;
            try {
                application.getClass();
                SharedPreferences sharedPreferences = application.getSharedPreferences("link_persistent_uuid", 0);
                string2 = sharedPreferences.getString("link_persistent_uuid", "");
                if (string2 != null && string2.length() != 0) {
                    C0095a6.a.a(C0095a6.a, "Reusing existing persistent link id: ".concat(string2));
                }
                string2 = UUID.randomUUID().toString();
                string2.getClass();
                sharedPreferences.edit().putString("link_persistent_uuid", string2).apply();
                C0095a6.a.a(C0095a6.a, "Creating new persistent link id: " + string2);
            } catch (Throwable th) {
                throw th;
            }
            return string2;
        }
    }
}
