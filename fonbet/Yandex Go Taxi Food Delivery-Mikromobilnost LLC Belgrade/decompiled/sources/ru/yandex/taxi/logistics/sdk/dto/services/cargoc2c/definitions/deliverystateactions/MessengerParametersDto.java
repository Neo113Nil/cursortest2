package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerParametersDto;", "", "messengerHeader", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerHeaderDto;", "chatRequest", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChatRequestDto;", "chatMeta", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerHeaderDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChatRequestDto;Ljava/lang/Object;)V", "getMessengerHeader", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/MessengerHeaderDto;", "getChatRequest", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChatRequestDto;", "getChatMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MessengerParametersDto {
    private final Object chatMeta;
    private final ChatRequestDto chatRequest;
    private final MessengerHeaderDto messengerHeader;

    public MessengerParametersDto(@Json(name = "messenger_header") MessengerHeaderDto messengerHeaderDto, @Json(name = "chat_request") ChatRequestDto chatRequestDto, @Json(name = "chat_meta") Object obj) {
        this.messengerHeader = messengerHeaderDto;
        this.chatRequest = chatRequestDto;
        this.chatMeta = obj;
    }

    public static /* synthetic */ MessengerParametersDto copy$default(MessengerParametersDto messengerParametersDto, MessengerHeaderDto messengerHeaderDto, ChatRequestDto chatRequestDto, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            messengerHeaderDto = messengerParametersDto.messengerHeader;
        }
        if ((i & 2) != 0) {
            chatRequestDto = messengerParametersDto.chatRequest;
        }
        if ((i & 4) != 0) {
            obj = messengerParametersDto.chatMeta;
        }
        return messengerParametersDto.copy(messengerHeaderDto, chatRequestDto, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final MessengerHeaderDto getMessengerHeader() {
        return this.messengerHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final ChatRequestDto getChatRequest() {
        return this.chatRequest;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getChatMeta() {
        return this.chatMeta;
    }

    public final MessengerParametersDto copy(@Json(name = "messenger_header") MessengerHeaderDto messengerHeader, @Json(name = "chat_request") ChatRequestDto chatRequest, @Json(name = "chat_meta") Object chatMeta) {
        return new MessengerParametersDto(messengerHeader, chatRequest, chatMeta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessengerParametersDto)) {
            return false;
        }
        MessengerParametersDto messengerParametersDto = (MessengerParametersDto) other;
        return jl40.l(this.messengerHeader, messengerParametersDto.messengerHeader) && jl40.l(this.chatRequest, messengerParametersDto.chatRequest) && jl40.l(this.chatMeta, messengerParametersDto.chatMeta);
    }

    public final Object getChatMeta() {
        return this.chatMeta;
    }

    public final ChatRequestDto getChatRequest() {
        return this.chatRequest;
    }

    public final MessengerHeaderDto getMessengerHeader() {
        return this.messengerHeader;
    }

    public int hashCode() {
        int hashCode = (this.chatRequest.hashCode() + (this.messengerHeader.hashCode() * 31)) * 31;
        Object obj = this.chatMeta;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        MessengerHeaderDto messengerHeaderDto = this.messengerHeader;
        ChatRequestDto chatRequestDto = this.chatRequest;
        Object obj = this.chatMeta;
        StringBuilder sb = new StringBuilder("MessengerParametersDto(messengerHeader=");
        sb.append(messengerHeaderDto);
        sb.append(", chatRequest=");
        sb.append(chatRequestDto);
        sb.append(", chatMeta=");
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }
}
