package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto;", "", "SmartCameraType_ArBoxesSmartCameraDto", "SmartCameraType_AiSmartCameraDto", "Unknown_SmartCameraTypeDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$SmartCameraType_AiSmartCameraDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$SmartCameraType_ArBoxesSmartCameraDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$Unknown_SmartCameraTypeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SmartCameraTypeDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$SmartCameraType_AiSmartCameraDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/AiSmartCameraDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/AiSmartCameraDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/AiSmartCameraDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$SmartCameraType_AiSmartCameraDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SmartCameraType_AiSmartCameraDto extends SmartCameraTypeDto {
        public final String a;
        public final AiSmartCameraDto b;

        public SmartCameraType_AiSmartCameraDto(@Json(name = "type") String str, AiSmartCameraDto aiSmartCameraDto) {
            this.a = str;
            this.b = aiSmartCameraDto;
        }

        public final SmartCameraType_AiSmartCameraDto copy(@Json(name = "type") String type, AiSmartCameraDto value) {
            return new SmartCameraType_AiSmartCameraDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SmartCameraType_AiSmartCameraDto)) {
                return false;
            }
            SmartCameraType_AiSmartCameraDto smartCameraType_AiSmartCameraDto = (SmartCameraType_AiSmartCameraDto) obj;
            return this.a.equals(smartCameraType_AiSmartCameraDto.a) && this.b.equals(smartCameraType_AiSmartCameraDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SmartCameraType_AiSmartCameraDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$SmartCameraType_ArBoxesSmartCameraDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArBoxesSmartCameraDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArBoxesSmartCameraDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArBoxesSmartCameraDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$SmartCameraType_ArBoxesSmartCameraDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SmartCameraType_ArBoxesSmartCameraDto extends SmartCameraTypeDto {
        public final String a;
        public final ArBoxesSmartCameraDto b;

        public SmartCameraType_ArBoxesSmartCameraDto(@Json(name = "type") String str, ArBoxesSmartCameraDto arBoxesSmartCameraDto) {
            this.a = str;
            this.b = arBoxesSmartCameraDto;
        }

        public final SmartCameraType_ArBoxesSmartCameraDto copy(@Json(name = "type") String type, ArBoxesSmartCameraDto value) {
            return new SmartCameraType_ArBoxesSmartCameraDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SmartCameraType_ArBoxesSmartCameraDto)) {
                return false;
            }
            SmartCameraType_ArBoxesSmartCameraDto smartCameraType_ArBoxesSmartCameraDto = (SmartCameraType_ArBoxesSmartCameraDto) obj;
            return this.a.equals(smartCameraType_ArBoxesSmartCameraDto.a) && this.b.equals(smartCameraType_ArBoxesSmartCameraDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SmartCameraType_ArBoxesSmartCameraDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$Unknown_SmartCameraTypeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto$Unknown_SmartCameraTypeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_SmartCameraTypeDto extends SmartCameraTypeDto {
        public final String a;

        public Unknown_SmartCameraTypeDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_SmartCameraTypeDto copy(@Json(name = "type") String type) {
            return new Unknown_SmartCameraTypeDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_SmartCameraTypeDto) && jl40.l(this.a, ((Unknown_SmartCameraTypeDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_SmartCameraTypeDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_SmartCameraTypeDto() {
            this(0);
        }

        public /* synthetic */ Unknown_SmartCameraTypeDto(int i) {
            this("unknown");
        }
    }
}
