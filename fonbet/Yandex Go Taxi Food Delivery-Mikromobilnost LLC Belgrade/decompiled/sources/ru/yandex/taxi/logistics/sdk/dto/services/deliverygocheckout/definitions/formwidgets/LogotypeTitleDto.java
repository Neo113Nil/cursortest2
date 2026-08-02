package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LogotypeTitleDto;", "", "typeface", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LogotypeTitleDto$TypefaceDto;", "text", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LogotypeTitleDto$TypefaceDto;Ljava/lang/String;)V", "getTypeface", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LogotypeTitleDto$TypefaceDto;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TypefaceDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LogotypeTitleDto {
    private final String text;
    private final TypefaceDto typeface;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LogotypeTitleDto$TypefaceDto;", "", "<init>", "(Ljava/lang/String;I)V", "LOGOTYPE_REGULAR", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TypefaceDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TypefaceDto[] $VALUES;

        @Json(name = "logotype_regular")
        public static final TypefaceDto LOGOTYPE_REGULAR = new TypefaceDto("LOGOTYPE_REGULAR", 0);

        private static final /* synthetic */ TypefaceDto[] $values() {
            return new TypefaceDto[]{LOGOTYPE_REGULAR};
        }

        static {
            TypefaceDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private TypefaceDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TypefaceDto valueOf(String str) {
            return (TypefaceDto) Enum.valueOf(TypefaceDto.class, str);
        }

        public static TypefaceDto[] values() {
            return (TypefaceDto[]) $VALUES.clone();
        }
    }

    public LogotypeTitleDto(@Json(name = "typeface") TypefaceDto typefaceDto, @Json(name = "text") String str) {
        this.typeface = typefaceDto;
        this.text = str;
    }

    public static /* synthetic */ LogotypeTitleDto copy$default(LogotypeTitleDto logotypeTitleDto, TypefaceDto typefaceDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            typefaceDto = logotypeTitleDto.typeface;
        }
        if ((i & 2) != 0) {
            str = logotypeTitleDto.text;
        }
        return logotypeTitleDto.copy(typefaceDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final TypefaceDto getTypeface() {
        return this.typeface;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final LogotypeTitleDto copy(@Json(name = "typeface") TypefaceDto typeface, @Json(name = "text") String text) {
        return new LogotypeTitleDto(typeface, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogotypeTitleDto)) {
            return false;
        }
        LogotypeTitleDto logotypeTitleDto = (LogotypeTitleDto) other;
        return this.typeface == logotypeTitleDto.typeface && jl40.l(this.text, logotypeTitleDto.text);
    }

    public final String getText() {
        return this.text;
    }

    public final TypefaceDto getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.typeface.hashCode() * 31);
    }

    public String toString() {
        return "LogotypeTitleDto(typeface=" + this.typeface + ", text=" + this.text + Extension.C_BRAKE;
    }
}
