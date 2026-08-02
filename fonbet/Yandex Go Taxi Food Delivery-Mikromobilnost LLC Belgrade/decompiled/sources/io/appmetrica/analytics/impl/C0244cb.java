package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.cb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0244cb {
    public final Context a;
    public final C0691rq b;
    public final L3 c;
    public final SafePackageManager d;

    public C0244cb(Context context) {
        this(context, new C0691rq(context, "io.appmetrica.analytics.build_id"), new L3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }

    public C0244cb(Context context, C0691rq c0691rq, L3 l3, SafePackageManager safePackageManager) {
        this.a = context;
        this.b = c0691rq;
        this.c = l3;
        this.d = safePackageManager;
    }
}
