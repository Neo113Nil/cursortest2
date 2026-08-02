package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/PopupDto;", "", "id", "", "relatedPresentationId", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/PopupTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/PopupTypeDto;)V", "getId", "()Ljava/lang/String;", "getRelatedPresentationId", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/PopupTypeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PopupDto {
    private final String id;
    private final String relatedPresentationId;
    private final PopupTypeDto type;

    public PopupDto(@Json(name = "id") String str, @Json(name = "related_presentation_id") String str2, @Json(name = "type") PopupTypeDto popupTypeDto) {
        this.id = str;
        this.relatedPresentationId = str2;
        this.type = popupTypeDto;
    }

    public static /* synthetic */ PopupDto copy$default(PopupDto popupDto, String str, String str2, PopupTypeDto popupTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupDto.id;
        }
        if ((i & 2) != 0) {
            str2 = popupDto.relatedPresentationId;
        }
        if ((i & 4) != 0) {
            popupTypeDto = popupDto.type;
        }
        return popupDto.copy(str, str2, popupTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRelatedPresentationId() {
        return this.relatedPresentationId;
    }

    /* renamed from: component3, reason: from getter */
    public final PopupTypeDto getType() {
        return this.type;
    }

    public final PopupDto copy(@Json(name = "id") String id, @Json(name = "related_presentation_id") String relatedPresentationId, @Json(name = "type") PopupTypeDto type) {
        return new PopupDto(id, relatedPresentationId, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupDto)) {
            return false;
        }
        PopupDto popupDto = (PopupDto) other;
        return jl40.l(this.id, popupDto.id) && jl40.l(this.relatedPresentationId, popupDto.relatedPresentationId) && jl40.l(this.type, popupDto.type);
    }

    public final String getId() {
        return this.id;
    }

    public final String getRelatedPresentationId() {
        return this.relatedPresentationId;
    }

    public final PopupTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + unr0.b(this.id.hashCode() * 31, 31, this.relatedPresentationId);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.relatedPresentationId;
        PopupTypeDto popupTypeDto = this.type;
        StringBuilder v = b64.v("PopupDto(id=", str, ", relatedPresentationId=", str2, ", type=");
        v.append(popupTypeDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
