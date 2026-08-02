package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.n;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.CoordinateSourceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.MapPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010HÆ\u0003Jn\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0019\u0010\u000f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MiniMapWidgetDto;", "", "widgetId", "", "zoom", "", "coordinateSource", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;", "pin", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDto;", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", BackendConfig.Restrictions.ENABLED, "", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;ZLjava/lang/String;Ljava/lang/Object;)V", "getWidgetId", "()Ljava/lang/String;", "getZoom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoordinateSource", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;", "getPin", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDto;", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getEnabled", "()Z", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CoordinateSourceDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MapPinDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;ZLjava/lang/String;Ljava/lang/Object;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MiniMapWidgetDto;", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MiniMapWidgetDto {
    private final CoordinateSourceDto coordinateSource;
    private final boolean enabled;
    private final Object meta;
    private final String metricaLabel;
    private final PaddingsDto paddings;
    private final MapPinDto pin;
    private final String widgetId;
    private final Integer zoom;

    public /* synthetic */ MiniMapWidgetDto(String str, Integer num, CoordinateSourceDto coordinateSourceDto, MapPinDto mapPinDto, PaddingsDto paddingsDto, boolean z, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, coordinateSourceDto, mapPinDto, paddingsDto, (i & 32) != 0 ? true : z, str2, obj);
    }

    public static /* synthetic */ MiniMapWidgetDto copy$default(MiniMapWidgetDto miniMapWidgetDto, String str, Integer num, CoordinateSourceDto coordinateSourceDto, MapPinDto mapPinDto, PaddingsDto paddingsDto, boolean z, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = miniMapWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            num = miniMapWidgetDto.zoom;
        }
        if ((i & 4) != 0) {
            coordinateSourceDto = miniMapWidgetDto.coordinateSource;
        }
        if ((i & 8) != 0) {
            mapPinDto = miniMapWidgetDto.pin;
        }
        if ((i & 16) != 0) {
            paddingsDto = miniMapWidgetDto.paddings;
        }
        if ((i & 32) != 0) {
            z = miniMapWidgetDto.enabled;
        }
        if ((i & 64) != 0) {
            str2 = miniMapWidgetDto.metricaLabel;
        }
        if ((i & 128) != 0) {
            obj = miniMapWidgetDto.meta;
        }
        String str3 = str2;
        Object obj3 = obj;
        PaddingsDto paddingsDto2 = paddingsDto;
        boolean z2 = z;
        return miniMapWidgetDto.copy(str, num, coordinateSourceDto, mapPinDto, paddingsDto2, z2, str3, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getZoom() {
        return this.zoom;
    }

    /* renamed from: component3, reason: from getter */
    public final CoordinateSourceDto getCoordinateSource() {
        return this.coordinateSource;
    }

    /* renamed from: component4, reason: from getter */
    public final MapPinDto getPin() {
        return this.pin;
    }

    /* renamed from: component5, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final MiniMapWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "zoom") Integer zoom, @Json(name = "coordinate_source") CoordinateSourceDto coordinateSource, @Json(name = "pin") MapPinDto pin, @Json(name = "paddings") PaddingsDto paddings, @Json(name = "enabled") boolean enabled, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new MiniMapWidgetDto(widgetId, zoom, coordinateSource, pin, paddings, enabled, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniMapWidgetDto)) {
            return false;
        }
        MiniMapWidgetDto miniMapWidgetDto = (MiniMapWidgetDto) other;
        return jl40.l(this.widgetId, miniMapWidgetDto.widgetId) && jl40.l(this.zoom, miniMapWidgetDto.zoom) && jl40.l(this.coordinateSource, miniMapWidgetDto.coordinateSource) && jl40.l(this.pin, miniMapWidgetDto.pin) && jl40.l(this.paddings, miniMapWidgetDto.paddings) && this.enabled == miniMapWidgetDto.enabled && jl40.l(this.metricaLabel, miniMapWidgetDto.metricaLabel) && jl40.l(this.meta, miniMapWidgetDto.meta);
    }

    public final CoordinateSourceDto getCoordinateSource() {
        return this.coordinateSource;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final MapPinDto getPin() {
        return this.pin;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final Integer getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        Integer num = this.zoom;
        int hashCode2 = (this.coordinateSource.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        MapPinDto mapPinDto = this.pin;
        int hashCode3 = (hashCode2 + (mapPinDto == null ? 0 : mapPinDto.hashCode())) * 31;
        PaddingsDto paddingsDto = this.paddings;
        int e = unr0.e((hashCode3 + (paddingsDto == null ? 0 : paddingsDto.hashCode())) * 31, 31, this.enabled);
        String str = this.metricaLabel;
        int hashCode4 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        Integer num = this.zoom;
        CoordinateSourceDto coordinateSourceDto = this.coordinateSource;
        MapPinDto mapPinDto = this.pin;
        PaddingsDto paddingsDto = this.paddings;
        boolean z = this.enabled;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder q = n.q("MiniMapWidgetDto(widgetId=", num, str, ", zoom=", ", coordinateSource=");
        q.append(coordinateSourceDto);
        q.append(", pin=");
        q.append(mapPinDto);
        q.append(", paddings=");
        q.append(paddingsDto);
        q.append(", enabled=");
        q.append(z);
        q.append(", metricaLabel=");
        return tse0.l(q, str2, ", meta=", obj, Extension.C_BRAKE);
    }

    public MiniMapWidgetDto(@Json(name = "widget_id") String str, @Json(name = "zoom") Integer num, @Json(name = "coordinate_source") CoordinateSourceDto coordinateSourceDto, @Json(name = "pin") MapPinDto mapPinDto, @Json(name = "paddings") PaddingsDto paddingsDto, @Json(name = "enabled") boolean z, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.widgetId = str;
        this.zoom = num;
        this.coordinateSource = coordinateSourceDto;
        this.pin = mapPinDto;
        this.paddings = paddingsDto;
        this.enabled = z;
        this.metricaLabel = str2;
        this.meta = obj;
    }
}
