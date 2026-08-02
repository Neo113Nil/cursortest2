package io.appmetrica.analytics.impl;

import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.uh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0769uh implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(String str) {
        if ("native".equals(str)) {
            str = "JVM";
        }
        return str.getBytes(uza.a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
