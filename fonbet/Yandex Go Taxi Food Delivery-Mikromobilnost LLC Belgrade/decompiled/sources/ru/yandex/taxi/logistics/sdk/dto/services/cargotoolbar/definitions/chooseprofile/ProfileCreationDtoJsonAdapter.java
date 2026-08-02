package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ButtonDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ProfileCreationDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ProfileCreationDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ButtonDto;", "buttonDtoAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfileCreationDtoJsonAdapter extends JsonAdapter<ProfileCreationDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ButtonDto> buttonDtoAdapter;
    private volatile Constructor<ProfileCreationDto> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("title", "button", BackendConfig.Restrictions.ENABLED);
    private final JsonAdapter<String> stringAdapter;

    public ProfileCreationDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.buttonDtoAdapter = moshi.adapter(ButtonDto.class, emptySet, "button");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ProfileCreationDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        String str = null;
        ButtonDto buttonDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                buttonDto = this.buttonDtoAdapter.fromJson(jsonReader);
                if (buttonDto == null) {
                    throw Util.unexpectedNull("button", "button", jsonReader);
                }
            } else if (selectName == 2) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (buttonDto != null) {
                return new ProfileCreationDto(str, buttonDto, bool.booleanValue());
            }
            throw Util.missingProperty("button", "button", jsonReader);
        }
        Constructor<ProfileCreationDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProfileCreationDto.class.getDeclaredConstructor(String.class, ButtonDto.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (buttonDto != null) {
            return constructor.newInstance(str, buttonDto, bool, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("button", "button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ProfileCreationDto profileCreationDto) {
        ProfileCreationDto profileCreationDto2 = profileCreationDto;
        if (profileCreationDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) profileCreationDto2.getTitle());
        jsonWriter.name("button");
        this.buttonDtoAdapter.toJson(jsonWriter, (JsonWriter) profileCreationDto2.getButton());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(profileCreationDto2.getEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ProfileCreationDto)");
    }
}
