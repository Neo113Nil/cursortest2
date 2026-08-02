package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDto;", "", "insurancePurchaseFlow", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDto$InsurancePurchaseFlowDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDto$InsurancePurchaseFlowDto;)V", "getInsurancePurchaseFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDto$InsurancePurchaseFlowDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InsurancePurchaseFlowDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InsuranceInfoDto {
    private final InsurancePurchaseFlowDto insurancePurchaseFlow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/InsuranceInfoDto$InsurancePurchaseFlowDto;", "", "<init>", "(Ljava/lang/String;I)V", "EXPRESS", "CARGO", "NDD", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InsurancePurchaseFlowDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InsurancePurchaseFlowDto[] $VALUES;

        @Json(name = "express")
        public static final InsurancePurchaseFlowDto EXPRESS = new InsurancePurchaseFlowDto("EXPRESS", 0);

        @Json(name = "cargo")
        public static final InsurancePurchaseFlowDto CARGO = new InsurancePurchaseFlowDto("CARGO", 1);

        @Json(name = "ndd")
        public static final InsurancePurchaseFlowDto NDD = new InsurancePurchaseFlowDto("NDD", 2);

        private static final /* synthetic */ InsurancePurchaseFlowDto[] $values() {
            return new InsurancePurchaseFlowDto[]{EXPRESS, CARGO, NDD};
        }

        static {
            InsurancePurchaseFlowDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private InsurancePurchaseFlowDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static InsurancePurchaseFlowDto valueOf(String str) {
            return (InsurancePurchaseFlowDto) Enum.valueOf(InsurancePurchaseFlowDto.class, str);
        }

        public static InsurancePurchaseFlowDto[] values() {
            return (InsurancePurchaseFlowDto[]) $VALUES.clone();
        }
    }

    public InsuranceInfoDto(@Json(name = "insurance_purchase_flow") InsurancePurchaseFlowDto insurancePurchaseFlowDto) {
        this.insurancePurchaseFlow = insurancePurchaseFlowDto;
    }

    public static /* synthetic */ InsuranceInfoDto copy$default(InsuranceInfoDto insuranceInfoDto, InsurancePurchaseFlowDto insurancePurchaseFlowDto, int i, Object obj) {
        if ((i & 1) != 0) {
            insurancePurchaseFlowDto = insuranceInfoDto.insurancePurchaseFlow;
        }
        return insuranceInfoDto.copy(insurancePurchaseFlowDto);
    }

    /* renamed from: component1, reason: from getter */
    public final InsurancePurchaseFlowDto getInsurancePurchaseFlow() {
        return this.insurancePurchaseFlow;
    }

    public final InsuranceInfoDto copy(@Json(name = "insurance_purchase_flow") InsurancePurchaseFlowDto insurancePurchaseFlow) {
        return new InsuranceInfoDto(insurancePurchaseFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InsuranceInfoDto) && this.insurancePurchaseFlow == ((InsuranceInfoDto) other).insurancePurchaseFlow;
    }

    public final InsurancePurchaseFlowDto getInsurancePurchaseFlow() {
        return this.insurancePurchaseFlow;
    }

    public int hashCode() {
        return this.insurancePurchaseFlow.hashCode();
    }

    public String toString() {
        return "InsuranceInfoDto(insurancePurchaseFlow=" + this.insurancePurchaseFlow + Extension.C_BRAKE;
    }
}
