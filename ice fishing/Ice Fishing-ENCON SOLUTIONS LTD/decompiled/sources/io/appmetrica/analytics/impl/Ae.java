package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Ae {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4148a;

    /* renamed from: b, reason: collision with root package name */
    public final C0650oo f4149b;

    /* renamed from: c, reason: collision with root package name */
    public final C0676po f4150c;

    public Ae(Context context) {
        this(context, new C0650oo(), new C0676po());
    }

    public final String a(String str) {
        try {
            this.f4150c.getClass();
            if (!C0676po.a(str)) {
                this.f4149b.getClass();
                str = z1.o.P(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f4148a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Ja.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ae(Context context, C0650oo c0650oo, C0676po c0676po) {
        this.f4148a = context;
        this.f4149b = c0650oo;
        this.f4150c = c0676po;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f4148a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f4148a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
