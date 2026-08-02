package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto;", "", "DigitsInputType_CostDto", "Unknown_DigitsInputTypeDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto$DigitsInputType_CostDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto$Unknown_DigitsInputTypeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DigitsInputTypeDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto$DigitsInputType_CostDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto$DigitsInputType_CostDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DigitsInputType_CostDto extends DigitsInputTypeDto {
        public final String a;
        public final CostDigitsInputTypeDto b;

        public DigitsInputType_CostDto(@Json(name = "type") String str, CostDigitsInputTypeDto costDigitsInputTypeDto) {
            this.a = str;
            this.b = costDigitsInputTypeDto;
        }

        public final DigitsInputType_CostDto copy(@Json(name = "type") String type, CostDigitsInputTypeDto value) {
            return new DigitsInputType_CostDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DigitsInputType_CostDto)) {
                return false;
            }
            DigitsInputType_CostDto digitsInputType_CostDto = (DigitsInputType_CostDto) obj;
            return this.a.equals(digitsInputType_CostDto.a) && this.b.equals(digitsInputType_CostDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DigitsInputType_CostDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto$Unknown_DigitsInputTypeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto$Unknown_DigitsInputTypeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_DigitsInputTypeDto extends DigitsInputTypeDto {
        public final String a;

        public Unknown_DigitsInputTypeDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_DigitsInputTypeDto copy(@Json(name = "type") String type) {
            return new Unknown_DigitsInputTypeDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_DigitsInputTypeDto) && jl40.l(this.a, ((Unknown_DigitsInputTypeDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_DigitsInputTypeDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_DigitsInputTypeDto() {
            this(0);
        }

        public /* synthetic */ Unknown_DigitsInputTypeDto(int i) {
            this("unknown");
        }
    }
}
