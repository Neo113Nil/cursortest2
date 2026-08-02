package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/AddressDetailsConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/AddressDetailsConfigDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;", "pointConfigDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhotocommentsConfigDto;", "nullablePhotocommentsConfigDtoAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/CommentPopupDto;", "nullableCommentPopupDtoAdapter", "", "stringAdapter", "", "nullableBooleanAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressDetailsConfigDtoJsonAdapter extends JsonAdapter<AddressDetailsConfigDto> {
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<CommentPopupDto> nullableCommentPopupDtoAdapter;
    private final JsonAdapter<PhotocommentsConfigDto> nullablePhotocommentsConfigDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("source", "destination", "photocomments", "comment_popup", "button_text_key", "enable_delete_destination");
    private final JsonAdapter<PointConfigDto> pointConfigDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public AddressDetailsConfigDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pointConfigDtoAdapter = moshi.adapter(PointConfigDto.class, emptySet, "source");
        this.nullablePhotocommentsConfigDtoAdapter = moshi.adapter(PhotocommentsConfigDto.class, emptySet, "photocomments");
        this.nullableCommentPopupDtoAdapter = moshi.adapter(CommentPopupDto.class, emptySet, "commentPopup");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "buttonTextKey");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "enableDeleteDestination");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AddressDetailsConfigDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PointConfigDto pointConfigDto = null;
        PointConfigDto pointConfigDto2 = null;
        PhotocommentsConfigDto photocommentsConfigDto = null;
        CommentPopupDto commentPopupDto = null;
        String str = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    pointConfigDto = this.pointConfigDtoAdapter.fromJson(jsonReader);
                    if (pointConfigDto == null) {
                        throw Util.unexpectedNull("source", "source", jsonReader);
                    }
                    break;
                case 1:
                    pointConfigDto2 = this.pointConfigDtoAdapter.fromJson(jsonReader);
                    if (pointConfigDto2 == null) {
                        throw Util.unexpectedNull("destination", "destination", jsonReader);
                    }
                    break;
                case 2:
                    photocommentsConfigDto = this.nullablePhotocommentsConfigDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    commentPopupDto = this.nullableCommentPopupDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("buttonTextKey", "button_text_key", jsonReader);
                    }
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (pointConfigDto == null) {
            throw Util.missingProperty("source", "source", jsonReader);
        }
        if (pointConfigDto2 == null) {
            throw Util.missingProperty("destination", "destination", jsonReader);
        }
        if (str != null) {
            return new AddressDetailsConfigDto(pointConfigDto, pointConfigDto2, photocommentsConfigDto, commentPopupDto, str, bool);
        }
        throw Util.missingProperty("buttonTextKey", "button_text_key", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AddressDetailsConfigDto addressDetailsConfigDto) {
        AddressDetailsConfigDto addressDetailsConfigDto2 = addressDetailsConfigDto;
        if (addressDetailsConfigDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("source");
        this.pointConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsConfigDto2.getSource());
        jsonWriter.name("destination");
        this.pointConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsConfigDto2.getDestination());
        jsonWriter.name("photocomments");
        this.nullablePhotocommentsConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsConfigDto2.getPhotocomments());
        jsonWriter.name("comment_popup");
        this.nullableCommentPopupDtoAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsConfigDto2.getCommentPopup());
        jsonWriter.name("button_text_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsConfigDto2.getButtonTextKey());
        jsonWriter.name("enable_delete_destination");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) addressDetailsConfigDto2.getEnableDeleteDestination());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(AddressDetailsConfigDto)");
    }
}
