package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/AiChatWidgetDto;", "", "iconTag", "", Constants.DEEPLINK, "popupHint", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/PopupHintDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/PopupHintDto;)V", "getIconTag", "()Ljava/lang/String;", "getDeeplink", "getPopupHint", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/PopupHintDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiChatWidgetDto {
    private final String deeplink;
    private final String iconTag;
    private final PopupHintDto popupHint;

    public AiChatWidgetDto(@Json(name = "icon_tag") String str, @Json(name = "deeplink") String str2, @Json(name = "popup_hint") PopupHintDto popupHintDto) {
        this.iconTag = str;
        this.deeplink = str2;
        this.popupHint = popupHintDto;
    }

    public static /* synthetic */ AiChatWidgetDto copy$default(AiChatWidgetDto aiChatWidgetDto, String str, String str2, PopupHintDto popupHintDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiChatWidgetDto.iconTag;
        }
        if ((i & 2) != 0) {
            str2 = aiChatWidgetDto.deeplink;
        }
        if ((i & 4) != 0) {
            popupHintDto = aiChatWidgetDto.popupHint;
        }
        return aiChatWidgetDto.copy(str, str2, popupHintDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIconTag() {
        return this.iconTag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final PopupHintDto getPopupHint() {
        return this.popupHint;
    }

    public final AiChatWidgetDto copy(@Json(name = "icon_tag") String iconTag, @Json(name = "deeplink") String deeplink, @Json(name = "popup_hint") PopupHintDto popupHint) {
        return new AiChatWidgetDto(iconTag, deeplink, popupHint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatWidgetDto)) {
            return false;
        }
        AiChatWidgetDto aiChatWidgetDto = (AiChatWidgetDto) other;
        return jl40.l(this.iconTag, aiChatWidgetDto.iconTag) && jl40.l(this.deeplink, aiChatWidgetDto.deeplink) && jl40.l(this.popupHint, aiChatWidgetDto.popupHint);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getIconTag() {
        return this.iconTag;
    }

    public final PopupHintDto getPopupHint() {
        return this.popupHint;
    }

    public int hashCode() {
        int b = unr0.b(this.iconTag.hashCode() * 31, 31, this.deeplink);
        PopupHintDto popupHintDto = this.popupHint;
        return b + (popupHintDto == null ? 0 : popupHintDto.hashCode());
    }

    public String toString() {
        String str = this.iconTag;
        String str2 = this.deeplink;
        PopupHintDto popupHintDto = this.popupHint;
        StringBuilder v = b64.v("AiChatWidgetDto(iconTag=", str, ", deeplink=", str2, ", popupHint=");
        v.append(popupHintDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
