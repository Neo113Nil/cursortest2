package c9;

import android.content.Context;
import java.io.File;
import pc.j;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] listFiles;
        j.e(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (listFiles = file.listFiles()) != null) {
                for (File file3 : listFiles) {
                    j.d(file3, "prefsFile");
                    String name = file3.getName();
                    j.d(name, "getName(...)");
                    int p8 = (6 & 2) != 0 ? h.p(name) : 0;
                    j.e(name, "<this>");
                    j.e(".", "string");
                    int lastIndexOf = name.lastIndexOf(".", p8);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                        j.d(name, "substring(...)");
                    }
                    if (context.getSharedPreferences(name, 0).contains("GT_PLAYER_ID")) {
                        file3.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.log(g9.c.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
