package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonDto;", "", "title", "", "subtitle", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonActionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonActionDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonActionDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DialogButtonDto {
    private final DialogButtonActionDto action;
    private final String subtitle;
    private final String title;

    public DialogButtonDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "action") DialogButtonActionDto dialogButtonActionDto) {
        this.title = str;
        this.subtitle = str2;
        this.action = dialogButtonActionDto;
    }

    public static /* synthetic */ DialogButtonDto copy$default(DialogButtonDto dialogButtonDto, String str, String str2, DialogButtonActionDto dialogButtonActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogButtonDto.title;
        }
        if ((i & 2) != 0) {
            str2 = dialogButtonDto.subtitle;
        }
        if ((i & 4) != 0) {
            dialogButtonActionDto = dialogButtonDto.action;
        }
        return dialogButtonDto.copy(str, str2, dialogButtonActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final DialogButtonActionDto getAction() {
        return this.action;
    }

    public final DialogButtonDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "action") DialogButtonActionDto action) {
        return new DialogButtonDto(title, subtitle, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogButtonDto)) {
            return false;
        }
        DialogButtonDto dialogButtonDto = (DialogButtonDto) other;
        return jl40.l(this.title, dialogButtonDto.title) && jl40.l(this.subtitle, dialogButtonDto.subtitle) && jl40.l(this.action, dialogButtonDto.action);
    }

    public final DialogButtonActionDto getAction() {
        return this.action;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DialogButtonActionDto dialogButtonActionDto = this.action;
        return hashCode2 + (dialogButtonActionDto != null ? dialogButtonActionDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        DialogButtonActionDto dialogButtonActionDto = this.action;
        StringBuilder v = b64.v("DialogButtonDto(title=", str, ", subtitle=", str2, ", action=");
        v.append(dialogButtonActionDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
