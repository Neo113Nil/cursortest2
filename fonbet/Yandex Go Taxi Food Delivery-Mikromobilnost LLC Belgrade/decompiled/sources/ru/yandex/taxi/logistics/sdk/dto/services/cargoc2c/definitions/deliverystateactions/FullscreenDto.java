package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/FullscreenDto;", "", "isSlideable", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FullscreenDto {
    private final boolean isSlideable;

    public /* synthetic */ FullscreenDto(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public static /* synthetic */ FullscreenDto copy$default(FullscreenDto fullscreenDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fullscreenDto.isSlideable;
        }
        return fullscreenDto.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSlideable() {
        return this.isSlideable;
    }

    public final FullscreenDto copy(@Json(name = "is_slideable") boolean isSlideable) {
        return new FullscreenDto(isSlideable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FullscreenDto) && this.isSlideable == ((FullscreenDto) other).isSlideable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSlideable);
    }

    public final boolean isSlideable() {
        return this.isSlideable;
    }

    public String toString() {
        return nzs.b("FullscreenDto(isSlideable=", Extension.C_BRAKE, this.isSlideable);
    }

    public FullscreenDto(@Json(name = "is_slideable") boolean z) {
        this.isSlideable = z;
    }

    public FullscreenDto() {
        this(false, 1, null);
    }
}
