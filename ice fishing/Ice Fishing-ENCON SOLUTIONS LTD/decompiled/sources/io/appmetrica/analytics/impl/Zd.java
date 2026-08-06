package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Zd implements InterfaceC0753so {

    /* renamed from: a, reason: collision with root package name */
    public final String f5501a;

    public Zd(String str) {
        this.f5501a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(String str) {
        return TextUtils.isEmpty(str) ? new C0702qo(this, false, C1.a.k(new StringBuilder(), this.f5501a, " is empty.")) : new C0702qo(this, true, "");
    }
}
