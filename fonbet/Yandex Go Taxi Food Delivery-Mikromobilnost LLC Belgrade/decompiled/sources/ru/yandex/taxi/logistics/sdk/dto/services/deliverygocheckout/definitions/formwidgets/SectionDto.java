package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionDto;", "", "widgets", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "promo", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionPromoDto;", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionPromoDto;)V", "getWidgets", "()Ljava/util/List;", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "getPromo", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionPromoDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SectionDto {
    private final BackgroundDto background;
    private final SectionPromoDto promo;
    private final List<WidgetDto> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public SectionDto(@Json(name = "widgets") List<? extends WidgetDto> list, @Json(name = "background") BackgroundDto backgroundDto, @Json(name = "promo") SectionPromoDto sectionPromoDto) {
        this.widgets = list;
        this.background = backgroundDto;
        this.promo = sectionPromoDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionDto copy$default(SectionDto sectionDto, List list, BackgroundDto backgroundDto, SectionPromoDto sectionPromoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sectionDto.widgets;
        }
        if ((i & 2) != 0) {
            backgroundDto = sectionDto.background;
        }
        if ((i & 4) != 0) {
            sectionPromoDto = sectionDto.promo;
        }
        return sectionDto.copy(list, backgroundDto, sectionPromoDto);
    }

    public final List<WidgetDto> component1() {
        return this.widgets;
    }

    /* renamed from: component2, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component3, reason: from getter */
    public final SectionPromoDto getPromo() {
        return this.promo;
    }

    public final SectionDto copy(@Json(name = "widgets") List<? extends WidgetDto> widgets, @Json(name = "background") BackgroundDto background, @Json(name = "promo") SectionPromoDto promo) {
        return new SectionDto(widgets, background, promo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionDto)) {
            return false;
        }
        SectionDto sectionDto = (SectionDto) other;
        return jl40.l(this.widgets, sectionDto.widgets) && jl40.l(this.background, sectionDto.background) && jl40.l(this.promo, sectionDto.promo);
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final SectionPromoDto getPromo() {
        return this.promo;
    }

    public final List<WidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = this.widgets.hashCode() * 31;
        BackgroundDto backgroundDto = this.background;
        int hashCode2 = (hashCode + (backgroundDto == null ? 0 : backgroundDto.hashCode())) * 31;
        SectionPromoDto sectionPromoDto = this.promo;
        return hashCode2 + (sectionPromoDto != null ? sectionPromoDto.hashCode() : 0);
    }

    public String toString() {
        return "SectionDto(widgets=" + this.widgets + ", background=" + this.background + ", promo=" + this.promo + Extension.C_BRAKE;
    }
}
