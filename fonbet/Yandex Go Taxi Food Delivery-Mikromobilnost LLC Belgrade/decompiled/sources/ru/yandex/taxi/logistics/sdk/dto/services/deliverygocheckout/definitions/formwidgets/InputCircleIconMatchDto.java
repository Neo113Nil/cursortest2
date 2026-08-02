package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\r\u0010\r\u001a\u00060\u0001j\u0002`\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleIconMatchDto;", "", "key", "", "value", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InputCircleIconMatchDto {
    private final String key;
    private final Object value;

    public InputCircleIconMatchDto(@Json(name = "key") String str, @Json(name = "value") Object obj) {
        this.key = str;
        this.value = obj;
    }

    public static /* synthetic */ InputCircleIconMatchDto copy$default(InputCircleIconMatchDto inputCircleIconMatchDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = inputCircleIconMatchDto.key;
        }
        if ((i & 2) != 0) {
            obj = inputCircleIconMatchDto.value;
        }
        return inputCircleIconMatchDto.copy(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final InputCircleIconMatchDto copy(@Json(name = "key") String key, @Json(name = "value") Object value) {
        return new InputCircleIconMatchDto(key, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCircleIconMatchDto)) {
            return false;
        }
        InputCircleIconMatchDto inputCircleIconMatchDto = (InputCircleIconMatchDto) other;
        return jl40.l(this.key, inputCircleIconMatchDto.key) && jl40.l(this.value, inputCircleIconMatchDto.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public String toString() {
        return "InputCircleIconMatchDto(key=" + this.key + ", value=" + this.value + Extension.C_BRAKE;
    }
}
