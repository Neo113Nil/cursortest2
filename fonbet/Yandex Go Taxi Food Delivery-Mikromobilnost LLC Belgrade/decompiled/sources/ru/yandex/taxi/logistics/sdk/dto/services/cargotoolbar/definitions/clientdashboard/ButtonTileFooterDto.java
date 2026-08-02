package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonTileFooterDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonStyleDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "metricaLabel", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Ljava/lang/String;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonStyleDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ButtonTileFooterDto {
    private final ActionDto action;
    private final String metricaLabel;
    private final ButtonStyleDto style;
    private final AttributedTextDto title;

    public ButtonTileFooterDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "style") ButtonStyleDto buttonStyleDto, @Json(name = "action") ActionDto actionDto, @Json(name = "metrica_label") String str) {
        this.title = attributedTextDto;
        this.style = buttonStyleDto;
        this.action = actionDto;
        this.metricaLabel = str;
    }

    public static /* synthetic */ ButtonTileFooterDto copy$default(ButtonTileFooterDto buttonTileFooterDto, AttributedTextDto attributedTextDto, ButtonStyleDto buttonStyleDto, ActionDto actionDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = buttonTileFooterDto.title;
        }
        if ((i & 2) != 0) {
            buttonStyleDto = buttonTileFooterDto.style;
        }
        if ((i & 4) != 0) {
            actionDto = buttonTileFooterDto.action;
        }
        if ((i & 8) != 0) {
            str = buttonTileFooterDto.metricaLabel;
        }
        return buttonTileFooterDto.copy(attributedTextDto, buttonStyleDto, actionDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonStyleDto getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ButtonTileFooterDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "style") ButtonStyleDto style, @Json(name = "action") ActionDto action, @Json(name = "metrica_label") String metricaLabel) {
        return new ButtonTileFooterDto(title, style, action, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonTileFooterDto)) {
            return false;
        }
        ButtonTileFooterDto buttonTileFooterDto = (ButtonTileFooterDto) other;
        return jl40.l(this.title, buttonTileFooterDto.title) && jl40.l(this.style, buttonTileFooterDto.style) && jl40.l(this.action, buttonTileFooterDto.action) && jl40.l(this.metricaLabel, buttonTileFooterDto.metricaLabel);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ButtonStyleDto getStyle() {
        return this.style;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ButtonStyleDto buttonStyleDto = this.style;
        int hashCode2 = (this.action.hashCode() + ((hashCode + (buttonStyleDto == null ? 0 : buttonStyleDto.hashCode())) * 31)) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ButtonTileFooterDto(title=" + this.title + ", style=" + this.style + ", action=" + this.action + ", metricaLabel=" + this.metricaLabel + Extension.C_BRAKE;
    }
}
