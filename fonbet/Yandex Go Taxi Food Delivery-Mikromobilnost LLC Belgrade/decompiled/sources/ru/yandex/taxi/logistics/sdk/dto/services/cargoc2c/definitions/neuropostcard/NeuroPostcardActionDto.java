package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "", "NeuroPostcardAction_OpenPromptDto", "NeuroPostcardAction_PickPhotoDto", "NeuroPostcardAction_ConfirmImageDto", "NeuroPostcardAction_AddSignatureDto", "NeuroPostcardAction_SendPostcardDto", "Unknown_NeuroPostcardActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_AddSignatureDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_ConfirmImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_OpenPromptDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_PickPhotoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_SendPostcardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$Unknown_NeuroPostcardActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class NeuroPostcardActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_AddSignatureDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardAddSignatureActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardAddSignatureActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardAddSignatureActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_AddSignatureDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardAction_AddSignatureDto extends NeuroPostcardActionDto {
        public final String a;
        public final NeuroPostcardAddSignatureActionDto b;

        public NeuroPostcardAction_AddSignatureDto(@Json(name = "type") String str, NeuroPostcardAddSignatureActionDto neuroPostcardAddSignatureActionDto) {
            this.a = str;
            this.b = neuroPostcardAddSignatureActionDto;
        }

        public final NeuroPostcardAction_AddSignatureDto copy(@Json(name = "type") String type, NeuroPostcardAddSignatureActionDto value) {
            return new NeuroPostcardAction_AddSignatureDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeuroPostcardAction_AddSignatureDto)) {
                return false;
            }
            NeuroPostcardAction_AddSignatureDto neuroPostcardAction_AddSignatureDto = (NeuroPostcardAction_AddSignatureDto) obj;
            return this.a.equals(neuroPostcardAction_AddSignatureDto.a) && this.b.equals(neuroPostcardAction_AddSignatureDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardAction_AddSignatureDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_ConfirmImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardConfirmImageActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardConfirmImageActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardConfirmImageActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_ConfirmImageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardAction_ConfirmImageDto extends NeuroPostcardActionDto {
        public final String a;
        public final NeuroPostcardConfirmImageActionDto b;

        public NeuroPostcardAction_ConfirmImageDto(@Json(name = "type") String str, NeuroPostcardConfirmImageActionDto neuroPostcardConfirmImageActionDto) {
            this.a = str;
            this.b = neuroPostcardConfirmImageActionDto;
        }

        public final NeuroPostcardAction_ConfirmImageDto copy(@Json(name = "type") String type, NeuroPostcardConfirmImageActionDto value) {
            return new NeuroPostcardAction_ConfirmImageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NeuroPostcardAction_ConfirmImageDto) {
                NeuroPostcardAction_ConfirmImageDto neuroPostcardAction_ConfirmImageDto = (NeuroPostcardAction_ConfirmImageDto) obj;
                return this.a.equals(neuroPostcardAction_ConfirmImageDto.a) && this.b == neuroPostcardAction_ConfirmImageDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardAction_ConfirmImageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_OpenPromptDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardOpenPromptActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardOpenPromptActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardOpenPromptActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_OpenPromptDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardAction_OpenPromptDto extends NeuroPostcardActionDto {
        public final String a;
        public final NeuroPostcardOpenPromptActionDto b;

        public NeuroPostcardAction_OpenPromptDto(@Json(name = "type") String str, NeuroPostcardOpenPromptActionDto neuroPostcardOpenPromptActionDto) {
            this.a = str;
            this.b = neuroPostcardOpenPromptActionDto;
        }

        public final NeuroPostcardAction_OpenPromptDto copy(@Json(name = "type") String type, NeuroPostcardOpenPromptActionDto value) {
            return new NeuroPostcardAction_OpenPromptDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeuroPostcardAction_OpenPromptDto)) {
                return false;
            }
            NeuroPostcardAction_OpenPromptDto neuroPostcardAction_OpenPromptDto = (NeuroPostcardAction_OpenPromptDto) obj;
            return this.a.equals(neuroPostcardAction_OpenPromptDto.a) && this.b.equals(neuroPostcardAction_OpenPromptDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardAction_OpenPromptDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_PickPhotoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardPickPhotoActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardPickPhotoActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardPickPhotoActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_PickPhotoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardAction_PickPhotoDto extends NeuroPostcardActionDto {
        public final String a;
        public final NeuroPostcardPickPhotoActionDto b;

        public NeuroPostcardAction_PickPhotoDto(@Json(name = "type") String str, NeuroPostcardPickPhotoActionDto neuroPostcardPickPhotoActionDto) {
            this.a = str;
            this.b = neuroPostcardPickPhotoActionDto;
        }

        public final NeuroPostcardAction_PickPhotoDto copy(@Json(name = "type") String type, NeuroPostcardPickPhotoActionDto value) {
            return new NeuroPostcardAction_PickPhotoDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NeuroPostcardAction_PickPhotoDto)) {
                return false;
            }
            NeuroPostcardAction_PickPhotoDto neuroPostcardAction_PickPhotoDto = (NeuroPostcardAction_PickPhotoDto) obj;
            return this.a.equals(neuroPostcardAction_PickPhotoDto.a) && this.b.equals(neuroPostcardAction_PickPhotoDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardAction_PickPhotoDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_SendPostcardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardSendActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardSendActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardSendActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$NeuroPostcardAction_SendPostcardDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeuroPostcardAction_SendPostcardDto extends NeuroPostcardActionDto {
        public final String a;
        public final NeuroPostcardSendActionDto b;

        public NeuroPostcardAction_SendPostcardDto(@Json(name = "type") String str, NeuroPostcardSendActionDto neuroPostcardSendActionDto) {
            this.a = str;
            this.b = neuroPostcardSendActionDto;
        }

        public final NeuroPostcardAction_SendPostcardDto copy(@Json(name = "type") String type, NeuroPostcardSendActionDto value) {
            return new NeuroPostcardAction_SendPostcardDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NeuroPostcardAction_SendPostcardDto) {
                NeuroPostcardAction_SendPostcardDto neuroPostcardAction_SendPostcardDto = (NeuroPostcardAction_SendPostcardDto) obj;
                return this.a.equals(neuroPostcardAction_SendPostcardDto.a) && this.b == neuroPostcardAction_SendPostcardDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NeuroPostcardAction_SendPostcardDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$Unknown_NeuroPostcardActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardActionDto$Unknown_NeuroPostcardActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_NeuroPostcardActionDto extends NeuroPostcardActionDto {
        public final String a;

        public Unknown_NeuroPostcardActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_NeuroPostcardActionDto copy(@Json(name = "type") String type) {
            return new Unknown_NeuroPostcardActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_NeuroPostcardActionDto) && jl40.l(this.a, ((Unknown_NeuroPostcardActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_NeuroPostcardActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_NeuroPostcardActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_NeuroPostcardActionDto(int i) {
            this("unknown");
        }
    }
}
