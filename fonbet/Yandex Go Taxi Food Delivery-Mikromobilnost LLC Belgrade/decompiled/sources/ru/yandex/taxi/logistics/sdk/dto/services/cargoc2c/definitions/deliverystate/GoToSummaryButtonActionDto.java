package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/GoToSummaryButtonActionDto;", "", "changePaymentMethod", "", "<init>", "(Z)V", "getChangePaymentMethod", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GoToSummaryButtonActionDto {
    private final boolean changePaymentMethod;

    public GoToSummaryButtonActionDto(@Json(name = "change_payment_method") boolean z) {
        this.changePaymentMethod = z;
    }

    public static /* synthetic */ GoToSummaryButtonActionDto copy$default(GoToSummaryButtonActionDto goToSummaryButtonActionDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = goToSummaryButtonActionDto.changePaymentMethod;
        }
        return goToSummaryButtonActionDto.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getChangePaymentMethod() {
        return this.changePaymentMethod;
    }

    public final GoToSummaryButtonActionDto copy(@Json(name = "change_payment_method") boolean changePaymentMethod) {
        return new GoToSummaryButtonActionDto(changePaymentMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GoToSummaryButtonActionDto) && this.changePaymentMethod == ((GoToSummaryButtonActionDto) other).changePaymentMethod;
    }

    public final boolean getChangePaymentMethod() {
        return this.changePaymentMethod;
    }

    public int hashCode() {
        return Boolean.hashCode(this.changePaymentMethod);
    }

    public String toString() {
        return nzs.b("GoToSummaryButtonActionDto(changePaymentMethod=", Extension.C_BRAKE, this.changePaymentMethod);
    }
}
