package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;", "", "SlotTrail_NavDto", "SlotTrail_SwitchDto", "Unknown_SlotTrailDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$SlotTrail_NavDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$SlotTrail_SwitchDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$Unknown_SlotTrailDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class SlotTrailDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$SlotTrail_NavDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailNavDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailNavDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailNavDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$SlotTrail_NavDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotTrail_NavDto extends SlotTrailDto {
        public final String a;
        public final TrailNavDto b;

        public SlotTrail_NavDto(@Json(name = "type") String str, TrailNavDto trailNavDto) {
            this.a = str;
            this.b = trailNavDto;
        }

        public final SlotTrail_NavDto copy(@Json(name = "type") String type, TrailNavDto value) {
            return new SlotTrail_NavDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotTrail_NavDto)) {
                return false;
            }
            SlotTrail_NavDto slotTrail_NavDto = (SlotTrail_NavDto) obj;
            return this.a.equals(slotTrail_NavDto.a) && this.b.equals(slotTrail_NavDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SlotTrail_NavDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$SlotTrail_SwitchDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailSwitchControlDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailSwitchControlDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailSwitchControlDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$SlotTrail_SwitchDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotTrail_SwitchDto extends SlotTrailDto {
        public final String a;
        public final TrailSwitchControlDto b;

        public SlotTrail_SwitchDto(@Json(name = "type") String str, TrailSwitchControlDto trailSwitchControlDto) {
            this.a = str;
            this.b = trailSwitchControlDto;
        }

        public final SlotTrail_SwitchDto copy(@Json(name = "type") String type, TrailSwitchControlDto value) {
            return new SlotTrail_SwitchDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotTrail_SwitchDto)) {
                return false;
            }
            SlotTrail_SwitchDto slotTrail_SwitchDto = (SlotTrail_SwitchDto) obj;
            return this.a.equals(slotTrail_SwitchDto.a) && this.b.equals(slotTrail_SwitchDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SlotTrail_SwitchDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$Unknown_SlotTrailDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/SlotTrailDto$Unknown_SlotTrailDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_SlotTrailDto extends SlotTrailDto {
        public final String a;

        public Unknown_SlotTrailDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_SlotTrailDto copy(@Json(name = "type") String type) {
            return new Unknown_SlotTrailDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_SlotTrailDto) && jl40.l(this.a, ((Unknown_SlotTrailDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_SlotTrailDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_SlotTrailDto() {
            this(0);
        }

        public /* synthetic */ Unknown_SlotTrailDto(int i) {
            this("unknown");
        }
    }
}
