package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionEditOrderDto;", "", "title", "", "imageTag", "badgeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getImageTag", "getBadgeText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionEditOrderDto {
    private final String badgeText;
    private final String imageTag;
    private final String title;

    public ActionEditOrderDto(@Json(name = "title") String str, @Json(name = "image_tag") String str2, @Json(name = "badge_text") String str3) {
        this.title = str;
        this.imageTag = str2;
        this.badgeText = str3;
    }

    public static /* synthetic */ ActionEditOrderDto copy$default(ActionEditOrderDto actionEditOrderDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionEditOrderDto.title;
        }
        if ((i & 2) != 0) {
            str2 = actionEditOrderDto.imageTag;
        }
        if ((i & 4) != 0) {
            str3 = actionEditOrderDto.badgeText;
        }
        return actionEditOrderDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    public final ActionEditOrderDto copy(@Json(name = "title") String title, @Json(name = "image_tag") String imageTag, @Json(name = "badge_text") String badgeText) {
        return new ActionEditOrderDto(title, imageTag, badgeText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionEditOrderDto)) {
            return false;
        }
        ActionEditOrderDto actionEditOrderDto = (ActionEditOrderDto) other;
        return jl40.l(this.title, actionEditOrderDto.title) && jl40.l(this.imageTag, actionEditOrderDto.imageTag) && jl40.l(this.badgeText, actionEditOrderDto.badgeText);
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.imageTag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.imageTag;
        return oyr.t(b64.v("ActionEditOrderDto(title=", str, ", imageTag=", str2, ", badgeText="), this.badgeText, Extension.C_BRAKE);
    }
}
