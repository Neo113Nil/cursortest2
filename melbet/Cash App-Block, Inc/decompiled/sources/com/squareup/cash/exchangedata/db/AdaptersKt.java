package com.squareup.cash.exchangedata.db;

import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.ExchangeRate;
import papa.internal.LaunchTracker;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final LaunchTracker exchangeDataAdapter = new LaunchTracker(new EnumColumnAdapter(CurrencyCode.values()), new EnumColumnAdapter(CurrencyCode.values()), new WireRepeatedAdapter(ExchangeRate.ADAPTER, 0));
}
