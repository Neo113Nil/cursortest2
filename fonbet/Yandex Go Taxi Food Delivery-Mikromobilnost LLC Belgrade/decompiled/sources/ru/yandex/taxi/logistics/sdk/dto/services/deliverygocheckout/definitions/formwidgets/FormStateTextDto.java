package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormStateTextDto;", "", "formStateKey", "", "textParameters", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;)V", "getFormStateKey", "()Ljava/lang/String;", "getTextParameters", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormStateTextDto {
    private final String formStateKey;
    private final TextParametersDto textParameters;

    public FormStateTextDto(@Json(name = "form_state_key") String str, @Json(name = "text_parameters") TextParametersDto textParametersDto) {
        this.formStateKey = str;
        this.textParameters = textParametersDto;
    }

    public static /* synthetic */ FormStateTextDto copy$default(FormStateTextDto formStateTextDto, String str, TextParametersDto textParametersDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formStateTextDto.formStateKey;
        }
        if ((i & 2) != 0) {
            textParametersDto = formStateTextDto.textParameters;
        }
        return formStateTextDto.copy(str, textParametersDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component2, reason: from getter */
    public final TextParametersDto getTextParameters() {
        return this.textParameters;
    }

    public final FormStateTextDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "text_parameters") TextParametersDto textParameters) {
        return new FormStateTextDto(formStateKey, textParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormStateTextDto)) {
            return false;
        }
        FormStateTextDto formStateTextDto = (FormStateTextDto) other;
        return jl40.l(this.formStateKey, formStateTextDto.formStateKey) && jl40.l(this.textParameters, formStateTextDto.textParameters);
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final TextParametersDto getTextParameters() {
        return this.textParameters;
    }

    public int hashCode() {
        return this.textParameters.hashCode() + (this.formStateKey.hashCode() * 31);
    }

    public String toString() {
        return "FormStateTextDto(formStateKey=" + this.formStateKey + ", textParameters=" + this.textParameters + Extension.C_BRAKE;
    }
}
