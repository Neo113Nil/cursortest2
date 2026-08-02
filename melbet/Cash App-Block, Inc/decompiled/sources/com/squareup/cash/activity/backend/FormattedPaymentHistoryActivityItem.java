package com.squareup.cash.activity.backend;

import com.squareup.protos.franklin.ui.PaymentHistoryData;

/* loaded from: classes5.dex */
public interface FormattedPaymentHistoryActivityItem extends PaymentHistoryActivityItem, ActivityFormattingResult {
    PaymentHistoryData getPaymentHistoryData();
}
