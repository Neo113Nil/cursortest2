package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.StickyWidgetDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.SectionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0010\b\u0003\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentResponseDto;", "", "sections", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto;", "headerSection", "stickyWidgets", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetDto;", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "metricaLabel", "", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)V", "getSections", "()Ljava/util/List;", "getHeaderSection", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto;", "getStickyWidgets", "getMeta", "()Ljava/lang/Object;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DashboardContentResponseDto {
    private final SectionDto headerSection;
    private final Object meta;
    private final String metricaLabel;
    private final List<SectionDto> sections;
    private final List<StickyWidgetDto> stickyWidgets;

    public DashboardContentResponseDto(@Json(name = "sections") List<SectionDto> list, @Json(name = "header_section") SectionDto sectionDto, @Json(name = "sticky_widgets") List<StickyWidgetDto> list2, @Json(name = "meta") Object obj, @Json(name = "metrica_label") String str) {
        this.sections = list;
        this.headerSection = sectionDto;
        this.stickyWidgets = list2;
        this.meta = obj;
        this.metricaLabel = str;
    }

    public static /* synthetic */ DashboardContentResponseDto copy$default(DashboardContentResponseDto dashboardContentResponseDto, List list, SectionDto sectionDto, List list2, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = dashboardContentResponseDto.sections;
        }
        if ((i & 2) != 0) {
            sectionDto = dashboardContentResponseDto.headerSection;
        }
        if ((i & 4) != 0) {
            list2 = dashboardContentResponseDto.stickyWidgets;
        }
        if ((i & 8) != 0) {
            obj = dashboardContentResponseDto.meta;
        }
        if ((i & 16) != 0) {
            str = dashboardContentResponseDto.metricaLabel;
        }
        String str2 = str;
        List list3 = list2;
        return dashboardContentResponseDto.copy(list, sectionDto, list3, obj, str2);
    }

    public final List<SectionDto> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final SectionDto getHeaderSection() {
        return this.headerSection;
    }

    public final List<StickyWidgetDto> component3() {
        return this.stickyWidgets;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final DashboardContentResponseDto copy(@Json(name = "sections") List<SectionDto> sections, @Json(name = "header_section") SectionDto headerSection, @Json(name = "sticky_widgets") List<StickyWidgetDto> stickyWidgets, @Json(name = "meta") Object meta, @Json(name = "metrica_label") String metricaLabel) {
        return new DashboardContentResponseDto(sections, headerSection, stickyWidgets, meta, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardContentResponseDto)) {
            return false;
        }
        DashboardContentResponseDto dashboardContentResponseDto = (DashboardContentResponseDto) other;
        return jl40.l(this.sections, dashboardContentResponseDto.sections) && jl40.l(this.headerSection, dashboardContentResponseDto.headerSection) && jl40.l(this.stickyWidgets, dashboardContentResponseDto.stickyWidgets) && jl40.l(this.meta, dashboardContentResponseDto.meta) && jl40.l(this.metricaLabel, dashboardContentResponseDto.metricaLabel);
    }

    public final SectionDto getHeaderSection() {
        return this.headerSection;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<SectionDto> getSections() {
        return this.sections;
    }

    public final List<StickyWidgetDto> getStickyWidgets() {
        return this.stickyWidgets;
    }

    public int hashCode() {
        int hashCode = this.sections.hashCode() * 31;
        SectionDto sectionDto = this.headerSection;
        int hashCode2 = (hashCode + (sectionDto == null ? 0 : sectionDto.hashCode())) * 31;
        List<StickyWidgetDto> list = this.stickyWidgets;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.meta;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<SectionDto> list = this.sections;
        SectionDto sectionDto = this.headerSection;
        List<StickyWidgetDto> list2 = this.stickyWidgets;
        Object obj = this.meta;
        String str = this.metricaLabel;
        StringBuilder sb = new StringBuilder("DashboardContentResponseDto(sections=");
        sb.append(list);
        sb.append(", headerSection=");
        sb.append(sectionDto);
        sb.append(", stickyWidgets=");
        sb.append(list2);
        sb.append(", meta=");
        sb.append(obj);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
