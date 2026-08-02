package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto;", "", "CommunicationMethod_DirectPhoneCallDto", "CommunicationMethod_VoiceForwardingCallDto", "Unknown_CommunicationMethodDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$CommunicationMethod_DirectPhoneCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$CommunicationMethod_VoiceForwardingCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$Unknown_CommunicationMethodDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CommunicationMethodDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$CommunicationMethod_DirectPhoneCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DirectPhoneCallDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DirectPhoneCallDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DirectPhoneCallDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$CommunicationMethod_DirectPhoneCallDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommunicationMethod_DirectPhoneCallDto extends CommunicationMethodDto {
        public final String a;
        public final DirectPhoneCallDto b;

        public CommunicationMethod_DirectPhoneCallDto(@Json(name = "type") String str, DirectPhoneCallDto directPhoneCallDto) {
            this.a = str;
            this.b = directPhoneCallDto;
        }

        public final CommunicationMethod_DirectPhoneCallDto copy(@Json(name = "type") String type, DirectPhoneCallDto value) {
            return new CommunicationMethod_DirectPhoneCallDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommunicationMethod_DirectPhoneCallDto)) {
                return false;
            }
            CommunicationMethod_DirectPhoneCallDto communicationMethod_DirectPhoneCallDto = (CommunicationMethod_DirectPhoneCallDto) obj;
            return this.a.equals(communicationMethod_DirectPhoneCallDto.a) && this.b.equals(communicationMethod_DirectPhoneCallDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CommunicationMethod_DirectPhoneCallDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$CommunicationMethod_VoiceForwardingCallDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/VoiceForwardingCallDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/VoiceForwardingCallDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/VoiceForwardingCallDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$CommunicationMethod_VoiceForwardingCallDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommunicationMethod_VoiceForwardingCallDto extends CommunicationMethodDto {
        public final String a;
        public final VoiceForwardingCallDto b;

        public CommunicationMethod_VoiceForwardingCallDto(@Json(name = "type") String str, VoiceForwardingCallDto voiceForwardingCallDto) {
            this.a = str;
            this.b = voiceForwardingCallDto;
        }

        public final CommunicationMethod_VoiceForwardingCallDto copy(@Json(name = "type") String type, VoiceForwardingCallDto value) {
            return new CommunicationMethod_VoiceForwardingCallDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommunicationMethod_VoiceForwardingCallDto)) {
                return false;
            }
            CommunicationMethod_VoiceForwardingCallDto communicationMethod_VoiceForwardingCallDto = (CommunicationMethod_VoiceForwardingCallDto) obj;
            return this.a.equals(communicationMethod_VoiceForwardingCallDto.a) && this.b.equals(communicationMethod_VoiceForwardingCallDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CommunicationMethod_VoiceForwardingCallDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$Unknown_CommunicationMethodDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto$Unknown_CommunicationMethodDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_CommunicationMethodDto extends CommunicationMethodDto {
        public final String a;

        public Unknown_CommunicationMethodDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_CommunicationMethodDto copy(@Json(name = "type") String type) {
            return new Unknown_CommunicationMethodDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_CommunicationMethodDto) && jl40.l(this.a, ((Unknown_CommunicationMethodDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_CommunicationMethodDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_CommunicationMethodDto() {
            this(0);
        }

        public /* synthetic */ Unknown_CommunicationMethodDto(int i) {
            this("unknown");
        }
    }
}
