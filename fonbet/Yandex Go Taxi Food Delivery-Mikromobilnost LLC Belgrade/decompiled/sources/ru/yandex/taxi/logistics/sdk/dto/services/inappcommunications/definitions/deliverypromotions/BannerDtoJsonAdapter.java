package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions;

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
import ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions.BannerDto;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$ActionDto;", "nullableActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$LayoutDto;", "layoutDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/BannerDto$ShowPolicyDto;", "nullableShowPolicyDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerDtoJsonAdapter extends JsonAdapter<BannerDto> {
    private volatile Constructor<BannerDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<BannerDto.LayoutDto> layoutDtoAdapter;
    private final JsonAdapter<BannerDto.ActionDto> nullableActionDtoAdapter;
    private final JsonAdapter<BannerDto.ShowPolicyDto> nullableShowPolicyDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "duration", "action", "layout", "show_policy");
    private final JsonAdapter<String> stringAdapter;

    public BannerDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "duration");
        this.nullableActionDtoAdapter = moshi.adapter(BannerDto.ActionDto.class, emptySet, "action");
        this.layoutDtoAdapter = moshi.adapter(BannerDto.LayoutDto.class, emptySet, "layout");
        this.nullableShowPolicyDtoAdapter = moshi.adapter(BannerDto.ShowPolicyDto.class, emptySet, "showPolicy");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BannerDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        String str = null;
        BannerDto.ActionDto actionDto = null;
        BannerDto.LayoutDto layoutDto = null;
        BannerDto.ShowPolicyDto showPolicyDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("duration", "duration", jsonReader);
                }
                i = -3;
            } else if (selectName == 2) {
                actionDto = this.nullableActionDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                layoutDto = this.layoutDtoAdapter.fromJson(jsonReader);
                if (layoutDto == null) {
                    throw Util.unexpectedNull("layout", "layout", jsonReader);
                }
            } else if (selectName == 4) {
                showPolicyDto = this.nullableShowPolicyDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            BannerDto.ActionDto actionDto2 = actionDto;
            if (str == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            BannerDto.ShowPolicyDto showPolicyDto2 = showPolicyDto;
            int intValue = num.intValue();
            if (layoutDto == null) {
                throw Util.missingProperty("layout", "layout", jsonReader);
            }
            return new BannerDto(str, intValue, actionDto2, layoutDto, showPolicyDto2);
        }
        BannerDto.ActionDto actionDto3 = actionDto;
        BannerDto.ShowPolicyDto showPolicyDto3 = showPolicyDto;
        Constructor<BannerDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = BannerDto.class.getDeclaredConstructor(String.class, cls2, BannerDto.ActionDto.class, BannerDto.LayoutDto.class, BannerDto.ShowPolicyDto.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (layoutDto != null) {
            return constructor.newInstance(str, num, actionDto3, layoutDto, showPolicyDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("layout", "layout", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BannerDto bannerDto) {
        BannerDto bannerDto2 = bannerDto;
        if (bannerDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) bannerDto2.getId());
        jsonWriter.name("duration");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(bannerDto2.getDuration()));
        jsonWriter.name("action");
        this.nullableActionDtoAdapter.toJson(jsonWriter, (JsonWriter) bannerDto2.getAction());
        jsonWriter.name("layout");
        this.layoutDtoAdapter.toJson(jsonWriter, (JsonWriter) bannerDto2.getLayout());
        jsonWriter.name("show_policy");
        this.nullableShowPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) bannerDto2.getShowPolicy());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(31, "GeneratedJsonAdapter(BannerDto)");
    }
}
