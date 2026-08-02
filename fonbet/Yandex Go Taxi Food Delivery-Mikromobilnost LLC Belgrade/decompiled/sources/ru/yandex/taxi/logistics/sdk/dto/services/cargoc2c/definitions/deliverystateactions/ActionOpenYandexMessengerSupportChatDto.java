package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenYandexMessengerSupportChatDto;", "", "title", "", "messengerData", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenYandexMessengerSupportChatDto$MessengerDataDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenYandexMessengerSupportChatDto$MessengerDataDto;)V", "getTitle", "()Ljava/lang/String;", "getMessengerData", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenYandexMessengerSupportChatDto$MessengerDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MessengerDataDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionOpenYandexMessengerSupportChatDto {
    private final MessengerDataDto messengerData;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenYandexMessengerSupportChatDto$MessengerDataDto;", "", "payload", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/YandexMessengerPayloadDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/YandexMessengerPayloadDto;)V", "getPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/YandexMessengerPayloadDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MessengerDataDto {
        private final YandexMessengerPayloadDto payload;

        public MessengerDataDto(@Json(name = "payload") YandexMessengerPayloadDto yandexMessengerPayloadDto) {
            this.payload = yandexMessengerPayloadDto;
        }

        public static /* synthetic */ MessengerDataDto copy$default(MessengerDataDto messengerDataDto, YandexMessengerPayloadDto yandexMessengerPayloadDto, int i, Object obj) {
            if ((i & 1) != 0) {
                yandexMessengerPayloadDto = messengerDataDto.payload;
            }
            return messengerDataDto.copy(yandexMessengerPayloadDto);
        }

        /* renamed from: component1, reason: from getter */
        public final YandexMessengerPayloadDto getPayload() {
            return this.payload;
        }

        public final MessengerDataDto copy(@Json(name = "payload") YandexMessengerPayloadDto payload) {
            return new MessengerDataDto(payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessengerDataDto) && jl40.l(this.payload, ((MessengerDataDto) other).payload);
        }

        public final YandexMessengerPayloadDto getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "MessengerDataDto(payload=" + this.payload + Extension.C_BRAKE;
        }
    }

    public ActionOpenYandexMessengerSupportChatDto(@Json(name = "title") String str, @Json(name = "messenger_data") MessengerDataDto messengerDataDto) {
        this.title = str;
        this.messengerData = messengerDataDto;
    }

    public static /* synthetic */ ActionOpenYandexMessengerSupportChatDto copy$default(ActionOpenYandexMessengerSupportChatDto actionOpenYandexMessengerSupportChatDto, String str, MessengerDataDto messengerDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionOpenYandexMessengerSupportChatDto.title;
        }
        if ((i & 2) != 0) {
            messengerDataDto = actionOpenYandexMessengerSupportChatDto.messengerData;
        }
        return actionOpenYandexMessengerSupportChatDto.copy(str, messengerDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final MessengerDataDto getMessengerData() {
        return this.messengerData;
    }

    public final ActionOpenYandexMessengerSupportChatDto copy(@Json(name = "title") String title, @Json(name = "messenger_data") MessengerDataDto messengerData) {
        return new ActionOpenYandexMessengerSupportChatDto(title, messengerData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionOpenYandexMessengerSupportChatDto)) {
            return false;
        }
        ActionOpenYandexMessengerSupportChatDto actionOpenYandexMessengerSupportChatDto = (ActionOpenYandexMessengerSupportChatDto) other;
        return jl40.l(this.title, actionOpenYandexMessengerSupportChatDto.title) && jl40.l(this.messengerData, actionOpenYandexMessengerSupportChatDto.messengerData);
    }

    public final MessengerDataDto getMessengerData() {
        return this.messengerData;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.messengerData.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "ActionOpenYandexMessengerSupportChatDto(title=" + this.title + ", messengerData=" + this.messengerData + Extension.C_BRAKE;
    }
}
