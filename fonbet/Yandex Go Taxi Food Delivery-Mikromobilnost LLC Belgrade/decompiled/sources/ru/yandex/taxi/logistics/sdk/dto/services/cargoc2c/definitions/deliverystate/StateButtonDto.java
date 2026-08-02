package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StateButtonDto;", "", "title", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ButtonActionDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ButtonActionDto;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ButtonActionDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StateButtonDto {
    private final ButtonActionDto action;
    private final String title;

    public StateButtonDto(@Json(name = "title") String str, @Json(name = "action") ButtonActionDto buttonActionDto) {
        this.title = str;
        this.action = buttonActionDto;
    }

    public static /* synthetic */ StateButtonDto copy$default(StateButtonDto stateButtonDto, String str, ButtonActionDto buttonActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stateButtonDto.title;
        }
        if ((i & 2) != 0) {
            buttonActionDto = stateButtonDto.action;
        }
        return stateButtonDto.copy(str, buttonActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonActionDto getAction() {
        return this.action;
    }

    public final StateButtonDto copy(@Json(name = "title") String title, @Json(name = "action") ButtonActionDto action) {
        return new StateButtonDto(title, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateButtonDto)) {
            return false;
        }
        StateButtonDto stateButtonDto = (StateButtonDto) other;
        return jl40.l(this.title, stateButtonDto.title) && jl40.l(this.action, stateButtonDto.action);
    }

    public final ButtonActionDto getAction() {
        return this.action;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "StateButtonDto(title=" + this.title + ", action=" + this.action + Extension.C_BRAKE;
    }
}
