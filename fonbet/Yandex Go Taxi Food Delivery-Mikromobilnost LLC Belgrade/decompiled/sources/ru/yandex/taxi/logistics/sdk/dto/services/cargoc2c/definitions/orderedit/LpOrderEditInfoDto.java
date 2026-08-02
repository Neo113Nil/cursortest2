package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto;", "", "LpOrderEditInfo_RecipientInfoDto", "LpOrderEditInfo_DestinationInfoDto", "LpOrderEditInfo_StoragePeriodDto", "Unknown_LpOrderEditInfoDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_DestinationInfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_RecipientInfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_StoragePeriodDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$Unknown_LpOrderEditInfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LpOrderEditInfoDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_RecipientInfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditRecipientInfoDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditRecipientInfoDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditRecipientInfoDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_RecipientInfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LpOrderEditInfo_RecipientInfoDto extends LpOrderEditInfoDto {
        public final String a;
        public final LpEditRecipientInfoDto b;

        public LpOrderEditInfo_RecipientInfoDto(@Json(name = "type") String str, LpEditRecipientInfoDto lpEditRecipientInfoDto) {
            this.a = str;
            this.b = lpEditRecipientInfoDto;
        }

        public final LpOrderEditInfo_RecipientInfoDto copy(@Json(name = "type") String type, LpEditRecipientInfoDto value) {
            return new LpOrderEditInfo_RecipientInfoDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LpOrderEditInfo_RecipientInfoDto)) {
                return false;
            }
            LpOrderEditInfo_RecipientInfoDto lpOrderEditInfo_RecipientInfoDto = (LpOrderEditInfo_RecipientInfoDto) obj;
            return jl40.l(this.a, lpOrderEditInfo_RecipientInfoDto.a) && jl40.l(this.b, lpOrderEditInfo_RecipientInfoDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LpOrderEditInfo_RecipientInfoDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$Unknown_LpOrderEditInfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$Unknown_LpOrderEditInfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_LpOrderEditInfoDto extends LpOrderEditInfoDto {
        public final String a;

        public Unknown_LpOrderEditInfoDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_LpOrderEditInfoDto copy(@Json(name = "type") String type) {
            return new Unknown_LpOrderEditInfoDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_LpOrderEditInfoDto) && jl40.l(this.a, ((Unknown_LpOrderEditInfoDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_LpOrderEditInfoDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_LpOrderEditInfoDto() {
            this(0);
        }

        public /* synthetic */ Unknown_LpOrderEditInfoDto(int i) {
            this("unknown");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_DestinationInfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDestinationInfoDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDestinationInfoDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDestinationInfoDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_DestinationInfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LpOrderEditInfo_DestinationInfoDto extends LpOrderEditInfoDto {
        public final String a;
        public final LpEditDestinationInfoDto b;

        public LpOrderEditInfo_DestinationInfoDto(@Json(name = "type") String str, LpEditDestinationInfoDto lpEditDestinationInfoDto) {
            this.a = str;
            this.b = lpEditDestinationInfoDto;
        }

        public final LpOrderEditInfo_DestinationInfoDto copy(@Json(name = "type") String type, LpEditDestinationInfoDto value) {
            return new LpOrderEditInfo_DestinationInfoDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LpOrderEditInfo_DestinationInfoDto)) {
                return false;
            }
            LpOrderEditInfo_DestinationInfoDto lpOrderEditInfo_DestinationInfoDto = (LpOrderEditInfo_DestinationInfoDto) obj;
            return jl40.l(this.a, lpOrderEditInfo_DestinationInfoDto.a) && jl40.l(this.b, lpOrderEditInfo_DestinationInfoDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LpOrderEditInfo_DestinationInfoDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ LpOrderEditInfo_DestinationInfoDto(LpEditDestinationInfoDto lpEditDestinationInfoDto) {
            this("destination-info", lpEditDestinationInfoDto);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_StoragePeriodDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/NddEditStoragePeriodDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/NddEditStoragePeriodDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/NddEditStoragePeriodDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpOrderEditInfoDto$LpOrderEditInfo_StoragePeriodDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LpOrderEditInfo_StoragePeriodDto extends LpOrderEditInfoDto {
        public final String a;
        public final NddEditStoragePeriodDto b;

        public LpOrderEditInfo_StoragePeriodDto(@Json(name = "type") String str, NddEditStoragePeriodDto nddEditStoragePeriodDto) {
            this.a = str;
            this.b = nddEditStoragePeriodDto;
        }

        public final LpOrderEditInfo_StoragePeriodDto copy(@Json(name = "type") String type, NddEditStoragePeriodDto value) {
            return new LpOrderEditInfo_StoragePeriodDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LpOrderEditInfo_StoragePeriodDto)) {
                return false;
            }
            LpOrderEditInfo_StoragePeriodDto lpOrderEditInfo_StoragePeriodDto = (LpOrderEditInfo_StoragePeriodDto) obj;
            return jl40.l(this.a, lpOrderEditInfo_StoragePeriodDto.a) && jl40.l(this.b, lpOrderEditInfo_StoragePeriodDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "LpOrderEditInfo_StoragePeriodDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public /* synthetic */ LpOrderEditInfo_StoragePeriodDto(NddEditStoragePeriodDto nddEditStoragePeriodDto) {
            this("storage-period", nddEditStoragePeriodDto);
        }
    }
}
