package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0274aa f4372a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4373b;

    public F1() {
        this(new C0274aa());
    }

    public final synchronized long a(Context context) {
        String a2;
        try {
            this.f4372a.getClass();
            a2 = Ja.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a2) ? 0L : new JSONObject(a2).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f4373b) {
            return;
        }
        long a2 = a(context);
        if (a2 > 0) {
            try {
                Thread.sleep(a2);
            } catch (Throwable unused) {
            }
        }
        this.f4373b = true;
    }

    public F1(C0274aa c0274aa) {
        this.f4373b = false;
        this.f4372a = c0274aa;
    }
}
