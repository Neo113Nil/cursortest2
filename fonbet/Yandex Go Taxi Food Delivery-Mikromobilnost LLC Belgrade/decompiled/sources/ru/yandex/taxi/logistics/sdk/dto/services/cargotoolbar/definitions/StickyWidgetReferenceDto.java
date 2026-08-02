package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto;", "", "StickyWidgetReference_AiChatDto", "Unknown_StickyWidgetReferenceDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto$StickyWidgetReference_AiChatDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto$Unknown_StickyWidgetReferenceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class StickyWidgetReferenceDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto$StickyWidgetReference_AiChatDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetAIChatDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetAIChatDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetAIChatDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto$StickyWidgetReference_AiChatDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyWidgetReference_AiChatDto extends StickyWidgetReferenceDto {
        public final String a;
        public final StickyWidgetAIChatDto b;

        public StickyWidgetReference_AiChatDto(@Json(name = "type") String str, StickyWidgetAIChatDto stickyWidgetAIChatDto) {
            this.a = str;
            this.b = stickyWidgetAIChatDto;
        }

        public final StickyWidgetReference_AiChatDto copy(@Json(name = "type") String type, StickyWidgetAIChatDto value) {
            return new StickyWidgetReference_AiChatDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickyWidgetReference_AiChatDto)) {
                return false;
            }
            StickyWidgetReference_AiChatDto stickyWidgetReference_AiChatDto = (StickyWidgetReference_AiChatDto) obj;
            return this.a.equals(stickyWidgetReference_AiChatDto.a) && this.b.equals(stickyWidgetReference_AiChatDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StickyWidgetReference_AiChatDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto$Unknown_StickyWidgetReferenceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StickyWidgetReferenceDto$Unknown_StickyWidgetReferenceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_StickyWidgetReferenceDto extends StickyWidgetReferenceDto {
        public final String a;

        public Unknown_StickyWidgetReferenceDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_StickyWidgetReferenceDto copy(@Json(name = "type") String type) {
            return new Unknown_StickyWidgetReferenceDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_StickyWidgetReferenceDto) && jl40.l(this.a, ((Unknown_StickyWidgetReferenceDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_StickyWidgetReferenceDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_StickyWidgetReferenceDto() {
            this(0);
        }

        public /* synthetic */ Unknown_StickyWidgetReferenceDto(int i) {
            this("unknown");
        }
    }
}
