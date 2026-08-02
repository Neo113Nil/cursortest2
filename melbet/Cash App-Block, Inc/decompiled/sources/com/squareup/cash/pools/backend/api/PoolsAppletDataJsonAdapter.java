package com.squareup.cash.pools.backend.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.common.CurrencyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/pools/backend/api/PoolsAppletDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/pools/backend/api/PoolsAppletData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PoolsAppletDataJsonAdapter extends JsonAdapter {
    public final JsonAdapter currencyCodeAdapter;
    public final JsonAdapter intAdapter;
    public final JsonAdapter listOfPoolAppletPreviewAdapter;
    public final JsonReader.Options options;

    public PoolsAppletDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("activePoolsCount", "closedPoolsCount", AppsFlyerProperties.CURRENCY_CODE, "highlightedPools");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "activePoolsCount");
        this.currencyCodeAdapter = moshi.adapter(CurrencyCode.class, emptySet, AppsFlyerProperties.CURRENCY_CODE);
        this.listOfPoolAppletPreviewAdapter = moshi.adapter(Types.newParameterizedType(List.class, PoolAppletPreview.class), emptySet, "highlightedPools");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        CurrencyCode currencyCode = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.intAdapter;
                if (selectName == 0) {
                    num = (Integer) jsonAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("activePoolsCount", "activePoolsCount", jsonReader);
                    }
                } else if (selectName == 1) {
                    num2 = (Integer) jsonAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("closedPoolsCount", "closedPoolsCount", jsonReader);
                    }
                } else if (selectName == 2) {
                    currencyCode = (CurrencyCode) this.currencyCodeAdapter.fromJson(jsonReader);
                    if (currencyCode == null) {
                        throw Util.unexpectedNull(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
                    }
                } else if (selectName == 3 && (list = (List) this.listOfPoolAppletPreviewAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("highlightedPools", "highlightedPools", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("activePoolsCount", "activePoolsCount", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("closedPoolsCount", "closedPoolsCount", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (currencyCode == null) {
            throw Util.missingProperty(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
        }
        if (list != null) {
            return new PoolsAppletData(intValue, intValue2, currencyCode, list);
        }
        throw Util.missingProperty("highlightedPools", "highlightedPools", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        PoolsAppletData poolsAppletData = (PoolsAppletData) obj;
        jsonWriter.getClass();
        if (poolsAppletData == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("activePoolsCount");
        Integer valueOf = Integer.valueOf(poolsAppletData.activePoolsCount);
        JsonAdapter jsonAdapter = this.intAdapter;
        jsonAdapter.toJson(jsonWriter, valueOf);
        jsonWriter.name("closedPoolsCount");
        jsonAdapter.toJson(jsonWriter, Integer.valueOf(poolsAppletData.closedPoolsCount));
        jsonWriter.name(AppsFlyerProperties.CURRENCY_CODE);
        this.currencyCodeAdapter.toJson(jsonWriter, poolsAppletData.currencyCode);
        jsonWriter.name("highlightedPools");
        this.listOfPoolAppletPreviewAdapter.toJson(jsonWriter, poolsAppletData.highlightedPools);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(37, "GeneratedJsonAdapter(PoolsAppletData)");
    }
}
