package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionPerformerCallDto;", "", "title", "", "communicationMethod", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getCommunicationMethod", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CommunicationMethodDto;", "getMetricaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionPerformerCallDto {
    private final CommunicationMethodDto communicationMethod;
    private final String metricaLabel;
    private final String title;

    public ActionPerformerCallDto(@Json(name = "title") String str, @Json(name = "communication_method") CommunicationMethodDto communicationMethodDto, @Json(name = "metrica_label") String str2) {
        this.title = str;
        this.communicationMethod = communicationMethodDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ActionPerformerCallDto copy$default(ActionPerformerCallDto actionPerformerCallDto, String str, CommunicationMethodDto communicationMethodDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionPerformerCallDto.title;
        }
        if ((i & 2) != 0) {
            communicationMethodDto = actionPerformerCallDto.communicationMethod;
        }
        if ((i & 4) != 0) {
            str2 = actionPerformerCallDto.metricaLabel;
        }
        return actionPerformerCallDto.copy(str, communicationMethodDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CommunicationMethodDto getCommunicationMethod() {
        return this.communicationMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ActionPerformerCallDto copy(@Json(name = "title") String title, @Json(name = "communication_method") CommunicationMethodDto communicationMethod, @Json(name = "metrica_label") String metricaLabel) {
        return new ActionPerformerCallDto(title, communicationMethod, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionPerformerCallDto)) {
            return false;
        }
        ActionPerformerCallDto actionPerformerCallDto = (ActionPerformerCallDto) other;
        return jl40.l(this.title, actionPerformerCallDto.title) && jl40.l(this.communicationMethod, actionPerformerCallDto.communicationMethod) && jl40.l(this.metricaLabel, actionPerformerCallDto.metricaLabel);
    }

    public final CommunicationMethodDto getCommunicationMethod() {
        return this.communicationMethod;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.communicationMethod.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.metricaLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.title;
        CommunicationMethodDto communicationMethodDto = this.communicationMethod;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ActionPerformerCallDto(title=");
        sb.append(str);
        sb.append(", communicationMethod=");
        sb.append(communicationMethodDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
