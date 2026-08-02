package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableAttributedTextDtoAdapter", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "imageDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemBadgeDto;", "nullableScrollableItemBadgeDtoAdapter", "", "nullableAnyAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScrollableItemDtoJsonAdapter extends JsonAdapter<ScrollableItemDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<ImageDto> imageDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<ScrollableItemBadgeDto> nullableScrollableItemBadgeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "background_color", "image", "action", "badge", "metrica_label", Constants.REFERRER_API_META);

    public ScrollableItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "subtitle");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.imageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "image");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
        this.nullableScrollableItemBadgeDtoAdapter = moshi.adapter(ScrollableItemBadgeDto.class, emptySet, "badge");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScrollableItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        String str = null;
        ImageDto imageDto = null;
        TapActionDto tapActionDto = null;
        ScrollableItemBadgeDto scrollableItemBadgeDto = null;
        String str2 = null;
        Object obj = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    attributedTextDto = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 1:
                    attributedTextDto2 = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    imageDto = this.imageDtoAdapter.fromJson(jsonReader);
                    if (imageDto == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    break;
                case 4:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    scrollableItemBadgeDto = this.nullableScrollableItemBadgeDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (attributedTextDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (imageDto != null) {
            return new ScrollableItemDto(attributedTextDto, attributedTextDto2, str, imageDto, tapActionDto, scrollableItemBadgeDto, str2, obj);
        }
        throw Util.missingProperty("image", "image", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScrollableItemDto scrollableItemDto) {
        ScrollableItemDto scrollableItemDto2 = scrollableItemDto;
        if (scrollableItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getSubtitle());
        jsonWriter.name("background_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getBackgroundColor());
        jsonWriter.name("image");
        this.imageDtoAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getImage());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getAction());
        jsonWriter.name("badge");
        this.nullableScrollableItemBadgeDtoAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getBadge());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) scrollableItemDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(ScrollableItemDto)");
    }
}
