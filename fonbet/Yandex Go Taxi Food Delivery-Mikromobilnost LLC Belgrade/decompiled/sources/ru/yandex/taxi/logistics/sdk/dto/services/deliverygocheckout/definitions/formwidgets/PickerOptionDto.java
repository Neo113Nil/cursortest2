package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0011\u001a\u00060\u0001j\u0002`\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerOptionDto;", "", "value", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "label", "", "stateDependentVisibility", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetStateDependencyItemDto;", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V", "getValue", "()Ljava/lang/Object;", "getLabel", "()Ljava/lang/String;", "getStateDependentVisibility", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PickerOptionDto {
    private final String label;
    private final List<PickerWidgetStateDependencyItemDto> stateDependentVisibility;
    private final Object value;

    public PickerOptionDto(@Json(name = "value") Object obj, @Json(name = "label") String str, @Json(name = "state_dependent_visibility") List<PickerWidgetStateDependencyItemDto> list) {
        this.value = obj;
        this.label = str;
        this.stateDependentVisibility = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickerOptionDto copy$default(PickerOptionDto pickerOptionDto, Object obj, String str, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = pickerOptionDto.value;
        }
        if ((i & 2) != 0) {
            str = pickerOptionDto.label;
        }
        if ((i & 4) != 0) {
            list = pickerOptionDto.stateDependentVisibility;
        }
        return pickerOptionDto.copy(obj, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final List<PickerWidgetStateDependencyItemDto> component3() {
        return this.stateDependentVisibility;
    }

    public final PickerOptionDto copy(@Json(name = "value") Object value, @Json(name = "label") String label, @Json(name = "state_dependent_visibility") List<PickerWidgetStateDependencyItemDto> stateDependentVisibility) {
        return new PickerOptionDto(value, label, stateDependentVisibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickerOptionDto)) {
            return false;
        }
        PickerOptionDto pickerOptionDto = (PickerOptionDto) other;
        return jl40.l(this.value, pickerOptionDto.value) && jl40.l(this.label, pickerOptionDto.label) && jl40.l(this.stateDependentVisibility, pickerOptionDto.stateDependentVisibility);
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<PickerWidgetStateDependencyItemDto> getStateDependentVisibility() {
        return this.stateDependentVisibility;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int b = unr0.b(this.value.hashCode() * 31, 31, this.label);
        List<PickerWidgetStateDependencyItemDto> list = this.stateDependentVisibility;
        return b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        Object obj = this.value;
        String str = this.label;
        List<PickerWidgetStateDependencyItemDto> list = this.stateDependentVisibility;
        StringBuilder sb = new StringBuilder("PickerOptionDto(value=");
        sb.append(obj);
        sb.append(", label=");
        sb.append(str);
        sb.append(", stateDependentVisibility=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
