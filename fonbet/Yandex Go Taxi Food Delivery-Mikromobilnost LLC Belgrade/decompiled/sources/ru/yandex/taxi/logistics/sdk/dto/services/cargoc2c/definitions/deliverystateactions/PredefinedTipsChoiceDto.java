package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.TipsTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PredefinedTipsChoiceDto;", "", "choiceId", "", "decimalValue", "title", "tipsType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;)V", "getChoiceId", "()Ljava/lang/String;", "getDecimalValue", "getTitle", "getTipsType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/TipsTypeDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PredefinedTipsChoiceDto {
    private final String choiceId;
    private final String decimalValue;
    private final TipsTypeDto tipsType;
    private final String title;

    public PredefinedTipsChoiceDto(@Json(name = "choice_id") String str, @Json(name = "decimal_value") String str2, @Json(name = "title") String str3, @Json(name = "tips_type") TipsTypeDto tipsTypeDto) {
        this.choiceId = str;
        this.decimalValue = str2;
        this.title = str3;
        this.tipsType = tipsTypeDto;
    }

    public static /* synthetic */ PredefinedTipsChoiceDto copy$default(PredefinedTipsChoiceDto predefinedTipsChoiceDto, String str, String str2, String str3, TipsTypeDto tipsTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = predefinedTipsChoiceDto.choiceId;
        }
        if ((i & 2) != 0) {
            str2 = predefinedTipsChoiceDto.decimalValue;
        }
        if ((i & 4) != 0) {
            str3 = predefinedTipsChoiceDto.title;
        }
        if ((i & 8) != 0) {
            tipsTypeDto = predefinedTipsChoiceDto.tipsType;
        }
        return predefinedTipsChoiceDto.copy(str, str2, str3, tipsTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChoiceId() {
        return this.choiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDecimalValue() {
        return this.decimalValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final TipsTypeDto getTipsType() {
        return this.tipsType;
    }

    public final PredefinedTipsChoiceDto copy(@Json(name = "choice_id") String choiceId, @Json(name = "decimal_value") String decimalValue, @Json(name = "title") String title, @Json(name = "tips_type") TipsTypeDto tipsType) {
        return new PredefinedTipsChoiceDto(choiceId, decimalValue, title, tipsType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredefinedTipsChoiceDto)) {
            return false;
        }
        PredefinedTipsChoiceDto predefinedTipsChoiceDto = (PredefinedTipsChoiceDto) other;
        return jl40.l(this.choiceId, predefinedTipsChoiceDto.choiceId) && jl40.l(this.decimalValue, predefinedTipsChoiceDto.decimalValue) && jl40.l(this.title, predefinedTipsChoiceDto.title) && this.tipsType == predefinedTipsChoiceDto.tipsType;
    }

    public final String getChoiceId() {
        return this.choiceId;
    }

    public final String getDecimalValue() {
        return this.decimalValue;
    }

    public final TipsTypeDto getTipsType() {
        return this.tipsType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tipsType.hashCode() + unr0.b(unr0.b(this.choiceId.hashCode() * 31, 31, this.decimalValue), 31, this.title);
    }

    public String toString() {
        String str = this.choiceId;
        String str2 = this.decimalValue;
        String str3 = this.title;
        TipsTypeDto tipsTypeDto = this.tipsType;
        StringBuilder v = b64.v("PredefinedTipsChoiceDto(choiceId=", str, ", decimalValue=", str2, ", title=");
        v.append(str3);
        v.append(", tipsType=");
        v.append(tipsTypeDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
