package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3799b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f3798a = context;
        this.f3799b = str;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        PackageManager packageManager = this.f3798a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f3799b) : packageManager.getInstallerPackageName(this.f3799b);
    }
}
