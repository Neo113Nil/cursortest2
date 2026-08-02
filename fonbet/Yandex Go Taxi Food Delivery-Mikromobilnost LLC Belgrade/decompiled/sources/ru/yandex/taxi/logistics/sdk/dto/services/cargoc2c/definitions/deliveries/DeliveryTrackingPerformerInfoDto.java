package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerInfoDto;", "", "vehicleNumber", "", "imageTagDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVehicleNumber", "()Ljava/lang/String;", "getImageTagDefault", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryTrackingPerformerInfoDto {
    private final String imageTagDefault;
    private final String vehicleNumber;

    public DeliveryTrackingPerformerInfoDto(@Json(name = "vehicle_number") String str, @Json(name = "image_tag_default") String str2) {
        this.vehicleNumber = str;
        this.imageTagDefault = str2;
    }

    public static /* synthetic */ DeliveryTrackingPerformerInfoDto copy$default(DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryTrackingPerformerInfoDto.vehicleNumber;
        }
        if ((i & 2) != 0) {
            str2 = deliveryTrackingPerformerInfoDto.imageTagDefault;
        }
        return deliveryTrackingPerformerInfoDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVehicleNumber() {
        return this.vehicleNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageTagDefault() {
        return this.imageTagDefault;
    }

    public final DeliveryTrackingPerformerInfoDto copy(@Json(name = "vehicle_number") String vehicleNumber, @Json(name = "image_tag_default") String imageTagDefault) {
        return new DeliveryTrackingPerformerInfoDto(vehicleNumber, imageTagDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTrackingPerformerInfoDto)) {
            return false;
        }
        DeliveryTrackingPerformerInfoDto deliveryTrackingPerformerInfoDto = (DeliveryTrackingPerformerInfoDto) other;
        return jl40.l(this.vehicleNumber, deliveryTrackingPerformerInfoDto.vehicleNumber) && jl40.l(this.imageTagDefault, deliveryTrackingPerformerInfoDto.imageTagDefault);
    }

    public final String getImageTagDefault() {
        return this.imageTagDefault;
    }

    public final String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public int hashCode() {
        String str = this.vehicleNumber;
        return this.imageTagDefault.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return unr0.p("DeliveryTrackingPerformerInfoDto(vehicleNumber=", this.vehicleNumber, ", imageTagDefault=", this.imageTagDefault, Extension.C_BRAKE);
    }
}
