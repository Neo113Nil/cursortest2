package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.uif;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class d extends uif implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.a = context;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.a.getPackageManager();
        boolean isApiAchieved = AndroidUtils.isApiAchieved(30);
        String str = this.b;
        return isApiAchieved ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, str) : packageManager.getInstallerPackageName(str);
    }
}
