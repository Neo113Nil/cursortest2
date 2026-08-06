package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafePackageManager f3796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.f3796a = safePackageManager;
        this.f3797b = context;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        SafePackageManager safePackageManager = this.f3796a;
        Context context = this.f3797b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
