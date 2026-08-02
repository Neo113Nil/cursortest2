package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0731t8 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0761u9 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC0789v8.a;
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0789v8.a) <= 0 && unscaledValue.compareTo(AbstractC0789v8.b) >= 0) {
                Pair pair = new Pair(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
                C0760u8 c0760u8 = new C0760u8(((Number) pair.c()).longValue(), ((Number) pair.f()).intValue());
                C0761u9 c0761u9 = new C0761u9();
                c0761u9.a = c0760u8.a;
                c0761u9.b = c0760u8.b;
                return c0761u9;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final BigDecimal a(C0761u9 c0761u9) {
        throw new UnsupportedOperationException();
    }
}
