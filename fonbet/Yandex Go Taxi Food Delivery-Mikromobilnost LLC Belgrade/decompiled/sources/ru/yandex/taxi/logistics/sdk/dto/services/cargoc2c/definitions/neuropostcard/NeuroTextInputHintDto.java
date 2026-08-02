package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputHintDto;", "", "title", "", "textToPaste", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getTextToPaste", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NeuroTextInputHintDto {
    private final String textToPaste;
    private final String title;

    public NeuroTextInputHintDto(@Json(name = "title") String str, @Json(name = "text_to_paste") String str2) {
        this.title = str;
        this.textToPaste = str2;
    }

    public static /* synthetic */ NeuroTextInputHintDto copy$default(NeuroTextInputHintDto neuroTextInputHintDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = neuroTextInputHintDto.title;
        }
        if ((i & 2) != 0) {
            str2 = neuroTextInputHintDto.textToPaste;
        }
        return neuroTextInputHintDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextToPaste() {
        return this.textToPaste;
    }

    public final NeuroTextInputHintDto copy(@Json(name = "title") String title, @Json(name = "text_to_paste") String textToPaste) {
        return new NeuroTextInputHintDto(title, textToPaste);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeuroTextInputHintDto)) {
            return false;
        }
        NeuroTextInputHintDto neuroTextInputHintDto = (NeuroTextInputHintDto) other;
        return jl40.l(this.title, neuroTextInputHintDto.title) && jl40.l(this.textToPaste, neuroTextInputHintDto.textToPaste);
    }

    public final String getTextToPaste() {
        return this.textToPaste;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.textToPaste.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("NeuroTextInputHintDto(title=", this.title, ", textToPaste=", this.textToPaste, Extension.C_BRAKE);
    }
}
