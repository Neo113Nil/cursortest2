package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverypaymentcontext;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0003j\u0002`\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0003j\u0002`\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u00060\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/UserContextDto;", "", "yandexUid", "", "phonePdId", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderBoundPhonePdIdDto;", "userIp", "loginId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getYandexUid", "()Ljava/lang/String;", "getPhonePdId", "getUserIp", "getLoginId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserContextDto {
    private final String loginId;
    private final String phonePdId;
    private final String userIp;
    private final String yandexUid;

    public UserContextDto(@Json(name = "yandex_uid") String str, @Json(name = "phone_pd_id") String str2, @Json(name = "user_ip") String str3, @Json(name = "login_id") String str4) {
        this.yandexUid = str;
        this.phonePdId = str2;
        this.userIp = str3;
        this.loginId = str4;
    }

    public static /* synthetic */ UserContextDto copy$default(UserContextDto userContextDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userContextDto.yandexUid;
        }
        if ((i & 2) != 0) {
            str2 = userContextDto.phonePdId;
        }
        if ((i & 4) != 0) {
            str3 = userContextDto.userIp;
        }
        if ((i & 8) != 0) {
            str4 = userContextDto.loginId;
        }
        return userContextDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getYandexUid() {
        return this.yandexUid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhonePdId() {
        return this.phonePdId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserIp() {
        return this.userIp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLoginId() {
        return this.loginId;
    }

    public final UserContextDto copy(@Json(name = "yandex_uid") String yandexUid, @Json(name = "phone_pd_id") String phonePdId, @Json(name = "user_ip") String userIp, @Json(name = "login_id") String loginId) {
        return new UserContextDto(yandexUid, phonePdId, userIp, loginId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserContextDto)) {
            return false;
        }
        UserContextDto userContextDto = (UserContextDto) other;
        return jl40.l(this.yandexUid, userContextDto.yandexUid) && jl40.l(this.phonePdId, userContextDto.phonePdId) && jl40.l(this.userIp, userContextDto.userIp) && jl40.l(this.loginId, userContextDto.loginId);
    }

    public final String getLoginId() {
        return this.loginId;
    }

    public final String getPhonePdId() {
        return this.phonePdId;
    }

    public final String getUserIp() {
        return this.userIp;
    }

    public final String getYandexUid() {
        return this.yandexUid;
    }

    public int hashCode() {
        return this.loginId.hashCode() + unr0.b(unr0.b(this.yandexUid.hashCode() * 31, 31, this.phonePdId), 31, this.userIp);
    }

    public String toString() {
        String str = this.yandexUid;
        String str2 = this.phonePdId;
        return g8e.r(b64.v("UserContextDto(yandexUid=", str, ", phonePdId=", str2, ", userIp="), this.userIp, ", loginId=", this.loginId, Extension.C_BRAKE);
    }
}
