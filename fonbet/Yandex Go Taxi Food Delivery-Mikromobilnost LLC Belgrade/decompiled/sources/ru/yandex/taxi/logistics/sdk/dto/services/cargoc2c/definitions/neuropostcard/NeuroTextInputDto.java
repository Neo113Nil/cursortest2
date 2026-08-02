package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\t\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J¤\u0001\u00105\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0003\u0010\u000f\u001a\u00020\t2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\b\b\u0003\u0010\u0012\u001a\u00020\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u000bHÖ\u0001J\t\u0010;\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001e¨\u0006<"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputDto;", "", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "maxSymbolsInputMessage", "maxSymbolsInputMetricaLabel", "", "inputMaxSymbols", "", "prohibitedWords", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputStopWordsItemDto;", "placeholder", "hints", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputHintDto;", "buttonTitle", "buttonSubtitle", "metricaLabel", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;)V", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getMaxSymbolsInputMessage", "getMaxSymbolsInputMetricaLabel", "()Ljava/lang/String;", "getInputMaxSymbols", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProhibitedWords", "()Ljava/util/List;", "getPlaceholder", "getHints", "getButtonTitle", "getButtonSubtitle", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroTextInputDto;", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NeuroTextInputDto {
    private final AttributedTextDto buttonSubtitle;
    private final AttributedTextDto buttonTitle;
    private final List<NeuroTextInputHintDto> hints;
    private final NeuroPostcardImageDto image;
    private final Integer inputMaxSymbols;
    private final AttributedTextDto maxSymbolsInputMessage;
    private final String maxSymbolsInputMetricaLabel;
    private final String metricaLabel;
    private final String placeholder;
    private final List<NeuroTextInputStopWordsItemDto> prohibitedWords;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;

    public NeuroTextInputDto(@Json(name = "image") NeuroPostcardImageDto neuroPostcardImageDto, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "max_symbols_input_message") AttributedTextDto attributedTextDto3, @Json(name = "max_symbols_input_metrica_label") String str, @Json(name = "input_max_symbols") Integer num, @Json(name = "prohibited_words") List<NeuroTextInputStopWordsItemDto> list, @Json(name = "placeholder") String str2, @Json(name = "hints") List<NeuroTextInputHintDto> list2, @Json(name = "button_title") AttributedTextDto attributedTextDto4, @Json(name = "button_subtitle") AttributedTextDto attributedTextDto5, @Json(name = "metrica_label") String str3) {
        this.image = neuroPostcardImageDto;
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.maxSymbolsInputMessage = attributedTextDto3;
        this.maxSymbolsInputMetricaLabel = str;
        this.inputMaxSymbols = num;
        this.prohibitedWords = list;
        this.placeholder = str2;
        this.hints = list2;
        this.buttonTitle = attributedTextDto4;
        this.buttonSubtitle = attributedTextDto5;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ NeuroTextInputDto copy$default(NeuroTextInputDto neuroTextInputDto, NeuroPostcardImageDto neuroPostcardImageDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, AttributedTextDto attributedTextDto3, String str, Integer num, List list, String str2, List list2, AttributedTextDto attributedTextDto4, AttributedTextDto attributedTextDto5, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            neuroPostcardImageDto = neuroTextInputDto.image;
        }
        if ((i & 2) != 0) {
            attributedTextDto = neuroTextInputDto.title;
        }
        if ((i & 4) != 0) {
            attributedTextDto2 = neuroTextInputDto.subtitle;
        }
        if ((i & 8) != 0) {
            attributedTextDto3 = neuroTextInputDto.maxSymbolsInputMessage;
        }
        if ((i & 16) != 0) {
            str = neuroTextInputDto.maxSymbolsInputMetricaLabel;
        }
        if ((i & 32) != 0) {
            num = neuroTextInputDto.inputMaxSymbols;
        }
        if ((i & 64) != 0) {
            list = neuroTextInputDto.prohibitedWords;
        }
        if ((i & 128) != 0) {
            str2 = neuroTextInputDto.placeholder;
        }
        if ((i & 256) != 0) {
            list2 = neuroTextInputDto.hints;
        }
        if ((i & 512) != 0) {
            attributedTextDto4 = neuroTextInputDto.buttonTitle;
        }
        if ((i & 1024) != 0) {
            attributedTextDto5 = neuroTextInputDto.buttonSubtitle;
        }
        if ((i & 2048) != 0) {
            str3 = neuroTextInputDto.metricaLabel;
        }
        AttributedTextDto attributedTextDto6 = attributedTextDto5;
        String str4 = str3;
        List list3 = list2;
        AttributedTextDto attributedTextDto7 = attributedTextDto4;
        List list4 = list;
        String str5 = str2;
        String str6 = str;
        Integer num2 = num;
        return neuroTextInputDto.copy(neuroPostcardImageDto, attributedTextDto, attributedTextDto2, attributedTextDto3, str6, num2, list4, str5, list3, attributedTextDto7, attributedTextDto6, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final NeuroPostcardImageDto getImage() {
        return this.image;
    }

    /* renamed from: component10, reason: from getter */
    public final AttributedTextDto getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: component11, reason: from getter */
    public final AttributedTextDto getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getMaxSymbolsInputMessage() {
        return this.maxSymbolsInputMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMaxSymbolsInputMetricaLabel() {
        return this.maxSymbolsInputMetricaLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getInputMaxSymbols() {
        return this.inputMaxSymbols;
    }

    public final List<NeuroTextInputStopWordsItemDto> component7() {
        return this.prohibitedWords;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final List<NeuroTextInputHintDto> component9() {
        return this.hints;
    }

    public final NeuroTextInputDto copy(@Json(name = "image") NeuroPostcardImageDto image, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "max_symbols_input_message") AttributedTextDto maxSymbolsInputMessage, @Json(name = "max_symbols_input_metrica_label") String maxSymbolsInputMetricaLabel, @Json(name = "input_max_symbols") Integer inputMaxSymbols, @Json(name = "prohibited_words") List<NeuroTextInputStopWordsItemDto> prohibitedWords, @Json(name = "placeholder") String placeholder, @Json(name = "hints") List<NeuroTextInputHintDto> hints, @Json(name = "button_title") AttributedTextDto buttonTitle, @Json(name = "button_subtitle") AttributedTextDto buttonSubtitle, @Json(name = "metrica_label") String metricaLabel) {
        return new NeuroTextInputDto(image, title, subtitle, maxSymbolsInputMessage, maxSymbolsInputMetricaLabel, inputMaxSymbols, prohibitedWords, placeholder, hints, buttonTitle, buttonSubtitle, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeuroTextInputDto)) {
            return false;
        }
        NeuroTextInputDto neuroTextInputDto = (NeuroTextInputDto) other;
        return jl40.l(this.image, neuroTextInputDto.image) && jl40.l(this.title, neuroTextInputDto.title) && jl40.l(this.subtitle, neuroTextInputDto.subtitle) && jl40.l(this.maxSymbolsInputMessage, neuroTextInputDto.maxSymbolsInputMessage) && jl40.l(this.maxSymbolsInputMetricaLabel, neuroTextInputDto.maxSymbolsInputMetricaLabel) && jl40.l(this.inputMaxSymbols, neuroTextInputDto.inputMaxSymbols) && jl40.l(this.prohibitedWords, neuroTextInputDto.prohibitedWords) && jl40.l(this.placeholder, neuroTextInputDto.placeholder) && jl40.l(this.hints, neuroTextInputDto.hints) && jl40.l(this.buttonTitle, neuroTextInputDto.buttonTitle) && jl40.l(this.buttonSubtitle, neuroTextInputDto.buttonSubtitle) && jl40.l(this.metricaLabel, neuroTextInputDto.metricaLabel);
    }

    public final AttributedTextDto getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    public final AttributedTextDto getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<NeuroTextInputHintDto> getHints() {
        return this.hints;
    }

    public final NeuroPostcardImageDto getImage() {
        return this.image;
    }

    public final Integer getInputMaxSymbols() {
        return this.inputMaxSymbols;
    }

    public final AttributedTextDto getMaxSymbolsInputMessage() {
        return this.maxSymbolsInputMessage;
    }

    public final String getMaxSymbolsInputMetricaLabel() {
        return this.maxSymbolsInputMetricaLabel;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final List<NeuroTextInputStopWordsItemDto> getProhibitedWords() {
        return this.prohibitedWords;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        NeuroPostcardImageDto neuroPostcardImageDto = this.image;
        int e = ly3.e(this.title, (neuroPostcardImageDto == null ? 0 : neuroPostcardImageDto.hashCode()) * 31, 31);
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode = (e + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        AttributedTextDto attributedTextDto2 = this.maxSymbolsInputMessage;
        int hashCode2 = (hashCode + (attributedTextDto2 == null ? 0 : attributedTextDto2.hashCode())) * 31;
        String str = this.maxSymbolsInputMetricaLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.inputMaxSymbols;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<NeuroTextInputStopWordsItemDto> list = this.prohibitedWords;
        int b = unr0.b((hashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.placeholder);
        List<NeuroTextInputHintDto> list2 = this.hints;
        int e2 = ly3.e(this.buttonTitle, (b + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
        AttributedTextDto attributedTextDto3 = this.buttonSubtitle;
        int hashCode5 = (e2 + (attributedTextDto3 == null ? 0 : attributedTextDto3.hashCode())) * 31;
        String str2 = this.metricaLabel;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        NeuroPostcardImageDto neuroPostcardImageDto = this.image;
        AttributedTextDto attributedTextDto = this.title;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        AttributedTextDto attributedTextDto3 = this.maxSymbolsInputMessage;
        String str = this.maxSymbolsInputMetricaLabel;
        Integer num = this.inputMaxSymbols;
        List<NeuroTextInputStopWordsItemDto> list = this.prohibitedWords;
        String str2 = this.placeholder;
        List<NeuroTextInputHintDto> list2 = this.hints;
        AttributedTextDto attributedTextDto4 = this.buttonTitle;
        AttributedTextDto attributedTextDto5 = this.buttonSubtitle;
        String str3 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("NeuroTextInputDto(image=");
        sb.append(neuroPostcardImageDto);
        sb.append(", title=");
        sb.append(attributedTextDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto2);
        sb.append(", maxSymbolsInputMessage=");
        sb.append(attributedTextDto3);
        sb.append(", maxSymbolsInputMetricaLabel=");
        vfc.w(num, str, ", inputMaxSymbols=", ", prohibitedWords=", sb);
        oyr.D(", placeholder=", str2, ", hints=", sb, list);
        sb.append(list2);
        sb.append(", buttonTitle=");
        sb.append(attributedTextDto4);
        sb.append(", buttonSubtitle=");
        sb.append(attributedTextDto5);
        sb.append(", metricaLabel=");
        sb.append(str3);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
