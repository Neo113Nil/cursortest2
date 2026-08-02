package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SpacerDto;", "", "showWhenSectionCollapsed", "", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(ZLjava/lang/String;Ljava/lang/Object;)V", "getShowWhenSectionCollapsed", "()Z", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpacerDto {
    private final Object meta;
    private final String metricaLabel;
    private final boolean showWhenSectionCollapsed;

    public SpacerDto(@Json(name = "show_when_section_collapsed") boolean z, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.showWhenSectionCollapsed = z;
        this.metricaLabel = str;
        this.meta = obj;
    }

    public static /* synthetic */ SpacerDto copy$default(SpacerDto spacerDto, boolean z, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = spacerDto.showWhenSectionCollapsed;
        }
        if ((i & 2) != 0) {
            str = spacerDto.metricaLabel;
        }
        if ((i & 4) != 0) {
            obj = spacerDto.meta;
        }
        return spacerDto.copy(z, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final SpacerDto copy(@Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new SpacerDto(showWhenSectionCollapsed, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacerDto)) {
            return false;
        }
        SpacerDto spacerDto = (SpacerDto) other;
        return this.showWhenSectionCollapsed == spacerDto.showWhenSectionCollapsed && jl40.l(this.metricaLabel, spacerDto.metricaLabel) && jl40.l(this.meta, spacerDto.meta);
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
        int hashCode = Boolean.hashCode(this.showWhenSectionCollapsed) * 31;
        String str = this.metricaLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.showWhenSectionCollapsed;
        String str = this.metricaLabel;
        return x4e.h(ly3.v("SpacerDto(showWhenSectionCollapsed=", ", metricaLabel=", str, ", meta=", z), this.meta, Extension.C_BRAKE);
    }

    public /* synthetic */ SpacerDto(boolean z, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, obj);
    }
}
