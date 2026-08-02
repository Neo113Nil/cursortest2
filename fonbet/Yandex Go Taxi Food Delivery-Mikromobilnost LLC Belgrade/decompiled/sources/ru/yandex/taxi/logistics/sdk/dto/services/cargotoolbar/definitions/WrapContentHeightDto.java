package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/WrapContentHeightDto;", "", "isSlideable", "", "skeletonHeight", "", "<init>", "(ZLjava/lang/Integer;)V", "()Z", "getSkeletonHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ZLjava/lang/Integer;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/WrapContentHeightDto;", "equals", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WrapContentHeightDto {
    private final boolean isSlideable;
    private final Integer skeletonHeight;

    public /* synthetic */ WrapContentHeightDto(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, num);
    }

    public static /* synthetic */ WrapContentHeightDto copy$default(WrapContentHeightDto wrapContentHeightDto, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wrapContentHeightDto.isSlideable;
        }
        if ((i & 2) != 0) {
            num = wrapContentHeightDto.skeletonHeight;
        }
        return wrapContentHeightDto.copy(z, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSlideable() {
        return this.isSlideable;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSkeletonHeight() {
        return this.skeletonHeight;
    }

    public final WrapContentHeightDto copy(@Json(name = "is_slideable") boolean isSlideable, @Json(name = "skeleton_height") Integer skeletonHeight) {
        return new WrapContentHeightDto(isSlideable, skeletonHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrapContentHeightDto)) {
            return false;
        }
        WrapContentHeightDto wrapContentHeightDto = (WrapContentHeightDto) other;
        return this.isSlideable == wrapContentHeightDto.isSlideable && jl40.l(this.skeletonHeight, wrapContentHeightDto.skeletonHeight);
    }

    public final Integer getSkeletonHeight() {
        return this.skeletonHeight;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSlideable) * 31;
        Integer num = this.skeletonHeight;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final boolean isSlideable() {
        return this.isSlideable;
    }

    public String toString() {
        return "WrapContentHeightDto(isSlideable=" + this.isSlideable + ", skeletonHeight=" + this.skeletonHeight + Extension.C_BRAKE;
    }

    public WrapContentHeightDto(@Json(name = "is_slideable") boolean z, @Json(name = "skeleton_height") Integer num) {
        this.isSlideable = z;
        this.skeletonHeight = num;
    }
}
