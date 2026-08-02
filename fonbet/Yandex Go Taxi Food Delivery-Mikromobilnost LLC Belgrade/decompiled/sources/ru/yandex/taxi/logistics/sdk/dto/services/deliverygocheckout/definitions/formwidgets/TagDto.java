package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.AccessibilityInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00017B\u0081\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0083\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagDto;", "", "text", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "iconPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagDto$IconPositionDto;", "badge", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "accessibilityInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagDto$IconPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;Ljava/lang/String;Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;)V", "getText", "()Ljava/lang/String;", "getBackgroundColor", "getTextColor", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getIconPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagDto$IconPositionDto;", "getBadge", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "getAccessibilityInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "IconPositionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TagDto {
    private final AccessibilityInfoDto accessibilityInfo;
    private final TapActionDto action;
    private final String backgroundColor;
    private final FormBadgeDto badge;
    private final ImageDto icon;
    private final IconPositionDto iconPosition;
    private final Object meta;
    private final String metricaLabel;
    private final String text;
    private final String textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagDto$IconPositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "LEAD", "TRAIL", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPositionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ IconPositionDto[] $VALUES;

        @Json(name = "lead")
        public static final IconPositionDto LEAD = new IconPositionDto("LEAD", 0);

        @Json(name = "trail")
        public static final IconPositionDto TRAIL = new IconPositionDto("TRAIL", 1);

        private static final /* synthetic */ IconPositionDto[] $values() {
            return new IconPositionDto[]{LEAD, TRAIL};
        }

        static {
            IconPositionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private IconPositionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static IconPositionDto valueOf(String str) {
            return (IconPositionDto) Enum.valueOf(IconPositionDto.class, str);
        }

        public static IconPositionDto[] values() {
            return (IconPositionDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TagDto(String str, String str2, String str3, ImageDto imageDto, IconPositionDto iconPositionDto, FormBadgeDto formBadgeDto, TapActionDto tapActionDto, String str4, Object obj, AccessibilityInfoDto accessibilityInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, imageDto, (i & 16) != 0 ? IconPositionDto.TRAIL : iconPositionDto, formBadgeDto, tapActionDto, str4, obj, accessibilityInfoDto);
    }

    public static /* synthetic */ TagDto copy$default(TagDto tagDto, String str, String str2, String str3, ImageDto imageDto, IconPositionDto iconPositionDto, FormBadgeDto formBadgeDto, TapActionDto tapActionDto, String str4, Object obj, AccessibilityInfoDto accessibilityInfoDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = tagDto.text;
        }
        if ((i & 2) != 0) {
            str2 = tagDto.backgroundColor;
        }
        if ((i & 4) != 0) {
            str3 = tagDto.textColor;
        }
        if ((i & 8) != 0) {
            imageDto = tagDto.icon;
        }
        if ((i & 16) != 0) {
            iconPositionDto = tagDto.iconPosition;
        }
        if ((i & 32) != 0) {
            formBadgeDto = tagDto.badge;
        }
        if ((i & 64) != 0) {
            tapActionDto = tagDto.action;
        }
        if ((i & 128) != 0) {
            str4 = tagDto.metricaLabel;
        }
        if ((i & 256) != 0) {
            obj = tagDto.meta;
        }
        if ((i & 512) != 0) {
            accessibilityInfoDto = tagDto.accessibilityInfo;
        }
        Object obj3 = obj;
        AccessibilityInfoDto accessibilityInfoDto2 = accessibilityInfoDto;
        TapActionDto tapActionDto2 = tapActionDto;
        String str5 = str4;
        IconPositionDto iconPositionDto2 = iconPositionDto;
        FormBadgeDto formBadgeDto2 = formBadgeDto;
        return tagDto.copy(str, str2, str3, imageDto, iconPositionDto2, formBadgeDto2, tapActionDto2, str5, obj3, accessibilityInfoDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ImageDto getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final IconPositionDto getIconPosition() {
        return this.iconPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    /* renamed from: component7, reason: from getter */
    public final TapActionDto getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final TagDto copy(@Json(name = "text") String text, @Json(name = "background_color") String backgroundColor, @Json(name = "text_color") String textColor, @Json(name = "icon") ImageDto icon, @Json(name = "icon_position") IconPositionDto iconPosition, @Json(name = "badge") FormBadgeDto badge, @Json(name = "action") TapActionDto action, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfo) {
        return new TagDto(text, backgroundColor, textColor, icon, iconPosition, badge, action, metricaLabel, meta, accessibilityInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagDto)) {
            return false;
        }
        TagDto tagDto = (TagDto) other;
        return jl40.l(this.text, tagDto.text) && jl40.l(this.backgroundColor, tagDto.backgroundColor) && jl40.l(this.textColor, tagDto.textColor) && jl40.l(this.icon, tagDto.icon) && this.iconPosition == tagDto.iconPosition && jl40.l(this.badge, tagDto.badge) && jl40.l(this.action, tagDto.action) && jl40.l(this.metricaLabel, tagDto.metricaLabel) && jl40.l(this.meta, tagDto.meta) && jl40.l(this.accessibilityInfo, tagDto.accessibilityInfo);
    }

    public final AccessibilityInfoDto getAccessibilityInfo() {
        return this.accessibilityInfo;
    }

    public final TapActionDto getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    public final ImageDto getIcon() {
        return this.icon;
    }

    public final IconPositionDto getIconPosition() {
        return this.iconPosition;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageDto imageDto = this.icon;
        int hashCode4 = (this.iconPosition.hashCode() + ((hashCode3 + (imageDto == null ? 0 : imageDto.hashCode())) * 31)) * 31;
        FormBadgeDto formBadgeDto = this.badge;
        int hashCode5 = (hashCode4 + (formBadgeDto == null ? 0 : formBadgeDto.hashCode())) * 31;
        TapActionDto tapActionDto = this.action;
        int hashCode6 = (hashCode5 + (tapActionDto == null ? 0 : tapActionDto.hashCode())) * 31;
        String str3 = this.metricaLabel;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.meta;
        int hashCode8 = (hashCode7 + (obj == null ? 0 : obj.hashCode())) * 31;
        AccessibilityInfoDto accessibilityInfoDto = this.accessibilityInfo;
        return hashCode8 + (accessibilityInfoDto != null ? accessibilityInfoDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.backgroundColor;
        String str3 = this.textColor;
        ImageDto imageDto = this.icon;
        IconPositionDto iconPositionDto = this.iconPosition;
        FormBadgeDto formBadgeDto = this.badge;
        TapActionDto tapActionDto = this.action;
        String str4 = this.metricaLabel;
        Object obj = this.meta;
        AccessibilityInfoDto accessibilityInfoDto = this.accessibilityInfo;
        StringBuilder v = b64.v("TagDto(text=", str, ", backgroundColor=", str2, ", textColor=");
        v.append(str3);
        v.append(", icon=");
        v.append(imageDto);
        v.append(", iconPosition=");
        v.append(iconPositionDto);
        v.append(", badge=");
        v.append(formBadgeDto);
        v.append(", action=");
        v.append(tapActionDto);
        v.append(", metricaLabel=");
        v.append(str4);
        v.append(", meta=");
        v.append(obj);
        v.append(", accessibilityInfo=");
        v.append(accessibilityInfoDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public TagDto(@Json(name = "text") String str, @Json(name = "background_color") String str2, @Json(name = "text_color") String str3, @Json(name = "icon") ImageDto imageDto, @Json(name = "icon_position") IconPositionDto iconPositionDto, @Json(name = "badge") FormBadgeDto formBadgeDto, @Json(name = "action") TapActionDto tapActionDto, @Json(name = "metrica_label") String str4, @Json(name = "meta") Object obj, @Json(name = "accessibility_info") AccessibilityInfoDto accessibilityInfoDto) {
        this.text = str;
        this.backgroundColor = str2;
        this.textColor = str3;
        this.icon = imageDto;
        this.iconPosition = iconPositionDto;
        this.badge = formBadgeDto;
        this.action = tapActionDto;
        this.metricaLabel = str4;
        this.meta = obj;
        this.accessibilityInfo = accessibilityInfoDto;
    }
}
