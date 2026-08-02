package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionDescriptionBlockDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionProgressBlockDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/MissionResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/MissionResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressBlockDto;", "missionProgressBlockDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionDescriptionBlockDto;", "missionDescriptionBlockDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;", "buttonDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MissionResponseDtoJsonAdapter extends JsonAdapter<MissionResponseDto> {
    private final JsonAdapter<ButtonDto> buttonDtoAdapter;
    private final JsonAdapter<MissionDescriptionBlockDto> missionDescriptionBlockDtoAdapter;
    private final JsonAdapter<MissionProgressBlockDto> missionProgressBlockDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("progress", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "button");

    public MissionResponseDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.missionProgressBlockDtoAdapter = moshi.adapter(MissionProgressBlockDto.class, emptySet, "progress");
        this.missionDescriptionBlockDtoAdapter = moshi.adapter(MissionDescriptionBlockDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.buttonDtoAdapter = moshi.adapter(ButtonDto.class, emptySet, "button");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MissionResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MissionProgressBlockDto missionProgressBlockDto = null;
        MissionDescriptionBlockDto missionDescriptionBlockDto = null;
        ButtonDto buttonDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                missionProgressBlockDto = this.missionProgressBlockDtoAdapter.fromJson(jsonReader);
                if (missionProgressBlockDto == null) {
                    throw Util.unexpectedNull("progress", "progress", jsonReader);
                }
            } else if (selectName == 1) {
                missionDescriptionBlockDto = this.missionDescriptionBlockDtoAdapter.fromJson(jsonReader);
                if (missionDescriptionBlockDto == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 2 && (buttonDto = this.buttonDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("button", "button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (missionProgressBlockDto == null) {
            throw Util.missingProperty("progress", "progress", jsonReader);
        }
        if (missionDescriptionBlockDto == null) {
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        if (buttonDto != null) {
            return new MissionResponseDto(missionProgressBlockDto, missionDescriptionBlockDto, buttonDto);
        }
        throw Util.missingProperty("button", "button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MissionResponseDto missionResponseDto) {
        MissionResponseDto missionResponseDto2 = missionResponseDto;
        if (missionResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("progress");
        this.missionProgressBlockDtoAdapter.toJson(jsonWriter, (JsonWriter) missionResponseDto2.getProgress());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.missionDescriptionBlockDtoAdapter.toJson(jsonWriter, (JsonWriter) missionResponseDto2.getDescription());
        jsonWriter.name("button");
        this.buttonDtoAdapter.toJson(jsonWriter, (JsonWriter) missionResponseDto2.getButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(MissionResponseDto)");
    }
}
