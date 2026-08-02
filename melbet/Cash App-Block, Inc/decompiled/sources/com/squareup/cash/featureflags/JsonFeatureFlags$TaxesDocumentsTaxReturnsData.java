package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.protos.cash.tax.DocumentsTaxReturnsConfiguration;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$TaxesDocumentsTaxReturnsData extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$TaxesDocumentsTaxReturnsData INSTANCE = new JsonFeatureFlags$TaxesDocumentsTaxReturnsData(DocumentsTaxReturnsConfiguration.class, new FeatureFlag$JsonFeatureFlag.Options("empty", new DocumentsTaxReturnsConfiguration(null, null, null, null, null, ByteString.EMPTY)), "cashclient/taxes_documents_tax_returns_data");
}
