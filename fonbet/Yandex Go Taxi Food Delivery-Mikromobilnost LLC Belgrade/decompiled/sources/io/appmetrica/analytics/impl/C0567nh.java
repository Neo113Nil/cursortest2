package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.cvu0;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0567nh {
    public final Context a;
    public final Rr b;
    public final Sr c;

    public C0567nh(Context context) {
        this(context, new Rr(), new Sr());
    }

    public final String a(String str) {
        try {
            this.c.getClass();
            if (!Sr.a(str)) {
                this.b.getClass();
                str = cvu0.v(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC0475kc.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0567nh(Context context, Rr rr, Sr sr) {
        this.a = context;
        this.b = rr;
        this.c = sr;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
