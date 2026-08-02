package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto$TypeDto;", "value", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto$TypeDto;J)V", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto$TypeDto;", "getValue", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DefaultUserTipsDto {
    private final TypeDto type;
    private final long value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/DefaultUserTipsDto$TypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "PERCENT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @Json(name = "percent")
        public static final TypeDto PERCENT = new TypeDto("PERCENT", 0);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{PERCENT};
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

    public DefaultUserTipsDto(@Json(name = "type") TypeDto typeDto, @Json(name = "value") long j) {
        this.type = typeDto;
        this.value = j;
    }

    public static /* synthetic */ DefaultUserTipsDto copy$default(DefaultUserTipsDto defaultUserTipsDto, TypeDto typeDto, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            typeDto = defaultUserTipsDto.type;
        }
        if ((i & 2) != 0) {
            j = defaultUserTipsDto.value;
        }
        return defaultUserTipsDto.copy(typeDto, j);
    }

    /* renamed from: component1, reason: from getter */
    public final TypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final DefaultUserTipsDto copy(@Json(name = "type") TypeDto type, @Json(name = "value") long value) {
        return new DefaultUserTipsDto(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultUserTipsDto)) {
            return false;
        }
        DefaultUserTipsDto defaultUserTipsDto = (DefaultUserTipsDto) other;
        return this.type == defaultUserTipsDto.type && this.value == defaultUserTipsDto.value;
    }

    public final TypeDto getType() {
        return this.type;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value) + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "DefaultUserTipsDto(type=" + this.type + ", value=" + this.value + Extension.C_BRAKE;
    }
}
