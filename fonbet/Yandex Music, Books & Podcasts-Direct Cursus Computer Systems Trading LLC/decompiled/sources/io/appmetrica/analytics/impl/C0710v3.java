package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0710v3 implements Cr {
    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(Object obj) {
        C0561pr[] c0561prArr = ((C0647sr) obj).a;
        return (c0561prArr == null || c0561prArr.length == 0) ? new Ar(this, false, "attributes list is empty") : new Ar(this, true, "");
    }
}
