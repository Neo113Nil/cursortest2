package ru.yandex.taxi.logistics.sdk.network.error_dialog;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/network/error_dialog/ErrorDialogDto;", "", "title", "", "text", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getText", "getButtonText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ErrorDialogDto {
    public static final int $stable = 0;
    private final String buttonText;
    private final String text;
    private final String title;

    public ErrorDialogDto(@Json(name = "title") String str, @Json(name = "text") String str2, @Json(name = "button_text") String str3) {
        this.title = str;
        this.text = str2;
        this.buttonText = str3;
    }

    public static /* synthetic */ ErrorDialogDto copy$default(ErrorDialogDto errorDialogDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorDialogDto.title;
        }
        if ((i & 2) != 0) {
            str2 = errorDialogDto.text;
        }
        if ((i & 4) != 0) {
            str3 = errorDialogDto.buttonText;
        }
        return errorDialogDto.copy(str, str2, str3);
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
    public final String getButtonText() {
        return this.buttonText;
    }

    public final ErrorDialogDto copy(@Json(name = "title") String title, @Json(name = "text") String text, @Json(name = "button_text") String buttonText) {
        return new ErrorDialogDto(title, text, buttonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDialogDto)) {
            return false;
        }
        ErrorDialogDto errorDialogDto = (ErrorDialogDto) other;
        return jl40.l(this.title, errorDialogDto.title) && jl40.l(this.text, errorDialogDto.text) && jl40.l(this.buttonText, errorDialogDto.buttonText);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonText.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.text);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.text;
        return oyr.t(b64.v("ErrorDialogDto(title=", str, ", text=", str2, ", buttonText="), this.buttonText, Extension.C_BRAKE);
    }
}
