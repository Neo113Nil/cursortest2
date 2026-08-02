package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionWebTipsDto;", "", BackendConfig.Restrictions.ENABLED, "", "choices", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebTipsChoiceDto;", "lastChoiceId", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;)V", "getEnabled", "()Z", "getChoices", "()Ljava/util/List;", "getLastChoiceId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionWebTipsDto {
    private final List<WebTipsChoiceDto> choices;
    private final boolean enabled;
    private final String lastChoiceId;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionWebTipsDto(@Json(name = "enabled") boolean z, @Json(name = "choices") List<? extends WebTipsChoiceDto> list, @Json(name = "last_choice_id") String str) {
        this.enabled = z;
        this.choices = list;
        this.lastChoiceId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionWebTipsDto copy$default(ActionWebTipsDto actionWebTipsDto, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = actionWebTipsDto.enabled;
        }
        if ((i & 2) != 0) {
            list = actionWebTipsDto.choices;
        }
        if ((i & 4) != 0) {
            str = actionWebTipsDto.lastChoiceId;
        }
        return actionWebTipsDto.copy(z, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<WebTipsChoiceDto> component2() {
        return this.choices;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastChoiceId() {
        return this.lastChoiceId;
    }

    public final ActionWebTipsDto copy(@Json(name = "enabled") boolean enabled, @Json(name = "choices") List<? extends WebTipsChoiceDto> choices, @Json(name = "last_choice_id") String lastChoiceId) {
        return new ActionWebTipsDto(enabled, choices, lastChoiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionWebTipsDto)) {
            return false;
        }
        ActionWebTipsDto actionWebTipsDto = (ActionWebTipsDto) other;
        return this.enabled == actionWebTipsDto.enabled && jl40.l(this.choices, actionWebTipsDto.choices) && jl40.l(this.lastChoiceId, actionWebTipsDto.lastChoiceId);
    }

    public final List<WebTipsChoiceDto> getChoices() {
        return this.choices;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getLastChoiceId() {
        return this.lastChoiceId;
    }

    public int hashCode() {
        return this.lastChoiceId.hashCode() + unr0.c(Boolean.hashCode(this.enabled) * 31, 31, this.choices);
    }

    public String toString() {
        boolean z = this.enabled;
        List<WebTipsChoiceDto> list = this.choices;
        String str = this.lastChoiceId;
        StringBuilder sb = new StringBuilder("ActionWebTipsDto(enabled=");
        sb.append(z);
        sb.append(", choices=");
        sb.append(list);
        sb.append(", lastChoiceId=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
