package com.bugsnag.android;

import coil3.memory.MemoryCacheService;
import com.bugsnag.android.internal.ImmutableConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class LastRunInfoStore {
    public final File file;
    public final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public final Logger logger;

    public LastRunInfoStore(ImmutableConfig immutableConfig) {
        this.file = new File((File) immutableConfig.persistenceDirectory.getValue(), "bugsnag/last-run-info");
        this.logger = immutableConfig.logger;
    }

    public final LastRunInfo loadImpl() {
        List split$default;
        File file = this.file;
        if (!file.exists()) {
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8), new String[]{"\n"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        Logger logger = this.logger;
        if (size != 3) {
            logger.w("Unexpected number of lines when loading LastRunInfo. Skipping load. " + arrayList);
            return null;
        }
        try {
            String str = (String) arrayList.get(0);
            int parseInt = Integer.parseInt(StringsKt.substringAfter(str, "consecutiveLaunchCrashes=", str));
            String str2 = (String) arrayList.get(1);
            boolean parseBoolean = Boolean.parseBoolean(StringsKt.substringAfter(str2, "crashed".concat("="), str2));
            String str3 = (String) arrayList.get(2);
            LastRunInfo lastRunInfo = new LastRunInfo(parseInt, parseBoolean, Boolean.parseBoolean(StringsKt.substringAfter(str3, "crashedDuringLaunch".concat("="), str3)));
            logger.d("Loaded: " + lastRunInfo);
            return lastRunInfo;
        } catch (NumberFormatException e) {
            logger.w("Failed to read consecutiveLaunchCrashes from saved lastRunInfo", e);
            return null;
        }
    }

    public final void persist(LastRunInfo lastRunInfo) {
        this.lock.writeLock().lock();
        try {
            persistImpl(lastRunInfo);
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void persistImpl(LastRunInfo lastRunInfo) {
        MemoryCacheService memoryCacheService = new MemoryCacheService(24);
        memoryCacheService.add(Integer.valueOf(lastRunInfo.consecutiveLaunchCrashes), "consecutiveLaunchCrashes");
        memoryCacheService.add(Boolean.valueOf(lastRunInfo.crashed), "crashed");
        memoryCacheService.add(Boolean.valueOf(lastRunInfo.crashedDuringLaunch), "crashedDuringLaunch");
        String sb = ((StringBuilder) memoryCacheService.imageLoader).toString();
        File file = this.file;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FilesKt__FileReadWriteKt.writeText$default(file, sb);
        this.logger.d("Persisted: ".concat(sb));
    }
}
