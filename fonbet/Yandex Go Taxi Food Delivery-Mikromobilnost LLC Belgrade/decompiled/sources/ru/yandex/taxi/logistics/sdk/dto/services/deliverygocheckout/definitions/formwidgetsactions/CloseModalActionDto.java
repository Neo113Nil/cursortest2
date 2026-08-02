package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CloseModalActionDto;", "", "closePolicy", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ClosePolicyDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ClosePolicyDto;)V", "getClosePolicy", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ClosePolicyDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CloseModalActionDto {
    private final ClosePolicyDto closePolicy;

    public CloseModalActionDto(@Json(name = "close_policy") ClosePolicyDto closePolicyDto) {
        this.closePolicy = closePolicyDto;
    }

    public static /* synthetic */ CloseModalActionDto copy$default(CloseModalActionDto closeModalActionDto, ClosePolicyDto closePolicyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            closePolicyDto = closeModalActionDto.closePolicy;
        }
        return closeModalActionDto.copy(closePolicyDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ClosePolicyDto getClosePolicy() {
        return this.closePolicy;
    }

    public final CloseModalActionDto copy(@Json(name = "close_policy") ClosePolicyDto closePolicy) {
        return new CloseModalActionDto(closePolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloseModalActionDto) && jl40.l(this.closePolicy, ((CloseModalActionDto) other).closePolicy);
    }

    public final ClosePolicyDto getClosePolicy() {
        return this.closePolicy;
    }

    public int hashCode() {
        ClosePolicyDto closePolicyDto = this.closePolicy;
        if (closePolicyDto == null) {
            return 0;
        }
        return closePolicyDto.hashCode();
    }

    public String toString() {
        return "CloseModalActionDto(closePolicy=" + this.closePolicy + Extension.C_BRAKE;
    }
}
