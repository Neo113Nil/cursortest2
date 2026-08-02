package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JF\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDialogDto;", "", "title", "", "badgeText", "imageTag", "dialog", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;", "shimmering", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getBadgeText", "getImageTag", "getDialog", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;", "getShimmering", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDialogDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionDialogDto {
    private final String badgeText;
    private final MultiorderDialogDto dialog;
    private final String imageTag;
    private final Boolean shimmering;
    private final String title;

    public ActionDialogDto(@Json(name = "title") String str, @Json(name = "badge_text") String str2, @Json(name = "image_tag") String str3, @Json(name = "dialog") MultiorderDialogDto multiorderDialogDto, @Json(name = "shimmering") Boolean bool) {
        this.title = str;
        this.badgeText = str2;
        this.imageTag = str3;
        this.dialog = multiorderDialogDto;
        this.shimmering = bool;
    }

    public static /* synthetic */ ActionDialogDto copy$default(ActionDialogDto actionDialogDto, String str, String str2, String str3, MultiorderDialogDto multiorderDialogDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionDialogDto.title;
        }
        if ((i & 2) != 0) {
            str2 = actionDialogDto.badgeText;
        }
        if ((i & 4) != 0) {
            str3 = actionDialogDto.imageTag;
        }
        if ((i & 8) != 0) {
            multiorderDialogDto = actionDialogDto.dialog;
        }
        if ((i & 16) != 0) {
            bool = actionDialogDto.shimmering;
        }
        Boolean bool2 = bool;
        String str4 = str3;
        return actionDialogDto.copy(str, str2, str4, multiorderDialogDto, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component4, reason: from getter */
    public final MultiorderDialogDto getDialog() {
        return this.dialog;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getShimmering() {
        return this.shimmering;
    }

    public final ActionDialogDto copy(@Json(name = "title") String title, @Json(name = "badge_text") String badgeText, @Json(name = "image_tag") String imageTag, @Json(name = "dialog") MultiorderDialogDto dialog, @Json(name = "shimmering") Boolean shimmering) {
        return new ActionDialogDto(title, badgeText, imageTag, dialog, shimmering);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionDialogDto)) {
            return false;
        }
        ActionDialogDto actionDialogDto = (ActionDialogDto) other;
        return jl40.l(this.title, actionDialogDto.title) && jl40.l(this.badgeText, actionDialogDto.badgeText) && jl40.l(this.imageTag, actionDialogDto.imageTag) && jl40.l(this.dialog, actionDialogDto.dialog) && jl40.l(this.shimmering, actionDialogDto.shimmering);
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final MultiorderDialogDto getDialog() {
        return this.dialog;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final Boolean getShimmering() {
        return this.shimmering;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.badgeText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageTag;
        int hashCode3 = (this.dialog.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Boolean bool = this.shimmering;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.badgeText;
        String str3 = this.imageTag;
        MultiorderDialogDto multiorderDialogDto = this.dialog;
        Boolean bool = this.shimmering;
        StringBuilder v = b64.v("ActionDialogDto(title=", str, ", badgeText=", str2, ", imageTag=");
        v.append(str3);
        v.append(", dialog=");
        v.append(multiorderDialogDto);
        v.append(", shimmering=");
        return nzs.d(v, bool, Extension.C_BRAKE);
    }
}
