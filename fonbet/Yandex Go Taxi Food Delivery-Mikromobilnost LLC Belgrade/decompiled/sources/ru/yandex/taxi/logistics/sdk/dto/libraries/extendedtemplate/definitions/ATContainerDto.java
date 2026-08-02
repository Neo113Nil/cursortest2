package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto;", "", "groupAttributes", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$GroupAttributesDto;", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$GroupAttributesDto;Ljava/util/List;)V", "getGroupAttributes", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$GroupAttributesDto;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GroupAttributesDto", "ItemsDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ATContainerDto {
    private final GroupAttributesDto groupAttributes;
    private final List<ItemsDto> items;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$GroupAttributesDto;", "", "metaColor", "", "<init>", "(Ljava/lang/String;)V", "getMetaColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GroupAttributesDto {
        private final String metaColor;

        public GroupAttributesDto(@Json(name = "meta_color") String str) {
            this.metaColor = str;
        }

        public static /* synthetic */ GroupAttributesDto copy$default(GroupAttributesDto groupAttributesDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = groupAttributesDto.metaColor;
            }
            return groupAttributesDto.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMetaColor() {
            return this.metaColor;
        }

        public final GroupAttributesDto copy(@Json(name = "meta_color") String metaColor) {
            return new GroupAttributesDto(metaColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GroupAttributesDto) && jl40.l(this.metaColor, ((GroupAttributesDto) other).metaColor);
        }

        public final String getMetaColor() {
            return this.metaColor;
        }

        public int hashCode() {
            String str = this.metaColor;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return oyr.p("GroupAttributesDto(metaColor=", this.metaColor, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ATContainerDto(@Json(name = "group_attributes") GroupAttributesDto groupAttributesDto, @Json(name = "items") List<? extends ItemsDto> list) {
        this.groupAttributes = groupAttributesDto;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ATContainerDto copy$default(ATContainerDto aTContainerDto, GroupAttributesDto groupAttributesDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            groupAttributesDto = aTContainerDto.groupAttributes;
        }
        if ((i & 2) != 0) {
            list = aTContainerDto.items;
        }
        return aTContainerDto.copy(groupAttributesDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final GroupAttributesDto getGroupAttributes() {
        return this.groupAttributes;
    }

    public final List<ItemsDto> component2() {
        return this.items;
    }

    public final ATContainerDto copy(@Json(name = "group_attributes") GroupAttributesDto groupAttributes, @Json(name = "items") List<? extends ItemsDto> items) {
        return new ATContainerDto(groupAttributes, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ATContainerDto)) {
            return false;
        }
        ATContainerDto aTContainerDto = (ATContainerDto) other;
        return jl40.l(this.groupAttributes, aTContainerDto.groupAttributes) && jl40.l(this.items, aTContainerDto.items);
    }

    public final GroupAttributesDto getGroupAttributes() {
        return this.groupAttributes;
    }

    public final List<ItemsDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.groupAttributes.hashCode() * 31);
    }

    public String toString() {
        return "ATContainerDto(groupAttributes=" + this.groupAttributes + ", items=" + this.items + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto;", "", "Items_TextDto", "Items_LinkDto", "Items_ImageDto", "Unknown_ItemsDto", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_LinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Unknown_ItemsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ItemsDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_ImageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Items_ImageDto extends ItemsDto {
            public final String a;
            public final ATImagePropertyDto b;

            public Items_ImageDto(@Json(name = "type") String str, ATImagePropertyDto aTImagePropertyDto) {
                this.a = str;
                this.b = aTImagePropertyDto;
            }

            public final Items_ImageDto copy(@Json(name = "type") String type, ATImagePropertyDto value) {
                return new Items_ImageDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Items_ImageDto)) {
                    return false;
                }
                Items_ImageDto items_ImageDto = (Items_ImageDto) obj;
                return this.a.equals(items_ImageDto.a) && this.b.equals(items_ImageDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Items_ImageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_LinkDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATLinkPropertyDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_LinkDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Items_LinkDto extends ItemsDto {
            public final String a;
            public final ATLinkPropertyDto b;

            public Items_LinkDto(@Json(name = "type") String str, ATLinkPropertyDto aTLinkPropertyDto) {
                this.a = str;
                this.b = aTLinkPropertyDto;
            }

            public final Items_LinkDto copy(@Json(name = "type") String type, ATLinkPropertyDto value) {
                return new Items_LinkDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Items_LinkDto)) {
                    return false;
                }
                Items_LinkDto items_LinkDto = (Items_LinkDto) obj;
                return this.a.equals(items_LinkDto.a) && this.b.equals(items_LinkDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Items_LinkDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Items_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Items_TextDto extends ItemsDto {
            public final String a;
            public final ATTextPropertyDto b;

            public Items_TextDto(@Json(name = "type") String str, ATTextPropertyDto aTTextPropertyDto) {
                this.a = str;
                this.b = aTTextPropertyDto;
            }

            public final Items_TextDto copy(@Json(name = "type") String type, ATTextPropertyDto value) {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Unknown_ItemsDto;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto$Unknown_ItemsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
