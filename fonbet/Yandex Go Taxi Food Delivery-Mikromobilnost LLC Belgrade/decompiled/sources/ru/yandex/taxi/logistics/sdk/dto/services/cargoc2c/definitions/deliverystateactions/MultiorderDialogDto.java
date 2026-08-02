package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MultiorderDialogDto;", "", "title", "", "text", "primaryButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonDto;", "secondaryButton", "shimmering", "", "headerIconImageTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonDto;ZLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getText", "getPrimaryButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/DialogButtonDto;", "getSecondaryButton", "getShimmering", "()Z", "getHeaderIconImageTag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MultiorderDialogDto {
    private final String headerIconImageTag;
    private final DialogButtonDto primaryButton;
    private final DialogButtonDto secondaryButton;
    private final boolean shimmering;
    private final String text;
    private final String title;

    public MultiorderDialogDto(@Json(name = "title") String str, @Json(name = "text") String str2, @Json(name = "primary_button") DialogButtonDto dialogButtonDto, @Json(name = "secondary_button") DialogButtonDto dialogButtonDto2, @Json(name = "shimmering") boolean z, @Json(name = "header_icon_image_tag") String str3) {
        this.title = str;
        this.text = str2;
        this.primaryButton = dialogButtonDto;
        this.secondaryButton = dialogButtonDto2;
        this.shimmering = z;
        this.headerIconImageTag = str3;
    }

    public static /* synthetic */ MultiorderDialogDto copy$default(MultiorderDialogDto multiorderDialogDto, String str, String str2, DialogButtonDto dialogButtonDto, DialogButtonDto dialogButtonDto2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiorderDialogDto.title;
        }
        if ((i & 2) != 0) {
            str2 = multiorderDialogDto.text;
        }
        if ((i & 4) != 0) {
            dialogButtonDto = multiorderDialogDto.primaryButton;
        }
        if ((i & 8) != 0) {
            dialogButtonDto2 = multiorderDialogDto.secondaryButton;
        }
        if ((i & 16) != 0) {
            z = multiorderDialogDto.shimmering;
        }
        if ((i & 32) != 0) {
            str3 = multiorderDialogDto.headerIconImageTag;
        }
        boolean z2 = z;
        String str4 = str3;
        return multiorderDialogDto.copy(str, str2, dialogButtonDto, dialogButtonDto2, z2, str4);
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
    public final DialogButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component4, reason: from getter */
    public final DialogButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShimmering() {
        return this.shimmering;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHeaderIconImageTag() {
        return this.headerIconImageTag;
    }

    public final MultiorderDialogDto copy(@Json(name = "title") String title, @Json(name = "text") String text, @Json(name = "primary_button") DialogButtonDto primaryButton, @Json(name = "secondary_button") DialogButtonDto secondaryButton, @Json(name = "shimmering") boolean shimmering, @Json(name = "header_icon_image_tag") String headerIconImageTag) {
        return new MultiorderDialogDto(title, text, primaryButton, secondaryButton, shimmering, headerIconImageTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiorderDialogDto)) {
            return false;
        }
        MultiorderDialogDto multiorderDialogDto = (MultiorderDialogDto) other;
        return jl40.l(this.title, multiorderDialogDto.title) && jl40.l(this.text, multiorderDialogDto.text) && jl40.l(this.primaryButton, multiorderDialogDto.primaryButton) && jl40.l(this.secondaryButton, multiorderDialogDto.secondaryButton) && this.shimmering == multiorderDialogDto.shimmering && jl40.l(this.headerIconImageTag, multiorderDialogDto.headerIconImageTag);
    }

    public final String getHeaderIconImageTag() {
        return this.headerIconImageTag;
    }

    public final DialogButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final DialogButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final boolean getShimmering() {
        return this.shimmering;
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
        int hashCode2 = (this.primaryButton.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        DialogButtonDto dialogButtonDto = this.secondaryButton;
        int e = unr0.e((hashCode2 + (dialogButtonDto == null ? 0 : dialogButtonDto.hashCode())) * 31, 31, this.shimmering);
        String str2 = this.headerIconImageTag;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.text;
        DialogButtonDto dialogButtonDto = this.primaryButton;
        DialogButtonDto dialogButtonDto2 = this.secondaryButton;
        boolean z = this.shimmering;
        String str3 = this.headerIconImageTag;
        StringBuilder v = b64.v("MultiorderDialogDto(title=", str, ", text=", str2, ", primaryButton=");
        v.append(dialogButtonDto);
        v.append(", secondaryButton=");
        v.append(dialogButtonDto2);
        v.append(", shimmering=");
        return n.m(", headerIconImageTag=", str3, Extension.C_BRAKE, v, z);
    }

    public /* synthetic */ MultiorderDialogDto(String str, String str2, DialogButtonDto dialogButtonDto, DialogButtonDto dialogButtonDto2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dialogButtonDto, dialogButtonDto2, (i & 16) != 0 ? false : z, str3);
    }
}
