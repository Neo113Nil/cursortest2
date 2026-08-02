package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto$TypeDto;", RemoteBioParameters.TIME, "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto$TypeDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;)V", "getType", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto$TypeDto;", "getTime", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/TimeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TypeDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FixedTimeStrategyDto {
    private final TimeDto time;
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto$TypeDto;", "", "FIXED_TIME", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @Json(name = "fixed_time")
        public static final TypeDto FIXED_TIME;

        static {
            TypeDto typeDto = new TypeDto("FIXED_TIME", 0);
            FIXED_TIME = typeDto;
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

    public FixedTimeStrategyDto(@Json(name = "type") TypeDto typeDto, @Json(name = "time") TimeDto timeDto) {
        this.type = typeDto;
        this.time = timeDto;
    }

    public static /* synthetic */ FixedTimeStrategyDto copy$default(FixedTimeStrategyDto fixedTimeStrategyDto, TypeDto typeDto, TimeDto timeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            typeDto = fixedTimeStrategyDto.type;
        }
        if ((i & 2) != 0) {
            timeDto = fixedTimeStrategyDto.time;
        }
        return fixedTimeStrategyDto.copy(typeDto, timeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final TimeDto getTime() {
        return this.time;
    }

    public final FixedTimeStrategyDto copy(@Json(name = "type") TypeDto type, @Json(name = "time") TimeDto time) {
        return new FixedTimeStrategyDto(type, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FixedTimeStrategyDto)) {
            return false;
        }
        FixedTimeStrategyDto fixedTimeStrategyDto = (FixedTimeStrategyDto) other;
        return this.type == fixedTimeStrategyDto.type && jl40.l(this.time, fixedTimeStrategyDto.time);
    }

    public final TimeDto getTime() {
        return this.time;
    }

    public final TypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        return this.time.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "FixedTimeStrategyDto(type=" + this.type + ", time=" + this.time + Extension.C_BRAKE;
    }
}
