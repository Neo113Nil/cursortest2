package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.TipsTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverypaymentcontext.PaymentContextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/TipsInfoDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;", "decimalValue", "", "choiceId", "paymentContext", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/PaymentContextDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/PaymentContextDto;)V", "getType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;", "getDecimalValue", "()Ljava/lang/String;", "getChoiceId", "getPaymentContext", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/PaymentContextDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TipsInfoDto {
    private final String choiceId;
    private final String decimalValue;
    private final PaymentContextDto paymentContext;
    private final TipsTypeDto type;

    public TipsInfoDto(@Json(name = "type") TipsTypeDto tipsTypeDto, @Json(name = "decimal_value") String str, @Json(name = "choice_id") String str2, @Json(name = "payment_context") PaymentContextDto paymentContextDto) {
        this.type = tipsTypeDto;
        this.decimalValue = str;
        this.choiceId = str2;
        this.paymentContext = paymentContextDto;
    }

    public static /* synthetic */ TipsInfoDto copy$default(TipsInfoDto tipsInfoDto, TipsTypeDto tipsTypeDto, String str, String str2, PaymentContextDto paymentContextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            tipsTypeDto = tipsInfoDto.type;
        }
        if ((i & 2) != 0) {
            str = tipsInfoDto.decimalValue;
        }
        if ((i & 4) != 0) {
            str2 = tipsInfoDto.choiceId;
        }
        if ((i & 8) != 0) {
            paymentContextDto = tipsInfoDto.paymentContext;
        }
        return tipsInfoDto.copy(tipsTypeDto, str, str2, paymentContextDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TipsTypeDto getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDecimalValue() {
        return this.decimalValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChoiceId() {
        return this.choiceId;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentContextDto getPaymentContext() {
        return this.paymentContext;
    }

    public final TipsInfoDto copy(@Json(name = "type") TipsTypeDto type, @Json(name = "decimal_value") String decimalValue, @Json(name = "choice_id") String choiceId, @Json(name = "payment_context") PaymentContextDto paymentContext) {
        return new TipsInfoDto(type, decimalValue, choiceId, paymentContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipsInfoDto)) {
            return false;
        }
        TipsInfoDto tipsInfoDto = (TipsInfoDto) other;
        return this.type == tipsInfoDto.type && jl40.l(this.decimalValue, tipsInfoDto.decimalValue) && jl40.l(this.choiceId, tipsInfoDto.choiceId) && jl40.l(this.paymentContext, tipsInfoDto.paymentContext);
    }

    public final String getChoiceId() {
        return this.choiceId;
    }

    public final String getDecimalValue() {
        return this.decimalValue;
    }

    public final PaymentContextDto getPaymentContext() {
        return this.paymentContext;
    }

    public final TipsTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        TipsTypeDto tipsTypeDto = this.type;
        int hashCode = (tipsTypeDto == null ? 0 : tipsTypeDto.hashCode()) * 31;
        String str = this.decimalValue;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.choiceId);
        PaymentContextDto paymentContextDto = this.paymentContext;
        return b + (paymentContextDto != null ? paymentContextDto.hashCode() : 0);
    }

    public String toString() {
        return "TipsInfoDto(type=" + this.type + ", decimalValue=" + this.decimalValue + ", choiceId=" + this.choiceId + ", paymentContext=" + this.paymentContext + Extension.C_BRAKE;
    }
}
