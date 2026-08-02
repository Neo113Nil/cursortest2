package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0792vb {
    public volatile Boolean a;

    public final void a(Context context) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    boolean z = false;
                    try {
                        File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                        boolean exists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                        boolean exists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                        if (exists || exists2) {
                            z = true;
                        }
                    } catch (Throwable unused) {
                    }
                    this.a = Boolean.valueOf(z);
                }
            }
        }
    }
}
