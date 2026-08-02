package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes9.dex */
public abstract class H6 extends BaseRequestConfig.ComponentLoader {
    public final SafePackageManager a;

    public H6(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a */
    public I6 load(G6 g6) {
        I6 i6 = (I6) super.load((H6) g6);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            i6.a = (i & 2) != 0 ? "1" : "0";
            i6.b = (i & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            i6.a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            i6.b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            i6.a = "0";
            i6.b = "0";
        }
        Bp bp = g6.a;
        i6.c = bp;
        i6.setRetryPolicyConfig(bp.u);
        return i6;
    }

    public H6(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.a = safePackageManager;
    }
}
