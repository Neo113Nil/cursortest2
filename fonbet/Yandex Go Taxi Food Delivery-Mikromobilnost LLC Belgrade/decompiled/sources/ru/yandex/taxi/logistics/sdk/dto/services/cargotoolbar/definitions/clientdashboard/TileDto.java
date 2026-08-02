package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003=>?B\u0083\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u00105\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0015HÆ\u0003J\u0085\u0001\u00106\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0003\u0010\u0014\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0015HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0014\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006@"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto;", "", "header", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$HeaderDto;", "footer", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", C0553n3.g, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "badge", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "imagePosition", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$ImagePositionDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$StyleDto;", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$HeaderDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$ImagePositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$StyleDto;Ljava/lang/String;Ljava/lang/Object;)V", "getHeader", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$HeaderDto;", "getFooter", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "getBackground", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/BackgroundDto;", "getBadge", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/BadgeDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getImagePosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$ImagePositionDto;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$StyleDto;", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderDto", "ImagePositionDto", "StyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TileDto {
    private final ActionDto action;
    private final BackgroundDto background;
    private final BadgeDto badge;
    private final TileFooterDto footer;
    private final HeaderDto header;
    private final IconDto image;
    private final ImagePositionDto imagePosition;
    private final Object meta;
    private final String metricaLabel;
    private final StyleDto style;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$HeaderDto;", "", "ru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/a", "ru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/b", "ru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/c", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class HeaderDto {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$ImagePositionDto;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "TRAIL", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImagePositionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ImagePositionDto[] $VALUES;

        @Json(name = "top")
        public static final ImagePositionDto TOP = new ImagePositionDto("TOP", 0);

        @Json(name = "trail")
        public static final ImagePositionDto TRAIL = new ImagePositionDto("TRAIL", 1);

        private static final /* synthetic */ ImagePositionDto[] $values() {
            return new ImagePositionDto[]{TOP, TRAIL};
        }

        static {
            ImagePositionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ImagePositionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ImagePositionDto valueOf(String str) {
            return (ImagePositionDto) Enum.valueOf(ImagePositionDto.class, str);
        }

        public static ImagePositionDto[] values() {
            return (ImagePositionDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileDto$StyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "IMAGE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @Json(name = "regular")
        public static final StyleDto REGULAR = new StyleDto("REGULAR", 0);

        @Json(name = "image")
        public static final StyleDto IMAGE = new StyleDto("IMAGE", 1);

        private static final /* synthetic */ StyleDto[] $values() {
            return new StyleDto[]{REGULAR, IMAGE};
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

    public /* synthetic */ TileDto(HeaderDto headerDto, TileFooterDto tileFooterDto, BackgroundDto backgroundDto, BadgeDto badgeDto, ActionDto actionDto, IconDto iconDto, ImagePositionDto imagePositionDto, StyleDto styleDto, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerDto, tileFooterDto, backgroundDto, badgeDto, actionDto, iconDto, (i & 64) != 0 ? ImagePositionDto.TOP : imagePositionDto, styleDto, str, obj);
    }

    public static /* synthetic */ TileDto copy$default(TileDto tileDto, HeaderDto headerDto, TileFooterDto tileFooterDto, BackgroundDto backgroundDto, BadgeDto badgeDto, ActionDto actionDto, IconDto iconDto, ImagePositionDto imagePositionDto, StyleDto styleDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            headerDto = tileDto.header;
        }
        if ((i & 2) != 0) {
            tileFooterDto = tileDto.footer;
        }
        if ((i & 4) != 0) {
            backgroundDto = tileDto.background;
        }
        if ((i & 8) != 0) {
            badgeDto = tileDto.badge;
        }
        if ((i & 16) != 0) {
            actionDto = tileDto.action;
        }
        if ((i & 32) != 0) {
            iconDto = tileDto.image;
        }
        if ((i & 64) != 0) {
            imagePositionDto = tileDto.imagePosition;
        }
        if ((i & 128) != 0) {
            styleDto = tileDto.style;
        }
        if ((i & 256) != 0) {
            str = tileDto.metricaLabel;
        }
        if ((i & 512) != 0) {
            obj = tileDto.meta;
        }
        String str2 = str;
        Object obj3 = obj;
        ImagePositionDto imagePositionDto2 = imagePositionDto;
        StyleDto styleDto2 = styleDto;
        ActionDto actionDto2 = actionDto;
        IconDto iconDto2 = iconDto;
        return tileDto.copy(headerDto, tileFooterDto, backgroundDto, badgeDto, actionDto2, iconDto2, imagePositionDto2, styleDto2, str2, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component10, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final TileFooterDto getFooter() {
        return this.footer;
    }

    /* renamed from: component3, reason: from getter */
    public final BackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDto getBadge() {
        return this.badge;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final IconDto getImage() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final ImagePositionDto getImagePosition() {
        return this.imagePosition;
    }

    /* renamed from: component8, reason: from getter */
    public final StyleDto getStyle() {
        return this.style;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TileDto copy(@Json(name = "header") HeaderDto header, @Json(name = "footer") TileFooterDto footer, @Json(name = "background") BackgroundDto background, @Json(name = "badge") BadgeDto badge, @Json(name = "action") ActionDto action, @Json(name = "image") IconDto image, @Json(name = "image_position") ImagePositionDto imagePosition, @Json(name = "style") StyleDto style, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new TileDto(header, footer, background, badge, action, image, imagePosition, style, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileDto)) {
            return false;
        }
        TileDto tileDto = (TileDto) other;
        return jl40.l(this.header, tileDto.header) && jl40.l(this.footer, tileDto.footer) && jl40.l(this.background, tileDto.background) && jl40.l(this.badge, tileDto.badge) && jl40.l(this.action, tileDto.action) && jl40.l(this.image, tileDto.image) && this.imagePosition == tileDto.imagePosition && this.style == tileDto.style && jl40.l(this.metricaLabel, tileDto.metricaLabel) && jl40.l(this.meta, tileDto.meta);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final BackgroundDto getBackground() {
        return this.background;
    }

    public final BadgeDto getBadge() {
        return this.badge;
    }

    public final TileFooterDto getFooter() {
        return this.footer;
    }

    public final HeaderDto getHeader() {
        return this.header;
    }

    public final IconDto getImage() {
        return this.image;
    }

    public final ImagePositionDto getImagePosition() {
        return this.imagePosition;
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

    public int hashCode() {
        HeaderDto headerDto = this.header;
        int hashCode = (headerDto == null ? 0 : headerDto.hashCode()) * 31;
        TileFooterDto tileFooterDto = this.footer;
        int hashCode2 = (hashCode + (tileFooterDto == null ? 0 : tileFooterDto.hashCode())) * 31;
        BackgroundDto backgroundDto = this.background;
        int hashCode3 = (hashCode2 + (backgroundDto == null ? 0 : backgroundDto.hashCode())) * 31;
        BadgeDto badgeDto = this.badge;
        int hashCode4 = (hashCode3 + (badgeDto == null ? 0 : badgeDto.hashCode())) * 31;
        ActionDto actionDto = this.action;
        int hashCode5 = (hashCode4 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
        IconDto iconDto = this.image;
        int hashCode6 = (this.imagePosition.hashCode() + ((hashCode5 + (iconDto == null ? 0 : iconDto.hashCode())) * 31)) * 31;
        StyleDto styleDto = this.style;
        int hashCode7 = (hashCode6 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode8 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        HeaderDto headerDto = this.header;
        TileFooterDto tileFooterDto = this.footer;
        BackgroundDto backgroundDto = this.background;
        BadgeDto badgeDto = this.badge;
        ActionDto actionDto = this.action;
        IconDto iconDto = this.image;
        ImagePositionDto imagePositionDto = this.imagePosition;
        StyleDto styleDto = this.style;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("TileDto(header=");
        sb.append(headerDto);
        sb.append(", footer=");
        sb.append(tileFooterDto);
        sb.append(", background=");
        sb.append(backgroundDto);
        sb.append(", badge=");
        sb.append(badgeDto);
        sb.append(", action=");
        sb.append(actionDto);
        sb.append(", image=");
        sb.append(iconDto);
        sb.append(", imagePosition=");
        sb.append(imagePositionDto);
        sb.append(", style=");
        sb.append(styleDto);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str, ", meta=", obj, Extension.C_BRAKE);
    }

    public TileDto(@Json(name = "header") HeaderDto headerDto, @Json(name = "footer") TileFooterDto tileFooterDto, @Json(name = "background") BackgroundDto backgroundDto, @Json(name = "badge") BadgeDto badgeDto, @Json(name = "action") ActionDto actionDto, @Json(name = "image") IconDto iconDto, @Json(name = "image_position") ImagePositionDto imagePositionDto, @Json(name = "style") StyleDto styleDto, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.header = headerDto;
        this.footer = tileFooterDto;
        this.background = backgroundDto;
        this.badge = badgeDto;
        this.action = actionDto;
        this.image = iconDto;
        this.imagePosition = imagePositionDto;
        this.style = styleDto;
        this.metricaLabel = str;
        this.meta = obj;
    }
}
