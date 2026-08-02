package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ManualEntryTipsChoiceDto;", "", "choiceId", "", "title", "extraSubtitle", "decimalValue", "minTipsValue", "", "maxTipsValue", "tipsValuePattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "getChoiceId", "()Ljava/lang/String;", "getTitle", "getExtraSubtitle", "getDecimalValue", "getMinTipsValue", "()D", "getMaxTipsValue", "getTipsValuePattern", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ManualEntryTipsChoiceDto {
    private final String choiceId;
    private final String decimalValue;
    private final String extraSubtitle;
    private final double maxTipsValue;
    private final double minTipsValue;
    private final String tipsValuePattern;
    private final String title;

    public ManualEntryTipsChoiceDto(@Json(name = "choice_id") String str, @Json(name = "title") String str2, @Json(name = "extra_subtitle") String str3, @Json(name = "decimal_value") String str4, @Json(name = "min_tips_value") double d, @Json(name = "max_tips_value") double d2, @Json(name = "tips_value_pattern") String str5) {
        this.choiceId = str;
        this.title = str2;
        this.extraSubtitle = str3;
        this.decimalValue = str4;
        this.minTipsValue = d;
        this.maxTipsValue = d2;
        this.tipsValuePattern = str5;
    }

    public static /* synthetic */ ManualEntryTipsChoiceDto copy$default(ManualEntryTipsChoiceDto manualEntryTipsChoiceDto, String str, String str2, String str3, String str4, double d, double d2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manualEntryTipsChoiceDto.choiceId;
        }
        if ((i & 2) != 0) {
            str2 = manualEntryTipsChoiceDto.title;
        }
        if ((i & 4) != 0) {
            str3 = manualEntryTipsChoiceDto.extraSubtitle;
        }
        if ((i & 8) != 0) {
            str4 = manualEntryTipsChoiceDto.decimalValue;
        }
        if ((i & 16) != 0) {
            d = manualEntryTipsChoiceDto.minTipsValue;
        }
        if ((i & 32) != 0) {
            d2 = manualEntryTipsChoiceDto.maxTipsValue;
        }
        if ((i & 64) != 0) {
            str5 = manualEntryTipsChoiceDto.tipsValuePattern;
        }
        String str6 = str5;
        double d3 = d2;
        double d4 = d;
        return manualEntryTipsChoiceDto.copy(str, str2, str3, str4, d4, d3, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChoiceId() {
        return this.choiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExtraSubtitle() {
        return this.extraSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDecimalValue() {
        return this.decimalValue;
    }

    /* renamed from: component5, reason: from getter */
    public final double getMinTipsValue() {
        return this.minTipsValue;
    }

    /* renamed from: component6, reason: from getter */
    public final double getMaxTipsValue() {
        return this.maxTipsValue;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTipsValuePattern() {
        return this.tipsValuePattern;
    }

    public final ManualEntryTipsChoiceDto copy(@Json(name = "choice_id") String choiceId, @Json(name = "title") String title, @Json(name = "extra_subtitle") String extraSubtitle, @Json(name = "decimal_value") String decimalValue, @Json(name = "min_tips_value") double minTipsValue, @Json(name = "max_tips_value") double maxTipsValue, @Json(name = "tips_value_pattern") String tipsValuePattern) {
        return new ManualEntryTipsChoiceDto(choiceId, title, extraSubtitle, decimalValue, minTipsValue, maxTipsValue, tipsValuePattern);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualEntryTipsChoiceDto)) {
            return false;
        }
        ManualEntryTipsChoiceDto manualEntryTipsChoiceDto = (ManualEntryTipsChoiceDto) other;
        return jl40.l(this.choiceId, manualEntryTipsChoiceDto.choiceId) && jl40.l(this.title, manualEntryTipsChoiceDto.title) && jl40.l(this.extraSubtitle, manualEntryTipsChoiceDto.extraSubtitle) && jl40.l(this.decimalValue, manualEntryTipsChoiceDto.decimalValue) && Double.compare(this.minTipsValue, manualEntryTipsChoiceDto.minTipsValue) == 0 && Double.compare(this.maxTipsValue, manualEntryTipsChoiceDto.maxTipsValue) == 0 && jl40.l(this.tipsValuePattern, manualEntryTipsChoiceDto.tipsValuePattern);
    }

    public final String getChoiceId() {
        return this.choiceId;
    }

    public final String getDecimalValue() {
        return this.decimalValue;
    }

    public final String getExtraSubtitle() {
        return this.extraSubtitle;
    }

    public final double getMaxTipsValue() {
        return this.maxTipsValue;
    }

    public final double getMinTipsValue() {
        return this.minTipsValue;
    }

    public final String getTipsValuePattern() {
        return this.tipsValuePattern;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.choiceId.hashCode() * 31, 31, this.title), 31, this.extraSubtitle);
        String str = this.decimalValue;
        return this.tipsValuePattern.hashCode() + unr0.a(unr0.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.minTipsValue), 31, this.maxTipsValue);
    }

    public String toString() {
        String str = this.choiceId;
        String str2 = this.title;
        String str3 = this.extraSubtitle;
        String str4 = this.decimalValue;
        double d = this.minTipsValue;
        double d2 = this.maxTipsValue;
        String str5 = this.tipsValuePattern;
        StringBuilder v = b64.v("ManualEntryTipsChoiceDto(choiceId=", str, ", title=", str2, ", extraSubtitle=");
        g8e.D(v, str3, ", decimalValue=", str4, ", minTipsValue=");
        v.append(d);
        nzs.o(v, ", maxTipsValue=", d2, ", tipsValuePattern=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}
