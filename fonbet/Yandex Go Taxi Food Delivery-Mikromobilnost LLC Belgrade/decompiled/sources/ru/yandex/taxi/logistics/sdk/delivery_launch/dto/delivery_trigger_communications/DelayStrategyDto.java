package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto$TypeDto;", "delayMinutes", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto$TypeDto;I)V", "getType", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto$TypeDto;", "getDelayMinutes", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "TypeDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DelayStrategyDto {
    private final int delayMinutes;
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto$TypeDto;", "", "DELAY", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @Json(name = "delay")
        public static final TypeDto DELAY;

        static {
            TypeDto typeDto = new TypeDto("DELAY", 0);
            DELAY = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = a.a(typeDtoArr);
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    public DelayStrategyDto(@Json(name = "type") TypeDto typeDto, @Json(name = "delay_minutes") int i) {
        this.type = typeDto;
        this.delayMinutes = i;
    }

    public static /* synthetic */ DelayStrategyDto copy$default(DelayStrategyDto delayStrategyDto, TypeDto typeDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            typeDto = delayStrategyDto.type;
        }
        if ((i2 & 2) != 0) {
            i = delayStrategyDto.delayMinutes;
        }
        return delayStrategyDto.copy(typeDto, i);
    }

    /* renamed from: component1, reason: from getter */
    public final TypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDelayMinutes() {
        return this.delayMinutes;
    }

    public final DelayStrategyDto copy(@Json(name = "type") TypeDto type, @Json(name = "delay_minutes") int delayMinutes) {
        return new DelayStrategyDto(type, delayMinutes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelayStrategyDto)) {
            return false;
        }
        DelayStrategyDto delayStrategyDto = (DelayStrategyDto) other;
        return this.type == delayStrategyDto.type && this.delayMinutes == delayStrategyDto.delayMinutes;
    }

    public final int getDelayMinutes() {
        return this.delayMinutes;
    }

    public final TypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.delayMinutes) + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "DelayStrategyDto(type=" + this.type + ", delayMinutes=" + this.delayMinutes + Extension.C_BRAKE;
    }
}
