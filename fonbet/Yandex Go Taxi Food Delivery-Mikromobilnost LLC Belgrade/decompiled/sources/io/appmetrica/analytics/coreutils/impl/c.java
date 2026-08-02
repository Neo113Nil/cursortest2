package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import defpackage.sls;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class c extends Lambda implements sls {
    public final /* synthetic */ SafePackageManager a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.a = safePackageManager;
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        SafePackageManager safePackageManager = this.a;
        Context context = this.b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
