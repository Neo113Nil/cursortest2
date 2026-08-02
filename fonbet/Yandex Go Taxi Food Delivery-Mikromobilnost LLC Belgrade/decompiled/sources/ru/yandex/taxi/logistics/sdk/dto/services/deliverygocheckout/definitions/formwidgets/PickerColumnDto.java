package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnDto;", "", "formStateKey", "", "layoutPolicy", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerOptionDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;Ljava/util/List;)V", "getFormStateKey", "()Ljava/lang/String;", "getLayoutPolicy", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PickerColumnDto {
    private final String formStateKey;
    private final PickerColumnLayoutPolicyDto layoutPolicy;
    private final List<PickerOptionDto> options;

    public PickerColumnDto(@Json(name = "form_state_key") String str, @Json(name = "layout_policy") PickerColumnLayoutPolicyDto pickerColumnLayoutPolicyDto, @Json(name = "options") List<PickerOptionDto> list) {
        this.formStateKey = str;
        this.layoutPolicy = pickerColumnLayoutPolicyDto;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickerColumnDto copy$default(PickerColumnDto pickerColumnDto, String str, PickerColumnLayoutPolicyDto pickerColumnLayoutPolicyDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pickerColumnDto.formStateKey;
        }
        if ((i & 2) != 0) {
            pickerColumnLayoutPolicyDto = pickerColumnDto.layoutPolicy;
        }
        if ((i & 4) != 0) {
            list = pickerColumnDto.options;
        }
        return pickerColumnDto.copy(str, pickerColumnLayoutPolicyDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component2, reason: from getter */
    public final PickerColumnLayoutPolicyDto getLayoutPolicy() {
        return this.layoutPolicy;
    }

    public final List<PickerOptionDto> component3() {
        return this.options;
    }

    public final PickerColumnDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "layout_policy") PickerColumnLayoutPolicyDto layoutPolicy, @Json(name = "options") List<PickerOptionDto> options) {
        return new PickerColumnDto(formStateKey, layoutPolicy, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickerColumnDto)) {
            return false;
        }
        PickerColumnDto pickerColumnDto = (PickerColumnDto) other;
        return jl40.l(this.formStateKey, pickerColumnDto.formStateKey) && jl40.l(this.layoutPolicy, pickerColumnDto.layoutPolicy) && jl40.l(this.options, pickerColumnDto.options);
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final PickerColumnLayoutPolicyDto getLayoutPolicy() {
        return this.layoutPolicy;
    }

    public final List<PickerOptionDto> getOptions() {
        return this.options;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.layoutPolicy.hashCode() + (this.formStateKey.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.formStateKey;
        PickerColumnLayoutPolicyDto pickerColumnLayoutPolicyDto = this.layoutPolicy;
        List<PickerOptionDto> list = this.options;
        StringBuilder sb = new StringBuilder("PickerColumnDto(formStateKey=");
        sb.append(str);
        sb.append(", layoutPolicy=");
        sb.append(pickerColumnLayoutPolicyDto);
        sb.append(", options=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
