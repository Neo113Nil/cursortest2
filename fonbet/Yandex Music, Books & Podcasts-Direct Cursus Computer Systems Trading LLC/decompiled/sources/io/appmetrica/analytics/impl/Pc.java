package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Pc implements Cr {
    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(String str) {
        return str == null ? new Ar(this, false, "key is null") : str.startsWith(C0829z8.b) ? new Ar(this, false, "key starts with appmetrica") : str.length() > 200 ? new Ar(this, false, "key length more then 200 characters") : new Ar(this, true, "");
    }
}
