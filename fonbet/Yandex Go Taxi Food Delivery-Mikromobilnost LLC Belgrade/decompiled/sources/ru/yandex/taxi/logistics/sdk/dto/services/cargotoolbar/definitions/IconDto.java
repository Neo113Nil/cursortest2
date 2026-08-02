package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "", "Icon_RemoteIconDto", "Icon_LocalIconDto", "Unknown_IconDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Icon_LocalIconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Icon_RemoteIconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Unknown_IconDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class IconDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Icon_LocalIconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LocalIconDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LocalIconDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LocalIconDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Icon_LocalIconDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Icon_LocalIconDto extends IconDto {
        public final String a;
        public final LocalIconDto b;

        public Icon_LocalIconDto(@Json(name = "type") String str, LocalIconDto localIconDto) {
            this.a = str;
            this.b = localIconDto;
        }

        public final Icon_LocalIconDto copy(@Json(name = "type") String type, LocalIconDto value) {
            return new Icon_LocalIconDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon_LocalIconDto)) {
                return false;
            }
            Icon_LocalIconDto icon_LocalIconDto = (Icon_LocalIconDto) obj;
            return this.a.equals(icon_LocalIconDto.a) && this.b.equals(icon_LocalIconDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Icon_LocalIconDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Icon_RemoteIconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Icon_RemoteIconDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Icon_RemoteIconDto extends IconDto {
        public final String a;
        public final RemoteIconDto b;

        public Icon_RemoteIconDto(@Json(name = "type") String str, RemoteIconDto remoteIconDto) {
            this.a = str;
            this.b = remoteIconDto;
        }

        public final Icon_RemoteIconDto copy(@Json(name = "type") String type, RemoteIconDto value) {
            return new Icon_RemoteIconDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon_RemoteIconDto)) {
                return false;
            }
            Icon_RemoteIconDto icon_RemoteIconDto = (Icon_RemoteIconDto) obj;
            return this.a.equals(icon_RemoteIconDto.a) && this.b.equals(icon_RemoteIconDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Icon_RemoteIconDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Unknown_IconDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/IconDto$Unknown_IconDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_IconDto extends IconDto {
        public final String a;

        public Unknown_IconDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_IconDto copy(@Json(name = "type") String type) {
            return new Unknown_IconDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_IconDto) && jl40.l(this.a, ((Unknown_IconDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_IconDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_IconDto() {
            this(0);
        }

        public /* synthetic */ Unknown_IconDto(int i) {
            this("unknown");
        }
    }
}
