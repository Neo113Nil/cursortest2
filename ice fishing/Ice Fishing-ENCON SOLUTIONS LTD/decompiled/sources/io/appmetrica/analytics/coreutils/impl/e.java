package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i2) {
        super(0);
        this.f3800a = context;
        this.f3801b = str;
        this.f3802c = i2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        return this.f3800a.getPackageManager().getPackageInfo(this.f3801b, this.f3802c);
    }
}
