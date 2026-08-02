package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;", "", "TopAccentBar_InfoDto", "TopAccentBar_TimerDto", "Unknown_TopAccentBarDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$TopAccentBar_InfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$TopAccentBar_TimerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$Unknown_TopAccentBarDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TopAccentBarDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$TopAccentBar_InfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/InfoTopAccentBarDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/InfoTopAccentBarDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/InfoTopAccentBarDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$TopAccentBar_InfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopAccentBar_InfoDto extends TopAccentBarDto {
        public final String a;
        public final InfoTopAccentBarDto b;

        public TopAccentBar_InfoDto(@Json(name = "type") String str, InfoTopAccentBarDto infoTopAccentBarDto) {
            this.a = str;
            this.b = infoTopAccentBarDto;
        }

        public final TopAccentBar_InfoDto copy(@Json(name = "type") String type, InfoTopAccentBarDto value) {
            return new TopAccentBar_InfoDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopAccentBar_InfoDto)) {
                return false;
            }
            TopAccentBar_InfoDto topAccentBar_InfoDto = (TopAccentBar_InfoDto) obj;
            return this.a.equals(topAccentBar_InfoDto.a) && this.b.equals(topAccentBar_InfoDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TopAccentBar_InfoDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$TopAccentBar_TimerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerTopAccentBarDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerTopAccentBarDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerTopAccentBarDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$TopAccentBar_TimerDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopAccentBar_TimerDto extends TopAccentBarDto {
        public final String a;
        public final TimerTopAccentBarDto b;

        public TopAccentBar_TimerDto(@Json(name = "type") String str, TimerTopAccentBarDto timerTopAccentBarDto) {
            this.a = str;
            this.b = timerTopAccentBarDto;
        }

        public final TopAccentBar_TimerDto copy(@Json(name = "type") String type, TimerTopAccentBarDto value) {
            return new TopAccentBar_TimerDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopAccentBar_TimerDto)) {
                return false;
            }
            TopAccentBar_TimerDto topAccentBar_TimerDto = (TopAccentBar_TimerDto) obj;
            return this.a.equals(topAccentBar_TimerDto.a) && this.b.equals(topAccentBar_TimerDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TopAccentBar_TimerDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$Unknown_TopAccentBarDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TopAccentBarDto$Unknown_TopAccentBarDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_TopAccentBarDto extends TopAccentBarDto {
        public final String a;

        public Unknown_TopAccentBarDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_TopAccentBarDto copy(@Json(name = "type") String type) {
            return new Unknown_TopAccentBarDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_TopAccentBarDto) && jl40.l(this.a, ((Unknown_TopAccentBarDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_TopAccentBarDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_TopAccentBarDto() {
            this(0);
        }

        public /* synthetic */ Unknown_TopAccentBarDto(int i) {
            this("unknown");
        }
    }
}
