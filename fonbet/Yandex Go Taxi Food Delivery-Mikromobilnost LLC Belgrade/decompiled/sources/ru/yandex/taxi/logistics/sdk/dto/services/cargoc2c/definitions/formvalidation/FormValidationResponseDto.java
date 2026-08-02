package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.formvalidation;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto;", "", TarifficatorScenarioActivity.RESULT_KEY, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;)V", "getResult", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ResultDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormValidationResponseDto {
    private final ResultDto result;

    public FormValidationResponseDto(@Json(name = "result") ResultDto resultDto) {
        this.result = resultDto;
    }

    public static /* synthetic */ FormValidationResponseDto copy$default(FormValidationResponseDto formValidationResponseDto, ResultDto resultDto, int i, Object obj) {
        if ((i & 1) != 0) {
            resultDto = formValidationResponseDto.result;
        }
        return formValidationResponseDto.copy(resultDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ResultDto getResult() {
        return this.result;
    }

    public final FormValidationResponseDto copy(@Json(name = "result") ResultDto result) {
        return new FormValidationResponseDto(result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FormValidationResponseDto) && jl40.l(this.result, ((FormValidationResponseDto) other).result);
    }

    public final ResultDto getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "FormValidationResponseDto(result=" + this.result + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;", "", "Result_SuccessDto", "Result_FailedDto", "Result_ChallengeRequiredDto", "Unknown_ResultDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_ChallengeRequiredDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_FailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_SuccessDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Unknown_ResultDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ResultDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_ChallengeRequiredDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/ValidationFailureChallengeRequiredDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/ValidationFailureChallengeRequiredDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/ValidationFailureChallengeRequiredDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_ChallengeRequiredDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Result_ChallengeRequiredDto extends ResultDto {
            public final String a;
            public final ValidationFailureChallengeRequiredDto b;

            public Result_ChallengeRequiredDto(@Json(name = "type") String str, ValidationFailureChallengeRequiredDto validationFailureChallengeRequiredDto) {
                this.a = str;
                this.b = validationFailureChallengeRequiredDto;
            }

            /* renamed from: a, reason: from getter */
            public final ValidationFailureChallengeRequiredDto getB() {
                return this.b;
            }

            public final Result_ChallengeRequiredDto copy(@Json(name = "type") String type, ValidationFailureChallengeRequiredDto value) {
                return new Result_ChallengeRequiredDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result_ChallengeRequiredDto)) {
                    return false;
                }
                Result_ChallengeRequiredDto result_ChallengeRequiredDto = (Result_ChallengeRequiredDto) obj;
                return this.a.equals(result_ChallengeRequiredDto.a) && this.b.equals(result_ChallengeRequiredDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Result_ChallengeRequiredDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_FailedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationFailedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationFailedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationFailedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_FailedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Result_FailedDto extends ResultDto {
            public final String a;
            public final FormValidationFailedDto b;

            public Result_FailedDto(@Json(name = "type") String str, FormValidationFailedDto formValidationFailedDto) {
                this.a = str;
                this.b = formValidationFailedDto;
            }

            /* renamed from: a, reason: from getter */
            public final FormValidationFailedDto getB() {
                return this.b;
            }

            public final Result_FailedDto copy(@Json(name = "type") String type, FormValidationFailedDto value) {
                return new Result_FailedDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result_FailedDto)) {
                    return false;
                }
                Result_FailedDto result_FailedDto = (Result_FailedDto) obj;
                return this.a.equals(result_FailedDto.a) && this.b.equals(result_FailedDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Result_FailedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_SuccessDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationSuccessDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationSuccessDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationSuccessDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Result_SuccessDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Result_SuccessDto extends ResultDto {
            public final String a;
            public final FormValidationSuccessDto b;

            public Result_SuccessDto(@Json(name = "type") String str, FormValidationSuccessDto formValidationSuccessDto) {
                this.a = str;
                this.b = formValidationSuccessDto;
            }

            /* renamed from: a, reason: from getter */
            public final FormValidationSuccessDto getB() {
                return this.b;
            }

            public final Result_SuccessDto copy(@Json(name = "type") String type, FormValidationSuccessDto value) {
                return new Result_SuccessDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result_SuccessDto)) {
                    return false;
                }
                Result_SuccessDto result_SuccessDto = (Result_SuccessDto) obj;
                return this.a.equals(result_SuccessDto.a) && this.b.equals(result_SuccessDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Result_SuccessDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Unknown_ResultDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto$ResultDto$Unknown_ResultDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_ResultDto extends ResultDto {
            public final String a;

            public Unknown_ResultDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_ResultDto copy(@Json(name = "type") String type) {
                return new Unknown_ResultDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_ResultDto) && jl40.l(this.a, ((Unknown_ResultDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_ResultDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_ResultDto() {
                this(0);
            }

            public /* synthetic */ Unknown_ResultDto(int i) {
                this("unknown");
            }
        }
    }
}
