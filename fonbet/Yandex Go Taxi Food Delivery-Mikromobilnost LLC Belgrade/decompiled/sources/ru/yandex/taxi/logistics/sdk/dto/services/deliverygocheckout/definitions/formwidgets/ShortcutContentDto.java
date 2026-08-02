package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.BackgroundDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutContentDto;", "", "layers", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto;", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;I)V", "getLayers", "()Ljava/util/List;", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "getCornerRadius", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShortcutContentDto {
    private final BackgroundDto background;
    private final int cornerRadius;
    private final List<ShortcutLayerDto> layers;

    public ShortcutContentDto(@Json(name = "layers") List<ShortcutLayerDto> list, @Json(name = "background") BackgroundDto backgroundDto, @Json(name = "corner_radius") int i) {
        this.layers = list;
        this.background = backgroundDto;
        this.cornerRadius = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShortcutContentDto copy$default(ShortcutContentDto shortcutContentDto, List list, BackgroundDto backgroundDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = shortcutContentDto.layers;
        }
        if ((i2 & 2) != 0) {
            backgroundDto = shortcutContentDto.background;
        }
        if ((i2 & 4) != 0) {
            i = shortcutContentDto.cornerRadius;
        }
        return shortcutContentDto.copy(list, backgroundDto, i);
    }

    public final List<ShortcutLayerDto> component1() {
        return this.layers;
    }

    /* renamed from: component2, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final ShortcutContentDto copy(@Json(name = "layers") List<ShortcutLayerDto> layers, @Json(name = "background") BackgroundDto background, @Json(name = "corner_radius") int cornerRadius) {
        return new ShortcutContentDto(layers, background, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutContentDto)) {
            return false;
        }
        ShortcutContentDto shortcutContentDto = (ShortcutContentDto) other;
        return jl40.l(this.layers, shortcutContentDto.layers) && jl40.l(this.background, shortcutContentDto.background) && this.cornerRadius == shortcutContentDto.cornerRadius;
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final List<ShortcutLayerDto> getLayers() {
        return this.layers;
    }

    public int hashCode() {
        int hashCode = this.layers.hashCode() * 31;
        BackgroundDto backgroundDto = this.background;
        return Integer.hashCode(this.cornerRadius) + ((hashCode + (backgroundDto == null ? 0 : backgroundDto.hashCode())) * 31);
    }

    public String toString() {
        List<ShortcutLayerDto> list = this.layers;
        BackgroundDto backgroundDto = this.background;
        int i = this.cornerRadius;
        StringBuilder sb = new StringBuilder("ShortcutContentDto(layers=");
        sb.append(list);
        sb.append(", background=");
        sb.append(backgroundDto);
        sb.append(", cornerRadius=");
        return oyr.m(i, Extension.C_BRAKE, sb);
    }

    public /* synthetic */ ShortcutContentDto(List list, BackgroundDto backgroundDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, backgroundDto, (i2 & 4) != 0 ? 16 : i);
    }
}
