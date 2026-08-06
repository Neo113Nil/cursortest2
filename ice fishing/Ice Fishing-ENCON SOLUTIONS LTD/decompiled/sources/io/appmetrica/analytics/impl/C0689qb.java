package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689qb implements InterfaceC0753so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(String str) {
        return str == null ? new C0702qo(this, false, "key is null") : str.startsWith(G7.f4414b) ? new C0702qo(this, false, "key starts with appmetrica") : str.length() > 200 ? new C0702qo(this, false, "key length more then 200 characters") : new C0702qo(this, true, "");
    }
}
