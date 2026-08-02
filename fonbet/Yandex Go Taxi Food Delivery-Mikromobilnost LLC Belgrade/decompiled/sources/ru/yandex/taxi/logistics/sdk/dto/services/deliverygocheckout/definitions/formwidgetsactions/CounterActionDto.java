package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;", "", "formStateKey", "", "actionOnIncrease", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "actionOnDecrease", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterOptionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/util/List;Ljava/lang/String;)V", "getFormStateKey", "()Ljava/lang/String;", "getActionOnIncrease", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getActionOnDecrease", "getOptions", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CounterActionDto {
    private final TapActionDto actionOnDecrease;
    private final TapActionDto actionOnIncrease;
    private final String formStateKey;
    private final String metricaLabel;
    private final List<CounterOptionDto> options;

    public CounterActionDto(@Json(name = "form_state_key") String str, @Json(name = "action_on_increase") TapActionDto tapActionDto, @Json(name = "action_on_decrease") TapActionDto tapActionDto2, @Json(name = "options") List<CounterOptionDto> list, @Json(name = "metrica_label") String str2) {
        this.formStateKey = str;
        this.actionOnIncrease = tapActionDto;
        this.actionOnDecrease = tapActionDto2;
        this.options = list;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ CounterActionDto copy$default(CounterActionDto counterActionDto, String str, TapActionDto tapActionDto, TapActionDto tapActionDto2, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = counterActionDto.formStateKey;
        }
        if ((i & 2) != 0) {
            tapActionDto = counterActionDto.actionOnIncrease;
        }
        if ((i & 4) != 0) {
            tapActionDto2 = counterActionDto.actionOnDecrease;
        }
        if ((i & 8) != 0) {
            list = counterActionDto.options;
        }
        if ((i & 16) != 0) {
            str2 = counterActionDto.metricaLabel;
        }
        String str3 = str2;
        TapActionDto tapActionDto3 = tapActionDto2;
        return counterActionDto.copy(str, tapActionDto, tapActionDto3, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component2, reason: from getter */
    public final TapActionDto getActionOnIncrease() {
        return this.actionOnIncrease;
    }

    /* renamed from: component3, reason: from getter */
    public final TapActionDto getActionOnDecrease() {
        return this.actionOnDecrease;
    }

    public final List<CounterOptionDto> component4() {
        return this.options;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final CounterActionDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "action_on_increase") TapActionDto actionOnIncrease, @Json(name = "action_on_decrease") TapActionDto actionOnDecrease, @Json(name = "options") List<CounterOptionDto> options, @Json(name = "metrica_label") String metricaLabel) {
        return new CounterActionDto(formStateKey, actionOnIncrease, actionOnDecrease, options, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CounterActionDto)) {
            return false;
        }
        CounterActionDto counterActionDto = (CounterActionDto) other;
        return jl40.l(this.formStateKey, counterActionDto.formStateKey) && jl40.l(this.actionOnIncrease, counterActionDto.actionOnIncrease) && jl40.l(this.actionOnDecrease, counterActionDto.actionOnDecrease) && jl40.l(this.options, counterActionDto.options) && jl40.l(this.metricaLabel, counterActionDto.metricaLabel);
    }

    public final TapActionDto getActionOnDecrease() {
        return this.actionOnDecrease;
    }

    public final TapActionDto getActionOnIncrease() {
        return this.actionOnIncrease;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<CounterOptionDto> getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.formStateKey.hashCode() * 31;
        TapActionDto tapActionDto = this.actionOnIncrease;
        int hashCode2 = (hashCode + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        TapActionDto tapActionDto2 = this.actionOnDecrease;
        int c = unr0.c((hashCode2 + (tapActionDto2 == null ? 0 : tapActionDto2.hashCode())) * 31, 31, this.options);
        String str = this.metricaLabel;
        return c + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.formStateKey;
        TapActionDto tapActionDto = this.actionOnIncrease;
        TapActionDto tapActionDto2 = this.actionOnDecrease;
        List<CounterOptionDto> list = this.options;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("CounterActionDto(formStateKey=");
        sb.append(str);
        sb.append(", actionOnIncrease=");
        sb.append(tapActionDto);
        sb.append(", actionOnDecrease=");
        sb.append(tapActionDto2);
        sb.append(", options=");
        sb.append(list);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
