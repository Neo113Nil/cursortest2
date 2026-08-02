package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionShareDto;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto;", "", "TimelineDetailsShareButtonAction_ShareDto", "Unknown_TimelineDetailsShareButtonActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto$TimelineDetailsShareButtonAction_ShareDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto$Unknown_TimelineDetailsShareButtonActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TimelineDetailsShareButtonActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto$TimelineDetailsShareButtonAction_ShareDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShareDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShareDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionShareDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto$TimelineDetailsShareButtonAction_ShareDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimelineDetailsShareButtonAction_ShareDto extends TimelineDetailsShareButtonActionDto {
        public final String a;
        public final ActionShareDto b;

        public TimelineDetailsShareButtonAction_ShareDto(@Json(name = "type") String str, ActionShareDto actionShareDto) {
            this.a = str;
            this.b = actionShareDto;
        }

        public final TimelineDetailsShareButtonAction_ShareDto copy(@Json(name = "type") String type, ActionShareDto value) {
            return new TimelineDetailsShareButtonAction_ShareDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimelineDetailsShareButtonAction_ShareDto)) {
                return false;
            }
            TimelineDetailsShareButtonAction_ShareDto timelineDetailsShareButtonAction_ShareDto = (TimelineDetailsShareButtonAction_ShareDto) obj;
            return this.a.equals(timelineDetailsShareButtonAction_ShareDto.a) && this.b.equals(timelineDetailsShareButtonAction_ShareDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TimelineDetailsShareButtonAction_ShareDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto$Unknown_TimelineDetailsShareButtonActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonActionDto$Unknown_TimelineDetailsShareButtonActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_TimelineDetailsShareButtonActionDto extends TimelineDetailsShareButtonActionDto {
        public final String a;

        public Unknown_TimelineDetailsShareButtonActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_TimelineDetailsShareButtonActionDto copy(@Json(name = "type") String type) {
            return new Unknown_TimelineDetailsShareButtonActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_TimelineDetailsShareButtonActionDto) && jl40.l(this.a, ((Unknown_TimelineDetailsShareButtonActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_TimelineDetailsShareButtonActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_TimelineDetailsShareButtonActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_TimelineDetailsShareButtonActionDto(int i) {
            this("unknown");
        }
    }
}
