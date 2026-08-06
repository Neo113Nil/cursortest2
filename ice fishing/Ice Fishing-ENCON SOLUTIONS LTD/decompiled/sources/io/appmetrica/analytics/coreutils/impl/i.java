package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f3811a = context;
        this.f3812b = str;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        PackageManager packageManager = this.f3811a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f3812b) : packageManager.resolveContentProvider(this.f3812b, 128);
    }
}
