package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto;", "", "ProgressBarStyle_PartialDto", "Unknown_ProgressBarStyleDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto$ProgressBarStyle_PartialDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto$Unknown_ProgressBarStyleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ProgressBarStyleDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto$ProgressBarStyle_PartialDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PartialProgressBarStyleDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PartialProgressBarStyleDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PartialProgressBarStyleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto$ProgressBarStyle_PartialDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBarStyle_PartialDto extends ProgressBarStyleDto {
        public final String a;
        public final PartialProgressBarStyleDto b;

        public ProgressBarStyle_PartialDto(@Json(name = "type") String str, PartialProgressBarStyleDto partialProgressBarStyleDto) {
            this.a = str;
            this.b = partialProgressBarStyleDto;
        }

        public final ProgressBarStyle_PartialDto copy(@Json(name = "type") String type, PartialProgressBarStyleDto value) {
            return new ProgressBarStyle_PartialDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressBarStyle_PartialDto)) {
                return false;
            }
            ProgressBarStyle_PartialDto progressBarStyle_PartialDto = (ProgressBarStyle_PartialDto) obj;
            return this.a.equals(progressBarStyle_PartialDto.a) && this.b.equals(progressBarStyle_PartialDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ProgressBarStyle_PartialDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto$Unknown_ProgressBarStyleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarStyleDto$Unknown_ProgressBarStyleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_ProgressBarStyleDto extends ProgressBarStyleDto {
        public final String a;

        public Unknown_ProgressBarStyleDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_ProgressBarStyleDto copy(@Json(name = "type") String type) {
            return new Unknown_ProgressBarStyleDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_ProgressBarStyleDto) && jl40.l(this.a, ((Unknown_ProgressBarStyleDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_ProgressBarStyleDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_ProgressBarStyleDto() {
            this(0);
        }

        public /* synthetic */ Unknown_ProgressBarStyleDto(int i) {
            this("unknown");
        }
    }
}
