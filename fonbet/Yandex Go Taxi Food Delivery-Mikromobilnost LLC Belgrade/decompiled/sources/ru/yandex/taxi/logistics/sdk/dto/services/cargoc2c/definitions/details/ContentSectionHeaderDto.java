package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSectionHeaderDto;", "", "id", "", "title", "trailPayload", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;)V", "getId", "()Ljava/lang/String;", "getTitle", "getTrailPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentSectionHeaderDto {
    private final String id;
    private final String title;
    private final PayloadDto trailPayload;

    public ContentSectionHeaderDto(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "trail_payload") PayloadDto payloadDto) {
        this.id = str;
        this.title = str2;
        this.trailPayload = payloadDto;
    }

    public static /* synthetic */ ContentSectionHeaderDto copy$default(ContentSectionHeaderDto contentSectionHeaderDto, String str, String str2, PayloadDto payloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentSectionHeaderDto.id;
        }
        if ((i & 2) != 0) {
            str2 = contentSectionHeaderDto.title;
        }
        if ((i & 4) != 0) {
            payloadDto = contentSectionHeaderDto.trailPayload;
        }
        return contentSectionHeaderDto.copy(str, str2, payloadDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final PayloadDto getTrailPayload() {
        return this.trailPayload;
    }

    public final ContentSectionHeaderDto copy(@Json(name = "id") String id, @Json(name = "title") String title, @Json(name = "trail_payload") PayloadDto trailPayload) {
        return new ContentSectionHeaderDto(id, title, trailPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentSectionHeaderDto)) {
            return false;
        }
        ContentSectionHeaderDto contentSectionHeaderDto = (ContentSectionHeaderDto) other;
        return jl40.l(this.id, contentSectionHeaderDto.id) && jl40.l(this.title, contentSectionHeaderDto.title) && jl40.l(this.trailPayload, contentSectionHeaderDto.trailPayload);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PayloadDto getTrailPayload() {
        return this.trailPayload;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.title);
        PayloadDto payloadDto = this.trailPayload;
        return b + (payloadDto == null ? 0 : payloadDto.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        PayloadDto payloadDto = this.trailPayload;
        StringBuilder v = b64.v("ContentSectionHeaderDto(id=", str, ", title=", str2, ", trailPayload=");
        v.append(payloadDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
