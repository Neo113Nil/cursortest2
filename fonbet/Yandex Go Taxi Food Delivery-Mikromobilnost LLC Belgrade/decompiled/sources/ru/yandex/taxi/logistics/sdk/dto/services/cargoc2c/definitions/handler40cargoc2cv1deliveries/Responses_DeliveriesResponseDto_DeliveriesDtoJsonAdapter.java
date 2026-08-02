package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries;

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
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate.DeliveriesStateDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries.Responses$DeliveriesResponseDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses_DeliveriesResponseDto_DeliveriesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto$DeliveriesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto;", "nullableDeliveriesStateDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Responses_DeliveriesResponseDto_DeliveriesDtoJsonAdapter extends JsonAdapter<Responses$DeliveriesResponseDto.DeliveriesDto> {
    private volatile Constructor<Responses$DeliveriesResponseDto.DeliveriesDto> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<DeliveriesStateDto> nullableDeliveriesStateDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("revision", "delivery_id", "etag", ClidProvider.STATE);
    private final JsonAdapter<String> stringAdapter;

    public Responses_DeliveriesResponseDto_DeliveriesDtoJsonAdapter(Moshi moshi) {
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.longAdapter = moshi.adapter(cls, emptySet, "revision");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.nullableDeliveriesStateDtoAdapter = moshi.adapter(DeliveriesStateDto.class, emptySet, ClidProvider.STATE);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Responses$DeliveriesResponseDto.DeliveriesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Long l = 0L;
        String str = null;
        String str2 = null;
        DeliveriesStateDto deliveriesStateDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("revision", "revision", jsonReader);
                }
                i = -2;
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("deliveryId", "delivery_id", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("etag", "etag", jsonReader);
                }
            } else if (selectName == 3) {
                deliveriesStateDto = this.nullableDeliveriesStateDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            String str3 = str;
            String str4 = str2;
            DeliveriesStateDto deliveriesStateDto2 = deliveriesStateDto;
            long longValue = l.longValue();
            if (str3 == null) {
                throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
            }
            if (str4 != null) {
                return new Responses$DeliveriesResponseDto.DeliveriesDto(longValue, str3, str4, deliveriesStateDto2);
            }
            throw Util.missingProperty("etag", "etag", jsonReader);
        }
        String str5 = str;
        String str6 = str2;
        DeliveriesStateDto deliveriesStateDto3 = deliveriesStateDto;
        Constructor<Responses$DeliveriesResponseDto.DeliveriesDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Responses$DeliveriesResponseDto.DeliveriesDto.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, DeliveriesStateDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<Responses$DeliveriesResponseDto.DeliveriesDto> constructor2 = constructor;
        if (str5 == null) {
            throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
        }
        if (str6 != null) {
            return constructor2.newInstance(l, str5, str6, deliveriesStateDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("etag", "etag", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Responses$DeliveriesResponseDto.DeliveriesDto deliveriesDto) {
        Responses$DeliveriesResponseDto.DeliveriesDto deliveriesDto2 = deliveriesDto;
        if (deliveriesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("revision");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(deliveriesDto2.getRevision()));
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveriesDto2.getDeliveryId());
        jsonWriter.name("etag");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveriesDto2.getEtag());
        jsonWriter.name(ClidProvider.STATE);
        this.nullableDeliveriesStateDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesDto2.getState());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(67, "GeneratedJsonAdapter(Responses.DeliveriesResponseDto.DeliveriesDto)");
    }
}
