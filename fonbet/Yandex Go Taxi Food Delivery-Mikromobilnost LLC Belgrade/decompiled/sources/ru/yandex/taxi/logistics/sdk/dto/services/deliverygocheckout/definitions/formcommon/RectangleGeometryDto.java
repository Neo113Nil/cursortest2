package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RectangleGeometryDto;", "", "originX", "", "originY", "width", "", "height", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;I)V", "getOriginX", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginY", "getWidth", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHeight", "getCornerRadius", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;I)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/RectangleGeometryDto;", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RectangleGeometryDto {
    private final int cornerRadius;
    private final Double height;
    private final Integer originX;
    private final Integer originY;
    private final Double width;

    public /* synthetic */ RectangleGeometryDto(Integer num, Integer num2, Double d, Double d2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, d, d2, (i2 & 16) != 0 ? 0 : i);
    }

    public static /* synthetic */ RectangleGeometryDto copy$default(RectangleGeometryDto rectangleGeometryDto, Integer num, Integer num2, Double d, Double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = rectangleGeometryDto.originX;
        }
        if ((i2 & 2) != 0) {
            num2 = rectangleGeometryDto.originY;
        }
        if ((i2 & 4) != 0) {
            d = rectangleGeometryDto.width;
        }
        if ((i2 & 8) != 0) {
            d2 = rectangleGeometryDto.height;
        }
        if ((i2 & 16) != 0) {
            i = rectangleGeometryDto.cornerRadius;
        }
        int i3 = i;
        Double d3 = d;
        return rectangleGeometryDto.copy(num, num2, d3, d2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getOriginX() {
        return this.originX;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getOriginY() {
        return this.originY;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getHeight() {
        return this.height;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final RectangleGeometryDto copy(@Json(name = "origin_x") Integer originX, @Json(name = "origin_y") Integer originY, @Json(name = "width") Double width, @Json(name = "height") Double height, @Json(name = "corner_radius") int cornerRadius) {
        return new RectangleGeometryDto(originX, originY, width, height, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RectangleGeometryDto)) {
            return false;
        }
        RectangleGeometryDto rectangleGeometryDto = (RectangleGeometryDto) other;
        return jl40.l(this.originX, rectangleGeometryDto.originX) && jl40.l(this.originY, rectangleGeometryDto.originY) && jl40.l(this.width, rectangleGeometryDto.width) && jl40.l(this.height, rectangleGeometryDto.height) && this.cornerRadius == rectangleGeometryDto.cornerRadius;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final Integer getOriginX() {
        return this.originX;
    }

    public final Integer getOriginY() {
        return this.originY;
    }

    public final Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.originX;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.originY;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.width;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.height;
        return Integer.hashCode(this.cornerRadius) + ((hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Integer num = this.originX;
        Integer num2 = this.originY;
        Double d = this.width;
        Double d2 = this.height;
        int i = this.cornerRadius;
        StringBuilder sb = new StringBuilder("RectangleGeometryDto(originX=");
        sb.append(num);
        sb.append(", originY=");
        sb.append(num2);
        sb.append(", width=");
        sb.append(d);
        sb.append(", height=");
        sb.append(d2);
        sb.append(", cornerRadius=");
        return oyr.m(i, Extension.C_BRAKE, sb);
    }

    public RectangleGeometryDto(@Json(name = "origin_x") Integer num, @Json(name = "origin_y") Integer num2, @Json(name = "width") Double d, @Json(name = "height") Double d2, @Json(name = "corner_radius") int i) {
        this.originX = num;
        this.originY = num2;
        this.width = d;
        this.height = d2;
        this.cornerRadius = i;
    }
}
