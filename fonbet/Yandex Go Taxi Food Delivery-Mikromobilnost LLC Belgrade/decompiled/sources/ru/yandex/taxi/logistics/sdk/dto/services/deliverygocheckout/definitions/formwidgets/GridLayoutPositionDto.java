package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutPositionDto;", "", "row", "", "column", "<init>", "(II)V", "getRow", "()I", "getColumn", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GridLayoutPositionDto {
    private final int column;
    private final int row;

    public GridLayoutPositionDto(@Json(name = "row") int i, @Json(name = "column") int i2) {
        this.row = i;
        this.column = i2;
    }

    public static /* synthetic */ GridLayoutPositionDto copy$default(GridLayoutPositionDto gridLayoutPositionDto, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = gridLayoutPositionDto.row;
        }
        if ((i3 & 2) != 0) {
            i2 = gridLayoutPositionDto.column;
        }
        return gridLayoutPositionDto.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRow() {
        return this.row;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColumn() {
        return this.column;
    }

    public final GridLayoutPositionDto copy(@Json(name = "row") int row, @Json(name = "column") int column) {
        return new GridLayoutPositionDto(row, column);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridLayoutPositionDto)) {
            return false;
        }
        GridLayoutPositionDto gridLayoutPositionDto = (GridLayoutPositionDto) other;
        return this.row == gridLayoutPositionDto.row && this.column == gridLayoutPositionDto.column;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getRow() {
        return this.row;
    }

    public int hashCode() {
        return Integer.hashCode(this.column) + (Integer.hashCode(this.row) * 31);
    }

    public String toString() {
        return b64.d(this.row, this.column, "GridLayoutPositionDto(row=", ", column=", Extension.C_BRAKE);
    }
}
