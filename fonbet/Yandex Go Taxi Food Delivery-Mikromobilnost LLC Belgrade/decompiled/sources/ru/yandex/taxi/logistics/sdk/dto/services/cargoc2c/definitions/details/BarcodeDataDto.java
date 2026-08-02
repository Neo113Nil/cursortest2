package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto;", "", "BarcodeData_BarcodeStringDto", "Unknown_BarcodeDataDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto$BarcodeData_BarcodeStringDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto$Unknown_BarcodeDataDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BarcodeDataDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto$BarcodeData_BarcodeStringDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/StringBarcodeDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/StringBarcodeDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/StringBarcodeDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto$BarcodeData_BarcodeStringDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BarcodeData_BarcodeStringDto extends BarcodeDataDto {
        public final String a;
        public final StringBarcodeDto b;

        public BarcodeData_BarcodeStringDto(@Json(name = "type") String str, StringBarcodeDto stringBarcodeDto) {
            this.a = str;
            this.b = stringBarcodeDto;
        }

        public final BarcodeData_BarcodeStringDto copy(@Json(name = "type") String type, StringBarcodeDto value) {
            return new BarcodeData_BarcodeStringDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarcodeData_BarcodeStringDto)) {
                return false;
            }
            BarcodeData_BarcodeStringDto barcodeData_BarcodeStringDto = (BarcodeData_BarcodeStringDto) obj;
            return this.a.equals(barcodeData_BarcodeStringDto.a) && this.b.equals(barcodeData_BarcodeStringDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BarcodeData_BarcodeStringDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto$Unknown_BarcodeDataDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeDataDto$Unknown_BarcodeDataDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_BarcodeDataDto extends BarcodeDataDto {
        public final String a;

        public Unknown_BarcodeDataDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_BarcodeDataDto copy(@Json(name = "type") String type) {
            return new Unknown_BarcodeDataDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_BarcodeDataDto) && jl40.l(this.a, ((Unknown_BarcodeDataDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_BarcodeDataDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_BarcodeDataDto() {
            this(0);
        }

        public /* synthetic */ Unknown_BarcodeDataDto(int i) {
            this("unknown");
        }
    }
}
