package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/InAppCallInfoDto;", "", "forwardingId", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getForwardingId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InAppCallInfoDto {
    private final String forwardingId;
    private final String title;

    public InAppCallInfoDto(@Json(name = "forwarding_id") String str, @Json(name = "title") String str2) {
        this.forwardingId = str;
        this.title = str2;
    }

    public static /* synthetic */ InAppCallInfoDto copy$default(InAppCallInfoDto inAppCallInfoDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppCallInfoDto.forwardingId;
        }
        if ((i & 2) != 0) {
            str2 = inAppCallInfoDto.title;
        }
        return inAppCallInfoDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getForwardingId() {
        return this.forwardingId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final InAppCallInfoDto copy(@Json(name = "forwarding_id") String forwardingId, @Json(name = "title") String title) {
        return new InAppCallInfoDto(forwardingId, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppCallInfoDto)) {
            return false;
        }
        InAppCallInfoDto inAppCallInfoDto = (InAppCallInfoDto) other;
        return jl40.l(this.forwardingId, inAppCallInfoDto.forwardingId) && jl40.l(this.title, inAppCallInfoDto.title);
    }

    public final String getForwardingId() {
        return this.forwardingId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.forwardingId.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("InAppCallInfoDto(forwardingId=", this.forwardingId, ", title=", this.title, Extension.C_BRAKE);
    }
}
