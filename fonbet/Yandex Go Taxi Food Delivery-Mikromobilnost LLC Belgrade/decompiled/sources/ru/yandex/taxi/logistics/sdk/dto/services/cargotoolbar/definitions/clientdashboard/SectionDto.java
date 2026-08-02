package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*Bc\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010#\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000eHÆ\u0003Je\u0010$\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto;", "", "widgets", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/WidgetDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto$StyleDto;", "title", "", "id", "collapsed", "", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto$StyleDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Object;)V", "getWidgets", "()Ljava/util/List;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto$StyleDto;", "getTitle", "()Ljava/lang/String;", "getId", "getCollapsed", "()Z", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "StyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SectionDto {
    private final boolean collapsed;
    private final String id;
    private final Object meta;
    private final String metricaLabel;
    private final StyleDto style;
    private final String title;
    private final List<WidgetDto> widgets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/SectionDto$StyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "DARK", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @Json(name = "default")
        public static final StyleDto DEFAULT = new StyleDto("DEFAULT", 0);

        @Json(name = "dark")
        public static final StyleDto DARK = new StyleDto("DARK", 1);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{DEFAULT, DARK};
        }

        static {
            StyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private StyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionDto(@Json(name = "widgets") List<? extends WidgetDto> list, @Json(name = "style") StyleDto styleDto, @Json(name = "title") String str, @Json(name = "id") String str2, @Json(name = "collapsed") boolean z, @Json(name = "metrica_label") String str3, @Json(name = "meta") Object obj) {
        this.widgets = list;
        this.style = styleDto;
        this.title = str;
        this.id = str2;
        this.collapsed = z;
        this.metricaLabel = str3;
        this.meta = obj;
    }

    public static /* synthetic */ SectionDto copy$default(SectionDto sectionDto, List list, StyleDto styleDto, String str, String str2, boolean z, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = sectionDto.widgets;
        }
        if ((i & 2) != 0) {
            styleDto = sectionDto.style;
        }
        if ((i & 4) != 0) {
            str = sectionDto.title;
        }
        if ((i & 8) != 0) {
            str2 = sectionDto.id;
        }
        if ((i & 16) != 0) {
            z = sectionDto.collapsed;
        }
        if ((i & 32) != 0) {
            str3 = sectionDto.metricaLabel;
        }
        if ((i & 64) != 0) {
            obj = sectionDto.meta;
        }
        String str4 = str3;
        Object obj3 = obj;
        boolean z2 = z;
        String str5 = str;
        return sectionDto.copy(list, styleDto, str5, str2, z2, str4, obj3);
    }

    public final List<WidgetDto> component1() {
        return this.widgets;
    }

    /* renamed from: component2, reason: from getter */
    public final StyleDto getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCollapsed() {
        return this.collapsed;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final SectionDto copy(@Json(name = "widgets") List<? extends WidgetDto> widgets, @Json(name = "style") StyleDto style, @Json(name = "title") String title, @Json(name = "id") String id, @Json(name = "collapsed") boolean collapsed, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new SectionDto(widgets, style, title, id, collapsed, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionDto)) {
            return false;
        }
        SectionDto sectionDto = (SectionDto) other;
        return jl40.l(this.widgets, sectionDto.widgets) && this.style == sectionDto.style && jl40.l(this.title, sectionDto.title) && jl40.l(this.id, sectionDto.id) && this.collapsed == sectionDto.collapsed && jl40.l(this.metricaLabel, sectionDto.metricaLabel) && jl40.l(this.meta, sectionDto.meta);
    }

    public final boolean getCollapsed() {
        return this.collapsed;
    }

    public final String getId() {
        return this.id;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final StyleDto getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<WidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int hashCode = this.widgets.hashCode() * 31;
        StyleDto styleDto = this.style;
        int hashCode2 = (hashCode + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        int e = unr0.e((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.collapsed);
        String str3 = this.metricaLabel;
        int hashCode4 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        List<WidgetDto> list = this.widgets;
        StyleDto styleDto = this.style;
        String str = this.title;
        String str2 = this.id;
        boolean z = this.collapsed;
        String str3 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("SectionDto(widgets=");
        sb.append(list);
        sb.append(", style=");
        sb.append(styleDto);
        sb.append(", title=");
        g8e.D(sb, str, ", id=", str2, ", collapsed=");
        unr0.A(", metricaLabel=", str3, ", meta=", sb, z);
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }

    public /* synthetic */ SectionDto(List list, StyleDto styleDto, String str, String str2, boolean z, String str3, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, styleDto, str, str2, (i & 16) != 0 ? false : z, str3, obj);
    }
}
