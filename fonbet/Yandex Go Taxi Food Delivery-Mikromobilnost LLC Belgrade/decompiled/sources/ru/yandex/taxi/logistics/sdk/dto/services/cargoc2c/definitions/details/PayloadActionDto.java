package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionChangeDateTimeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDeeplinkDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDialogDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionEditOrderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenLinkToRouteDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ExtendDeliveryExpirationDateDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "PayloadAction_DialogDto", "PayloadAction_ChangeDateTimeDto", "PayloadAction_DeeplinkDto", "PayloadAction_ShowContentSectionsDto", "PayloadAction_EditOrderDto", "PayloadAction_ExtendDeliveryExpirationDateDto", "PayloadAction_OpenFormDto", "PayloadAction_OpenUniversalLinkDto", "Unknown_PayloadActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ChangeDateTimeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_DeeplinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_DialogDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_EditOrderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ExtendDeliveryExpirationDateDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_OpenFormDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_OpenUniversalLinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ShowContentSectionsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$Unknown_PayloadActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class PayloadActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ChangeDateTimeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionChangeDateTimeDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionChangeDateTimeDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionChangeDateTimeDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ChangeDateTimeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_ChangeDateTimeDto extends PayloadActionDto {
        public final String a;
        public final ActionChangeDateTimeDto b;

        public PayloadAction_ChangeDateTimeDto(@Json(name = "type") String str, ActionChangeDateTimeDto actionChangeDateTimeDto) {
            this.a = str;
            this.b = actionChangeDateTimeDto;
        }

        public final PayloadAction_ChangeDateTimeDto copy(@Json(name = "type") String type, ActionChangeDateTimeDto value) {
            return new PayloadAction_ChangeDateTimeDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_ChangeDateTimeDto)) {
                return false;
            }
            PayloadAction_ChangeDateTimeDto payloadAction_ChangeDateTimeDto = (PayloadAction_ChangeDateTimeDto) obj;
            return this.a.equals(payloadAction_ChangeDateTimeDto.a) && this.b.equals(payloadAction_ChangeDateTimeDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_ChangeDateTimeDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_DeeplinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDeeplinkDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDeeplinkDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDeeplinkDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_DeeplinkDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_DeeplinkDto extends PayloadActionDto {
        public final String a;
        public final ActionDeeplinkDto b;

        public PayloadAction_DeeplinkDto(@Json(name = "type") String str, ActionDeeplinkDto actionDeeplinkDto) {
            this.a = str;
            this.b = actionDeeplinkDto;
        }

        public final PayloadAction_DeeplinkDto copy(@Json(name = "type") String type, ActionDeeplinkDto value) {
            return new PayloadAction_DeeplinkDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_DeeplinkDto)) {
                return false;
            }
            PayloadAction_DeeplinkDto payloadAction_DeeplinkDto = (PayloadAction_DeeplinkDto) obj;
            return this.a.equals(payloadAction_DeeplinkDto.a) && this.b.equals(payloadAction_DeeplinkDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_DeeplinkDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_DialogDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDialogDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDialogDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDialogDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_DialogDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_DialogDto extends PayloadActionDto {
        public final String a;
        public final ActionDialogDto b;

        public PayloadAction_DialogDto(@Json(name = "type") String str, ActionDialogDto actionDialogDto) {
            this.a = str;
            this.b = actionDialogDto;
        }

        public final PayloadAction_DialogDto copy(@Json(name = "type") String type, ActionDialogDto value) {
            return new PayloadAction_DialogDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_DialogDto)) {
                return false;
            }
            PayloadAction_DialogDto payloadAction_DialogDto = (PayloadAction_DialogDto) obj;
            return this.a.equals(payloadAction_DialogDto.a) && this.b.equals(payloadAction_DialogDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_DialogDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_EditOrderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionEditOrderDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionEditOrderDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionEditOrderDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_EditOrderDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_EditOrderDto extends PayloadActionDto {
        public final String a;
        public final ActionEditOrderDto b;

        public PayloadAction_EditOrderDto(@Json(name = "type") String str, ActionEditOrderDto actionEditOrderDto) {
            this.a = str;
            this.b = actionEditOrderDto;
        }

        public final PayloadAction_EditOrderDto copy(@Json(name = "type") String type, ActionEditOrderDto value) {
            return new PayloadAction_EditOrderDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_EditOrderDto)) {
                return false;
            }
            PayloadAction_EditOrderDto payloadAction_EditOrderDto = (PayloadAction_EditOrderDto) obj;
            return this.a.equals(payloadAction_EditOrderDto.a) && this.b.equals(payloadAction_EditOrderDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_EditOrderDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ExtendDeliveryExpirationDateDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ExtendDeliveryExpirationDateDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ExtendDeliveryExpirationDateDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ExtendDeliveryExpirationDateDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ExtendDeliveryExpirationDateDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_ExtendDeliveryExpirationDateDto extends PayloadActionDto {
        public final String a;
        public final ExtendDeliveryExpirationDateDto b;

        public PayloadAction_ExtendDeliveryExpirationDateDto(@Json(name = "type") String str, ExtendDeliveryExpirationDateDto extendDeliveryExpirationDateDto) {
            this.a = str;
            this.b = extendDeliveryExpirationDateDto;
        }

        public final PayloadAction_ExtendDeliveryExpirationDateDto copy(@Json(name = "type") String type, ExtendDeliveryExpirationDateDto value) {
            return new PayloadAction_ExtendDeliveryExpirationDateDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_ExtendDeliveryExpirationDateDto)) {
                return false;
            }
            PayloadAction_ExtendDeliveryExpirationDateDto payloadAction_ExtendDeliveryExpirationDateDto = (PayloadAction_ExtendDeliveryExpirationDateDto) obj;
            return this.a.equals(payloadAction_ExtendDeliveryExpirationDateDto.a) && this.b.equals(payloadAction_ExtendDeliveryExpirationDateDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_ExtendDeliveryExpirationDateDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_OpenFormDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_OpenFormDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_OpenFormDto extends PayloadActionDto {
        public final String a;
        public final ActionOpenFormDto b;

        public PayloadAction_OpenFormDto(@Json(name = "type") String str, ActionOpenFormDto actionOpenFormDto) {
            this.a = str;
            this.b = actionOpenFormDto;
        }

        public final PayloadAction_OpenFormDto copy(@Json(name = "type") String type, ActionOpenFormDto value) {
            return new PayloadAction_OpenFormDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_OpenFormDto)) {
                return false;
            }
            PayloadAction_OpenFormDto payloadAction_OpenFormDto = (PayloadAction_OpenFormDto) obj;
            return this.a.equals(payloadAction_OpenFormDto.a) && this.b.equals(payloadAction_OpenFormDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_OpenFormDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_OpenUniversalLinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenLinkToRouteDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenLinkToRouteDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenLinkToRouteDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_OpenUniversalLinkDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_OpenUniversalLinkDto extends PayloadActionDto {
        public final String a;
        public final ActionOpenLinkToRouteDto b;

        public PayloadAction_OpenUniversalLinkDto(@Json(name = "type") String str, ActionOpenLinkToRouteDto actionOpenLinkToRouteDto) {
            this.a = str;
            this.b = actionOpenLinkToRouteDto;
        }

        public final PayloadAction_OpenUniversalLinkDto copy(@Json(name = "type") String type, ActionOpenLinkToRouteDto value) {
            return new PayloadAction_OpenUniversalLinkDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_OpenUniversalLinkDto)) {
                return false;
            }
            PayloadAction_OpenUniversalLinkDto payloadAction_OpenUniversalLinkDto = (PayloadAction_OpenUniversalLinkDto) obj;
            return this.a.equals(payloadAction_OpenUniversalLinkDto.a) && this.b.equals(payloadAction_OpenUniversalLinkDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_OpenUniversalLinkDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ShowContentSectionsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ActionShowContentSectionsDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ActionShowContentSectionsDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ActionShowContentSectionsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$PayloadAction_ShowContentSectionsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayloadAction_ShowContentSectionsDto extends PayloadActionDto {
        public final String a;
        public final ActionShowContentSectionsDto b;

        public PayloadAction_ShowContentSectionsDto(@Json(name = "type") String str, ActionShowContentSectionsDto actionShowContentSectionsDto) {
            this.a = str;
            this.b = actionShowContentSectionsDto;
        }

        public final PayloadAction_ShowContentSectionsDto copy(@Json(name = "type") String type, ActionShowContentSectionsDto value) {
            return new PayloadAction_ShowContentSectionsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadAction_ShowContentSectionsDto)) {
                return false;
            }
            PayloadAction_ShowContentSectionsDto payloadAction_ShowContentSectionsDto = (PayloadAction_ShowContentSectionsDto) obj;
            return this.a.equals(payloadAction_ShowContentSectionsDto.a) && this.b.equals(payloadAction_ShowContentSectionsDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PayloadAction_ShowContentSectionsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$Unknown_PayloadActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadActionDto$Unknown_PayloadActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_PayloadActionDto extends PayloadActionDto {
        public final String a;

        public Unknown_PayloadActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_PayloadActionDto copy(@Json(name = "type") String type) {
            return new Unknown_PayloadActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_PayloadActionDto) && jl40.l(this.a, ((Unknown_PayloadActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_PayloadActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_PayloadActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_PayloadActionDto(int i) {
            this("unknown");
        }
    }
}
