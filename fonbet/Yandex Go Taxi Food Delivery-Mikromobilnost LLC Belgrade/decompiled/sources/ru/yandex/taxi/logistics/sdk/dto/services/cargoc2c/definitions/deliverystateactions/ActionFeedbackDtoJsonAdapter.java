package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionFeedbackDto;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FeedbackSubtitleDto;", "listOfFeedbackSubtitleDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FeedbackReasonDto;", "nullableListOfFeedbackReasonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionFeedbackDto$LastFeedbackDto;", "nullableLastFeedbackDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionFeedbackDtoJsonAdapter extends JsonAdapter<ActionFeedbackDto> {
    private final JsonAdapter<List<FeedbackSubtitleDto>> listOfFeedbackSubtitleDtoAdapter;
    private final JsonAdapter<ActionFeedbackDto.LastFeedbackDto> nullableLastFeedbackDtoAdapter;
    private final JsonAdapter<List<FeedbackReasonDto>> nullableListOfFeedbackReasonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitles", IssuingDistributionPointExtension.REASONS, "last_feedback");
    private final JsonAdapter<String> stringAdapter;

    public ActionFeedbackDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.listOfFeedbackSubtitleDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FeedbackSubtitleDto.class), emptySet, "subtitles");
        this.nullableListOfFeedbackReasonDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FeedbackReasonDto.class), emptySet, IssuingDistributionPointExtension.REASONS);
        this.nullableLastFeedbackDtoAdapter = moshi.adapter(ActionFeedbackDto.LastFeedbackDto.class, emptySet, "lastFeedback");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionFeedbackDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<FeedbackSubtitleDto> list = null;
        List<FeedbackReasonDto> list2 = null;
        ActionFeedbackDto.LastFeedbackDto lastFeedbackDto = null;
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
                list = this.listOfFeedbackSubtitleDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("subtitles", "subtitles", jsonReader);
                }
            } else if (selectName == 2) {
                list2 = this.nullableListOfFeedbackReasonDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                lastFeedbackDto = this.nullableLastFeedbackDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list != null) {
            return new ActionFeedbackDto(str, list, list2, lastFeedbackDto);
        }
        throw Util.missingProperty("subtitles", "subtitles", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionFeedbackDto actionFeedbackDto) {
        ActionFeedbackDto actionFeedbackDto2 = actionFeedbackDto;
        if (actionFeedbackDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionFeedbackDto2.getTitle());
        jsonWriter.name("subtitles");
        this.listOfFeedbackSubtitleDtoAdapter.toJson(jsonWriter, (JsonWriter) actionFeedbackDto2.getSubtitles());
        jsonWriter.name(IssuingDistributionPointExtension.REASONS);
        this.nullableListOfFeedbackReasonDtoAdapter.toJson(jsonWriter, (JsonWriter) actionFeedbackDto2.getReasons());
        jsonWriter.name("last_feedback");
        this.nullableLastFeedbackDtoAdapter.toJson(jsonWriter, (JsonWriter) actionFeedbackDto2.getLastFeedback());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(ActionFeedbackDto)");
    }
}
