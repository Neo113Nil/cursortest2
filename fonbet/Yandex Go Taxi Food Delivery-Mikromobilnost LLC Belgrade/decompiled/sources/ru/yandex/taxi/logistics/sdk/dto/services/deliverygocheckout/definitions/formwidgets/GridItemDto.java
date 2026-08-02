package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto;", "", "position", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutPositionDto;", "content", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto;", "size", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;)V", "getPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutPositionDto;", "getContent", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto;", "getSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutSizeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ContentDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GridItemDto {
    private final ContentDto content;
    private final GridLayoutPositionDto position;
    private final GridLayoutSizeDto size;

    public GridItemDto(@Json(name = "position") GridLayoutPositionDto gridLayoutPositionDto, @Json(name = "content") ContentDto contentDto, @Json(name = "size") GridLayoutSizeDto gridLayoutSizeDto) {
        this.position = gridLayoutPositionDto;
        this.content = contentDto;
        this.size = gridLayoutSizeDto;
    }

    public static /* synthetic */ GridItemDto copy$default(GridItemDto gridItemDto, GridLayoutPositionDto gridLayoutPositionDto, ContentDto contentDto, GridLayoutSizeDto gridLayoutSizeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            gridLayoutPositionDto = gridItemDto.position;
        }
        if ((i & 2) != 0) {
            contentDto = gridItemDto.content;
        }
        if ((i & 4) != 0) {
            gridLayoutSizeDto = gridItemDto.size;
        }
        return gridItemDto.copy(gridLayoutPositionDto, contentDto, gridLayoutSizeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final GridLayoutPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final ContentDto getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final GridLayoutSizeDto getSize() {
        return this.size;
    }

    public final GridItemDto copy(@Json(name = "position") GridLayoutPositionDto position, @Json(name = "content") ContentDto content, @Json(name = "size") GridLayoutSizeDto size) {
        return new GridItemDto(position, content, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridItemDto)) {
            return false;
        }
        GridItemDto gridItemDto = (GridItemDto) other;
        return jl40.l(this.position, gridItemDto.position) && jl40.l(this.content, gridItemDto.content) && jl40.l(this.size, gridItemDto.size);
    }

    public final ContentDto getContent() {
        return this.content;
    }

    public final GridLayoutPositionDto getPosition() {
        return this.position;
    }

    public final GridLayoutSizeDto getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + (this.position.hashCode() * 31)) * 31;
        GridLayoutSizeDto gridLayoutSizeDto = this.size;
        return hashCode + (gridLayoutSizeDto == null ? 0 : gridLayoutSizeDto.hashCode());
    }

    public String toString() {
        return "GridItemDto(position=" + this.position + ", content=" + this.content + ", size=" + this.size + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto;", "", "Content_ShortcutDto", "Unknown_ContentDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto$Content_ShortcutDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto$Unknown_ContentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ContentDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto$Content_ShortcutDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto$Content_ShortcutDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Content_ShortcutDto extends ContentDto {
            public final String a;
            public final ShortcutWidgetDto b;

            public Content_ShortcutDto(@Json(name = "type") String str, ShortcutWidgetDto shortcutWidgetDto) {
                this.a = str;
                this.b = shortcutWidgetDto;
            }

            public final Content_ShortcutDto copy(@Json(name = "type") String type, ShortcutWidgetDto value) {
                return new Content_ShortcutDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content_ShortcutDto)) {
                    return false;
                }
                Content_ShortcutDto content_ShortcutDto = (Content_ShortcutDto) obj;
                return this.a.equals(content_ShortcutDto.a) && this.b.equals(content_ShortcutDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Content_ShortcutDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto$Unknown_ContentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridItemDto$ContentDto$Unknown_ContentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_ContentDto extends ContentDto {
            public final String a;

            public Unknown_ContentDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_ContentDto copy(@Json(name = "type") String type) {
                return new Unknown_ContentDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_ContentDto) && jl40.l(this.a, ((Unknown_ContentDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_ContentDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_ContentDto() {
                this(0);
            }

            public /* synthetic */ Unknown_ContentDto(int i) {
                this("unknown");
            }
        }
    }
}
