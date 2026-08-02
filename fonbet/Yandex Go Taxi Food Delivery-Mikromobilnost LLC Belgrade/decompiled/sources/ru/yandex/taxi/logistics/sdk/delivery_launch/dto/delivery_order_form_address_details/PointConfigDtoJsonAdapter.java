package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PointConfigDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/PhoneSelectionScreenConfigDto;", "phoneSelectionScreenConfigDtoAdapter", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/SelectContactButtonConfigDto;", "nullableSelectContactButtonConfigDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PointConfigDtoJsonAdapter extends JsonAdapter<PointConfigDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PointConfigDto> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<SelectContactButtonConfigDto> nullableSelectContactButtonConfigDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("porch_key", "apartment_key", "floor_key", "doorphone_key", "comment_key", "contact_key", "should_hide_phone_selection", "should_hide_detais_screen", "phone_selection_screen_config", "is_contact_bound_to_point", "select_contact_button_config");
    private final JsonAdapter<PhoneSelectionScreenConfigDto> phoneSelectionScreenConfigDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PointConfigDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "porchKey");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "shouldHidePhoneSelection");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "shouldHideDetaisScreen");
        this.phoneSelectionScreenConfigDtoAdapter = moshi.adapter(PhoneSelectionScreenConfigDto.class, emptySet, "phoneSelectionScreenConfig");
        this.nullableSelectContactButtonConfigDtoAdapter = moshi.adapter(SelectContactButtonConfigDto.class, emptySet, "selectContactButtonConfig");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PointConfigDto fromJson(JsonReader jsonReader) {
        String str;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i = -1;
        Boolean bool2 = bool;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool3 = null;
        PhoneSelectionScreenConfigDto phoneSelectionScreenConfigDto = null;
        Boolean bool4 = null;
        SelectContactButtonConfigDto selectContactButtonConfigDto = null;
        while (true) {
            Boolean bool5 = bool2;
            String str8 = str2;
            String str9 = str3;
            int i2 = i;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i2 == -129) {
                    if (str8 == null) {
                        throw Util.missingProperty("porchKey", "porch_key", jsonReader);
                    }
                    if (str9 == null) {
                        throw Util.missingProperty("apartmentKey", "apartment_key", jsonReader);
                    }
                    if (str4 == null) {
                        throw Util.missingProperty("floorKey", "floor_key", jsonReader);
                    }
                    if (str5 == null) {
                        throw Util.missingProperty("doorphoneKey", "doorphone_key", jsonReader);
                    }
                    if (str6 == null) {
                        throw Util.missingProperty("commentKey", "comment_key", jsonReader);
                    }
                    if (str7 == null) {
                        throw Util.missingProperty("contactKey", "contact_key", jsonReader);
                    }
                    boolean booleanValue = bool5.booleanValue();
                    if (phoneSelectionScreenConfigDto != null) {
                        return new PointConfigDto(str8, str9, str4, str5, str6, str7, bool3, booleanValue, phoneSelectionScreenConfigDto, bool4, selectContactButtonConfigDto);
                    }
                    throw Util.missingProperty("phoneSelectionScreenConfig", "phone_selection_screen_config", jsonReader);
                }
                Constructor<PointConfigDto> constructor = this.constructorRef;
                if (constructor == null) {
                    str = "porchKey";
                    constructor = PointConfigDto.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.TYPE, PhoneSelectionScreenConfigDto.class, Boolean.class, SelectContactButtonConfigDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    str = "porchKey";
                }
                if (str8 == null) {
                    throw Util.missingProperty(str, "porch_key", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("apartmentKey", "apartment_key", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("floorKey", "floor_key", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("doorphoneKey", "doorphone_key", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("commentKey", "comment_key", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("contactKey", "contact_key", jsonReader);
                }
                if (phoneSelectionScreenConfigDto == null) {
                    throw Util.missingProperty("phoneSelectionScreenConfig", "phone_selection_screen_config", jsonReader);
                }
                return constructor.newInstance(str8, str9, str4, str5, str6, str7, bool3, bool5, phoneSelectionScreenConfigDto, bool4, selectContactButtonConfigDto, Integer.valueOf(i2), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("porchKey", "porch_key", jsonReader);
                    }
                    bool2 = bool5;
                    str3 = str9;
                    i = i2;
                case 1:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("apartmentKey", "apartment_key", jsonReader);
                    }
                    bool2 = bool5;
                    str2 = str8;
                    i = i2;
                case 2:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("floorKey", "floor_key", jsonReader);
                    }
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 3:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("doorphoneKey", "doorphone_key", jsonReader);
                    }
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 4:
                    str6 = this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("commentKey", "comment_key", jsonReader);
                    }
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 5:
                    str7 = this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("contactKey", "contact_key", jsonReader);
                    }
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 6:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("shouldHideDetaisScreen", "should_hide_detais_screen", jsonReader);
                    }
                    str2 = str8;
                    str3 = str9;
                    i = -129;
                case 8:
                    phoneSelectionScreenConfigDto = this.phoneSelectionScreenConfigDtoAdapter.fromJson(jsonReader);
                    if (phoneSelectionScreenConfigDto == null) {
                        throw Util.unexpectedNull("phoneSelectionScreenConfig", "phone_selection_screen_config", jsonReader);
                    }
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 9:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                case 10:
                    selectContactButtonConfigDto = this.nullableSelectContactButtonConfigDtoAdapter.fromJson(jsonReader);
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
                default:
                    bool2 = bool5;
                    str2 = str8;
                    str3 = str9;
                    i = i2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PointConfigDto pointConfigDto) {
        PointConfigDto pointConfigDto2 = pointConfigDto;
        if (pointConfigDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("porch_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getPorchKey());
        jsonWriter.name("apartment_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getApartmentKey());
        jsonWriter.name("floor_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getFloorKey());
        jsonWriter.name("doorphone_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getDoorphoneKey());
        jsonWriter.name("comment_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getCommentKey());
        jsonWriter.name("contact_key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getContactKey());
        jsonWriter.name("should_hide_phone_selection");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getShouldHidePhoneSelection());
        jsonWriter.name("should_hide_detais_screen");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(pointConfigDto2.getShouldHideDetaisScreen()));
        jsonWriter.name("phone_selection_screen_config");
        this.phoneSelectionScreenConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getPhoneSelectionScreenConfig());
        jsonWriter.name("is_contact_bound_to_point");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.isContactBoundToPoint());
        jsonWriter.name("select_contact_button_config");
        this.nullableSelectContactButtonConfigDtoAdapter.toJson(jsonWriter, (JsonWriter) pointConfigDto2.getSelectContactButtonConfig());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(PointConfigDto)");
    }
}
