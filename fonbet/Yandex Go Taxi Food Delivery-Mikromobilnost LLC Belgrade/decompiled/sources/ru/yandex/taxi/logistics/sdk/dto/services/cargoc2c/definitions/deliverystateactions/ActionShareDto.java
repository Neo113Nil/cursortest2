package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShareDto;", "", "title", "", "sharingUrl", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSharingUrl", "getMetricaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionShareDto {
    private final String metricaLabel;
    private final String sharingUrl;
    private final String title;

    public ActionShareDto(@Json(name = "title") String str, @Json(name = "sharing_url") String str2, @Json(name = "metrica_label") String str3) {
        this.title = str;
        this.sharingUrl = str2;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ ActionShareDto copy$default(ActionShareDto actionShareDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionShareDto.title;
        }
        if ((i & 2) != 0) {
            str2 = actionShareDto.sharingUrl;
        }
        if ((i & 4) != 0) {
            str3 = actionShareDto.metricaLabel;
        }
        return actionShareDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSharingUrl() {
        return this.sharingUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ActionShareDto copy(@Json(name = "title") String title, @Json(name = "sharing_url") String sharingUrl, @Json(name = "metrica_label") String metricaLabel) {
        return new ActionShareDto(title, sharingUrl, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionShareDto)) {
            return false;
        }
        ActionShareDto actionShareDto = (ActionShareDto) other;
        return jl40.l(this.title, actionShareDto.title) && jl40.l(this.sharingUrl, actionShareDto.sharingUrl) && jl40.l(this.metricaLabel, actionShareDto.metricaLabel);
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getSharingUrl() {
        return this.sharingUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.title.hashCode() * 31, 31, this.sharingUrl);
        String str = this.metricaLabel;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.sharingUrl;
        return oyr.t(b64.v("ActionShareDto(title=", str, ", sharingUrl=", str2, ", metricaLabel="), this.metricaLabel, Extension.C_BRAKE);
    }
}
