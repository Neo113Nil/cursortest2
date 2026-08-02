package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ShareFormParametersActionDto;", "", "hostPrefix", "", "scenario", "additionalState", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getHostPrefix", "()Ljava/lang/String;", "getScenario", "getAdditionalState", "()Ljava/lang/Object;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShareFormParametersActionDto {
    private final Object additionalState;
    private final String hostPrefix;
    private final String metricaLabel;
    private final String scenario;

    public ShareFormParametersActionDto(@Json(name = "host_prefix") String str, @Json(name = "scenario") String str2, @Json(name = "additional_state") Object obj, @Json(name = "metrica_label") String str3) {
        this.hostPrefix = str;
        this.scenario = str2;
        this.additionalState = obj;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ ShareFormParametersActionDto copy$default(ShareFormParametersActionDto shareFormParametersActionDto, String str, String str2, Object obj, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = shareFormParametersActionDto.hostPrefix;
        }
        if ((i & 2) != 0) {
            str2 = shareFormParametersActionDto.scenario;
        }
        if ((i & 4) != 0) {
            obj = shareFormParametersActionDto.additionalState;
        }
        if ((i & 8) != 0) {
            str3 = shareFormParametersActionDto.metricaLabel;
        }
        return shareFormParametersActionDto.copy(str, str2, obj, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHostPrefix() {
        return this.hostPrefix;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getAdditionalState() {
        return this.additionalState;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ShareFormParametersActionDto copy(@Json(name = "host_prefix") String hostPrefix, @Json(name = "scenario") String scenario, @Json(name = "additional_state") Object additionalState, @Json(name = "metrica_label") String metricaLabel) {
        return new ShareFormParametersActionDto(hostPrefix, scenario, additionalState, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareFormParametersActionDto)) {
            return false;
        }
        ShareFormParametersActionDto shareFormParametersActionDto = (ShareFormParametersActionDto) other;
        return jl40.l(this.hostPrefix, shareFormParametersActionDto.hostPrefix) && jl40.l(this.scenario, shareFormParametersActionDto.scenario) && jl40.l(this.additionalState, shareFormParametersActionDto.additionalState) && jl40.l(this.metricaLabel, shareFormParametersActionDto.metricaLabel);
    }

    public final Object getAdditionalState() {
        return this.additionalState;
    }

    public final String getHostPrefix() {
        return this.hostPrefix;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public int hashCode() {
        int b = unr0.b(this.hostPrefix.hashCode() * 31, 31, this.scenario);
        Object obj = this.additionalState;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.hostPrefix;
        String str2 = this.scenario;
        Object obj = this.additionalState;
        String str3 = this.metricaLabel;
        StringBuilder v = b64.v("ShareFormParametersActionDto(hostPrefix=", str, ", scenario=", str2, ", additionalState=");
        v.append(obj);
        v.append(", metricaLabel=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
