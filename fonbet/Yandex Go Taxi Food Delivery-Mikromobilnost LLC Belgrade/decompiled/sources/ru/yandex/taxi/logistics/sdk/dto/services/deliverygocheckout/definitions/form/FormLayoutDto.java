package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0003\u0010\r\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010*\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011HÆ\u0003J\u0089\u0001\u0010+\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0010\b\u0003\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u000eHÖ\u0001J\t\u00100\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutDto;", "", "headerSection", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "sections", "", "bottomSection", "scrollTags", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ScrollTagDto;", "popups", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/PopupDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "spacingHeight", "", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V", "getHeaderSection", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "getSections", "()Ljava/util/List;", "getBottomSection", "getScrollTags", "getPopups", "getBackgroundColor", "()Ljava/lang/String;", "getSpacingHeight", "()I", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormLayoutDto {
    private final String backgroundColor;
    private final SectionDto bottomSection;
    private final SectionDto headerSection;
    private final Object meta;
    private final String metricaLabel;
    private final List<PopupDto> popups;
    private final List<ScrollTagDto> scrollTags;
    private final List<SectionDto> sections;
    private final int spacingHeight;

    public /* synthetic */ FormLayoutDto(SectionDto sectionDto, List list, SectionDto sectionDto2, List list2, List list3, String str, int i, String str2, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sectionDto, list, sectionDto2, list2, list3, str, (i2 & 64) != 0 ? 2 : i, str2, obj);
    }

    public static /* synthetic */ FormLayoutDto copy$default(FormLayoutDto formLayoutDto, SectionDto sectionDto, List list, SectionDto sectionDto2, List list2, List list3, String str, int i, String str2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            sectionDto = formLayoutDto.headerSection;
        }
        if ((i2 & 2) != 0) {
            list = formLayoutDto.sections;
        }
        if ((i2 & 4) != 0) {
            sectionDto2 = formLayoutDto.bottomSection;
        }
        if ((i2 & 8) != 0) {
            list2 = formLayoutDto.scrollTags;
        }
        if ((i2 & 16) != 0) {
            list3 = formLayoutDto.popups;
        }
        if ((i2 & 32) != 0) {
            str = formLayoutDto.backgroundColor;
        }
        if ((i2 & 64) != 0) {
            i = formLayoutDto.spacingHeight;
        }
        if ((i2 & 128) != 0) {
            str2 = formLayoutDto.metricaLabel;
        }
        if ((i2 & 256) != 0) {
            obj = formLayoutDto.meta;
        }
        String str3 = str2;
        Object obj3 = obj;
        String str4 = str;
        int i3 = i;
        List list4 = list3;
        SectionDto sectionDto3 = sectionDto2;
        return formLayoutDto.copy(sectionDto, list, sectionDto3, list2, list4, str4, i3, str3, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final SectionDto getHeaderSection() {
        return this.headerSection;
    }

    public final List<SectionDto> component2() {
        return this.sections;
    }

    /* renamed from: component3, reason: from getter */
    public final SectionDto getBottomSection() {
        return this.bottomSection;
    }

    public final List<ScrollTagDto> component4() {
        return this.scrollTags;
    }

    public final List<PopupDto> component5() {
        return this.popups;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSpacingHeight() {
        return this.spacingHeight;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final FormLayoutDto copy(@Json(name = "header_section") SectionDto headerSection, @Json(name = "sections") List<SectionDto> sections, @Json(name = "bottom_section") SectionDto bottomSection, @Json(name = "scroll_tags") List<ScrollTagDto> scrollTags, @Json(name = "popups") List<PopupDto> popups, @Json(name = "background_color") String backgroundColor, @Json(name = "spacing_height") int spacingHeight, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new FormLayoutDto(headerSection, sections, bottomSection, scrollTags, popups, backgroundColor, spacingHeight, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormLayoutDto)) {
            return false;
        }
        FormLayoutDto formLayoutDto = (FormLayoutDto) other;
        return jl40.l(this.headerSection, formLayoutDto.headerSection) && jl40.l(this.sections, formLayoutDto.sections) && jl40.l(this.bottomSection, formLayoutDto.bottomSection) && jl40.l(this.scrollTags, formLayoutDto.scrollTags) && jl40.l(this.popups, formLayoutDto.popups) && jl40.l(this.backgroundColor, formLayoutDto.backgroundColor) && this.spacingHeight == formLayoutDto.spacingHeight && jl40.l(this.metricaLabel, formLayoutDto.metricaLabel) && jl40.l(this.meta, formLayoutDto.meta);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final SectionDto getBottomSection() {
        return this.bottomSection;
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

    public final List<PopupDto> getPopups() {
        return this.popups;
    }

    public final List<ScrollTagDto> getScrollTags() {
        return this.scrollTags;
    }

    public final List<SectionDto> getSections() {
        return this.sections;
    }

    public final int getSpacingHeight() {
        return this.spacingHeight;
    }

    public int hashCode() {
        SectionDto sectionDto = this.headerSection;
        int c = unr0.c((sectionDto == null ? 0 : sectionDto.hashCode()) * 31, 31, this.sections);
        SectionDto sectionDto2 = this.bottomSection;
        int hashCode = (c + (sectionDto2 == null ? 0 : sectionDto2.hashCode())) * 31;
        List<ScrollTagDto> list = this.scrollTags;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PopupDto> list2 = this.popups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.backgroundColor;
        int b = oyr.b(this.spacingHeight, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.metricaLabel;
        int hashCode4 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        SectionDto sectionDto = this.headerSection;
        List<SectionDto> list = this.sections;
        SectionDto sectionDto2 = this.bottomSection;
        List<ScrollTagDto> list2 = this.scrollTags;
        List<PopupDto> list3 = this.popups;
        String str = this.backgroundColor;
        int i = this.spacingHeight;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("FormLayoutDto(headerSection=");
        sb.append(sectionDto);
        sb.append(", sections=");
        sb.append(list);
        sb.append(", bottomSection=");
        sb.append(sectionDto2);
        sb.append(", scrollTags=");
        sb.append(list2);
        sb.append(", popups=");
        oyr.D(", backgroundColor=", str, ", spacingHeight=", sb, list3);
        smw0.t(i, ", metricaLabel=", str2, ", meta=", sb);
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }

    public FormLayoutDto(@Json(name = "header_section") SectionDto sectionDto, @Json(name = "sections") List<SectionDto> list, @Json(name = "bottom_section") SectionDto sectionDto2, @Json(name = "scroll_tags") List<ScrollTagDto> list2, @Json(name = "popups") List<PopupDto> list3, @Json(name = "background_color") String str, @Json(name = "spacing_height") int i, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.headerSection = sectionDto;
        this.sections = list;
        this.bottomSection = sectionDto2;
        this.scrollTags = list2;
        this.popups = list3;
        this.backgroundColor = str;
        this.spacingHeight = i;
        this.metricaLabel = str2;
        this.meta = obj;
    }
}
