package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputStopWordsItemDto;", "", "stopWords", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputStopWordRuleDto;", "errorText", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "metricaLabel", "", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;)V", "getStopWords", "()Ljava/util/List;", "getErrorText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NeuroTextInputStopWordsItemDto {
    private final AttributedTextDto errorText;
    private final String metricaLabel;
    private final List<NeuroTextInputStopWordRuleDto> stopWords;

    public NeuroTextInputStopWordsItemDto(@Json(name = "stop_words") List<NeuroTextInputStopWordRuleDto> list, @Json(name = "error_text") AttributedTextDto attributedTextDto, @Json(name = "metrica_label") String str) {
        this.stopWords = list;
        this.errorText = attributedTextDto;
        this.metricaLabel = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NeuroTextInputStopWordsItemDto copy$default(NeuroTextInputStopWordsItemDto neuroTextInputStopWordsItemDto, List list, AttributedTextDto attributedTextDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = neuroTextInputStopWordsItemDto.stopWords;
        }
        if ((i & 2) != 0) {
            attributedTextDto = neuroTextInputStopWordsItemDto.errorText;
        }
        if ((i & 4) != 0) {
            str = neuroTextInputStopWordsItemDto.metricaLabel;
        }
        return neuroTextInputStopWordsItemDto.copy(list, attributedTextDto, str);
    }

    public final List<NeuroTextInputStopWordRuleDto> component1() {
        return this.stopWords;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getErrorText() {
        return this.errorText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final NeuroTextInputStopWordsItemDto copy(@Json(name = "stop_words") List<NeuroTextInputStopWordRuleDto> stopWords, @Json(name = "error_text") AttributedTextDto errorText, @Json(name = "metrica_label") String metricaLabel) {
        return new NeuroTextInputStopWordsItemDto(stopWords, errorText, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeuroTextInputStopWordsItemDto)) {
            return false;
        }
        NeuroTextInputStopWordsItemDto neuroTextInputStopWordsItemDto = (NeuroTextInputStopWordsItemDto) other;
        return jl40.l(this.stopWords, neuroTextInputStopWordsItemDto.stopWords) && jl40.l(this.errorText, neuroTextInputStopWordsItemDto.errorText) && jl40.l(this.metricaLabel, neuroTextInputStopWordsItemDto.metricaLabel);
    }

    public final AttributedTextDto getErrorText() {
        return this.errorText;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<NeuroTextInputStopWordRuleDto> getStopWords() {
        return this.stopWords;
    }

    public int hashCode() {
        int hashCode = this.stopWords.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.errorText;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<NeuroTextInputStopWordRuleDto> list = this.stopWords;
        AttributedTextDto attributedTextDto = this.errorText;
        String str = this.metricaLabel;
        StringBuilder sb = new StringBuilder("NeuroTextInputStopWordsItemDto(stopWords=");
        sb.append(list);
        sb.append(", errorText=");
        sb.append(attributedTextDto);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
