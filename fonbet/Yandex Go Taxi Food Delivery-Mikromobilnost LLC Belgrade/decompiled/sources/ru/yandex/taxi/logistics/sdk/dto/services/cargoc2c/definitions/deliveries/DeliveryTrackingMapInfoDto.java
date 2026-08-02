package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingMapInfoDto;", "", "shouldTrackGeo", "", "adsOnMapMeta", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Object;)V", "getShouldTrackGeo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAdsOnMapMeta", "()Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Object;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingMapInfoDto;", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryTrackingMapInfoDto {
    private final Object adsOnMapMeta;
    private final Boolean shouldTrackGeo;

    public DeliveryTrackingMapInfoDto(@Json(name = "should_track_geo") Boolean bool, @Json(name = "ads_on_map_meta") Object obj) {
        this.shouldTrackGeo = bool;
        this.adsOnMapMeta = obj;
    }

    public static /* synthetic */ DeliveryTrackingMapInfoDto copy$default(DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto, Boolean bool, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            bool = deliveryTrackingMapInfoDto.shouldTrackGeo;
        }
        if ((i & 2) != 0) {
            obj = deliveryTrackingMapInfoDto.adsOnMapMeta;
        }
        return deliveryTrackingMapInfoDto.copy(bool, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShouldTrackGeo() {
        return this.shouldTrackGeo;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getAdsOnMapMeta() {
        return this.adsOnMapMeta;
    }

    public final DeliveryTrackingMapInfoDto copy(@Json(name = "should_track_geo") Boolean shouldTrackGeo, @Json(name = "ads_on_map_meta") Object adsOnMapMeta) {
        return new DeliveryTrackingMapInfoDto(shouldTrackGeo, adsOnMapMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTrackingMapInfoDto)) {
            return false;
        }
        DeliveryTrackingMapInfoDto deliveryTrackingMapInfoDto = (DeliveryTrackingMapInfoDto) other;
        return jl40.l(this.shouldTrackGeo, deliveryTrackingMapInfoDto.shouldTrackGeo) && jl40.l(this.adsOnMapMeta, deliveryTrackingMapInfoDto.adsOnMapMeta);
    }

    public final Object getAdsOnMapMeta() {
        return this.adsOnMapMeta;
    }

    public final Boolean getShouldTrackGeo() {
        return this.shouldTrackGeo;
    }

    public int hashCode() {
        Boolean bool = this.shouldTrackGeo;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Object obj = this.adsOnMapMeta;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "DeliveryTrackingMapInfoDto(shouldTrackGeo=" + this.shouldTrackGeo + ", adsOnMapMeta=" + this.adsOnMapMeta + Extension.C_BRAKE;
    }
}
