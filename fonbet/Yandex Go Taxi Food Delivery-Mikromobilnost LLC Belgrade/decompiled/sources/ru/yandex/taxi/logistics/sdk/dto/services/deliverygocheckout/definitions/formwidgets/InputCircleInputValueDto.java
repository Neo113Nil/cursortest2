package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleInputValueDto;", "", "minInputValue", "", "inputValueSteps", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleValueStepDto;", "<init>", "(ILjava/util/List;)V", "getMinInputValue", "()I", "getInputValueSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InputCircleInputValueDto {
    private final List<InputCircleValueStepDto> inputValueSteps;
    private final int minInputValue;

    public InputCircleInputValueDto(@Json(name = "min_input_value") int i, @Json(name = "input_value_steps") List<InputCircleValueStepDto> list) {
        this.minInputValue = i;
        this.inputValueSteps = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputCircleInputValueDto copy$default(InputCircleInputValueDto inputCircleInputValueDto, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inputCircleInputValueDto.minInputValue;
        }
        if ((i2 & 2) != 0) {
            list = inputCircleInputValueDto.inputValueSteps;
        }
        return inputCircleInputValueDto.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinInputValue() {
        return this.minInputValue;
    }

    public final List<InputCircleValueStepDto> component2() {
        return this.inputValueSteps;
    }

    public final InputCircleInputValueDto copy(@Json(name = "min_input_value") int minInputValue, @Json(name = "input_value_steps") List<InputCircleValueStepDto> inputValueSteps) {
        return new InputCircleInputValueDto(minInputValue, inputValueSteps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCircleInputValueDto)) {
            return false;
        }
        InputCircleInputValueDto inputCircleInputValueDto = (InputCircleInputValueDto) other;
        return this.minInputValue == inputCircleInputValueDto.minInputValue && jl40.l(this.inputValueSteps, inputCircleInputValueDto.inputValueSteps);
    }

    public final List<InputCircleValueStepDto> getInputValueSteps() {
        return this.inputValueSteps;
    }

    public final int getMinInputValue() {
        return this.minInputValue;
    }

    public int hashCode() {
        return this.inputValueSteps.hashCode() + (Integer.hashCode(this.minInputValue) * 31);
    }

    public String toString() {
        return "InputCircleInputValueDto(minInputValue=" + this.minInputValue + ", inputValueSteps=" + this.inputValueSteps + Extension.C_BRAKE;
    }
}
