package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f3806a = context;
        this.f3807b = str;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return Boolean.valueOf(this.f3806a.getPackageManager().hasSystemFeature(this.f3807b));
    }
}
