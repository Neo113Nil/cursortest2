package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DeliveryIconStrategyDto;", "nullableDeliveryIconStrategyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerInfoDto;", "nullableDeliveryTrackingPerformerInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPaidWaitingInfoDto;", "nullableDeliveryTrackingPaidWaitingInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerSearchInfoDto;", "nullableDeliveryTrackingPerformerSearchInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingMapInfoDto;", "nullableDeliveryTrackingMapInfoDtoAdapter", "", "booleanAdapter", "", "intAdapter", "", "anyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryTrackingItemDtoJsonAdapter extends JsonAdapter<DeliveryTrackingItemDto> {
    private final JsonAdapter<Object> anyAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DeliveryTrackingItemDto> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<DeliveryIconStrategyDto> nullableDeliveryIconStrategyDtoAdapter;
    private final JsonAdapter<DeliveryTrackingMapInfoDto> nullableDeliveryTrackingMapInfoDtoAdapter;
    private final JsonAdapter<DeliveryTrackingPaidWaitingInfoDto> nullableDeliveryTrackingPaidWaitingInfoDtoAdapter;
    private final JsonAdapter<DeliveryTrackingPerformerInfoDto> nullableDeliveryTrackingPerformerInfoDtoAdapter;
    private final JsonAdapter<DeliveryTrackingPerformerSearchInfoDto> nullableDeliveryTrackingPerformerSearchInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("delivery_id", "summary", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "icon", "performer", "paid_waiting_info", "performer_search", "map_info", "is_completed", "commit_revision", Constants.REFERRER_API_META);
    private final JsonAdapter<String> stringAdapter;

    public DeliveryTrackingItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableDeliveryIconStrategyDtoAdapter = moshi.adapter(DeliveryIconStrategyDto.class, emptySet, "icon");
        this.nullableDeliveryTrackingPerformerInfoDtoAdapter = moshi.adapter(DeliveryTrackingPerformerInfoDto.class, emptySet, "performer");
        this.nullableDeliveryTrackingPaidWaitingInfoDtoAdapter = moshi.adapter(DeliveryTrackingPaidWaitingInfoDto.class, emptySet, "paidWaitingInfo");
        this.nullableDeliveryTrackingPerformerSearchInfoDtoAdapter = moshi.adapter(DeliveryTrackingPerformerSearchInfoDto.class, emptySet, "performerSearch");
        this.nullableDeliveryTrackingMapInfoDtoAdapter = moshi.adapter(DeliveryTrackingMapInfoDto.class, emptySet, "mapInfo");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isCompleted");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "commitRevision");
        this.anyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryTrackingItemDto fromJson(JsonReader jsonReader) {
        int i;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        String str = null;
        Boolean bool2 = bool;
        Integer num = 0;
        String str2 = null;
        DeliveryIconStrategyDto deliveryIconStrategyDto = null;
        DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto = null;
        DeliveryTrackingPaidWaitingInfoDto deliveryTrackingPaidWaitingInfoDto = null;
        DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto = null;
        DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto = null;
        Object obj = null;
        int i2 = -1;
        String str3 = null;
        while (true) {
            String str4 = str2;
            Boolean bool3 = bool2;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i2 == -769) {
                    if (str4 == null) {
                        throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
                    }
                    if (str == null) {
                        throw Util.missingProperty("summary", "summary", jsonReader);
                    }
                    boolean booleanValue = bool3.booleanValue();
                    int intValue = num.intValue();
                    if (obj != null) {
                        return new DeliveryTrackingItemDto(str4, str, str3, deliveryIconStrategyDto, deliveryTrackingPerformerInfoDto, deliveryTrackingPaidWaitingInfoDto, deliveryTrackingPerformerSearchInfoDto, deliveryTrackingMapInfoDto, booleanValue, intValue, obj);
                    }
                    throw Util.missingProperty(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
                }
                Constructor<DeliveryTrackingItemDto> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Boolean.TYPE;
                    Class cls3 = Integer.TYPE;
                    i = i2;
                    constructor = DeliveryTrackingItemDto.class.getDeclaredConstructor(String.class, String.class, String.class, DeliveryIconStrategyDto.class, DeliveryTrackingPerformerInfoDto.class, DeliveryTrackingPaidWaitingInfoDto.class, DeliveryTrackingPerformerSearchInfoDto.class, DeliveryTrackingMapInfoDto.class, cls2, cls3, Object.class, cls3, cls);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<DeliveryTrackingItemDto> constructor2 = constructor;
                if (str4 == null) {
                    throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
                }
                if (str == null) {
                    throw Util.missingProperty("summary", "summary", jsonReader);
                }
                if (obj == null) {
                    throw Util.missingProperty(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
                }
                DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto2 = deliveryTrackingMapInfoDto;
                return constructor2.newInstance(str4, str, str3, deliveryIconStrategyDto, deliveryTrackingPerformerInfoDto, deliveryTrackingPaidWaitingInfoDto, deliveryTrackingPerformerSearchInfoDto, deliveryTrackingMapInfoDto2, bool3, num, obj, Integer.valueOf(i), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str4;
                    bool2 = bool3;
                case 0:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("deliveryId", "delivery_id", jsonReader);
                    }
                    bool2 = bool3;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("summary", "summary", jsonReader);
                    }
                    str2 = str4;
                    bool2 = bool3;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str4;
                    bool2 = bool3;
                case 3:
                    deliveryIconStrategyDto = this.nullableDeliveryIconStrategyDtoAdapter.fromJson(jsonReader);
                    str2 = str4;
                    bool2 = bool3;
                case 4:
                    deliveryTrackingPerformerInfoDto = this.nullableDeliveryTrackingPerformerInfoDtoAdapter.fromJson(jsonReader);
                    str2 = str4;
                    bool2 = bool3;
                case 5:
                    deliveryTrackingPaidWaitingInfoDto = this.nullableDeliveryTrackingPaidWaitingInfoDtoAdapter.fromJson(jsonReader);
                    str2 = str4;
                    bool2 = bool3;
                case 6:
                    deliveryTrackingPerformerSearchInfoDto = this.nullableDeliveryTrackingPerformerSearchInfoDtoAdapter.fromJson(jsonReader);
                    str2 = str4;
                    bool2 = bool3;
                case 7:
                    deliveryTrackingMapInfoDto = this.nullableDeliveryTrackingMapInfoDtoAdapter.fromJson(jsonReader);
                    str2 = str4;
                    bool2 = bool3;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isCompleted", "is_completed", jsonReader);
                    }
                    i2 &= -257;
                    str2 = str4;
                case 9:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("commitRevision", "commit_revision", jsonReader);
                    }
                    i2 &= -513;
                    str2 = str4;
                    bool2 = bool3;
                case 10:
                    obj = this.anyAdapter.fromJson(jsonReader);
                    if (obj == null) {
                        throw Util.unexpectedNull(Constants.REFERRER_API_META, Constants.REFERRER_API_META, jsonReader);
                    }
                    str2 = str4;
                    bool2 = bool3;
                default:
                    str2 = str4;
                    bool2 = bool3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryTrackingItemDto deliveryTrackingItemDto) {
        DeliveryTrackingItemDto deliveryTrackingItemDto2 = deliveryTrackingItemDto;
        if (deliveryTrackingItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getDeliveryId());
        jsonWriter.name("summary");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getSummary());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getDescription());
        jsonWriter.name("icon");
        this.nullableDeliveryIconStrategyDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getIcon());
        jsonWriter.name("performer");
        this.nullableDeliveryTrackingPerformerInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getPerformer());
        jsonWriter.name("paid_waiting_info");
        this.nullableDeliveryTrackingPaidWaitingInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getPaidWaitingInfo());
        jsonWriter.name("performer_search");
        this.nullableDeliveryTrackingPerformerSearchInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getPerformerSearch());
        jsonWriter.name("map_info");
        this.nullableDeliveryTrackingMapInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getMapInfo());
        jsonWriter.name("is_completed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(deliveryTrackingItemDto2.isCompleted()));
        jsonWriter.name("commit_revision");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(deliveryTrackingItemDto2.getCommitRevision()));
        jsonWriter.name(Constants.REFERRER_API_META);
        this.anyAdapter.toJson(jsonWriter, (JsonWriter) deliveryTrackingItemDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(DeliveryTrackingItemDto)");
    }
}
