package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;

/* loaded from: classes.dex */
public final class I implements Savable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f4491a;

    public I(J j2) {
        this.f4491a = j2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f4491a.f4557a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z2) {
        this.f4491a.f4557a.e(z2);
    }
}
