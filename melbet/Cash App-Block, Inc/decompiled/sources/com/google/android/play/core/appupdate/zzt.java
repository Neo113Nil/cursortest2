package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public final class zzt {
    public final Context zza;

    public zzt(Context context) {
        this.zza = context;
    }

    public static long zzb(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += zzb(file2);
            }
        }
        return j;
    }
}
