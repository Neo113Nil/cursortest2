package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionCancelV2Dto;", "", "title", "", Constants.KEY_MESSAGE, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageV2Dto;", "cancelType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageV2Dto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageV2Dto;", "getCancelType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionCancelV2Dto {
    private final CancelTypeDto cancelType;
    private final CancelMessageV2Dto message;
    private final String metricaLabel;
    private final String title;

    public ActionCancelV2Dto(@Json(name = "title") String str, @Json(name = "message") CancelMessageV2Dto cancelMessageV2Dto, @Json(name = "cancel_type") CancelTypeDto cancelTypeDto, @Json(name = "metrica_label") String str2) {
        this.title = str;
        this.message = cancelMessageV2Dto;
        this.cancelType = cancelTypeDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ ActionCancelV2Dto copy$default(ActionCancelV2Dto actionCancelV2Dto, String str, CancelMessageV2Dto cancelMessageV2Dto, CancelTypeDto cancelTypeDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionCancelV2Dto.title;
        }
        if ((i & 2) != 0) {
            cancelMessageV2Dto = actionCancelV2Dto.message;
        }
        if ((i & 4) != 0) {
            cancelTypeDto = actionCancelV2Dto.cancelType;
        }
        if ((i & 8) != 0) {
            str2 = actionCancelV2Dto.metricaLabel;
        }
        return actionCancelV2Dto.copy(str, cancelMessageV2Dto, cancelTypeDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CancelMessageV2Dto getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ActionCancelV2Dto copy(@Json(name = "title") String title, @Json(name = "message") CancelMessageV2Dto message, @Json(name = "cancel_type") CancelTypeDto cancelType, @Json(name = "metrica_label") String metricaLabel) {
        return new ActionCancelV2Dto(title, message, cancelType, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionCancelV2Dto)) {
            return false;
        }
        ActionCancelV2Dto actionCancelV2Dto = (ActionCancelV2Dto) other;
        return jl40.l(this.title, actionCancelV2Dto.title) && jl40.l(this.message, actionCancelV2Dto.message) && this.cancelType == actionCancelV2Dto.cancelType && jl40.l(this.metricaLabel, actionCancelV2Dto.metricaLabel);
    }

    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    public final CancelMessageV2Dto getMessage() {
        return this.message;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.cancelType.hashCode() + ((this.message.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31;
        String str = this.metricaLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ActionCancelV2Dto(title=" + this.title + ", message=" + this.message + ", cancelType=" + this.cancelType + ", metricaLabel=" + this.metricaLabel + Extension.C_BRAKE;
    }
}
