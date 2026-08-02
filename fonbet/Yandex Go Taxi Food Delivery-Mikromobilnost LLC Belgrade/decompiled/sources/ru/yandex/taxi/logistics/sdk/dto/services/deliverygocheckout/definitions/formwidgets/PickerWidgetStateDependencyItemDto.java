package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\r\u0010\r\u001a\u00060\u0001j\u0002`\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetStateDependencyItemDto;", "", "formStateKey", "", "formStateValue", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFormStateKey", "()Ljava/lang/String;", "getFormStateValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PickerWidgetStateDependencyItemDto {
    private final String formStateKey;
    private final Object formStateValue;

    public PickerWidgetStateDependencyItemDto(@Json(name = "form_state_key") String str, @Json(name = "form_state_value") Object obj) {
        this.formStateKey = str;
        this.formStateValue = obj;
    }

    public static /* synthetic */ PickerWidgetStateDependencyItemDto copy$default(PickerWidgetStateDependencyItemDto pickerWidgetStateDependencyItemDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pickerWidgetStateDependencyItemDto.formStateKey;
        }
        if ((i & 2) != 0) {
            obj = pickerWidgetStateDependencyItemDto.formStateValue;
        }
        return pickerWidgetStateDependencyItemDto.copy(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getFormStateValue() {
        return this.formStateValue;
    }

    public final PickerWidgetStateDependencyItemDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "form_state_value") Object formStateValue) {
        return new PickerWidgetStateDependencyItemDto(formStateKey, formStateValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickerWidgetStateDependencyItemDto)) {
            return false;
        }
        PickerWidgetStateDependencyItemDto pickerWidgetStateDependencyItemDto = (PickerWidgetStateDependencyItemDto) other;
        return jl40.l(this.formStateKey, pickerWidgetStateDependencyItemDto.formStateKey) && jl40.l(this.formStateValue, pickerWidgetStateDependencyItemDto.formStateValue);
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
        return "PickerWidgetStateDependencyItemDto(formStateKey=" + this.formStateKey + ", formStateValue=" + this.formStateValue + Extension.C_BRAKE;
    }
}
