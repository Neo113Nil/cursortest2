package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.k2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0465k2 {
    public final C0615p7 a;
    public final C0676rb b;
    public boolean c;
    public Long d;

    public C0465k2(C0615p7 c0615p7, C0676rb c0676rb) {
        this.c = false;
        this.a = c0615p7;
        this.b = c0676rb;
    }

    public final synchronized void a(Context context, long j) {
        if (this.a.b()) {
            try {
                this.d = Long.valueOf(j);
                String jSONObject = new JSONObject().put("delay", j).toString();
                this.b.getClass();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat");
                if (fileFromAppStorage != null) {
                    AbstractC0475kc.a(jSONObject, new FileOutputStream(fileFromAppStorage));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.c) {
            return;
        }
        long a = a(context);
        if (a > 0) {
            try {
                Thread.sleep(a);
            } catch (Throwable unused) {
            }
        }
        this.c = true;
    }

    public final synchronized void c(Context context) {
        if (this.a.b()) {
            try {
                this.d = 0L;
                this.b.getClass();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat");
                if (fileFromAppStorage != null) {
                    fileFromAppStorage.delete();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C0465k2(C0615p7 c0615p7) {
        this(c0615p7, new C0676rb());
    }

    public final synchronized long a(Context context) {
        long j;
        String a;
        Long l = this.d;
        if (l != null) {
            return l.longValue();
        }
        try {
            this.b.getClass();
            a = AbstractC0475kc.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(a)) {
            j = new JSONObject(a).optLong("delay");
            return j;
        }
        j = 0;
        return j;
    }
}
