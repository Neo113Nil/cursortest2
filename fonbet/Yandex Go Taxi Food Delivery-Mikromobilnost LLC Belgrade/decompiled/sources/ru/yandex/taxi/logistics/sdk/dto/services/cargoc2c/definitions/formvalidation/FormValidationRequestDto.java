package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.formvalidation;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB;\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\b\u0001\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\r\u0010\u0014\u001a\u00060\u0001j\u0002`\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\b\u0003\u0010\u0005\u001a\u00060\u0001j\u0002`\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationRequestDto;", "", "offers", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationRequestDto$OffersDto;", ClidProvider.STATE, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/FormStateDto;", "mode", "", "scenario", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getOffers", "()Ljava/util/List;", "getState", "()Ljava/lang/Object;", "getMode", "()Ljava/lang/String;", "getScenario", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "OffersDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormValidationRequestDto {
    private final String mode;
    private final List<OffersDto> offers;
    private final String scenario;
    private final Object state;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationRequestDto$OffersDto;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public FormValidationRequestDto(@Json(name = "offers") List<OffersDto> list, @Json(name = "state") Object obj, @Json(name = "mode") String str, @Json(name = "scenario") String str2) {
        this.offers = list;
        this.state = obj;
        this.mode = str;
        this.scenario = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormValidationRequestDto copy$default(FormValidationRequestDto formValidationRequestDto, List list, Object obj, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = formValidationRequestDto.offers;
        }
        if ((i & 2) != 0) {
            obj = formValidationRequestDto.state;
        }
        if ((i & 4) != 0) {
            str = formValidationRequestDto.mode;
        }
        if ((i & 8) != 0) {
            str2 = formValidationRequestDto.scenario;
        }
        return formValidationRequestDto.copy(list, obj, str, str2);
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

    public final FormValidationRequestDto copy(@Json(name = "offers") List<OffersDto> offers, @Json(name = "state") Object state, @Json(name = "mode") String mode, @Json(name = "scenario") String scenario) {
        return new FormValidationRequestDto(offers, state, mode, scenario);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormValidationRequestDto)) {
            return false;
        }
        FormValidationRequestDto formValidationRequestDto = (FormValidationRequestDto) other;
        return jl40.l(this.offers, formValidationRequestDto.offers) && jl40.l(this.state, formValidationRequestDto.state) && jl40.l(this.mode, formValidationRequestDto.mode) && jl40.l(this.scenario, formValidationRequestDto.scenario);
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

    public int hashCode() {
        int b = unr0.b(smw0.c(this.offers.hashCode() * 31, 31, this.state), 31, this.mode);
        String str = this.scenario;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<OffersDto> list = this.offers;
        Object obj = this.state;
        String str = this.mode;
        String str2 = this.scenario;
        StringBuilder sb = new StringBuilder("FormValidationRequestDto(offers=");
        sb.append(list);
        sb.append(", state=");
        sb.append(obj);
        sb.append(", mode=");
        return g8e.r(sb, str, ", scenario=", str2, Extension.C_BRAKE);
    }
}
