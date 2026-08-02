package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ShowPolicyDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006#"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDto;", "", "text", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "arrowDirection", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDto$ArrowDirectionDto;", "showPolicy", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;", "isDismissable", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDto$ArrowDirectionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;Z)V", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getBackgroundColor", "()Ljava/lang/String;", "getArrowDirection", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDto$ArrowDirectionDto;", "getShowPolicy", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ArrowDirectionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextHintPopupDto {
    private final ArrowDirectionDto arrowDirection;
    private final String backgroundColor;
    private final boolean isDismissable;
    private final ShowPolicyDto showPolicy;
    private final AttributedTextDto text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/TextHintPopupDto$ArrowDirectionDto;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "LEFT", "RIGHT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ArrowDirectionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ArrowDirectionDto[] $VALUES;

        @Json(name = "top")
        public static final ArrowDirectionDto TOP = new ArrowDirectionDto("TOP", 0);

        @Json(name = "bottom")
        public static final ArrowDirectionDto BOTTOM = new ArrowDirectionDto("BOTTOM", 1);

        @Json(name = "left")
        public static final ArrowDirectionDto LEFT = new ArrowDirectionDto("LEFT", 2);

        @Json(name = "right")
        public static final ArrowDirectionDto RIGHT = new ArrowDirectionDto("RIGHT", 3);

        private static final /* synthetic */ ArrowDirectionDto[] $values() {
            return new ArrowDirectionDto[]{TOP, BOTTOM, LEFT, RIGHT};
        }

        static {
            ArrowDirectionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ArrowDirectionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ArrowDirectionDto valueOf(String str) {
            return (ArrowDirectionDto) Enum.valueOf(ArrowDirectionDto.class, str);
        }

        public static ArrowDirectionDto[] values() {
            return (ArrowDirectionDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TextHintPopupDto(AttributedTextDto attributedTextDto, String str, ArrowDirectionDto arrowDirectionDto, ShowPolicyDto showPolicyDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(attributedTextDto, str, arrowDirectionDto, showPolicyDto, (i & 16) != 0 ? true : z);
    }

    public static /* synthetic */ TextHintPopupDto copy$default(TextHintPopupDto textHintPopupDto, AttributedTextDto attributedTextDto, String str, ArrowDirectionDto arrowDirectionDto, ShowPolicyDto showPolicyDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = textHintPopupDto.text;
        }
        if ((i & 2) != 0) {
            str = textHintPopupDto.backgroundColor;
        }
        if ((i & 4) != 0) {
            arrowDirectionDto = textHintPopupDto.arrowDirection;
        }
        if ((i & 8) != 0) {
            showPolicyDto = textHintPopupDto.showPolicy;
        }
        if ((i & 16) != 0) {
            z = textHintPopupDto.isDismissable;
        }
        boolean z2 = z;
        ArrowDirectionDto arrowDirectionDto2 = arrowDirectionDto;
        return textHintPopupDto.copy(attributedTextDto, str, arrowDirectionDto2, showPolicyDto, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final ArrowDirectionDto getArrowDirection() {
        return this.arrowDirection;
    }

    /* renamed from: component4, reason: from getter */
    public final ShowPolicyDto getShowPolicy() {
        return this.showPolicy;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDismissable() {
        return this.isDismissable;
    }

    public final TextHintPopupDto copy(@Json(name = "text") AttributedTextDto text, @Json(name = "background_color") String backgroundColor, @Json(name = "arrow_direction") ArrowDirectionDto arrowDirection, @Json(name = "show_policy") ShowPolicyDto showPolicy, @Json(name = "is_dismissable") boolean isDismissable) {
        return new TextHintPopupDto(text, backgroundColor, arrowDirection, showPolicy, isDismissable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextHintPopupDto)) {
            return false;
        }
        TextHintPopupDto textHintPopupDto = (TextHintPopupDto) other;
        return jl40.l(this.text, textHintPopupDto.text) && jl40.l(this.backgroundColor, textHintPopupDto.backgroundColor) && this.arrowDirection == textHintPopupDto.arrowDirection && jl40.l(this.showPolicy, textHintPopupDto.showPolicy) && this.isDismissable == textHintPopupDto.isDismissable;
    }

    public final ArrowDirectionDto getArrowDirection() {
        return this.arrowDirection;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ShowPolicyDto getShowPolicy() {
        return this.showPolicy;
    }

    public final AttributedTextDto getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.arrowDirection.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ShowPolicyDto showPolicyDto = this.showPolicy;
        return Boolean.hashCode(this.isDismissable) + ((hashCode2 + (showPolicyDto != null ? showPolicyDto.hashCode() : 0)) * 31);
    }

    public final boolean isDismissable() {
        return this.isDismissable;
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.text;
        String str = this.backgroundColor;
        ArrowDirectionDto arrowDirectionDto = this.arrowDirection;
        ShowPolicyDto showPolicyDto = this.showPolicy;
        boolean z = this.isDismissable;
        StringBuilder sb = new StringBuilder("TextHintPopupDto(text=");
        sb.append(attributedTextDto);
        sb.append(", backgroundColor=");
        sb.append(str);
        sb.append(", arrowDirection=");
        sb.append(arrowDirectionDto);
        sb.append(", showPolicy=");
        sb.append(showPolicyDto);
        sb.append(", isDismissable=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }

    public TextHintPopupDto(@Json(name = "text") AttributedTextDto attributedTextDto, @Json(name = "background_color") String str, @Json(name = "arrow_direction") ArrowDirectionDto arrowDirectionDto, @Json(name = "show_policy") ShowPolicyDto showPolicyDto, @Json(name = "is_dismissable") boolean z) {
        this.text = attributedTextDto;
        this.backgroundColor = str;
        this.arrowDirection = arrowDirectionDto;
        this.showPolicy = showPolicyDto;
        this.isDismissable = z;
    }
}
