package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes5.dex */
public final class Lh implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@NonNull X8 x8) {
        int ordinal = x8.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X8 toModel(@NonNull Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return X8.c;
        }
        if (intValue == 2) {
            return X8.e;
        }
        if (intValue != 3) {
            return X8.b;
        }
        return X8.d;
    }
}
