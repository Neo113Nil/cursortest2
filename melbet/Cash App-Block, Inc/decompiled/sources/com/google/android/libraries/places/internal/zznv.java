package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.common.base.Splitter;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zznv {
    public static DropBoxManager zza;
    public static final zznu zzb = new zznu(16, 0.75f, true);
    public static String zzc;

    public static synchronized void zza(Context context) {
        synchronized (zznv.class) {
            if (zza == null) {
                zza = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                zzc = "com.google.android.libraries.places";
            }
        }
    }

    public static synchronized void zzb(Throwable th) {
        synchronized (zznv.class) {
            try {
                long id = Thread.currentThread().getId();
                int hashCode = th.hashCode();
                Integer num = (Integer) zzb.get(Long.valueOf(id));
                if (num != null) {
                    if (num.intValue() != hashCode) {
                    }
                }
                DropBoxManager dropBoxManager = zza;
                if (dropBoxManager != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                    DropBoxManager dropBoxManager2 = zza;
                    StringBuilder sb = new StringBuilder();
                    String str = zzc;
                    List splitToList = Splitter.on('.').splitToList("5.2.0");
                    long j = -1;
                    if (splitToList.size() == 3) {
                        long j2 = 0;
                        for (int i = 0; i < splitToList.size(); i++) {
                            try {
                                j2 = (j2 * 100) + Integer.parseInt((String) splitToList.get(i));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        j = j2;
                    }
                    sb.append(String.format("Package: %s v%d (%s)\n", str, Long.valueOf(j), "5.2.0"));
                    sb.append("Build: " + Build.FINGERPRINT + "\n");
                    sb.append("\n");
                    sb.append(Log.getStackTraceString(th));
                    dropBoxManager2.addText("system_app_crash", sb.toString());
                    zzb.put(Long.valueOf(id), Integer.valueOf(hashCode));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
