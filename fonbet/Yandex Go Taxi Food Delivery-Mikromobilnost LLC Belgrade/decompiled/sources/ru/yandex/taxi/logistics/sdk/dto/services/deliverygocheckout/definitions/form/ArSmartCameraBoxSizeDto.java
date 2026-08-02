package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.ly3;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArSmartCameraBoxSizeDto;", "", "id", "", "heightCm", "widthCm", "depthCm", "<init>", "(IIII)V", "getId", "()I", "getHeightCm", "getWidthCm", "getDepthCm", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ArSmartCameraBoxSizeDto {
    private final int depthCm;
    private final int heightCm;
    private final int id;
    private final int widthCm;

    public ArSmartCameraBoxSizeDto(@Json(name = "id") int i, @Json(name = "height_cm") int i2, @Json(name = "width_cm") int i3, @Json(name = "depth_cm") int i4) {
        this.id = i;
        this.heightCm = i2;
        this.widthCm = i3;
        this.depthCm = i4;
    }

    public static /* synthetic */ ArSmartCameraBoxSizeDto copy$default(ArSmartCameraBoxSizeDto arSmartCameraBoxSizeDto, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = arSmartCameraBoxSizeDto.id;
        }
        if ((i5 & 2) != 0) {
            i2 = arSmartCameraBoxSizeDto.heightCm;
        }
        if ((i5 & 4) != 0) {
            i3 = arSmartCameraBoxSizeDto.widthCm;
        }
        if ((i5 & 8) != 0) {
            i4 = arSmartCameraBoxSizeDto.depthCm;
        }
        return arSmartCameraBoxSizeDto.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeightCm() {
        return this.heightCm;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWidthCm() {
        return this.widthCm;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDepthCm() {
        return this.depthCm;
    }

    public final ArSmartCameraBoxSizeDto copy(@Json(name = "id") int id, @Json(name = "height_cm") int heightCm, @Json(name = "width_cm") int widthCm, @Json(name = "depth_cm") int depthCm) {
        return new ArSmartCameraBoxSizeDto(id, heightCm, widthCm, depthCm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArSmartCameraBoxSizeDto)) {
            return false;
        }
        ArSmartCameraBoxSizeDto arSmartCameraBoxSizeDto = (ArSmartCameraBoxSizeDto) other;
        return this.id == arSmartCameraBoxSizeDto.id && this.heightCm == arSmartCameraBoxSizeDto.heightCm && this.widthCm == arSmartCameraBoxSizeDto.widthCm && this.depthCm == arSmartCameraBoxSizeDto.depthCm;
    }

    public final int getDepthCm() {
        return this.depthCm;
    }

    public final int getHeightCm() {
        return this.heightCm;
    }

    public final int getId() {
        return this.id;
    }

    public final int getWidthCm() {
        return this.widthCm;
    }

    public int hashCode() {
        return Integer.hashCode(this.depthCm) + oyr.b(this.widthCm, oyr.b(this.heightCm, Integer.hashCode(this.id) * 31, 31), 31);
    }

    public String toString() {
        return ly3.k(this.widthCm, this.depthCm, ", depthCm=", Extension.C_BRAKE, b64.s(this.id, this.heightCm, "ArSmartCameraBoxSizeDto(id=", ", heightCm=", ", widthCm="));
    }
}
