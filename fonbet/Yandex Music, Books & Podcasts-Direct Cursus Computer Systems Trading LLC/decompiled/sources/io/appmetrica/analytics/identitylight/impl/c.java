package io.appmetrica.analytics.identitylight.impl;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class c {
    public final Context a;
    public final b b;

    public c(Context context) {
        this(context, new b());
    }

    public final a a() {
        long j;
        long j2 = 0;
        if (!AndroidUtils.isApiAchieved(26)) {
            try {
                this.b.getClass();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                return new a((statFs.getBlockCountLong() * blockSizeLong) / 1024, (statFs.getAvailableBlocksLong() * blockSizeLong) / 1024);
            } catch (Throwable unused) {
                return new a(0L, 0L);
            }
        }
        StorageStatsManager storageStatsManager = (StorageStatsManager) this.a.getSystemService("storagestats");
        StorageManager storageManager = (StorageManager) this.a.getSystemService("storage");
        if (storageManager == null || storageStatsManager == null) {
            j = 0;
        } else {
            Iterator<StorageVolume> it = storageManager.getStorageVolumes().iterator();
            long j3 = 0;
            while (it.hasNext()) {
                try {
                    String uuid = it.next().getUuid();
                    UUID fromString = uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
                    j2 += storageStatsManager.getTotalBytes(fromString);
                    j3 += storageStatsManager.getFreeBytes(fromString);
                } catch (Throwable unused2) {
                }
            }
            j = j2;
            j2 = j3;
        }
        return new a(j / 1024, j2 / 1024);
    }

    public c(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }
}
