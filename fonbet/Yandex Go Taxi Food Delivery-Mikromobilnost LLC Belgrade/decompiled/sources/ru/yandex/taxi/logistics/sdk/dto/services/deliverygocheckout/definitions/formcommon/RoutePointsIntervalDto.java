package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RoutePointsIntervalDto;", "", "firstIndex", "", "lastIndex", "<init>", "(II)V", "getFirstIndex", "()I", "getLastIndex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RoutePointsIntervalDto {
    private final int firstIndex;
    private final int lastIndex;

    public RoutePointsIntervalDto(@Json(name = "first_index") int i, @Json(name = "last_index") int i2) {
        this.firstIndex = i;
        this.lastIndex = i2;
    }

    public static /* synthetic */ RoutePointsIntervalDto copy$default(RoutePointsIntervalDto routePointsIntervalDto, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = routePointsIntervalDto.firstIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = routePointsIntervalDto.lastIndex;
        }
        return routePointsIntervalDto.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFirstIndex() {
        return this.firstIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final RoutePointsIntervalDto copy(@Json(name = "first_index") int firstIndex, @Json(name = "last_index") int lastIndex) {
        return new RoutePointsIntervalDto(firstIndex, lastIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointsIntervalDto)) {
            return false;
        }
        RoutePointsIntervalDto routePointsIntervalDto = (RoutePointsIntervalDto) other;
        return this.firstIndex == routePointsIntervalDto.firstIndex && this.lastIndex == routePointsIntervalDto.lastIndex;
    }

    public final int getFirstIndex() {
        return this.firstIndex;
    }

    public final int getLastIndex() {
        return this.lastIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastIndex) + (Integer.hashCode(this.firstIndex) * 31);
    }

    public String toString() {
        return b64.d(this.firstIndex, this.lastIndex, "RoutePointsIntervalDto(firstIndex=", ", lastIndex=", Extension.C_BRAKE);
    }
}
