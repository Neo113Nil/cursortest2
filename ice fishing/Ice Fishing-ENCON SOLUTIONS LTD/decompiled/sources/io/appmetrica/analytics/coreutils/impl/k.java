package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import h1.C0239i;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f3817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i2, int i3) {
        super(0);
        this.f3816a = context;
        this.f3817b = componentName;
        this.f3818c = i2;
        this.f3819d = i3;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        this.f3816a.getPackageManager().setComponentEnabledSetting(this.f3817b, this.f3818c, this.f3819d);
        return C0239i.f3393a;
    }
}
