package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class Lo implements H1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J1 f4720b;

    public /* synthetic */ Lo(J1 j12, int i2) {
        this.f4719a = i2;
        this.f4720b = j12;
    }

    @Override // io.appmetrica.analytics.impl.H1
    public final boolean a(Intent intent) {
        switch (this.f4719a) {
            case 0:
                return J1.b(this.f4720b, intent);
            case 1:
                return J1.a(this.f4720b, intent);
            default:
                return J1.c(this.f4720b, intent);
        }
    }
}
