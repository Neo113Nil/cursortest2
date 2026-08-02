package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailSwitchControlDto;", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "actionOnUnselect", "metricaLabel", "", "selected", "", BackendConfig.Restrictions.ENABLED, "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;Ljava/lang/String;ZZ)V", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto;", "getActionOnUnselect", "getMetricaLabel", "()Ljava/lang/String;", "getSelected", "()Z", "getEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TrailSwitchControlDto {
    private final ActionDto action;
    private final ActionDto actionOnUnselect;
    private final boolean enabled;
    private final String metricaLabel;
    private final boolean selected;

    public /* synthetic */ TrailSwitchControlDto(ActionDto actionDto, ActionDto actionDto2, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionDto, actionDto2, str, z, (i & 16) != 0 ? true : z2);
    }

    public static /* synthetic */ TrailSwitchControlDto copy$default(TrailSwitchControlDto trailSwitchControlDto, ActionDto actionDto, ActionDto actionDto2, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            actionDto = trailSwitchControlDto.action;
        }
        if ((i & 2) != 0) {
            actionDto2 = trailSwitchControlDto.actionOnUnselect;
        }
        if ((i & 4) != 0) {
            str = trailSwitchControlDto.metricaLabel;
        }
        if ((i & 8) != 0) {
            z = trailSwitchControlDto.selected;
        }
        if ((i & 16) != 0) {
            z2 = trailSwitchControlDto.enabled;
        }
        boolean z3 = z2;
        String str2 = str;
        return trailSwitchControlDto.copy(actionDto, actionDto2, str2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final ActionDto getActionOnUnselect() {
        return this.actionOnUnselect;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final TrailSwitchControlDto copy(@Json(name = "action") ActionDto action, @Json(name = "action_on_unselect") ActionDto actionOnUnselect, @Json(name = "metrica_label") String metricaLabel, @Json(name = "selected") boolean selected, @Json(name = "enabled") boolean enabled) {
        return new TrailSwitchControlDto(action, actionOnUnselect, metricaLabel, selected, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailSwitchControlDto)) {
            return false;
        }
        TrailSwitchControlDto trailSwitchControlDto = (TrailSwitchControlDto) other;
        return jl40.l(this.action, trailSwitchControlDto.action) && jl40.l(this.actionOnUnselect, trailSwitchControlDto.actionOnUnselect) && jl40.l(this.metricaLabel, trailSwitchControlDto.metricaLabel) && this.selected == trailSwitchControlDto.selected && this.enabled == trailSwitchControlDto.enabled;
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final ActionDto getActionOnUnselect() {
        return this.actionOnUnselect;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        ActionDto actionDto = this.actionOnUnselect;
        int hashCode2 = (hashCode + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return Boolean.hashCode(this.enabled) + unr0.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.selected);
    }

    public String toString() {
        ActionDto actionDto = this.action;
        ActionDto actionDto2 = this.actionOnUnselect;
        String str = this.metricaLabel;
        boolean z = this.selected;
        boolean z2 = this.enabled;
        StringBuilder sb = new StringBuilder("TrailSwitchControlDto(action=");
        sb.append(actionDto);
        sb.append(", actionOnUnselect=");
        sb.append(actionDto2);
        sb.append(", metricaLabel=");
        tse0.y(str, ", selected=", ", enabled=", sb, z);
        return x4e.i(sb, z2, Extension.C_BRAKE);
    }

    public TrailSwitchControlDto(@Json(name = "action") ActionDto actionDto, @Json(name = "action_on_unselect") ActionDto actionDto2, @Json(name = "metrica_label") String str, @Json(name = "selected") boolean z, @Json(name = "enabled") boolean z2) {
        this.action = actionDto;
        this.actionOnUnselect = actionDto2;
        this.metricaLabel = str;
        this.selected = z;
        this.enabled = z2;
    }
}
