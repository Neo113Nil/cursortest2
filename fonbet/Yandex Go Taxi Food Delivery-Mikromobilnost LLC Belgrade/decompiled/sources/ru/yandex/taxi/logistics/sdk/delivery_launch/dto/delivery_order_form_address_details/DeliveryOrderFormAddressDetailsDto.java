package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB=\u0012\u0016\b\u0001\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\u0016\b\u0003\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0004HÖ\u0081\u0004R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto;", "", "l10n", "", "", "mapConfig", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto;", "matches", "", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MatchesDto;", "<init>", "(Ljava/util/Map;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto;Ljava/util/List;)V", "getL10n", "()Ljava/util/Map;", "getMapConfig", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto;", "getMatches", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "MapConfigDto", "MatchesDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryOrderFormAddressDetailsDto {
    private final Map<String, String> l10n;
    private final MapConfigDto mapConfig;
    private final List<MatchesDto> matches;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B1\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto;", "", "modes", "", "", "styles", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto;", "zoom", "", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "getModes", "()Ljava/util/List;", "getStyles", "getZoom", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "StylesDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MapConfigDto {
        private final List<String> modes;
        private final List<StylesDto> styles;
        private final int zoom;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto;", "", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto$ThemeDto;", "value", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto$ThemeDto;Ljava/lang/String;)V", "getTheme", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto$ThemeDto;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ThemeDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StylesDto {
            private final ThemeDto theme;
            private final String value;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MapConfigDto$StylesDto$ThemeDto;", "", "DARK", "LIGHT", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class ThemeDto {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ ThemeDto[] $VALUES;

                @Json(name = "dark")
                public static final ThemeDto DARK;

                @Json(name = "light")
                public static final ThemeDto LIGHT;

                static {
                    ThemeDto themeDto = new ThemeDto("DARK", 0);
                    DARK = themeDto;
                    ThemeDto themeDto2 = new ThemeDto("LIGHT", 1);
                    LIGHT = themeDto2;
                    ThemeDto[] themeDtoArr = {themeDto, themeDto2};
                    $VALUES = themeDtoArr;
                    $ENTRIES = a.a(themeDtoArr);
                }

                public static ThemeDto valueOf(String str) {
                    return (ThemeDto) Enum.valueOf(ThemeDto.class, str);
                }

                public static ThemeDto[] values() {
                    return (ThemeDto[]) $VALUES.clone();
                }
            }

            public StylesDto(@Json(name = "theme") ThemeDto themeDto, @Json(name = "value") String str) {
                this.theme = themeDto;
                this.value = str;
            }

            public static /* synthetic */ StylesDto copy$default(StylesDto stylesDto, ThemeDto themeDto, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    themeDto = stylesDto.theme;
                }
                if ((i & 2) != 0) {
                    str = stylesDto.value;
                }
                return stylesDto.copy(themeDto, str);
            }

            /* renamed from: component1, reason: from getter */
            public final ThemeDto getTheme() {
                return this.theme;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final StylesDto copy(@Json(name = "theme") ThemeDto theme, @Json(name = "value") String value) {
                return new StylesDto(theme, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StylesDto)) {
                    return false;
                }
                StylesDto stylesDto = (StylesDto) other;
                return this.theme == stylesDto.theme && jl40.l(this.value, stylesDto.value);
            }

            public final ThemeDto getTheme() {
                return this.theme;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + (this.theme.hashCode() * 31);
            }

            public String toString() {
                return "StylesDto(theme=" + this.theme + ", value=" + this.value + Extension.C_BRAKE;
            }
        }

        public MapConfigDto(@Json(name = "modes") List<String> list, @Json(name = "styles") List<StylesDto> list2, @Json(name = "zoom") int i) {
            this.modes = list;
            this.styles = list2;
            this.zoom = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapConfigDto copy$default(MapConfigDto mapConfigDto, List list, List list2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = mapConfigDto.modes;
            }
            if ((i2 & 2) != 0) {
                list2 = mapConfigDto.styles;
            }
            if ((i2 & 4) != 0) {
                i = mapConfigDto.zoom;
            }
            return mapConfigDto.copy(list, list2, i);
        }

        public final List<String> component1() {
            return this.modes;
        }

        public final List<StylesDto> component2() {
            return this.styles;
        }

        /* renamed from: component3, reason: from getter */
        public final int getZoom() {
            return this.zoom;
        }

        public final MapConfigDto copy(@Json(name = "modes") List<String> modes, @Json(name = "styles") List<StylesDto> styles, @Json(name = "zoom") int zoom) {
            return new MapConfigDto(modes, styles, zoom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapConfigDto)) {
                return false;
            }
            MapConfigDto mapConfigDto = (MapConfigDto) other;
            return jl40.l(this.modes, mapConfigDto.modes) && jl40.l(this.styles, mapConfigDto.styles) && this.zoom == mapConfigDto.zoom;
        }

        public final List<String> getModes() {
            return this.modes;
        }

        public final List<StylesDto> getStyles() {
            return this.styles;
        }

        public final int getZoom() {
            return this.zoom;
        }

        public int hashCode() {
            return Integer.hashCode(this.zoom) + unr0.c(this.modes.hashCode() * 31, 31, this.styles);
        }

        public String toString() {
            return oyr.m(this.zoom, Extension.C_BRAKE, qv10.v("MapConfigDto(modes=", this.modes, ", styles=", this.styles, ", zoom="));
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/DeliveryOrderFormAddressDetailsDto$MatchesDto;", "", "modes", "", "", ConfigConstants.CONFIG, "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/AddressDetailsConfigDto;", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/AddressDetailsConfigDto;)V", "getModes", "()Ljava/util/List;", "getConfig", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/AddressDetailsConfigDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MatchesDto {
        private final AddressDetailsConfigDto config;
        private final List<String> modes;

        public MatchesDto(@Json(name = "modes") List<String> list, @Json(name = "config") AddressDetailsConfigDto addressDetailsConfigDto) {
            this.modes = list;
            this.config = addressDetailsConfigDto;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchesDto copy$default(MatchesDto matchesDto, List list, AddressDetailsConfigDto addressDetailsConfigDto, int i, Object obj) {
            if ((i & 1) != 0) {
                list = matchesDto.modes;
            }
            if ((i & 2) != 0) {
                addressDetailsConfigDto = matchesDto.config;
            }
            return matchesDto.copy(list, addressDetailsConfigDto);
        }

        public final List<String> component1() {
            return this.modes;
        }

        /* renamed from: component2, reason: from getter */
        public final AddressDetailsConfigDto getConfig() {
            return this.config;
        }

        public final MatchesDto copy(@Json(name = "modes") List<String> modes, @Json(name = "config") AddressDetailsConfigDto config) {
            return new MatchesDto(modes, config);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchesDto)) {
                return false;
            }
            MatchesDto matchesDto = (MatchesDto) other;
            return jl40.l(this.modes, matchesDto.modes) && jl40.l(this.config, matchesDto.config);
        }

        public final AddressDetailsConfigDto getConfig() {
            return this.config;
        }

        public final List<String> getModes() {
            return this.modes;
        }

        public int hashCode() {
            return this.config.hashCode() + (this.modes.hashCode() * 31);
        }

        public String toString() {
            return "MatchesDto(modes=" + this.modes + ", config=" + this.config + Extension.C_BRAKE;
        }
    }

    public DeliveryOrderFormAddressDetailsDto(@Json(name = "l10n") Map<String, String> map, @Json(name = "map_config") MapConfigDto mapConfigDto, @Json(name = "matches") List<MatchesDto> list) {
        this.l10n = map;
        this.mapConfig = mapConfigDto;
        this.matches = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryOrderFormAddressDetailsDto copy$default(DeliveryOrderFormAddressDetailsDto deliveryOrderFormAddressDetailsDto, Map map, MapConfigDto mapConfigDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = deliveryOrderFormAddressDetailsDto.l10n;
        }
        if ((i & 2) != 0) {
            mapConfigDto = deliveryOrderFormAddressDetailsDto.mapConfig;
        }
        if ((i & 4) != 0) {
            list = deliveryOrderFormAddressDetailsDto.matches;
        }
        return deliveryOrderFormAddressDetailsDto.copy(map, mapConfigDto, list);
    }

    public final Map<String, String> component1() {
        return this.l10n;
    }

    /* renamed from: component2, reason: from getter */
    public final MapConfigDto getMapConfig() {
        return this.mapConfig;
    }

    public final List<MatchesDto> component3() {
        return this.matches;
    }

    public final DeliveryOrderFormAddressDetailsDto copy(@Json(name = "l10n") Map<String, String> l10n, @Json(name = "map_config") MapConfigDto mapConfig, @Json(name = "matches") List<MatchesDto> matches) {
        return new DeliveryOrderFormAddressDetailsDto(l10n, mapConfig, matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderFormAddressDetailsDto)) {
            return false;
        }
        DeliveryOrderFormAddressDetailsDto deliveryOrderFormAddressDetailsDto = (DeliveryOrderFormAddressDetailsDto) other;
        return jl40.l(this.l10n, deliveryOrderFormAddressDetailsDto.l10n) && jl40.l(this.mapConfig, deliveryOrderFormAddressDetailsDto.mapConfig) && jl40.l(this.matches, deliveryOrderFormAddressDetailsDto.matches);
    }

    public final Map<String, String> getL10n() {
        return this.l10n;
    }

    public final MapConfigDto getMapConfig() {
        return this.mapConfig;
    }

    public final List<MatchesDto> getMatches() {
        return this.matches;
    }

    public int hashCode() {
        Map<String, String> map = this.l10n;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        MapConfigDto mapConfigDto = this.mapConfig;
        int hashCode2 = (hashCode + (mapConfigDto == null ? 0 : mapConfigDto.hashCode())) * 31;
        List<MatchesDto> list = this.matches;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Map<String, String> map = this.l10n;
        MapConfigDto mapConfigDto = this.mapConfig;
        List<MatchesDto> list = this.matches;
        StringBuilder sb = new StringBuilder("DeliveryOrderFormAddressDetailsDto(l10n=");
        sb.append(map);
        sb.append(", mapConfig=");
        sb.append(mapConfigDto);
        sb.append(", matches=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
