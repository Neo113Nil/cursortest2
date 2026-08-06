package io.appmetrica.analytics.impl;

import android.app.Activity;

/* loaded from: classes.dex */
public final /* synthetic */ class Vo implements InterfaceC0278ae {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wk f5270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f5271c;

    public /* synthetic */ Vo(Wk wk, Activity activity, int i2) {
        this.f5269a = i2;
        this.f5270b = wk;
        this.f5271c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0278ae
    public final void consume(Object obj) {
        switch (this.f5269a) {
            case 0:
                this.f5270b.a(this.f5271c, (C0457hc) obj);
                break;
            default:
                this.f5270b.b(this.f5271c, (C0457hc) obj);
                break;
        }
    }
}
