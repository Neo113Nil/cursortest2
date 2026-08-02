package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleValueStepDto;", "", "value", "", "step", "<init>", "(II)V", "getValue", "()I", "getStep", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InputCircleValueStepDto {
    private final int step;
    private final int value;

    public InputCircleValueStepDto(@Json(name = "value") int i, @Json(name = "step") int i2) {
        this.value = i;
        this.step = i2;
    }

    public static /* synthetic */ InputCircleValueStepDto copy$default(InputCircleValueStepDto inputCircleValueStepDto, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = inputCircleValueStepDto.value;
        }
        if ((i3 & 2) != 0) {
            i2 = inputCircleValueStepDto.step;
        }
        return inputCircleValueStepDto.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    public final InputCircleValueStepDto copy(@Json(name = "value") int value, @Json(name = "step") int step) {
        return new InputCircleValueStepDto(value, step);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCircleValueStepDto)) {
            return false;
        }
        InputCircleValueStepDto inputCircleValueStepDto = (InputCircleValueStepDto) other;
        return this.value == inputCircleValueStepDto.value && this.step == inputCircleValueStepDto.step;
    }

    public final int getStep() {
        return this.step;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.step) + (Integer.hashCode(this.value) * 31);
    }

    public String toString() {
        return b64.d(this.value, this.step, "InputCircleValueStepDto(value=", ", step=", Extension.C_BRAKE);
    }
}
