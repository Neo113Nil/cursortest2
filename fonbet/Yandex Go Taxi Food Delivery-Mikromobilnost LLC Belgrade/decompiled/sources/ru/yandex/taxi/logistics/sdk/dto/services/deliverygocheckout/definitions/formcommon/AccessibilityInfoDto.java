package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AccessibilityInfoDto;", "", "isHeader", "", "contentDescription", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getContentDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccessibilityInfoDto {
    private final String contentDescription;
    private final boolean isHeader;

    public /* synthetic */ AccessibilityInfoDto(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str);
    }

    public static /* synthetic */ AccessibilityInfoDto copy$default(AccessibilityInfoDto accessibilityInfoDto, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accessibilityInfoDto.isHeader;
        }
        if ((i & 2) != 0) {
            str = accessibilityInfoDto.contentDescription;
        }
        return accessibilityInfoDto.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsHeader() {
        return this.isHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final AccessibilityInfoDto copy(@Json(name = "is_header") boolean isHeader, @Json(name = "content_description") String contentDescription) {
        return new AccessibilityInfoDto(isHeader, contentDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibilityInfoDto)) {
            return false;
        }
        AccessibilityInfoDto accessibilityInfoDto = (AccessibilityInfoDto) other;
        return this.isHeader == accessibilityInfoDto.isHeader && jl40.l(this.contentDescription, accessibilityInfoDto.contentDescription);
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isHeader) * 31;
        String str = this.contentDescription;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isHeader() {
        return this.isHeader;
    }

    public String toString() {
        return xvz.m("AccessibilityInfoDto(isHeader=", this.isHeader, ", contentDescription=", this.contentDescription, Extension.C_BRAKE);
    }

    public AccessibilityInfoDto(@Json(name = "is_header") boolean z, @Json(name = "content_description") String str) {
        this.isHeader = z;
        this.contentDescription = str;
    }
}
