package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputWidgetDto;", "", "widgetId", "", "formStateKey", "inputType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto;", "forceOpenKeyboard", "", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto;ZLjava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getFormStateKey", "getInputType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto;", "getForceOpenKeyboard", "()Z", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DigitsInputWidgetDto {
    private final boolean forceOpenKeyboard;
    private final String formStateKey;
    private final DigitsInputTypeDto inputType;
    private final String metricaLabel;
    private final String widgetId;

    public /* synthetic */ DigitsInputWidgetDto(String str, String str2, DigitsInputTypeDto digitsInputTypeDto, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, digitsInputTypeDto, (i & 8) != 0 ? false : z, str3);
    }

    public static /* synthetic */ DigitsInputWidgetDto copy$default(DigitsInputWidgetDto digitsInputWidgetDto, String str, String str2, DigitsInputTypeDto digitsInputTypeDto, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = digitsInputWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = digitsInputWidgetDto.formStateKey;
        }
        if ((i & 4) != 0) {
            digitsInputTypeDto = digitsInputWidgetDto.inputType;
        }
        if ((i & 8) != 0) {
            z = digitsInputWidgetDto.forceOpenKeyboard;
        }
        if ((i & 16) != 0) {
            str3 = digitsInputWidgetDto.metricaLabel;
        }
        String str4 = str3;
        DigitsInputTypeDto digitsInputTypeDto2 = digitsInputTypeDto;
        return digitsInputWidgetDto.copy(str, str2, digitsInputTypeDto2, z, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component3, reason: from getter */
    public final DigitsInputTypeDto getInputType() {
        return this.inputType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getForceOpenKeyboard() {
        return this.forceOpenKeyboard;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final DigitsInputWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "form_state_key") String formStateKey, @Json(name = "input_type") DigitsInputTypeDto inputType, @Json(name = "force_open_keyboard") boolean forceOpenKeyboard, @Json(name = "metrica_label") String metricaLabel) {
        return new DigitsInputWidgetDto(widgetId, formStateKey, inputType, forceOpenKeyboard, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitsInputWidgetDto)) {
            return false;
        }
        DigitsInputWidgetDto digitsInputWidgetDto = (DigitsInputWidgetDto) other;
        return jl40.l(this.widgetId, digitsInputWidgetDto.widgetId) && jl40.l(this.formStateKey, digitsInputWidgetDto.formStateKey) && jl40.l(this.inputType, digitsInputWidgetDto.inputType) && this.forceOpenKeyboard == digitsInputWidgetDto.forceOpenKeyboard && jl40.l(this.metricaLabel, digitsInputWidgetDto.metricaLabel);
    }

    public final boolean getForceOpenKeyboard() {
        return this.forceOpenKeyboard;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final DigitsInputTypeDto getInputType() {
        return this.inputType;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int e = unr0.e((this.inputType.hashCode() + unr0.b(this.widgetId.hashCode() * 31, 31, this.formStateKey)) * 31, 31, this.forceOpenKeyboard);
        String str = this.metricaLabel;
        return e + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.formStateKey;
        DigitsInputTypeDto digitsInputTypeDto = this.inputType;
        boolean z = this.forceOpenKeyboard;
        String str3 = this.metricaLabel;
        StringBuilder v = b64.v("DigitsInputWidgetDto(widgetId=", str, ", formStateKey=", str2, ", inputType=");
        v.append(digitsInputTypeDto);
        v.append(", forceOpenKeyboard=");
        v.append(z);
        v.append(", metricaLabel=");
        return oyr.t(v, str3, Extension.C_BRAKE);
    }

    public DigitsInputWidgetDto(@Json(name = "widget_id") String str, @Json(name = "form_state_key") String str2, @Json(name = "input_type") DigitsInputTypeDto digitsInputTypeDto, @Json(name = "force_open_keyboard") boolean z, @Json(name = "metrica_label") String str3) {
        this.widgetId = str;
        this.formStateKey = str2;
        this.inputType = digitsInputTypeDto;
        this.forceOpenKeyboard = z;
        this.metricaLabel = str3;
    }
}
