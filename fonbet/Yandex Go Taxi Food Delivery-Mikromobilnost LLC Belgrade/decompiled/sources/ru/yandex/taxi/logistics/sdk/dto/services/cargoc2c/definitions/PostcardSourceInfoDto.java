package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PostcardSourceInfoDto;", "", "userMessage", "", StateEntry.COLUMN_PATH, "downloadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserMessage", "()Ljava/lang/String;", "getPath", "getDownloadUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PostcardSourceInfoDto {
    private final String downloadUrl;
    private final String path;
    private final String userMessage;

    public PostcardSourceInfoDto(@Json(name = "user_message") String str, @Json(name = "path") String str2, @Json(name = "download_url") String str3) {
        this.userMessage = str;
        this.path = str2;
        this.downloadUrl = str3;
    }

    public static /* synthetic */ PostcardSourceInfoDto copy$default(PostcardSourceInfoDto postcardSourceInfoDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postcardSourceInfoDto.userMessage;
        }
        if ((i & 2) != 0) {
            str2 = postcardSourceInfoDto.path;
        }
        if ((i & 4) != 0) {
            str3 = postcardSourceInfoDto.downloadUrl;
        }
        return postcardSourceInfoDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final PostcardSourceInfoDto copy(@Json(name = "user_message") String userMessage, @Json(name = "path") String path, @Json(name = "download_url") String downloadUrl) {
        return new PostcardSourceInfoDto(userMessage, path, downloadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostcardSourceInfoDto)) {
            return false;
        }
        PostcardSourceInfoDto postcardSourceInfoDto = (PostcardSourceInfoDto) other;
        return jl40.l(this.userMessage, postcardSourceInfoDto.userMessage) && jl40.l(this.path, postcardSourceInfoDto.path) && jl40.l(this.downloadUrl, postcardSourceInfoDto.downloadUrl);
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public int hashCode() {
        String str = this.userMessage;
        return this.downloadUrl.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.path);
    }

    public String toString() {
        String str = this.userMessage;
        String str2 = this.path;
        return oyr.t(b64.v("PostcardSourceInfoDto(userMessage=", str, ", path=", str2, ", downloadUrl="), this.downloadUrl, Extension.C_BRAKE);
    }
}
