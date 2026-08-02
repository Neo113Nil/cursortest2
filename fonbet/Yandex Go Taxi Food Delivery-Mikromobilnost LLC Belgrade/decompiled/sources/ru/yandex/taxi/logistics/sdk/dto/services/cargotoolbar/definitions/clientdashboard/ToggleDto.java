package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010#\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ToggleDto;", "", "isChecked", "", "leadText", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "checkedTrackColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "uncheckedTrackColor", "thumbColor", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "metricaLabel", "<init>", "(ZLjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Ljava/lang/Object;Ljava/lang/String;)V", "()Z", "getLeadText", "()Ljava/lang/String;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getCheckedTrackColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getUncheckedTrackColor", "getThumbColor", "getMeta", "()Ljava/lang/Object;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToggleDto {
    private final ActionDto action;
    private final ColorDto checkedTrackColor;
    private final boolean isChecked;
    private final String leadText;
    private final Object meta;
    private final String metricaLabel;
    private final ColorDto thumbColor;
    private final ColorDto uncheckedTrackColor;

    public ToggleDto(@Json(name = "is_checked") boolean z, @Json(name = "lead_text") String str, @Json(name = "action") ActionDto actionDto, @Json(name = "checked_track_color") ColorDto colorDto, @Json(name = "unchecked_track_color") ColorDto colorDto2, @Json(name = "thumb_color") ColorDto colorDto3, @Json(name = "meta") Object obj, @Json(name = "metrica_label") String str2) {
        this.isChecked = z;
        this.leadText = str;
        this.action = actionDto;
        this.checkedTrackColor = colorDto;
        this.uncheckedTrackColor = colorDto2;
        this.thumbColor = colorDto3;
        this.meta = obj;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ToggleDto copy$default(ToggleDto toggleDto, boolean z, String str, ActionDto actionDto, ColorDto colorDto, ColorDto colorDto2, ColorDto colorDto3, Object obj, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = toggleDto.isChecked;
        }
        if ((i & 2) != 0) {
            str = toggleDto.leadText;
        }
        if ((i & 4) != 0) {
            actionDto = toggleDto.action;
        }
        if ((i & 8) != 0) {
            colorDto = toggleDto.checkedTrackColor;
        }
        if ((i & 16) != 0) {
            colorDto2 = toggleDto.uncheckedTrackColor;
        }
        if ((i & 32) != 0) {
            colorDto3 = toggleDto.thumbColor;
        }
        if ((i & 64) != 0) {
            obj = toggleDto.meta;
        }
        if ((i & 128) != 0) {
            str2 = toggleDto.metricaLabel;
        }
        Object obj3 = obj;
        String str3 = str2;
        ColorDto colorDto4 = colorDto2;
        ColorDto colorDto5 = colorDto3;
        return toggleDto.copy(z, str, actionDto, colorDto, colorDto4, colorDto5, obj3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLeadText() {
        return this.leadText;
    }

    /* renamed from: component3, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final ColorDto getCheckedTrackColor() {
        return this.checkedTrackColor;
    }

    /* renamed from: component5, reason: from getter */
    public final ColorDto getUncheckedTrackColor() {
        return this.uncheckedTrackColor;
    }

    /* renamed from: component6, reason: from getter */
    public final ColorDto getThumbColor() {
        return this.thumbColor;
    }

    /* renamed from: component7, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ToggleDto copy(@Json(name = "is_checked") boolean isChecked, @Json(name = "lead_text") String leadText, @Json(name = "action") ActionDto action, @Json(name = "checked_track_color") ColorDto checkedTrackColor, @Json(name = "unchecked_track_color") ColorDto uncheckedTrackColor, @Json(name = "thumb_color") ColorDto thumbColor, @Json(name = "meta") Object meta, @Json(name = "metrica_label") String metricaLabel) {
        return new ToggleDto(isChecked, leadText, action, checkedTrackColor, uncheckedTrackColor, thumbColor, meta, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleDto)) {
            return false;
        }
        ToggleDto toggleDto = (ToggleDto) other;
        return this.isChecked == toggleDto.isChecked && jl40.l(this.leadText, toggleDto.leadText) && jl40.l(this.action, toggleDto.action) && jl40.l(this.checkedTrackColor, toggleDto.checkedTrackColor) && jl40.l(this.uncheckedTrackColor, toggleDto.uncheckedTrackColor) && jl40.l(this.thumbColor, toggleDto.thumbColor) && jl40.l(this.meta, toggleDto.meta) && jl40.l(this.metricaLabel, toggleDto.metricaLabel);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final ColorDto getCheckedTrackColor() {
        return this.checkedTrackColor;
    }

    public final String getLeadText() {
        return this.leadText;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ColorDto getThumbColor() {
        return this.thumbColor;
    }

    public final ColorDto getUncheckedTrackColor() {
        return this.uncheckedTrackColor;
    }

    public int hashCode() {
        int hashCode = (this.action.hashCode() + unr0.b(Boolean.hashCode(this.isChecked) * 31, 31, this.leadText)) * 31;
        ColorDto colorDto = this.checkedTrackColor;
        int hashCode2 = (hashCode + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
        ColorDto colorDto2 = this.uncheckedTrackColor;
        int hashCode3 = (hashCode2 + (colorDto2 == null ? 0 : colorDto2.hashCode())) * 31;
        ColorDto colorDto3 = this.thumbColor;
        int hashCode4 = (hashCode3 + (colorDto3 == null ? 0 : colorDto3.hashCode())) * 31;
        Object obj = this.meta;
        int hashCode5 = (hashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public String toString() {
        boolean z = this.isChecked;
        String str = this.leadText;
        ActionDto actionDto = this.action;
        ColorDto colorDto = this.checkedTrackColor;
        ColorDto colorDto2 = this.uncheckedTrackColor;
        ColorDto colorDto3 = this.thumbColor;
        Object obj = this.meta;
        String str2 = this.metricaLabel;
        StringBuilder v = ly3.v("ToggleDto(isChecked=", ", leadText=", str, ", action=", z);
        v.append(actionDto);
        v.append(", checkedTrackColor=");
        v.append(colorDto);
        v.append(", uncheckedTrackColor=");
        v.append(colorDto2);
        v.append(", thumbColor=");
        v.append(colorDto3);
        v.append(", meta=");
        v.append(obj);
        v.append(", metricaLabel=");
        v.append(str2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
