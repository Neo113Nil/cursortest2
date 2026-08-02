package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AiChatActionDto;", "", "appId", "", "platform", "initialMessage", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AiChatMessageDto;", "headerTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AiChatMessageDto;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getPlatform", "getInitialMessage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AiChatMessageDto;", "getHeaderTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiChatActionDto {
    private final String appId;
    private final String headerTitle;
    private final AiChatMessageDto initialMessage;
    private final String platform;

    public AiChatActionDto(@Json(name = "app_id") String str, @Json(name = "platform") String str2, @Json(name = "initial_message") AiChatMessageDto aiChatMessageDto, @Json(name = "header_title") String str3) {
        this.appId = str;
        this.platform = str2;
        this.initialMessage = aiChatMessageDto;
        this.headerTitle = str3;
    }

    public static /* synthetic */ AiChatActionDto copy$default(AiChatActionDto aiChatActionDto, String str, String str2, AiChatMessageDto aiChatMessageDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiChatActionDto.appId;
        }
        if ((i & 2) != 0) {
            str2 = aiChatActionDto.platform;
        }
        if ((i & 4) != 0) {
            aiChatMessageDto = aiChatActionDto.initialMessage;
        }
        if ((i & 8) != 0) {
            str3 = aiChatActionDto.headerTitle;
        }
        return aiChatActionDto.copy(str, str2, aiChatMessageDto, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component3, reason: from getter */
    public final AiChatMessageDto getInitialMessage() {
        return this.initialMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final AiChatActionDto copy(@Json(name = "app_id") String appId, @Json(name = "platform") String platform, @Json(name = "initial_message") AiChatMessageDto initialMessage, @Json(name = "header_title") String headerTitle) {
        return new AiChatActionDto(appId, platform, initialMessage, headerTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatActionDto)) {
            return false;
        }
        AiChatActionDto aiChatActionDto = (AiChatActionDto) other;
        return jl40.l(this.appId, aiChatActionDto.appId) && jl40.l(this.platform, aiChatActionDto.platform) && jl40.l(this.initialMessage, aiChatActionDto.initialMessage) && jl40.l(this.headerTitle, aiChatActionDto.headerTitle);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final AiChatMessageDto getInitialMessage() {
        return this.initialMessage;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        String str = this.appId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AiChatMessageDto aiChatMessageDto = this.initialMessage;
        int hashCode3 = (hashCode2 + (aiChatMessageDto == null ? 0 : aiChatMessageDto.hashCode())) * 31;
        String str3 = this.headerTitle;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.appId;
        String str2 = this.platform;
        AiChatMessageDto aiChatMessageDto = this.initialMessage;
        String str3 = this.headerTitle;
        StringBuilder v = b64.v("AiChatActionDto(appId=", str, ", platform=", str2, ", initialMessage=");
        v.append(aiChatMessageDto);
        v.append(", headerTitle=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
