package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "accessibilityLabel", "", "buttonStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDto$ButtonStyleDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "presentationId", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDto$ButtonStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getAccessibilityLabel", "()Ljava/lang/String;", "getButtonStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDto$ButtonStyleDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getPresentationId", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ButtonStyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrailButtonDto {
    private final String accessibilityLabel;
    private final TapActionDto action;
    private final ButtonStyleDto buttonStyle;
    private final Object meta;
    private final String metricaLabel;
    private final String presentationId;
    private final AttributedTextDto title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailButtonDto$ButtonStyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "OUTLINE", "MINOR", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonStyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonStyleDto[] $VALUES;

        @Json(name = "main")
        public static final ButtonStyleDto MAIN = new ButtonStyleDto("MAIN", 0);

        @Json(name = "outline")
        public static final ButtonStyleDto OUTLINE = new ButtonStyleDto("OUTLINE", 1);

        @Json(name = "minor")
        public static final ButtonStyleDto MINOR = new ButtonStyleDto("MINOR", 2);

        private static final /* synthetic */ ButtonStyleDto[] $values() {
            return new ButtonStyleDto[]{MAIN, OUTLINE, MINOR};
        }

        static {
            ButtonStyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ButtonStyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ButtonStyleDto valueOf(String str) {
            return (ButtonStyleDto) Enum.valueOf(ButtonStyleDto.class, str);
        }

        public static ButtonStyleDto[] values() {
            return (ButtonStyleDto[]) $VALUES.clone();
        }
    }

    public TrailButtonDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "accessibility_label") String str, @Json(name = "button_style") ButtonStyleDto buttonStyleDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "presentation_id") String str2, @Json(name = "metrica_label") String str3, @Json(name = "meta") Object obj) {
        this.title = attributedTextDto;
        this.accessibilityLabel = str;
        this.buttonStyle = buttonStyleDto;
        this.action = tapActionDto;
        this.presentationId = str2;
        this.metricaLabel = str3;
        this.meta = obj;
    }

    public static /* synthetic */ TrailButtonDto copy$default(TrailButtonDto trailButtonDto, AttributedTextDto attributedTextDto, String str, ButtonStyleDto buttonStyleDto, TapActionDto tapActionDto, String str2, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            attributedTextDto = trailButtonDto.title;
        }
        if ((i & 2) != 0) {
            str = trailButtonDto.accessibilityLabel;
        }
        if ((i & 4) != 0) {
            buttonStyleDto = trailButtonDto.buttonStyle;
        }
        if ((i & 8) != 0) {
            tapActionDto = trailButtonDto.action;
        }
        if ((i & 16) != 0) {
            str2 = trailButtonDto.presentationId;
        }
        if ((i & 32) != 0) {
            str3 = trailButtonDto.metricaLabel;
        }
        if ((i & 64) != 0) {
            obj = trailButtonDto.meta;
        }
        String str4 = str3;
        Object obj3 = obj;
        String str5 = str2;
        ButtonStyleDto buttonStyleDto2 = buttonStyleDto;
        return trailButtonDto.copy(attributedTextDto, str, buttonStyleDto2, tapActionDto, str5, str4, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonStyleDto getButtonStyle() {
        return this.buttonStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPresentationId() {
        return this.presentationId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final TrailButtonDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "accessibility_label") String accessibilityLabel, @Json(name = "button_style") ButtonStyleDto buttonStyle, @Json(name = "action") TapActionDto action, @Json(name = "presentation_id") String presentationId, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new TrailButtonDto(title, accessibilityLabel, buttonStyle, action, presentationId, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailButtonDto)) {
            return false;
        }
        TrailButtonDto trailButtonDto = (TrailButtonDto) other;
        return jl40.l(this.title, trailButtonDto.title) && jl40.l(this.accessibilityLabel, trailButtonDto.accessibilityLabel) && this.buttonStyle == trailButtonDto.buttonStyle && jl40.l(this.action, trailButtonDto.action) && jl40.l(this.presentationId, trailButtonDto.presentationId) && jl40.l(this.metricaLabel, trailButtonDto.metricaLabel) && jl40.l(this.meta, trailButtonDto.meta);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final ButtonStyleDto getButtonStyle() {
        return this.buttonStyle;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.accessibilityLabel;
        int hashCode2 = (this.action.hashCode() + ((this.buttonStyle.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.presentationId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metricaLabel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.title;
        String str = this.accessibilityLabel;
        ButtonStyleDto buttonStyleDto = this.buttonStyle;
        TapActionDto tapActionDto = this.action;
        String str2 = this.presentationId;
        String str3 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("TrailButtonDto(title=");
        sb.append(attributedTextDto);
        sb.append(", accessibilityLabel=");
        sb.append(str);
        sb.append(", buttonStyle=");
        sb.append(buttonStyleDto);
        sb.append(", action=");
        sb.append(tapActionDto);
        sb.append(", presentationId=");
        g8e.D(sb, str2, ", metricaLabel=", str3, ", meta=");
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }
}
