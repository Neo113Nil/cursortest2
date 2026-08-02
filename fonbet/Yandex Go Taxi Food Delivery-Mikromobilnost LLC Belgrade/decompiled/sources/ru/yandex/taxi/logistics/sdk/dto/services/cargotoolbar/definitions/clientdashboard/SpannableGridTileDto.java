package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SpannableGridTileDto;", "", "tile", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;", "column", "", "row", "width", "height", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;IIII)V", "getTile", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;", "getColumn", "()I", "getRow", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpannableGridTileDto {
    private final int column;
    private final int height;
    private final int row;
    private final TileDto tile;
    private final int width;

    public SpannableGridTileDto(@Json(name = "tile") TileDto tileDto, @Json(name = "column") int i, @Json(name = "row") int i2, @Json(name = "width") int i3, @Json(name = "height") int i4) {
        this.tile = tileDto;
        this.column = i;
        this.row = i2;
        this.width = i3;
        this.height = i4;
    }

    public static /* synthetic */ SpannableGridTileDto copy$default(SpannableGridTileDto spannableGridTileDto, TileDto tileDto, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            tileDto = spannableGridTileDto.tile;
        }
        if ((i5 & 2) != 0) {
            i = spannableGridTileDto.column;
        }
        if ((i5 & 4) != 0) {
            i2 = spannableGridTileDto.row;
        }
        if ((i5 & 8) != 0) {
            i3 = spannableGridTileDto.width;
        }
        if ((i5 & 16) != 0) {
            i4 = spannableGridTileDto.height;
        }
        int i6 = i4;
        int i7 = i2;
        return spannableGridTileDto.copy(tileDto, i, i7, i3, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final TileDto getTile() {
        return this.tile;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColumn() {
        return this.column;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRow() {
        return this.row;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final SpannableGridTileDto copy(@Json(name = "tile") TileDto tile, @Json(name = "column") int column, @Json(name = "row") int row, @Json(name = "width") int width, @Json(name = "height") int height) {
        return new SpannableGridTileDto(tile, column, row, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpannableGridTileDto)) {
            return false;
        }
        SpannableGridTileDto spannableGridTileDto = (SpannableGridTileDto) other;
        return jl40.l(this.tile, spannableGridTileDto.tile) && this.column == spannableGridTileDto.column && this.row == spannableGridTileDto.row && this.width == spannableGridTileDto.width && this.height == spannableGridTileDto.height;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getRow() {
        return this.row;
    }

    public final TileDto getTile() {
        return this.tile;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + oyr.b(this.width, oyr.b(this.row, oyr.b(this.column, this.tile.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        TileDto tileDto = this.tile;
        int i = this.column;
        int i2 = this.row;
        int i3 = this.width;
        int i4 = this.height;
        StringBuilder sb = new StringBuilder("SpannableGridTileDto(tile=");
        sb.append(tileDto);
        sb.append(", column=");
        sb.append(i);
        sb.append(", row=");
        vfc.u(i2, i3, ", width=", ", height=", sb);
        return oyr.m(i4, Extension.C_BRAKE, sb);
    }
}
