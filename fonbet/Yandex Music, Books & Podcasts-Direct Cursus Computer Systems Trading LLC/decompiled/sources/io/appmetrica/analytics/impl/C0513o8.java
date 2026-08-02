package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0513o8 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0514o9 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC0571q8.a;
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0571q8.a) <= 0 && unscaledValue.compareTo(AbstractC0571q8.b) >= 0) {
                C0542p8 c0542p8 = new C0542p8(Long.valueOf(unscaledValue.longValue()).longValue(), Integer.valueOf(i).intValue());
                C0514o9 c0514o9 = new C0514o9();
                c0514o9.a = c0542p8.a;
                c0514o9.b = c0542p8.b;
                return c0514o9;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final BigDecimal a(@NonNull C0514o9 c0514o9) {
        throw new UnsupportedOperationException();
    }
}
