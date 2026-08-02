package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B_\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\b\u0001\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0004\u0018\u0001`\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\r\u0010\u001a\u001a\u00060\u0001j\u0002`\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0004\u0018\u0001`\fHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\b\u0003\u0010\u0005\u001a\u00060\u0001j\u0002`\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0004\u0018\u0001`\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003j\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2DraftRequestDto;", "", "offers", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2DraftRequestDto$OffersDto;", ClidProvider.STATE, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/FormStateDto;", "mode", "", "scenario", "userCurrentLocation", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CoordinatesDto;", "validationKey", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getOffers", "()Ljava/util/List;", "getState", "()Ljava/lang/Object;", "getMode", "()Ljava/lang/String;", "getScenario", "getUserCurrentLocation", "getValidationKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "OffersDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class V2DraftRequestDto {
    private final String mode;
    private final List<OffersDto> offers;
    private final String scenario;
    private final Object state;
    private final List<Double> userCurrentLocation;
    private final String validationKey;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2DraftRequestDto$OffersDto;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OffersDto {
        private final String id;

        public OffersDto(@Json(name = "id") String str) {
            this.id = str;
        }

        public static /* synthetic */ OffersDto copy$default(OffersDto offersDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = offersDto.id;
            }
            return offersDto.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final OffersDto copy(@Json(name = "id") String id) {
            return new OffersDto(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OffersDto) && jl40.l(this.id, ((OffersDto) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return oyr.p("OffersDto(id=", this.id, Extension.C_BRAKE);
        }
    }

    public V2DraftRequestDto(@Json(name = "offers") List<OffersDto> list, @Json(name = "state") Object obj, @Json(name = "mode") String str, @Json(name = "scenario") String str2, @Json(name = "user_current_location") List<Double> list2, @Json(name = "validation_key") String str3) {
        this.offers = list;
        this.state = obj;
        this.mode = str;
        this.scenario = str2;
        this.userCurrentLocation = list2;
        this.validationKey = str3;
    }

    public static /* synthetic */ V2DraftRequestDto copy$default(V2DraftRequestDto v2DraftRequestDto, List list, Object obj, String str, String str2, List list2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = v2DraftRequestDto.offers;
        }
        if ((i & 2) != 0) {
            obj = v2DraftRequestDto.state;
        }
        if ((i & 4) != 0) {
            str = v2DraftRequestDto.mode;
        }
        if ((i & 8) != 0) {
            str2 = v2DraftRequestDto.scenario;
        }
        if ((i & 16) != 0) {
            list2 = v2DraftRequestDto.userCurrentLocation;
        }
        if ((i & 32) != 0) {
            str3 = v2DraftRequestDto.validationKey;
        }
        List list3 = list2;
        String str4 = str3;
        return v2DraftRequestDto.copy(list, obj, str, str2, list3, str4);
    }

    public final List<OffersDto> component1() {
        return this.offers;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final List<Double> component5() {
        return this.userCurrentLocation;
    }

    /* renamed from: component6, reason: from getter */
    public final String getValidationKey() {
        return this.validationKey;
    }

    public final V2DraftRequestDto copy(@Json(name = "offers") List<OffersDto> offers, @Json(name = "state") Object state, @Json(name = "mode") String mode, @Json(name = "scenario") String scenario, @Json(name = "user_current_location") List<Double> userCurrentLocation, @Json(name = "validation_key") String validationKey) {
        return new V2DraftRequestDto(offers, state, mode, scenario, userCurrentLocation, validationKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V2DraftRequestDto)) {
            return false;
        }
        V2DraftRequestDto v2DraftRequestDto = (V2DraftRequestDto) other;
        return jl40.l(this.offers, v2DraftRequestDto.offers) && jl40.l(this.state, v2DraftRequestDto.state) && jl40.l(this.mode, v2DraftRequestDto.mode) && jl40.l(this.scenario, v2DraftRequestDto.scenario) && jl40.l(this.userCurrentLocation, v2DraftRequestDto.userCurrentLocation) && jl40.l(this.validationKey, v2DraftRequestDto.validationKey);
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<OffersDto> getOffers() {
        return this.offers;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final Object getState() {
        return this.state;
    }

    public final List<Double> getUserCurrentLocation() {
        return this.userCurrentLocation;
    }

    public final String getValidationKey() {
        return this.validationKey;
    }

    public int hashCode() {
        int b = unr0.b(smw0.c(this.offers.hashCode() * 31, 31, this.state), 31, this.mode);
        String str = this.scenario;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        List<Double> list = this.userCurrentLocation;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.validationKey;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<OffersDto> list = this.offers;
        Object obj = this.state;
        String str = this.mode;
        String str2 = this.scenario;
        List<Double> list2 = this.userCurrentLocation;
        String str3 = this.validationKey;
        StringBuilder sb = new StringBuilder("V2DraftRequestDto(offers=");
        sb.append(list);
        sb.append(", state=");
        sb.append(obj);
        sb.append(", mode=");
        g8e.D(sb, str, ", scenario=", str2, ", userCurrentLocation=");
        return n.l(", validationKey=", str3, Extension.C_BRAKE, sb, list2);
    }
}
