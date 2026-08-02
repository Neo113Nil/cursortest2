package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002()BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto;", "", "modalId", "", "topButton", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$TopButtonDto;", "cardMode", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CardModeDto;", "modalType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$ModalTypeDto;", "closeByHardwareBack", "", "showPolicy", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$TopButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CardModeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$ModalTypeDto;ZLru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;)V", "getModalId", "()Ljava/lang/String;", "getTopButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$TopButtonDto;", "getCardMode", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CardModeDto;", "getModalType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$ModalTypeDto;", "getCloseByHardwareBack", "()Z", "getShowPolicy", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShowPolicyDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "TopButtonDto", "ModalTypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModalActionDto {
    private final CardModeDto cardMode;
    private final boolean closeByHardwareBack;
    private final String modalId;
    private final ModalTypeDto modalType;
    private final ShowPolicyDto showPolicy;
    private final TopButtonDto topButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$ModalTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "OVER_FORM", "OVER_MAP", "OVER_CAMERA", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ModalTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ModalTypeDto[] $VALUES;

        @Json(name = "over_form")
        public static final ModalTypeDto OVER_FORM = new ModalTypeDto("OVER_FORM", 0);

        @Json(name = "over_map")
        public static final ModalTypeDto OVER_MAP = new ModalTypeDto("OVER_MAP", 1);

        @Json(name = "over_camera")
        public static final ModalTypeDto OVER_CAMERA = new ModalTypeDto("OVER_CAMERA", 2);

        private static final /* synthetic */ ModalTypeDto[] $values() {
            return new ModalTypeDto[]{OVER_FORM, OVER_MAP, OVER_CAMERA};
        }

        static {
            ModalTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ModalTypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ModalTypeDto valueOf(String str) {
            return (ModalTypeDto) Enum.valueOf(ModalTypeDto.class, str);
        }

        public static ModalTypeDto[] values() {
            return (ModalTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ModalActionDto$TopButtonDto;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "CLOSE", JCP.RAW_PREFIX, "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TopButtonDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TopButtonDto[] $VALUES;

        @Json(name = "back")
        public static final TopButtonDto BACK = new TopButtonDto("BACK", 0);

        @Json(name = "close")
        public static final TopButtonDto CLOSE = new TopButtonDto("CLOSE", 1);

        @Json(name = "none")
        public static final TopButtonDto NONE = new TopButtonDto(JCP.RAW_PREFIX, 2);

        private static final /* synthetic */ TopButtonDto[] $values() {
            return new TopButtonDto[]{BACK, CLOSE, NONE};
        }

        static {
            TopButtonDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TopButtonDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TopButtonDto valueOf(String str) {
            return (TopButtonDto) Enum.valueOf(TopButtonDto.class, str);
        }

        public static TopButtonDto[] values() {
            return (TopButtonDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ModalActionDto(String str, TopButtonDto topButtonDto, CardModeDto cardModeDto, ModalTypeDto modalTypeDto, boolean z, ShowPolicyDto showPolicyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? TopButtonDto.NONE : topButtonDto, cardModeDto, modalTypeDto, (i & 16) != 0 ? true : z, showPolicyDto);
    }

    public static /* synthetic */ ModalActionDto copy$default(ModalActionDto modalActionDto, String str, TopButtonDto topButtonDto, CardModeDto cardModeDto, ModalTypeDto modalTypeDto, boolean z, ShowPolicyDto showPolicyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modalActionDto.modalId;
        }
        if ((i & 2) != 0) {
            topButtonDto = modalActionDto.topButton;
        }
        if ((i & 4) != 0) {
            cardModeDto = modalActionDto.cardMode;
        }
        if ((i & 8) != 0) {
            modalTypeDto = modalActionDto.modalType;
        }
        if ((i & 16) != 0) {
            z = modalActionDto.closeByHardwareBack;
        }
        if ((i & 32) != 0) {
            showPolicyDto = modalActionDto.showPolicy;
        }
        boolean z2 = z;
        ShowPolicyDto showPolicyDto2 = showPolicyDto;
        return modalActionDto.copy(str, topButtonDto, cardModeDto, modalTypeDto, z2, showPolicyDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModalId() {
        return this.modalId;
    }

    /* renamed from: component2, reason: from getter */
    public final TopButtonDto getTopButton() {
        return this.topButton;
    }

    /* renamed from: component3, reason: from getter */
    public final CardModeDto getCardMode() {
        return this.cardMode;
    }

    /* renamed from: component4, reason: from getter */
    public final ModalTypeDto getModalType() {
        return this.modalType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCloseByHardwareBack() {
        return this.closeByHardwareBack;
    }

    /* renamed from: component6, reason: from getter */
    public final ShowPolicyDto getShowPolicy() {
        return this.showPolicy;
    }

    public final ModalActionDto copy(@Json(name = "modal_id") String modalId, @Json(name = "top_button") TopButtonDto topButton, @Json(name = "card_mode") CardModeDto cardMode, @Json(name = "modal_type") ModalTypeDto modalType, @Json(name = "close_by_hardware_back") boolean closeByHardwareBack, @Json(name = "show_policy") ShowPolicyDto showPolicy) {
        return new ModalActionDto(modalId, topButton, cardMode, modalType, closeByHardwareBack, showPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalActionDto)) {
            return false;
        }
        ModalActionDto modalActionDto = (ModalActionDto) other;
        return jl40.l(this.modalId, modalActionDto.modalId) && this.topButton == modalActionDto.topButton && jl40.l(this.cardMode, modalActionDto.cardMode) && this.modalType == modalActionDto.modalType && this.closeByHardwareBack == modalActionDto.closeByHardwareBack && jl40.l(this.showPolicy, modalActionDto.showPolicy);
    }

    public final CardModeDto getCardMode() {
        return this.cardMode;
    }

    public final boolean getCloseByHardwareBack() {
        return this.closeByHardwareBack;
    }

    public final String getModalId() {
        return this.modalId;
    }

    public final ModalTypeDto getModalType() {
        return this.modalType;
    }

    public final ShowPolicyDto getShowPolicy() {
        return this.showPolicy;
    }

    public final TopButtonDto getTopButton() {
        return this.topButton;
    }

    public int hashCode() {
        int hashCode = (this.topButton.hashCode() + (this.modalId.hashCode() * 31)) * 31;
        CardModeDto cardModeDto = this.cardMode;
        int hashCode2 = (hashCode + (cardModeDto == null ? 0 : cardModeDto.hashCode())) * 31;
        ModalTypeDto modalTypeDto = this.modalType;
        int e = unr0.e((hashCode2 + (modalTypeDto == null ? 0 : modalTypeDto.hashCode())) * 31, 31, this.closeByHardwareBack);
        ShowPolicyDto showPolicyDto = this.showPolicy;
        return e + (showPolicyDto != null ? showPolicyDto.hashCode() : 0);
    }

    public String toString() {
        return "ModalActionDto(modalId=" + this.modalId + ", topButton=" + this.topButton + ", cardMode=" + this.cardMode + ", modalType=" + this.modalType + ", closeByHardwareBack=" + this.closeByHardwareBack + ", showPolicy=" + this.showPolicy + Extension.C_BRAKE;
    }

    public ModalActionDto(@Json(name = "modal_id") String str, @Json(name = "top_button") TopButtonDto topButtonDto, @Json(name = "card_mode") CardModeDto cardModeDto, @Json(name = "modal_type") ModalTypeDto modalTypeDto, @Json(name = "close_by_hardware_back") boolean z, @Json(name = "show_policy") ShowPolicyDto showPolicyDto) {
        this.modalId = str;
        this.topButton = topButtonDto;
        this.cardMode = cardModeDto;
        this.modalType = modalTypeDto;
        this.closeByHardwareBack = z;
        this.showPolicy = showPolicyDto;
    }
}
