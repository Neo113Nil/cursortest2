package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f3814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i2) {
        super(0);
        this.f3813a = context;
        this.f3814b = intent;
        this.f3815c = i2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return this.f3813a.getPackageManager().resolveService(this.f3814b, this.f3815c);
    }
}
