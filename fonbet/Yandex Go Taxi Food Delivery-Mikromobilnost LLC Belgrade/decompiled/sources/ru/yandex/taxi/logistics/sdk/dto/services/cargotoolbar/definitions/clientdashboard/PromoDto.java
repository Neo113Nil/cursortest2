package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.tse0;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u00109\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016HÆ\u0003J\u0097\u0001\u0010:\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0003\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016HÆ\u0001J\u0013\u0010;\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "subtitle", "textColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "subtitleColor", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "leadIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "trailElement", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;", "new", "", "showWhenSectionCollapsed", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;ZZLjava/lang/String;Ljava/lang/Object;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/StyledTextDto;", "getSubtitle", "getTextColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getSubtitleColor", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "getLeadIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getTrailElement", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailElementDto;", "getNew", "()Z", "getShowWhenSectionCollapsed", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PromoDto {
    private final ActionDto action;
    private final BackgroundDto background;
    private final IconDto leadIcon;
    private final Object meta;
    private final String metricaLabel;
    private final boolean new;
    private final boolean showWhenSectionCollapsed;
    private final StyledTextDto subtitle;
    private final ColorDto subtitleColor;
    private final ColorDto textColor;
    private final StyledTextDto title;
    private final TrailElementDto trailElement;

    public /* synthetic */ PromoDto(StyledTextDto styledTextDto, StyledTextDto styledTextDto2, ColorDto colorDto, ColorDto colorDto2, BackgroundDto backgroundDto, IconDto iconDto, ActionDto actionDto, TrailElementDto trailElementDto, boolean z, boolean z2, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(styledTextDto, styledTextDto2, colorDto, colorDto2, backgroundDto, iconDto, actionDto, trailElementDto, (i & 256) != 0 ? true : z, (i & 512) != 0 ? false : z2, str, obj);
    }

    public static /* synthetic */ PromoDto copy$default(PromoDto promoDto, StyledTextDto styledTextDto, StyledTextDto styledTextDto2, ColorDto colorDto, ColorDto colorDto2, BackgroundDto backgroundDto, IconDto iconDto, ActionDto actionDto, TrailElementDto trailElementDto, boolean z, boolean z2, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            styledTextDto = promoDto.title;
        }
        if ((i & 2) != 0) {
            styledTextDto2 = promoDto.subtitle;
        }
        if ((i & 4) != 0) {
            colorDto = promoDto.textColor;
        }
        if ((i & 8) != 0) {
            colorDto2 = promoDto.subtitleColor;
        }
        if ((i & 16) != 0) {
            backgroundDto = promoDto.background;
        }
        if ((i & 32) != 0) {
            iconDto = promoDto.leadIcon;
        }
        if ((i & 64) != 0) {
            actionDto = promoDto.action;
        }
        if ((i & 128) != 0) {
            trailElementDto = promoDto.trailElement;
        }
        if ((i & 256) != 0) {
            z = promoDto.new;
        }
        if ((i & 512) != 0) {
            z2 = promoDto.showWhenSectionCollapsed;
        }
        if ((i & 1024) != 0) {
            str = promoDto.metricaLabel;
        }
        if ((i & 2048) != 0) {
            obj = promoDto.meta;
        }
        String str2 = str;
        Object obj3 = obj;
        boolean z3 = z;
        boolean z4 = z2;
        ActionDto actionDto2 = actionDto;
        TrailElementDto trailElementDto2 = trailElementDto;
        BackgroundDto backgroundDto2 = backgroundDto;
        IconDto iconDto2 = iconDto;
        return promoDto.copy(styledTextDto, styledTextDto2, colorDto, colorDto2, backgroundDto2, iconDto2, actionDto2, trailElementDto2, z3, z4, str2, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final StyledTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final StyledTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorDto getTextColor() {
        return this.textColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ColorDto getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: component5, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component6, reason: from getter */
    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final TrailElementDto getTrailElement() {
        return this.trailElement;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getNew() {
        return this.new;
    }

    public final PromoDto copy(@Json(name = "title") StyledTextDto title, @Json(name = "subtitle") StyledTextDto subtitle, @Json(name = "text_color") ColorDto textColor, @Json(name = "subtitle_color") ColorDto subtitleColor, @Json(name = "background") BackgroundDto background, @Json(name = "lead_icon") IconDto leadIcon, @Json(name = "action") ActionDto action, @Json(name = "trail_element") TrailElementDto trailElement, @Json(name = "new") boolean r9, @Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new PromoDto(title, subtitle, textColor, subtitleColor, background, leadIcon, action, trailElement, r9, showWhenSectionCollapsed, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoDto)) {
            return false;
        }
        PromoDto promoDto = (PromoDto) other;
        return jl40.l(this.title, promoDto.title) && jl40.l(this.subtitle, promoDto.subtitle) && jl40.l(this.textColor, promoDto.textColor) && jl40.l(this.subtitleColor, promoDto.subtitleColor) && jl40.l(this.background, promoDto.background) && jl40.l(this.leadIcon, promoDto.leadIcon) && jl40.l(this.action, promoDto.action) && jl40.l(this.trailElement, promoDto.trailElement) && this.new == promoDto.new && this.showWhenSectionCollapsed == promoDto.showWhenSectionCollapsed && jl40.l(this.metricaLabel, promoDto.metricaLabel) && jl40.l(this.meta, promoDto.meta);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final IconDto getLeadIcon() {
        return this.leadIcon;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final boolean getNew() {
        return this.new;
    }

    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    public final StyledTextDto getSubtitle() {
        return this.subtitle;
    }

    public final ColorDto getSubtitleColor() {
        return this.subtitleColor;
    }

    public final ColorDto getTextColor() {
        return this.textColor;
    }

    public final StyledTextDto getTitle() {
        return this.title;
    }

    public final TrailElementDto getTrailElement() {
        return this.trailElement;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        StyledTextDto styledTextDto = this.subtitle;
        int hashCode2 = (hashCode + (styledTextDto == null ? 0 : styledTextDto.hashCode())) * 31;
        ColorDto colorDto = this.textColor;
        int hashCode3 = (hashCode2 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
        ColorDto colorDto2 = this.subtitleColor;
        int hashCode4 = (hashCode3 + (colorDto2 == null ? 0 : colorDto2.hashCode())) * 31;
        BackgroundDto backgroundDto = this.background;
        int hashCode5 = (hashCode4 + (backgroundDto == null ? 0 : backgroundDto.hashCode())) * 31;
        IconDto iconDto = this.leadIcon;
        int hashCode6 = (this.action.hashCode() + ((hashCode5 + (iconDto == null ? 0 : iconDto.hashCode())) * 31)) * 31;
        TrailElementDto trailElementDto = this.trailElement;
        int e = unr0.e(unr0.e((hashCode6 + (trailElementDto == null ? 0 : trailElementDto.hashCode())) * 31, 31, this.new), 31, this.showWhenSectionCollapsed);
        String str = this.metricaLabel;
        int hashCode7 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode7 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StyledTextDto styledTextDto = this.title;
        StyledTextDto styledTextDto2 = this.subtitle;
        ColorDto colorDto = this.textColor;
        ColorDto colorDto2 = this.subtitleColor;
        BackgroundDto backgroundDto = this.background;
        IconDto iconDto = this.leadIcon;
        ActionDto actionDto = this.action;
        TrailElementDto trailElementDto = this.trailElement;
        boolean z = this.new;
        boolean z2 = this.showWhenSectionCollapsed;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("PromoDto(title=");
        sb.append(styledTextDto);
        sb.append(", subtitle=");
        sb.append(styledTextDto2);
        sb.append(", textColor=");
        sb.append(colorDto);
        sb.append(", subtitleColor=");
        sb.append(colorDto2);
        sb.append(", background=");
        sb.append(backgroundDto);
        sb.append(", leadIcon=");
        sb.append(iconDto);
        sb.append(", action=");
        sb.append(actionDto);
        sb.append(", trailElement=");
        sb.append(trailElementDto);
        sb.append(", new=");
        nnm.v(", showWhenSectionCollapsed=", ", metricaLabel=", sb, z, z2);
        return tse0.l(sb, str, ", meta=", obj, Extension.C_BRAKE);
    }

    public PromoDto(@Json(name = "title") StyledTextDto styledTextDto, @Json(name = "subtitle") StyledTextDto styledTextDto2, @Json(name = "text_color") ColorDto colorDto, @Json(name = "subtitle_color") ColorDto colorDto2, @Json(name = "background") BackgroundDto backgroundDto, @Json(name = "lead_icon") IconDto iconDto, @Json(name = "action") ActionDto actionDto, @Json(name = "trail_element") TrailElementDto trailElementDto, @Json(name = "new") boolean z, @Json(name = "show_when_section_collapsed") boolean z2, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.title = styledTextDto;
        this.subtitle = styledTextDto2;
        this.textColor = colorDto;
        this.subtitleColor = colorDto2;
        this.background = backgroundDto;
        this.leadIcon = iconDto;
        this.action = actionDto;
        this.trailElement = trailElementDto;
        this.new = z;
        this.showWhenSectionCollapsed = z2;
        this.metricaLabel = str;
        this.meta = obj;
    }
}
