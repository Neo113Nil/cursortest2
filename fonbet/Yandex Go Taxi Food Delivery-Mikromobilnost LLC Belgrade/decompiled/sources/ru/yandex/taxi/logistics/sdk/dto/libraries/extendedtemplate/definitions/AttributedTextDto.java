package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "truncationMode", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto$TruncationModeDto;", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto$TruncationModeDto;)V", "getItems", "()Ljava/util/List;", "getTruncationMode", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto$TruncationModeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TruncationModeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AttributedTextDto {
    private final List<ATUnitDto> items;
    private final TruncationModeDto truncationMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto$TruncationModeDto;", "", "<init>", "(Ljava/lang/String;I)V", "HEAD", "TAIL", "MIDDLE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TruncationModeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TruncationModeDto[] $VALUES;

        @Json(name = "head")
        public static final TruncationModeDto HEAD = new TruncationModeDto("HEAD", 0);

        @Json(name = "tail")
        public static final TruncationModeDto TAIL = new TruncationModeDto("TAIL", 1);

        @Json(name = "middle")
        public static final TruncationModeDto MIDDLE = new TruncationModeDto("MIDDLE", 2);

        private static final /* synthetic */ TruncationModeDto[] $values() {
            return new TruncationModeDto[]{HEAD, TAIL, MIDDLE};
        }

        static {
            TruncationModeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private TruncationModeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TruncationModeDto valueOf(String str) {
            return (TruncationModeDto) Enum.valueOf(TruncationModeDto.class, str);
        }

        public static TruncationModeDto[] values() {
            return (TruncationModeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttributedTextDto(@Json(name = "items") List<? extends ATUnitDto> list, @Json(name = "truncation_mode") TruncationModeDto truncationModeDto) {
        this.items = list;
        this.truncationMode = truncationModeDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttributedTextDto copy$default(AttributedTextDto attributedTextDto, List list, TruncationModeDto truncationModeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = attributedTextDto.items;
        }
        if ((i & 2) != 0) {
            truncationModeDto = attributedTextDto.truncationMode;
        }
        return attributedTextDto.copy(list, truncationModeDto);
    }

    public final List<ATUnitDto> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final TruncationModeDto getTruncationMode() {
        return this.truncationMode;
    }

    public final AttributedTextDto copy(@Json(name = "items") List<? extends ATUnitDto> items, @Json(name = "truncation_mode") TruncationModeDto truncationMode) {
        return new AttributedTextDto(items, truncationMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributedTextDto)) {
            return false;
        }
        AttributedTextDto attributedTextDto = (AttributedTextDto) other;
        return jl40.l(this.items, attributedTextDto.items) && this.truncationMode == attributedTextDto.truncationMode;
    }

    public final List<ATUnitDto> getItems() {
        return this.items;
    }

    public final TruncationModeDto getTruncationMode() {
        return this.truncationMode;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        TruncationModeDto truncationModeDto = this.truncationMode;
        return hashCode + (truncationModeDto == null ? 0 : truncationModeDto.hashCode());
    }

    public String toString() {
        return "AttributedTextDto(items=" + this.items + ", truncationMode=" + this.truncationMode + Extension.C_BRAKE;
    }
}
