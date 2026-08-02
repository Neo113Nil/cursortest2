package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0012HÆ\u0003J\u0083\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0011\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0011\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderDto;", "", "leadText", "", "styledLeadText", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "leadSubtitle", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "trailIcon", "trailAction", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "trailElement", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;", "showWhenSectionCollapsed", "", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;ZLjava/lang/String;Ljava/lang/Object;)V", "getLeadText", "()Ljava/lang/String;", "getStyledLeadText", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "getLeadSubtitle", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getTrailIcon", "getTrailAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getTrailElement", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/HeaderTrailElementDto;", "getShowWhenSectionCollapsed", "()Z", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HeaderDto {
    private final IconDto leadIcon;
    private final StyledTextDto leadSubtitle;
    private final String leadText;
    private final Object meta;
    private final String metricaLabel;
    private final boolean showWhenSectionCollapsed;
    private final StyledTextDto styledLeadText;
    private final ActionDto trailAction;
    private final HeaderTrailElementDto trailElement;
    private final IconDto trailIcon;

    public /* synthetic */ HeaderDto(String str, StyledTextDto styledTextDto, StyledTextDto styledTextDto2, IconDto iconDto, IconDto iconDto2, ActionDto actionDto, HeaderTrailElementDto headerTrailElementDto, boolean z, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, styledTextDto, styledTextDto2, iconDto, iconDto2, actionDto, headerTrailElementDto, (i & 128) != 0 ? false : z, str2, obj);
    }

    public static /* synthetic */ HeaderDto copy$default(HeaderDto headerDto, String str, StyledTextDto styledTextDto, StyledTextDto styledTextDto2, IconDto iconDto, IconDto iconDto2, ActionDto actionDto, HeaderTrailElementDto headerTrailElementDto, boolean z, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = headerDto.leadText;
        }
        if ((i & 2) != 0) {
            styledTextDto = headerDto.styledLeadText;
        }
        if ((i & 4) != 0) {
            styledTextDto2 = headerDto.leadSubtitle;
        }
        if ((i & 8) != 0) {
            iconDto = headerDto.leadIcon;
        }
        if ((i & 16) != 0) {
            iconDto2 = headerDto.trailIcon;
        }
        if ((i & 32) != 0) {
            actionDto = headerDto.trailAction;
        }
        if ((i & 64) != 0) {
            headerTrailElementDto = headerDto.trailElement;
        }
        if ((i & 128) != 0) {
            z = headerDto.showWhenSectionCollapsed;
        }
        if ((i & 256) != 0) {
            str2 = headerDto.metricaLabel;
        }
        if ((i & 512) != 0) {
            obj = headerDto.meta;
        }
        String str3 = str2;
        Object obj3 = obj;
        HeaderTrailElementDto headerTrailElementDto2 = headerTrailElementDto;
        boolean z2 = z;
        IconDto iconDto3 = iconDto2;
        ActionDto actionDto2 = actionDto;
        return headerDto.copy(str, styledTextDto, styledTextDto2, iconDto, iconDto3, actionDto2, headerTrailElementDto2, z2, str3, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLeadText() {
        return this.leadText;
    }

    /* renamed from: component10, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final StyledTextDto getStyledLeadText() {
        return this.styledLeadText;
    }

    /* renamed from: component3, reason: from getter */
    public final StyledTextDto getLeadSubtitle() {
        return this.leadSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final IconDto getTrailIcon() {
        return this.trailIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final ActionDto getTrailAction() {
        return this.trailAction;
    }

    /* renamed from: component7, reason: from getter */
    public final HeaderTrailElementDto getTrailElement() {
        return this.trailElement;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final HeaderDto copy(@Json(name = "lead_text") String leadText, @Json(name = "styled_lead_text") StyledTextDto styledLeadText, @Json(name = "lead_subtitle") StyledTextDto leadSubtitle, @Json(name = "lead_icon") IconDto leadIcon, @Json(name = "trail_icon") IconDto trailIcon, @Json(name = "trail_action") ActionDto trailAction, @Json(name = "trail_element") HeaderTrailElementDto trailElement, @Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new HeaderDto(leadText, styledLeadText, leadSubtitle, leadIcon, trailIcon, trailAction, trailElement, showWhenSectionCollapsed, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderDto)) {
            return false;
        }
        HeaderDto headerDto = (HeaderDto) other;
        return jl40.l(this.leadText, headerDto.leadText) && jl40.l(this.styledLeadText, headerDto.styledLeadText) && jl40.l(this.leadSubtitle, headerDto.leadSubtitle) && jl40.l(this.leadIcon, headerDto.leadIcon) && jl40.l(this.trailIcon, headerDto.trailIcon) && jl40.l(this.trailAction, headerDto.trailAction) && jl40.l(this.trailElement, headerDto.trailElement) && this.showWhenSectionCollapsed == headerDto.showWhenSectionCollapsed && jl40.l(this.metricaLabel, headerDto.metricaLabel) && jl40.l(this.meta, headerDto.meta);
    }

    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    public final StyledTextDto getLeadSubtitle() {
        return this.leadSubtitle;
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

    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public final StyledTextDto getStyledLeadText() {
        return this.styledLeadText;
    }

    public final ActionDto getTrailAction() {
        return this.trailAction;
    }

    public final HeaderTrailElementDto getTrailElement() {
        return this.trailElement;
    }

    public final IconDto getTrailIcon() {
        return this.trailIcon;
    }

    public int hashCode() {
        int hashCode = this.leadText.hashCode() * 31;
        StyledTextDto styledTextDto = this.styledLeadText;
        int hashCode2 = (hashCode + (styledTextDto == null ? 0 : styledTextDto.hashCode())) * 31;
        StyledTextDto styledTextDto2 = this.leadSubtitle;
        int hashCode3 = (hashCode2 + (styledTextDto2 == null ? 0 : styledTextDto2.hashCode())) * 31;
        IconDto iconDto = this.leadIcon;
        int hashCode4 = (hashCode3 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        IconDto iconDto2 = this.trailIcon;
        int hashCode5 = (hashCode4 + (iconDto2 == null ? 0 : iconDto2.hashCode())) * 31;
        ActionDto actionDto = this.trailAction;
        int hashCode6 = (hashCode5 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
        HeaderTrailElementDto headerTrailElementDto = this.trailElement;
        int e = unr0.e((hashCode6 + (headerTrailElementDto == null ? 0 : headerTrailElementDto.hashCode())) * 31, 31, this.showWhenSectionCollapsed);
        String str = this.metricaLabel;
        int hashCode7 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode7 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.leadText;
        StyledTextDto styledTextDto = this.styledLeadText;
        StyledTextDto styledTextDto2 = this.leadSubtitle;
        IconDto iconDto = this.leadIcon;
        IconDto iconDto2 = this.trailIcon;
        ActionDto actionDto = this.trailAction;
        HeaderTrailElementDto headerTrailElementDto = this.trailElement;
        boolean z = this.showWhenSectionCollapsed;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("HeaderDto(leadText=");
        sb.append(str);
        sb.append(", styledLeadText=");
        sb.append(styledTextDto);
        sb.append(", leadSubtitle=");
        sb.append(styledTextDto2);
        sb.append(", leadIcon=");
        sb.append(iconDto);
        sb.append(", trailIcon=");
        sb.append(iconDto2);
        sb.append(", trailAction=");
        sb.append(actionDto);
        sb.append(", trailElement=");
        sb.append(headerTrailElementDto);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(z);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str2, ", meta=", obj, Extension.C_BRAKE);
    }

    public HeaderDto(@Json(name = "lead_text") String str, @Json(name = "styled_lead_text") StyledTextDto styledTextDto, @Json(name = "lead_subtitle") StyledTextDto styledTextDto2, @Json(name = "lead_icon") IconDto iconDto, @Json(name = "trail_icon") IconDto iconDto2, @Json(name = "trail_action") ActionDto actionDto, @Json(name = "trail_element") HeaderTrailElementDto headerTrailElementDto, @Json(name = "show_when_section_collapsed") boolean z, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.leadText = str;
        this.styledLeadText = styledTextDto;
        this.leadSubtitle = styledTextDto2;
        this.leadIcon = iconDto;
        this.trailIcon = iconDto2;
        this.trailAction = actionDto;
        this.trailElement = headerTrailElementDto;
        this.showWhenSectionCollapsed = z;
        this.metricaLabel = str2;
        this.meta = obj;
    }
}
