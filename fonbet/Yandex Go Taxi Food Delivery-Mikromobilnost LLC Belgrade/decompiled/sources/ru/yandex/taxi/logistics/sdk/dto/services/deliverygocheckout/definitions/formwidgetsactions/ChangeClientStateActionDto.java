package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ChangeClientStateActionDto;", "", "stateDiff", "<init>", "(Ljava/lang/Object;)V", "getStateDiff", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChangeClientStateActionDto {
    private final Object stateDiff;

    public ChangeClientStateActionDto(@Json(name = "state_diff") Object obj) {
        this.stateDiff = obj;
    }

    public static /* synthetic */ ChangeClientStateActionDto copy$default(ChangeClientStateActionDto changeClientStateActionDto, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = changeClientStateActionDto.stateDiff;
        }
        return changeClientStateActionDto.copy(obj);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getStateDiff() {
        return this.stateDiff;
    }

    public final ChangeClientStateActionDto copy(@Json(name = "state_diff") Object stateDiff) {
        return new ChangeClientStateActionDto(stateDiff);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChangeClientStateActionDto) && jl40.l(this.stateDiff, ((ChangeClientStateActionDto) other).stateDiff);
    }

    public final Object getStateDiff() {
        return this.stateDiff;
    }

    public int hashCode() {
        return this.stateDiff.hashCode();
    }

    public String toString() {
        return qv10.p("ChangeClientStateActionDto(stateDiff=", Extension.C_BRAKE, this.stateDiff);
    }
}
