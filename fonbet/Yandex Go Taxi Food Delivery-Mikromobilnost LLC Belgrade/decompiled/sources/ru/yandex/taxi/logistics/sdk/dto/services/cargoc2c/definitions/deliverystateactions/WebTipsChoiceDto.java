package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto;", "", "WebTipsChoice_PredefinedDto", "Unknown_WebTipsChoiceDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto$Unknown_WebTipsChoiceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto$WebTipsChoice_PredefinedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class WebTipsChoiceDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto$WebTipsChoice_PredefinedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PredefinedWebTipsChoiceDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PredefinedWebTipsChoiceDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PredefinedWebTipsChoiceDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto$WebTipsChoice_PredefinedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WebTipsChoice_PredefinedDto extends WebTipsChoiceDto {
        public final String a;
        public final PredefinedWebTipsChoiceDto b;

        public WebTipsChoice_PredefinedDto(@Json(name = "type") String str, PredefinedWebTipsChoiceDto predefinedWebTipsChoiceDto) {
            this.a = str;
            this.b = predefinedWebTipsChoiceDto;
        }

        public final WebTipsChoice_PredefinedDto copy(@Json(name = "type") String type, PredefinedWebTipsChoiceDto value) {
            return new WebTipsChoice_PredefinedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebTipsChoice_PredefinedDto)) {
                return false;
            }
            WebTipsChoice_PredefinedDto webTipsChoice_PredefinedDto = (WebTipsChoice_PredefinedDto) obj;
            return this.a.equals(webTipsChoice_PredefinedDto.a) && this.b.equals(webTipsChoice_PredefinedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "WebTipsChoice_PredefinedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto$Unknown_WebTipsChoiceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto$Unknown_WebTipsChoiceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_WebTipsChoiceDto extends WebTipsChoiceDto {
        public final String a;

        public Unknown_WebTipsChoiceDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_WebTipsChoiceDto copy(@Json(name = "type") String type) {
            return new Unknown_WebTipsChoiceDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_WebTipsChoiceDto) && jl40.l(this.a, ((Unknown_WebTipsChoiceDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_WebTipsChoiceDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_WebTipsChoiceDto() {
            this(0);
        }

        public /* synthetic */ Unknown_WebTipsChoiceDto(int i) {
            this("unknown");
        }
    }
}
