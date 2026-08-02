package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/CommentPopupDto;", "", "title", "", Constants.KEY_MESSAGE, "continueButtonText", "cancelButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getContinueButtonText", "getCancelButtonText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CommentPopupDto {
    private final String cancelButtonText;
    private final String continueButtonText;
    private final String message;
    private final String title;

    public CommentPopupDto(@Json(name = "title") String str, @Json(name = "message") String str2, @Json(name = "continue_button_text") String str3, @Json(name = "cancel_button_text") String str4) {
        this.title = str;
        this.message = str2;
        this.continueButtonText = str3;
        this.cancelButtonText = str4;
    }

    public static /* synthetic */ CommentPopupDto copy$default(CommentPopupDto commentPopupDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentPopupDto.title;
        }
        if ((i & 2) != 0) {
            str2 = commentPopupDto.message;
        }
        if ((i & 4) != 0) {
            str3 = commentPopupDto.continueButtonText;
        }
        if ((i & 8) != 0) {
            str4 = commentPopupDto.cancelButtonText;
        }
        return commentPopupDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContinueButtonText() {
        return this.continueButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCancelButtonText() {
        return this.cancelButtonText;
    }

    public final CommentPopupDto copy(@Json(name = "title") String title, @Json(name = "message") String message, @Json(name = "continue_button_text") String continueButtonText, @Json(name = "cancel_button_text") String cancelButtonText) {
        return new CommentPopupDto(title, message, continueButtonText, cancelButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentPopupDto)) {
            return false;
        }
        CommentPopupDto commentPopupDto = (CommentPopupDto) other;
        return jl40.l(this.title, commentPopupDto.title) && jl40.l(this.message, commentPopupDto.message) && jl40.l(this.continueButtonText, commentPopupDto.continueButtonText) && jl40.l(this.cancelButtonText, commentPopupDto.cancelButtonText);
    }

    public final String getCancelButtonText() {
        return this.cancelButtonText;
    }

    public final String getContinueButtonText() {
        return this.continueButtonText;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cancelButtonText.hashCode() + unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.message), 31, this.continueButtonText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        return g8e.r(b64.v("CommentPopupDto(title=", str, ", message=", str2, ", continueButtonText="), this.continueButtonText, ", cancelButtonText=", this.cancelButtonText, Extension.C_BRAKE);
    }
}
