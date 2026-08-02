package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto;", "", "slot", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto$StyleDto;", "customStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CustomButtonStyleDto;", BackendConfig.Restrictions.ENABLED, "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto$StyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CustomButtonStyleDto;Z)V", "getSlot", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotBodyDto;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto$StyleDto;", "getCustomStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CustomButtonStyleDto;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "StyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ButtonStyleDto {
    private final CustomButtonStyleDto customStyle;
    private final boolean enabled;
    private final SlotBodyDto slot;
    private final StyleDto style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonStyleDto$StyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "MINOR", "MAIN", "OUTLINE", "FLOATING", "GHOST", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @Json(name = "minor")
        public static final StyleDto MINOR = new StyleDto("MINOR", 0);

        @Json(name = "main")
        public static final StyleDto MAIN = new StyleDto("MAIN", 1);

        @Json(name = "outline")
        public static final StyleDto OUTLINE = new StyleDto("OUTLINE", 2);

        @Json(name = "floating")
        public static final StyleDto FLOATING = new StyleDto("FLOATING", 3);

        @Json(name = "ghost")
        public static final StyleDto GHOST = new StyleDto("GHOST", 4);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{MINOR, MAIN, OUTLINE, FLOATING, GHOST};
        }

        static {
            StyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private StyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    public ButtonStyleDto(@Json(name = "slot") SlotBodyDto slotBodyDto, @Json(name = "style") StyleDto styleDto, @Json(name = "custom_style") CustomButtonStyleDto customButtonStyleDto, @Json(name = "enabled") boolean z) {
        this.slot = slotBodyDto;
        this.style = styleDto;
        this.customStyle = customButtonStyleDto;
        this.enabled = z;
    }

    public static /* synthetic */ ButtonStyleDto copy$default(ButtonStyleDto buttonStyleDto, SlotBodyDto slotBodyDto, StyleDto styleDto, CustomButtonStyleDto customButtonStyleDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            slotBodyDto = buttonStyleDto.slot;
        }
        if ((i & 2) != 0) {
            styleDto = buttonStyleDto.style;
        }
        if ((i & 4) != 0) {
            customButtonStyleDto = buttonStyleDto.customStyle;
        }
        if ((i & 8) != 0) {
            z = buttonStyleDto.enabled;
        }
        return buttonStyleDto.copy(slotBodyDto, styleDto, customButtonStyleDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final SlotBodyDto getSlot() {
        return this.slot;
    }

    /* renamed from: component2, reason: from getter */
    public final StyleDto getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final CustomButtonStyleDto getCustomStyle() {
        return this.customStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ButtonStyleDto copy(@Json(name = "slot") SlotBodyDto slot, @Json(name = "style") StyleDto style, @Json(name = "custom_style") CustomButtonStyleDto customStyle, @Json(name = "enabled") boolean enabled) {
        return new ButtonStyleDto(slot, style, customStyle, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStyleDto)) {
            return false;
        }
        ButtonStyleDto buttonStyleDto = (ButtonStyleDto) other;
        return jl40.l(this.slot, buttonStyleDto.slot) && this.style == buttonStyleDto.style && jl40.l(this.customStyle, buttonStyleDto.customStyle) && this.enabled == buttonStyleDto.enabled;
    }

    public final CustomButtonStyleDto getCustomStyle() {
        return this.customStyle;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final SlotBodyDto getSlot() {
        return this.slot;
    }

    public final StyleDto getStyle() {
        return this.style;
    }

    public int hashCode() {
        int hashCode = (this.style.hashCode() + (this.slot.hashCode() * 31)) * 31;
        CustomButtonStyleDto customButtonStyleDto = this.customStyle;
        return Boolean.hashCode(this.enabled) + ((hashCode + (customButtonStyleDto == null ? 0 : customButtonStyleDto.hashCode())) * 31);
    }

    public String toString() {
        return "ButtonStyleDto(slot=" + this.slot + ", style=" + this.style + ", customStyle=" + this.customStyle + ", enabled=" + this.enabled + Extension.C_BRAKE;
    }

    public /* synthetic */ ButtonStyleDto(SlotBodyDto slotBodyDto, StyleDto styleDto, CustomButtonStyleDto customButtonStyleDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotBodyDto, styleDto, customButtonStyleDto, (i & 8) != 0 ? true : z);
    }
}
