package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/YandexMessengerPayloadDto;", "", "entrypoint", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "userPhoneId", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEntrypoint", "()Ljava/lang/String;", "getOrderId", "getUserPhoneId", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YandexMessengerPayloadDto {
    private final String entrypoint;
    private final String orderId;
    private final String userId;
    private final String userPhoneId;

    public YandexMessengerPayloadDto(@Json(name = "entrypoint") String str, @Json(name = "order_id") String str2, @Json(name = "user_phone_id") String str3, @Json(name = "user_id") String str4) {
        this.entrypoint = str;
        this.orderId = str2;
        this.userPhoneId = str3;
        this.userId = str4;
    }

    public static /* synthetic */ YandexMessengerPayloadDto copy$default(YandexMessengerPayloadDto yandexMessengerPayloadDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yandexMessengerPayloadDto.entrypoint;
        }
        if ((i & 2) != 0) {
            str2 = yandexMessengerPayloadDto.orderId;
        }
        if ((i & 4) != 0) {
            str3 = yandexMessengerPayloadDto.userPhoneId;
        }
        if ((i & 8) != 0) {
            str4 = yandexMessengerPayloadDto.userId;
        }
        return yandexMessengerPayloadDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntrypoint() {
        return this.entrypoint;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserPhoneId() {
        return this.userPhoneId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final YandexMessengerPayloadDto copy(@Json(name = "entrypoint") String entrypoint, @Json(name = "order_id") String orderId, @Json(name = "user_phone_id") String userPhoneId, @Json(name = "user_id") String userId) {
        return new YandexMessengerPayloadDto(entrypoint, orderId, userPhoneId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YandexMessengerPayloadDto)) {
            return false;
        }
        YandexMessengerPayloadDto yandexMessengerPayloadDto = (YandexMessengerPayloadDto) other;
        return jl40.l(this.entrypoint, yandexMessengerPayloadDto.entrypoint) && jl40.l(this.orderId, yandexMessengerPayloadDto.orderId) && jl40.l(this.userPhoneId, yandexMessengerPayloadDto.userPhoneId) && jl40.l(this.userId, yandexMessengerPayloadDto.userId);
    }

    public final String getEntrypoint() {
        return this.entrypoint;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserPhoneId() {
        return this.userPhoneId;
    }

    public int hashCode() {
        int b = unr0.b(this.entrypoint.hashCode() * 31, 31, this.orderId);
        String str = this.userPhoneId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.entrypoint;
        String str2 = this.orderId;
        return g8e.r(b64.v("YandexMessengerPayloadDto(entrypoint=", str, ", orderId=", str2, ", userPhoneId="), this.userPhoneId, ", userId=", this.userId, Extension.C_BRAKE);
    }
}
