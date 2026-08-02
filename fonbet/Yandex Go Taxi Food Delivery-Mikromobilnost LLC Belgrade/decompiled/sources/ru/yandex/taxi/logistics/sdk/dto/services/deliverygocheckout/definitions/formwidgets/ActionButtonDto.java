package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonDto;", "", "normalStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;", "loadingStyle", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Ljava/lang/Object;)V", "getNormalStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;", "getLoadingStyle", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ActionButtonDto {
    private final TapActionDto action;
    private final ButtonStyleDto loadingStyle;
    private final Object meta;
    private final String metricaLabel;
    private final ButtonStyleDto normalStyle;

    public ActionButtonDto(@Json(name = "normal_style") ButtonStyleDto buttonStyleDto, @Json(name = "loading_style") ButtonStyleDto buttonStyleDto2, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.normalStyle = buttonStyleDto;
        this.loadingStyle = buttonStyleDto2;
        this.action = tapActionDto;
        this.metricaLabel = str;
        this.meta = obj;
    }

    public static /* synthetic */ ActionButtonDto copy$default(ActionButtonDto actionButtonDto, ButtonStyleDto buttonStyleDto, ButtonStyleDto buttonStyleDto2, TapActionDto tapActionDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            buttonStyleDto = actionButtonDto.normalStyle;
        }
        if ((i & 2) != 0) {
            buttonStyleDto2 = actionButtonDto.loadingStyle;
        }
        if ((i & 4) != 0) {
            tapActionDto = actionButtonDto.action;
        }
        if ((i & 8) != 0) {
            str = actionButtonDto.metricaLabel;
        }
        if ((i & 16) != 0) {
            obj = actionButtonDto.meta;
        }
        Object obj3 = obj;
        TapActionDto tapActionDto2 = tapActionDto;
        return actionButtonDto.copy(buttonStyleDto, buttonStyleDto2, tapActionDto2, str, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonStyleDto getNormalStyle() {
        return this.normalStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonStyleDto getLoadingStyle() {
        return this.loadingStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final ActionButtonDto copy(@Json(name = "normal_style") ButtonStyleDto normalStyle, @Json(name = "loading_style") ButtonStyleDto loadingStyle, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new ActionButtonDto(normalStyle, loadingStyle, action, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonDto)) {
            return false;
        }
        ActionButtonDto actionButtonDto = (ActionButtonDto) other;
        return jl40.l(this.normalStyle, actionButtonDto.normalStyle) && jl40.l(this.loadingStyle, actionButtonDto.loadingStyle) && jl40.l(this.action, actionButtonDto.action) && jl40.l(this.metricaLabel, actionButtonDto.metricaLabel) && jl40.l(this.meta, actionButtonDto.meta);
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final ButtonStyleDto getLoadingStyle() {
        return this.loadingStyle;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ButtonStyleDto getNormalStyle() {
        return this.normalStyle;
    }

    public int hashCode() {
        int hashCode = this.normalStyle.hashCode() * 31;
        ButtonStyleDto buttonStyleDto = this.loadingStyle;
        int hashCode2 = (this.action.hashCode() + ((hashCode + (buttonStyleDto == null ? 0 : buttonStyleDto.hashCode())) * 31)) * 31;
        String str = this.metricaLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        ButtonStyleDto buttonStyleDto = this.normalStyle;
        ButtonStyleDto buttonStyleDto2 = this.loadingStyle;
        TapActionDto tapActionDto = this.action;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("ActionButtonDto(normalStyle=");
        sb.append(buttonStyleDto);
        sb.append(", loadingStyle=");
        sb.append(buttonStyleDto2);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", metricaLabel=");
        sb.append(str);
        sb.append(", meta=");
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }
}
