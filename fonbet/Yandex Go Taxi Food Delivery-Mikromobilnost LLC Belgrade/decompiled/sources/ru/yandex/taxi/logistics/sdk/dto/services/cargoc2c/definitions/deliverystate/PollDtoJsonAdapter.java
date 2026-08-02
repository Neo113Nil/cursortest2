package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollsHeaderDto;", "pollsHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SubpollDto;", "listOfSubpollDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PollDtoJsonAdapter extends JsonAdapter<PollDto> {
    private final JsonAdapter<List<SubpollDto>> listOfSubpollDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "subpolls");
    private final JsonAdapter<PollsHeaderDto> pollsHeaderDtoAdapter;

    public PollDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pollsHeaderDtoAdapter = moshi.adapter(PollsHeaderDto.class, emptySet, "header");
        this.listOfSubpollDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SubpollDto.class), emptySet, "subpolls");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PollDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PollsHeaderDto pollsHeaderDto = null;
        List<SubpollDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                pollsHeaderDto = this.pollsHeaderDtoAdapter.fromJson(jsonReader);
                if (pollsHeaderDto == null) {
                    throw Util.unexpectedNull("header_", "header", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfSubpollDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("subpolls", "subpolls", jsonReader);
            }
        }
        jsonReader.endObject();
        if (pollsHeaderDto == null) {
            throw Util.missingProperty("header_", "header", jsonReader);
        }
        if (list != null) {
            return new PollDto(pollsHeaderDto, list);
        }
        throw Util.missingProperty("subpolls", "subpolls", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PollDto pollDto) {
        PollDto pollDto2 = pollDto;
        if (pollDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.pollsHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) pollDto2.getHeader());
        jsonWriter.name("subpolls");
        this.listOfSubpollDtoAdapter.toJson(jsonWriter, (JsonWriter) pollDto2.getSubpolls());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(29, "GeneratedJsonAdapter(PollDto)");
    }
}
