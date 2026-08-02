package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GraphicShapeDto;", "", "geometry", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GraphicShapeGeometryDto;", "color", "", "borderWidth", "", "borderColor", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GraphicShapeGeometryDto;Ljava/lang/String;DLjava/lang/String;)V", "getGeometry", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GraphicShapeGeometryDto;", "getColor", "()Ljava/lang/String;", "getBorderWidth", "()D", "getBorderColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GraphicShapeDto {
    private final String borderColor;
    private final double borderWidth;
    private final String color;
    private final GraphicShapeGeometryDto geometry;

    public /* synthetic */ GraphicShapeDto(GraphicShapeGeometryDto graphicShapeGeometryDto, String str, double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(graphicShapeGeometryDto, str, (i & 4) != 0 ? 0.0d : d, str2);
    }

    public static /* synthetic */ GraphicShapeDto copy$default(GraphicShapeDto graphicShapeDto, GraphicShapeGeometryDto graphicShapeGeometryDto, String str, double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            graphicShapeGeometryDto = graphicShapeDto.geometry;
        }
        if ((i & 2) != 0) {
            str = graphicShapeDto.color;
        }
        if ((i & 4) != 0) {
            d = graphicShapeDto.borderWidth;
        }
        if ((i & 8) != 0) {
            str2 = graphicShapeDto.borderColor;
        }
        String str3 = str2;
        return graphicShapeDto.copy(graphicShapeGeometryDto, str, d, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final GraphicShapeGeometryDto getGeometry() {
        return this.geometry;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final double getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    public final GraphicShapeDto copy(@Json(name = "geometry") GraphicShapeGeometryDto geometry, @Json(name = "color") String color, @Json(name = "border_width") double borderWidth, @Json(name = "border_color") String borderColor) {
        return new GraphicShapeDto(geometry, color, borderWidth, borderColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicShapeDto)) {
            return false;
        }
        GraphicShapeDto graphicShapeDto = (GraphicShapeDto) other;
        return jl40.l(this.geometry, graphicShapeDto.geometry) && jl40.l(this.color, graphicShapeDto.color) && Double.compare(this.borderWidth, graphicShapeDto.borderWidth) == 0 && jl40.l(this.borderColor, graphicShapeDto.borderColor);
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final double getBorderWidth() {
        return this.borderWidth;
    }

    public final String getColor() {
        return this.color;
    }

    public final GraphicShapeGeometryDto getGeometry() {
        return this.geometry;
    }

    public int hashCode() {
        int hashCode = this.geometry.hashCode() * 31;
        String str = this.color;
        int a = unr0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.borderWidth);
        String str2 = this.borderColor;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GraphicShapeDto(geometry=" + this.geometry + ", color=" + this.color + ", borderWidth=" + this.borderWidth + ", borderColor=" + this.borderColor + Extension.C_BRAKE;
    }

    public GraphicShapeDto(@Json(name = "geometry") GraphicShapeGeometryDto graphicShapeGeometryDto, @Json(name = "color") String str, @Json(name = "border_width") double d, @Json(name = "border_color") String str2) {
        this.geometry = graphicShapeGeometryDto;
        this.color = str;
        this.borderWidth = d;
        this.borderColor = str2;
    }
}
