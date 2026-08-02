package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import androidx.media3.exoplayer.offline.DownloadService;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.SummaryRedirectActionDto;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SummaryRedirectActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SummaryRedirectActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SummaryRedirectActionDto$SheetExpansionDto;", "nullableSheetExpansionDtoAdapter", "", "nullableAnyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SelectDestinationPolicyDto;", "nullableSelectDestinationPolicyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SummaryRedirectActionDto$DestinationDto;", "nullableDestinationDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaymentOptionsDto;", "nullablePaymentOptionsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto;", "nullableActionAfterRedirectDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SummaryRedirectActionDtoJsonAdapter extends JsonAdapter<SummaryRedirectActionDto> {
    private final JsonAdapter<ActionAfterRedirectDto> nullableActionAfterRedirectDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<SummaryRedirectActionDto.DestinationDto> nullableDestinationDtoAdapter;
    private final JsonAdapter<PaymentOptionsDto> nullablePaymentOptionsDtoAdapter;
    private final JsonAdapter<SelectDestinationPolicyDto> nullableSelectDestinationPolicyDtoAdapter;
    private final JsonAdapter<SummaryRedirectActionDto.SheetExpansionDto> nullableSheetExpansionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("vertical", "vertical_trap", "sheet_expansion", "story_id", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, DownloadService.KEY_REQUIREMENTS, "ignore_absent_destination", "select_destination_policy", "destination", "payment_options", "action_after_redirect");

    public SummaryRedirectActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "vertical");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "verticalTrap");
        this.nullableSheetExpansionDtoAdapter = moshi.adapter(SummaryRedirectActionDto.SheetExpansionDto.class, emptySet, "sheetExpansion");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, DownloadService.KEY_REQUIREMENTS);
        this.nullableSelectDestinationPolicyDtoAdapter = moshi.adapter(SelectDestinationPolicyDto.class, emptySet, "selectDestinationPolicy");
        this.nullableDestinationDtoAdapter = moshi.adapter(SummaryRedirectActionDto.DestinationDto.class, emptySet, "destination");
        this.nullablePaymentOptionsDtoAdapter = moshi.adapter(PaymentOptionsDto.class, emptySet, "paymentOptions");
        this.nullableActionAfterRedirectDtoAdapter = moshi.adapter(ActionAfterRedirectDto.class, emptySet, "actionAfterRedirect");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SummaryRedirectActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Boolean bool = null;
        SummaryRedirectActionDto.SheetExpansionDto sheetExpansionDto = null;
        String str2 = null;
        String str3 = null;
        Object obj = null;
        Boolean bool2 = null;
        SelectDestinationPolicyDto selectDestinationPolicyDto = null;
        SummaryRedirectActionDto.DestinationDto destinationDto = null;
        PaymentOptionsDto paymentOptionsDto = null;
        ActionAfterRedirectDto actionAfterRedirectDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    sheetExpansionDto = this.nullableSheetExpansionDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    selectDestinationPolicyDto = this.nullableSelectDestinationPolicyDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    destinationDto = this.nullableDestinationDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    paymentOptionsDto = this.nullablePaymentOptionsDtoAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    actionAfterRedirectDto = this.nullableActionAfterRedirectDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new SummaryRedirectActionDto(str, bool, sheetExpansionDto, str2, str3, obj, bool2, selectDestinationPolicyDto, destinationDto, paymentOptionsDto, actionAfterRedirectDto);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SummaryRedirectActionDto summaryRedirectActionDto) {
        SummaryRedirectActionDto summaryRedirectActionDto2 = summaryRedirectActionDto;
        if (summaryRedirectActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("vertical");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getVertical());
        jsonWriter.name("vertical_trap");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getVerticalTrap());
        jsonWriter.name("sheet_expansion");
        this.nullableSheetExpansionDtoAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getSheetExpansion());
        jsonWriter.name("story_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getStoryId());
        jsonWriter.name(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getTariff());
        jsonWriter.name(DownloadService.KEY_REQUIREMENTS);
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getRequirements());
        jsonWriter.name("ignore_absent_destination");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getIgnoreAbsentDestination());
        jsonWriter.name("select_destination_policy");
        this.nullableSelectDestinationPolicyDtoAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getSelectDestinationPolicy());
        jsonWriter.name("destination");
        this.nullableDestinationDtoAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getDestination());
        jsonWriter.name("payment_options");
        this.nullablePaymentOptionsDtoAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getPaymentOptions());
        jsonWriter.name("action_after_redirect");
        this.nullableActionAfterRedirectDtoAdapter.toJson(jsonWriter, (JsonWriter) summaryRedirectActionDto2.getActionAfterRedirect());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(SummaryRedirectActionDto)");
    }
}
