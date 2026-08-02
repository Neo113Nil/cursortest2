package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIdleDto;", "", "stages", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "<init>", "(ILru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;)V", "getStages", "()I", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicSearchTimelineIdleDto {
    private final DynamicSearchTimelineIconDto icon;
    private final int stages;

    public DynamicSearchTimelineIdleDto(@Json(name = "stages") int i, @Json(name = "icon") DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto) {
        this.stages = i;
        this.icon = dynamicSearchTimelineIconDto;
    }

    public static /* synthetic */ DynamicSearchTimelineIdleDto copy$default(DynamicSearchTimelineIdleDto dynamicSearchTimelineIdleDto, int i, DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dynamicSearchTimelineIdleDto.stages;
        }
        if ((i2 & 2) != 0) {
            dynamicSearchTimelineIconDto = dynamicSearchTimelineIdleDto.icon;
        }
        return dynamicSearchTimelineIdleDto.copy(i, dynamicSearchTimelineIconDto);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStages() {
        return this.stages;
    }

    /* renamed from: component2, reason: from getter */
    public final DynamicSearchTimelineIconDto getIcon() {
        return this.icon;
    }

    public final DynamicSearchTimelineIdleDto copy(@Json(name = "stages") int stages, @Json(name = "icon") DynamicSearchTimelineIconDto icon) {
        return new DynamicSearchTimelineIdleDto(stages, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicSearchTimelineIdleDto)) {
            return false;
        }
        DynamicSearchTimelineIdleDto dynamicSearchTimelineIdleDto = (DynamicSearchTimelineIdleDto) other;
        return this.stages == dynamicSearchTimelineIdleDto.stages && jl40.l(this.icon, dynamicSearchTimelineIdleDto.icon);
    }

    public final DynamicSearchTimelineIconDto getIcon() {
        return this.icon;
    }

    public final int getStages() {
        return this.stages;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.stages) * 31;
        DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto = this.icon;
        return hashCode + (dynamicSearchTimelineIconDto == null ? 0 : dynamicSearchTimelineIconDto.hashCode());
    }

    public String toString() {
        return "DynamicSearchTimelineIdleDto(stages=" + this.stages + ", icon=" + this.icon + Extension.C_BRAKE;
    }
}
