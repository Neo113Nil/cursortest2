package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryfeedback;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.FeedbackReasonsItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryfeedback.DeliveryFeedbackRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.TipsInfoDto;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto$TypeDto;", "typeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/FeedbackReasonsItemDto;", "nullableListOfFeedbackReasonsItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDto;", "nullableTipsInfoDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryFeedbackRequestDtoJsonAdapter extends JsonAdapter<DeliveryFeedbackRequestDto> {
    private volatile Constructor<DeliveryFeedbackRequestDto> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<FeedbackReasonsItemDto>> nullableListOfFeedbackReasonsItemDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TipsInfoDto> nullableTipsInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "delivery_id", "score", "comment", IssuingDistributionPointExtension.REASONS, "tips");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<DeliveryFeedbackRequestDto.TypeDto> typeDtoAdapter;

    public DeliveryFeedbackRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.typeDtoAdapter = moshi.adapter(DeliveryFeedbackRequestDto.TypeDto.class, emptySet, "type");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "score");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "comment");
        this.nullableListOfFeedbackReasonsItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FeedbackReasonsItemDto.class), emptySet, IssuingDistributionPointExtension.REASONS);
        this.nullableTipsInfoDtoAdapter = moshi.adapter(TipsInfoDto.class, emptySet, "tips");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryFeedbackRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        DeliveryFeedbackRequestDto.TypeDto typeDto = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        List<FeedbackReasonsItemDto> list = null;
        TipsInfoDto tipsInfoDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    typeDto = this.typeDtoAdapter.fromJson(jsonReader);
                    if (typeDto == null) {
                        throw Util.unexpectedNull("type", "type", jsonReader);
                    }
                    i = -2;
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("deliveryId", "delivery_id", jsonReader);
                    }
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list = this.nullableListOfFeedbackReasonsItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    tipsInfoDto = this.nullableTipsInfoDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            TipsInfoDto tipsInfoDto2 = tipsInfoDto;
            List<FeedbackReasonsItemDto> list2 = list;
            String str3 = str2;
            Integer num2 = num;
            String str4 = str;
            DeliveryFeedbackRequestDto.TypeDto typeDto2 = typeDto;
            if (str4 != null) {
                return new DeliveryFeedbackRequestDto(typeDto2, str4, num2, str3, list2, tipsInfoDto2);
            }
            throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
        }
        TipsInfoDto tipsInfoDto3 = tipsInfoDto;
        List<FeedbackReasonsItemDto> list3 = list;
        String str5 = str2;
        Integer num3 = num;
        String str6 = str;
        DeliveryFeedbackRequestDto.TypeDto typeDto3 = typeDto;
        Constructor<DeliveryFeedbackRequestDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DeliveryFeedbackRequestDto.class.getDeclaredConstructor(DeliveryFeedbackRequestDto.TypeDto.class, String.class, Integer.class, String.class, List.class, TipsInfoDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str6 != null) {
            return constructor.newInstance(typeDto3, str6, num3, str5, list3, tipsInfoDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryFeedbackRequestDto deliveryFeedbackRequestDto) {
        DeliveryFeedbackRequestDto deliveryFeedbackRequestDto2 = deliveryFeedbackRequestDto;
        if (deliveryFeedbackRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.typeDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryFeedbackRequestDto2.getType());
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveryFeedbackRequestDto2.getDeliveryId());
        jsonWriter.name("score");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) deliveryFeedbackRequestDto2.getScore());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryFeedbackRequestDto2.getComment());
        jsonWriter.name(IssuingDistributionPointExtension.REASONS);
        this.nullableListOfFeedbackReasonsItemDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryFeedbackRequestDto2.getReasons());
        jsonWriter.name("tips");
        this.nullableTipsInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryFeedbackRequestDto2.getTips());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(DeliveryFeedbackRequestDto)");
    }
}
