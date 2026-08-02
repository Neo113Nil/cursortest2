package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004'()*BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006+"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto;", "", "triggers", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto;", Constants.DEEPLINK, "", "schedule", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto;", "contactPolicy", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto;", "body", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$BodyDto;", "metricaContext", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$BodyDto;Ljava/lang/String;)V", "getTriggers", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto;", "getDeeplink", "()Ljava/lang/String;", "getSchedule", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto;", "getContactPolicy", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto;", "getBody", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$BodyDto;", "getMetricaContext", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TriggersDto", "ScheduleDto", "ContactPolicyDto", "BodyDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LocalNotificationDto {
    private final BodyDto body;
    private final ContactPolicyDto contactPolicy;
    private final String deeplink;
    private final String metricaContext;
    private final ScheduleDto schedule;
    private final TriggersDto triggers;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$BodyDto;", "", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BodyDto {
        private final String subtitle;
        private final String title;

        public BodyDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public static /* synthetic */ BodyDto copy$default(BodyDto bodyDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bodyDto.title;
            }
            if ((i & 2) != 0) {
                str2 = bodyDto.subtitle;
            }
            return bodyDto.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final BodyDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle) {
            return new BodyDto(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BodyDto)) {
                return false;
            }
            BodyDto bodyDto = (BodyDto) other;
            return jl40.l(this.title, bodyDto.title) && jl40.l(this.subtitle, bodyDto.subtitle);
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("BodyDto(title=", this.title, ", subtitle=", this.subtitle, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto$TypeDto;", "value", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto$TypeDto;I)V", "getType", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto$TypeDto;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "TypeDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactPolicyDto {
        private final TypeDto type;
        private final int value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ContactPolicyDto$TypeDto;", "", "MINUTES", "HOURS", "DAYS", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TypeDto {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @Json(name = "days")
            public static final TypeDto DAYS;

            @Json(name = "hours")
            public static final TypeDto HOURS;

            @Json(name = "minutes")
            public static final TypeDto MINUTES;

            static {
                TypeDto typeDto = new TypeDto("MINUTES", 0);
                MINUTES = typeDto;
                TypeDto typeDto2 = new TypeDto("HOURS", 1);
                HOURS = typeDto2;
                TypeDto typeDto3 = new TypeDto("DAYS", 2);
                DAYS = typeDto3;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
                $VALUES = typeDtoArr;
                $ENTRIES = a.a(typeDtoArr);
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }
        }

        public ContactPolicyDto(@Json(name = "type") TypeDto typeDto, @Json(name = "value") int i) {
            this.type = typeDto;
            this.value = i;
        }

        public static /* synthetic */ ContactPolicyDto copy$default(ContactPolicyDto contactPolicyDto, TypeDto typeDto, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                typeDto = contactPolicyDto.type;
            }
            if ((i2 & 2) != 0) {
                i = contactPolicyDto.value;
            }
            return contactPolicyDto.copy(typeDto, i);
        }

        /* renamed from: component1, reason: from getter */
        public final TypeDto getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final ContactPolicyDto copy(@Json(name = "type") TypeDto type, @Json(name = "value") int value) {
            return new ContactPolicyDto(type, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactPolicyDto)) {
                return false;
            }
            ContactPolicyDto contactPolicyDto = (ContactPolicyDto) other;
            return this.type == contactPolicyDto.type && this.value == contactPolicyDto.value;
        }

        public final TypeDto getType() {
            return this.type;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value) + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "ContactPolicyDto(type=" + this.type + ", value=" + this.value + Extension.C_BRAKE;
        }
    }

    public LocalNotificationDto(@Json(name = "triggers") TriggersDto triggersDto, @Json(name = "deeplink") String str, @Json(name = "schedule") ScheduleDto scheduleDto, @Json(name = "contact_policy") ContactPolicyDto contactPolicyDto, @Json(name = "body") BodyDto bodyDto, @Json(name = "metrica_context") String str2) {
        this.triggers = triggersDto;
        this.deeplink = str;
        this.schedule = scheduleDto;
        this.contactPolicy = contactPolicyDto;
        this.body = bodyDto;
        this.metricaContext = str2;
    }

    public static /* synthetic */ LocalNotificationDto copy$default(LocalNotificationDto localNotificationDto, TriggersDto triggersDto, String str, ScheduleDto scheduleDto, ContactPolicyDto contactPolicyDto, BodyDto bodyDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            triggersDto = localNotificationDto.triggers;
        }
        if ((i & 2) != 0) {
            str = localNotificationDto.deeplink;
        }
        if ((i & 4) != 0) {
            scheduleDto = localNotificationDto.schedule;
        }
        if ((i & 8) != 0) {
            contactPolicyDto = localNotificationDto.contactPolicy;
        }
        if ((i & 16) != 0) {
            bodyDto = localNotificationDto.body;
        }
        if ((i & 32) != 0) {
            str2 = localNotificationDto.metricaContext;
        }
        BodyDto bodyDto2 = bodyDto;
        String str3 = str2;
        return localNotificationDto.copy(triggersDto, str, scheduleDto, contactPolicyDto, bodyDto2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final TriggersDto getTriggers() {
        return this.triggers;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final ScheduleDto getSchedule() {
        return this.schedule;
    }

    /* renamed from: component4, reason: from getter */
    public final ContactPolicyDto getContactPolicy() {
        return this.contactPolicy;
    }

    /* renamed from: component5, reason: from getter */
    public final BodyDto getBody() {
        return this.body;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaContext() {
        return this.metricaContext;
    }

    public final LocalNotificationDto copy(@Json(name = "triggers") TriggersDto triggers, @Json(name = "deeplink") String deeplink, @Json(name = "schedule") ScheduleDto schedule, @Json(name = "contact_policy") ContactPolicyDto contactPolicy, @Json(name = "body") BodyDto body, @Json(name = "metrica_context") String metricaContext) {
        return new LocalNotificationDto(triggers, deeplink, schedule, contactPolicy, body, metricaContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalNotificationDto)) {
            return false;
        }
        LocalNotificationDto localNotificationDto = (LocalNotificationDto) other;
        return jl40.l(this.triggers, localNotificationDto.triggers) && jl40.l(this.deeplink, localNotificationDto.deeplink) && jl40.l(this.schedule, localNotificationDto.schedule) && jl40.l(this.contactPolicy, localNotificationDto.contactPolicy) && jl40.l(this.body, localNotificationDto.body) && jl40.l(this.metricaContext, localNotificationDto.metricaContext);
    }

    public final BodyDto getBody() {
        return this.body;
    }

    public final ContactPolicyDto getContactPolicy() {
        return this.contactPolicy;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getMetricaContext() {
        return this.metricaContext;
    }

    public final ScheduleDto getSchedule() {
        return this.schedule;
    }

    public final TriggersDto getTriggers() {
        return this.triggers;
    }

    public int hashCode() {
        int hashCode = this.triggers.hashCode() * 31;
        String str = this.deeplink;
        int hashCode2 = (this.body.hashCode() + ((this.contactPolicy.hashCode() + ((this.schedule.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.metricaContext;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LocalNotificationDto(triggers=" + this.triggers + ", deeplink=" + this.deeplink + ", schedule=" + this.schedule + ", contactPolicy=" + this.contactPolicy + ", body=" + this.body + ", metricaContext=" + this.metricaContext + Extension.C_BRAKE;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto;", "", "strategy", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;", "communicationWindow", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/CommunicationWindowDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/CommunicationWindowDto;)V", "getStrategy", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;", "getCommunicationWindow", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/CommunicationWindowDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StrategyDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScheduleDto {
        private final CommunicationWindowDto communicationWindow;
        private final StrategyDto strategy;

        public ScheduleDto(@Json(name = "strategy") StrategyDto strategyDto, @Json(name = "communication_window") CommunicationWindowDto communicationWindowDto) {
            this.strategy = strategyDto;
            this.communicationWindow = communicationWindowDto;
        }

        public static /* synthetic */ ScheduleDto copy$default(ScheduleDto scheduleDto, StrategyDto strategyDto, CommunicationWindowDto communicationWindowDto, int i, Object obj) {
            if ((i & 1) != 0) {
                strategyDto = scheduleDto.strategy;
            }
            if ((i & 2) != 0) {
                communicationWindowDto = scheduleDto.communicationWindow;
            }
            return scheduleDto.copy(strategyDto, communicationWindowDto);
        }

        /* renamed from: component1, reason: from getter */
        public final StrategyDto getStrategy() {
            return this.strategy;
        }

        /* renamed from: component2, reason: from getter */
        public final CommunicationWindowDto getCommunicationWindow() {
            return this.communicationWindow;
        }

        public final ScheduleDto copy(@Json(name = "strategy") StrategyDto strategy, @Json(name = "communication_window") CommunicationWindowDto communicationWindow) {
            return new ScheduleDto(strategy, communicationWindow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScheduleDto)) {
                return false;
            }
            ScheduleDto scheduleDto = (ScheduleDto) other;
            return jl40.l(this.strategy, scheduleDto.strategy) && jl40.l(this.communicationWindow, scheduleDto.communicationWindow);
        }

        public final CommunicationWindowDto getCommunicationWindow() {
            return this.communicationWindow;
        }

        public final StrategyDto getStrategy() {
            return this.strategy;
        }

        public int hashCode() {
            return this.communicationWindow.hashCode() + (this.strategy.hashCode() * 31);
        }

        public String toString() {
            return "ScheduleDto(strategy=" + this.strategy + ", communicationWindow=" + this.communicationWindow + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;", "", "Strategy_DelayDto", "Strategy_FixedTimeDto", "Unknown_StrategyDto", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_DelayDto;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_FixedTimeDto;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Unknown_StrategyDto;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class StrategyDto {

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_DelayDto;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DelayStrategyDto;)Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_DelayDto;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Strategy_DelayDto extends StrategyDto {
                public final String a;
                public final DelayStrategyDto b;

                public Strategy_DelayDto(@Json(name = "type") String str, DelayStrategyDto delayStrategyDto) {
                    this.a = str;
                    this.b = delayStrategyDto;
                }

                public final Strategy_DelayDto copy(@Json(name = "type") String type, DelayStrategyDto value) {
                    return new Strategy_DelayDto(type, value);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Strategy_DelayDto)) {
                        return false;
                    }
                    Strategy_DelayDto strategy_DelayDto = (Strategy_DelayDto) obj;
                    return this.a.equals(strategy_DelayDto.a) && this.b.equals(strategy_DelayDto.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Strategy_DelayDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_FixedTimeDto;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/FixedTimeStrategyDto;)Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Strategy_FixedTimeDto;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Strategy_FixedTimeDto extends StrategyDto {
                public final String a;
                public final FixedTimeStrategyDto b;

                public Strategy_FixedTimeDto(@Json(name = "type") String str, FixedTimeStrategyDto fixedTimeStrategyDto) {
                    this.a = str;
                    this.b = fixedTimeStrategyDto;
                }

                public final Strategy_FixedTimeDto copy(@Json(name = "type") String type, FixedTimeStrategyDto value) {
                    return new Strategy_FixedTimeDto(type, value);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Strategy_FixedTimeDto)) {
                        return false;
                    }
                    Strategy_FixedTimeDto strategy_FixedTimeDto = (Strategy_FixedTimeDto) obj;
                    return this.a.equals(strategy_FixedTimeDto.a) && this.b.equals(strategy_FixedTimeDto.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "Strategy_FixedTimeDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Unknown_StrategyDto;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$ScheduleDto$StrategyDto$Unknown_StrategyDto;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Unknown_StrategyDto extends StrategyDto {
                public final String a;

                public Unknown_StrategyDto(@Json(name = "type") String str) {
                    this.a = str;
                }

                public final Unknown_StrategyDto copy(@Json(name = "type") String type) {
                    return new Unknown_StrategyDto(type);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Unknown_StrategyDto) && jl40.l(this.a, ((Unknown_StrategyDto) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return oyr.p("Unknown_StrategyDto(type=", this.a, Extension.C_BRAKE);
                }

                public Unknown_StrategyDto() {
                    this(0);
                }

                public /* synthetic */ Unknown_StrategyDto(int i) {
                    this("unknown");
                }
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eBG\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto;", "", "modes", "", "", "entryPoints", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto$EntryPointsDto;", "requirePointA", "", "requirePointB", "isPvzPoints", "<init>", "(Ljava/util/List;Ljava/util/List;ZZZ)V", "getModes", "()Ljava/util/List;", "getEntryPoints", "getRequirePointA", "()Z", "getRequirePointB", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "EntryPointsDto", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggersDto {
        private final List<EntryPointsDto> entryPoints;
        private final boolean isPvzPoints;
        private final List<String> modes;
        private final boolean requirePointA;
        private final boolean requirePointB;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto$TriggersDto$EntryPointsDto;", "", "PULT", "SUMMARY", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class EntryPointsDto {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ EntryPointsDto[] $VALUES;

            @Json(name = "pult")
            public static final EntryPointsDto PULT;

            @Json(name = "summary")
            public static final EntryPointsDto SUMMARY;

            static {
                EntryPointsDto entryPointsDto = new EntryPointsDto("PULT", 0);
                PULT = entryPointsDto;
                EntryPointsDto entryPointsDto2 = new EntryPointsDto("SUMMARY", 1);
                SUMMARY = entryPointsDto2;
                EntryPointsDto[] entryPointsDtoArr = {entryPointsDto, entryPointsDto2};
                $VALUES = entryPointsDtoArr;
                $ENTRIES = a.a(entryPointsDtoArr);
            }

            public static EntryPointsDto valueOf(String str) {
                return (EntryPointsDto) Enum.valueOf(EntryPointsDto.class, str);
            }

            public static EntryPointsDto[] values() {
                return (EntryPointsDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ TriggersDto(List list, List list2, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3);
        }

        public static /* synthetic */ TriggersDto copy$default(TriggersDto triggersDto, List list, List list2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = triggersDto.modes;
            }
            if ((i & 2) != 0) {
                list2 = triggersDto.entryPoints;
            }
            if ((i & 4) != 0) {
                z = triggersDto.requirePointA;
            }
            if ((i & 8) != 0) {
                z2 = triggersDto.requirePointB;
            }
            if ((i & 16) != 0) {
                z3 = triggersDto.isPvzPoints;
            }
            boolean z4 = z3;
            boolean z5 = z;
            return triggersDto.copy(list, list2, z5, z2, z4);
        }

        public final List<String> component1() {
            return this.modes;
        }

        public final List<EntryPointsDto> component2() {
            return this.entryPoints;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRequirePointA() {
            return this.requirePointA;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getRequirePointB() {
            return this.requirePointB;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsPvzPoints() {
            return this.isPvzPoints;
        }

        public final TriggersDto copy(@Json(name = "modes") List<String> modes, @Json(name = "entry_points") List<? extends EntryPointsDto> entryPoints, @Json(name = "require_point_a") boolean requirePointA, @Json(name = "require_point_b") boolean requirePointB, @Json(name = "is_pvz_points") boolean isPvzPoints) {
            return new TriggersDto(modes, entryPoints, requirePointA, requirePointB, isPvzPoints);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TriggersDto)) {
                return false;
            }
            TriggersDto triggersDto = (TriggersDto) other;
            return jl40.l(this.modes, triggersDto.modes) && jl40.l(this.entryPoints, triggersDto.entryPoints) && this.requirePointA == triggersDto.requirePointA && this.requirePointB == triggersDto.requirePointB && this.isPvzPoints == triggersDto.isPvzPoints;
        }

        public final List<EntryPointsDto> getEntryPoints() {
            return this.entryPoints;
        }

        public final List<String> getModes() {
            return this.modes;
        }

        public final boolean getRequirePointA() {
            return this.requirePointA;
        }

        public final boolean getRequirePointB() {
            return this.requirePointB;
        }

        public int hashCode() {
            int hashCode = this.modes.hashCode() * 31;
            List<EntryPointsDto> list = this.entryPoints;
            return Boolean.hashCode(this.isPvzPoints) + unr0.e(unr0.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.requirePointA), 31, this.requirePointB);
        }

        public final boolean isPvzPoints() {
            return this.isPvzPoints;
        }

        public String toString() {
            List<String> list = this.modes;
            List<EntryPointsDto> list2 = this.entryPoints;
            boolean z = this.requirePointA;
            boolean z2 = this.requirePointB;
            boolean z3 = this.isPvzPoints;
            StringBuilder v = qv10.v("TriggersDto(modes=", list, ", entryPoints=", list2, ", requirePointA=");
            nnm.v(", requirePointB=", ", isPvzPoints=", v, z, z2);
            return x4e.i(v, z3, Extension.C_BRAKE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TriggersDto(@Json(name = "modes") List<String> list, @Json(name = "entry_points") List<? extends EntryPointsDto> list2, @Json(name = "require_point_a") boolean z, @Json(name = "require_point_b") boolean z2, @Json(name = "is_pvz_points") boolean z3) {
            this.modes = list;
            this.entryPoints = list2;
            this.requirePointA = z;
            this.requirePointB = z2;
            this.isPvzPoints = z3;
        }
    }
}
