package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FormStateKeyActionGuardPolicyDto;", "", "formStateKey", "", "formStateValue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFormStateKey", "()Ljava/lang/String;", "getFormStateValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FormStateKeyActionGuardPolicyDto {
    private final String formStateKey;
    private final Object formStateValue;

    public FormStateKeyActionGuardPolicyDto(@Json(name = "form_state_key") String str, @Json(name = "form_state_value") Object obj) {
        this.formStateKey = str;
        this.formStateValue = obj;
    }

    public static /* synthetic */ FormStateKeyActionGuardPolicyDto copy$default(FormStateKeyActionGuardPolicyDto formStateKeyActionGuardPolicyDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = formStateKeyActionGuardPolicyDto.formStateKey;
        }
        if ((i & 2) != 0) {
            obj = formStateKeyActionGuardPolicyDto.formStateValue;
        }
        return formStateKeyActionGuardPolicyDto.copy(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getFormStateValue() {
        return this.formStateValue;
    }

    public final FormStateKeyActionGuardPolicyDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "form_state_value") Object formStateValue) {
        return new FormStateKeyActionGuardPolicyDto(formStateKey, formStateValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormStateKeyActionGuardPolicyDto)) {
            return false;
        }
        FormStateKeyActionGuardPolicyDto formStateKeyActionGuardPolicyDto = (FormStateKeyActionGuardPolicyDto) other;
        return jl40.l(this.formStateKey, formStateKeyActionGuardPolicyDto.formStateKey) && jl40.l(this.formStateValue, formStateKeyActionGuardPolicyDto.formStateValue);
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final Object getFormStateValue() {
        return this.formStateValue;
    }

    public int hashCode() {
        return this.formStateValue.hashCode() + (this.formStateKey.hashCode() * 31);
    }

    public String toString() {
        return "FormStateKeyActionGuardPolicyDto(formStateKey=" + this.formStateKey + ", formStateValue=" + this.formStateValue + Extension.C_BRAKE;
    }
}
