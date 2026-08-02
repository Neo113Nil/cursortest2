package com.squareup.cash.instruments.utils;

import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentUtils$getExistingInstruments$1 extends PropertyReference1Impl {
    public static final InstrumentUtils$getExistingInstruments$1 INSTANCE = new InstrumentUtils$getExistingInstruments$1(SelectPaymentInstrumentOption.class, "enabled", "getEnabled()Z", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((SelectPaymentInstrumentOption) obj).getEnabled());
    }
}
