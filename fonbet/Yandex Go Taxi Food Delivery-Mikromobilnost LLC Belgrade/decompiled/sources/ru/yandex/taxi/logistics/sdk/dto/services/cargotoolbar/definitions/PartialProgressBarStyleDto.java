package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PartialProgressBarStyleDto;", "", "progressBarColor", "", "progressBarFillColor", "partialsCount", "", "partialsSidesStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PartialProgressBarStyleDto$PartialsSidesStyleDto;", "spaceBetweenPartials", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PartialProgressBarStyleDto$PartialsSidesStyleDto;I)V", "getProgressBarColor", "()Ljava/lang/String;", "getProgressBarFillColor", "getPartialsCount", "()I", "getPartialsSidesStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PartialProgressBarStyleDto$PartialsSidesStyleDto;", "getSpaceBetweenPartials", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "PartialsSidesStyleDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PartialProgressBarStyleDto {
    private final int partialsCount;
    private final PartialsSidesStyleDto partialsSidesStyle;
    private final String progressBarColor;
    private final String progressBarFillColor;
    private final int spaceBetweenPartials;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PartialProgressBarStyleDto$PartialsSidesStyleDto;", "", "<init>", "(Ljava/lang/String;I)V", "SQUARE", "ROUNDED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PartialsSidesStyleDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PartialsSidesStyleDto[] $VALUES;

        @Json(name = "square")
        public static final PartialsSidesStyleDto SQUARE = new PartialsSidesStyleDto("SQUARE", 0);

        @Json(name = "rounded")
        public static final PartialsSidesStyleDto ROUNDED = new PartialsSidesStyleDto("ROUNDED", 1);

        private static final /* synthetic */ PartialsSidesStyleDto[] $values() {
            return new PartialsSidesStyleDto[]{SQUARE, ROUNDED};
        }

        static {
            PartialsSidesStyleDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PartialsSidesStyleDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PartialsSidesStyleDto valueOf(String str) {
            return (PartialsSidesStyleDto) Enum.valueOf(PartialsSidesStyleDto.class, str);
        }

        public static PartialsSidesStyleDto[] values() {
            return (PartialsSidesStyleDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PartialProgressBarStyleDto(String str, String str2, int i, PartialsSidesStyleDto partialsSidesStyleDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, partialsSidesStyleDto, (i3 & 16) != 0 ? 4 : i2);
    }

    public static /* synthetic */ PartialProgressBarStyleDto copy$default(PartialProgressBarStyleDto partialProgressBarStyleDto, String str, String str2, int i, PartialsSidesStyleDto partialsSidesStyleDto, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = partialProgressBarStyleDto.progressBarColor;
        }
        if ((i3 & 2) != 0) {
            str2 = partialProgressBarStyleDto.progressBarFillColor;
        }
        if ((i3 & 4) != 0) {
            i = partialProgressBarStyleDto.partialsCount;
        }
        if ((i3 & 8) != 0) {
            partialsSidesStyleDto = partialProgressBarStyleDto.partialsSidesStyle;
        }
        if ((i3 & 16) != 0) {
            i2 = partialProgressBarStyleDto.spaceBetweenPartials;
        }
        int i4 = i2;
        int i5 = i;
        return partialProgressBarStyleDto.copy(str, str2, i5, partialsSidesStyleDto, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProgressBarFillColor() {
        return this.progressBarFillColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPartialsCount() {
        return this.partialsCount;
    }

    /* renamed from: component4, reason: from getter */
    public final PartialsSidesStyleDto getPartialsSidesStyle() {
        return this.partialsSidesStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSpaceBetweenPartials() {
        return this.spaceBetweenPartials;
    }

    public final PartialProgressBarStyleDto copy(@Json(name = "progress_bar_color") String progressBarColor, @Json(name = "progress_bar_fill_color") String progressBarFillColor, @Json(name = "partials_count") int partialsCount, @Json(name = "partials_sides_style") PartialsSidesStyleDto partialsSidesStyle, @Json(name = "space_between_partials") int spaceBetweenPartials) {
        return new PartialProgressBarStyleDto(progressBarColor, progressBarFillColor, partialsCount, partialsSidesStyle, spaceBetweenPartials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartialProgressBarStyleDto)) {
            return false;
        }
        PartialProgressBarStyleDto partialProgressBarStyleDto = (PartialProgressBarStyleDto) other;
        return jl40.l(this.progressBarColor, partialProgressBarStyleDto.progressBarColor) && jl40.l(this.progressBarFillColor, partialProgressBarStyleDto.progressBarFillColor) && this.partialsCount == partialProgressBarStyleDto.partialsCount && this.partialsSidesStyle == partialProgressBarStyleDto.partialsSidesStyle && this.spaceBetweenPartials == partialProgressBarStyleDto.spaceBetweenPartials;
    }

    public final int getPartialsCount() {
        return this.partialsCount;
    }

    public final PartialsSidesStyleDto getPartialsSidesStyle() {
        return this.partialsSidesStyle;
    }

    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    public final String getProgressBarFillColor() {
        return this.progressBarFillColor;
    }

    public final int getSpaceBetweenPartials() {
        return this.spaceBetweenPartials;
    }

    public int hashCode() {
        int b = oyr.b(this.partialsCount, unr0.b(this.progressBarColor.hashCode() * 31, 31, this.progressBarFillColor), 31);
        PartialsSidesStyleDto partialsSidesStyleDto = this.partialsSidesStyle;
        return Integer.hashCode(this.spaceBetweenPartials) + ((b + (partialsSidesStyleDto == null ? 0 : partialsSidesStyleDto.hashCode())) * 31);
    }

    public String toString() {
        String str = this.progressBarColor;
        String str2 = this.progressBarFillColor;
        int i = this.partialsCount;
        PartialsSidesStyleDto partialsSidesStyleDto = this.partialsSidesStyle;
        int i2 = this.spaceBetweenPartials;
        StringBuilder v = b64.v("PartialProgressBarStyleDto(progressBarColor=", str, ", progressBarFillColor=", str2, ", partialsCount=");
        v.append(i);
        v.append(", partialsSidesStyle=");
        v.append(partialsSidesStyleDto);
        v.append(", spaceBetweenPartials=");
        return oyr.m(i2, Extension.C_BRAKE, v);
    }

    public PartialProgressBarStyleDto(@Json(name = "progress_bar_color") String str, @Json(name = "progress_bar_fill_color") String str2, @Json(name = "partials_count") int i, @Json(name = "partials_sides_style") PartialsSidesStyleDto partialsSidesStyleDto, @Json(name = "space_between_partials") int i2) {
        this.progressBarColor = str;
        this.progressBarFillColor = str2;
        this.partialsCount = i;
        this.partialsSidesStyle = partialsSidesStyleDto;
        this.spaceBetweenPartials = i2;
    }
}
