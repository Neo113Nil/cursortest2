package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_order_form_address_details/CommentPopupDto;", "", "titleKey", "", "messageKey", "continueButtonTextKey", "cancelButtonTextKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleKey", "()Ljava/lang/String;", "getMessageKey", "getContinueButtonTextKey", "getCancelButtonTextKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CommentPopupDto {
    private final String cancelButtonTextKey;
    private final String continueButtonTextKey;
    private final String messageKey;
    private final String titleKey;

    public CommentPopupDto(@Json(name = "title_key") String str, @Json(name = "message_key") String str2, @Json(name = "continue_button_text_key") String str3, @Json(name = "cancel_button_text_key") String str4) {
        this.titleKey = str;
        this.messageKey = str2;
        this.continueButtonTextKey = str3;
        this.cancelButtonTextKey = str4;
    }

    public static /* synthetic */ CommentPopupDto copy$default(CommentPopupDto commentPopupDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentPopupDto.titleKey;
        }
        if ((i & 2) != 0) {
            str2 = commentPopupDto.messageKey;
        }
        if ((i & 4) != 0) {
            str3 = commentPopupDto.continueButtonTextKey;
        }
        if ((i & 8) != 0) {
            str4 = commentPopupDto.cancelButtonTextKey;
        }
        return commentPopupDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleKey() {
        return this.titleKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageKey() {
        return this.messageKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContinueButtonTextKey() {
        return this.continueButtonTextKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCancelButtonTextKey() {
        return this.cancelButtonTextKey;
    }

    public final CommentPopupDto copy(@Json(name = "title_key") String titleKey, @Json(name = "message_key") String messageKey, @Json(name = "continue_button_text_key") String continueButtonTextKey, @Json(name = "cancel_button_text_key") String cancelButtonTextKey) {
        return new CommentPopupDto(titleKey, messageKey, continueButtonTextKey, cancelButtonTextKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentPopupDto)) {
            return false;
        }
        CommentPopupDto commentPopupDto = (CommentPopupDto) other;
        return jl40.l(this.titleKey, commentPopupDto.titleKey) && jl40.l(this.messageKey, commentPopupDto.messageKey) && jl40.l(this.continueButtonTextKey, commentPopupDto.continueButtonTextKey) && jl40.l(this.cancelButtonTextKey, commentPopupDto.cancelButtonTextKey);
    }

    public final String getCancelButtonTextKey() {
        return this.cancelButtonTextKey;
    }

    public final String getContinueButtonTextKey() {
        return this.continueButtonTextKey;
    }

    public final String getMessageKey() {
        return this.messageKey;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }

    public int hashCode() {
        int hashCode = this.titleKey.hashCode() * 31;
        String str = this.messageKey;
        return this.cancelButtonTextKey.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.continueButtonTextKey);
    }

    public String toString() {
        String str = this.titleKey;
        String str2 = this.messageKey;
        return g8e.r(b64.v("CommentPopupDto(titleKey=", str, ", messageKey=", str2, ", continueButtonTextKey="), this.continueButtonTextKey, ", cancelButtonTextKey=", this.cancelButtonTextKey, Extension.C_BRAKE);
    }
}
