package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/FlexDto;", "", "showWhenSectionCollapsed", "", "contentUrl", "", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getShowWhenSectionCollapsed", "()Z", "getContentUrl", "()Ljava/lang/String;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlexDto {
    private final String contentUrl;
    private final Object meta;
    private final String metricaLabel;
    private final boolean showWhenSectionCollapsed;

    public FlexDto(@Json(name = "show_when_section_collapsed") boolean z, @Json(name = "content_url") String str, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.showWhenSectionCollapsed = z;
        this.contentUrl = str;
        this.metricaLabel = str2;
        this.meta = obj;
    }

    public static /* synthetic */ FlexDto copy$default(FlexDto flexDto, boolean z, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = flexDto.showWhenSectionCollapsed;
        }
        if ((i & 2) != 0) {
            str = flexDto.contentUrl;
        }
        if ((i & 4) != 0) {
            str2 = flexDto.metricaLabel;
        }
        if ((i & 8) != 0) {
            obj = flexDto.meta;
        }
        return flexDto.copy(z, str, str2, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final FlexDto copy(@Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "content_url") String contentUrl, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new FlexDto(showWhenSectionCollapsed, contentUrl, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexDto)) {
            return false;
        }
        FlexDto flexDto = (FlexDto) other;
        return this.showWhenSectionCollapsed == flexDto.showWhenSectionCollapsed && jl40.l(this.contentUrl, flexDto.contentUrl) && jl40.l(this.metricaLabel, flexDto.metricaLabel) && jl40.l(this.meta, flexDto.meta);
    }

    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.showWhenSectionCollapsed) * 31, 31, this.contentUrl);
        String str = this.metricaLabel;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.showWhenSectionCollapsed;
        String str = this.contentUrl;
        return tse0.l(ly3.v("FlexDto(showWhenSectionCollapsed=", ", contentUrl=", str, ", metricaLabel=", z), this.metricaLabel, ", meta=", this.meta, Extension.C_BRAKE);
    }

    public /* synthetic */ FlexDto(boolean z, String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, str2, obj);
    }
}
