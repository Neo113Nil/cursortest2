package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSlotDto;", "", "id", "", "slot", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSlot", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "getMetricaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentSlotDto {
    private final String id;
    private final String metricaLabel;
    private final SlotDto slot;

    public ContentSlotDto(@Json(name = "id") String str, @Json(name = "slot") SlotDto slotDto, @Json(name = "metrica_label") String str2) {
        this.id = str;
        this.slot = slotDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ContentSlotDto copy$default(ContentSlotDto contentSlotDto, String str, SlotDto slotDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentSlotDto.id;
        }
        if ((i & 2) != 0) {
            slotDto = contentSlotDto.slot;
        }
        if ((i & 4) != 0) {
            str2 = contentSlotDto.metricaLabel;
        }
        return contentSlotDto.copy(str, slotDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final SlotDto getSlot() {
        return this.slot;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ContentSlotDto copy(@Json(name = "id") String id, @Json(name = "slot") SlotDto slot, @Json(name = "metrica_label") String metricaLabel) {
        return new ContentSlotDto(id, slot, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentSlotDto)) {
            return false;
        }
        ContentSlotDto contentSlotDto = (ContentSlotDto) other;
        return jl40.l(this.id, contentSlotDto.id) && jl40.l(this.slot, contentSlotDto.slot) && jl40.l(this.metricaLabel, contentSlotDto.metricaLabel);
    }

    public final String getId() {
        return this.id;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SlotDto getSlot() {
        return this.slot;
    }

    public int hashCode() {
        int hashCode = (this.slot.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.metricaLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        SlotDto slotDto = this.slot;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ContentSlotDto(id=");
        sb.append(str);
        sb.append(", slot=");
        sb.append(slotDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
