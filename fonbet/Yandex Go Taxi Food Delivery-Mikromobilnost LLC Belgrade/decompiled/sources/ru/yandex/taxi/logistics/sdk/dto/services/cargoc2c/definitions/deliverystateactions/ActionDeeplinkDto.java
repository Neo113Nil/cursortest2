package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDeeplinkDto;", "", Constants.DEEPLINK, "", "title", "imageTag", "badgeText", "analyticsName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "getTitle", "getImageTag", "getBadgeText", "getAnalyticsName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionDeeplinkDto {
    private final String analyticsName;
    private final String badgeText;
    private final String deeplink;
    private final String imageTag;
    private final String title;

    public ActionDeeplinkDto(@Json(name = "deeplink") String str, @Json(name = "title") String str2, @Json(name = "image_tag") String str3, @Json(name = "badge_text") String str4, @Json(name = "analytics_name") String str5) {
        this.deeplink = str;
        this.title = str2;
        this.imageTag = str3;
        this.badgeText = str4;
        this.analyticsName = str5;
    }

    public static /* synthetic */ ActionDeeplinkDto copy$default(ActionDeeplinkDto actionDeeplinkDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionDeeplinkDto.deeplink;
        }
        if ((i & 2) != 0) {
            str2 = actionDeeplinkDto.title;
        }
        if ((i & 4) != 0) {
            str3 = actionDeeplinkDto.imageTag;
        }
        if ((i & 8) != 0) {
            str4 = actionDeeplinkDto.badgeText;
        }
        if ((i & 16) != 0) {
            str5 = actionDeeplinkDto.analyticsName;
        }
        String str6 = str5;
        String str7 = str3;
        return actionDeeplinkDto.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final ActionDeeplinkDto copy(@Json(name = "deeplink") String deeplink, @Json(name = "title") String title, @Json(name = "image_tag") String imageTag, @Json(name = "badge_text") String badgeText, @Json(name = "analytics_name") String analyticsName) {
        return new ActionDeeplinkDto(deeplink, title, imageTag, badgeText, analyticsName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionDeeplinkDto)) {
            return false;
        }
        ActionDeeplinkDto actionDeeplinkDto = (ActionDeeplinkDto) other;
        return jl40.l(this.deeplink, actionDeeplinkDto.deeplink) && jl40.l(this.title, actionDeeplinkDto.title) && jl40.l(this.imageTag, actionDeeplinkDto.imageTag) && jl40.l(this.badgeText, actionDeeplinkDto.badgeText) && jl40.l(this.analyticsName, actionDeeplinkDto.analyticsName);
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.deeplink.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageTag;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.analyticsName;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.deeplink;
        String str2 = this.title;
        String str3 = this.imageTag;
        String str4 = this.badgeText;
        String str5 = this.analyticsName;
        StringBuilder v = b64.v("ActionDeeplinkDto(deeplink=", str, ", title=", str2, ", imageTag=");
        g8e.D(v, str3, ", badgeText=", str4, ", analyticsName=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}
