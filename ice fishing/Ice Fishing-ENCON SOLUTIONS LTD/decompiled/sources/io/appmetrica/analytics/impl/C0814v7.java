package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814v7 implements ProtobufConverter {
    public final BigDecimal a(C0427g8 c0427g8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0427g8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC0866x7.f7192a;
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0866x7.f7192a) <= 0 && unscaledValue.compareTo(AbstractC0866x7.f7193b) >= 0) {
                C0840w7 c0840w7 = new C0840w7(Long.valueOf(unscaledValue.longValue()).longValue(), Integer.valueOf(i2).intValue());
                C0427g8 c0427g8 = new C0427g8();
                c0427g8.f6056a = c0840w7.f7094a;
                c0427g8.f6057b = c0840w7.f7095b;
                return c0427g8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i2++;
        }
    }
}
