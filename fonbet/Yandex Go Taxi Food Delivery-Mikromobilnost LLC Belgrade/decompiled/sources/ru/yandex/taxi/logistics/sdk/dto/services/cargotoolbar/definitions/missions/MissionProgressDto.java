package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.missions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003 !\"B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$TypeDto;", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "badge", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$BadgeDto;", "progressIndicator", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$ProgressIndicatorDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$TypeDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$BadgeDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$ProgressIndicatorDto;)V", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$TypeDto;", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "getBadge", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$BadgeDto;", "getProgressIndicator", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$ProgressIndicatorDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TypeDto", "BadgeDto", "ProgressIndicatorDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissionProgressDto {
    private final BadgeDto badge;
    private final IconDto icon;
    private final ProgressIndicatorDto progressIndicator;
    private final TypeDto type;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$BadgeDto;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "textColor", "text", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Ljava/lang/String;)V", "getBackgroundColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getTextColor", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeDto {
        private final ColorDto backgroundColor;
        private final String text;
        private final ColorDto textColor;

        public BadgeDto(@Json(name = "background_color") ColorDto colorDto, @Json(name = "text_color") ColorDto colorDto2, @Json(name = "text") String str) {
            this.backgroundColor = colorDto;
            this.textColor = colorDto2;
            this.text = str;
        }

        public static /* synthetic */ BadgeDto copy$default(BadgeDto badgeDto, ColorDto colorDto, ColorDto colorDto2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                colorDto = badgeDto.backgroundColor;
            }
            if ((i & 2) != 0) {
                colorDto2 = badgeDto.textColor;
            }
            if ((i & 4) != 0) {
                str = badgeDto.text;
            }
            return badgeDto.copy(colorDto, colorDto2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ColorDto getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorDto getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final BadgeDto copy(@Json(name = "background_color") ColorDto backgroundColor, @Json(name = "text_color") ColorDto textColor, @Json(name = "text") String text) {
            return new BadgeDto(backgroundColor, textColor, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeDto)) {
                return false;
            }
            BadgeDto badgeDto = (BadgeDto) other;
            return jl40.l(this.backgroundColor, badgeDto.backgroundColor) && jl40.l(this.textColor, badgeDto.textColor) && jl40.l(this.text, badgeDto.text);
        }

        public final ColorDto getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getText() {
            return this.text;
        }

        public final ColorDto getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return this.text.hashCode() + ((this.textColor.hashCode() + (this.backgroundColor.hashCode() * 31)) * 31);
        }

        public String toString() {
            ColorDto colorDto = this.backgroundColor;
            ColorDto colorDto2 = this.textColor;
            String str = this.text;
            StringBuilder sb = new StringBuilder("BadgeDto(backgroundColor=");
            sb.append(colorDto);
            sb.append(", textColor=");
            sb.append(colorDto2);
            sb.append(", text=");
            return oyr.t(sb, str, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$ProgressIndicatorDto;", "", "progress", "", "fillColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "trackColor", "<init>", "(DLru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)V", "getProgress", "()D", "getFillColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getTrackColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressIndicatorDto {
        private final ColorDto fillColor;
        private final double progress;
        private final ColorDto trackColor;

        public ProgressIndicatorDto(@Json(name = "progress") double d, @Json(name = "fill_color") ColorDto colorDto, @Json(name = "track_color") ColorDto colorDto2) {
            this.progress = d;
            this.fillColor = colorDto;
            this.trackColor = colorDto2;
        }

        public static /* synthetic */ ProgressIndicatorDto copy$default(ProgressIndicatorDto progressIndicatorDto, double d, ColorDto colorDto, ColorDto colorDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = progressIndicatorDto.progress;
            }
            if ((i & 2) != 0) {
                colorDto = progressIndicatorDto.fillColor;
            }
            if ((i & 4) != 0) {
                colorDto2 = progressIndicatorDto.trackColor;
            }
            return progressIndicatorDto.copy(d, colorDto, colorDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final double getProgress() {
            return this.progress;
        }

        /* renamed from: component2, reason: from getter */
        public final ColorDto getFillColor() {
            return this.fillColor;
        }

        /* renamed from: component3, reason: from getter */
        public final ColorDto getTrackColor() {
            return this.trackColor;
        }

        public final ProgressIndicatorDto copy(@Json(name = "progress") double progress, @Json(name = "fill_color") ColorDto fillColor, @Json(name = "track_color") ColorDto trackColor) {
            return new ProgressIndicatorDto(progress, fillColor, trackColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressIndicatorDto)) {
                return false;
            }
            ProgressIndicatorDto progressIndicatorDto = (ProgressIndicatorDto) other;
            return Double.compare(this.progress, progressIndicatorDto.progress) == 0 && jl40.l(this.fillColor, progressIndicatorDto.fillColor) && jl40.l(this.trackColor, progressIndicatorDto.trackColor);
        }

        public final ColorDto getFillColor() {
            return this.fillColor;
        }

        public final double getProgress() {
            return this.progress;
        }

        public final ColorDto getTrackColor() {
            return this.trackColor;
        }

        public int hashCode() {
            return this.trackColor.hashCode() + ((this.fillColor.hashCode() + (Double.hashCode(this.progress) * 31)) * 31);
        }

        public String toString() {
            return "ProgressIndicatorDto(progress=" + this.progress + ", fillColor=" + this.fillColor + ", trackColor=" + this.trackColor + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/missions/MissionProgressDto$TypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "MISSION_PROGRESS", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @Json(name = "mission_progress")
        public static final TypeDto MISSION_PROGRESS = new TypeDto("MISSION_PROGRESS", 0);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{MISSION_PROGRESS};
        }

        static {
            TypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    public MissionProgressDto(@Json(name = "type") TypeDto typeDto, @Json(name = "icon") IconDto iconDto, @Json(name = "badge") BadgeDto badgeDto, @Json(name = "progress_indicator") ProgressIndicatorDto progressIndicatorDto) {
        this.type = typeDto;
        this.icon = iconDto;
        this.badge = badgeDto;
        this.progressIndicator = progressIndicatorDto;
    }

    public static /* synthetic */ MissionProgressDto copy$default(MissionProgressDto missionProgressDto, TypeDto typeDto, IconDto iconDto, BadgeDto badgeDto, ProgressIndicatorDto progressIndicatorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            typeDto = missionProgressDto.type;
        }
        if ((i & 2) != 0) {
            iconDto = missionProgressDto.icon;
        }
        if ((i & 4) != 0) {
            badgeDto = missionProgressDto.badge;
        }
        if ((i & 8) != 0) {
            progressIndicatorDto = missionProgressDto.progressIndicator;
        }
        return missionProgressDto.copy(typeDto, iconDto, badgeDto, progressIndicatorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDto getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDto getBadge() {
        return this.badge;
    }

    /* renamed from: component4, reason: from getter */
    public final ProgressIndicatorDto getProgressIndicator() {
        return this.progressIndicator;
    }

    public final MissionProgressDto copy(@Json(name = "type") TypeDto type, @Json(name = "icon") IconDto icon, @Json(name = "badge") BadgeDto badge, @Json(name = "progress_indicator") ProgressIndicatorDto progressIndicator) {
        return new MissionProgressDto(type, icon, badge, progressIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionProgressDto)) {
            return false;
        }
        MissionProgressDto missionProgressDto = (MissionProgressDto) other;
        return this.type == missionProgressDto.type && jl40.l(this.icon, missionProgressDto.icon) && jl40.l(this.badge, missionProgressDto.badge) && jl40.l(this.progressIndicator, missionProgressDto.progressIndicator);
    }

    public final BadgeDto getBadge() {
        return this.badge;
    }

    public final IconDto getIcon() {
        return this.icon;
    }

    public final ProgressIndicatorDto getProgressIndicator() {
        return this.progressIndicator;
    }

    public final TypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        return this.progressIndicator.hashCode() + ((this.badge.hashCode() + ((this.icon.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MissionProgressDto(type=" + this.type + ", icon=" + this.icon + ", badge=" + this.badge + ", progressIndicator=" + this.progressIndicator + Extension.C_BRAKE;
    }
}
