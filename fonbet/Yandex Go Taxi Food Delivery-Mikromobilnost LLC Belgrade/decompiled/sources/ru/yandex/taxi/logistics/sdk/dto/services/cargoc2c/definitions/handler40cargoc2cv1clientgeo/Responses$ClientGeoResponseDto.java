package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1clientgeo;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/Responses$ClientGeoResponseDto", "", "", "shouldTrackGeo", "<init>", "(Z)V", "component1", "()Z", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/Responses$ClientGeoResponseDto;", "copy", "(Z)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/Responses$ClientGeoResponseDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldTrackGeo", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$ClientGeoResponseDto {
    private final boolean shouldTrackGeo;

    public Responses$ClientGeoResponseDto(@Json(name = "should_track_geo") boolean z) {
        this.shouldTrackGeo = z;
    }

    public static /* synthetic */ Responses$ClientGeoResponseDto copy$default(Responses$ClientGeoResponseDto responses$ClientGeoResponseDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = responses$ClientGeoResponseDto.shouldTrackGeo;
        }
        return responses$ClientGeoResponseDto.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldTrackGeo() {
        return this.shouldTrackGeo;
    }

    public final Responses$ClientGeoResponseDto copy(@Json(name = "should_track_geo") boolean shouldTrackGeo) {
        return new Responses$ClientGeoResponseDto(shouldTrackGeo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Responses$ClientGeoResponseDto) && this.shouldTrackGeo == ((Responses$ClientGeoResponseDto) other).shouldTrackGeo;
    }

    public final boolean getShouldTrackGeo() {
        return this.shouldTrackGeo;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldTrackGeo);
    }

    public String toString() {
        return nzs.b("ClientGeoResponseDto(shouldTrackGeo=", Extension.C_BRAKE, this.shouldTrackGeo);
    }
}
