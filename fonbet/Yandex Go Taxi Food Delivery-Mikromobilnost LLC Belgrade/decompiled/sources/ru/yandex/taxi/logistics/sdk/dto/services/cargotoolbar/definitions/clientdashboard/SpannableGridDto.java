package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\fHÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\fHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SpannableGridDto;", "", "tiles", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SpannableGridTileDto;", "columns", "", "showWhenSectionCollapsed", "", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Object;)V", "getTiles", "()Ljava/util/List;", "getColumns", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowWhenSectionCollapsed", "()Z", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Object;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SpannableGridDto;", "equals", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SpannableGridDto {
    private final Integer columns;
    private final Object meta;
    private final String metricaLabel;
    private final boolean showWhenSectionCollapsed;
    private final List<SpannableGridTileDto> tiles;

    public /* synthetic */ SpannableGridDto(List list, Integer num, boolean z, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, num, (i & 4) != 0 ? false : z, str, obj);
    }

    public static /* synthetic */ SpannableGridDto copy$default(SpannableGridDto spannableGridDto, List list, Integer num, boolean z, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = spannableGridDto.tiles;
        }
        if ((i & 2) != 0) {
            num = spannableGridDto.columns;
        }
        if ((i & 4) != 0) {
            z = spannableGridDto.showWhenSectionCollapsed;
        }
        if ((i & 8) != 0) {
            str = spannableGridDto.metricaLabel;
        }
        if ((i & 16) != 0) {
            obj = spannableGridDto.meta;
        }
        Object obj3 = obj;
        boolean z2 = z;
        return spannableGridDto.copy(list, num, z2, str, obj3);
    }

    public final List<SpannableGridTileDto> component1() {
        return this.tiles;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getColumns() {
        return this.columns;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowWhenSectionCollapsed() {
        return this.showWhenSectionCollapsed;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final SpannableGridDto copy(@Json(name = "tiles") List<SpannableGridTileDto> tiles, @Json(name = "columns") Integer columns, @Json(name = "show_when_section_collapsed") boolean showWhenSectionCollapsed, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new SpannableGridDto(tiles, columns, showWhenSectionCollapsed, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpannableGridDto)) {
            return false;
        }
        SpannableGridDto spannableGridDto = (SpannableGridDto) other;
        return jl40.l(this.tiles, spannableGridDto.tiles) && jl40.l(this.columns, spannableGridDto.columns) && this.showWhenSectionCollapsed == spannableGridDto.showWhenSectionCollapsed && jl40.l(this.metricaLabel, spannableGridDto.metricaLabel) && jl40.l(this.meta, spannableGridDto.meta);
    }

    public final Integer getColumns() {
        return this.columns;
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

    public final List<SpannableGridTileDto> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int hashCode = this.tiles.hashCode() * 31;
        Integer num = this.columns;
        int e = unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.showWhenSectionCollapsed);
        String str = this.metricaLabel;
        int hashCode2 = (e + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        List<SpannableGridTileDto> list = this.tiles;
        Integer num = this.columns;
        boolean z = this.showWhenSectionCollapsed;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("SpannableGridDto(tiles=");
        sb.append(list);
        sb.append(", columns=");
        sb.append(num);
        sb.append(", showWhenSectionCollapsed=");
        unr0.A(", metricaLabel=", str, ", meta=", sb, z);
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }

    public SpannableGridDto(@Json(name = "tiles") List<SpannableGridTileDto> list, @Json(name = "columns") Integer num, @Json(name = "show_when_section_collapsed") boolean z, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.tiles = list;
        this.columns = num;
        this.showWhenSectionCollapsed = z;
        this.metricaLabel = str;
        this.meta = obj;
    }
}
