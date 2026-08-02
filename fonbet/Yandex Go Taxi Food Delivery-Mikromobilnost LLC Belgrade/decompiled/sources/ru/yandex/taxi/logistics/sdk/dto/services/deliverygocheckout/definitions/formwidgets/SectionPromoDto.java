package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SectionPromoDto;", "", "slot", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "metricaLabel", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;Ljava/lang/String;Ljava/lang/String;)V", "getSlot", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotDto;", "getBackgroundColor", "()Ljava/lang/String;", "getMetricaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SectionPromoDto {
    private final String backgroundColor;
    private final String metricaLabel;
    private final SlotDto slot;

    public SectionPromoDto(@Json(name = "slot") SlotDto slotDto, @Json(name = "background_color") String str, @Json(name = "metrica_label") String str2) {
        this.slot = slotDto;
        this.backgroundColor = str;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ SectionPromoDto copy$default(SectionPromoDto sectionPromoDto, SlotDto slotDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            slotDto = sectionPromoDto.slot;
        }
        if ((i & 2) != 0) {
            str = sectionPromoDto.backgroundColor;
        }
        if ((i & 4) != 0) {
            str2 = sectionPromoDto.metricaLabel;
        }
        return sectionPromoDto.copy(slotDto, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final SlotDto getSlot() {
        return this.slot;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SectionPromoDto copy(@Json(name = "slot") SlotDto slot, @Json(name = "background_color") String backgroundColor, @Json(name = "metrica_label") String metricaLabel) {
        return new SectionPromoDto(slot, backgroundColor, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionPromoDto)) {
            return false;
        }
        SectionPromoDto sectionPromoDto = (SectionPromoDto) other;
        return jl40.l(this.slot, sectionPromoDto.slot) && jl40.l(this.backgroundColor, sectionPromoDto.backgroundColor) && jl40.l(this.metricaLabel, sectionPromoDto.metricaLabel);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SlotDto getSlot() {
        return this.slot;
    }

    public int hashCode() {
        int b = unr0.b(this.slot.hashCode() * 31, 31, this.backgroundColor);
        String str = this.metricaLabel;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        SlotDto slotDto = this.slot;
        String str = this.backgroundColor;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("SectionPromoDto(slot=");
        sb.append(slotDto);
        sb.append(", backgroundColor=");
        sb.append(str);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
