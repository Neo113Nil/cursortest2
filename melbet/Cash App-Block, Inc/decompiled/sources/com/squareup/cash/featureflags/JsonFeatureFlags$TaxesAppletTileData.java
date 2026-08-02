package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.protos.cash.tax.EntryTileConfiguration;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$TaxesAppletTileData extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$TaxesAppletTileData INSTANCE = new JsonFeatureFlags$TaxesAppletTileData(EntryTileConfiguration.class, new FeatureFlag$JsonFeatureFlag.Options("empty", new EntryTileConfiguration(null, null, null, null, null, ByteString.EMPTY)), "cashclient/taxes_applet_tile_data");
}
