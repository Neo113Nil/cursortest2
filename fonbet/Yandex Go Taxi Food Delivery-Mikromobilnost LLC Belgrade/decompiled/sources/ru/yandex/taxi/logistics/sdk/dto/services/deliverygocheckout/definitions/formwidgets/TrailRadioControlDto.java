package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0001j\u0002`\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\r\u0010\u001e\u001a\u00060\u0001j\u0002`\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\f\b\u0003\u0010\u0006\u001a\u00060\u0001j\u0002`\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u00060\u0001j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006*"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailRadioControlDto;", "", BackendConfig.Restrictions.ENABLED, "", "key", "", "value", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "actionOnUnselect", "disabledUnselect", "presentationId", "metricaLabel", "<init>", "(ZLjava/lang/String;Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;ZLjava/lang/String;Ljava/lang/String;)V", "getEnabled", "()Z", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getActionOnUnselect", "getDisabledUnselect", "getPresentationId", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrailRadioControlDto {
    private final TapActionDto action;
    private final TapActionDto actionOnUnselect;
    private final boolean disabledUnselect;
    private final boolean enabled;
    private final String key;
    private final String metricaLabel;
    private final String presentationId;
    private final Object value;

    public /* synthetic */ TrailRadioControlDto(boolean z, String str, Object obj, TapActionDto tapActionDto, TapActionDto tapActionDto2, boolean z2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, str, obj, tapActionDto, tapActionDto2, (i & 32) != 0 ? false : z2, str2, str3);
    }

    public static /* synthetic */ TrailRadioControlDto copy$default(TrailRadioControlDto trailRadioControlDto, boolean z, String str, Object obj, TapActionDto tapActionDto, TapActionDto tapActionDto2, boolean z2, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = trailRadioControlDto.enabled;
        }
        if ((i & 2) != 0) {
            str = trailRadioControlDto.key;
        }
        if ((i & 4) != 0) {
            obj = trailRadioControlDto.value;
        }
        if ((i & 8) != 0) {
            tapActionDto = trailRadioControlDto.action;
        }
        if ((i & 16) != 0) {
            tapActionDto2 = trailRadioControlDto.actionOnUnselect;
        }
        if ((i & 32) != 0) {
            z2 = trailRadioControlDto.disabledUnselect;
        }
        if ((i & 64) != 0) {
            str2 = trailRadioControlDto.presentationId;
        }
        if ((i & 128) != 0) {
            str3 = trailRadioControlDto.metricaLabel;
        }
        String str4 = str2;
        String str5 = str3;
        TapActionDto tapActionDto3 = tapActionDto2;
        boolean z3 = z2;
        return trailRadioControlDto.copy(z, str, obj, tapActionDto, tapActionDto3, z3, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final TapActionDto getActionOnUnselect() {
        return this.actionOnUnselect;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisabledUnselect() {
        return this.disabledUnselect;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPresentationId() {
        return this.presentationId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TrailRadioControlDto copy(@Json(name = "enabled") boolean enabled, @Json(name = "key") String key, @Json(name = "value") Object value, @Json(name = "action") TapActionDto action, @Json(name = "action_on_unselect") TapActionDto actionOnUnselect, @Json(name = "disabled_unselect") boolean disabledUnselect, @Json(name = "presentation_id") String presentationId, @Json(name = "metrica_label") String metricaLabel) {
        return new TrailRadioControlDto(enabled, key, value, action, actionOnUnselect, disabledUnselect, presentationId, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailRadioControlDto)) {
            return false;
        }
        TrailRadioControlDto trailRadioControlDto = (TrailRadioControlDto) other;
        return this.enabled == trailRadioControlDto.enabled && jl40.l(this.key, trailRadioControlDto.key) && jl40.l(this.value, trailRadioControlDto.value) && jl40.l(this.action, trailRadioControlDto.action) && jl40.l(this.actionOnUnselect, trailRadioControlDto.actionOnUnselect) && this.disabledUnselect == trailRadioControlDto.disabledUnselect && jl40.l(this.presentationId, trailRadioControlDto.presentationId) && jl40.l(this.metricaLabel, trailRadioControlDto.metricaLabel);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final TapActionDto getActionOnUnselect() {
        return this.actionOnUnselect;
    }

    public final boolean getDisabledUnselect() {
        return this.disabledUnselect;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int c = smw0.c(unr0.b(Boolean.hashCode(this.enabled) * 31, 31, this.key), 31, this.value);
        TapActionDto tapActionDto = this.action;
        int hashCode = (c + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        TapActionDto tapActionDto2 = this.actionOnUnselect;
        int e = unr0.e((hashCode + (tapActionDto2 == null ? 0 : tapActionDto2.hashCode())) * 31, 31, this.disabledUnselect);
        String str = this.presentationId;
        int hashCode2 = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricaLabel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.key;
        Object obj = this.value;
        TapActionDto tapActionDto = this.action;
        TapActionDto tapActionDto2 = this.actionOnUnselect;
        boolean z2 = this.disabledUnselect;
        String str2 = this.presentationId;
        String str3 = this.metricaLabel;
        StringBuilder v = ly3.v("TrailRadioControlDto(enabled=", ", key=", str, ", value=", z);
        v.append(obj);
        v.append(", action=");
        v.append(tapActionDto);
        v.append(", actionOnUnselect=");
        v.append(tapActionDto2);
        v.append(", disabledUnselect=");
        v.append(z2);
        v.append(", presentationId=");
        return g8e.r(v, str2, ", metricaLabel=", str3, Extension.C_BRAKE);
    }

    public TrailRadioControlDto(@Json(name = "enabled") boolean z, @Json(name = "key") String str, @Json(name = "value") Object obj, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "action_on_unselect") TapActionDto tapActionDto2, @Json(name = "disabled_unselect") boolean z2, @Json(name = "presentation_id") String str2, @Json(name = "metrica_label") String str3) {
        this.enabled = z;
        this.key = str;
        this.value = obj;
        this.action = tapActionDto;
        this.actionOnUnselect = tapActionDto2;
        this.disabledUnselect = z2;
        this.presentationId = str2;
        this.metricaLabel = str3;
    }
}
