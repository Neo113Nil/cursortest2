package com.gamericefishpro.space.gd;

import android.content.Context;
import com.gamericefishpro.space.ai.l;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void ensureNoObfuscatedPrefStore(Context context) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file3 : fileArrListFiles) {
                    Intrinsics.b(file3);
                    if (context.getSharedPreferences(l.e(file3), 0).contains("GT_PLAYER_ID")) {
                        file3.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
