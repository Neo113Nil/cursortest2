package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00066"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MainHeaderV2Dto;", "", "leadText", "", "styledLeadText", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "subtitle", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderSubtitleDto;", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "trailElement", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;", "showWhenSectionCollapsed", "", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "middleElements", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MiddleElementDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderSubtitleDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;ZLjava/lang/String;Ljava/lang/Object;Ljava/util/List;)V", "getLeadText", "()Ljava/lang/String;", "getStyledLeadText", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "getSubtitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderSubtitleDto;", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getTrailElement", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;", "getShowWhenSectionCollapsed", "()Z", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "getMiddleElements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MainHeaderV2Dto {
    private final IconDto leadIcon;
    private final String leadText;
    private final Object meta;
    private final String metricaLabel;
    private final List<MiddleElementDto> middleElements;
    private final boolean showWhenSectionCollapsed;
    private final StyledTextDto styledLeadText;
    private final HeaderSubtitleDto subtitle;
    private final TrailElementDto trailElement;

    public /* synthetic */ MainHeaderV2Dto(String str, StyledTextDto styledTextDto, HeaderSubtitleDto headerSubtitleDto, IconDto iconDto, TrailElementDto trailElementDto, boolean z, String str2, Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, styledTextDto, headerSubtitleDto, iconDto, trailElementDto, (i & 32) != 0 ? false : z, str2, obj, list);
    }

    public static /* synthetic */ MainHeaderV2Dto copy$default(MainHeaderV2Dto mainHeaderV2Dto, String str, StyledTextDto styledTextDto, HeaderSubtitleDto headerSubtitleDto, IconDto iconDto, TrailElementDto trailElementDto, boolean z, String str2, Object obj, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = mainHeaderV2Dto.leadText;
        }
        if ((i & 2) != 0) {
            styledTextDto = mainHeaderV2Dto.styledLeadText;
        }
        if ((i & 4) != 0) {
            headerSubtitleDto = mainHeaderV2Dto.subtitle;
        }
        if ((i & 8) != 0) {
            iconDto = mainHeaderV2Dto.leadIcon;
        }
        if ((i & 16) != 0) {
            trailElementDto = mainHeaderV2Dto.trailElement;
        }
        if ((i & 32) != 0) {
            z = mainHeaderV2Dto.showWhenSectionCollapsed;
        }
        if ((i & 64) != 0) {
            str2 = mainHeaderV2Dto.metricaLabel;
        }
        if ((i & 128) != 0) {
            obj = mainHeaderV2Dto.meta;
        }
        if ((i & 256) != 0) {
            list = mainHeaderV2Dto.middleElements;
        }
        Object obj3 = obj;
        List list2 = list;
        boolean z2 = z;
        String str3 = str2;
        TrailElementDto trailElementDto2 = trailElementDto;
        HeaderSubtitleDto headerSubtitleDto2 = headerSubtitleDto;
        return mainHeaderV2Dto.copy(str, styledTextDto, headerSubtitleDto2, iconDto, trailElementDto2, z2, str3, obj3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeadText() {
        return this.leadText;
    }

    /* renamed from: component2, reason: from getter */
    public final StyledTextDto getStyledLeadText() {
        return this.styledLeadText;
    }

    /* renamed from: component3, reason: from getter */
    public final HeaderSubtitleDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final TrailElementDto getTrailElement() {
        return this.trailElement;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final List<MiddleElementDto> component9() {
        return this.middleElements;
    }

    public final MainHeaderV2Dto copy(@Json(name = "lead_text") String leadText, @Json(name = "styled_lead_text") StyledTextDto styledLeadText, @Json(name = "subtitle") HeaderSubtitleDto subtitle, @Json(name = "lead_icon") IconDto leadIcon, @Json(name = "trail_element") TrailElementDto trailElement, @Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta, @Json(name = "middle_elements") List<? extends MiddleElementDto> middleElements) {
        return new MainHeaderV2Dto(leadText, styledLeadText, subtitle, leadIcon, trailElement, showWhenSectionCollapsed, metricaLabel, meta, middleElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainHeaderV2Dto)) {
            return false;
        }
        MainHeaderV2Dto mainHeaderV2Dto = (MainHeaderV2Dto) other;
        return jl40.l(this.leadText, mainHeaderV2Dto.leadText) && jl40.l(this.styledLeadText, mainHeaderV2Dto.styledLeadText) && jl40.l(this.subtitle, mainHeaderV2Dto.subtitle) && jl40.l(this.leadIcon, mainHeaderV2Dto.leadIcon) && jl40.l(this.trailElement, mainHeaderV2Dto.trailElement) && this.showWhenSectionCollapsed == mainHeaderV2Dto.showWhenSectionCollapsed && jl40.l(this.metricaLabel, mainHeaderV2Dto.metricaLabel) && jl40.l(this.meta, mainHeaderV2Dto.meta) && jl40.l(this.middleElements, mainHeaderV2Dto.middleElements);
    }

    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    public final String getLeadText() {
        return this.leadText;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<MiddleElementDto> getMiddleElements() {
        return this.middleElements;
    }

    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public final StyledTextDto getStyledLeadText() {
        return this.styledLeadText;
    }

    public final HeaderSubtitleDto getSubtitle() {
        return this.subtitle;
    }

    public final TrailElementDto getTrailElement() {
        return this.trailElement;
    }

    public int hashCode() {
        int hashCode = this.leadText.hashCode() * 31;
        StyledTextDto styledTextDto = this.styledLeadText;
        int hashCode2 = (hashCode + (styledTextDto == null ? 0 : styledTextDto.hashCode())) * 31;
        HeaderSubtitleDto headerSubtitleDto = this.subtitle;
        int hashCode3 = (hashCode2 + (headerSubtitleDto == null ? 0 : headerSubtitleDto.hashCode())) * 31;
        IconDto iconDto = this.leadIcon;
        int hashCode4 = (hashCode3 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        TrailElementDto trailElementDto = this.trailElement;
        int e = unr0.e((hashCode4 + (trailElementDto == null ? 0 : trailElementDto.hashCode())) * 31, 31, this.showWhenSectionCollapsed);
        String str = this.metricaLabel;
        int hashCode5 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        List<MiddleElementDto> list = this.middleElements;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.leadText;
        StyledTextDto styledTextDto = this.styledLeadText;
        HeaderSubtitleDto headerSubtitleDto = this.subtitle;
        IconDto iconDto = this.leadIcon;
        TrailElementDto trailElementDto = this.trailElement;
        boolean z = this.showWhenSectionCollapsed;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        List<MiddleElementDto> list = this.middleElements;
        StringBuilder sb = new StringBuilder("MainHeaderV2Dto(leadText=");
        sb.append(str);
        sb.append(", styledLeadText=");
        sb.append(styledTextDto);
        sb.append(", subtitle=");
        sb.append(headerSubtitleDto);
        sb.append(", leadIcon=");
        sb.append(iconDto);
        sb.append(", trailElement=");
        sb.append(trailElementDto);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(z);
        sb.append(", metricaLabel=");
        sb.append(str2);
        sb.append(", meta=");
        sb.append(obj);
        sb.append(", middleElements=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainHeaderV2Dto(@Json(name = "lead_text") String str, @Json(name = "styled_lead_text") StyledTextDto styledTextDto, @Json(name = "subtitle") HeaderSubtitleDto headerSubtitleDto, @Json(name = "lead_icon") IconDto iconDto, @Json(name = "trail_element") TrailElementDto trailElementDto, @Json(name = "show_when_section_collapsed") boolean z, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj, @Json(name = "middle_elements") List<? extends MiddleElementDto> list) {
        this.leadText = str;
        this.styledLeadText = styledTextDto;
        this.subtitle = headerSubtitleDto;
        this.leadIcon = iconDto;
        this.trailElement = trailElementDto;
        this.showWhenSectionCollapsed = z;
        this.metricaLabel = str2;
        this.meta = obj;
        this.middleElements = list;
    }
}
