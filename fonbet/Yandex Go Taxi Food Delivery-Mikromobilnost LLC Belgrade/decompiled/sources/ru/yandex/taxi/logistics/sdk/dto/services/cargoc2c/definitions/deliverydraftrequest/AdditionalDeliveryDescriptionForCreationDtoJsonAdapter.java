package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverydraftrequest;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.BuyoutInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CostCenterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DefaultUserTipsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.OrderCreationFlowDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PackageInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PaymentInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PostcardSourceInfoDto;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/AdditionalDeliveryDescriptionForCreationDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PaymentInfoDto;", "paymentInfoDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CostCenterDto;", "nullableListOfCostCenterDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverydraftrequest/DraftPointDto;", "listOfDraftPointDtoAdapter", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "nullableListOfPhotoInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDto;", "nullablePostcardSourceInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto;", "nullableDefaultUserTipsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BuyoutInfoDto;", "nullableBuyoutInfoDtoAdapter", "", "nullableBooleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PackageInfoDto;", "nullablePackageInfoDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto;", "nullableOrderCreationFlowDtoAdapter", "", "nullableListOfDoubleAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdditionalDeliveryDescriptionForCreationDtoJsonAdapter extends JsonAdapter<AdditionalDeliveryDescriptionForCreationDto> {
    private final JsonAdapter<List<DraftPointDto>> listOfDraftPointDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<BuyoutInfoDto> nullableBuyoutInfoDtoAdapter;
    private final JsonAdapter<DefaultUserTipsDto> nullableDefaultUserTipsDtoAdapter;
    private final JsonAdapter<List<CostCenterDto>> nullableListOfCostCenterDtoAdapter;
    private final JsonAdapter<List<Double>> nullableListOfDoubleAdapter;
    private final JsonAdapter<List<PhotoInfoDto>> nullableListOfPhotoInfoDtoAdapter;
    private final JsonAdapter<OrderCreationFlowDto> nullableOrderCreationFlowDtoAdapter;
    private final JsonAdapter<PackageInfoDto> nullablePackageInfoDtoAdapter;
    private final JsonAdapter<PostcardSourceInfoDto> nullablePostcardSourceInfoDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_info", "cost_centers", "route_points", "comment", "comment_images", "postcard", "tips", "buyout_info", "click_delivery", "v2_udp_flow", "package_info", "order_creation_flow", "user_current_location");
    private final JsonAdapter<PaymentInfoDto> paymentInfoDtoAdapter;

    public AdditionalDeliveryDescriptionForCreationDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentInfoDtoAdapter = moshi.adapter(PaymentInfoDto.class, emptySet, "paymentInfo");
        this.nullableListOfCostCenterDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CostCenterDto.class), emptySet, "costCenters");
        this.listOfDraftPointDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DraftPointDto.class), emptySet, "routePoints");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "comment");
        this.nullableListOfPhotoInfoDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PhotoInfoDto.class), emptySet, "commentImages");
        this.nullablePostcardSourceInfoDtoAdapter = moshi.adapter(PostcardSourceInfoDto.class, emptySet, "postcard");
        this.nullableDefaultUserTipsDtoAdapter = moshi.adapter(DefaultUserTipsDto.class, emptySet, "tips");
        this.nullableBuyoutInfoDtoAdapter = moshi.adapter(BuyoutInfoDto.class, emptySet, "buyoutInfo");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "clickDelivery");
        this.nullablePackageInfoDtoAdapter = moshi.adapter(PackageInfoDto.class, emptySet, "packageInfo");
        this.nullableOrderCreationFlowDtoAdapter = moshi.adapter(OrderCreationFlowDto.class, emptySet, "orderCreationFlow");
        this.nullableListOfDoubleAdapter = moshi.adapter(Types.newParameterizedType(List.class, Double.class), emptySet, "userCurrentLocation");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AdditionalDeliveryDescriptionForCreationDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentInfoDto paymentInfoDto = null;
        List<CostCenterDto> list = null;
        List<DraftPointDto> list2 = null;
        String str = null;
        List<PhotoInfoDto> list3 = null;
        PostcardSourceInfoDto postcardSourceInfoDto = null;
        DefaultUserTipsDto defaultUserTipsDto = null;
        BuyoutInfoDto buyoutInfoDto = null;
        Boolean bool = null;
        Boolean bool2 = null;
        PackageInfoDto packageInfoDto = null;
        OrderCreationFlowDto orderCreationFlowDto = null;
        List<Double> list4 = null;
        while (true) {
            PaymentInfoDto paymentInfoDto2 = paymentInfoDto;
            List<CostCenterDto> list5 = list;
            if (!jsonReader.hasNext()) {
                List<DraftPointDto> list6 = list2;
                jsonReader.endObject();
                if (paymentInfoDto2 == null) {
                    throw Util.missingProperty("paymentInfo", "payment_info", jsonReader);
                }
                if (list6 != null) {
                    return new AdditionalDeliveryDescriptionForCreationDto(paymentInfoDto2, list5, list6, str, list3, postcardSourceInfoDto, defaultUserTipsDto, buyoutInfoDto, bool, bool2, packageInfoDto, orderCreationFlowDto, list4);
                }
                throw Util.missingProperty("routePoints", "route_points", jsonReader);
            }
            List<DraftPointDto> list7 = list2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 0:
                    paymentInfoDto = this.paymentInfoDtoAdapter.fromJson(jsonReader);
                    if (paymentInfoDto == null) {
                        throw Util.unexpectedNull("paymentInfo", "payment_info", jsonReader);
                    }
                    list2 = list7;
                    list = list5;
                case 1:
                    list = this.nullableListOfCostCenterDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                case 2:
                    list2 = this.listOfDraftPointDtoAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("routePoints", "route_points", jsonReader);
                    }
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 4:
                    list3 = this.nullableListOfPhotoInfoDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 5:
                    postcardSourceInfoDto = this.nullablePostcardSourceInfoDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 6:
                    defaultUserTipsDto = this.nullableDefaultUserTipsDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 7:
                    buyoutInfoDto = this.nullableBuyoutInfoDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 8:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 9:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 10:
                    packageInfoDto = this.nullablePackageInfoDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 11:
                    orderCreationFlowDto = this.nullableOrderCreationFlowDtoAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                case 12:
                    list4 = this.nullableListOfDoubleAdapter.fromJson(jsonReader);
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
                default:
                    list2 = list7;
                    paymentInfoDto = paymentInfoDto2;
                    list = list5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescriptionForCreationDto) {
        AdditionalDeliveryDescriptionForCreationDto additionalDeliveryDescriptionForCreationDto2 = additionalDeliveryDescriptionForCreationDto;
        if (additionalDeliveryDescriptionForCreationDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_info");
        this.paymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getPaymentInfo());
        jsonWriter.name("cost_centers");
        this.nullableListOfCostCenterDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getCostCenters());
        jsonWriter.name("route_points");
        this.listOfDraftPointDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getRoutePoints());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getComment());
        jsonWriter.name("comment_images");
        this.nullableListOfPhotoInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getCommentImages());
        jsonWriter.name("postcard");
        this.nullablePostcardSourceInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getPostcard());
        jsonWriter.name("tips");
        this.nullableDefaultUserTipsDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getTips());
        jsonWriter.name("buyout_info");
        this.nullableBuyoutInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getBuyoutInfo());
        jsonWriter.name("click_delivery");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getClickDelivery());
        jsonWriter.name("v2_udp_flow");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getV2UdpFlow());
        jsonWriter.name("package_info");
        this.nullablePackageInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getPackageInfo());
        jsonWriter.name("order_creation_flow");
        this.nullableOrderCreationFlowDtoAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getOrderCreationFlow());
        jsonWriter.name("user_current_location");
        this.nullableListOfDoubleAdapter.toJson(jsonWriter, (JsonWriter) additionalDeliveryDescriptionForCreationDto2.getUserCurrentLocation());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(65, "GeneratedJsonAdapter(AdditionalDeliveryDescriptionForCreationDto)");
    }
}
