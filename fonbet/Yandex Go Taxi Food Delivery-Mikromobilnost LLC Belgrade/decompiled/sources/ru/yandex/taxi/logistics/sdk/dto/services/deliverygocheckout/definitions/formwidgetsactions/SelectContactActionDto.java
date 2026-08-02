package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SelectContactActionDto;", "", "position", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "actionOnContactSelected", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;)V", "getPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getActionOnContactSelected", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SelectContactActionDto {
    private final TapActionDto actionOnContactSelected;
    private final ResultPositionDto position;

    public SelectContactActionDto(@Json(name = "position") ResultPositionDto resultPositionDto, @Json(name = "action_on_contact_selected") TapActionDto tapActionDto) {
        this.position = resultPositionDto;
        this.actionOnContactSelected = tapActionDto;
    }

    public static /* synthetic */ SelectContactActionDto copy$default(SelectContactActionDto selectContactActionDto, ResultPositionDto resultPositionDto, TapActionDto tapActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            resultPositionDto = selectContactActionDto.position;
        }
        if ((i & 2) != 0) {
            tapActionDto = selectContactActionDto.actionOnContactSelected;
        }
        return selectContactActionDto.copy(resultPositionDto, tapActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ResultPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final TapActionDto getActionOnContactSelected() {
        return this.actionOnContactSelected;
    }

    public final SelectContactActionDto copy(@Json(name = "position") ResultPositionDto position, @Json(name = "action_on_contact_selected") TapActionDto actionOnContactSelected) {
        return new SelectContactActionDto(position, actionOnContactSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectContactActionDto)) {
            return false;
        }
        SelectContactActionDto selectContactActionDto = (SelectContactActionDto) other;
        return jl40.l(this.position, selectContactActionDto.position) && jl40.l(this.actionOnContactSelected, selectContactActionDto.actionOnContactSelected);
    }

    public final TapActionDto getActionOnContactSelected() {
        return this.actionOnContactSelected;
    }

    public final ResultPositionDto getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = this.position.hashCode() * 31;
        TapActionDto tapActionDto = this.actionOnContactSelected;
        return hashCode + (tapActionDto == null ? 0 : tapActionDto.hashCode());
    }

    public String toString() {
        return "SelectContactActionDto(position=" + this.position + ", actionOnContactSelected=" + this.actionOnContactSelected + Extension.C_BRAKE;
    }
}
