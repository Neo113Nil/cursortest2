package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto;", "", "title", "", "body", "closeButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$CloseButtonDto;", "confirmButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$ConfirmButtonDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$CloseButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$ConfirmButtonDto;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getCloseButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$CloseButtonDto;", "getConfirmButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$ConfirmButtonDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CloseButtonDto", "ConfirmButtonDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DialogDto {
    private final String body;
    private final CloseButtonDto closeButton;
    private final ConfirmButtonDto confirmButton;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$CloseButtonDto;", "", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseButtonDto {
        private final String title;

        public CloseButtonDto(@Json(name = "title") String str) {
            this.title = str;
        }

        public static /* synthetic */ CloseButtonDto copy$default(CloseButtonDto closeButtonDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = closeButtonDto.title;
            }
            return closeButtonDto.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final CloseButtonDto copy(@Json(name = "title") String title) {
            return new CloseButtonDto(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CloseButtonDto) && jl40.l(this.title, ((CloseButtonDto) other).title);
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return oyr.p("CloseButtonDto(title=", this.title, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogDto$ConfirmButtonDto;", "", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmButtonDto {
        private final String title;

        public ConfirmButtonDto(@Json(name = "title") String str) {
            this.title = str;
        }

        public static /* synthetic */ ConfirmButtonDto copy$default(ConfirmButtonDto confirmButtonDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmButtonDto.title;
            }
            return confirmButtonDto.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final ConfirmButtonDto copy(@Json(name = "title") String title) {
            return new ConfirmButtonDto(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmButtonDto) && jl40.l(this.title, ((ConfirmButtonDto) other).title);
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return oyr.p("ConfirmButtonDto(title=", this.title, Extension.C_BRAKE);
        }
    }

    public DialogDto(@Json(name = "title") String str, @Json(name = "body") String str2, @Json(name = "close_button") CloseButtonDto closeButtonDto, @Json(name = "confirm_button") ConfirmButtonDto confirmButtonDto) {
        this.title = str;
        this.body = str2;
        this.closeButton = closeButtonDto;
        this.confirmButton = confirmButtonDto;
    }

    public static /* synthetic */ DialogDto copy$default(DialogDto dialogDto, String str, String str2, CloseButtonDto closeButtonDto, ConfirmButtonDto confirmButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogDto.title;
        }
        if ((i & 2) != 0) {
            str2 = dialogDto.body;
        }
        if ((i & 4) != 0) {
            closeButtonDto = dialogDto.closeButton;
        }
        if ((i & 8) != 0) {
            confirmButtonDto = dialogDto.confirmButton;
        }
        return dialogDto.copy(str, str2, closeButtonDto, confirmButtonDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final CloseButtonDto getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ConfirmButtonDto getConfirmButton() {
        return this.confirmButton;
    }

    public final DialogDto copy(@Json(name = "title") String title, @Json(name = "body") String body, @Json(name = "close_button") CloseButtonDto closeButton, @Json(name = "confirm_button") ConfirmButtonDto confirmButton) {
        return new DialogDto(title, body, closeButton, confirmButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogDto)) {
            return false;
        }
        DialogDto dialogDto = (DialogDto) other;
        return jl40.l(this.title, dialogDto.title) && jl40.l(this.body, dialogDto.body) && jl40.l(this.closeButton, dialogDto.closeButton) && jl40.l(this.confirmButton, dialogDto.confirmButton);
    }

    public final String getBody() {
        return this.body;
    }

    public final CloseButtonDto getCloseButton() {
        return this.closeButton;
    }

    public final ConfirmButtonDto getConfirmButton() {
        return this.confirmButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.body;
        return this.confirmButton.hashCode() + ((this.closeButton.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        CloseButtonDto closeButtonDto = this.closeButton;
        ConfirmButtonDto confirmButtonDto = this.confirmButton;
        StringBuilder v = b64.v("DialogDto(title=", str, ", body=", str2, ", closeButton=");
        v.append(closeButtonDto);
        v.append(", confirmButton=");
        v.append(confirmButtonDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
