package com.squareup.cash.afterpayapplet.db;

import app.cash.local.db.Local_tab_content;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;

/* loaded from: classes.dex */
public abstract class AdapterKt {
    public static final BlockersConfig.Adapter afterpayAppletAdapter = new BlockersConfig.Adapter(new WireAdapter(AfterpayAppletResponse.ADAPTER));
    public static final Local_tab_content.Adapter afterpayAppletMerchantSheetAdapter = new Local_tab_content.Adapter(new WireAdapter(AfterpayMerchantSheetResponse.ADAPTER));
}
