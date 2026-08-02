package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto;", "", "title", "", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ItemsDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DetailsSectionItemAccordionDto {
    private final List<ItemsDto> items;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DetailsSectionItemAccordionDto(@Json(name = "title") String str, @Json(name = "items") List<? extends ItemsDto> list) {
        this.title = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailsSectionItemAccordionDto copy$default(DetailsSectionItemAccordionDto detailsSectionItemAccordionDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailsSectionItemAccordionDto.title;
        }
        if ((i & 2) != 0) {
            list = detailsSectionItemAccordionDto.items;
        }
        return detailsSectionItemAccordionDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ItemsDto> component2() {
        return this.items;
    }

    public final DetailsSectionItemAccordionDto copy(@Json(name = "title") String title, @Json(name = "items") List<? extends ItemsDto> items) {
        return new DetailsSectionItemAccordionDto(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsSectionItemAccordionDto)) {
            return false;
        }
        DetailsSectionItemAccordionDto detailsSectionItemAccordionDto = (DetailsSectionItemAccordionDto) other;
        return jl40.l(this.title, detailsSectionItemAccordionDto.title) && jl40.l(this.items, detailsSectionItemAccordionDto.items);
    }

    public final List<ItemsDto> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("DetailsSectionItemAccordionDto(title=", this.title, ", items=", Extension.C_BRAKE, this.items);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto;", "", "Items_SubtitleDto", "Items_SmallTitleDto", "Items_TextDto", "Unknown_ItemsDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_SmallTitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_SubtitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Unknown_ItemsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ItemsDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_SmallTitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSmallTitleDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSmallTitleDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSmallTitleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_SmallTitleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Items_SmallTitleDto extends ItemsDto {
            public final String a;
            public final DetailsSectionItemSmallTitleDto b;

            public Items_SmallTitleDto(@Json(name = "type") String str, DetailsSectionItemSmallTitleDto detailsSectionItemSmallTitleDto) {
                this.a = str;
                this.b = detailsSectionItemSmallTitleDto;
            }

            public final Items_SmallTitleDto copy(@Json(name = "type") String type, DetailsSectionItemSmallTitleDto value) {
                return new Items_SmallTitleDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Items_SmallTitleDto)) {
                    return false;
                }
                Items_SmallTitleDto items_SmallTitleDto = (Items_SmallTitleDto) obj;
                return this.a.equals(items_SmallTitleDto.a) && this.b.equals(items_SmallTitleDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Items_SmallTitleDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_SubtitleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSubtitleDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSubtitleDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemSubtitleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_SubtitleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Items_SubtitleDto extends ItemsDto {
            public final String a;
            public final DetailsSectionItemSubtitleDto b;

            public Items_SubtitleDto(@Json(name = "type") String str, DetailsSectionItemSubtitleDto detailsSectionItemSubtitleDto) {
                this.a = str;
                this.b = detailsSectionItemSubtitleDto;
            }

            public final Items_SubtitleDto copy(@Json(name = "type") String type, DetailsSectionItemSubtitleDto value) {
                return new Items_SubtitleDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Items_SubtitleDto)) {
                    return false;
                }
                Items_SubtitleDto items_SubtitleDto = (Items_SubtitleDto) obj;
                return this.a.equals(items_SubtitleDto.a) && this.b.equals(items_SubtitleDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Items_SubtitleDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemTextDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemTextDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemTextDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Items_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Items_TextDto extends ItemsDto {
            public final String a;
            public final DetailsSectionItemTextDto b;

            public Items_TextDto(@Json(name = "type") String str, DetailsSectionItemTextDto detailsSectionItemTextDto) {
                this.a = str;
                this.b = detailsSectionItemTextDto;
            }

            public final Items_TextDto copy(@Json(name = "type") String type, DetailsSectionItemTextDto value) {
                return new Items_TextDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Items_TextDto)) {
                    return false;
                }
                Items_TextDto items_TextDto = (Items_TextDto) obj;
                return this.a.equals(items_TextDto.a) && this.b.equals(items_TextDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Items_TextDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Unknown_ItemsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto$Unknown_ItemsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_ItemsDto extends ItemsDto {
            public final String a;

            public Unknown_ItemsDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_ItemsDto copy(@Json(name = "type") String type) {
                return new Unknown_ItemsDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_ItemsDto) && jl40.l(this.a, ((Unknown_ItemsDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_ItemsDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_ItemsDto() {
                this(0);
            }

            public /* synthetic */ Unknown_ItemsDto(int i) {
                this("unknown");
            }
        }
    }
}
