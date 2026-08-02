package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eBA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShowSupportWebDto;", "", "title", "", "url", "iconTag", "nddData", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShowSupportWebDto$NddDataDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShowSupportWebDto$NddDataDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "getIconTag", "getNddData", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShowSupportWebDto$NddDataDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "NddDataDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionShowSupportWebDto {
    private final String iconTag;
    private final String metricaLabel;
    private final NddDataDto nddData;
    private final String title;
    private final String url;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShowSupportWebDto$NddDataDto;", "", "lpOrderId", "", "externalOrderId", "operatorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLpOrderId", "()Ljava/lang/String;", "getExternalOrderId", "getOperatorId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NddDataDto {
        private final String externalOrderId;
        private final String lpOrderId;
        private final String operatorId;

        public NddDataDto(@Json(name = "lp_order_id") String str, @Json(name = "external_order_id") String str2, @Json(name = "operator_id") String str3) {
            this.lpOrderId = str;
            this.externalOrderId = str2;
            this.operatorId = str3;
        }

        public static /* synthetic */ NddDataDto copy$default(NddDataDto nddDataDto, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nddDataDto.lpOrderId;
            }
            if ((i & 2) != 0) {
                str2 = nddDataDto.externalOrderId;
            }
            if ((i & 4) != 0) {
                str3 = nddDataDto.operatorId;
            }
            return nddDataDto.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLpOrderId() {
            return this.lpOrderId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExternalOrderId() {
            return this.externalOrderId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOperatorId() {
            return this.operatorId;
        }

        public final NddDataDto copy(@Json(name = "lp_order_id") String lpOrderId, @Json(name = "external_order_id") String externalOrderId, @Json(name = "operator_id") String operatorId) {
            return new NddDataDto(lpOrderId, externalOrderId, operatorId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NddDataDto)) {
                return false;
            }
            NddDataDto nddDataDto = (NddDataDto) other;
            return jl40.l(this.lpOrderId, nddDataDto.lpOrderId) && jl40.l(this.externalOrderId, nddDataDto.externalOrderId) && jl40.l(this.operatorId, nddDataDto.operatorId);
        }

        public final String getExternalOrderId() {
            return this.externalOrderId;
        }

        public final String getLpOrderId() {
            return this.lpOrderId;
        }

        public final String getOperatorId() {
            return this.operatorId;
        }

        public int hashCode() {
            return this.operatorId.hashCode() + unr0.b(this.lpOrderId.hashCode() * 31, 31, this.externalOrderId);
        }

        public String toString() {
            String str = this.lpOrderId;
            String str2 = this.externalOrderId;
            return oyr.t(b64.v("NddDataDto(lpOrderId=", str, ", externalOrderId=", str2, ", operatorId="), this.operatorId, Extension.C_BRAKE);
        }
    }

    public ActionShowSupportWebDto(@Json(name = "title") String str, @Json(name = "url") String str2, @Json(name = "icon_tag") String str3, @Json(name = "ndd_data") NddDataDto nddDataDto, @Json(name = "metrica_label") String str4) {
        this.title = str;
        this.url = str2;
        this.iconTag = str3;
        this.nddData = nddDataDto;
        this.metricaLabel = str4;
    }

    public static /* synthetic */ ActionShowSupportWebDto copy$default(ActionShowSupportWebDto actionShowSupportWebDto, String str, String str2, String str3, NddDataDto nddDataDto, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionShowSupportWebDto.title;
        }
        if ((i & 2) != 0) {
            str2 = actionShowSupportWebDto.url;
        }
        if ((i & 4) != 0) {
            str3 = actionShowSupportWebDto.iconTag;
        }
        if ((i & 8) != 0) {
            nddDataDto = actionShowSupportWebDto.nddData;
        }
        if ((i & 16) != 0) {
            str4 = actionShowSupportWebDto.metricaLabel;
        }
        String str5 = str4;
        String str6 = str3;
        return actionShowSupportWebDto.copy(str, str2, str6, nddDataDto, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconTag() {
        return this.iconTag;
    }

    /* renamed from: component4, reason: from getter */
    public final NddDataDto getNddData() {
        return this.nddData;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ActionShowSupportWebDto copy(@Json(name = "title") String title, @Json(name = "url") String url, @Json(name = "icon_tag") String iconTag, @Json(name = "ndd_data") NddDataDto nddData, @Json(name = "metrica_label") String metricaLabel) {
        return new ActionShowSupportWebDto(title, url, iconTag, nddData, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionShowSupportWebDto)) {
            return false;
        }
        ActionShowSupportWebDto actionShowSupportWebDto = (ActionShowSupportWebDto) other;
        return jl40.l(this.title, actionShowSupportWebDto.title) && jl40.l(this.url, actionShowSupportWebDto.url) && jl40.l(this.iconTag, actionShowSupportWebDto.iconTag) && jl40.l(this.nddData, actionShowSupportWebDto.nddData) && jl40.l(this.metricaLabel, actionShowSupportWebDto.metricaLabel);
    }

    public final String getIconTag() {
        return this.iconTag;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final NddDataDto getNddData() {
        return this.nddData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconTag;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NddDataDto nddDataDto = this.nddData;
        int hashCode4 = (hashCode3 + (nddDataDto == null ? 0 : nddDataDto.hashCode())) * 31;
        String str3 = this.metricaLabel;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.url;
        String str3 = this.iconTag;
        NddDataDto nddDataDto = this.nddData;
        String str4 = this.metricaLabel;
        StringBuilder v = b64.v("ActionShowSupportWebDto(title=", str, ", url=", str2, ", iconTag=");
        v.append(str3);
        v.append(", nddData=");
        v.append(nddDataDto);
        v.append(", metricaLabel=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
