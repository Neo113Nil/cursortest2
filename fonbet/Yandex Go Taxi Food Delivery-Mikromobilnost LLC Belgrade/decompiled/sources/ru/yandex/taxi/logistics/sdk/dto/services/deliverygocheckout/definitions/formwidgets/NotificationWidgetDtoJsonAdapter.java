package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NotificationWidgetDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NotificationWidgetDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailNavDto;", "nullableTrailNavDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationWidgetDtoJsonAdapter extends JsonAdapter<NotificationWidgetDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonAdapter<TrailNavDto> nullableTrailNavDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("widget_id", "trail_nav", "lead_icon", "title", "subtitle", "action", "background_color", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public NotificationWidgetDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "widgetId");
        this.nullableTrailNavDtoAdapter = moshi.adapter(TrailNavDto.class, emptySet, "trailNav");
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "leadIcon");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "subtitle");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NotificationWidgetDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TrailNavDto trailNavDto = null;
        ImageDto imageDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        TapActionDto tapActionDto = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            String str4 = str;
            if (!jsonReader.hasNext()) {
                TrailNavDto trailNavDto2 = trailNavDto;
                jsonReader.endObject();
                if (str4 == null) {
                    throw Util.missingProperty("widgetId", "widget_id", jsonReader);
                }
                if (imageDto == null) {
                    throw Util.missingProperty("leadIcon", "lead_icon", jsonReader);
                }
                if (attributedTextDto2 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (str2 != null) {
                    return new NotificationWidgetDto(str4, trailNavDto2, imageDto, attributedTextDto, attributedTextDto2, tapActionDto, str2, str3);
                }
                throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
            }
            TrailNavDto trailNavDto3 = trailNavDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    trailNavDto = trailNavDto3;
                    str = str4;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("widgetId", "widget_id", jsonReader);
                    }
                    trailNavDto = trailNavDto3;
                case 1:
                    trailNavDto = this.nullableTrailNavDtoAdapter.fromJson(jsonReader);
                    str = str4;
                case 2:
                    imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                    if (imageDto == null) {
                        throw Util.unexpectedNull("leadIcon", "lead_icon", jsonReader);
                    }
                    trailNavDto = trailNavDto3;
                    str = str4;
                case 3:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    trailNavDto = trailNavDto3;
                    str = str4;
                case 4:
                    attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    trailNavDto = trailNavDto3;
                    str = str4;
                case 5:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    trailNavDto = trailNavDto3;
                    str = str4;
                case 6:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    trailNavDto = trailNavDto3;
                    str = str4;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    trailNavDto = trailNavDto3;
                    str = str4;
                default:
                    trailNavDto = trailNavDto3;
                    str = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NotificationWidgetDto notificationWidgetDto) {
        NotificationWidgetDto notificationWidgetDto2 = notificationWidgetDto;
        if (notificationWidgetDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("widget_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getWidgetId());
        jsonWriter.name("trail_nav");
        this.nullableTrailNavDtoAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getTrailNav());
        jsonWriter.name("lead_icon");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getLeadIcon());
        jsonWriter.name("title");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getTitle());
        jsonWriter.name("subtitle");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getSubtitle());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getAction());
        jsonWriter.name("background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getBackgroundColor());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) notificationWidgetDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(NotificationWidgetDto)");
    }
}
