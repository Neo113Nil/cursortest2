package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.sdk.common.StopWordRule$RuleType;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardLabelsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroTextInputDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroTextInputHintDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroTextInputStopWordRuleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroTextInputStopWordsItemDto;

/* loaded from: classes5.dex */
public final class r360 {
    public final gd3 a;

    public r360(gd3 gd3Var) {
        this.a = gd3Var;
    }

    public static e360 c(NeuroPostcardImageDto neuroPostcardImageDto) {
        gia1 gia1Var;
        NeuroPostcardImageDto.ReferenceDto reference = neuroPostcardImageDto.getReference();
        if (reference instanceof NeuroPostcardImageDto.ReferenceDto.Reference_UrlDto) {
            gia1Var = new dni0(((NeuroPostcardImageDto.ReferenceDto.Reference_UrlDto) reference).b.getUrl());
        } else if (reference instanceof NeuroPostcardImageDto.ReferenceDto.Reference_TagDto) {
            gia1Var = new bni0(((NeuroPostcardImageDto.ReferenceDto.Reference_TagDto) reference).b.getTag());
        } else {
            if (!(reference instanceof NeuroPostcardImageDto.ReferenceDto.Unknown_ReferenceDto)) {
                w511.b();
                return null;
            }
            gia1Var = cni0.a;
        }
        return new e360(gia1Var, neuroPostcardImageDto.getWidth(), neuroPostcardImageDto.getHeight(), Double.valueOf(neuroPostcardImageDto.getDimAmount()), neuroPostcardImageDto.getDimColor());
    }

    public final s260 a(NeuroPostcardActionDto neuroPostcardActionDto) {
        if (neuroPostcardActionDto instanceof NeuroPostcardActionDto.NeuroPostcardAction_OpenPromptDto) {
            return new o260(d(((NeuroPostcardActionDto.NeuroPostcardAction_OpenPromptDto) neuroPostcardActionDto).b.getScreen()));
        }
        if (neuroPostcardActionDto instanceof NeuroPostcardActionDto.NeuroPostcardAction_PickPhotoDto) {
            return p260.a;
        }
        if (neuroPostcardActionDto instanceof NeuroPostcardActionDto.NeuroPostcardAction_ConfirmImageDto) {
            return n260.a;
        }
        if (neuroPostcardActionDto instanceof NeuroPostcardActionDto.NeuroPostcardAction_AddSignatureDto) {
            return new m260(d(((NeuroPostcardActionDto.NeuroPostcardAction_AddSignatureDto) neuroPostcardActionDto).b.getScreen()));
        }
        if (neuroPostcardActionDto instanceof NeuroPostcardActionDto.NeuroPostcardAction_SendPostcardDto) {
            return q260.a;
        }
        if (neuroPostcardActionDto instanceof NeuroPostcardActionDto.Unknown_NeuroPostcardActionDto) {
            return r260.a;
        }
        w511.b();
        return null;
    }

    public final h360 b(NeuroPostcardLabelsDto neuroPostcardLabelsDto) {
        NeuroPostcardImageDto watermark = neuroPostcardLabelsDto.getWatermark();
        FormattedText formattedText = null;
        e360 c = watermark != null ? c(watermark) : null;
        AttributedTextDto sign = neuroPostcardLabelsDto.getSign();
        if (sign != null) {
            this.a.getClass();
            formattedText = gd3.b(sign);
        }
        return new h360(c, formattedText);
    }

    public final r460 d(NeuroTextInputDto neuroTextInputDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        StopWordRule$RuleType stopWordRule$RuleType;
        NeuroPostcardImageDto image = neuroTextInputDto.getImage();
        e360 c = image != null ? c(image) : null;
        AttributedTextDto title = neuroTextInputDto.getTitle();
        this.a.getClass();
        FormattedText b = gd3.b(title);
        AttributedTextDto subtitle = neuroTextInputDto.getSubtitle();
        FormattedText b2 = subtitle != null ? gd3.b(subtitle) : null;
        AttributedTextDto maxSymbolsInputMessage = neuroTextInputDto.getMaxSymbolsInputMessage();
        FormattedText b3 = maxSymbolsInputMessage != null ? gd3.b(maxSymbolsInputMessage) : null;
        Integer inputMaxSymbols = neuroTextInputDto.getInputMaxSymbols();
        List<NeuroTextInputStopWordsItemDto> prohibitedWords = neuroTextInputDto.getProhibitedWords();
        if (prohibitedWords != null) {
            List<NeuroTextInputStopWordsItemDto> list = prohibitedWords;
            arrayList = new ArrayList(tcc.n(list, 10));
            for (NeuroTextInputStopWordsItemDto neuroTextInputStopWordsItemDto : list) {
                List<NeuroTextInputStopWordRuleDto> stopWords = neuroTextInputStopWordsItemDto.getStopWords();
                ArrayList arrayList3 = new ArrayList(tcc.n(stopWords, 10));
                for (NeuroTextInputStopWordRuleDto neuroTextInputStopWordRuleDto : stopWords) {
                    int i = q360.c[neuroTextInputStopWordRuleDto.getRuleType().ordinal()];
                    if (i == 1) {
                        stopWordRule$RuleType = StopWordRule$RuleType.PREFIX;
                    } else if (i == 2) {
                        stopWordRule$RuleType = StopWordRule$RuleType.SUBSTRING;
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        stopWordRule$RuleType = StopWordRule$RuleType.WORD;
                    }
                    arrayList3.add(new xhu0(stopWordRule$RuleType, neuroTextInputStopWordRuleDto.getValue()));
                }
                AttributedTextDto errorText = neuroTextInputStopWordsItemDto.getErrorText();
                arrayList.add(new v460(arrayList3, errorText != null ? gd3.b(errorText) : null, neuroTextInputStopWordsItemDto.getMetricaLabel()));
            }
        } else {
            arrayList = null;
        }
        String placeholder = neuroTextInputDto.getPlaceholder();
        List<NeuroTextInputHintDto> hints = neuroTextInputDto.getHints();
        if (hints != null) {
            List<NeuroTextInputHintDto> list2 = hints;
            arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (NeuroTextInputHintDto neuroTextInputHintDto : list2) {
                arrayList2.add(new s460(neuroTextInputHintDto.getTitle(), neuroTextInputHintDto.getTextToPaste()));
            }
        } else {
            arrayList2 = null;
        }
        FormattedText b4 = gd3.b(neuroTextInputDto.getButtonTitle());
        AttributedTextDto buttonSubtitle = neuroTextInputDto.getButtonSubtitle();
        return new r460(c, b, b2, b3, inputMaxSymbols, arrayList, placeholder, arrayList2, b4, buttonSubtitle != null ? gd3.b(buttonSubtitle) : null, neuroTextInputDto.getMaxSymbolsInputMetricaLabel(), neuroTextInputDto.getMetricaLabel());
    }
}
