package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryimagegenerateuploadlink;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.div.state.db.StateEntry;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/Responses$GenerateUploadLinkResponseDto", "", "", StateEntry.COLUMN_PATH, "uploadUrl", "downloadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/Responses$GenerateUploadLinkResponseDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/Responses$GenerateUploadLinkResponseDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getUploadUrl", "getDownloadUrl", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$GenerateUploadLinkResponseDto {
    private final String downloadUrl;
    private final String path;
    private final String uploadUrl;

    public Responses$GenerateUploadLinkResponseDto(@Json(name = "path") String str, @Json(name = "upload_url") String str2, @Json(name = "download_url") String str3) {
        this.path = str;
        this.uploadUrl = str2;
        this.downloadUrl = str3;
    }

    public static /* synthetic */ Responses$GenerateUploadLinkResponseDto copy$default(Responses$GenerateUploadLinkResponseDto responses$GenerateUploadLinkResponseDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responses$GenerateUploadLinkResponseDto.path;
        }
        if ((i & 2) != 0) {
            str2 = responses$GenerateUploadLinkResponseDto.uploadUrl;
        }
        if ((i & 4) != 0) {
            str3 = responses$GenerateUploadLinkResponseDto.downloadUrl;
        }
        return responses$GenerateUploadLinkResponseDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final Responses$GenerateUploadLinkResponseDto copy(@Json(name = "path") String path, @Json(name = "upload_url") String uploadUrl, @Json(name = "download_url") String downloadUrl) {
        return new Responses$GenerateUploadLinkResponseDto(path, uploadUrl, downloadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Responses$GenerateUploadLinkResponseDto)) {
            return false;
        }
        Responses$GenerateUploadLinkResponseDto responses$GenerateUploadLinkResponseDto = (Responses$GenerateUploadLinkResponseDto) other;
        return jl40.l(this.path, responses$GenerateUploadLinkResponseDto.path) && jl40.l(this.uploadUrl, responses$GenerateUploadLinkResponseDto.uploadUrl) && jl40.l(this.downloadUrl, responses$GenerateUploadLinkResponseDto.downloadUrl);
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        return this.downloadUrl.hashCode() + unr0.b(this.path.hashCode() * 31, 31, this.uploadUrl);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.uploadUrl;
        return oyr.t(b64.v("GenerateUploadLinkResponseDto(path=", str, ", uploadUrl=", str2, ", downloadUrl="), this.downloadUrl, Extension.C_BRAKE);
    }
}
