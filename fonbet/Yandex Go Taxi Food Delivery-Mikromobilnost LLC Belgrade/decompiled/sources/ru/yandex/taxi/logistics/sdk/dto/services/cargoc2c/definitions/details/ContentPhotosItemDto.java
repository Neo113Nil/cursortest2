package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPhotosItemDto;", "", "id", "", "photos", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PhotoInfoDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPhotos", "()Ljava/util/List;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentPhotosItemDto {
    private final PayloadDto action;
    private final String id;
    private final String metricaLabel;
    private final List<PhotoInfoDto> photos;

    public ContentPhotosItemDto(@Json(name = "id") String str, @Json(name = "photos") List<PhotoInfoDto> list, @Json(name = "action") PayloadDto payloadDto, @Json(name = "metrica_label") String str2) {
        this.id = str;
        this.photos = list;
        this.action = payloadDto;
        this.metricaLabel = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentPhotosItemDto copy$default(ContentPhotosItemDto contentPhotosItemDto, String str, List list, PayloadDto payloadDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentPhotosItemDto.id;
        }
        if ((i & 2) != 0) {
            list = contentPhotosItemDto.photos;
        }
        if ((i & 4) != 0) {
            payloadDto = contentPhotosItemDto.action;
        }
        if ((i & 8) != 0) {
            str2 = contentPhotosItemDto.metricaLabel;
        }
        return contentPhotosItemDto.copy(str, list, payloadDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<PhotoInfoDto> component2() {
        return this.photos;
    }

    /* renamed from: component3, reason: from getter */
    public final PayloadDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ContentPhotosItemDto copy(@Json(name = "id") String id, @Json(name = "photos") List<PhotoInfoDto> photos, @Json(name = "action") PayloadDto action, @Json(name = "metrica_label") String metricaLabel) {
        return new ContentPhotosItemDto(id, photos, action, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentPhotosItemDto)) {
            return false;
        }
        ContentPhotosItemDto contentPhotosItemDto = (ContentPhotosItemDto) other;
        return jl40.l(this.id, contentPhotosItemDto.id) && jl40.l(this.photos, contentPhotosItemDto.photos) && jl40.l(this.action, contentPhotosItemDto.action) && jl40.l(this.metricaLabel, contentPhotosItemDto.metricaLabel);
    }

    public final PayloadDto getAction() {
        return this.action;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<PhotoInfoDto> getPhotos() {
        return this.photos;
    }

    public int hashCode() {
        int c = unr0.c(this.id.hashCode() * 31, 31, this.photos);
        PayloadDto payloadDto = this.action;
        int hashCode = (c + (payloadDto == null ? 0 : payloadDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        List<PhotoInfoDto> list = this.photos;
        PayloadDto payloadDto = this.action;
        String str2 = this.metricaLabel;
        StringBuilder r = xvz.r("ContentPhotosItemDto(id=", str, ", photos=", list, ", action=");
        r.append(payloadDto);
        r.append(", metricaLabel=");
        r.append(str2);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
