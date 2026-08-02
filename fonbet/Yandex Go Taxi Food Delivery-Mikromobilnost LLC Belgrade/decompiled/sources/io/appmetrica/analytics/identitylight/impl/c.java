package io.appmetrica.analytics.identitylight.impl;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.support.v4.media.session.PlaybackStateCompat;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes9.dex */
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
                return new a((statFs.getBlockCountLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, (statFs.getAvailableBlocksLong() * blockSizeLong) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
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
            long j4 = j3;
            j = j2;
            j2 = j4;
        }
        return new a(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, j2 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }

    public c(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }
}
