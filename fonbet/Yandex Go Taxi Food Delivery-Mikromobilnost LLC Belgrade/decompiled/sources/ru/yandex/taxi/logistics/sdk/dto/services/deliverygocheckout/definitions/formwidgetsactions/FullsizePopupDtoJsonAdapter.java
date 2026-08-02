package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/FullsizePopupDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/FullsizePopupDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "nullableImageDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "attributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "nullableTapActionDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullsizePopupDtoJsonAdapter extends JsonAdapter<FullsizePopupDto> {
    private final JsonAdapter<AttributedTextDto> attributedTextDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonAdapter<ImageDto> nullableImageDtoAdapter;
    private final JsonAdapter<TapActionDto> nullableTapActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "lead_icon", "title", "subtitle", "action", "background_color", "close_icon");
    private final JsonAdapter<String> stringAdapter;

    public FullsizePopupDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableImageDtoAdapter = moshi.adapter(ImageDto.class, emptySet, "leadIcon");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "title");
        this.attributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "subtitle");
        this.nullableTapActionDtoAdapter = moshi.adapter(TapActionDto.class, emptySet, "action");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FullsizePopupDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ImageDto imageDto = null;
        AttributedTextDto attributedTextDto = null;
        AttributedTextDto attributedTextDto2 = null;
        TapActionDto tapActionDto = null;
        String str2 = null;
        ImageDto imageDto2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    break;
                case 1:
                    imageDto = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    attributedTextDto2 = this.attributedTextDtoAdapter.fromJson(jsonReader);
                    if (attributedTextDto2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    break;
                case 4:
                    tapActionDto = this.nullableTapActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    break;
                case 6:
                    imageDto2 = this.nullableImageDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (attributedTextDto2 == null) {
            throw Util.missingProperty("subtitle", "subtitle", jsonReader);
        }
        if (str2 != null) {
            return new FullsizePopupDto(str, imageDto, attributedTextDto, attributedTextDto2, tapActionDto, str2, imageDto2);
        }
        throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FullsizePopupDto fullsizePopupDto) {
        FullsizePopupDto fullsizePopupDto2 = fullsizePopupDto;
        if (fullsizePopupDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fullsizePopupDto2.getId());
        jsonWriter.name("lead_icon");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) fullsizePopupDto2.getLeadIcon());
        jsonWriter.name("title");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) fullsizePopupDto2.getTitle());
        jsonWriter.name("subtitle");
        this.attributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) fullsizePopupDto2.getSubtitle());
        jsonWriter.name("action");
        this.nullableTapActionDtoAdapter.toJson(jsonWriter, (JsonWriter) fullsizePopupDto2.getAction());
        jsonWriter.name("background_color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) fullsizePopupDto2.getBackgroundColor());
        jsonWriter.name("close_icon");
        this.nullableImageDtoAdapter.toJson(jsonWriter, (JsonWriter) fullsizePopupDto2.getCloseIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(FullsizePopupDto)");
    }
}
