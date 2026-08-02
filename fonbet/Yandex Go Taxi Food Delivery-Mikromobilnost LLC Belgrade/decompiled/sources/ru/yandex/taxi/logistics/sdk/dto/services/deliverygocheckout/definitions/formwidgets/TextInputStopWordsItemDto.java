package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.smw0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\b\u0001\u0010\u0007\u001a\u00060\u0001j\u0002`\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\r\u0010\u0017\u001a\u00060\u0001j\u0002`\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\b\u0003\u0010\u0007\u001a\u00060\u0001j\u0002`\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u00060\u0001j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordsItemDto;", "", "stopWords", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStopWordRuleDto;", "errorText", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "stateValue", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "metricaLabel", "", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/Object;Ljava/lang/String;)V", "getStopWords", "()Ljava/util/List;", "getErrorText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getStateValue", "()Ljava/lang/Object;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextInputStopWordsItemDto {
    private final AttributedTextDto errorText;
    private final String metricaLabel;
    private final Object stateValue;
    private final List<TextInputStopWordRuleDto> stopWords;

    public TextInputStopWordsItemDto(@Json(name = "stop_words") List<TextInputStopWordRuleDto> list, @Json(name = "error_text") AttributedTextDto attributedTextDto, @Json(name = "state_value") Object obj, @Json(name = "metrica_label") String str) {
        this.stopWords = list;
        this.errorText = attributedTextDto;
        this.stateValue = obj;
        this.metricaLabel = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextInputStopWordsItemDto copy$default(TextInputStopWordsItemDto textInputStopWordsItemDto, List list, AttributedTextDto attributedTextDto, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = textInputStopWordsItemDto.stopWords;
        }
        if ((i & 2) != 0) {
            attributedTextDto = textInputStopWordsItemDto.errorText;
        }
        if ((i & 4) != 0) {
            obj = textInputStopWordsItemDto.stateValue;
        }
        if ((i & 8) != 0) {
            str = textInputStopWordsItemDto.metricaLabel;
        }
        return textInputStopWordsItemDto.copy(list, attributedTextDto, obj, str);
    }

    public final List<TextInputStopWordRuleDto> component1() {
        return this.stopWords;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getErrorText() {
        return this.errorText;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getStateValue() {
        return this.stateValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TextInputStopWordsItemDto copy(@Json(name = "stop_words") List<TextInputStopWordRuleDto> stopWords, @Json(name = "error_text") AttributedTextDto errorText, @Json(name = "state_value") Object stateValue, @Json(name = "metrica_label") String metricaLabel) {
        return new TextInputStopWordsItemDto(stopWords, errorText, stateValue, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputStopWordsItemDto)) {
            return false;
        }
        TextInputStopWordsItemDto textInputStopWordsItemDto = (TextInputStopWordsItemDto) other;
        return jl40.l(this.stopWords, textInputStopWordsItemDto.stopWords) && jl40.l(this.errorText, textInputStopWordsItemDto.errorText) && jl40.l(this.stateValue, textInputStopWordsItemDto.stateValue) && jl40.l(this.metricaLabel, textInputStopWordsItemDto.metricaLabel);
    }

    public final AttributedTextDto getErrorText() {
        return this.errorText;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final Object getStateValue() {
        return this.stateValue;
    }

    public final List<TextInputStopWordRuleDto> getStopWords() {
        return this.stopWords;
    }

    public int hashCode() {
        int hashCode = this.stopWords.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.errorText;
        int c = smw0.c((hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31, 31, this.stateValue);
        String str = this.metricaLabel;
        return c + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TextInputStopWordsItemDto(stopWords=" + this.stopWords + ", errorText=" + this.errorText + ", stateValue=" + this.stateValue + ", metricaLabel=" + this.metricaLabel + Extension.C_BRAKE;
    }
}
