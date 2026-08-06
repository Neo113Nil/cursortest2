package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i2) {
        super(0);
        this.f3793a = context;
        this.f3794b = str;
        this.f3795c = i2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return this.f3793a.getPackageManager().getApplicationInfo(this.f3794b, this.f3795c);
    }
}
