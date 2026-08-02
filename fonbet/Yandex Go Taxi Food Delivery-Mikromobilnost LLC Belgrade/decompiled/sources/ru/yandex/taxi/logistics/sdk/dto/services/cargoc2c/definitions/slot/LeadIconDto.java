package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto;", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ImageDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto$StyleDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto$StyleDto;)V", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ImageDto;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto$StyleDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LeadIconDto {
    private final ImageDto icon;
    private final StyleDto style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto$StyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "ICON", Card.CARD_TYPE_CREDIT_DEBIT, "BRAND", "BRANDXS", "USERPIC", "SERVICE", "IMAGE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @Json(name = "icon")
        public static final StyleDto ICON = new StyleDto("ICON", 0);

        @Json(name = "payment")
        public static final StyleDto PAYMENT = new StyleDto(Card.CARD_TYPE_CREDIT_DEBIT, 1);

        @Json(name = "brand")
        public static final StyleDto BRAND = new StyleDto("BRAND", 2);

        @Json(name = "brandXS")
        public static final StyleDto BRANDXS = new StyleDto("BRANDXS", 3);

        @Json(name = "userpic")
        public static final StyleDto USERPIC = new StyleDto("USERPIC", 4);

        @Json(name = Constants.KEY_SERVICE)
        public static final StyleDto SERVICE = new StyleDto("SERVICE", 5);

        @Json(name = "image")
        public static final StyleDto IMAGE = new StyleDto("IMAGE", 6);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{ICON, PAYMENT, BRAND, BRANDXS, USERPIC, SERVICE, IMAGE};
        }

        static {
            StyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
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

    public LeadIconDto(@Json(name = "icon") ImageDto imageDto, @Json(name = "style") StyleDto styleDto) {
        this.icon = imageDto;
        this.style = styleDto;
    }

    public static /* synthetic */ LeadIconDto copy$default(LeadIconDto leadIconDto, ImageDto imageDto, StyleDto styleDto, int i, Object obj) {
        if ((i & 1) != 0) {
            imageDto = leadIconDto.icon;
        }
        if ((i & 2) != 0) {
            styleDto = leadIconDto.style;
        }
        return leadIconDto.copy(imageDto, styleDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final StyleDto getStyle() {
        return this.style;
    }

    public final LeadIconDto copy(@Json(name = "icon") ImageDto icon, @Json(name = "style") StyleDto style) {
        return new LeadIconDto(icon, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadIconDto)) {
            return false;
        }
        LeadIconDto leadIconDto = (LeadIconDto) other;
        return jl40.l(this.icon, leadIconDto.icon) && this.style == leadIconDto.style;
    }

    public final ImageDto getIcon() {
        return this.icon;
    }

    public final StyleDto getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + (this.icon.hashCode() * 31);
    }

    public String toString() {
        return "LeadIconDto(icon=" + this.icon + ", style=" + this.style + Extension.C_BRAKE;
    }
}
