package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowWidgetDto;", "", "widgetId", "", "buttonsSize", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;", "buttons", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;Ljava/util/List;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getButtonsSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;", "getButtons", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ButtonsRowWidgetDto {
    private final List<ButtonsRowButtonDto> buttons;
    private final ButtonSizeDto buttonsSize;
    private final String metricaLabel;
    private final String widgetId;

    public ButtonsRowWidgetDto(@Json(name = "widget_id") String str, @Json(name = "buttons_size") ButtonSizeDto buttonSizeDto, @Json(name = "buttons") List<ButtonsRowButtonDto> list, @Json(name = "metrica_label") String str2) {
        this.widgetId = str;
        this.buttonsSize = buttonSizeDto;
        this.buttons = list;
        this.metricaLabel = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonsRowWidgetDto copy$default(ButtonsRowWidgetDto buttonsRowWidgetDto, String str, ButtonSizeDto buttonSizeDto, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonsRowWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            buttonSizeDto = buttonsRowWidgetDto.buttonsSize;
        }
        if ((i & 4) != 0) {
            list = buttonsRowWidgetDto.buttons;
        }
        if ((i & 8) != 0) {
            str2 = buttonsRowWidgetDto.metricaLabel;
        }
        return buttonsRowWidgetDto.copy(str, buttonSizeDto, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonSizeDto getButtonsSize() {
        return this.buttonsSize;
    }

    public final List<ButtonsRowButtonDto> component3() {
        return this.buttons;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ButtonsRowWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "buttons_size") ButtonSizeDto buttonsSize, @Json(name = "buttons") List<ButtonsRowButtonDto> buttons, @Json(name = "metrica_label") String metricaLabel) {
        return new ButtonsRowWidgetDto(widgetId, buttonsSize, buttons, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsRowWidgetDto)) {
            return false;
        }
        ButtonsRowWidgetDto buttonsRowWidgetDto = (ButtonsRowWidgetDto) other;
        return jl40.l(this.widgetId, buttonsRowWidgetDto.widgetId) && this.buttonsSize == buttonsRowWidgetDto.buttonsSize && jl40.l(this.buttons, buttonsRowWidgetDto.buttons) && jl40.l(this.metricaLabel, buttonsRowWidgetDto.metricaLabel);
    }

    public final List<ButtonsRowButtonDto> getButtons() {
        return this.buttons;
    }

    public final ButtonSizeDto getButtonsSize() {
        return this.buttonsSize;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c((this.buttonsSize.hashCode() + (this.widgetId.hashCode() * 31)) * 31, 31, this.buttons);
        String str = this.metricaLabel;
        return c + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        ButtonSizeDto buttonSizeDto = this.buttonsSize;
        List<ButtonsRowButtonDto> list = this.buttons;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ButtonsRowWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", buttonsSize=");
        sb.append(buttonSizeDto);
        sb.append(", buttons=");
        return n.l(", metricaLabel=", str2, Extension.C_BRAKE, sb, list);
    }
}
