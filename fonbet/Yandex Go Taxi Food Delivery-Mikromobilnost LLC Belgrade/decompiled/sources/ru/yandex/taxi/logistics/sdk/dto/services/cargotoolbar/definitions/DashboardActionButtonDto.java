package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JR\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/DashboardActionButtonDto;", "", "title", "", "subtitle", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", BackendConfig.Restrictions.ENABLED, "", "highlighted", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHighlighted", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/DashboardActionButtonDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DashboardActionButtonDto {
    private final ActionDto action;
    private final Boolean enabled;
    private final Boolean highlighted;
    private final String metricaLabel;
    private final String subtitle;
    private final String title;

    public DashboardActionButtonDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "action") ActionDto actionDto, @Json(name = "enabled") Boolean bool, @Json(name = "highlighted") Boolean bool2, @Json(name = "metrica_label") String str3) {
        this.title = str;
        this.subtitle = str2;
        this.action = actionDto;
        this.enabled = bool;
        this.highlighted = bool2;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ DashboardActionButtonDto copy$default(DashboardActionButtonDto dashboardActionButtonDto, String str, String str2, ActionDto actionDto, Boolean bool, Boolean bool2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardActionButtonDto.title;
        }
        if ((i & 2) != 0) {
            str2 = dashboardActionButtonDto.subtitle;
        }
        if ((i & 4) != 0) {
            actionDto = dashboardActionButtonDto.action;
        }
        if ((i & 8) != 0) {
            bool = dashboardActionButtonDto.enabled;
        }
        if ((i & 16) != 0) {
            bool2 = dashboardActionButtonDto.highlighted;
        }
        if ((i & 32) != 0) {
            str3 = dashboardActionButtonDto.metricaLabel;
        }
        Boolean bool3 = bool2;
        String str4 = str3;
        return dashboardActionButtonDto.copy(str, str2, actionDto, bool, bool3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHighlighted() {
        return this.highlighted;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final DashboardActionButtonDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "action") ActionDto action, @Json(name = "enabled") Boolean enabled, @Json(name = "highlighted") Boolean highlighted, @Json(name = "metrica_label") String metricaLabel) {
        return new DashboardActionButtonDto(title, subtitle, action, enabled, highlighted, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardActionButtonDto)) {
            return false;
        }
        DashboardActionButtonDto dashboardActionButtonDto = (DashboardActionButtonDto) other;
        return jl40.l(this.title, dashboardActionButtonDto.title) && jl40.l(this.subtitle, dashboardActionButtonDto.subtitle) && jl40.l(this.action, dashboardActionButtonDto.action) && jl40.l(this.enabled, dashboardActionButtonDto.enabled) && jl40.l(this.highlighted, dashboardActionButtonDto.highlighted) && jl40.l(this.metricaLabel, dashboardActionButtonDto.metricaLabel);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getHighlighted() {
        return this.highlighted;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (this.action.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.highlighted;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.metricaLabel;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ActionDto actionDto = this.action;
        Boolean bool = this.enabled;
        Boolean bool2 = this.highlighted;
        String str3 = this.metricaLabel;
        StringBuilder v = b64.v("DashboardActionButtonDto(title=", str, ", subtitle=", str2, ", action=");
        v.append(actionDto);
        v.append(", enabled=");
        v.append(bool);
        v.append(", highlighted=");
        v.append(bool2);
        v.append(", metricaLabel=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
