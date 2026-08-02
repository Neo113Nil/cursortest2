package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewHeaderDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewHeaderDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;", "remoteIconDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "nullableAttributedTextDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "colorDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewListItemDto;", "modalViewListItemDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModalViewHeaderDtoJsonAdapter extends JsonAdapter<ModalViewHeaderDto> {
    private final JsonAdapter<ColorDto> colorDtoAdapter;
    private final JsonAdapter<ModalViewListItemDto> modalViewListItemDtoAdapter;
    private final JsonAdapter<AttributedTextDto> nullableAttributedTextDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("icon", "icon_text", "background_color", "content_item");
    private final JsonAdapter<RemoteIconDto> remoteIconDtoAdapter;

    public ModalViewHeaderDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.remoteIconDtoAdapter = moshi.adapter(RemoteIconDto.class, emptySet, "icon");
        this.nullableAttributedTextDtoAdapter = moshi.adapter(AttributedTextDto.class, emptySet, "iconText");
        this.colorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        this.modalViewListItemDtoAdapter = moshi.adapter(ModalViewListItemDto.class, emptySet, "contentItem");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ModalViewHeaderDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RemoteIconDto remoteIconDto = null;
        AttributedTextDto attributedTextDto = null;
        ColorDto colorDto = null;
        ModalViewListItemDto modalViewListItemDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                remoteIconDto = this.remoteIconDtoAdapter.fromJson(jsonReader);
                if (remoteIconDto == null) {
                    throw Util.unexpectedNull("icon", "icon", jsonReader);
                }
            } else if (selectName == 1) {
                attributedTextDto = this.nullableAttributedTextDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                colorDto = this.colorDtoAdapter.fromJson(jsonReader);
                if (colorDto == null) {
                    throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
            } else if (selectName == 3 && (modalViewListItemDto = this.modalViewListItemDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("contentItem", "content_item", jsonReader);
            }
        }
        jsonReader.endObject();
        if (remoteIconDto == null) {
            throw Util.missingProperty("icon", "icon", jsonReader);
        }
        if (colorDto == null) {
            throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
        }
        if (modalViewListItemDto != null) {
            return new ModalViewHeaderDto(remoteIconDto, attributedTextDto, colorDto, modalViewListItemDto);
        }
        throw Util.missingProperty("contentItem", "content_item", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ModalViewHeaderDto modalViewHeaderDto) {
        ModalViewHeaderDto modalViewHeaderDto2 = modalViewHeaderDto;
        if (modalViewHeaderDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("icon");
        this.remoteIconDtoAdapter.toJson(jsonWriter, (JsonWriter) modalViewHeaderDto2.getIcon());
        jsonWriter.name("icon_text");
        this.nullableAttributedTextDtoAdapter.toJson(jsonWriter, (JsonWriter) modalViewHeaderDto2.getIconText());
        jsonWriter.name("background_color");
        this.colorDtoAdapter.toJson(jsonWriter, (JsonWriter) modalViewHeaderDto2.getBackgroundColor());
        jsonWriter.name("content_item");
        this.modalViewListItemDtoAdapter.toJson(jsonWriter, (JsonWriter) modalViewHeaderDto2.getContentItem());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ModalViewHeaderDto)");
    }
}
