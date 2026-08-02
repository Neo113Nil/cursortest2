package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BuyoutInfoDto;", "", "taskType", "", "price", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskType", "()Ljava/lang/String;", "getPrice", "getCurrency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BuyoutInfoDto {
    private final String currency;
    private final String price;
    private final String taskType;

    public BuyoutInfoDto(@Json(name = "task_type") String str, @Json(name = "price") String str2, @Json(name = "currency") String str3) {
        this.taskType = str;
        this.price = str2;
        this.currency = str3;
    }

    public static /* synthetic */ BuyoutInfoDto copy$default(BuyoutInfoDto buyoutInfoDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buyoutInfoDto.taskType;
        }
        if ((i & 2) != 0) {
            str2 = buyoutInfoDto.price;
        }
        if ((i & 4) != 0) {
            str3 = buyoutInfoDto.currency;
        }
        return buyoutInfoDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaskType() {
        return this.taskType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final BuyoutInfoDto copy(@Json(name = "task_type") String taskType, @Json(name = "price") String price, @Json(name = "currency") String currency) {
        return new BuyoutInfoDto(taskType, price, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyoutInfoDto)) {
            return false;
        }
        BuyoutInfoDto buyoutInfoDto = (BuyoutInfoDto) other;
        return jl40.l(this.taskType, buyoutInfoDto.taskType) && jl40.l(this.price, buyoutInfoDto.price) && jl40.l(this.currency, buyoutInfoDto.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getTaskType() {
        return this.taskType;
    }

    public int hashCode() {
        int hashCode = this.taskType.hashCode() * 31;
        String str = this.price;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.taskType;
        String str2 = this.price;
        return oyr.t(b64.v("BuyoutInfoDto(taskType=", str, ", price=", str2, ", currency="), this.currency, Extension.C_BRAKE);
    }
}
