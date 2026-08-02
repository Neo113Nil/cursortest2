package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OpenWebViewActionDto;", "", "url", "", "shouldAuthorize", "", "<init>", "(Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "getShouldAuthorize", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OpenWebViewActionDto {
    private final boolean shouldAuthorize;
    private final String url;

    public OpenWebViewActionDto(@Json(name = "url") String str, @Json(name = "should_authorize") boolean z) {
        this.url = str;
        this.shouldAuthorize = z;
    }

    public static /* synthetic */ OpenWebViewActionDto copy$default(OpenWebViewActionDto openWebViewActionDto, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openWebViewActionDto.url;
        }
        if ((i & 2) != 0) {
            z = openWebViewActionDto.shouldAuthorize;
        }
        return openWebViewActionDto.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldAuthorize() {
        return this.shouldAuthorize;
    }

    public final OpenWebViewActionDto copy(@Json(name = "url") String url, @Json(name = "should_authorize") boolean shouldAuthorize) {
        return new OpenWebViewActionDto(url, shouldAuthorize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenWebViewActionDto)) {
            return false;
        }
        OpenWebViewActionDto openWebViewActionDto = (OpenWebViewActionDto) other;
        return jl40.l(this.url, openWebViewActionDto.url) && this.shouldAuthorize == openWebViewActionDto.shouldAuthorize;
    }

    public final boolean getShouldAuthorize() {
        return this.shouldAuthorize;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldAuthorize) + (this.url.hashCode() * 31);
    }

    public String toString() {
        return xvz.k("OpenWebViewActionDto(url=", this.url, ", shouldAuthorize=", this.shouldAuthorize, Extension.C_BRAKE);
    }
}
