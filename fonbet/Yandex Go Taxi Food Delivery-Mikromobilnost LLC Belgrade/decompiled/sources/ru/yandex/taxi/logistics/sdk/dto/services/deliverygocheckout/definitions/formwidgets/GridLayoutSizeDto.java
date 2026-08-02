package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;", "", "rows", "", "columns", "<init>", "(II)V", "getRows", "()I", "getColumns", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GridLayoutSizeDto {
    private final int columns;
    private final int rows;

    public GridLayoutSizeDto(@Json(name = "rows") int i, @Json(name = "columns") int i2) {
        this.rows = i;
        this.columns = i2;
    }

    public static /* synthetic */ GridLayoutSizeDto copy$default(GridLayoutSizeDto gridLayoutSizeDto, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = gridLayoutSizeDto.rows;
        }
        if ((i3 & 2) != 0) {
            i2 = gridLayoutSizeDto.columns;
        }
        return gridLayoutSizeDto.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRows() {
        return this.rows;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColumns() {
        return this.columns;
    }

    public final GridLayoutSizeDto copy(@Json(name = "rows") int rows, @Json(name = "columns") int columns) {
        return new GridLayoutSizeDto(rows, columns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridLayoutSizeDto)) {
            return false;
        }
        GridLayoutSizeDto gridLayoutSizeDto = (GridLayoutSizeDto) other;
        return this.rows == gridLayoutSizeDto.rows && this.columns == gridLayoutSizeDto.columns;
    }

    public final int getColumns() {
        return this.columns;
    }

    public final int getRows() {
        return this.rows;
    }

    public int hashCode() {
        return Integer.hashCode(this.columns) + (Integer.hashCode(this.rows) * 31);
    }

    public String toString() {
        return b64.d(this.rows, this.columns, "GridLayoutSizeDto(rows=", ", columns=", Extension.C_BRAKE);
    }
}
