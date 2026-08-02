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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/TestConfigDto;", "nullableTestConfigDtoAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhoneSelectionScreenConfigDtoJsonAdapter extends JsonAdapter<PhoneSelectionScreenConfigDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TestConfigDto> nullableTestConfigDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("read_contacts_permission_key", "title_key", "description_key", "user_contact_name_key", "empty_contact_title_key", "empty_contact_subtitle_key", "button_title_key", "test_key_object");
    private final JsonAdapter<String> stringAdapter;

    public PhoneSelectionScreenConfigDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "readContactsPermissionKey");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "descriptionKey");
        this.nullableTestConfigDtoAdapter = moshi.adapter(TestConfigDto.class, emptySet, "testKeyObject");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PhoneSelectionScreenConfigDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        TestConfigDto testConfigDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("readContactsPermissionKey", "read_contacts_permission_key", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("titleKey", "title_key", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    testConfigDto = this.nullableTestConfigDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("readContactsPermissionKey", "read_contacts_permission_key", jsonReader);
        }
        if (str2 != null) {
            return new PhoneSelectionScreenConfigDto(str, str2, str3, str4, str5, str6, str7, testConfigDto);
        }
        throw Util.missingProperty("titleKey", "title_key", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto) {
        PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto2 = phoneSelectionScreenConfigDto;
        if (phoneSelectionScreenConfigDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("read_contacts_permission_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getReadContactsPermissionKey());
        jsonWriter.name("title_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getTitleKey());
        jsonWriter.name("description_key");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getDescriptionKey());
        jsonWriter.name("user_contact_name_key");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getUserContactNameKey());
        jsonWriter.name("empty_contact_title_key");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getEmptyContactTitleKey());
        jsonWriter.name("empty_contact_subtitle_key");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getEmptyContactSubtitleKey());
        jsonWriter.name("button_title_key");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getButtonTitleKey());
        jsonWriter.name("test_key_object");
        this.nullableTestConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) phoneSelectionScreenConfigDto2.getTestKeyObject());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(PhoneSelectionScreenConfigDto)");
    }
}
