package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileDto;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$HeaderDto;", "nullableHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "nullableTileFooterDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "nullableBackgroundDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;", "nullableBadgeDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "nullableActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "nullableIconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$ImagePositionDto;", "imagePositionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$StyleDto;", "nullableStyleDtoAdapter", "", "nullableStringAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TileDtoJsonAdapter extends JsonAdapter<TileDto> {
    private volatile Constructor<TileDto> constructorRef;
    private final JsonAdapter<TileDto.ImagePositionDto> imagePositionDtoAdapter;
    private final JsonAdapter<ActionDto> nullableActionDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<BackgroundDto> nullableBackgroundDtoAdapter;
    private final JsonAdapter<BadgeDto> nullableBadgeDtoAdapter;
    private final JsonAdapter<TileDto.HeaderDto> nullableHeaderDtoAdapter;
    private final JsonAdapter<IconDto> nullableIconDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TileDto.StyleDto> nullableStyleDtoAdapter;
    private final JsonAdapter<TileFooterDto> nullableTileFooterDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "footer", C0553n3.g, "badge", "action", "image", "image_position", "style", "metrica_label", Constants.REFERRER_API_META);

    public TileDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableHeaderDtoAdapter = moshi.adapter(TileDto.HeaderDto.class, emptySet, "header");
        this.nullableTileFooterDtoAdapter = moshi.adapter(TileFooterDto.class, emptySet, "footer");
        this.nullableBackgroundDtoAdapter = moshi.adapter(BackgroundDto.class, emptySet, C0553n3.g);
        this.nullableBadgeDtoAdapter = moshi.adapter(BadgeDto.class, emptySet, "badge");
        this.nullableActionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "action");
        this.nullableIconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "image");
        this.imagePositionDtoAdapter = moshi.adapter(TileDto.ImagePositionDto.class, emptySet, "imagePosition");
        this.nullableStyleDtoAdapter = moshi.adapter(TileDto.StyleDto.class, emptySet, "style");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TileDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        TileDto.HeaderDto headerDto = null;
        TileFooterDto tileFooterDto = null;
        BackgroundDto backgroundDto = null;
        BadgeDto badgeDto = null;
        ActionDto actionDto = null;
        IconDto iconDto = null;
        TileDto.ImagePositionDto imagePositionDto = null;
        TileDto.StyleDto styleDto = null;
        String str = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    headerDto = this.nullableHeaderDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    tileFooterDto = this.nullableTileFooterDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    backgroundDto = this.nullableBackgroundDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    badgeDto = this.nullableBadgeDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    actionDto = this.nullableActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    iconDto = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    imagePositionDto = this.imagePositionDtoAdapter.fromJson(jsonReader);
                    if (imagePositionDto == null) {
                        throw Util.unexpectedNull("imagePosition", "image_position", jsonReader);
                    }
                    i = -65;
                    break;
                case 7:
                    styleDto = this.nullableStyleDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -65) {
            String str2 = str;
            TileDto.StyleDto styleDto2 = styleDto;
            TileDto.ImagePositionDto imagePositionDto2 = imagePositionDto;
            IconDto iconDto2 = iconDto;
            ActionDto actionDto2 = actionDto;
            BadgeDto badgeDto2 = badgeDto;
            return new TileDto(headerDto, tileFooterDto, backgroundDto, badgeDto2, actionDto2, iconDto2, imagePositionDto2, styleDto2, str2, obj);
        }
        String str3 = str;
        TileDto.StyleDto styleDto3 = styleDto;
        TileDto.ImagePositionDto imagePositionDto3 = imagePositionDto;
        IconDto iconDto3 = iconDto;
        ActionDto actionDto3 = actionDto;
        BadgeDto badgeDto3 = badgeDto;
        BackgroundDto backgroundDto2 = backgroundDto;
        TileFooterDto tileFooterDto2 = tileFooterDto;
        TileDto.HeaderDto headerDto2 = headerDto;
        Constructor<TileDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TileDto.class.getDeclaredConstructor(TileDto.HeaderDto.class, TileFooterDto.class, BackgroundDto.class, BadgeDto.class, ActionDto.class, IconDto.class, TileDto.ImagePositionDto.class, TileDto.StyleDto.class, String.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(headerDto2, tileFooterDto2, backgroundDto2, badgeDto3, actionDto3, iconDto3, imagePositionDto3, styleDto3, str3, obj, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TileDto tileDto) {
        TileDto tileDto2 = tileDto;
        if (tileDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.nullableHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getHeader());
        jsonWriter.name("footer");
        this.nullableTileFooterDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getFooter());
        jsonWriter.name(C0553n3.g);
        this.nullableBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getBackground());
        jsonWriter.name("badge");
        this.nullableBadgeDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getBadge());
        jsonWriter.name("action");
        this.nullableActionDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getAction());
        jsonWriter.name("image");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getImage());
        jsonWriter.name("image_position");
        this.imagePositionDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getImagePosition());
        jsonWriter.name("style");
        this.nullableStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getStyle());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) tileDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(29, "GeneratedJsonAdapter(TileDto)");
    }
}
