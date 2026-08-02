package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.ly3;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;", "", "top", "", "bottom", "left", "right", "<init>", "(IIII)V", "getTop", "()I", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InsetsDto {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public InsetsDto(@Json(name = "top") int i, @Json(name = "bottom") int i2, @Json(name = "left") int i3, @Json(name = "right") int i4) {
        this.top = i;
        this.bottom = i2;
        this.left = i3;
        this.right = i4;
    }

    public static /* synthetic */ InsetsDto copy$default(InsetsDto insetsDto, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = insetsDto.top;
        }
        if ((i5 & 2) != 0) {
            i2 = insetsDto.bottom;
        }
        if ((i5 & 4) != 0) {
            i3 = insetsDto.left;
        }
        if ((i5 & 8) != 0) {
            i4 = insetsDto.right;
        }
        return insetsDto.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    public final InsetsDto copy(@Json(name = "top") int top, @Json(name = "bottom") int bottom, @Json(name = "left") int left, @Json(name = "right") int right) {
        return new InsetsDto(top, bottom, left, right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetsDto)) {
            return false;
        }
        InsetsDto insetsDto = (InsetsDto) other;
        return this.top == insetsDto.top && this.bottom == insetsDto.bottom && this.left == insetsDto.left && this.right == insetsDto.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return Integer.hashCode(this.right) + oyr.b(this.left, oyr.b(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
    }

    public String toString() {
        return ly3.k(this.left, this.right, ", right=", Extension.C_BRAKE, b64.s(this.top, this.bottom, "InsetsDto(top=", ", bottom=", ", left="));
    }
}
