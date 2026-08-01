package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes2.dex */
public final class IO {

    /* renamed from: c, reason: collision with root package name */
    public static final IO f25498c;

    /* renamed from: a, reason: collision with root package name */
    public final String f25499a;

    /* renamed from: b, reason: collision with root package name */
    public final C3534lt f25500b;

    static {
        new IO("");
        f25498c = new IO("preload");
    }

    public IO(String str) {
        C3534lt c3534lt;
        LogSessionId logSessionId;
        this.f25499a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            c3534lt = new C3534lt((byte) 0, 15);
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            c3534lt.f31863u = logSessionId;
        } else {
            c3534lt = null;
        }
        this.f25500b = c3534lt;
    }
}
