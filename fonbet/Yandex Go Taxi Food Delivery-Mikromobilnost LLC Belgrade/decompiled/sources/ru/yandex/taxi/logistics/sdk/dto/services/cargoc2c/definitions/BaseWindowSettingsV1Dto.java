package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsV1Dto;", "", "title", "", "subtitle", "doneButtonTitle", "cancelButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDoneButtonTitle", "getCancelButtonTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseWindowSettingsV1Dto {
    private final String cancelButtonTitle;
    private final String doneButtonTitle;
    private final String subtitle;
    private final String title;

    public BaseWindowSettingsV1Dto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "done_button_title") String str3, @Json(name = "cancel_button_title") String str4) {
        this.title = str;
        this.subtitle = str2;
        this.doneButtonTitle = str3;
        this.cancelButtonTitle = str4;
    }

    public static /* synthetic */ BaseWindowSettingsV1Dto copy$default(BaseWindowSettingsV1Dto baseWindowSettingsV1Dto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseWindowSettingsV1Dto.title;
        }
        if ((i & 2) != 0) {
            str2 = baseWindowSettingsV1Dto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = baseWindowSettingsV1Dto.doneButtonTitle;
        }
        if ((i & 8) != 0) {
            str4 = baseWindowSettingsV1Dto.cancelButtonTitle;
        }
        return baseWindowSettingsV1Dto.copy(str, str2, str3, str4);
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
    public final String getDoneButtonTitle() {
        return this.doneButtonTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    public final BaseWindowSettingsV1Dto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "done_button_title") String doneButtonTitle, @Json(name = "cancel_button_title") String cancelButtonTitle) {
        return new BaseWindowSettingsV1Dto(title, subtitle, doneButtonTitle, cancelButtonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseWindowSettingsV1Dto)) {
            return false;
        }
        BaseWindowSettingsV1Dto baseWindowSettingsV1Dto = (BaseWindowSettingsV1Dto) other;
        return jl40.l(this.title, baseWindowSettingsV1Dto.title) && jl40.l(this.subtitle, baseWindowSettingsV1Dto.subtitle) && jl40.l(this.doneButtonTitle, baseWindowSettingsV1Dto.doneButtonTitle) && jl40.l(this.cancelButtonTitle, baseWindowSettingsV1Dto.cancelButtonTitle);
    }

    public final String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    public final String getDoneButtonTitle() {
        return this.doneButtonTitle;
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
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.doneButtonTitle);
        String str2 = this.cancelButtonTitle;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return g8e.r(b64.v("BaseWindowSettingsV1Dto(title=", str, ", subtitle=", str2, ", doneButtonTitle="), this.doneButtonTitle, ", cancelButtonTitle=", this.cancelButtonTitle, Extension.C_BRAKE);
    }
}
