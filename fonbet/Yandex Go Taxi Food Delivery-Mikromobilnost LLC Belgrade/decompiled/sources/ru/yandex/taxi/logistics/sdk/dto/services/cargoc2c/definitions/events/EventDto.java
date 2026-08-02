package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "Event_OrderCreateRequestedDto", "Event_OrderCreateSucceededDto", "Event_OrderCreateFailedDto", "Event_OrderCancelRequestedDto", "Event_OrderCancelSucceededDto", "Event_OrderCancelFailedDto", "Event_OrderEditSubmittedDto", "Event_OrderEditFailedDto", "Event_OrderEditSucceededDto", "Event_OrderPayNowRequestedDto", "Event_OrderPayNowSucceededDto", "Event_OrderPayNowFailedDto", "Event_RoverActionRequestedDto", "Event_RoverActionSubmittedDto", "Event_RoverActionSucceededDto", "Event_RoverActionFailedDto", "Event_AiPostcardRequestedDto", "Event_AiPostcardGeneratedDto", "Event_AiPostcardFailedDto", "Event_AiPostcardSubmittedDto", "Unknown_EventDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardGeneratedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardSubmittedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditSubmittedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionSubmittedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Unknown_EventDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class EventDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardFailedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardFailedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardFailedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardFailedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_AiPostcardFailedDto extends EventDto {
        public final String a;
        public final AiPostcardFailedDto b;

        public Event_AiPostcardFailedDto(@Json(name = "type") String str, AiPostcardFailedDto aiPostcardFailedDto) {
            this.a = str;
            this.b = aiPostcardFailedDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_AiPostcardFailedDto copy(@Json(name = "type") String type, AiPostcardFailedDto value) {
            return new Event_AiPostcardFailedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_AiPostcardFailedDto)) {
                return false;
            }
            Event_AiPostcardFailedDto event_AiPostcardFailedDto = (Event_AiPostcardFailedDto) obj;
            return this.a.equals(event_AiPostcardFailedDto.a) && this.b.equals(event_AiPostcardFailedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_AiPostcardFailedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardGeneratedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardGeneratedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardGeneratedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardGeneratedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardGeneratedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_AiPostcardGeneratedDto extends EventDto {
        public final String a;
        public final AiPostcardGeneratedDto b;

        public Event_AiPostcardGeneratedDto(@Json(name = "type") String str, AiPostcardGeneratedDto aiPostcardGeneratedDto) {
            this.a = str;
            this.b = aiPostcardGeneratedDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_AiPostcardGeneratedDto copy(@Json(name = "type") String type, AiPostcardGeneratedDto value) {
            return new Event_AiPostcardGeneratedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_AiPostcardGeneratedDto)) {
                return false;
            }
            Event_AiPostcardGeneratedDto event_AiPostcardGeneratedDto = (Event_AiPostcardGeneratedDto) obj;
            return this.a.equals(event_AiPostcardGeneratedDto.a) && this.b.equals(event_AiPostcardGeneratedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_AiPostcardGeneratedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardRequestedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardRequestedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardRequestedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardRequestedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_AiPostcardRequestedDto extends EventDto {
        public final String a;
        public final AiPostcardRequestedDto b;

        public Event_AiPostcardRequestedDto(@Json(name = "type") String str, AiPostcardRequestedDto aiPostcardRequestedDto) {
            this.a = str;
            this.b = aiPostcardRequestedDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_AiPostcardRequestedDto copy(@Json(name = "type") String type, AiPostcardRequestedDto value) {
            return new Event_AiPostcardRequestedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_AiPostcardRequestedDto)) {
                return false;
            }
            Event_AiPostcardRequestedDto event_AiPostcardRequestedDto = (Event_AiPostcardRequestedDto) obj;
            return this.a.equals(event_AiPostcardRequestedDto.a) && this.b.equals(event_AiPostcardRequestedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_AiPostcardRequestedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardSubmittedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardSubmittedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardSubmittedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/AiPostcardSubmittedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_AiPostcardSubmittedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_AiPostcardSubmittedDto extends EventDto {
        public final String a;
        public final AiPostcardSubmittedDto b;

        public Event_AiPostcardSubmittedDto(@Json(name = "type") String str, AiPostcardSubmittedDto aiPostcardSubmittedDto) {
            this.a = str;
            this.b = aiPostcardSubmittedDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_AiPostcardSubmittedDto copy(@Json(name = "type") String type, AiPostcardSubmittedDto value) {
            return new Event_AiPostcardSubmittedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_AiPostcardSubmittedDto)) {
                return false;
            }
            Event_AiPostcardSubmittedDto event_AiPostcardSubmittedDto = (Event_AiPostcardSubmittedDto) obj;
            return this.a.equals(event_AiPostcardSubmittedDto.a) && this.b.equals(event_AiPostcardSubmittedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_AiPostcardSubmittedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelFailedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelFailedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelFailedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelFailedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderCancelFailedDto extends EventDto {
        public final String a;
        public final OrderCancelFailedDto b;

        public Event_OrderCancelFailedDto(@Json(name = "type") String str, OrderCancelFailedDto orderCancelFailedDto) {
            this.a = str;
            this.b = orderCancelFailedDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderCancelFailedDto copy(@Json(name = "type") String type, OrderCancelFailedDto value) {
            return new Event_OrderCancelFailedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderCancelFailedDto)) {
                return false;
            }
            Event_OrderCancelFailedDto event_OrderCancelFailedDto = (Event_OrderCancelFailedDto) obj;
            return this.a.equals(event_OrderCancelFailedDto.a) && this.b.equals(event_OrderCancelFailedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderCancelFailedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelRequestedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelRequestedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderCancelRequestedDto extends EventDto {
        public final String a;
        public final OrderCancelEventDto b;

        public Event_OrderCancelRequestedDto(@Json(name = "type") String str, OrderCancelEventDto orderCancelEventDto) {
            this.a = str;
            this.b = orderCancelEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderCancelRequestedDto copy(@Json(name = "type") String type, OrderCancelEventDto value) {
            return new Event_OrderCancelRequestedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderCancelRequestedDto)) {
                return false;
            }
            Event_OrderCancelRequestedDto event_OrderCancelRequestedDto = (Event_OrderCancelRequestedDto) obj;
            return this.a.equals(event_OrderCancelRequestedDto.a) && this.b.equals(event_OrderCancelRequestedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderCancelRequestedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelSucceededDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCancelEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCancelSucceededDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderCancelSucceededDto extends EventDto {
        public final String a;
        public final OrderCancelEventDto b;

        public Event_OrderCancelSucceededDto(@Json(name = "type") String str, OrderCancelEventDto orderCancelEventDto) {
            this.a = str;
            this.b = orderCancelEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderCancelSucceededDto copy(@Json(name = "type") String type, OrderCancelEventDto value) {
            return new Event_OrderCancelSucceededDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderCancelSucceededDto)) {
                return false;
            }
            Event_OrderCancelSucceededDto event_OrderCancelSucceededDto = (Event_OrderCancelSucceededDto) obj;
            return this.a.equals(event_OrderCancelSucceededDto.a) && this.b.equals(event_OrderCancelSucceededDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderCancelSucceededDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryFailureEventDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryFailureEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryFailureEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateFailedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderCreateFailedDto extends EventDto {
        public final String a;
        public final DefaultDeliveryFailureEventDto b;

        public Event_OrderCreateFailedDto(@Json(name = "type") String str, DefaultDeliveryFailureEventDto defaultDeliveryFailureEventDto) {
            this.a = str;
            this.b = defaultDeliveryFailureEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderCreateFailedDto copy(@Json(name = "type") String type, DefaultDeliveryFailureEventDto value) {
            return new Event_OrderCreateFailedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderCreateFailedDto)) {
                return false;
            }
            Event_OrderCreateFailedDto event_OrderCreateFailedDto = (Event_OrderCreateFailedDto) obj;
            return this.a.equals(event_OrderCreateFailedDto.a) && this.b.equals(event_OrderCreateFailedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderCreateFailedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCreateRequestedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateRequestedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderCreateRequestedDto extends EventDto {
        public final String a;
        public final DefaultDeliveryEventDto b;

        public Event_OrderCreateRequestedDto(@Json(name = "type") String str, DefaultDeliveryEventDto defaultDeliveryEventDto) {
            this.a = str;
            this.b = defaultDeliveryEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderCreateRequestedDto copy(@Json(name = "type") String type, DefaultDeliveryEventDto value) {
            return new Event_OrderCreateRequestedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderCreateRequestedDto)) {
                return false;
            }
            Event_OrderCreateRequestedDto event_OrderCreateRequestedDto = (Event_OrderCreateRequestedDto) obj;
            return this.a.equals(event_OrderCreateRequestedDto.a) && this.b.equals(event_OrderCreateRequestedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderCreateRequestedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderCreateSucceededDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/DefaultDeliveryEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderCreateSucceededDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderCreateSucceededDto extends EventDto {
        public final String a;
        public final DefaultDeliveryEventDto b;

        public Event_OrderCreateSucceededDto(@Json(name = "type") String str, DefaultDeliveryEventDto defaultDeliveryEventDto) {
            this.a = str;
            this.b = defaultDeliveryEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderCreateSucceededDto copy(@Json(name = "type") String type, DefaultDeliveryEventDto value) {
            return new Event_OrderCreateSucceededDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderCreateSucceededDto)) {
                return false;
            }
            Event_OrderCreateSucceededDto event_OrderCreateSucceededDto = (Event_OrderCreateSucceededDto) obj;
            return this.a.equals(event_OrderCreateSucceededDto.a) && this.b.equals(event_OrderCreateSucceededDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderCreateSucceededDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditFailedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditFailedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderEditFailedDto extends EventDto {
        public final String a;
        public final OrderEditDialogEventDto b;

        public Event_OrderEditFailedDto(@Json(name = "type") String str, OrderEditDialogEventDto orderEditDialogEventDto) {
            this.a = str;
            this.b = orderEditDialogEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderEditFailedDto copy(@Json(name = "type") String type, OrderEditDialogEventDto value) {
            return new Event_OrderEditFailedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderEditFailedDto)) {
                return false;
            }
            Event_OrderEditFailedDto event_OrderEditFailedDto = (Event_OrderEditFailedDto) obj;
            return this.a.equals(event_OrderEditFailedDto.a) && this.b.equals(event_OrderEditFailedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderEditFailedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditSubmittedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditSubmittedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditSubmittedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderEditSubmittedDto extends EventDto {
        public final String a;
        public final OrderEditDialogEventDto b;

        public Event_OrderEditSubmittedDto(@Json(name = "type") String str, OrderEditDialogEventDto orderEditDialogEventDto) {
            this.a = str;
            this.b = orderEditDialogEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderEditSubmittedDto copy(@Json(name = "type") String type, OrderEditDialogEventDto value) {
            return new Event_OrderEditSubmittedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderEditSubmittedDto)) {
                return false;
            }
            Event_OrderEditSubmittedDto event_OrderEditSubmittedDto = (Event_OrderEditSubmittedDto) obj;
            return this.a.equals(event_OrderEditSubmittedDto.a) && this.b.equals(event_OrderEditSubmittedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderEditSubmittedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditSucceededDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditSucceededDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditSucceededDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditSucceededDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderEditSucceededDto extends EventDto {
        public final String a;
        public final OrderEditSucceededDto b;

        public Event_OrderEditSucceededDto(@Json(name = "type") String str, OrderEditSucceededDto orderEditSucceededDto) {
            this.a = str;
            this.b = orderEditSucceededDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderEditSucceededDto copy(@Json(name = "type") String type, OrderEditSucceededDto value) {
            return new Event_OrderEditSucceededDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderEditSucceededDto)) {
                return false;
            }
            Event_OrderEditSucceededDto event_OrderEditSucceededDto = (Event_OrderEditSucceededDto) obj;
            return this.a.equals(event_OrderEditSucceededDto.a) && this.b.equals(event_OrderEditSucceededDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderEditSucceededDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowFailedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowFailedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowFailedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowFailedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderPayNowFailedDto extends EventDto {
        public final String a;
        public final OrderPayNowFailedDto b;

        public Event_OrderPayNowFailedDto(@Json(name = "type") String str, OrderPayNowFailedDto orderPayNowFailedDto) {
            this.a = str;
            this.b = orderPayNowFailedDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderPayNowFailedDto copy(@Json(name = "type") String type, OrderPayNowFailedDto value) {
            return new Event_OrderPayNowFailedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderPayNowFailedDto)) {
                return false;
            }
            Event_OrderPayNowFailedDto event_OrderPayNowFailedDto = (Event_OrderPayNowFailedDto) obj;
            return this.a.equals(event_OrderPayNowFailedDto.a) && this.b.equals(event_OrderPayNowFailedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderPayNowFailedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowRequestedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowRequestedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderPayNowRequestedDto extends EventDto {
        public final String a;
        public final OrderPayNowEventDto b;

        public Event_OrderPayNowRequestedDto(@Json(name = "type") String str, OrderPayNowEventDto orderPayNowEventDto) {
            this.a = str;
            this.b = orderPayNowEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderPayNowRequestedDto copy(@Json(name = "type") String type, OrderPayNowEventDto value) {
            return new Event_OrderPayNowRequestedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderPayNowRequestedDto)) {
                return false;
            }
            Event_OrderPayNowRequestedDto event_OrderPayNowRequestedDto = (Event_OrderPayNowRequestedDto) obj;
            return this.a.equals(event_OrderPayNowRequestedDto.a) && this.b.equals(event_OrderPayNowRequestedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderPayNowRequestedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowSucceededDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderPayNowEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderPayNowSucceededDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_OrderPayNowSucceededDto extends EventDto {
        public final String a;
        public final OrderPayNowEventDto b;

        public Event_OrderPayNowSucceededDto(@Json(name = "type") String str, OrderPayNowEventDto orderPayNowEventDto) {
            this.a = str;
            this.b = orderPayNowEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_OrderPayNowSucceededDto copy(@Json(name = "type") String type, OrderPayNowEventDto value) {
            return new Event_OrderPayNowSucceededDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_OrderPayNowSucceededDto)) {
                return false;
            }
            Event_OrderPayNowSucceededDto event_OrderPayNowSucceededDto = (Event_OrderPayNowSucceededDto) obj;
            return this.a.equals(event_OrderPayNowSucceededDto.a) && this.b.equals(event_OrderPayNowSucceededDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_OrderPayNowSucceededDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionFailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionFailedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionFailedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionFailedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionFailedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_RoverActionFailedDto extends EventDto {
        public final String a;
        public final RoverActionFailedDto b;

        public Event_RoverActionFailedDto(@Json(name = "type") String str, RoverActionFailedDto roverActionFailedDto) {
            this.a = str;
            this.b = roverActionFailedDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_RoverActionFailedDto copy(@Json(name = "type") String type, RoverActionFailedDto value) {
            return new Event_RoverActionFailedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_RoverActionFailedDto)) {
                return false;
            }
            Event_RoverActionFailedDto event_RoverActionFailedDto = (Event_RoverActionFailedDto) obj;
            return this.a.equals(event_RoverActionFailedDto.a) && this.b.equals(event_RoverActionFailedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_RoverActionFailedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionRequestedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionRequestedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionRequestedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_RoverActionRequestedDto extends EventDto {
        public final String a;
        public final RoverActionEventDto b;

        public Event_RoverActionRequestedDto(@Json(name = "type") String str, RoverActionEventDto roverActionEventDto) {
            this.a = str;
            this.b = roverActionEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_RoverActionRequestedDto copy(@Json(name = "type") String type, RoverActionEventDto value) {
            return new Event_RoverActionRequestedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_RoverActionRequestedDto)) {
                return false;
            }
            Event_RoverActionRequestedDto event_RoverActionRequestedDto = (Event_RoverActionRequestedDto) obj;
            return this.a.equals(event_RoverActionRequestedDto.a) && this.b.equals(event_RoverActionRequestedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_RoverActionRequestedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionSubmittedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionSubmittedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionSubmittedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_RoverActionSubmittedDto extends EventDto {
        public final String a;
        public final RoverActionEventDto b;

        public Event_RoverActionSubmittedDto(@Json(name = "type") String str, RoverActionEventDto roverActionEventDto) {
            this.a = str;
            this.b = roverActionEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_RoverActionSubmittedDto copy(@Json(name = "type") String type, RoverActionEventDto value) {
            return new Event_RoverActionSubmittedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_RoverActionSubmittedDto)) {
                return false;
            }
            Event_RoverActionSubmittedDto event_RoverActionSubmittedDto = (Event_RoverActionSubmittedDto) obj;
            return this.a.equals(event_RoverActionSubmittedDto.a) && this.b.equals(event_RoverActionSubmittedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_RoverActionSubmittedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionSucceededDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionSucceededDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/RoverActionEventDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_RoverActionSucceededDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Event_RoverActionSucceededDto extends EventDto {
        public final String a;
        public final RoverActionEventDto b;

        public Event_RoverActionSucceededDto(@Json(name = "type") String str, RoverActionEventDto roverActionEventDto) {
            this.a = str;
            this.b = roverActionEventDto;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Event_RoverActionSucceededDto copy(@Json(name = "type") String type, RoverActionEventDto value) {
            return new Event_RoverActionSucceededDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event_RoverActionSucceededDto)) {
                return false;
            }
            Event_RoverActionSucceededDto event_RoverActionSucceededDto = (Event_RoverActionSucceededDto) obj;
            return this.a.equals(event_RoverActionSucceededDto.a) && this.b.equals(event_RoverActionSucceededDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Event_RoverActionSucceededDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    /* renamed from: a */
    public abstract String getA();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Unknown_EventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Unknown_EventDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_EventDto extends EventDto {
        public final String a;

        public Unknown_EventDto(@Json(name = "type") String str) {
            this.a = str;
        }

        @Override // ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto
        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final Unknown_EventDto copy(@Json(name = "type") String type) {
            return new Unknown_EventDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_EventDto) && jl40.l(this.a, ((Unknown_EventDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_EventDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_EventDto() {
            this(0);
        }

        public /* synthetic */ Unknown_EventDto(int i) {
            this("unknown");
        }
    }
}
