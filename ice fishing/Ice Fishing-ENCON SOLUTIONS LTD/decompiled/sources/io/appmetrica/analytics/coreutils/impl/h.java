package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f3809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i2) {
        super(0);
        this.f3808a = context;
        this.f3809b = intent;
        this.f3810c = i2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return this.f3808a.getPackageManager().resolveActivity(this.f3809b, this.f3810c);
    }
}
