package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes2.dex */
public final class VO {

    /* renamed from: c, reason: collision with root package name */
    public static final VO f28244c;

    /* renamed from: a, reason: collision with root package name */
    public final String f28245a;

    /* renamed from: b, reason: collision with root package name */
    public final Mt f28246b;

    static {
        new VO("");
        f28244c = new VO("preload");
    }

    public VO(String str) {
        Mt mt;
        LogSessionId logSessionId;
        this.f28245a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            mt = new Mt((byte) 0, 14);
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            mt.f26393u = logSessionId;
        } else {
            mt = null;
        }
        this.f28246b = mt;
    }
}
