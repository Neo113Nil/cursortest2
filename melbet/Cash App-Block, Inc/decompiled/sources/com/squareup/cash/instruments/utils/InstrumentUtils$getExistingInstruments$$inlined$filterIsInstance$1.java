package com.squareup.cash.instruments.utils;

import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InstrumentUtils$getExistingInstruments$$inlined$filterIsInstance$1 implements Function1 {
    public static final InstrumentUtils$getExistingInstruments$$inlined$filterIsInstance$1 INSTANCE = new InstrumentUtils$getExistingInstruments$$inlined$filterIsInstance$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(obj instanceof SelectPaymentInstrumentOption.ExistingOption);
    }
}
