package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenLinkToRouteDto;", "", "title", "", "imageTag", "dialog", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto;", "url", "shouldAuthorize", "", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto;Ljava/lang/String;ZLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getImageTag", "getDialog", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto;", "getUrl", "getShouldAuthorize", "()Z", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionOpenLinkToRouteDto {
    private final DialogDto dialog;
    private final String imageTag;
    private final String metricaLabel;
    private final boolean shouldAuthorize;
    private final String title;
    private final String url;

    public ActionOpenLinkToRouteDto(@Json(name = "title") String str, @Json(name = "image_tag") String str2, @Json(name = "dialog") DialogDto dialogDto, @Json(name = "url") String str3, @Json(name = "should_authorize") boolean z, @Json(name = "metrica_label") String str4) {
        this.title = str;
        this.imageTag = str2;
        this.dialog = dialogDto;
        this.url = str3;
        this.shouldAuthorize = z;
        this.metricaLabel = str4;
    }

    public static /* synthetic */ ActionOpenLinkToRouteDto copy$default(ActionOpenLinkToRouteDto actionOpenLinkToRouteDto, String str, String str2, DialogDto dialogDto, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionOpenLinkToRouteDto.title;
        }
        if ((i & 2) != 0) {
            str2 = actionOpenLinkToRouteDto.imageTag;
        }
        if ((i & 4) != 0) {
            dialogDto = actionOpenLinkToRouteDto.dialog;
        }
        if ((i & 8) != 0) {
            str3 = actionOpenLinkToRouteDto.url;
        }
        if ((i & 16) != 0) {
            z = actionOpenLinkToRouteDto.shouldAuthorize;
        }
        if ((i & 32) != 0) {
            str4 = actionOpenLinkToRouteDto.metricaLabel;
        }
        boolean z2 = z;
        String str5 = str4;
        return actionOpenLinkToRouteDto.copy(str, str2, dialogDto, str3, z2, str5);
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
    public final DialogDto getDialog() {
        return this.dialog;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldAuthorize() {
        return this.shouldAuthorize;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ActionOpenLinkToRouteDto copy(@Json(name = "title") String title, @Json(name = "image_tag") String imageTag, @Json(name = "dialog") DialogDto dialog, @Json(name = "url") String url, @Json(name = "should_authorize") boolean shouldAuthorize, @Json(name = "metrica_label") String metricaLabel) {
        return new ActionOpenLinkToRouteDto(title, imageTag, dialog, url, shouldAuthorize, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionOpenLinkToRouteDto)) {
            return false;
        }
        ActionOpenLinkToRouteDto actionOpenLinkToRouteDto = (ActionOpenLinkToRouteDto) other;
        return jl40.l(this.title, actionOpenLinkToRouteDto.title) && jl40.l(this.imageTag, actionOpenLinkToRouteDto.imageTag) && jl40.l(this.dialog, actionOpenLinkToRouteDto.dialog) && jl40.l(this.url, actionOpenLinkToRouteDto.url) && this.shouldAuthorize == actionOpenLinkToRouteDto.shouldAuthorize && jl40.l(this.metricaLabel, actionOpenLinkToRouteDto.metricaLabel);
    }

    public final DialogDto getDialog() {
        return this.dialog;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final boolean getShouldAuthorize() {
        return this.shouldAuthorize;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int b = unr0.b(this.title.hashCode() * 31, 31, this.imageTag);
        DialogDto dialogDto = this.dialog;
        int e = unr0.e(unr0.b((b + (dialogDto == null ? 0 : dialogDto.hashCode())) * 31, 31, this.url), 31, this.shouldAuthorize);
        String str = this.metricaLabel;
        return e + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.imageTag;
        DialogDto dialogDto = this.dialog;
        String str3 = this.url;
        boolean z = this.shouldAuthorize;
        String str4 = this.metricaLabel;
        StringBuilder v = b64.v("ActionOpenLinkToRouteDto(title=", str, ", imageTag=", str2, ", dialog=");
        v.append(dialogDto);
        v.append(", url=");
        v.append(str3);
        v.append(", shouldAuthorize=");
        return n.m(", metricaLabel=", str4, Extension.C_BRAKE, v, z);
    }

    public /* synthetic */ ActionOpenLinkToRouteDto(String str, String str2, DialogDto dialogDto, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dialogDto, str3, (i & 16) != 0 ? false : z, str4);
    }
}
