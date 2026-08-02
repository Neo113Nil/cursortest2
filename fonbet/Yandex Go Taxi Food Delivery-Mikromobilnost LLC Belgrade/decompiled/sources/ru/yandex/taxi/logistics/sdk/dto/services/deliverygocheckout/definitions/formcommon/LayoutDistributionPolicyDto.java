package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;", "", "LayoutDistributionPolicy_PercentDto", "LayoutDistributionPolicy_ConstDto", "LayoutDistributionPolicy_FillDto", "Unknown_LayoutDistributionPolicyDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_ConstDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_FillDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_PercentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$Unknown_LayoutDistributionPolicyDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LayoutDistributionPolicyDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_ConstDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyConstValueDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyConstValueDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyConstValueDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_ConstDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutDistributionPolicy_ConstDto extends LayoutDistributionPolicyDto {
        public final String a;
        public final LayoutDistributionPolicyConstValueDto b;

        public LayoutDistributionPolicy_ConstDto(@Json(name = "type") String str, LayoutDistributionPolicyConstValueDto layoutDistributionPolicyConstValueDto) {
            this.a = str;
            this.b = layoutDistributionPolicyConstValueDto;
        }

        public final LayoutDistributionPolicy_ConstDto copy(@Json(name = "type") String type, LayoutDistributionPolicyConstValueDto value) {
            return new LayoutDistributionPolicy_ConstDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutDistributionPolicy_ConstDto)) {
                return false;
            }
            LayoutDistributionPolicy_ConstDto layoutDistributionPolicy_ConstDto = (LayoutDistributionPolicy_ConstDto) obj;
            return this.a.equals(layoutDistributionPolicy_ConstDto.a) && this.b.equals(layoutDistributionPolicy_ConstDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LayoutDistributionPolicy_ConstDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_FillDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyFillDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyFillDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyFillDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_FillDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutDistributionPolicy_FillDto extends LayoutDistributionPolicyDto {
        public final String a;
        public final LayoutDistributionPolicyFillDto b;

        public LayoutDistributionPolicy_FillDto(@Json(name = "type") String str, LayoutDistributionPolicyFillDto layoutDistributionPolicyFillDto) {
            this.a = str;
            this.b = layoutDistributionPolicyFillDto;
        }

        public final LayoutDistributionPolicy_FillDto copy(@Json(name = "type") String type, LayoutDistributionPolicyFillDto value) {
            return new LayoutDistributionPolicy_FillDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LayoutDistributionPolicy_FillDto) {
                LayoutDistributionPolicy_FillDto layoutDistributionPolicy_FillDto = (LayoutDistributionPolicy_FillDto) obj;
                return this.a.equals(layoutDistributionPolicy_FillDto.a) && this.b == layoutDistributionPolicy_FillDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LayoutDistributionPolicy_FillDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_PercentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyPercentDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyPercentDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyPercentDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$LayoutDistributionPolicy_PercentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LayoutDistributionPolicy_PercentDto extends LayoutDistributionPolicyDto {
        public final String a;
        public final LayoutDistributionPolicyPercentDto b;

        public LayoutDistributionPolicy_PercentDto(@Json(name = "type") String str, LayoutDistributionPolicyPercentDto layoutDistributionPolicyPercentDto) {
            this.a = str;
            this.b = layoutDistributionPolicyPercentDto;
        }

        public final LayoutDistributionPolicy_PercentDto copy(@Json(name = "type") String type, LayoutDistributionPolicyPercentDto value) {
            return new LayoutDistributionPolicy_PercentDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutDistributionPolicy_PercentDto)) {
                return false;
            }
            LayoutDistributionPolicy_PercentDto layoutDistributionPolicy_PercentDto = (LayoutDistributionPolicy_PercentDto) obj;
            return this.a.equals(layoutDistributionPolicy_PercentDto.a) && this.b.equals(layoutDistributionPolicy_PercentDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LayoutDistributionPolicy_PercentDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$Unknown_LayoutDistributionPolicyDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto$Unknown_LayoutDistributionPolicyDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_LayoutDistributionPolicyDto extends LayoutDistributionPolicyDto {
        public final String a;

        public Unknown_LayoutDistributionPolicyDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_LayoutDistributionPolicyDto copy(@Json(name = "type") String type) {
            return new Unknown_LayoutDistributionPolicyDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_LayoutDistributionPolicyDto) && jl40.l(this.a, ((Unknown_LayoutDistributionPolicyDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_LayoutDistributionPolicyDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_LayoutDistributionPolicyDto() {
            this(0);
        }

        public /* synthetic */ Unknown_LayoutDistributionPolicyDto(int i) {
            this("unknown");
        }
    }
}
