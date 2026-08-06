package io.appmetrica.analytics.impl;

import h1.C0237g;
import h1.InterfaceC0233c;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896yb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f7231a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0233c f7232b = R1.d.y(new C0870xb(this));

    public C0896yb(X4 x4) {
        this.f7231a = x4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0539kh getConfig() {
        return (C0539kh) ((C0237g) this.f7232b).a();
    }
}
