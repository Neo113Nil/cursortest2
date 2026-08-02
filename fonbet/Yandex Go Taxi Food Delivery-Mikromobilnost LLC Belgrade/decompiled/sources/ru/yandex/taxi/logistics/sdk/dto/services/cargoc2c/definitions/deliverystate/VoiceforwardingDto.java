package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/VoiceforwardingDto;", "", "phone", "", "ext", "inAppCallInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/InAppCallInfoDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/InAppCallInfoDto;)V", "getPhone", "()Ljava/lang/String;", "getExt", "getInAppCallInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/InAppCallInfoDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VoiceforwardingDto {
    private final String ext;
    private final InAppCallInfoDto inAppCallInfo;
    private final String phone;

    public VoiceforwardingDto(@Json(name = "phone") String str, @Json(name = "ext") String str2, @Json(name = "in_app_call_info") InAppCallInfoDto inAppCallInfoDto) {
        this.phone = str;
        this.ext = str2;
        this.inAppCallInfo = inAppCallInfoDto;
    }

    public static /* synthetic */ VoiceforwardingDto copy$default(VoiceforwardingDto voiceforwardingDto, String str, String str2, InAppCallInfoDto inAppCallInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceforwardingDto.phone;
        }
        if ((i & 2) != 0) {
            str2 = voiceforwardingDto.ext;
        }
        if ((i & 4) != 0) {
            inAppCallInfoDto = voiceforwardingDto.inAppCallInfo;
        }
        return voiceforwardingDto.copy(str, str2, inAppCallInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExt() {
        return this.ext;
    }

    /* renamed from: component3, reason: from getter */
    public final InAppCallInfoDto getInAppCallInfo() {
        return this.inAppCallInfo;
    }

    public final VoiceforwardingDto copy(@Json(name = "phone") String phone, @Json(name = "ext") String ext, @Json(name = "in_app_call_info") InAppCallInfoDto inAppCallInfo) {
        return new VoiceforwardingDto(phone, ext, inAppCallInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceforwardingDto)) {
            return false;
        }
        VoiceforwardingDto voiceforwardingDto = (VoiceforwardingDto) other;
        return jl40.l(this.phone, voiceforwardingDto.phone) && jl40.l(this.ext, voiceforwardingDto.ext) && jl40.l(this.inAppCallInfo, voiceforwardingDto.inAppCallInfo);
    }

    public final String getExt() {
        return this.ext;
    }

    public final InAppCallInfoDto getInAppCallInfo() {
        return this.inAppCallInfo;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int hashCode = this.phone.hashCode() * 31;
        String str = this.ext;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        InAppCallInfoDto inAppCallInfoDto = this.inAppCallInfo;
        return hashCode2 + (inAppCallInfoDto != null ? inAppCallInfoDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.ext;
        InAppCallInfoDto inAppCallInfoDto = this.inAppCallInfo;
        StringBuilder v = b64.v("VoiceforwardingDto(phone=", str, ", ext=", str2, ", inAppCallInfo=");
        v.append(inAppCallInfoDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
