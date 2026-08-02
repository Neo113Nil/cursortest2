package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/BottomSectionDto;", "", "imageTag", "", "title", "subtitle", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;)V", "getImageTag", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BottomSectionDto {
    private final ActionDto action;
    private final String imageTag;
    private final String subtitle;
    private final String title;

    public BottomSectionDto(@Json(name = "image_tag") String str, @Json(name = "title") String str2, @Json(name = "subtitle") String str3, @Json(name = "action") ActionDto actionDto) {
        this.imageTag = str;
        this.title = str2;
        this.subtitle = str3;
        this.action = actionDto;
    }

    public static /* synthetic */ BottomSectionDto copy$default(BottomSectionDto bottomSectionDto, String str, String str2, String str3, ActionDto actionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomSectionDto.imageTag;
        }
        if ((i & 2) != 0) {
            str2 = bottomSectionDto.title;
        }
        if ((i & 4) != 0) {
            str3 = bottomSectionDto.subtitle;
        }
        if ((i & 8) != 0) {
            actionDto = bottomSectionDto.action;
        }
        return bottomSectionDto.copy(str, str2, str3, actionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    public final BottomSectionDto copy(@Json(name = "image_tag") String imageTag, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "action") ActionDto action) {
        return new BottomSectionDto(imageTag, title, subtitle, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSectionDto)) {
            return false;
        }
        BottomSectionDto bottomSectionDto = (BottomSectionDto) other;
        return jl40.l(this.imageTag, bottomSectionDto.imageTag) && jl40.l(this.title, bottomSectionDto.title) && jl40.l(this.subtitle, bottomSectionDto.subtitle) && jl40.l(this.action, bottomSectionDto.action);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.imageTag;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.subtitle;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionDto actionDto = this.action;
        return hashCode + (actionDto != null ? actionDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageTag;
        String str2 = this.title;
        String str3 = this.subtitle;
        ActionDto actionDto = this.action;
        StringBuilder v = b64.v("BottomSectionDto(imageTag=", str, ", title=", str2, ", subtitle=");
        v.append(str3);
        v.append(", action=");
        v.append(actionDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
