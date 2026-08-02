package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LayoutDistributionPolicyConstValueDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LayoutDistributionPolicyFillDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LayoutDistributionPolicyPercentDto;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;", "", "PickerColumnLayoutPolicy_PercentDto", "PickerColumnLayoutPolicy_ConstDto", "PickerColumnLayoutPolicy_FillDto", "Unknown_PickerColumnLayoutPolicyDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_ConstDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_FillDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_PercentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$Unknown_PickerColumnLayoutPolicyDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PickerColumnLayoutPolicyDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_ConstDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyConstValueDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyConstValueDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyConstValueDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_ConstDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickerColumnLayoutPolicy_ConstDto extends PickerColumnLayoutPolicyDto {
        public final String a;
        public final LayoutDistributionPolicyConstValueDto b;

        public PickerColumnLayoutPolicy_ConstDto(@Json(name = "type") String str, LayoutDistributionPolicyConstValueDto layoutDistributionPolicyConstValueDto) {
            this.a = str;
            this.b = layoutDistributionPolicyConstValueDto;
        }

        public final PickerColumnLayoutPolicy_ConstDto copy(@Json(name = "type") String type, LayoutDistributionPolicyConstValueDto value) {
            return new PickerColumnLayoutPolicy_ConstDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickerColumnLayoutPolicy_ConstDto)) {
                return false;
            }
            PickerColumnLayoutPolicy_ConstDto pickerColumnLayoutPolicy_ConstDto = (PickerColumnLayoutPolicy_ConstDto) obj;
            return this.a.equals(pickerColumnLayoutPolicy_ConstDto.a) && this.b.equals(pickerColumnLayoutPolicy_ConstDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PickerColumnLayoutPolicy_ConstDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_FillDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyFillDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyFillDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyFillDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_FillDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickerColumnLayoutPolicy_FillDto extends PickerColumnLayoutPolicyDto {
        public final String a;
        public final LayoutDistributionPolicyFillDto b;

        public PickerColumnLayoutPolicy_FillDto(@Json(name = "type") String str, LayoutDistributionPolicyFillDto layoutDistributionPolicyFillDto) {
            this.a = str;
            this.b = layoutDistributionPolicyFillDto;
        }

        public final PickerColumnLayoutPolicy_FillDto copy(@Json(name = "type") String type, LayoutDistributionPolicyFillDto value) {
            return new PickerColumnLayoutPolicy_FillDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PickerColumnLayoutPolicy_FillDto) {
                PickerColumnLayoutPolicy_FillDto pickerColumnLayoutPolicy_FillDto = (PickerColumnLayoutPolicy_FillDto) obj;
                return this.a.equals(pickerColumnLayoutPolicy_FillDto.a) && this.b == pickerColumnLayoutPolicy_FillDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PickerColumnLayoutPolicy_FillDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_PercentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyPercentDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyPercentDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyPercentDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$PickerColumnLayoutPolicy_PercentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickerColumnLayoutPolicy_PercentDto extends PickerColumnLayoutPolicyDto {
        public final String a;
        public final LayoutDistributionPolicyPercentDto b;

        public PickerColumnLayoutPolicy_PercentDto(@Json(name = "type") String str, LayoutDistributionPolicyPercentDto layoutDistributionPolicyPercentDto) {
            this.a = str;
            this.b = layoutDistributionPolicyPercentDto;
        }

        public final PickerColumnLayoutPolicy_PercentDto copy(@Json(name = "type") String type, LayoutDistributionPolicyPercentDto value) {
            return new PickerColumnLayoutPolicy_PercentDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickerColumnLayoutPolicy_PercentDto)) {
                return false;
            }
            PickerColumnLayoutPolicy_PercentDto pickerColumnLayoutPolicy_PercentDto = (PickerColumnLayoutPolicy_PercentDto) obj;
            return this.a.equals(pickerColumnLayoutPolicy_PercentDto.a) && this.b.equals(pickerColumnLayoutPolicy_PercentDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PickerColumnLayoutPolicy_PercentDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$Unknown_PickerColumnLayoutPolicyDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerColumnLayoutPolicyDto$Unknown_PickerColumnLayoutPolicyDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_PickerColumnLayoutPolicyDto extends PickerColumnLayoutPolicyDto {
        public final String a;

        public Unknown_PickerColumnLayoutPolicyDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_PickerColumnLayoutPolicyDto copy(@Json(name = "type") String type) {
            return new Unknown_PickerColumnLayoutPolicyDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_PickerColumnLayoutPolicyDto) && jl40.l(this.a, ((Unknown_PickerColumnLayoutPolicyDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_PickerColumnLayoutPolicyDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_PickerColumnLayoutPolicyDto() {
            this(0);
        }

        public /* synthetic */ Unknown_PickerColumnLayoutPolicyDto(int i) {
            this("unknown");
        }
    }
}
