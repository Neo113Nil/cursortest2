package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ScrollableRowTileDto;", "", "tile", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;", "width", "", "height", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTile", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "component1", "component2", "component3", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ScrollableRowTileDto;", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrollableRowTileDto {
    private final Integer height;
    private final TileDto tile;
    private final Integer width;

    public ScrollableRowTileDto(@Json(name = "tile") TileDto tileDto, @Json(name = "width") Integer num, @Json(name = "height") Integer num2) {
        this.tile = tileDto;
        this.width = num;
        this.height = num2;
    }

    public static /* synthetic */ ScrollableRowTileDto copy$default(ScrollableRowTileDto scrollableRowTileDto, TileDto tileDto, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            tileDto = scrollableRowTileDto.tile;
        }
        if ((i & 2) != 0) {
            num = scrollableRowTileDto.width;
        }
        if ((i & 4) != 0) {
            num2 = scrollableRowTileDto.height;
        }
        return scrollableRowTileDto.copy(tileDto, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final TileDto getTile() {
        return this.tile;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    public final ScrollableRowTileDto copy(@Json(name = "tile") TileDto tile, @Json(name = "width") Integer width, @Json(name = "height") Integer height) {
        return new ScrollableRowTileDto(tile, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableRowTileDto)) {
            return false;
        }
        ScrollableRowTileDto scrollableRowTileDto = (ScrollableRowTileDto) other;
        return jl40.l(this.tile, scrollableRowTileDto.tile) && jl40.l(this.width, scrollableRowTileDto.width) && jl40.l(this.height, scrollableRowTileDto.height);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final TileDto getTile() {
        return this.tile;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.tile.hashCode() * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        TileDto tileDto = this.tile;
        Integer num = this.width;
        Integer num2 = this.height;
        StringBuilder sb = new StringBuilder("ScrollableRowTileDto(tile=");
        sb.append(tileDto);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        return oo31.j(sb, num2, Extension.C_BRAKE);
    }
}
