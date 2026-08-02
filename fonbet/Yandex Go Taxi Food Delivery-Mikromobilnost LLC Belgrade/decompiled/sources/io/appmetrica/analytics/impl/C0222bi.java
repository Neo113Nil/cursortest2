package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0222bi implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(EnumC0271d9 enumC0271d9) {
        int ordinal = enumC0271d9.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC0271d9 toModel(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return EnumC0271d9.d;
        }
        if (intValue == 2) {
            return EnumC0271d9.f;
        }
        if (intValue != 3) {
            return EnumC0271d9.c;
        }
        return EnumC0271d9.e;
    }
}
