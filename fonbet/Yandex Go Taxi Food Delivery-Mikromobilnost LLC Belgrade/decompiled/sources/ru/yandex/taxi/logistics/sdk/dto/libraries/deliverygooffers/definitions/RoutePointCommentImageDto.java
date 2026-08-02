package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.div.state.db.StateEntry;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/definitions/RoutePointCommentImageDto;", "", "downloadUrl", "", StateEntry.COLUMN_PATH, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDownloadUrl", "()Ljava/lang/String;", "getPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RoutePointCommentImageDto {
    private final String downloadUrl;
    private final String path;

    public RoutePointCommentImageDto(@Json(name = "download_url") String str, @Json(name = "path") String str2) {
        this.downloadUrl = str;
        this.path = str2;
    }

    public static /* synthetic */ RoutePointCommentImageDto copy$default(RoutePointCommentImageDto routePointCommentImageDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = routePointCommentImageDto.downloadUrl;
        }
        if ((i & 2) != 0) {
            str2 = routePointCommentImageDto.path;
        }
        return routePointCommentImageDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final RoutePointCommentImageDto copy(@Json(name = "download_url") String downloadUrl, @Json(name = "path") String path) {
        return new RoutePointCommentImageDto(downloadUrl, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointCommentImageDto)) {
            return false;
        }
        RoutePointCommentImageDto routePointCommentImageDto = (RoutePointCommentImageDto) other;
        return jl40.l(this.downloadUrl, routePointCommentImageDto.downloadUrl) && jl40.l(this.path, routePointCommentImageDto.path);
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode() + (this.downloadUrl.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("RoutePointCommentImageDto(downloadUrl=", this.downloadUrl, ", path=", this.path, Extension.C_BRAKE);
    }
}
