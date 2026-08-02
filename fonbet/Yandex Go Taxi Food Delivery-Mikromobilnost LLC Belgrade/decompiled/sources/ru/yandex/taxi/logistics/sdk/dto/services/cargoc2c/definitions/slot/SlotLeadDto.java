package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;", "", "SlotLead_IconSpotDto", "SlotLead_IconDto", "Unknown_SlotLeadDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$SlotLead_IconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$SlotLead_IconSpotDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$Unknown_SlotLeadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class SlotLeadDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$SlotLead_IconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$SlotLead_IconDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotLead_IconDto extends SlotLeadDto {
        public final String a;
        public final LeadIconDto b;

        public SlotLead_IconDto(@Json(name = "type") String str, LeadIconDto leadIconDto) {
            this.a = str;
            this.b = leadIconDto;
        }

        public final SlotLead_IconDto copy(@Json(name = "type") String type, LeadIconDto value) {
            return new SlotLead_IconDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotLead_IconDto)) {
                return false;
            }
            SlotLead_IconDto slotLead_IconDto = (SlotLead_IconDto) obj;
            return this.a.equals(slotLead_IconDto.a) && this.b.equals(slotLead_IconDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SlotLead_IconDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$SlotLead_IconSpotDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconSpotDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconSpotDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/LeadIconSpotDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$SlotLead_IconSpotDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotLead_IconSpotDto extends SlotLeadDto {
        public final String a;
        public final LeadIconSpotDto b;

        public SlotLead_IconSpotDto(@Json(name = "type") String str, LeadIconSpotDto leadIconSpotDto) {
            this.a = str;
            this.b = leadIconSpotDto;
        }

        public final SlotLead_IconSpotDto copy(@Json(name = "type") String type, LeadIconSpotDto value) {
            return new SlotLead_IconSpotDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotLead_IconSpotDto)) {
                return false;
            }
            SlotLead_IconSpotDto slotLead_IconSpotDto = (SlotLead_IconSpotDto) obj;
            return this.a.equals(slotLead_IconSpotDto.a) && this.b.equals(slotLead_IconSpotDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SlotLead_IconSpotDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$Unknown_SlotLeadDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotLeadDto$Unknown_SlotLeadDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_SlotLeadDto extends SlotLeadDto {
        public final String a;

        public Unknown_SlotLeadDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_SlotLeadDto copy(@Json(name = "type") String type) {
            return new Unknown_SlotLeadDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_SlotLeadDto) && jl40.l(this.a, ((Unknown_SlotLeadDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_SlotLeadDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_SlotLeadDto() {
            this(0);
        }

        public /* synthetic */ Unknown_SlotLeadDto(int i) {
            this("unknown");
        }
    }
}
