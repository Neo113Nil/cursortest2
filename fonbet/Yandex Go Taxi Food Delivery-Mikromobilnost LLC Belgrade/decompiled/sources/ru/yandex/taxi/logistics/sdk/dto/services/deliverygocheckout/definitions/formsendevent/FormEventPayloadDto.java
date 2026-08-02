package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formsendevent;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;", "", "FormEventPayload_ClosedDto", "FormEventPayload_AppEnteredBackgroundDto", "Unknown_FormEventPayloadDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$FormEventPayload_AppEnteredBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$FormEventPayload_ClosedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$Unknown_FormEventPayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FormEventPayloadDto {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$Unknown_FormEventPayloadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$Unknown_FormEventPayloadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_FormEventPayloadDto extends FormEventPayloadDto {
        public final String a;

        public Unknown_FormEventPayloadDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_FormEventPayloadDto copy(@Json(name = "type") String type) {
            return new Unknown_FormEventPayloadDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_FormEventPayloadDto) && jl40.l(this.a, ((Unknown_FormEventPayloadDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_FormEventPayloadDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_FormEventPayloadDto() {
            this(0);
        }

        public /* synthetic */ Unknown_FormEventPayloadDto(int i) {
            this("unknown");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$FormEventPayload_AppEnteredBackgroundDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormAppEnteredBackgroundPayloadDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormAppEnteredBackgroundPayloadDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormAppEnteredBackgroundPayloadDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$FormEventPayload_AppEnteredBackgroundDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormEventPayload_AppEnteredBackgroundDto extends FormEventPayloadDto {
        public final String a;
        public final FormAppEnteredBackgroundPayloadDto b;

        public FormEventPayload_AppEnteredBackgroundDto(@Json(name = "type") String str, FormAppEnteredBackgroundPayloadDto formAppEnteredBackgroundPayloadDto) {
            this.a = str;
            this.b = formAppEnteredBackgroundPayloadDto;
        }

        public final FormEventPayload_AppEnteredBackgroundDto copy(@Json(name = "type") String type, FormAppEnteredBackgroundPayloadDto value) {
            return new FormEventPayload_AppEnteredBackgroundDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormEventPayload_AppEnteredBackgroundDto)) {
                return false;
            }
            FormEventPayload_AppEnteredBackgroundDto formEventPayload_AppEnteredBackgroundDto = (FormEventPayload_AppEnteredBackgroundDto) obj;
            return jl40.l(this.a, formEventPayload_AppEnteredBackgroundDto.a) && jl40.l(this.b, formEventPayload_AppEnteredBackgroundDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FormEventPayload_AppEnteredBackgroundDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ FormEventPayload_AppEnteredBackgroundDto(FormAppEnteredBackgroundPayloadDto formAppEnteredBackgroundPayloadDto) {
            this("app-entered-background", formAppEnteredBackgroundPayloadDto);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$FormEventPayload_ClosedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormClosedPayloadDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormClosedPayloadDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormClosedPayloadDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto$FormEventPayload_ClosedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormEventPayload_ClosedDto extends FormEventPayloadDto {
        public final String a;
        public final FormClosedPayloadDto b;

        public FormEventPayload_ClosedDto(@Json(name = "type") String str, FormClosedPayloadDto formClosedPayloadDto) {
            this.a = str;
            this.b = formClosedPayloadDto;
        }

        public final FormEventPayload_ClosedDto copy(@Json(name = "type") String type, FormClosedPayloadDto value) {
            return new FormEventPayload_ClosedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormEventPayload_ClosedDto)) {
                return false;
            }
            FormEventPayload_ClosedDto formEventPayload_ClosedDto = (FormEventPayload_ClosedDto) obj;
            return jl40.l(this.a, formEventPayload_ClosedDto.a) && jl40.l(this.b, formEventPayload_ClosedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FormEventPayload_ClosedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ FormEventPayload_ClosedDto(FormClosedPayloadDto formClosedPayloadDto) {
            this("closed", formClosedPayloadDto);
        }
    }
}
