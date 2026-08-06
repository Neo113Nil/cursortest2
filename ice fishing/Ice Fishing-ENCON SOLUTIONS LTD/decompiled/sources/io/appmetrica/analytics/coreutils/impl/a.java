package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f3791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i2) {
        super(0);
        this.f3790a = context;
        this.f3791b = componentName;
        this.f3792c = i2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return this.f3790a.getPackageManager().getActivityInfo(this.f3791b, this.f3792c);
    }
}
