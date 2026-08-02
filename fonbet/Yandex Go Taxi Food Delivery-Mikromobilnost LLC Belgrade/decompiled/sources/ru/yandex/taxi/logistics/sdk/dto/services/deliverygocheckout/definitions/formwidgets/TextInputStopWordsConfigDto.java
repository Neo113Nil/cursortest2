package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsConfigDto;", "", "items", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsItemDto;", "formStateKey", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getFormStateKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextInputStopWordsConfigDto {
    private final String formStateKey;
    private final List<TextInputStopWordsItemDto> items;

    public TextInputStopWordsConfigDto(@Json(name = "items") List<TextInputStopWordsItemDto> list, @Json(name = "form_state_key") String str) {
        this.items = list;
        this.formStateKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextInputStopWordsConfigDto copy$default(TextInputStopWordsConfigDto textInputStopWordsConfigDto, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textInputStopWordsConfigDto.items;
        }
        if ((i & 2) != 0) {
            str = textInputStopWordsConfigDto.formStateKey;
        }
        return textInputStopWordsConfigDto.copy(list, str);
    }

    public final List<TextInputStopWordsItemDto> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final TextInputStopWordsConfigDto copy(@Json(name = "items") List<TextInputStopWordsItemDto> items, @Json(name = "form_state_key") String formStateKey) {
        return new TextInputStopWordsConfigDto(items, formStateKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputStopWordsConfigDto)) {
            return false;
        }
        TextInputStopWordsConfigDto textInputStopWordsConfigDto = (TextInputStopWordsConfigDto) other;
        return jl40.l(this.items, textInputStopWordsConfigDto.items) && jl40.l(this.formStateKey, textInputStopWordsConfigDto.formStateKey);
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<TextInputStopWordsItemDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.formStateKey.hashCode() + (this.items.hashCode() * 31);
    }

    public String toString() {
        return xvz.i("TextInputStopWordsConfigDto(items=", ", formStateKey=", this.formStateKey, Extension.C_BRAKE, this.items);
    }
}
