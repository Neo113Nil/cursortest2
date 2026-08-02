package com.squareup.cash.deposits.physical.presenter.address;

import com.squareup.cash.cdf.Event;

/* loaded from: classes6.dex */
public interface AddressAnalyticsFactory {
    Event searchAddressEvent();

    Event selectAddressEvent(boolean z);
}
