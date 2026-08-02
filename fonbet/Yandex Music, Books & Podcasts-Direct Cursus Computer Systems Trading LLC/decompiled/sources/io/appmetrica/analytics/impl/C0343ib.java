package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.ib, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0343ib {
    @NonNull
    public final File a(@NonNull String str) {
        return new File(str);
    }

    public final String b(@NonNull Context context, @NonNull String str) {
        File appStorageDirectory = FileUtils.getAppStorageDirectory(context);
        if (appStorageDirectory == null) {
            return null;
        }
        return appStorageDirectory.getAbsolutePath() + "/" + str;
    }

    public final File c(@NonNull Context context, @NonNull String str) {
        return FileUtils.getFileFromAppStorage(context, str);
    }

    public final File a(@NonNull Context context, @NonNull String str) {
        return FileUtils.getFileFromAppStorage(context, str);
    }

    @NonNull
    public final File a(@NonNull File file, @NonNull String str) {
        return new File(file, str);
    }

    @NonNull
    public final File b(@NonNull File file, @NonNull String str) {
        return new File(file, str);
    }
}
