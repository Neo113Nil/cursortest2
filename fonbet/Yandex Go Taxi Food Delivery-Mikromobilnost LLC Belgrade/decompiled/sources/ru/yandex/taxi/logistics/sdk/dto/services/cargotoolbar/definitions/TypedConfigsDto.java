package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto;", "", "version", "", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto$ItemsDto;", "<init>", "(ILjava/util/List;)V", "getVersion", "()I", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ItemsDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TypedConfigsDto {
    private final List<ItemsDto> items;
    private final int version;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/TypedConfigsDto$ItemsDto;", "", "name", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemsDto {
        private final String name;
        private final Object value;

        public ItemsDto(@Json(name = "name") String str, @Json(name = "value") Object obj) {
            this.name = str;
            this.value = obj;
        }

        public static /* synthetic */ ItemsDto copy$default(ItemsDto itemsDto, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = itemsDto.name;
            }
            if ((i & 2) != 0) {
                obj = itemsDto.value;
            }
            return itemsDto.copy(str, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final ItemsDto copy(@Json(name = "name") String name, @Json(name = "value") Object value) {
            return new ItemsDto(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemsDto)) {
                return false;
            }
            ItemsDto itemsDto = (ItemsDto) other;
            return jl40.l(this.name, itemsDto.name) && jl40.l(this.value, itemsDto.value);
        }

        public final String getName() {
            return this.name;
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return "ItemsDto(name=" + this.name + ", value=" + this.value + Extension.C_BRAKE;
        }
    }

    public TypedConfigsDto(@Json(name = "version") int i, @Json(name = "items") List<ItemsDto> list) {
        this.version = i;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypedConfigsDto copy$default(TypedConfigsDto typedConfigsDto, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = typedConfigsDto.version;
        }
        if ((i2 & 2) != 0) {
            list = typedConfigsDto.items;
        }
        return typedConfigsDto.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final List<ItemsDto> component2() {
        return this.items;
    }

    public final TypedConfigsDto copy(@Json(name = "version") int version, @Json(name = "items") List<ItemsDto> items) {
        return new TypedConfigsDto(version, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypedConfigsDto)) {
            return false;
        }
        TypedConfigsDto typedConfigsDto = (TypedConfigsDto) other;
        return this.version == typedConfigsDto.version && jl40.l(this.items, typedConfigsDto.items);
    }

    public final List<ItemsDto> getItems() {
        return this.items;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.version) * 31);
    }

    public String toString() {
        return "TypedConfigsDto(version=" + this.version + ", items=" + this.items + Extension.C_BRAKE;
    }
}
