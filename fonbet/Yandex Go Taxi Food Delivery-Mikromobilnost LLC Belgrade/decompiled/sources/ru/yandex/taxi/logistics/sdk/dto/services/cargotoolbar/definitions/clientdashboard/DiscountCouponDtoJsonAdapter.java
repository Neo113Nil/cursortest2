package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.DiscountCouponDto;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "nullableStyledTextDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "nullableBackgroundDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "nullableIconDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "nullableActionDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponDto$CouponSizeDto;", "couponSizeDtoAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/DiscountCouponTrailItemDto;", "nullableDiscountCouponTrailItemDtoAdapter", "", "nullableStringAdapter", "", "nullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscountCouponDtoJsonAdapter extends JsonAdapter<DiscountCouponDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DiscountCouponDto> constructorRef;
    private final JsonAdapter<DiscountCouponDto.CouponSizeDto> couponSizeDtoAdapter;
    private final JsonAdapter<ActionDto> nullableActionDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<BackgroundDto> nullableBackgroundDtoAdapter;
    private final JsonAdapter<DiscountCouponTrailItemDto> nullableDiscountCouponTrailItemDtoAdapter;
    private final JsonAdapter<IconDto> nullableIconDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<StyledTextDto> nullableStyledTextDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "discount", "subtitle", "company_name", C0553n3.g, "company_icon", "action", "coupon_size", "show_when_section_collapsed", "trail_item", "metrica_label", Constants.REFERRER_API_META);

    public DiscountCouponDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStyledTextDtoAdapter = moshi.adapter(StyledTextDto.class, emptySet, "title");
        this.nullableBackgroundDtoAdapter = moshi.adapter(BackgroundDto.class, emptySet, C0553n3.g);
        this.nullableIconDtoAdapter = moshi.adapter(IconDto.class, emptySet, "companyIcon");
        this.nullableActionDtoAdapter = moshi.adapter(ActionDto.class, emptySet, "action");
        this.couponSizeDtoAdapter = moshi.adapter(DiscountCouponDto.CouponSizeDto.class, emptySet, "couponSize");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showWhenSectionCollapsed");
        this.nullableDiscountCouponTrailItemDtoAdapter = moshi.adapter(DiscountCouponTrailItemDto.class, emptySet, "trailItem");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, Constants.REFERRER_API_META);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DiscountCouponDto fromJson(JsonReader jsonReader) {
        StyledTextDto styledTextDto;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        StyledTextDto styledTextDto2 = null;
        Boolean bool2 = bool;
        StyledTextDto styledTextDto3 = null;
        StyledTextDto styledTextDto4 = null;
        IconDto iconDto = null;
        ActionDto actionDto = null;
        DiscountCouponDto.CouponSizeDto couponSizeDto = null;
        BackgroundDto backgroundDto = null;
        DiscountCouponTrailItemDto discountCouponTrailItemDto = null;
        String str = null;
        Object obj = null;
        int i = -1;
        StyledTextDto styledTextDto5 = null;
        while (true) {
            StyledTextDto styledTextDto6 = styledTextDto3;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -257) {
                    if (couponSizeDto != null) {
                        return new DiscountCouponDto(styledTextDto4, styledTextDto6, styledTextDto2, styledTextDto5, backgroundDto, iconDto, actionDto, couponSizeDto, bool2.booleanValue(), discountCouponTrailItemDto, str, obj);
                    }
                    throw Util.missingProperty("couponSize", "coupon_size", jsonReader);
                }
                BackgroundDto backgroundDto2 = backgroundDto;
                StyledTextDto styledTextDto7 = styledTextDto4;
                Constructor<DiscountCouponDto> constructor = this.constructorRef;
                if (constructor == null) {
                    styledTextDto = styledTextDto7;
                    constructor = DiscountCouponDto.class.getDeclaredConstructor(StyledTextDto.class, StyledTextDto.class, StyledTextDto.class, StyledTextDto.class, BackgroundDto.class, IconDto.class, ActionDto.class, DiscountCouponDto.CouponSizeDto.class, Boolean.TYPE, DiscountCouponTrailItemDto.class, String.class, Object.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    styledTextDto = styledTextDto7;
                }
                Constructor<DiscountCouponDto> constructor2 = constructor;
                if (couponSizeDto == null) {
                    throw Util.missingProperty("couponSize", "coupon_size", jsonReader);
                }
                return constructor2.newInstance(styledTextDto, styledTextDto6, styledTextDto2, styledTextDto5, backgroundDto2, iconDto, actionDto, couponSizeDto, bool2, discountCouponTrailItemDto, str, obj, Integer.valueOf(i), null);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    styledTextDto4 = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    styledTextDto3 = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    styledTextDto2 = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    styledTextDto5 = this.nullableStyledTextDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    backgroundDto = this.nullableBackgroundDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    iconDto = this.nullableIconDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    actionDto = this.nullableActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    couponSizeDto = this.couponSizeDtoAdapter.fromJson(jsonReader);
                    if (couponSizeDto == null) {
                        throw Util.unexpectedNull("couponSize", "coupon_size", jsonReader);
                    }
                    break;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("showWhenSectionCollapsed", "show_when_section_collapsed", jsonReader);
                    }
                    styledTextDto3 = styledTextDto6;
                    i = -257;
                    continue;
                case 9:
                    discountCouponTrailItemDto = this.nullableDiscountCouponTrailItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
            }
            styledTextDto3 = styledTextDto6;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DiscountCouponDto discountCouponDto) {
        DiscountCouponDto discountCouponDto2 = discountCouponDto;
        if (discountCouponDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getTitle());
        jsonWriter.name("discount");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getDiscount());
        jsonWriter.name("subtitle");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getSubtitle());
        jsonWriter.name("company_name");
        this.nullableStyledTextDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getCompanyName());
        jsonWriter.name(C0553n3.g);
        this.nullableBackgroundDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getBackground());
        jsonWriter.name("company_icon");
        this.nullableIconDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getCompanyIcon());
        jsonWriter.name("action");
        this.nullableActionDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getAction());
        jsonWriter.name("coupon_size");
        this.couponSizeDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getCouponSize());
        jsonWriter.name("show_when_section_collapsed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(discountCouponDto2.getShowWhenSectionCollapsed()));
        jsonWriter.name("trail_item");
        this.nullableDiscountCouponTrailItemDtoAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getTrailItem());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getMetricaLabel());
        jsonWriter.name(Constants.REFERRER_API_META);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) discountCouponDto2.getMeta());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(DiscountCouponDto)");
    }
}
