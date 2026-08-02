package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "", "CancelMessageButtonAction_DismissCancelMessageDto", "CancelMessageButtonAction_ContinueOrderCancellationDto", "CancelMessageButtonAction_PerformerCallDto", "CancelMessageButtonAction_OpenChatDto", "Unknown_CancelMessageButtonActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_ContinueOrderCancellationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_DismissCancelMessageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_OpenChatDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_PerformerCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$Unknown_CancelMessageButtonActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CancelMessageButtonActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_ContinueOrderCancellationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageActionContinueOrderCancellationDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageActionContinueOrderCancellationDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageActionContinueOrderCancellationDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_ContinueOrderCancellationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelMessageButtonAction_ContinueOrderCancellationDto extends CancelMessageButtonActionDto {
        public final String a;
        public final CancelMessageActionContinueOrderCancellationDto b;

        public CancelMessageButtonAction_ContinueOrderCancellationDto(@Json(name = "type") String str, CancelMessageActionContinueOrderCancellationDto cancelMessageActionContinueOrderCancellationDto) {
            this.a = str;
            this.b = cancelMessageActionContinueOrderCancellationDto;
        }

        public final CancelMessageButtonAction_ContinueOrderCancellationDto copy(@Json(name = "type") String type, CancelMessageActionContinueOrderCancellationDto value) {
            return new CancelMessageButtonAction_ContinueOrderCancellationDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CancelMessageButtonAction_ContinueOrderCancellationDto) {
                CancelMessageButtonAction_ContinueOrderCancellationDto cancelMessageButtonAction_ContinueOrderCancellationDto = (CancelMessageButtonAction_ContinueOrderCancellationDto) obj;
                return this.a.equals(cancelMessageButtonAction_ContinueOrderCancellationDto.a) && this.b == cancelMessageButtonAction_ContinueOrderCancellationDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelMessageButtonAction_ContinueOrderCancellationDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_DismissCancelMessageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageActionDismissDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageActionDismissDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageActionDismissDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_DismissCancelMessageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelMessageButtonAction_DismissCancelMessageDto extends CancelMessageButtonActionDto {
        public final String a;
        public final CancelMessageActionDismissDto b;

        public CancelMessageButtonAction_DismissCancelMessageDto(@Json(name = "type") String str, CancelMessageActionDismissDto cancelMessageActionDismissDto) {
            this.a = str;
            this.b = cancelMessageActionDismissDto;
        }

        public final CancelMessageButtonAction_DismissCancelMessageDto copy(@Json(name = "type") String type, CancelMessageActionDismissDto value) {
            return new CancelMessageButtonAction_DismissCancelMessageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CancelMessageButtonAction_DismissCancelMessageDto) {
                CancelMessageButtonAction_DismissCancelMessageDto cancelMessageButtonAction_DismissCancelMessageDto = (CancelMessageButtonAction_DismissCancelMessageDto) obj;
                return this.a.equals(cancelMessageButtonAction_DismissCancelMessageDto.a) && this.b == cancelMessageButtonAction_DismissCancelMessageDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelMessageButtonAction_DismissCancelMessageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_OpenChatDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenChatDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenChatDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenChatDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_OpenChatDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelMessageButtonAction_OpenChatDto extends CancelMessageButtonActionDto {
        public final String a;
        public final ActionOpenChatDto b;

        public CancelMessageButtonAction_OpenChatDto(@Json(name = "type") String str, ActionOpenChatDto actionOpenChatDto) {
            this.a = str;
            this.b = actionOpenChatDto;
        }

        public final CancelMessageButtonAction_OpenChatDto copy(@Json(name = "type") String type, ActionOpenChatDto value) {
            return new CancelMessageButtonAction_OpenChatDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelMessageButtonAction_OpenChatDto)) {
                return false;
            }
            CancelMessageButtonAction_OpenChatDto cancelMessageButtonAction_OpenChatDto = (CancelMessageButtonAction_OpenChatDto) obj;
            return this.a.equals(cancelMessageButtonAction_OpenChatDto.a) && this.b.equals(cancelMessageButtonAction_OpenChatDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelMessageButtonAction_OpenChatDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_PerformerCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionPerformerCallDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionPerformerCallDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionPerformerCallDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$CancelMessageButtonAction_PerformerCallDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelMessageButtonAction_PerformerCallDto extends CancelMessageButtonActionDto {
        public final String a;
        public final ActionPerformerCallDto b;

        public CancelMessageButtonAction_PerformerCallDto(@Json(name = "type") String str, ActionPerformerCallDto actionPerformerCallDto) {
            this.a = str;
            this.b = actionPerformerCallDto;
        }

        public final CancelMessageButtonAction_PerformerCallDto copy(@Json(name = "type") String type, ActionPerformerCallDto value) {
            return new CancelMessageButtonAction_PerformerCallDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelMessageButtonAction_PerformerCallDto)) {
                return false;
            }
            CancelMessageButtonAction_PerformerCallDto cancelMessageButtonAction_PerformerCallDto = (CancelMessageButtonAction_PerformerCallDto) obj;
            return this.a.equals(cancelMessageButtonAction_PerformerCallDto.a) && this.b.equals(cancelMessageButtonAction_PerformerCallDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CancelMessageButtonAction_PerformerCallDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$Unknown_CancelMessageButtonActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto$Unknown_CancelMessageButtonActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_CancelMessageButtonActionDto extends CancelMessageButtonActionDto {
        public final String a;

        public Unknown_CancelMessageButtonActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_CancelMessageButtonActionDto copy(@Json(name = "type") String type) {
            return new Unknown_CancelMessageButtonActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_CancelMessageButtonActionDto) && jl40.l(this.a, ((Unknown_CancelMessageButtonActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_CancelMessageButtonActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_CancelMessageButtonActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_CancelMessageButtonActionDto(int i) {
            this("unknown");
        }
    }
}
