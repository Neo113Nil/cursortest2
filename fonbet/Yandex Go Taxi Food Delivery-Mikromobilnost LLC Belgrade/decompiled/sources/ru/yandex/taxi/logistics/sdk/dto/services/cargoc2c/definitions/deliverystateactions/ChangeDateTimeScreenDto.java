package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenDto;", "", "title", "", "text", "changeButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenButtonDto;", "cancelButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenButtonDto;)V", "getTitle", "()Ljava/lang/String;", "getText", "getChangeButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeScreenButtonDto;", "getCancelButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChangeDateTimeScreenDto {
    private final ChangeDateTimeScreenButtonDto cancelButton;
    private final ChangeDateTimeScreenButtonDto changeButton;
    private final String text;
    private final String title;

    public ChangeDateTimeScreenDto(@Json(name = "title") String str, @Json(name = "text") String str2, @Json(name = "change_button") ChangeDateTimeScreenButtonDto changeDateTimeScreenButtonDto, @Json(name = "cancel_button") ChangeDateTimeScreenButtonDto changeDateTimeScreenButtonDto2) {
        this.title = str;
        this.text = str2;
        this.changeButton = changeDateTimeScreenButtonDto;
        this.cancelButton = changeDateTimeScreenButtonDto2;
    }

    public static /* synthetic */ ChangeDateTimeScreenDto copy$default(ChangeDateTimeScreenDto changeDateTimeScreenDto, String str, String str2, ChangeDateTimeScreenButtonDto changeDateTimeScreenButtonDto, ChangeDateTimeScreenButtonDto changeDateTimeScreenButtonDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeDateTimeScreenDto.title;
        }
        if ((i & 2) != 0) {
            str2 = changeDateTimeScreenDto.text;
        }
        if ((i & 4) != 0) {
            changeDateTimeScreenButtonDto = changeDateTimeScreenDto.changeButton;
        }
        if ((i & 8) != 0) {
            changeDateTimeScreenButtonDto2 = changeDateTimeScreenDto.cancelButton;
        }
        return changeDateTimeScreenDto.copy(str, str2, changeDateTimeScreenButtonDto, changeDateTimeScreenButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final ChangeDateTimeScreenButtonDto getChangeButton() {
        return this.changeButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ChangeDateTimeScreenButtonDto getCancelButton() {
        return this.cancelButton;
    }

    public final ChangeDateTimeScreenDto copy(@Json(name = "title") String title, @Json(name = "text") String text, @Json(name = "change_button") ChangeDateTimeScreenButtonDto changeButton, @Json(name = "cancel_button") ChangeDateTimeScreenButtonDto cancelButton) {
        return new ChangeDateTimeScreenDto(title, text, changeButton, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeDateTimeScreenDto)) {
            return false;
        }
        ChangeDateTimeScreenDto changeDateTimeScreenDto = (ChangeDateTimeScreenDto) other;
        return jl40.l(this.title, changeDateTimeScreenDto.title) && jl40.l(this.text, changeDateTimeScreenDto.text) && jl40.l(this.changeButton, changeDateTimeScreenDto.changeButton) && jl40.l(this.cancelButton, changeDateTimeScreenDto.cancelButton);
    }

    public final ChangeDateTimeScreenButtonDto getCancelButton() {
        return this.cancelButton;
    }

    public final ChangeDateTimeScreenButtonDto getChangeButton() {
        return this.changeButton;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.text;
        return this.cancelButton.hashCode() + ((this.changeButton.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.text;
        ChangeDateTimeScreenButtonDto changeDateTimeScreenButtonDto = this.changeButton;
        ChangeDateTimeScreenButtonDto changeDateTimeScreenButtonDto2 = this.cancelButton;
        StringBuilder v = b64.v("ChangeDateTimeScreenDto(title=", str, ", text=", str2, ", changeButton=");
        v.append(changeDateTimeScreenButtonDto);
        v.append(", cancelButton=");
        v.append(changeDateTimeScreenButtonDto2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
