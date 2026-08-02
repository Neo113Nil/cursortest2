package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.presenters.PlaidLinkPresenter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/blockers/presenters/PlaidLinkPresenter_PlaidLinkMetadataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/blockers/presenters/PlaidLinkPresenter$PlaidLinkMetadata;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaidLinkPresenter_PlaidLinkMetadataJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public PlaidLinkPresenter_PlaidLinkMetadataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("account_id", "link_session_id");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "account_id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "link_session_id");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("account_id", "account_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new PlaidLinkPresenter.PlaidLinkMetadata(str, str2);
        }
        throw Util.missingProperty("account_id", "account_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        PlaidLinkPresenter.PlaidLinkMetadata plaidLinkMetadata = (PlaidLinkPresenter.PlaidLinkMetadata) obj;
        jsonWriter.getClass();
        if (plaidLinkMetadata == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("account_id");
        this.stringAdapter.toJson(jsonWriter, plaidLinkMetadata.account_id);
        jsonWriter.name("link_session_id");
        this.nullableStringAdapter.toJson(jsonWriter, plaidLinkMetadata.link_session_id);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(58, "GeneratedJsonAdapter(PlaidLinkPresenter.PlaidLinkMetadata)");
    }
}
