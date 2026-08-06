package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f3804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i2) {
        super(0);
        this.f3803a = context;
        this.f3804b = componentName;
        this.f3805c = i2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return this.f3803a.getPackageManager().getServiceInfo(this.f3804b, this.f3805c);
    }
}
