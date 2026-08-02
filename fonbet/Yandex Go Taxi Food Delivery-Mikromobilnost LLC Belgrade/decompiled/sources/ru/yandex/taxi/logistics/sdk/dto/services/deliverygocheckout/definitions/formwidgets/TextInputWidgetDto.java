package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0098\u0001\u00106\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00052\b\b\u0003\u0010\u0013\u001a\u00020\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006<"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputWidgetDto;", "", "widgetId", "", "height", "", "placeholder", "focusedStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;", "unfocusedStyle", "formStateKey", "forceOpenKeyboard", "", "trails", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotTrailDto;", "stopWordsConfig", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsConfigDto;", "maxSymbols", "horizontalInset", "metricaLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsConfigDto;IILjava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getHeight", "()I", "getPlaceholder", "getFocusedStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;", "getUnfocusedStyle", "getFormStateKey", "getForceOpenKeyboard", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrails", "()Ljava/util/List;", "getStopWordsConfig", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsConfigDto;", "getMaxSymbols", "getHorizontalInset", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;ILjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsConfigDto;IILjava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputWidgetDto;", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextInputWidgetDto {
    private final TextInputStyleDto focusedStyle;
    private final Boolean forceOpenKeyboard;
    private final String formStateKey;
    private final int height;
    private final int horizontalInset;
    private final int maxSymbols;
    private final String metricaLabel;
    private final String placeholder;
    private final TextInputStopWordsConfigDto stopWordsConfig;
    private final List<SlotTrailDto> trails;
    private final TextInputStyleDto unfocusedStyle;
    private final String widgetId;

    public /* synthetic */ TextInputWidgetDto(String str, int i, String str2, TextInputStyleDto textInputStyleDto, TextInputStyleDto textInputStyleDto2, String str3, Boolean bool, List list, TextInputStopWordsConfigDto textInputStopWordsConfigDto, int i2, int i3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, textInputStyleDto, textInputStyleDto2, str3, bool, list, textInputStopWordsConfigDto, (i4 & 512) != 0 ? 4000 : i2, (i4 & 1024) != 0 ? 16 : i3, str4);
    }

    public static /* synthetic */ TextInputWidgetDto copy$default(TextInputWidgetDto textInputWidgetDto, String str, int i, String str2, TextInputStyleDto textInputStyleDto, TextInputStyleDto textInputStyleDto2, String str3, Boolean bool, List list, TextInputStopWordsConfigDto textInputStopWordsConfigDto, int i2, int i3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = textInputWidgetDto.widgetId;
        }
        if ((i4 & 2) != 0) {
            i = textInputWidgetDto.height;
        }
        if ((i4 & 4) != 0) {
            str2 = textInputWidgetDto.placeholder;
        }
        if ((i4 & 8) != 0) {
            textInputStyleDto = textInputWidgetDto.focusedStyle;
        }
        if ((i4 & 16) != 0) {
            textInputStyleDto2 = textInputWidgetDto.unfocusedStyle;
        }
        if ((i4 & 32) != 0) {
            str3 = textInputWidgetDto.formStateKey;
        }
        if ((i4 & 64) != 0) {
            bool = textInputWidgetDto.forceOpenKeyboard;
        }
        if ((i4 & 128) != 0) {
            list = textInputWidgetDto.trails;
        }
        if ((i4 & 256) != 0) {
            textInputStopWordsConfigDto = textInputWidgetDto.stopWordsConfig;
        }
        if ((i4 & 512) != 0) {
            i2 = textInputWidgetDto.maxSymbols;
        }
        if ((i4 & 1024) != 0) {
            i3 = textInputWidgetDto.horizontalInset;
        }
        if ((i4 & 2048) != 0) {
            str4 = textInputWidgetDto.metricaLabel;
        }
        int i5 = i3;
        String str5 = str4;
        TextInputStopWordsConfigDto textInputStopWordsConfigDto2 = textInputStopWordsConfigDto;
        int i6 = i2;
        Boolean bool2 = bool;
        List list2 = list;
        TextInputStyleDto textInputStyleDto3 = textInputStyleDto2;
        String str6 = str3;
        return textInputWidgetDto.copy(str, i, str2, textInputStyleDto, textInputStyleDto3, str6, bool2, list2, textInputStopWordsConfigDto2, i6, i5, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getMaxSymbols() {
        return this.maxSymbols;
    }

    /* renamed from: component11, reason: from getter */
    public final int getHorizontalInset() {
        return this.horizontalInset;
    }

    /* renamed from: component12, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component4, reason: from getter */
    public final TextInputStyleDto getFocusedStyle() {
        return this.focusedStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final TextInputStyleDto getUnfocusedStyle() {
        return this.unfocusedStyle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getForceOpenKeyboard() {
        return this.forceOpenKeyboard;
    }

    public final List<SlotTrailDto> component8() {
        return this.trails;
    }

    /* renamed from: component9, reason: from getter */
    public final TextInputStopWordsConfigDto getStopWordsConfig() {
        return this.stopWordsConfig;
    }

    public final TextInputWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "height") int height, @Json(name = "placeholder") String placeholder, @Json(name = "focused_style") TextInputStyleDto focusedStyle, @Json(name = "unfocused_style") TextInputStyleDto unfocusedStyle, @Json(name = "form_state_key") String formStateKey, @Json(name = "force_open_keyboard") Boolean forceOpenKeyboard, @Json(name = "trails") List<? extends SlotTrailDto> trails, @Json(name = "stop_words_config") TextInputStopWordsConfigDto stopWordsConfig, @Json(name = "max_symbols") int maxSymbols, @Json(name = "horizontal_inset") int horizontalInset, @Json(name = "metrica_label") String metricaLabel) {
        return new TextInputWidgetDto(widgetId, height, placeholder, focusedStyle, unfocusedStyle, formStateKey, forceOpenKeyboard, trails, stopWordsConfig, maxSymbols, horizontalInset, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputWidgetDto)) {
            return false;
        }
        TextInputWidgetDto textInputWidgetDto = (TextInputWidgetDto) other;
        return jl40.l(this.widgetId, textInputWidgetDto.widgetId) && this.height == textInputWidgetDto.height && jl40.l(this.placeholder, textInputWidgetDto.placeholder) && jl40.l(this.focusedStyle, textInputWidgetDto.focusedStyle) && jl40.l(this.unfocusedStyle, textInputWidgetDto.unfocusedStyle) && jl40.l(this.formStateKey, textInputWidgetDto.formStateKey) && jl40.l(this.forceOpenKeyboard, textInputWidgetDto.forceOpenKeyboard) && jl40.l(this.trails, textInputWidgetDto.trails) && jl40.l(this.stopWordsConfig, textInputWidgetDto.stopWordsConfig) && this.maxSymbols == textInputWidgetDto.maxSymbols && this.horizontalInset == textInputWidgetDto.horizontalInset && jl40.l(this.metricaLabel, textInputWidgetDto.metricaLabel);
    }

    public final TextInputStyleDto getFocusedStyle() {
        return this.focusedStyle;
    }

    public final Boolean getForceOpenKeyboard() {
        return this.forceOpenKeyboard;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHorizontalInset() {
        return this.horizontalInset;
    }

    public final int getMaxSymbols() {
        return this.maxSymbols;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final TextInputStopWordsConfigDto getStopWordsConfig() {
        return this.stopWordsConfig;
    }

    public final List<SlotTrailDto> getTrails() {
        return this.trails;
    }

    public final TextInputStyleDto getUnfocusedStyle() {
        return this.unfocusedStyle;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int b = unr0.b(oyr.b(this.height, this.widgetId.hashCode() * 31, 31), 31, this.placeholder);
        TextInputStyleDto textInputStyleDto = this.focusedStyle;
        int hashCode = (b + (textInputStyleDto == null ? 0 : textInputStyleDto.hashCode())) * 31;
        TextInputStyleDto textInputStyleDto2 = this.unfocusedStyle;
        int b2 = unr0.b((hashCode + (textInputStyleDto2 == null ? 0 : textInputStyleDto2.hashCode())) * 31, 31, this.formStateKey);
        Boolean bool = this.forceOpenKeyboard;
        int hashCode2 = (b2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SlotTrailDto> list = this.trails;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        TextInputStopWordsConfigDto textInputStopWordsConfigDto = this.stopWordsConfig;
        int b3 = oyr.b(this.horizontalInset, oyr.b(this.maxSymbols, (hashCode3 + (textInputStopWordsConfigDto == null ? 0 : textInputStopWordsConfigDto.hashCode())) * 31, 31), 31);
        String str = this.metricaLabel;
        return b3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        int i = this.height;
        String str2 = this.placeholder;
        TextInputStyleDto textInputStyleDto = this.focusedStyle;
        TextInputStyleDto textInputStyleDto2 = this.unfocusedStyle;
        String str3 = this.formStateKey;
        Boolean bool = this.forceOpenKeyboard;
        List<SlotTrailDto> list = this.trails;
        TextInputStopWordsConfigDto textInputStopWordsConfigDto = this.stopWordsConfig;
        int i2 = this.maxSymbols;
        int i3 = this.horizontalInset;
        String str4 = this.metricaLabel;
        StringBuilder u = b64.u(i, "TextInputWidgetDto(widgetId=", str, ", height=", ", placeholder=");
        u.append(str2);
        u.append(", focusedStyle=");
        u.append(textInputStyleDto);
        u.append(", unfocusedStyle=");
        u.append(textInputStyleDto2);
        u.append(", formStateKey=");
        u.append(str3);
        u.append(", forceOpenKeyboard=");
        u.append(bool);
        u.append(", trails=");
        u.append(list);
        u.append(", stopWordsConfig=");
        u.append(textInputStopWordsConfigDto);
        u.append(", maxSymbols=");
        u.append(i2);
        u.append(", horizontalInset=");
        return xvz.h(i3, ", metricaLabel=", str4, Extension.C_BRAKE, u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextInputWidgetDto(@Json(name = "widget_id") String str, @Json(name = "height") int i, @Json(name = "placeholder") String str2, @Json(name = "focused_style") TextInputStyleDto textInputStyleDto, @Json(name = "unfocused_style") TextInputStyleDto textInputStyleDto2, @Json(name = "form_state_key") String str3, @Json(name = "force_open_keyboard") Boolean bool, @Json(name = "trails") List<? extends SlotTrailDto> list, @Json(name = "stop_words_config") TextInputStopWordsConfigDto textInputStopWordsConfigDto, @Json(name = "max_symbols") int i2, @Json(name = "horizontal_inset") int i3, @Json(name = "metrica_label") String str4) {
        this.widgetId = str;
        this.height = i;
        this.placeholder = str2;
        this.focusedStyle = textInputStyleDto;
        this.unfocusedStyle = textInputStyleDto2;
        this.formStateKey = str3;
        this.forceOpenKeyboard = bool;
        this.trails = list;
        this.stopWordsConfig = textInputStopWordsConfigDto;
        this.maxSymbols = i2;
        this.horizontalInset = i3;
        this.metricaLabel = str4;
    }
}
