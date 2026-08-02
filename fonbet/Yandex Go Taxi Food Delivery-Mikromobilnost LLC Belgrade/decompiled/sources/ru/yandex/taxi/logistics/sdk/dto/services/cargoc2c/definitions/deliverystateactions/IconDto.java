package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/IconDto;", "", ClidProvider.APP_ACTIVE, "", ClidProvider.APP_INACTIVE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/String;", "getInactive", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IconDto {
    private final String active;
    private final String inactive;

    public IconDto(@Json(name = "active") String str, @Json(name = "inactive") String str2) {
        this.active = str;
        this.inactive = str2;
    }

    public static /* synthetic */ IconDto copy$default(IconDto iconDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iconDto.active;
        }
        if ((i & 2) != 0) {
            str2 = iconDto.inactive;
        }
        return iconDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActive() {
        return this.active;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInactive() {
        return this.inactive;
    }

    public final IconDto copy(@Json(name = "active") String active, @Json(name = "inactive") String inactive) {
        return new IconDto(active, inactive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconDto)) {
            return false;
        }
        IconDto iconDto = (IconDto) other;
        return jl40.l(this.active, iconDto.active) && jl40.l(this.inactive, iconDto.inactive);
    }

    public final String getActive() {
        return this.active;
    }

    public final String getInactive() {
        return this.inactive;
    }

    public int hashCode() {
        return this.inactive.hashCode() + (this.active.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("IconDto(active=", this.active, ", inactive=", this.inactive, Extension.C_BRAKE);
    }
}
