package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/CommentPopupDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/CommentPopupDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommentPopupDtoJsonAdapter extends JsonAdapter<CommentPopupDto> {
    private final JsonReader.Options options = JsonReader.Options.of("title", Constants.KEY_MESSAGE, "continue_button_text", "cancel_button_text");
    private final JsonAdapter<String> stringAdapter;

    public CommentPopupDtoJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CommentPopupDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("continueButtonText", "continue_button_text", jsonReader);
                }
            } else if (selectName == 3 && (str4 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("cancelButtonText", "cancel_button_text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(Constants.KEY_MESSAGE, Constants.KEY_MESSAGE, jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty("continueButtonText", "continue_button_text", jsonReader);
        }
        if (str4 != null) {
            return new CommentPopupDto(str, str2, str3, str4);
        }
        throw Util.missingProperty("cancelButtonText", "cancel_button_text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CommentPopupDto commentPopupDto) {
        CommentPopupDto commentPopupDto2 = commentPopupDto;
        if (commentPopupDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) commentPopupDto2.getTitle());
        jsonWriter.name(Constants.KEY_MESSAGE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) commentPopupDto2.getMessage());
        jsonWriter.name("continue_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) commentPopupDto2.getContinueButtonText());
        jsonWriter.name("cancel_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) commentPopupDto2.getCancelButtonText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(CommentPopupDto)");
    }
}
