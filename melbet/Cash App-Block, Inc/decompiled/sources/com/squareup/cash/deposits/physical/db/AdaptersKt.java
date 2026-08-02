package com.squareup.cash.deposits.physical.db;

import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final RecipientConfig$Adapter paperDepositBarcodeAdapter = new RecipientConfig$Adapter(new WireAdapter(GetPaperCashDepositBarcodeResponse.Success.ADAPTER), new WireAdapter(GetPaperCashDepositBarcodeResponse.Failure.ADAPTER));
}
