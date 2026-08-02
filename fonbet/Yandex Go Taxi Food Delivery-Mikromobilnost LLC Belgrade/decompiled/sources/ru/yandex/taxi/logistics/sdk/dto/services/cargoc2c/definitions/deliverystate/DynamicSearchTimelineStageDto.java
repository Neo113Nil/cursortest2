package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineStageDto;", "", "displayDuration", "", "dynamicDescription", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "<init>", "(ILjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;)V", "getDisplayDuration", "()I", "getDynamicDescription", "()Ljava/lang/String;", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicSearchTimelineStageDto {
    private final int displayDuration;
    private final String dynamicDescription;
    private final DynamicSearchTimelineIconDto icon;

    public DynamicSearchTimelineStageDto(@Json(name = "display_duration") int i, @Json(name = "dynamic_description") String str, @Json(name = "icon") DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto) {
        this.displayDuration = i;
        this.dynamicDescription = str;
        this.icon = dynamicSearchTimelineIconDto;
    }

    public static /* synthetic */ DynamicSearchTimelineStageDto copy$default(DynamicSearchTimelineStageDto dynamicSearchTimelineStageDto, int i, String str, DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dynamicSearchTimelineStageDto.displayDuration;
        }
        if ((i2 & 2) != 0) {
            str = dynamicSearchTimelineStageDto.dynamicDescription;
        }
        if ((i2 & 4) != 0) {
            dynamicSearchTimelineIconDto = dynamicSearchTimelineStageDto.icon;
        }
        return dynamicSearchTimelineStageDto.copy(i, str, dynamicSearchTimelineIconDto);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDisplayDuration() {
        return this.displayDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDynamicDescription() {
        return this.dynamicDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final DynamicSearchTimelineIconDto getIcon() {
        return this.icon;
    }

    public final DynamicSearchTimelineStageDto copy(@Json(name = "display_duration") int displayDuration, @Json(name = "dynamic_description") String dynamicDescription, @Json(name = "icon") DynamicSearchTimelineIconDto icon) {
        return new DynamicSearchTimelineStageDto(displayDuration, dynamicDescription, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicSearchTimelineStageDto)) {
            return false;
        }
        DynamicSearchTimelineStageDto dynamicSearchTimelineStageDto = (DynamicSearchTimelineStageDto) other;
        return this.displayDuration == dynamicSearchTimelineStageDto.displayDuration && jl40.l(this.dynamicDescription, dynamicSearchTimelineStageDto.dynamicDescription) && jl40.l(this.icon, dynamicSearchTimelineStageDto.icon);
    }

    public final int getDisplayDuration() {
        return this.displayDuration;
    }

    public final String getDynamicDescription() {
        return this.dynamicDescription;
    }

    public final DynamicSearchTimelineIconDto getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.displayDuration) * 31;
        String str = this.dynamicDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto = this.icon;
        return hashCode2 + (dynamicSearchTimelineIconDto != null ? dynamicSearchTimelineIconDto.hashCode() : 0);
    }

    public String toString() {
        int i = this.displayDuration;
        String str = this.dynamicDescription;
        DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto = this.icon;
        StringBuilder v = unr0.v(i, "DynamicSearchTimelineStageDto(displayDuration=", ", dynamicDescription=", str, ", icon=");
        v.append(dynamicSearchTimelineIconDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
