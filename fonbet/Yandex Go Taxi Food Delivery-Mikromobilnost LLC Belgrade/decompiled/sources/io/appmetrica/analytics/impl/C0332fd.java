package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0332fd implements Vr {
    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(String str) {
        return str == null ? new Tr(this, false, "key is null") : str.startsWith(E8.b) ? new Tr(this, false, "key starts with appmetrica") : str.length() > 200 ? new Tr(this, false, "key length more then 200 characters") : new Tr(this, true, "");
    }
}
