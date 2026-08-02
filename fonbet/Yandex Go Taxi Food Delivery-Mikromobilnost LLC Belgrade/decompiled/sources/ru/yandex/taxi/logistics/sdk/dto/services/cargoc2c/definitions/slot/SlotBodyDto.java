package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;", "", "align", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ContentAlignmentDto;", "layoutPriority", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto$LayoutPriorityDto;", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ContentAlignmentDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto$LayoutPriorityDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getAlign", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/ContentAlignmentDto;", "getLayoutPriority", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto$LayoutPriorityDto;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LayoutPriorityDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SlotBodyDto {
    private final ContentAlignmentDto align;
    private final LayoutPriorityDto layoutPriority;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto$LayoutPriorityDto;", "", "<init>", "(Ljava/lang/String;I)V", "HIGH", "MEDIUM", "LOW", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutPriorityDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LayoutPriorityDto[] $VALUES;

        @Json(name = Constants.HIGH)
        public static final LayoutPriorityDto HIGH = new LayoutPriorityDto("HIGH", 0);

        @Json(name = "medium")
        public static final LayoutPriorityDto MEDIUM = new LayoutPriorityDto("MEDIUM", 1);

        @Json(name = Constants.LOW)
        public static final LayoutPriorityDto LOW = new LayoutPriorityDto("LOW", 2);

        private static final /* synthetic */ LayoutPriorityDto[] $values() {
            return new LayoutPriorityDto[]{HIGH, MEDIUM, LOW};
        }

        static {
            LayoutPriorityDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private LayoutPriorityDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static LayoutPriorityDto valueOf(String str) {
            return (LayoutPriorityDto) Enum.valueOf(LayoutPriorityDto.class, str);
        }

        public static LayoutPriorityDto[] values() {
            return (LayoutPriorityDto[]) $VALUES.clone();
        }
    }

    public SlotBodyDto(@Json(name = "align") ContentAlignmentDto contentAlignmentDto, @Json(name = "layout_priority") LayoutPriorityDto layoutPriorityDto, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2) {
        this.align = contentAlignmentDto;
        this.layoutPriority = layoutPriorityDto;
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
    }

    public static /* synthetic */ SlotBodyDto copy$default(SlotBodyDto slotBodyDto, ContentAlignmentDto contentAlignmentDto, LayoutPriorityDto layoutPriorityDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            contentAlignmentDto = slotBodyDto.align;
        }
        if ((i & 2) != 0) {
            layoutPriorityDto = slotBodyDto.layoutPriority;
        }
        if ((i & 4) != 0) {
            attributedTextDto = slotBodyDto.title;
        }
        if ((i & 8) != 0) {
            attributedTextDto2 = slotBodyDto.subtitle;
        }
        return slotBodyDto.copy(contentAlignmentDto, layoutPriorityDto, attributedTextDto, attributedTextDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentAlignmentDto getAlign() {
        return this.align;
    }

    /* renamed from: component2, reason: from getter */
    public final LayoutPriorityDto getLayoutPriority() {
        return this.layoutPriority;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final SlotBodyDto copy(@Json(name = "align") ContentAlignmentDto align, @Json(name = "layout_priority") LayoutPriorityDto layoutPriority, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle) {
        return new SlotBodyDto(align, layoutPriority, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotBodyDto)) {
            return false;
        }
        SlotBodyDto slotBodyDto = (SlotBodyDto) other;
        return this.align == slotBodyDto.align && this.layoutPriority == slotBodyDto.layoutPriority && jl40.l(this.title, slotBodyDto.title) && jl40.l(this.subtitle, slotBodyDto.subtitle);
    }

    public final ContentAlignmentDto getAlign() {
        return this.align;
    }

    public final LayoutPriorityDto getLayoutPriority() {
        return this.layoutPriority;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.align.hashCode() * 31;
        LayoutPriorityDto layoutPriorityDto = this.layoutPriority;
        int e = ly3.e(this.title, (hashCode + (layoutPriorityDto == null ? 0 : layoutPriorityDto.hashCode())) * 31, 31);
        AttributedTextDto attributedTextDto = this.subtitle;
        return e + (attributedTextDto != null ? attributedTextDto.hashCode() : 0);
    }

    public String toString() {
        return "SlotBodyDto(align=" + this.align + ", layoutPriority=" + this.layoutPriority + ", title=" + this.title + ", subtitle=" + this.subtitle + Extension.C_BRAKE;
    }
}
