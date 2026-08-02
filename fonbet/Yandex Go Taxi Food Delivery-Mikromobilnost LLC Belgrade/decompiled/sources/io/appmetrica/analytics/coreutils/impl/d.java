package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.sls;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class d extends Lambda implements sls {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        PackageManager packageManager = this.a.getPackageManager();
        boolean isApiAchieved = AndroidUtils.isApiAchieved(30);
        String str = this.b;
        return isApiAchieved ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, str) : packageManager.getInstallerPackageName(str);
    }
}
