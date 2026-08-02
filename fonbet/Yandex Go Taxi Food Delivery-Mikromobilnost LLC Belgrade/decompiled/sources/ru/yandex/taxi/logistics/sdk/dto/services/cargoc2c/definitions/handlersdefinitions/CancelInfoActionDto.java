package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionEditOrderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenChatDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionPerformerCallDto;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "", "CancelInfoAction_EditOrderDto", "CancelInfoAction_PerformerCallDto", "CancelInfoAction_OpenChatDto", "CancelInfoAction_OpenFormDto", "Unknown_CancelInfoActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_EditOrderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_OpenChatDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_OpenFormDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_PerformerCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$Unknown_CancelInfoActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CancelInfoActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_EditOrderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionEditOrderDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionEditOrderDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionEditOrderDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_EditOrderDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelInfoAction_EditOrderDto extends CancelInfoActionDto {
        public final String a;
        public final ActionEditOrderDto b;

        public CancelInfoAction_EditOrderDto(@Json(name = "type") String str, ActionEditOrderDto actionEditOrderDto) {
            this.a = str;
            this.b = actionEditOrderDto;
        }

        public final CancelInfoAction_EditOrderDto copy(@Json(name = "type") String type, ActionEditOrderDto value) {
            return new CancelInfoAction_EditOrderDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelInfoAction_EditOrderDto)) {
                return false;
            }
            CancelInfoAction_EditOrderDto cancelInfoAction_EditOrderDto = (CancelInfoAction_EditOrderDto) obj;
            return this.a.equals(cancelInfoAction_EditOrderDto.a) && this.b.equals(cancelInfoAction_EditOrderDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelInfoAction_EditOrderDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_OpenChatDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenChatDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenChatDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenChatDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_OpenChatDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelInfoAction_OpenChatDto extends CancelInfoActionDto {
        public final String a;
        public final ActionOpenChatDto b;

        public CancelInfoAction_OpenChatDto(@Json(name = "type") String str, ActionOpenChatDto actionOpenChatDto) {
            this.a = str;
            this.b = actionOpenChatDto;
        }

        public final CancelInfoAction_OpenChatDto copy(@Json(name = "type") String type, ActionOpenChatDto value) {
            return new CancelInfoAction_OpenChatDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelInfoAction_OpenChatDto)) {
                return false;
            }
            CancelInfoAction_OpenChatDto cancelInfoAction_OpenChatDto = (CancelInfoAction_OpenChatDto) obj;
            return this.a.equals(cancelInfoAction_OpenChatDto.a) && this.b.equals(cancelInfoAction_OpenChatDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelInfoAction_OpenChatDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_OpenFormDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_OpenFormDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelInfoAction_OpenFormDto extends CancelInfoActionDto {
        public final String a;
        public final ActionOpenFormDto b;

        public CancelInfoAction_OpenFormDto(@Json(name = "type") String str, ActionOpenFormDto actionOpenFormDto) {
            this.a = str;
            this.b = actionOpenFormDto;
        }

        public final CancelInfoAction_OpenFormDto copy(@Json(name = "type") String type, ActionOpenFormDto value) {
            return new CancelInfoAction_OpenFormDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelInfoAction_OpenFormDto)) {
                return false;
            }
            CancelInfoAction_OpenFormDto cancelInfoAction_OpenFormDto = (CancelInfoAction_OpenFormDto) obj;
            return this.a.equals(cancelInfoAction_OpenFormDto.a) && this.b.equals(cancelInfoAction_OpenFormDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelInfoAction_OpenFormDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_PerformerCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionPerformerCallDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionPerformerCallDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionPerformerCallDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_PerformerCallDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelInfoAction_PerformerCallDto extends CancelInfoActionDto {
        public final String a;
        public final ActionPerformerCallDto b;

        public CancelInfoAction_PerformerCallDto(@Json(name = "type") String str, ActionPerformerCallDto actionPerformerCallDto) {
            this.a = str;
            this.b = actionPerformerCallDto;
        }

        public final CancelInfoAction_PerformerCallDto copy(@Json(name = "type") String type, ActionPerformerCallDto value) {
            return new CancelInfoAction_PerformerCallDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelInfoAction_PerformerCallDto)) {
                return false;
            }
            CancelInfoAction_PerformerCallDto cancelInfoAction_PerformerCallDto = (CancelInfoAction_PerformerCallDto) obj;
            return this.a.equals(cancelInfoAction_PerformerCallDto.a) && this.b.equals(cancelInfoAction_PerformerCallDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelInfoAction_PerformerCallDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$Unknown_CancelInfoActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$Unknown_CancelInfoActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_CancelInfoActionDto extends CancelInfoActionDto {
        public final String a;

        public Unknown_CancelInfoActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_CancelInfoActionDto copy(@Json(name = "type") String type) {
            return new Unknown_CancelInfoActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_CancelInfoActionDto) && jl40.l(this.a, ((Unknown_CancelInfoActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_CancelInfoActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_CancelInfoActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_CancelInfoActionDto(int i) {
            this("unknown");
        }
    }
}
