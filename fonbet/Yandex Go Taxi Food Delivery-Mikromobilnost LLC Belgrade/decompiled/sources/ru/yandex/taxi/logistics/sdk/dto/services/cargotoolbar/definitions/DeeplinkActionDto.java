package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/DeeplinkActionDto;", "", Constants.DEEPLINK, "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeeplinkActionDto {
    private final String deeplink;

    public DeeplinkActionDto(@Json(name = "deeplink") String str) {
        this.deeplink = str;
    }

    public static /* synthetic */ DeeplinkActionDto copy$default(DeeplinkActionDto deeplinkActionDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deeplinkActionDto.deeplink;
        }
        return deeplinkActionDto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final DeeplinkActionDto copy(@Json(name = "deeplink") String deeplink) {
        return new DeeplinkActionDto(deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeeplinkActionDto) && jl40.l(this.deeplink, ((DeeplinkActionDto) other).deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        return this.deeplink.hashCode();
    }

    public String toString() {
        return oyr.p("DeeplinkActionDto(deeplink=", this.deeplink, Extension.C_BRAKE);
    }
}
