package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes2.dex */
public final class IO {

    /* renamed from: c, reason: collision with root package name */
    public static final IO f26241c;

    /* renamed from: a, reason: collision with root package name */
    public final String f26242a;

    /* renamed from: b, reason: collision with root package name */
    public final C3557lt f26243b;

    static {
        new IO("");
        f26241c = new IO("preload");
    }

    public IO(String str) {
        C3557lt c3557lt;
        LogSessionId logSessionId;
        this.f26242a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            c3557lt = new C3557lt((byte) 0, 15);
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            c3557lt.f32643u = logSessionId;
        } else {
            c3557lt = null;
        }
        this.f26243b = c3557lt;
    }
}
