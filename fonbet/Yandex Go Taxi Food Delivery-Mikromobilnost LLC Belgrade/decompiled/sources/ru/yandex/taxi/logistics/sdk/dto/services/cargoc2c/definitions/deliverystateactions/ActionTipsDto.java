package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionTipsDto;", "", "choices", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/TipsChoiceDto;", "lastChoiceId", "", "availablePaymentTypes", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getChoices", "()Ljava/util/List;", "getLastChoiceId", "()Ljava/lang/String;", "getAvailablePaymentTypes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionTipsDto {
    private final List<String> availablePaymentTypes;
    private final List<TipsChoiceDto> choices;
    private final String lastChoiceId;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionTipsDto(@Json(name = "choices") List<? extends TipsChoiceDto> list, @Json(name = "last_choice_id") String str, @Json(name = "available_payment_types") List<String> list2) {
        this.choices = list;
        this.lastChoiceId = str;
        this.availablePaymentTypes = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionTipsDto copy$default(ActionTipsDto actionTipsDto, List list, String str, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = actionTipsDto.choices;
        }
        if ((i & 2) != 0) {
            str = actionTipsDto.lastChoiceId;
        }
        if ((i & 4) != 0) {
            list2 = actionTipsDto.availablePaymentTypes;
        }
        return actionTipsDto.copy(list, str, list2);
    }

    public final List<TipsChoiceDto> component1() {
        return this.choices;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastChoiceId() {
        return this.lastChoiceId;
    }

    public final List<String> component3() {
        return this.availablePaymentTypes;
    }

    public final ActionTipsDto copy(@Json(name = "choices") List<? extends TipsChoiceDto> choices, @Json(name = "last_choice_id") String lastChoiceId, @Json(name = "available_payment_types") List<String> availablePaymentTypes) {
        return new ActionTipsDto(choices, lastChoiceId, availablePaymentTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionTipsDto)) {
            return false;
        }
        ActionTipsDto actionTipsDto = (ActionTipsDto) other;
        return jl40.l(this.choices, actionTipsDto.choices) && jl40.l(this.lastChoiceId, actionTipsDto.lastChoiceId) && jl40.l(this.availablePaymentTypes, actionTipsDto.availablePaymentTypes);
    }

    public final List<String> getAvailablePaymentTypes() {
        return this.availablePaymentTypes;
    }

    public final List<TipsChoiceDto> getChoices() {
        return this.choices;
    }

    public final String getLastChoiceId() {
        return this.lastChoiceId;
    }

    public int hashCode() {
        int b = unr0.b(this.choices.hashCode() * 31, 31, this.lastChoiceId);
        List<String> list = this.availablePaymentTypes;
        return b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        List<TipsChoiceDto> list = this.choices;
        String str = this.lastChoiceId;
        return ly3.s(xvz.s("ActionTipsDto(choices=", list, ", lastChoiceId=", str, ", availablePaymentTypes="), this.availablePaymentTypes, Extension.C_BRAKE);
    }
}
