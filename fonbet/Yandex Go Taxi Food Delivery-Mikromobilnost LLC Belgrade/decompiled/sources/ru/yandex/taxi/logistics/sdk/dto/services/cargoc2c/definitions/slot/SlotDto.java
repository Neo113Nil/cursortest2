package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail.SlotTrailDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00010Bc\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Je\u0010(\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "", "lead", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;", "body1", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;", "body2", "body3", "trail1", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotStyleDto;", "size", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto$SizeDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto$SizeDto;)V", "getLead", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;", "getBody1", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotBodyDto;", "getBody2", "getBody3", "getTrail1", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotStyleDto;", "getSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto$SizeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SizeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SlotDto {
    private final ActionDto action;
    private final SlotBodyDto body1;
    private final SlotBodyDto body2;
    private final SlotBodyDto body3;
    private final SlotLeadDto lead;
    private final SizeDto size;
    private final SlotStyleDto style;
    private final SlotTrailDto trail1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto$SizeDto;", "", "<init>", "(Ljava/lang/String;I)V", "XS", "S", "M", "L", "XL", "XXL", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @Json(name = "xs")
        public static final SizeDto XS = new SizeDto("XS", 0);

        @Json(name = "s")
        public static final SizeDto S = new SizeDto("S", 1);

        @Json(name = "m")
        public static final SizeDto M = new SizeDto("M", 2);

        @Json(name = "l")
        public static final SizeDto L = new SizeDto("L", 3);

        @Json(name = "xl")
        public static final SizeDto XL = new SizeDto("XL", 4);

        @Json(name = "xxl")
        public static final SizeDto XXL = new SizeDto("XXL", 5);

        private static final /* synthetic */ SizeDto[] $values() {
            return new SizeDto[]{XS, S, M, L, XL, XXL};
        }

        static {
            SizeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private SizeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SlotDto(SlotLeadDto slotLeadDto, SlotBodyDto slotBodyDto, SlotBodyDto slotBodyDto2, SlotBodyDto slotBodyDto3, SlotTrailDto slotTrailDto, ActionDto actionDto, SlotStyleDto slotStyleDto, SizeDto sizeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotLeadDto, slotBodyDto, slotBodyDto2, slotBodyDto3, slotTrailDto, actionDto, slotStyleDto, (i & 128) != 0 ? SizeDto.L : sizeDto);
    }

    public static /* synthetic */ SlotDto copy$default(SlotDto slotDto, SlotLeadDto slotLeadDto, SlotBodyDto slotBodyDto, SlotBodyDto slotBodyDto2, SlotBodyDto slotBodyDto3, SlotTrailDto slotTrailDto, ActionDto actionDto, SlotStyleDto slotStyleDto, SizeDto sizeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            slotLeadDto = slotDto.lead;
        }
        if ((i & 2) != 0) {
            slotBodyDto = slotDto.body1;
        }
        if ((i & 4) != 0) {
            slotBodyDto2 = slotDto.body2;
        }
        if ((i & 8) != 0) {
            slotBodyDto3 = slotDto.body3;
        }
        if ((i & 16) != 0) {
            slotTrailDto = slotDto.trail1;
        }
        if ((i & 32) != 0) {
            actionDto = slotDto.action;
        }
        if ((i & 64) != 0) {
            slotStyleDto = slotDto.style;
        }
        if ((i & 128) != 0) {
            sizeDto = slotDto.size;
        }
        SlotStyleDto slotStyleDto2 = slotStyleDto;
        SizeDto sizeDto2 = sizeDto;
        SlotTrailDto slotTrailDto2 = slotTrailDto;
        ActionDto actionDto2 = actionDto;
        return slotDto.copy(slotLeadDto, slotBodyDto, slotBodyDto2, slotBodyDto3, slotTrailDto2, actionDto2, slotStyleDto2, sizeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final SlotLeadDto getLead() {
        return this.lead;
    }

    /* renamed from: component2, reason: from getter */
    public final SlotBodyDto getBody1() {
        return this.body1;
    }

    /* renamed from: component3, reason: from getter */
    public final SlotBodyDto getBody2() {
        return this.body2;
    }

    /* renamed from: component4, reason: from getter */
    public final SlotBodyDto getBody3() {
        return this.body3;
    }

    /* renamed from: component5, reason: from getter */
    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    /* renamed from: component6, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final SlotStyleDto getStyle() {
        return this.style;
    }

    /* renamed from: component8, reason: from getter */
    public final SizeDto getSize() {
        return this.size;
    }

    public final SlotDto copy(@Json(name = "lead") SlotLeadDto lead, @Json(name = "body1") SlotBodyDto body1, @Json(name = "body2") SlotBodyDto body2, @Json(name = "body3") SlotBodyDto body3, @Json(name = "trail1") SlotTrailDto trail1, @Json(name = "action") ActionDto action, @Json(name = "style") SlotStyleDto style, @Json(name = "size") SizeDto size) {
        return new SlotDto(lead, body1, body2, body3, trail1, action, style, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotDto)) {
            return false;
        }
        SlotDto slotDto = (SlotDto) other;
        return jl40.l(this.lead, slotDto.lead) && jl40.l(this.body1, slotDto.body1) && jl40.l(this.body2, slotDto.body2) && jl40.l(this.body3, slotDto.body3) && jl40.l(this.trail1, slotDto.trail1) && jl40.l(this.action, slotDto.action) && jl40.l(this.style, slotDto.style) && this.size == slotDto.size;
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final SlotBodyDto getBody1() {
        return this.body1;
    }

    public final SlotBodyDto getBody2() {
        return this.body2;
    }

    public final SlotBodyDto getBody3() {
        return this.body3;
    }

    public final SlotLeadDto getLead() {
        return this.lead;
    }

    public final SizeDto getSize() {
        return this.size;
    }

    public final SlotStyleDto getStyle() {
        return this.style;
    }

    public final SlotTrailDto getTrail1() {
        return this.trail1;
    }

    public int hashCode() {
        SlotLeadDto slotLeadDto = this.lead;
        int hashCode = (this.body1.hashCode() + ((slotLeadDto == null ? 0 : slotLeadDto.hashCode()) * 31)) * 31;
        SlotBodyDto slotBodyDto = this.body2;
        int hashCode2 = (hashCode + (slotBodyDto == null ? 0 : slotBodyDto.hashCode())) * 31;
        SlotBodyDto slotBodyDto2 = this.body3;
        int hashCode3 = (hashCode2 + (slotBodyDto2 == null ? 0 : slotBodyDto2.hashCode())) * 31;
        SlotTrailDto slotTrailDto = this.trail1;
        int hashCode4 = (hashCode3 + (slotTrailDto == null ? 0 : slotTrailDto.hashCode())) * 31;
        ActionDto actionDto = this.action;
        int hashCode5 = (hashCode4 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
        SlotStyleDto slotStyleDto = this.style;
        return this.size.hashCode() + ((hashCode5 + (slotStyleDto != null ? slotStyleDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "SlotDto(lead=" + this.lead + ", body1=" + this.body1 + ", body2=" + this.body2 + ", body3=" + this.body3 + ", trail1=" + this.trail1 + ", action=" + this.action + ", style=" + this.style + ", size=" + this.size + Extension.C_BRAKE;
    }

    public SlotDto(@Json(name = "lead") SlotLeadDto slotLeadDto, @Json(name = "body1") SlotBodyDto slotBodyDto, @Json(name = "body2") SlotBodyDto slotBodyDto2, @Json(name = "body3") SlotBodyDto slotBodyDto3, @Json(name = "trail1") SlotTrailDto slotTrailDto, @Json(name = "action") ActionDto actionDto, @Json(name = "style") SlotStyleDto slotStyleDto, @Json(name = "size") SizeDto sizeDto) {
        this.lead = slotLeadDto;
        this.body1 = slotBodyDto;
        this.body2 = slotBodyDto2;
        this.body3 = slotBodyDto3;
        this.trail1 = slotTrailDto;
        this.action = actionDto;
        this.style = slotStyleDto;
        this.size = sizeDto;
    }
}
