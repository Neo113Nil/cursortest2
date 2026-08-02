package ru.yandex.logistics.sdk.cargo_form.core.impl.datastore;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ContactDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.CoordinateDto;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/core/impl/datastore/FormRestoreAddressModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/logistics/sdk/cargo_form/core/impl/datastore/FormRestoreAddressModel;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CoordinateDto;", "coordinateDtoAdapter", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ContactDto;", "nullableContactDtoAdapter", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormRestoreAddressModelJsonAdapter extends JsonAdapter<FormRestoreAddressModel> {
    private final JsonAdapter<CoordinateDto> coordinateDtoAdapter;
    private final JsonAdapter<ContactDto> nullableContactDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(LaunchBrowserActivity.KEY_URI, "coordinates", "title", "subtitle", "fullText", "comment", "porch", "floor", "apartment", "doorPhone", "contact", "locality");
    private final JsonAdapter<String> stringAdapter;

    public FormRestoreAddressModelJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, LaunchBrowserActivity.KEY_URI);
        this.coordinateDtoAdapter = moshi.adapter(CoordinateDto.class, emptySet, "coordinates");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableContactDtoAdapter = moshi.adapter(ContactDto.class, emptySet, "contact");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final FormRestoreAddressModel fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CoordinateDto coordinateDto = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        ContactDto contactDto = null;
        String str10 = null;
        while (true) {
            String str11 = str;
            CoordinateDto coordinateDto2 = coordinateDto;
            String str12 = str2;
            if (!jsonReader.hasNext()) {
                String str13 = str3;
                jsonReader.endObject();
                if (coordinateDto2 == null) {
                    throw Util.missingProperty("coordinates", "coordinates", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("fullText", "fullText", jsonReader);
                }
                if (str5 != null) {
                    return new FormRestoreAddressModel(str11, coordinateDto2, str12, str13, str4, str5, str6, str7, str8, str9, contactDto, str10);
                }
                throw Util.missingProperty("comment", "comment", jsonReader);
            }
            String str14 = str3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 1:
                    coordinateDto = this.coordinateDtoAdapter.fromJson(jsonReader);
                    if (coordinateDto == null) {
                        throw Util.unexpectedNull("coordinates", "coordinates", jsonReader);
                    }
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("fullText", "fullText", jsonReader);
                    }
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("comment", "comment", jsonReader);
                    }
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 8:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 9:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 10:
                    contactDto = this.nullableContactDtoAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                case 11:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
                default:
                    str3 = str14;
                    str = str11;
                    coordinateDto = coordinateDto2;
                    str2 = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, FormRestoreAddressModel formRestoreAddressModel) {
        FormRestoreAddressModel formRestoreAddressModel2 = formRestoreAddressModel;
        if (formRestoreAddressModel2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(LaunchBrowserActivity.KEY_URI);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getUri());
        jsonWriter.name("coordinates");
        this.coordinateDtoAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getCoordinates());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getSubtitle());
        jsonWriter.name("fullText");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getFullText());
        jsonWriter.name("comment");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getComment());
        jsonWriter.name("porch");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getPorch());
        jsonWriter.name("floor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getFloor());
        jsonWriter.name("apartment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getApartment());
        jsonWriter.name("doorPhone");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getDoorPhone());
        jsonWriter.name("contact");
        this.nullableContactDtoAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getContact());
        jsonWriter.name("locality");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) formRestoreAddressModel2.getLocality());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(FormRestoreAddressModel)");
    }
}
