package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions.MissionProgressDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$TypeDto;", "typeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "iconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$BadgeDto;", "badgeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$ProgressIndicatorDto;", "progressIndicatorDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MissionProgressDtoJsonAdapter extends JsonAdapter<MissionProgressDto> {
    private final JsonAdapter<MissionProgressDto.BadgeDto> badgeDtoAdapter;
    private final JsonAdapter<IconDto> iconDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "icon", "badge", "progress_indicator");
    private final JsonAdapter<MissionProgressDto.ProgressIndicatorDto> progressIndicatorDtoAdapter;
    private final JsonAdapter<MissionProgressDto.TypeDto> typeDtoAdapter;

    public MissionProgressDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.typeDtoAdapter = moshi.adapter(MissionProgressDto.TypeDto.class, emptySet, "type");
        this.iconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "icon");
        this.badgeDtoAdapter = moshi.adapter(MissionProgressDto.BadgeDto.class, emptySet, "badge");
        this.progressIndicatorDtoAdapter = moshi.adapter(MissionProgressDto.ProgressIndicatorDto.class, emptySet, "progressIndicator");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MissionProgressDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        MissionProgressDto.TypeDto typeDto = null;
        IconDto iconDto = null;
        MissionProgressDto.BadgeDto badgeDto = null;
        MissionProgressDto.ProgressIndicatorDto progressIndicatorDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                typeDto = this.typeDtoAdapter.fromJson(jsonReader);
                if (typeDto == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                iconDto = this.iconDtoAdapter.fromJson(jsonReader);
                if (iconDto == null) {
                    throw Util.unexpectedNull("icon", "icon", jsonReader);
                }
            } else if (selectName == 2) {
                badgeDto = this.badgeDtoAdapter.fromJson(jsonReader);
                if (badgeDto == null) {
                    throw Util.unexpectedNull("badge", "badge", jsonReader);
                }
            } else if (selectName == 3 && (progressIndicatorDto = this.progressIndicatorDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("progressIndicator", "progress_indicator", jsonReader);
            }
        }
        jsonReader.endObject();
        if (typeDto == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (iconDto == null) {
            throw Util.missingProperty("icon", "icon", jsonReader);
        }
        if (badgeDto == null) {
            throw Util.missingProperty("badge", "badge", jsonReader);
        }
        if (progressIndicatorDto != null) {
            return new MissionProgressDto(typeDto, iconDto, badgeDto, progressIndicatorDto);
        }
        throw Util.missingProperty("progressIndicator", "progress_indicator", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MissionProgressDto missionProgressDto) {
        MissionProgressDto missionProgressDto2 = missionProgressDto;
        if (missionProgressDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.typeDtoAdapter.toJson(jsonWriter, (JsonWriter) missionProgressDto2.getType());
        jsonWriter.name("icon");
        this.iconDtoAdapter.toJson(jsonWriter, (JsonWriter) missionProgressDto2.getIcon());
        jsonWriter.name("badge");
        this.badgeDtoAdapter.toJson(jsonWriter, (JsonWriter) missionProgressDto2.getBadge());
        jsonWriter.name("progress_indicator");
        this.progressIndicatorDtoAdapter.toJson(jsonWriter, (JsonWriter) missionProgressDto2.getProgressIndicator());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(MissionProgressDto)");
    }
}
