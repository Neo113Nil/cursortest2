package io.appmetrica.analytics.impl;

import A1.C0015p;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562le implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int i2;
        if (bool == null) {
            i2 = -1;
        } else if (bool.equals(Boolean.TRUE)) {
            i2 = 1;
        } else {
            if (!bool.equals(Boolean.FALSE)) {
                throw new C0015p();
            }
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    public final Boolean a(int i2) {
        if (i2 != -1) {
            if (i2 == 0) {
                return Boolean.FALSE;
            }
            if (i2 == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
