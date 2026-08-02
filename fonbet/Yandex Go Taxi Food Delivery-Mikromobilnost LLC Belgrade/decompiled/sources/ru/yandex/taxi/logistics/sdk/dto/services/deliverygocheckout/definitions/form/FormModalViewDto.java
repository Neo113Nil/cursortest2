package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto;", "", "FormModalView_PopupDto", "FormModalView_OverMapDto", "FormModalView_OverCameraDto", "Unknown_FormModalViewDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_OverCameraDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_OverMapDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_PopupDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$Unknown_FormModalViewDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FormModalViewDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_OverCameraDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewOverCameraDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewOverCameraDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewOverCameraDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_OverCameraDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormModalView_OverCameraDto extends FormModalViewDto {
        public final String a;
        public final ModalViewOverCameraDto b;

        public FormModalView_OverCameraDto(@Json(name = "type") String str, ModalViewOverCameraDto modalViewOverCameraDto) {
            this.a = str;
            this.b = modalViewOverCameraDto;
        }

        public final FormModalView_OverCameraDto copy(@Json(name = "type") String type, ModalViewOverCameraDto value) {
            return new FormModalView_OverCameraDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormModalView_OverCameraDto)) {
                return false;
            }
            FormModalView_OverCameraDto formModalView_OverCameraDto = (FormModalView_OverCameraDto) obj;
            return this.a.equals(formModalView_OverCameraDto.a) && this.b.equals(formModalView_OverCameraDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FormModalView_OverCameraDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_OverMapDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewOverMapDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewOverMapDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewOverMapDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_OverMapDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormModalView_OverMapDto extends FormModalViewDto {
        public final String a;
        public final ModalViewOverMapDto b;

        public FormModalView_OverMapDto(@Json(name = "type") String str, ModalViewOverMapDto modalViewOverMapDto) {
            this.a = str;
            this.b = modalViewOverMapDto;
        }

        public final FormModalView_OverMapDto copy(@Json(name = "type") String type, ModalViewOverMapDto value) {
            return new FormModalView_OverMapDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormModalView_OverMapDto)) {
                return false;
            }
            FormModalView_OverMapDto formModalView_OverMapDto = (FormModalView_OverMapDto) obj;
            return this.a.equals(formModalView_OverMapDto.a) && this.b.equals(formModalView_OverMapDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FormModalView_OverMapDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_PopupDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewPopupDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewPopupDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewPopupDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$FormModalView_PopupDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormModalView_PopupDto extends FormModalViewDto {
        public final String a;
        public final ModalViewPopupDto b;

        public FormModalView_PopupDto(@Json(name = "type") String str, ModalViewPopupDto modalViewPopupDto) {
            this.a = str;
            this.b = modalViewPopupDto;
        }

        public final FormModalView_PopupDto copy(@Json(name = "type") String type, ModalViewPopupDto value) {
            return new FormModalView_PopupDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormModalView_PopupDto)) {
                return false;
            }
            FormModalView_PopupDto formModalView_PopupDto = (FormModalView_PopupDto) obj;
            return this.a.equals(formModalView_PopupDto.a) && this.b.equals(formModalView_PopupDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FormModalView_PopupDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$Unknown_FormModalViewDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormModalViewDto$Unknown_FormModalViewDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_FormModalViewDto extends FormModalViewDto {
        public final String a;

        public Unknown_FormModalViewDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_FormModalViewDto copy(@Json(name = "type") String type) {
            return new Unknown_FormModalViewDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_FormModalViewDto) && jl40.l(this.a, ((Unknown_FormModalViewDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_FormModalViewDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_FormModalViewDto() {
            this(0);
        }

        public /* synthetic */ Unknown_FormModalViewDto(int i) {
            this("unknown");
        }
    }
}
