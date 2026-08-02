package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C0676rb {
    public final File a(String str) {
        return new File(str);
    }

    public final String b(Context context, String str) {
        File appStorageDirectory = FileUtils.getAppStorageDirectory(context);
        if (appStorageDirectory == null) {
            return null;
        }
        return appStorageDirectory.getAbsolutePath() + "/" + str;
    }

    public final File c(Context context, String str) {
        return FileUtils.getFileFromAppStorage(context, str);
    }

    public final File a(Context context, String str) {
        return FileUtils.getFileFromAppStorage(context, str);
    }

    public final File a(File file, String str) {
        return new File(file, str);
    }

    public final File b(File file, String str) {
        return new File(file, str);
    }
}
